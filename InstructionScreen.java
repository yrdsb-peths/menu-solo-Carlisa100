import greenfoot.*;

public class InstructionScreen extends World {
    private String[] instructions = {
        "Instruction 1",
        "Instruction 2",
        "Instruction 3"
    };
    private int currentIndex = 0;

    public InstructionScreen() {
        super(600, 400, 1);
        showInstruction();
        addObject(new Button(this::nextInstruction), 300, 200);
    }

    private void showInstruction() {
        removeObjects(getObjects(Label.class));
        addObject(new Label(instructions[currentIndex]), 400, 300);
    }

    private void nextInstruction() {
        currentIndex = (currentIndex + 1) % instructions.length;
        showInstruction();
    }
}
