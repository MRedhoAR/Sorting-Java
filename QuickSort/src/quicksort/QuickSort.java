package quicksort;
import java.util.Scanner;
public class QuickSort {

    static void quickSort (int a[], int lo, int hi){
        int i=lo, j=hi, h;
        int pivot=a[lo];

        do{
            while (a[i]<pivot) i++;
            while (a[j]>pivot) j--;
            if (i<=j)
            {
                h=a[i]; a[i]=a[j]; a[j]=h;//tukar
                i++; j--;
            }
        } while (i<=j);

        if (lo<j) quickSort(a, lo, j);
        if (i<hi) quickSort(a, i, hi);
    }
    
    public static void main(String[] args) {
        int tabInt[]={9,4,2,7,10,1,5};
        int i,n=7;
        System.out.print("data sebelum di urutkan\n");

            for(i=0;i<n;i++){
                System.out.print(tabInt[i]+ "  ,");
           }
            System.out.print("\n");
        quickSort(tabInt,0,n-1);
                System.out.print("\nsetelah di urutkan dengan quick sort\n");

        for(i=0;i<n;i++){
            System.out.print(tabInt[i]+" , ");
        }
    }
    
}
