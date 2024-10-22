import greenfoot.*; 

public class Label extends Actor {
    private GreenfootImage image;

    public Label(String text) {
        setImage(createImage(text));
    }

    private GreenfootImage createImage(String text) {
        GreenfootImage img = new GreenfootImage(text, 24, Color.WHITE, new Color(0, 0, 0, 0));
        return img;
    }

    public void setText(String text) {
        setImage(createImage(text));
    }
}
