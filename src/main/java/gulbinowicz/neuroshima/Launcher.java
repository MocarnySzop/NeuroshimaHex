package gulbinowicz.neuroshima;

import gulbinowicz.neuroshima.core.Display;
import gulbinowicz.neuroshima.core.GameEngine;
import gulbinowicz.neuroshima.game.Gameplay;

public class Launcher {
    public static void main(String[] args) {
        System.out.println("hello world");
        Display display = new Display("NeuroshimaHex");
        Gameplay gameplay = new Gameplay();
        GameEngine gameEngine = new GameEngine(display, gameplay);
        gameEngine.start();
        display.addListener(gameplay);

    }

}
