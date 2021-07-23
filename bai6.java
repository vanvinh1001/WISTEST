import java.util.Scanner;
public class bai6{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap số cần tìm giai thừa: ");
        int a = scanner.nextInt();
        System.out.println(tinhGiaithua(a));
    }
    public static long tinhGiaithua(int n) {
        if (n > 0) {
            return n * tinhGiaithua(n - 1);
        } else {
            return 1;
        }
    }
}