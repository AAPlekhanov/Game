package com.plekhanov.game;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class ImageLoader {

    private static BufferedImage fireBallImage;
    private static BufferedImage backgroundImage1;
    private static BufferedImage backgroundImage2;
    private static BufferedImage backgroundImage3;
    private static BufferedImage backgroundImage4;
    private static BufferedImage backgroundImage5;
    private static BufferedImage backgroundImage6;
    private static BufferedImage backgroundImage7;
    private static BufferedImage backgroundImage8;
    private static BufferedImage backgroundImage9;
    private static BufferedImage enemyCarrionImage;
    private static BufferedImage hungryCarrion;
    private static BufferedImage enemyHuskImage;
    private static BufferedImage enemyPestilenceImage;
    private static BufferedImage playerImage;
    private static BufferedImage playerWoundedImage;
    private static BufferedImage heartImage;

    private static final String FS = File.separator;
    private static String PATH_TO_RESOURCE = "Game" + FS + "src" + FS + "main" + FS + "resources" + FS + "images" + FS;


    static {
        try {
            // Статический фон
            File backgroundImageFile1 = new File(PATH_TO_RESOURCE + "background" + FS + "level_1"  + FS +  "Layer_0010_1.png");
            backgroundImage1 = ImageIO.read(backgroundImageFile1);
            File backgroundImageFile2 = new File(PATH_TO_RESOURCE + "background" + FS + "level_1"  + FS +  "Layer_0009_2.png");
            backgroundImage2 = ImageIO.read(backgroundImageFile2);
            File backgroundImageFile3 = new File(PATH_TO_RESOURCE + "background" + FS + "level_1"  + FS +  "Layer_0008_3.png");
            backgroundImage3 = ImageIO.read(backgroundImageFile3);
            File backgroundImageFile4 = new File(PATH_TO_RESOURCE + "background" + FS + "level_1"  + FS +  "Layer_0006_4.png");
            backgroundImage4 = ImageIO.read(backgroundImageFile4);

            // Динамический фон
            File backgroundImageFile5 = new File(PATH_TO_RESOURCE + "background" + FS + "level_1"  + FS +  "Layer_0005_5.png");
            backgroundImage5 = ImageIO.read(backgroundImageFile5);
            File backgroundImageFile6 = new File(PATH_TO_RESOURCE + "background" + FS + "level_1"  + FS +  "Layer_0003_6.png");
            backgroundImage6 = ImageIO.read(backgroundImageFile6);
            File backgroundImageFile7 = new File(PATH_TO_RESOURCE + "background" + FS + "level_1"  + FS +  "Layer_0002_7.png");
            backgroundImage7 = ImageIO.read(backgroundImageFile7);
            File backgroundImageFile8 = new File(PATH_TO_RESOURCE + "background" + FS + "level_1"  + FS +  "Layer_0001_8.png");
            backgroundImage8 = ImageIO.read(backgroundImageFile8);
            File backgroundImageFile9 = new File(PATH_TO_RESOURCE + "background" + FS + "level_1"  + FS +  "Layer_0000_9.png");
            backgroundImage9 = ImageIO.read(backgroundImageFile9);

            // Враги
            File fireBallImageFile = new File(PATH_TO_RESOURCE + "enemies" + FS + "fireBall.png");
            fireBallImage = ImageIO.read(fireBallImageFile);
            File enemyCarrionImageFile = new File(PATH_TO_RESOURCE + "enemies" + FS + "EnemyCarrion.png");
            enemyCarrionImage = ImageIO.read(enemyCarrionImageFile);
            File enemyHuskImageFile = new File(PATH_TO_RESOURCE + "enemies" + FS + "EnemyHusk.png");
            enemyHuskImage = ImageIO.read(enemyHuskImageFile);
            File carrion2ImageFile = new File(PATH_TO_RESOURCE + "enemies"+ FS + "carrion2.png");
            hungryCarrion = ImageIO.read(carrion2ImageFile);
            File enemyPestilenceImageFile = new File(PATH_TO_RESOURCE + "enemies" + FS + "EnemyPestilence.png");
            enemyPestilenceImage = ImageIO.read(enemyPestilenceImageFile);

            // Игрок
            File playerImageFile = new File(PATH_TO_RESOURCE + "Player2.png");
            playerImage = ImageIO.read(playerImageFile);
            File playerWounded = new File(PATH_TO_RESOURCE + "PlayerWounded.png");
            playerWoundedImage = ImageIO.read(playerWounded);

            // Предметы
            File heartImageFile = new File(PATH_TO_RESOURCE + "heart.png");
            heartImage = ImageIO.read(heartImageFile);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public static BufferedImage getEnemyCarrionImage() {
        return enemyCarrionImage;
    }

    public static BufferedImage getEnemyHuskImage() {
        return enemyHuskImage;
    }

    public static BufferedImage getEnemyPestilenceImage() {
        return enemyPestilenceImage;
    }

    public static BufferedImage getPlayerImage() {
        return playerImage;
    }

    public static BufferedImage getFireBallImage() {
        return fireBallImage;
    }

    public static BufferedImage getBackgroundImage1() {
        return backgroundImage1;
    }

    public static BufferedImage getBackgroundImage2() {
        return backgroundImage2;
    }

    public static BufferedImage getBackgroundImage3() {
        return backgroundImage3;
    }

    public static BufferedImage getBackgroundImage4() {
        return backgroundImage4;
    }

    public static BufferedImage getBackgroundImage5() {
        return backgroundImage5;
    }

    public static BufferedImage getBackgroundImage6() {
        return backgroundImage6;
    }

    public static BufferedImage getBackgroundImage7() {
        return backgroundImage7;
    }

    public static BufferedImage getBackgroundImage8() {
        return backgroundImage8;
    }

    public static BufferedImage getBackgroundImage9() {
        return backgroundImage9;
    }

    public static BufferedImage getHeartImage() {
        return heartImage;
    }

    public static BufferedImage getPlayerWoundedImage() {
        return playerWoundedImage;
    }

    public static BufferedImage getHungryCarrion() {
        return hungryCarrion;
    }
}
