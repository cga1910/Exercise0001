// 2019-05-11

// "Given a list of numbers and a number k,
// return whether any two numbers from the list add up to k.
// For example, given [10, 15, 3, 7] and k of 17, return true since 10 + 7 is 17."

public class Exercise0001 {

  public static void main(String[] args) {
    int[] list = {10, 15, 3, 6};
    boolean result = addUpCheck(list, 10);
    System.out.println(result);
  }

  static boolean addUpCheck(int[] list, int k) {
    int x = 0;
    for (int i = 0; i < list.length-1; i++) {
      for (int j = i; j < list.length-1; j++) {
        x = list[i] + list[j+1];
        if (x == k) return true;
      }
    }
    return false;
  }

}