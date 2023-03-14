package is.hi.hbv202g.ass9.composite;

import java.util.ArrayList;
import java.util.List;

public class MultiplyComposite implements MathExpression {

    private NumberLeaf value;
    private List<MathExpression> children = new ArrayList<MathExpression>();


    @Override
    public int getResult() {
        return value;
    }
    public MultiplyComposite (int value) {
        this.value = value


    }


}