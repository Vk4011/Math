import java.util.Arrays;
public class Sum {
    public static void sum(int a[]) {
        int s=0;
        for(int i=0;i<a.length;i++){
            s+=a[i];
        }
       System.out.println("\nsum of arr elements : "+Arrays.toString(a)+" is : "+s);

    }
    
}
