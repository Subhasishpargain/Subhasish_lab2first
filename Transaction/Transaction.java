  package Transaction;

  import java.util.Scanner;

  public class Transaction {
      public static int transaction(int[] transactions, int target) {
          int total = 0;
          for (int i = 0; i < transactions.length; i++) {
              total += transactions[i];
              if (total >= target) {
                  return i + 1;
              }
          }
          return -1;
      }

      public static void main(String[] args) {
          Scanner scanner = new Scanner(System.in);
          System.out.print("Enter the size of transaction array: ");
          int size = scanner.nextInt();
          int[] array = new int[size];
          for (int i = 0; i < size; i++) {
              System.out.println("Enter the value of transaction " + (i + 1) + ": ");
              array[i] = scanner.nextInt();
          }
          System.out.println("Enter the total number of targets that need to be achieved: ");
          int numTargets = scanner.nextInt();
          for (int i = 0; i < numTargets; i++) {
              System.out.println("Enter the value of target " + (i + 1) + ": ");
              int target = scanner.nextInt();
              int result = transaction(array, target);
              if (result != -1) {
                  System.out.println("Target achieved after " + result + " transactions");
              } else {
                  System.out.println("Target not achieved");
              }
          }
      }
  }
