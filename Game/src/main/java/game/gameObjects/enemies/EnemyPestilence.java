package game.gameObjects.enemies;

import game.Model;
import game.gameObjects.enemies.Enemy;

import java.awt.image.BufferedImage;

public class EnemyPestilence extends Enemy {

    public EnemyPestilence(double x, double y, double speedX, double speedY, BufferedImage bufferedImage, int imageWidth, int imageHeight, int renderOrder, Model model) {
        super(x, y, speedX, speedY, bufferedImage, imageWidth, imageHeight, renderOrder, model);
    }

    @Override
    public void updateCoordinats() {
        super.updateCoordinats();
        if (x <= -300) {
            x = ((int) (Math.random() * 500 + 2000));
            y = ((int) (Math.random() * 700 + 90));
        }
        //проверка столкновения
        if (Math.abs(model.getPlayer().getX() - getX()) < 80 && Math.abs(model.getPlayer().getY() - getY()) < 80 ) {
            model.setClash(true);
        }
    }
}
