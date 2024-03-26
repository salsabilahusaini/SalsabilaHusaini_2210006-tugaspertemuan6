/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugaspertemuan6;

/**
 *
 * @author salsabila husaini
 */
public class TugasPertemuan6 {
    
    public static void main(String[] args) {
        PersegiPanjang persegiPanjang1 = new PersegiPanjang();
        System.out.println("Keliling dari persegi panjang 1 adalah "+persegiPanjang1.getKeliling()+" ,dan Luas nya adalah "+persegiPanjang1.getLuas());
        
        PersegiPanjang persegiPanjang2 = new PersegiPanjang();
        persegiPanjang2.setLebar(40);
        persegiPanjang2.setPanjang(30);
        System.out.println("Keliling dari persegi panjang 2 adalah "+persegiPanjang2.getKeliling()+" ,dan Luas nya adalah "+persegiPanjang2.getLuas());
        
        PersegiPanjang persegiPanjang3 = new PersegiPanjang();
        persegiPanjang3.setLebar(35);
        persegiPanjang3.setPanjang(25);
        System.out.println("Keliling dari persegi panjang 3 adalah "+persegiPanjang3.getKeliling()+" ,dan Luas nya adalah "+persegiPanjang3.getLuas());
    }
    
}
