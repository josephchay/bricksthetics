package breakout.entities.enemies.bricks.collectibles.rectangle;

import breakout.entities.enemies.bricks.collectibles.LifeBrick;
import breakout.entities.enemies.bricks.collectibles.CollectibleBrickFactory;
import breakout.entities.enemies.bricks.collectibles.LargePaddleBrick;
import breakout.entities.enemies.bricks.collectibles.MultiorbBrick;

public class RectangleCollectibleBrickFactory implements CollectibleBrickFactory {
    @Override
    public LargePaddleBrick createLargePaddle(int x, int y) {
        return new LargePaddleRectangleBrick(x, y);
    }

    @Override
    public LifeBrick createLife(int x, int y) {
        return new LifeRectangleBrick(x, y);
    }

    @Override
    public MultiorbBrick createMultiorb(int x, int y) {
        return new MultiorbRectangleBrick(x, y);
    }
}