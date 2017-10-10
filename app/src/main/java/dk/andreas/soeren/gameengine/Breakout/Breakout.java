package dk.andreas.soeren.gameengine.Breakout;

import dk.andreas.soeren.gameengine.GameEngine;
import dk.andreas.soeren.gameengine.Screen;
import dk.andreas.soeren.gameengine.TestScreen;

/**
 * Created by Søren on 03-10-2017.
 */

public class Breakout extends GameEngine
{
    @Override
    public Screen createStartScreen()
    {
        return new MainMenuScreen(this);
    }
}
