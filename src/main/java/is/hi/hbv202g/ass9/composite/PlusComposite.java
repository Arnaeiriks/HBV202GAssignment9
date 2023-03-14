package is.hi.hbv202g.ass9.composite;

public class PlusComposite {
    private int value;

    public PlusComposite(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public void add(PlusComposite composite) {
        this.value += composite.getValue();
    }
}
