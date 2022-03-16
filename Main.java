import java.util.Scanner;
import java.util.LinkedList;
import java.util.Queue;

public class Main {//deklarasi kelas main
        public static void main(String[] args) {
        
        //deklarasi variabel
        int menu;
        String nama;
        //deklarasi input
        Scanner pilihMenu = new Scanner(System.in);
        Scanner inputNama = new Scanner(System.in);
        //deklarasi queue
        Queue<String> name= new LinkedList<>();
        

        System.out.println("\n\t\t=======================================================================================");
        System.out.println("\t\t\t\t\t\t\t                HALLO BAKERY");
        System.out.println("\t\t=======================================================================================");
        
        do{//deklarasi do
            System.out.println("\n\n");
            System.out.println("\t\t\t\t==============================");
            System.out.println("\t\t\t\t\t  PILIH MENU  ");
            System.out.println("\t\t\t\t==============================");
            System.out.println("\t\t\t\t1. Masuk antrian");
            System.out.println("\t\t\t\t2. Antrian Dipanggil");
            System.out.println("\t\t\t\t3. Lihat data antrian");
            System.out.println("\t\t\t\t4. Keluar");
            System.out.println("\t\t\t\t==============================");
            System.out.print("\t\t\t\t     Pilihan : ");
            menu=pilihMenu.nextInt();
            System.out.println("\n");
            if(menu==1){//nama
                System.out.print("\t\t\t\tMasukan nama      : ");
                nama = inputNama.nextLine();
                name.add(nama);


            }else if(menu==2){//antrian dipanggil
                if(name.isEmpty()){
                    System.out.println("\t\t\t\tCEK KEMBALI PELANGGAN ANDA!!");
                }else{
                System.out.println("\t\t\t\tNOTICE!!");
                System.out.println("\t\t\t\tPESANAN ATAS NAMA : "+name.poll());


                }
            }else if(menu==3){//cek no antriam
                if(name.isEmpty()){
                    System.out.println("\t\t\t\tTIDAK ADA PELANGGAN!!");
                }else{
                    
                    System.out.println("\t\t\t\t==============================");
                    System.out.println("\t\t\t\t         DATA PELANGGAN");
                    System.out.println("\t\t\t\t==============================");
                    System.out.println("\t\t\t\t|| NAMA       : "+name);
                    System.out.println("\t\t\t\t==============================");
                    System.out.println("\t\t\t\t|| PELANGGAN PERTAMA  : "+name.peek());
                    System.out.println("\t\t\t\t|| TOTAL PELANGGAN    : "+name.size());
                }
            }else{//jika memilih 4
                if(menu==4){
                    System.out.println("\n\t\t\t\t\t *Terima Kasih*");
                }
            }
        }while(menu!=4);//deklarasi while
    }
}
