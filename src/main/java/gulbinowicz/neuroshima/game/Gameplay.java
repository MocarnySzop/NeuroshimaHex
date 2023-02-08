package gulbinowicz.neuroshima.game;



import javax.imageio.ImageIO;
import java.awt.*;
import java.io.IOException;

import static gulbinowicz.neuroshima.core.Display.*;

public class Gameplay {
    int x = 250;
    public void tick() {

    }

    public void render(Graphics g) {

        try {
            g.drawImage(ImageIO.read(Gameplay.class.getResource("/board.jpg")),getWidth(0.09),getHeight(0.09), getWidth(0.83), getHeight(0.67),null);
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            g.drawImage(ImageIO.read(Gameplay.class.getResource("/hex.jpg")),getWidth(0.09),getHeight(0.80), getWidth(0.83), getHeight(0.167),null);
        } catch (IOException e) {
            e.printStackTrace();
        }
//        g.drawRect(getWidth(0.09),getHeight(0.80), getWidth(0.83), getHeight(0.167));
        g.setColor(Color.MAGENTA);
        g.drawString("Enemy = 10",getWidth(0.1), getHeight(0.15));
//        g.drawRect(getWidth(0.1), getHeight(0.1), getWidth(0.09), getHeight(0.09));
//        g.drawRect(getWidth(0.1), getHeight(0.66), getWidth(0.09), getHeight(0.09));
        g.drawString("Player = 10",getWidth(0.1), getHeight(0.70));

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