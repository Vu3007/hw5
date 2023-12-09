import java.util.Scanner;

public class bai2buoi5 {    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Nhập chiều dài: ");
        int sohang=sc.nextInt();
        System.out.print("Nhập chiều rộng: ");
        int socot= sc.nextInt();
        for (int i=0;i<sohang;i++){
            for (int j=0;j<socot;j++){
                if (i==0||i==sohang-1||j==0||j==socot-1){
                    System.out.print(" *");
                }else {
                    System.out.print("  ");
                }



            }
            System.out.println("");
        }


    }

}
