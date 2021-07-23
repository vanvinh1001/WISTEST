import java.util.Scanner;

import static java.lang.Math.sqrt;

public class bai3 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số: ");
        int n = scanner.nextInt();
        if(SoNguyenTo(n))
            System.out.println(n + " là số nguyên tố");
        else
            System.out.println(n + " không phải là số nguyên tố");
    }

    public static boolean SoNguyenTo(byte n){
        if(n == 2)
            return true;
        if(n%2==0 || n<=1)
            return false;
        for(byte i = 2; i<=sqrt(n); i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }

    public static boolean SoNguyenTo(short n){
        if(n == 2)
            return true;
        if(n%2==0 || n<=1)
            return false;
        for(short i = 2; i<=sqrt(n); i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }

    public static boolean SoNguyenTo(int n){
        if(n == 2)
            return true;
        if(n%2==0 || n<=1)
            return false;
        for(int i = 2; i<=sqrt(n); i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }

    public static boolean SoNguyenTo(long n){
        if(n == 2)
            return true;
        if(n%2==0 || n<=1)
            return false;
        for(long i = 2; i<=sqrt(n); i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }
}