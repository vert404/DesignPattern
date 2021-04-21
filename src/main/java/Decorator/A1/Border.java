package Decorator.A1;

/**
 * @author vert on 2021/4/21
 */
public abstract class Border extends Display {
    protected Display display;
    protected Border (Display display){
        this.display = display;
    }
}
