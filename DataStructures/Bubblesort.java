import java.util.*;

class Main {
  public static void main(String[] arg) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter arraysize");
    int n = sc.nextInt();
    int arr[] = new int[n];
    System.out.println("enter array elements");
    for (int i = 0; i <= n - 1; i++)
      arr[i] = sc.nextInt();
    for (int i = 0; i < arr.length - 1; i++) {
      for (int j = 0; j < arr.length - 1; j++) {
        int temp = 0;
        if (arr[j] > arr[j + 1]) {
          temp = arr[j];
          arr[j] = arr[j + 1];
          arr[j + 1] = temp;
        }
      }
      System.out.println(arr[i]);
    }
    
  }
}