/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugaspertemuan6;

/**
 *
 * @author salsabila husaini
 */
public class PersegiPanjang {
    int panjang = 1;
    int lebar = 1;
    
    int getLuas(){
        return panjang*lebar;
    }
    
    int getKeliling(){
        return 2*panjang+2*lebar;
    }
    
    void setPanjang(int panjangBaru){
        panjang = panjangBaru;
    }
    
    void setLebar(int lebarBaru){
        lebar = lebarBaru;
    }
}

