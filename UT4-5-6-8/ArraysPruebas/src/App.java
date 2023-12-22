public class App {

  public static void main(String[] args) throws Exception {
    //int[] array = new int[3];
    int[][] array = { { 5, 6 }, { 8, 9 }, { 3, 5 } };
    for (int i = 0; i < array.length; i++) {
      for (int j = 0; j < array[0].length; j++) {
        System.out.print(array[i][j] + " ");
      }
    }
  }
}
