
import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        String a = sc.next();
        for(int i=0;i<a.length();i++){
            sum += a.charAt(i)-'0';
        }

    }
}