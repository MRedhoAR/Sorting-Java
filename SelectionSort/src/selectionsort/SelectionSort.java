package selectionsort;
import java.util.Scanner;
public class SelectionSort {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan jumlah Data : ");
        int jumlah_data = in.nextInt();
         
        int[] data = new int[jumlah_data];
        System.out.println();
        for(int x = 0; x < jumlah_data; x++){
            System.out.print("Input nilai Data ke-"+(x+1)+" : ");
            data[x] = in.nextInt();
        }

        System.out.println();
        System.out.print("Data Sebelum di Sorting : ");
        for(int x = 0; x < jumlah_data; x++)
            System.out.print(data[x]+" ");
         
        System.out.println("\n\nProses Selection Sort");
        for(int x = 0; x < jumlah_data-1; x++){
            System.out.println("Iterasi ke-"+(x+1)+" : ");
            for(int y = 0; y < jumlah_data; y++)
                System.out.print(data[y]+" ");
             
            System.out.println("   Apakah Data "+data[x]+" sudah benar pada urutannya?");
             
            boolean tukar = false;
            int index = 0;
            int min = data[x];
            String pesan = "   Tidak Ada Pertukaran";
            for(int y = x+1; y < jumlah_data; y++)
            {
                if(min > data[y])
                {
                    tukar = true;
                    index = y;
                    min = data[y];
                     
                }
            }
             
            if(tukar == true)
            {
                pesan = "   Data "+data[x]+" ditukar dengan Data "+data[index];
                int temp = data[x];
                data[x] = data[index];
                data[index] = temp;
            }
             
            for(int y = 0; y < jumlah_data; y++)
                System.out.print(data[y]+" ");
             
            System.out.println(pesan+"\n");
        }

        System.out.print("Data Setelah di sorting : ");
        for(int x = 0; x < jumlah_data; x++)
            System.out.print(data[x]+" ");
    
    }
}
