 package pe.caichihua.mathlib.impl;
import pe.caichihua.mathapi.Operation;
import pe.caichihua.mathlib.impl.*;

public class MathIntegerOperation {

public static Operation<Integer, Integer> getAdditionOperation() {
    return new AdditionOperation();

}

public static Operation<Integer, Integer> getSubtractionOperation() {
    return new SubstractionOperation();
}

}