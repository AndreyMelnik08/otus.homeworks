package ru.otus.java.basic.homework9;
import java.util.List;

public class OperationsWithArrays {

    public List<Integer> selectMinMax(List<Integer> arrayListOne, int min, int max) {
        for (int i = min; i <= max; i++) {
            arrayListOne.add(i);
        }
        return arrayListOne;
    }

    public int sumElements(List<Integer> arrayListTwo) {
        int sum = 0;
        for (Integer elem : arrayListTwo) {
            if (elem > 5) {
                sum += elem;
            }
        }   return sum;
    }

    public List changeElements(List<Integer> arrayListTwo, int elem) {
        for (int i = 0; i < arrayListTwo.size(); i++) {
            arrayListTwo.set(i, elem);
        } return arrayListTwo;
    }

    public List increaseElements(List<Integer> arrayListTwo, int elem) {
        for (int i = 0; i < arrayListTwo.size(); i++) {
            arrayListTwo.set(i, arrayListTwo.get(i) + elem);
        } return arrayListTwo;
    }

}
