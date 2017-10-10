package dk.andreas.soeren.gameengine.Breakout;

import android.graphics.Bitmap;

import dk.andreas.soeren.gameengine.GameEngine;

/**
 * Created by Søren on 10-10-2017.
 */

public class WorldRenderer
{
    GameEngine gameEngine;
    World world;
    Bitmap ballImage;

    public WorldRenderer(GameEngine gameEngine, World world)
    {
        this.gameEngine = gameEngine;
        this.world = world;
        ballImage = gameEngine.loadBitMap("breakoutassets/ball.png");

    }
    public void render()
    {
        gameEngine.drawBitmap(ballImage, world.ball.x, world.ball.y);
    }
}
