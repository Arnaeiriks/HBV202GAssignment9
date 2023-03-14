package is.hi.hbv202g.ass9.composite;

import java.util.ArrayList;
import java.util.List;

public class MultiplyComposite implements MathExpression {


    private List<MathExpression> children = new ArrayList<MathExpression>();

    @Override
    public int getResult() {
        int result = 0;
        for (MathExpression child : children) {
            result += child.getResult();
        }
        return result;
    }
    public void add(MathExpression expression) {
        children.add(expression);
    }

    public void remove(MathExpression expression) {
        children.remove(expression);
    }

    public List<MathExpression> getChildren() {
        return children;
    }

}