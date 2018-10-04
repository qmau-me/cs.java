import java.util.*;

class Insertion {
    public static void main (String args[]) {
        Scanner s = new Scanner (System.in);
        System.out.println("Enter number of elements");
        int n = s.nextInt();
        int i;
        int a[] = new int[n];
        for (i=0;i<n;i++) {
            a[i] = s.nextInt();
        }
        insertion_sort(a,n);
    }

    public static void insertion_sort(int[] a, int n){
        int i,j,k;
        for (j=1;j<n;j++) {
            k = a[j];
            i=j-1;
            while (i>-1 && a[i]>k) {
                a[i+1] = a[i];
                i--;
            }
            a[i+1] = k;
        }
        System.out.println("Sorted array");
        for (i=0;i<n;i++) {
            System.out.println(a[i]);
        }
    }
}