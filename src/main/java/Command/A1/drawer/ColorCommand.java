package Command.A1.drawer;

import Command.A1.command.Command;

import java.awt.*;

/**
 * @author vert on 2021/5/13
 */
public class ColorCommand implements Command{
    protected Drawable drawable;
    private Color color;
    public ColorCommand(Drawable drawable, Color color) {
        this.drawable = drawable;
        this.color = color;
    }
    @Override
    public void execute() {
        drawable.setColor(color);
    }
}
