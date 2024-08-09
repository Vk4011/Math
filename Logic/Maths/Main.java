// The 99 Bullets Game
// Imagine you and 99 friends are standing in a circle, so there are 100 people in total. Each person has a number from 1 to 100. Here’s how the game works:

// The Game Starts:

// Person number 1 has a special gun with 99 bullets.
// How the Game Works:

// Person number 1 uses the gun to shoot the next person (person number 2) and then hands the gun to the next person after the one they shot (person number 3).
// Person number 3 then shoots the next person (person number 4) and hands the gun to the next person after the one they shot (person number 5).
// This continues until only one person is left standing.
// Your Task:

// Find out which person will be the last one standing after all the shooting is done.



import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        int n = sc.nextInt(); // Number of people in the circle
        System.out.print("\n\t Number of people : "+n);
        int survivor = findJosephusPosition(n);
        System.out.println("\n\t The position of the last remaining person is: " + survivor);
    }

    public static int findJosephusPosition(int n) {
        // Step 1: Find the largest power of 2 less than or equal to n
        int L = largestPowerOf2LessThanOrEqual(n);
        
        // Step 2: Compute the position of the survivor
        int survivor = 2 * (n - L) + 1;
        
        return survivor;
    }

    public static int largestPowerOf2LessThanOrEqual(int n) {
        int power = 1;
        while (power <= n) {
            power *= 2;
        }
        // power is now greater than n, so divide by 2 to get the largest power of 2 less than or equal to n
        return power / 2;
    }
}



// Example for 100 People
// Let’s use the numbers from 1 to 100 for this game.

// Find the Largest Power of 2:

// We need to find the largest number that is a power of 2 and is less than or equal to 100. The powers of 2 are 1, 2, 4, 8, 16, 32, 64, 128, etc.
// For 100, the largest power of 2 less than or equal to 100 is 64.
// Calculate the Position of the Last Person:

// Subtract 64 from 100: 
// 100
// −
// 64
// =
// 36
// 100−64=36
// Double this number: 
// 36
// ×
// 2
// =
// 72
// 36×2=72
// Add 1 to get the position of the last person standing: 
// 72
// +
// 1
// =
// 73
// 72+1=73
// So, the person who will be the last one standing is person number 73!