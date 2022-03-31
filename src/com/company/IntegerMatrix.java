package com.company;

public class IntegerMatrix extends GenericMatrix<Integer> {
    @Override
    //Add two Integers
    protected Integer add(Integer o1, Integer o2) {
        return o1 + o2;
    }
    //Multiply two Integers
    @Override
    protected Integer multiply(Integer o1, Integer o2) {
        return o1 * o2;
    }
    //Specify zero for an integer

    @Override
    protected Integer zero() {
        return 0;
    }
}
