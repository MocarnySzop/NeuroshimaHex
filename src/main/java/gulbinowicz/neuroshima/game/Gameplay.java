package gulbinowicz.neuroshima.game;



import java.awt.*;

import static gulbinowicz.neuroshima.core.Display.*;

public class Gameplay {
    int x = 250;
    public void tick() {

    }

    public void render(Graphics g) {


        g.drawRect(getWidth(0.09),getHeight(0.09), getWidth(0.83), getHeight(0.67));
        g.drawRect(getWidth(0.09),getHeight(0.80), getWidth(0.83), getHeight(0.167));
        g.drawRect(getWidth(0.1), getHeight(0.1), getWidth(0.09), getHeight(0.09));
        g.drawRect(getWidth(0.1), getHeight(0.66), getWidth(0.09), getHeight(0.09));

//g.drawLine( 1, 1, 600, 600);
//        g.drawLine(1, 600, 600, 1);
//        g.fillRect(250,250,100, 100);
//        g.setColor(Color.MAGENTA);
//        g.fillOval(x++, 250, 100, 100);
//        int[] tablicax = new int[]{250, 300, 350};
//        int[] tablicay = new int[]{250, 200, 250};
//        g.setColor(Color.CYAN);
//        g.fillPolygon(tablicax, tablicay, 3);
    }
}