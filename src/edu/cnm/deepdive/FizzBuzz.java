package edu.cnm.deepdive;

public class FizzBuzz {


  private static final int DEFAULT_UPPER_BOUND = 100;

  public static void main(String[] args) {

    int upperBound = (args.length > 0) ? Integer.parseInt(args[0]) : DEFAULT_UPPER_BOUND;

    for (int i = 1; i <= upperBound; i++) {
      System.out.println(fizzBuzzValue(i));
    }

  }

  public static String fizzBuzzValue(int value) {

    String fb = String.valueOf(value);
    if (value % 15==0){
      fb = "fizzbuzz";
    } else if (value % 3 ==0){
      fb = "fizz";
    } else if (value % 5 == 0){
      fb = "buzz";
    }
    return fb;
  }
  public static String oneLineFizzBuzz(int value){
    return value % 15 == 0 ? "fizzbuzz"
        : (value % 3 == 0 ? "fizz" : (value % 5 == 0 ? "buzz" : String.valueOf(value)));

  }

}
