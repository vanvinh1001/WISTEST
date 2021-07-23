import java.util.Scanner;
public class bai8 {
    public static void doiCoSo(int n, int base) {
        if (n >= base) doiCoSo(n / base, base);
        if (n % base > 9) System.out.printf("%c", n % base + 55);
        else
            System.out.print((n % base));
    }

    public static int NhapCoSo() {
        Scanner sc  = new Scanner(System.in);
        boolean check = false;
        int n = 0;
        while (!check) {
            System.out.print(" ");
            try {
                n = sc.nextInt();
                check = true;

            } catch (Exception e) {
                System.out.print("Bạn phải nhập số: ");
                sc.nextLine();
            }
        }
        return (n);
    }

    public static void main(String[] args) {
        System.out.print("Nhập vào số cần chuyển: ");
        int n = NhapCoSo();
        System.out.print("Nhập vào cơ số muốn chuyển: ");
        int b = NhapCoSo();
        System.out.println("Số " + n + " chuyển sang cơ số " + b + " thành: ");
        doiCoSo(n, b);
    }
}
