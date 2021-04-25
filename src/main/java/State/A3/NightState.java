package State.A3;

/**
 * @author vert on 2021/4/25
 */
public class NightState implements State{
    private static NightState singleton = new NightState();
    private NightState (){}
    public static State getInstance(){
        return singleton;
    }
    @Override
    public void doClock(Context context, int hour) {
        if ((9 <= hour && hour < 12) || (13 <= hour && hour < 17)){
            context.changeState(DayState.getInstance());
        }else if (12 <= hour && hour < 13){
            context.changeState(NoonState.getInstance());
        }
    }

    @Override
    public void doUse(Context context) {
        context.callSecurityCenter("紧急：晚上使用金库！");
    }

    @Override
    public void doAlarm(Context context) {
        context.callSecurityCenter("按下警铃(晚上)");
    }

    @Override
    public void doPhone(Context context) {
        context.recordLog("晚上的通话录音");
    }
    public String toString(){
        return "[晚上]";
    }
}
