import java.util.Scanner;

import maths.Solution;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\n\t Enter the word: ");
        String word = sc.nextLine();
        System.out.println("\n\t Word : " + word);
        
        Solution s = new Solution();
        s.checkKeyword(word);
    }
}