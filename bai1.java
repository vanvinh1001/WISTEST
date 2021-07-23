import java.util.Scanner;
public class bai1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("nhập chuỗi: ");
        String wort = sc.nextLine();
        char[] palindrome = wort.toCharArray();
        System.out.println(ispalindrome (palindrome));
    }

    public static boolean ispalindrome(char[] wort){
        int a = 0;
        int b = wort.length-1;
        while (b>a) {
            if (wort[a] != wort[b])
                return false;
            ++a;
            --b;
        }
        return true;
    }
}