package ru.mirea.pr11.zd4;

public class Divide extends ExpressionParser {
    public Divide(TripleExpression c1, TripleExpression c2) {
        super(c1, c2);
    }
    public Divide(TripleExpression c1, TripleExpression c2,Space sp){
        super(c1,c2);
    }
    public Divide(TripleExpression c1, Space sp, TripleExpression c2){
        super(c1,c2);
    }
    public Divide(Space sp,TripleExpression c1, TripleExpression c2){
        super(c1,c2);
    }
    @Override
    protected int evaluate(int fr, int b) throws Exception {
        if(b == 0)
            throw new InvalidException("division by zero");
        if(fr/b<Integer.MIN_VALUE||fr/b>Integer.MAX_VALUE)
            throw new InvalidException("overflow");
        return fr/b;
    }
}
