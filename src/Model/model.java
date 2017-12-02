/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author User
 */
public class model {
    String noKtp, nama, jenisKelamin =" ", cabang=" ", handuk=" ", 
            paketFitness=" ";
    int biayaPendaftaran;

    public String getNoKtp() {
        return noKtp;
    }

    public void setNoKtp(String noKtp) {
        this.noKtp = noKtp;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getJenisKelamin() {
        return jenisKelamin;
    }

    public void setJenisKelamin(String jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }

    public String getCabang() {
        return cabang;
    }

    public void setCabang(String cabang) {
        this.cabang = cabang;
    }

    public String getHanduk() {
        return handuk;
    }

    public void setHanduk(String handuk) {
        this.handuk = handuk;
    }

    public String getPaketFitness() {
        return paketFitness;
    }

    public void setPaketFitness(String paketFitness) {
        this.paketFitness = paketFitness;
    }

    public int getBiayaPendaftaran() {
        return biayaPendaftaran;
    }

    public void setBiayaPendaftaran(int biayaPendaftaran) {
        this.biayaPendaftaran = biayaPendaftaran;
    }
    
    
    
}
