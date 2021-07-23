import java.util.Scanner;
public class bai2 {
    public static void main (String[] arg){
        Scanner sc = new Scanner(System.in);
        System.out.print("nhập số: ");
        int a = sc.nextInt();
        for (int i=0;i<a; i++){
            System.out.println(Fibonacci(i) +" " );
        }
    }
    public static int Fibonacci (int n){
        if (n<0)
            return -1;
        else if (n==0 || n==1)
            return n;
        else {
            return (Fibonacci(n-1) + Fibonacci(n-2));
        }
    }
}
