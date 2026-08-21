package Arrays;
import java.util.*;
public class Practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Number") ;
        long num = sc.nextLong();

        long length =String.valueOf(num).length();
        System.out.println("Length = "+ length);
    }
}
