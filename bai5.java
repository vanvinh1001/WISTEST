import java.util.Scanner;
public class bai5 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào 1 số: ");
        int n = scanner.nextInt();
        if (n%2==0)
            System.out.print("Đây là số chẵn");
        else
            System.out.print("Đây là số lẻ");
    }
}