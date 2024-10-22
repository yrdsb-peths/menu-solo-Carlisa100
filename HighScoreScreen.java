import java.util.HashMap;
import greenfoot.*;

public class HighScoreScreen extends World {
    public HighScoreScreen() {
        super(800, 600, 1);
        HashMap<String, Integer> highScores = new HashMap<>();
        highScores.put("Player1", 150);
        highScores.put("Player2", 200);
        highScores.put("Player3", 250);
        
        displayHighScores(highScores);
        addObject(new Button(this::backToMenu), 400, 550); // Button to go back to Menu
    }

    private void displayHighScores(HashMap<String, Integer> scores) {
        int y = 100;
        for (String player : scores.keySet()) {
            String scoreText = player + ": " + scores.get(player);
            addObject(new Label(scoreText), 400, y);
            y += 30;
        }
    }

    private void backToMenu() {
        Greenfoot.setWorld(new MenuScreen());
    }
}
