package org.example;

public class Fibonacci {

    public long fibonacci(long number) {

        if(number < 0){
            return -1;
        }
        else if(number <= 1){
            return number;
        }
        else {
            return fibonacci(number-1) + fibonacci(number - 2);
        }
    }
    public void printFibonacciSeries(long number){
        for (int i = 0; i < number; i++) {
            System.out.print(" " + fibonacci(i));
        }
    }
}
