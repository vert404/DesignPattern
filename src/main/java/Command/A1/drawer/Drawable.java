package Command.A1.drawer;

import java.awt.*;

/**
 * @author vert on 2021/5/13
 */
public interface Drawable {
    public abstract void init();
    public abstract void draw(int x,int y);
    public abstract void setColor(Color color);
}
