import java.util.Scanner;

public class bai1buoi5 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Nhập chiều dài: ");
        int sohang=sc.nextInt();
        System.out.println("Nhập chiều rộng: ");
        int socot= sc.nextInt();
        for (int i=0;i<sohang;i++){
            for (int j=0;j<socot;j++){
                System.out.print(" * " );


            }
            System.out.println();
        }

    }

}
