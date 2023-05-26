package computer;

public class Computer implements ComputerComponent {

    private String name;
    private int memory;

    public Computer(String name, int memory) {
        this.name = name;
        this.memory = memory;
    }

    @Override
    public String toString() {
        return name;
    }

    public int getMemory() {
        return memory;
    }

    public void accept(ComputerVisitor visitor) {
        if (visitor.validated()) {
            visitor.visit(this);
        }
    }
}