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
public class absensimurid {
    int id_absen;
    String nm_murid;
    String status;
    String tgl;
    
    kelas kelas = new kelas();
    murid murid = new murid();

    public int getId_absen() {
        return id_absen;
    }

    public void setId_absen(int id_absen) {
        this.id_absen = id_absen;
    }

    public String getNm_murid() {
        return nm_murid;
    }

    public void setNm_murid(String nm_murid) {
        this.nm_murid = nm_murid;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public kelas getKelas() {
        return kelas;
    }

    public void setKelas(kelas kelas) {
        this.kelas = kelas;
    }

    public murid getMurid() {
        return murid;
    }

    public void setMurid(murid murid) {
        this.murid = murid;
    }
    
    
}
