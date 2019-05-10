package game.gameObjects;

public class Player {
    private double x;
    private double y;
    private double minX = 0;
    private double minY = 810;

    private double speedX;
    private double minSpeedX = -0.5;
    private double minSpeedY = 2;
    private double speedY;
    private double gravity = 2.6;
    private int charge = 0;

    public Player(double x, double y, double speedX, double speedY) {
        this.x = x;
        this.y = y;
        this.speedX = speedX;
        this.speedY = speedY;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getSpeedX() {
        return speedX;
    }

    public void setSpeedX(double speedX) {
        this.speedX = speedX;
    }

    public double getSpeedY() {
        return speedY;
    }

    public void setSpeedY(double speedY) {
        this.speedY = speedY;
    }

    public void updateCoordinats() {

        this.x += this.speedX;
        if (speedX > minSpeedX) {
            speedX += -gravity / 500;
        }
        if (x < minX) {
            speedX = 0;
        }


        this.y += speedY;
        if (speedY < minSpeedY) {
            speedY += gravity / 500;
        }

        if (y > minY) {
            speedY = 0;
        }


        if (charge > 0) {
            charge--;
            this.x += 2;
        }
    }

    public void jumpRight() {
        setSpeedX(1.5);
    }

    public void jumpUp() {
        setSpeedY(-1.4);
    }
}