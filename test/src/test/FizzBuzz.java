package test;

public class FizzBuzz {
    public static void main(String[] args) {
        for (int number = 1; number <= 100; number++) {
            String toPrint = "";
            if(number % 3 == 0) {
                toPrint += "Fizz";
            }
            if(number % 5 == 0) {
                toPrint += "Buzz";
            }
            if (toPrint.isEmpty()) {
                toPrint = Integer.toString(number);
            }
            System.out.println(toPrint);
        }
    }
}