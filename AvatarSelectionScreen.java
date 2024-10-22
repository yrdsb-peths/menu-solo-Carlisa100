import greenfoot.*;

import greenfoot.*;

public class AvatarSelectionScreen extends World {
    private String[] avatars = {"images/face_a.png", "images/face_b.png", "images/face_c.png"};
    private int currentAvatarIndex = 0;
    private Avatar currentAvatar;
    private Button scoreboardButton;

    public AvatarSelectionScreen() {
        super(600, 400, 1);
        showAvatar();
        
        addObject(new Button(this::nextAvatar), 100, 300); 
        addObject(new Button(this::previousAvatar), 500, 300); 
        
        scoreboardButton = new Button(this::goToScoreboard);
        addObject(scoreboardButton, 300, 300); 
        scoreboardButton.setImage(new GreenfootImage(1, 1));
    }

    private void nextAvatar() {
        currentAvatarIndex = (currentAvatarIndex + 1) % avatars.length;
        showAvatar();
    }

    private void previousAvatar() {
        currentAvatarIndex = (currentAvatarIndex - 1 + avatars.length) % avatars.length;
        showAvatar();
    }

    private void showAvatar() {
        if (currentAvatar != null) {
            removeObject(currentAvatar);
        }
        currentAvatar = new Avatar(avatars[currentAvatarIndex]);
        addObject(currentAvatar, 300, 200); 
    }
    
    private void checkShowScoreboardButton() {
        if (currentAvatarIndex == avatars.length - 1) {
            goToScoreboard();
        } else {
            scoreboardButton.setImage(new GreenfootImage(1, 1)); 
        }
    }

    private void goToScoreboard() {
        Greenfoot.setWorld(new HighScoreScreen()); 
    }
}

