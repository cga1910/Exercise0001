public class Problem0002 {

// Write a method that returns the tree root value, i.e. (4 + 2) * (3 + 7) = 60

//    4   2  3   7   <-- leaves
//    \  /   \  /
//     +      +
//      \    /
//        *

  public static void main(String[] args) {
    int[][] leaves = { {4, 2},
                       {3, 7} };

    System.out.println(solution(leaves));
  }

  static int solution(int[][] leaves) {
    int[] sumArray = new int[leaves.length];
    int product = 1;

    for (int i = 0; i < leaves.length; i++) {
      int sum = 0;
      for (int j = 0; j < leaves[i].length; j++) {
        sum = sum + leaves[i][j];
      }
      sumArray[i] = sum;
    }

    for (int i = 0; i < sumArray.length; i++) {
      product = product * sumArray[i];
    }

    return product;
  }

}