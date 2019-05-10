import java.util.Scanner;

public class kiemtrasonguyento {
    public static void main(String[] args) {
        int number;
        Scanner scanner =new Scanner(System.in);
        System.out.println("Nhap so ");
        number = scanner.nextInt();
        boolean flag=true;
        if (number<2){
            System.out.println(number +"Khong phai so nguyen to");
        }else {
            for (int i=2;i<number;i++){
                 if (number%i==0){
                     flag=false;
                     break;
                 }
            }
        }
        if (flag){
            System.out.println(number+" La so nguyen to ");
        }else {
            System.out.println(number + "Khong la so nguyen to");
        }
    }
}
