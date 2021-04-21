package Decorator.A2;

import java.util.ArrayList;

/**
 * @author vert on 2021/4/21
 */
public class MultiStringDisplay extends Display{
    private ArrayList body = new ArrayList<>();
    private int columns = 0;

    @Override
    public int getColumns() {
        return columns;
    }

    @Override
    public int getRows() {
        return body.size();
    }

    public void add(String string){
        body.add(string);
        updateColumn(string);
    }

    @Override
    public String getRowText(int row) {
        return (String)body.get(row);
    }

    private void updateColumn(String msg){
        if (msg.getBytes().length > columns){
            columns = msg.getBytes().length;
        }
        for (int row = 0; row < body.size();row++){
            int fills = columns - ((String)body.get(row)).getBytes().length;
            if (fills > 0){
                body.set(row, body.get(row) + spaces(fills));
            }
        }
    }

    private String spaces(int count){
        StringBuffer buf = new StringBuffer();
        for (int i = 0; i < count; i++) {
            buf.append(' ');
        }
        return buf.toString();
    }
}
