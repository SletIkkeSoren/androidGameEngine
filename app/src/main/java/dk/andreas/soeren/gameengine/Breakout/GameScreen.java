package dk.andreas.soeren.gameengine.Breakout;

import android.graphics.Bitmap;

import dk.andreas.soeren.gameengine.GameEngine;
import dk.andreas.soeren.gameengine.Screen;

/**
 * Created by Søren on 03-10-2017.
 */

public class GameScreen extends Screen
{

    State state = State.Running;
    Bitmap background = null;
    Bitmap resume = null;
    Bitmap gameOver = null;

    public GameScreen(GameEngine gameEngine)
    {
        super(gameEngine);
        background = gameEngine.loadBitMap("breakoutassets/background.png");
    }

    enum State
    {
        Running,
        Paused,
        GameOver,

    }

    @Override
    public void update(float deltaTime)
    {
        if(state == State.GameOver && gameEngine.getTouchEvents().size() > 0)
        {
            gameEngine.setScreen(new MainMenuScreen(gameEngine));
        }
        if(state == State.Running && gameEngine.getTouchY(0) < 38 && gameEngine.getTouchX(0) > 282)
        {
            state = State.Paused;
            return;
        }
        if(state == State.Paused)
        {
            gameEngine.drawBitmap(resume, 160 - resume.getWidth()/2, 240 - resume.getHeight()/2);
        }
        if(state == State.GameOver)
        {
            gameEngine.drawBitmap(gameOver, 160 - gameOver.getWidth()/2,
                    240 - gameOver.getHeight()/2);
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
