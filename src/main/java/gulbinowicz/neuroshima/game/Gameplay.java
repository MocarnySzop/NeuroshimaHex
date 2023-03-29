package gulbinowicz.neuroshima.game;


import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.IOException;

import static gulbinowicz.neuroshima.core.Display.*;

public class Gameplay implements MouseListener {
    private Board board = new Board();

    private Player player;

    public void putBase(int x, int y){
        Base base = new Base(x,y);
        player = new Player(base);
        board.setBase(base);



    }


    public void tick() {

    }

    public void render(Graphics2D g) {
        g.translate(getWidth(0.09), getHeight(0.09));
        board.render(g);

        g.translate(-getWidth(0.09), -getHeight(0.09));
        try {
            g.drawImage(ImageIO.read(Gameplay.class.getResource("/hex.jpg")), getWidth(0.09), getHeight(0.80), getWidth(0.83), getHeight(0.167), null);
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {
        System.out.println("click");

        int x = e.getX() - getWidth(0.09) - 20;
        int y = e.getY() - getHeight(0.09);

        x/= Board.HEX_WIDTH;
        y/= Board.HEX_HEIGHT;

        putBase(x,y);


    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }


//        g.drawRect(getWidth(0.09),getHeight(0.80), getWidth(0.83), getHeight(0.167));


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
