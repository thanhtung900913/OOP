package lab5.ex1_7;

public class TestMain {
    public static void main(String[] args) {
        // Create a player
        Player player = new Player(10, 5.0f, 3.0f);

        // Move the player
        player.move(2.0f, 1.0f);

        // Make the player jump
        player.jump(3.0f);

        // Create a ball
        Ball ball = new Ball();
        ball.setXYX(2.0f, 4.0f, 1.0f);
        System.out.println("Ball position: " + ball.toString());

        // Check if the player is near the ball
        if (player.near()) {
            System.out.println("The player is near the ball.");
        } else {
            System.out.println("The player is not near the ball.");
        }
    }
}
