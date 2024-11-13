import java.util.Scanner;

 class pattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();

        int num = 1;

        for(int i = 1; i <= rows; i++) {
            for(int j = 1; j <= i; j++) {
                if(j == 1 || j == i || i == rows || i==1) {
                    System.out.print(num + "  ");
                    num++;
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}