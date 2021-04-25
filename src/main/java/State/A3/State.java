package State.A3;

/**
 * @author vert on 2021/4/25
 */
public interface State {
    public abstract void doClock(Context context,int hour);
    public abstract void doUse(Context context);
    public abstract void doAlarm(Context context);
    public abstract void doPhone(Context context);
}
