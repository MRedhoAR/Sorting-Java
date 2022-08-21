package sort;
import java.util.Scanner;

public class Sort {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String nama, nim;
        int pilih;
        char ulang;
        
            System.out.println("||===============================================||");
            System.out.print(" Input Name : ");
            nama = in.nextLine();
            System.out.print(" Input NIM : ");
            nim = in.nextLine();
            System.out.println();
            
            System.out.println(" Name : "+nama);
            System.out.println(" NIM  : "+nim);
            System.out.println("||===============================================||");
            System.out.println();
            
            do{
                System.out.println("||================================||");
                System.out.println("   1. Bubble Sort");
                System.out.println("   2. Insertion Sort");
                System.out.println("   3. Selection Sort");
                System.out.println("||================================||");
                System.out.print("   Enter Your Choice : ");
                pilih = in.nextInt();
                
                switch(pilih){
                    case 1 :
                        int jumlah,i,j, swap;
                        System.out.print("Enter the number of numbers you want to input :");
                        jumlah = in.nextInt();
 
                        int array[] = new int[jumlah]; 
                        System.out.println("\nEnter " + jumlah+" Integer Number");
                        System.out.println("===========================================");
                        for(i=0; i<jumlah;i++){
                            System.out.print("Number to- " + (i+1)+" =");
                            array[i]=in.nextInt();
                        }

                        System.out.println("\nUnsorted Numbers");
                        for(int a=0;a<jumlah;a++){
                            System.out.print(array[a] +" ");
                        }

                        for(i=0; i<(jumlah-1);i++){
                            for(j=0;j<jumlah-i-1;j++){
                                if (array[j] > array[j+1]){
                                    swap = array[j];
                                    array[j] = array[j+1];
                                    array[j+1]=swap;
                                }
                            }
                        }

                        System.out.println("\n\nThe ordered number is :");
                        for(i=0;i<jumlah; i++)
                        System.out.print(array[i] +" ");
                        break;
                        
                    case 2 :
                        System.out.print("lots of data : ");
                        int N = in.nextInt();
                        int data[] = new int[N];
                        for(int a=0; a<N; a++){
                            System.out.print("data to-"+(a+1)+" : ");
                            data[a] = in.nextInt();
                        }
                        //prose isertion sort
                        for(int a=1; a<data.length; a++){
                            int key = data[a];
                            int b=a;
                            while(b >0 && data[b-1]>key){
                                data[b]=data[b-1];
                                b--;
                            }
                            data[b]=key;
                        }
                        //hasil pengurutan
                        System.out.print("the data is sorted : ");
                        for(int a=0; a<data.length; a++){
                            System.out.print(data[a]+" ");
                        }
                        System.out.println();
                        break;
                        
                    case 3 :
                        int nilai [] = {6,4,5,2,3};
       
                        for (int s = 0 ; s<nilai.length-1;s++){
                            int min = s;
                            for (int x = 1+s ; x<nilai.length; x++){
                                /*System.out.println(min+" "+x);*/
                                if (nilai[min] > nilai[x]){
                                    min = x;
                                }
                            }
                            int z= nilai[min];
                            nilai[min] = nilai [s];
                            nilai[s] = z;
                        }
                        for (int s = 0 ; s<nilai.length;s++){
                            System.out.print(nilai[s]+" ");
                        }
                        break;
                    default :
                        System.out.println("System Error");
                        break;
                }
                System.out.print("want to continue again ? (input letters Y/T) : ");
                ulang=in.next().charAt(0);
            }while(ulang=='Y'||ulang=='y');            
    }
    
}
