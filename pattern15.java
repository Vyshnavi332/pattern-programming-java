import java.util.Scanner;

 class pattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();

        for(int i = rows; i >= 1; i--) {
            for(int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }
            for(int j = 1; j <= i; j++) {
                if(i == 1 || i == rows || j == 1 || j == i) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}