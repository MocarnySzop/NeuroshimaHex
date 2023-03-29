package gulbinowicz.neuroshima.game;

import javax.imageio.ImageIO;
import java.awt.*;
import java.io.IOException;

import static gulbinowicz.neuroshima.core.Display.getHeight;
import static gulbinowicz.neuroshima.core.Display.getWidth;

public class Board {
    final static int HEX_WIDTH = 125;
    final static int HEX_HEIGHT = 107;


    private Base base;

    public void render(Graphics2D g) {

        try {
            g.drawImage(ImageIO.read(Gameplay.class.getResource("/newboard.jpg")), 0, 0, getWidth(0.83), getHeight(0.67), null);

        } catch (IOException e) {
            e.printStackTrace();
        }
//zapisujemy ile wynopsi aktuany translate
        int beforeTranslateX = (int) g.getTransform().getTranslateX();
        int beforeTranslateY = (int) g.getTransform().getTranslateY();

        g.translate(20, 0);
        for (int y = 0; y < 5; y++) {
            for (int x = 0; x < 5; x++) {
                g.setColor(Color.MAGENTA);
                double hightmodifier = -0.5;
                if (x % 2 == 0) {
                    hightmodifier = 0.5;
                }
//                g.drawRect(+x * HEX_WIDTH, y * HEX_HEIGHT + (int) (HEX_HEIGHT * hightmodifier), HEX_WIDTH, HEX_HEIGHT);
                g.drawRect(0, 0, HEX_WIDTH, HEX_HEIGHT);
                if(base != null && base.getX() == x && base.getY() == y){
                    base.render(g);
                }
                g.translate(HEX_WIDTH, (int) (HEX_HEIGHT * hightmodifier));
            }
            g.translate(HEX_WIDTH * -5, (int) (0.5*HEX_HEIGHT));
        }


        // wyliczamy ile wynosi translate po modyfikacjach
        int actualTranslateX = (int) g.getTransform().getTranslateX();
        int actualTranslateY = (int) g.getTransform().getTranslateY();
        // przywracaymy do starego translatea
        g.translate(beforeTranslateX - actualTranslateX, beforeTranslateY- actualTranslateY);

        g.setColor(Color.MAGENTA);
        g.drawString("Enemy = 10", getWidth(0.1), getHeight(0.15));
//        g.drawRect(getWidth(0.1), getHeight(0.1), getWidth(0.09), getHeight(0.09));
//        g.drawRect(getWidth(0.1), getHeight(0.66), getWidth(0.09), getHeight(0.09));
        g.drawString("Player = 10", getWidth(0.1), getHeight(0.70));
    }

    public void setBase(Base base) {
        this.base = base;
    }
}
