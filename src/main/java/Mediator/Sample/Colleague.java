package Mediator.Sample;

/**
 * @author vert on 2021/4/22
 */
public interface Colleague {
    public abstract void setMediator(Mediator mediator);
    public abstract void setColleagueEnabled(boolean enabled);
}
