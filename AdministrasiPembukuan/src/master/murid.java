/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package master;

/**
 *
 * @author Manan
 */
public class murid {
    int id_murid;
    String nm_murid;
    
    kelas kelas = new kelas();

    public int getId_murid() {
        return id_murid;
    }

    public void setId_murid(int id_murid) {
        this.id_murid = id_murid;
    }

    public String getNm_murid() {
        return nm_murid;
    }

    public void setNm_murid(String nm_murid) {
        this.nm_murid = nm_murid;
    }

    public kelas getKelas() {
        return kelas;
    }

    public void setKelas(kelas kelas) {
        this.kelas = kelas;
    }
    
}
