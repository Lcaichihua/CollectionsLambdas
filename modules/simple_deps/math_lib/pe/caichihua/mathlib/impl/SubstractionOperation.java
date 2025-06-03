package pe.caichihua.mathlib.impl;
import  pe.caichihua.mathapi.Operation;
import pe.caichihua.mathlib.impl.*;


public class SubstractionOperation implements Operation<Integer, Integer> {


    public Integer apply(Integer a, Integer b) {
        return a - b;
    }
}