import greenfoot.*;


public class MenuScreen extends World
{
    private Queues avatarQueue;
    private String[] avatars = {"images/face_a.png", "images/face_b.png", "images/face_b.png"};
    private int currentAvatarIndex = 0;

    public MenuScreen()
    {
        super(600, 400, 1);

        avatarQueue = new Queues();
        for (String avatar : avatars) {
            avatarQueue.enqueue(avatar);
        }

        addObject(new Button(this::startInstructions), 300, 340); 
        addObject(new Button(this::nextAvatar), 400, 350); // Next Avatar Button
        showAvatar();
    }

    private void startInstructions() {
        Greenfoot.setWorld(new InstructionScreen());
    }

    private void nextAvatar() {
        currentAvatarIndex = (currentAvatarIndex + 1) % avatars.length;
        showAvatar();
    }

    private void showAvatar() {
        removeObjects(getObjects(Avatar.class));
        addObject(new Avatar(avatars[currentAvatarIndex]), 400, 200);
    }
}