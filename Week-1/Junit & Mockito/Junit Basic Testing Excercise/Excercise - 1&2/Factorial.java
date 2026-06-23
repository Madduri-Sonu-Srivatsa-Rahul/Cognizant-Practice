package org.example;

public class Factorial {
    public int getFactorial(int num) {
        int factorial = 1;

        for(int i = 1;i <= num;i++){
            factorial = factorial * i;
        }
        return factorial;
    }
}
