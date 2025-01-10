package org.example.parser.function;
import org.example.parser.Function;

import java.util.List;

public class SumFunction implements Function {

    @Override
    public Object invoke(List<Object> params) {
        double sum = 0;
        for (Object param : params) {
            sum += Double.parseDouble(param.toString());
        }
        return sum;
    }
}
