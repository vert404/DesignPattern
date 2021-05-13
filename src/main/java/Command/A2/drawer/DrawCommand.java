package Command.A2.drawer;

import Command.A2.command.Command;

import java.awt.*;

/**
 * @author vert on 2021/5/13
 */
public class DrawCommand implements Command {
    protected Drawable drawable;
    private Point position;
    public DrawCommand (Drawable drawable,Point position){
        this.drawable = drawable;
        this.position = position;
    }
    @Override
    public void execute() {
        drawable.draw(position.x, position.y);
    }
}
