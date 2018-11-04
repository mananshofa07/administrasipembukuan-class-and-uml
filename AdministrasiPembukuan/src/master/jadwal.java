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
public class jadwal {
    int id_mapel;
    String nm_mapel;
    String hari;
    String jam;
    String Ruang;
    
    kelas kelas = new kelas();

    public int getId_mapel() {
        return id_mapel;
    }

    public void setId_mapel(int id_mapel) {
        this.id_mapel = id_mapel;
    }

    public String getNm_mapel() {
        return nm_mapel;
    }

    public void setNm_mapel(String nm_mapel) {
        this.nm_mapel = nm_mapel;
    }

    public String getHari() {
        return hari;
    }

    public void setHari(String hari) {
        this.hari = hari;
    }

    public String getJam() {
        return jam;
    }

    public void setJam(String jam) {
        this.jam = jam;
    }

    public String getRuang() {
        return Ruang;
    }

    public void setRuang(String Ruang) {
        this.Ruang = Ruang;
    }

    public kelas getKelas() {
        return kelas;
    }

    public void setKelas(kelas kelas) {
        this.kelas = kelas;
    }
    
    
}
