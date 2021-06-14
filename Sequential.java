/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas3;
import java.util.Scanner;

public class Sequential {
    public static void main (String[]args){
        System.out.println("***** SEQUENTIAL SEARCH *****"+"\n");
        int data [] = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20 };//isi array
        Scanner scan = new Scanner(System.in);
        System.out.print("masukan data yang di cari: ");
        int key = scan.nextInt();// nilai yang dicari
        
        //menampilkan data array
        System.out.print("isi data adalah: ");
        for (int i = 0; i<data.length; i++){
            System.out.print(data[i]+" ");
        }
        System.out.println("");
        for (int i = 0; i<= data.length; i++){
            if (key == data [i]){ // nilai data yang dicari
                System.out.print("data "+key+" berada pada indeks ke : "+i);
                break;// stop perulangan
            }
        }
        System.out.println("\n");
        System.out.println();
        System.out.println(" ***** terima kasih *****");
        System.out.println();
        System.out.println("Panca Alam Kusuma");
    }
}
