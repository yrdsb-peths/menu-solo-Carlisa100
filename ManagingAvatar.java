import greenfoot.*;

public class ManagingAvatar extends Actor {
    private Queues avatarQueue;
    private String[] avatars = {"images/face_a.png", "images/face_b.png", "images/face_c.png"};
    private int currentAvatarIndex = 0;

    public ManagingAvatar() {
        
        avatarQueue = new Queues();
        for (String avatar : avatars) {
            avatarQueue.enqueue(avatar);
        }
        showAvatar();
    }

    public void act() {
        if (Greenfoot.mouseClicked(this)) {
            nextAvatar();
        }
    }

    private void nextAvatar() {
        currentAvatarIndex = (currentAvatarIndex + 1) % avatars.length;
        showAvatar();
    }

    private void showAvatar() {
        setImage(avatars[currentAvatarIndex]);
    }
}
