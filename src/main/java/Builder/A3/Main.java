package Builder.A3;

import javax.swing.*;

/**
 * @author vert on 2021/3/26
 */
public class Main {
    public static void main(String[] args) {
        FrameBuilder frameBuilder = new FrameBuilder();
        Director director = new Director(frameBuilder);
        director.construct();
        JFrame frame = frameBuilder.getResult();
        frame.setVisible(true);
    }
}
