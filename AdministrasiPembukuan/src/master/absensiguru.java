/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package master;

import guru.guru;

/**
 *
 * @author Manan
 */
public class absensiguru {
    int id_absen;
    String nm_guru;
    String jamber;
    String status;
    String Keterangan;
    String tgl;
    
    guru guru = new guru();

    public int getId_absen() {
        return id_absen;
    }

    public void setId_absen(int id_absen) {
        this.id_absen = id_absen;
    }

    public String getNm_guru() {
        return nm_guru;
    }

    public void setNm_guru(String nm_guru) {
        this.nm_guru = nm_guru;
    }

    public String getJamber() {
        return jamber;
    }

    public void setJamber(String jamber) {
        this.jamber = jamber;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getKeterangan() {
        return Keterangan;
    }

    public void setKeterangan(String Keterangan) {
        this.Keterangan = Keterangan;
    }

    public guru getGuru() {
        return guru;
    }

    public void setGuru(guru guru) {
        this.guru = guru;
    }
    
}
