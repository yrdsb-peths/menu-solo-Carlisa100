import greenfoot.*;

public class ManagingAvatar extends Actor {
    private String[] avatars = {"images/face_a.png", "images/face_b.png", "images/face_c.png"};
    private int currentAvatarIndex = 0;
    private Avatar presentAvatar;

    public ManagingAvatar() {

    }

    public void act() {
        if (Greenfoot.mouseClicked(this)) 
        {
            nextAvatar();
        }
        
        if (getWorld() != null) {
            showAvatar();
        }
    }

    private void nextAvatar() {
        currentAvatarIndex = (currentAvatarIndex + 1) % avatars.length;
        showAvatar();
    }

    private void showAvatar() 
    {
         if (presentAvatar != null) {
            getWorld().removeObject(presentAvatar); 
        }
        
        Avatar avatar = new Avatar(avatars[currentAvatarIndex]);
        getWorld().addObject(avatar, 300, 200);
    }
}
