import greenfoot.*;


public class MenuScreen extends World
{
    
    public MenuScreen()
    {
         super(600, 400, 1);
         addObject(new Button(() -> Greenfoot.setWorld(new InstructionScreen())), 300, 340); 
    }

}