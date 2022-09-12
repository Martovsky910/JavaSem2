import java.util.Scanner;

public class program {
    public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.print("Введите число: ");
    int n = s.nextInt();

    for (int i = 1; i <= n; i++){
      System.out.printf("%d ", i*(i+1)/2);
    }
  }
}
