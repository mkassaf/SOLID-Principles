package edu.najah.eng.solid.ocp.assignment;


import java.util.ArrayList;

public class Calculator {

    private ArrayList<Integer> numbers = null;


    public Calculator(){
        numbers = new ArrayList<>();
    }

    public ArrayList<Integer> getNumbers() {
        return numbers;
    }

    public void addNumber(int number){
        numbers.add(number);
    }
    public void removeNumberAtIndex(int index){
        if (index < 0 || index >= numbers.size()){
            System.out.println("Invalid number: " + index);
            return;
        }
        numbers.remove(index);
    }

    public int getOperationResult(Operation operation){

        if (operation.equals(Operation.Count)){
            return numbers.size();
        }
        if (operation.equals(Operation.Addition)){
            int result = 0;
            for (Integer number : numbers) {
                result += number;
            }
            return result;
        }

        if (operation.equals(Operation.Multiplication)){
            int result = 1;
            for (Integer number : numbers) {
                result *= number;
            }
            return result;
        }
        if (operation.equals(Operation.Max)){
            int max = Integer.MIN_VALUE;
            for (Integer number : numbers) {
                if (max < number){
                    max = number;
                }
            }
            return max;
        }
        if (operation.equals(Operation.Min)){
            int min = Integer.MAX_VALUE;
            for (Integer number : numbers) {
                if (min > number){
                    min = number;
                }
            }
            return min;
        }
        System.err.println("Invalid operation");
        return -1111111;
    }
}
