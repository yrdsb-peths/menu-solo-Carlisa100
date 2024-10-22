import greenfoot.*;

public class MenuScreen extends World {
    public MenuScreen() {
        super(600, 400, 1);
        addObject(new Button(this::startInstructions), 300, 300); 
        
        addObject(new ManagingAvatar(), 300, 200);
         
    }

    private void startInstructions() {
        Greenfoot.setWorld(new InstructionScreen());
    }
}