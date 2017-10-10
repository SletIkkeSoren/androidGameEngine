package dk.andreas.soeren.gameengine.Breakout;

import android.graphics.Bitmap;

import dk.andreas.soeren.gameengine.GameEngine;
import dk.andreas.soeren.gameengine.Screen;

/**
 * Created by Søren on 03-10-2017.
 */

public class MainMenuScreen extends Screen
{

    Bitmap mainMenu = null;
    Bitmap insertCoin = null;
    float passedTime = 0;
    long startTime = System.nanoTime();

    public MainMenuScreen(GameEngine gameEngine)
    {
        super(gameEngine);
        mainMenu = gameEngine.loadBitMap("breakoutassets/mainmenu.png");
        insertCoin = gameEngine.loadBitMap("breakoutassets/insertcoin.png");
    }

    @Override
    public void update(float deltaTime)
    {
        if(gameEngine.isTouchDown(0))
        {
            gameEngine.setScreen(new GameScreen(gameEngine));
            return;
        }
        gameEngine.drawBitmap(mainMenu, 0, 0);
        passedTime = passedTime + deltaTime;
        if(passedTime -  (int)passedTime > 0.5f)
        {
            gameEngine.drawBitmap(insertCoin, 160 - (insertCoin.getWidth()/2),
                    450 - (insertCoin.getWidth()/2));
        }
    }

    @Override
    public void pause()
    {

    }

    @Override
    public void resume()
    {

    }

    @Override
    public void dispose()
    {

    }
}
