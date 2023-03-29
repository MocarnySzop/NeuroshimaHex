package gulbinowicz.neuroshima.game;

import java.awt.*;

public class Base {
    private int x;
    private int y;
    private int hp = 20;

    public Base(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public void render(Graphics g){

        g.fillRect(0,0,Board.HEX_WIDTH, Board.HEX_HEIGHT);

    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
