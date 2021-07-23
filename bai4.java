import java.util.Scanner;

public class bai4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String concatenated_String = sc.nextLine();

        String split_string_array[]=concatenated_String.split("\\,");
        for (int i = 0; i < split_string_array.length; i++) {
            int a = Integer.parseInt(split_string_array[i]);
            if ((a % 5 == 0) && (5*(a/5)==a)) {
                System.out.println(split_string_array[i]);
            }
        }
    }
}
