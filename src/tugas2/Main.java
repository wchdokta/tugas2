 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas2;
import java.util.Scanner;
import tugas2.Ruang.Balok;
import tugas2.Ruang.Kerucut;

/**
 *
 * @author wachid op
 */
public class Main {
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean exit = false;
        
        do{
            Scanner menu = new Scanner(System.in);
            System.out.println("===== Menu =====");
            System.out.println("1. BALOK");
            System.out.println("2. KERUCUT");
            System.out.println("3. Exit");
            System.out.print("PILIH = ");
            int pilih=menu.nextInt();
            switch(pilih){
                case 1:
                    blk(input);
                    break;
                case 2:
                    krct(input);
                    break;
                case 3:
                    exit=true;
                    break;
            }
            System.out.print("\n");
        } while(!exit);
    }

    public static void blk(Scanner input) {
        
        int panjang, lebar, tinggi;
        System.out.println("===== Input =====");
        System.out.print("Panjang : ");
        panjang = input.nextInt();
        System.out.print("Lebar   : ");
        lebar = input.nextInt();
        System.out.print("Tinggi  : ");
        tinggi = input.nextInt();
        
        Balok blk = new Balok(panjang,lebar,tinggi);
        System.out.println("===== OUTPUT =====");
        System.out.println("Luas Persegi     : " + blk.Luas());
        System.out.println("Keliling Persegi : " + blk.Keliling());
        System.out.println("Volume balok     : " + blk.Volume());
        System.out.println("Luas Permukaan   : " + blk.LuasPer());
    }

    public static void krct(Scanner input) {
        
         int tinggi, jari2;
        
        System.out.println("===== Input =====");
        System.out.print("Jari2  : ");
        jari2 = input.nextInt();
        System.out.print("Tinggi : ");
        tinggi = input.nextInt();
        
        Kerucut krct = new Kerucut(jari2,tinggi);
        
        System.out.println("===== OUTPUT =====");
        System.out.println("Luas Lingkaran     : " + krct.Luas());
        System.out.println("Keliling Lingkaran : " + krct.Keliling());
        System.out.println("Volume Kerucut     : " + krct.Volume());
        System.out.println("Luas Permukkaan    : " + krct.LuasPer());
    }
    
    
}
