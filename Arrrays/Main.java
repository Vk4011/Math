import java.util.Scanner;

public class Main {
    static {
        System.out.println("\n\t Arrays  \n");
    }

    static void rev(int[] a) {
        int s = 0;
        int e = a.length - 1;
        while (s < e) {
            int temp = a[s];
            a[s] = a[e];
            a[e] = temp;
            s++;
            e--;
        }
        Main p = new Main();
        p.printarr(a);
    }

    static public void main(String... arguments) {
        Scanner sc = new Scanner(System.in);
      
        int n = sc.nextInt();
        System.out.print("\n\t Enter size of arr: "+n);
        int arr[] = new int[n];
        System.out.print("\n\t Enter Array elements: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
            System.out.print(arr[i]+"  ");
        }
        System.out.println("\n");
        Main p = new Main();
        System.out.print("Original  ");
        p.printarr(arr);
        System.out.print("\nReversed  ");
        rev(arr);
        System.out.print("\nSorted  ");
        arr = Sort.sort(arr);
        p.printarr(arr);
        
        Sum.sum(arr);

    }

    void printarr(int arr[]) {
        System.out.print("\n\t Array: [ ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.print("]\n");
    }
}
