package org.limmen.test.numbers;

import java.util.stream.IntStream;

public class Main {

  public static void main(String[] args) {
    new Main().run();
  }

  public void run() {
    IntStream.range(1, 100).filter(this::tableEndInAllNumbers).forEach(this::showTableOf);
  }

  private boolean tableEndInAllNumbers(final int i) {
    int[] list = IntStream.range(1, 11).map(x -> (x * i) % 10).sorted().toArray();

    return IntStream.range(0, 10).allMatch(x -> list[x] == x);
  }

  private void showTableOf(final int i) {
    System.out.println(String.format("===== Table of %d ===== (prime? %b)", i, isPrime(i)));
    IntStream.range(1, 11).forEach(x -> {
      System.out.println(String.format("%2d * %2d = %3d", i, x, (i * x)));
    });
  }

  private boolean isPrime(int num) {
    for (int i = 2; i <= num / 2; ++i) {
      // condition for nonprime number
      if (num % i == 0) {
        return false;
      }
    }    

    return true;
  }
}
