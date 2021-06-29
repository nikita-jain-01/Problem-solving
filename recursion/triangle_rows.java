import java.util.*;

class triangle_rows {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int x = scan.nextInt();
    int sum = triangle(x);
    System.out.println(sum);
  }

  public static int triangle(int rows) {
    if (rows <= 1)
      return rows;
    else
      return rows + triangle(rows - 1);
  }

}
