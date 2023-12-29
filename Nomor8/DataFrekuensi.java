package Nomor8;


public class DataFrekuensi {
    public String nama;
    public int frekuensi;
    
    public DataFrekuensi(String nama){
        this.nama = nama;
        this.frekuensi = 1;
    }
    
    public void incrementFrekuensi(){
        this.frekuensi++;
    }
}