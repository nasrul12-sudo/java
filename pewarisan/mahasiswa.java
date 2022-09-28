public class mahasiswa extends manusia{
    private String nim;
    private String kelas;

    public String getnim(){
        return nim;
    }
    public void setnim(String nim){
        this.nim = nim;
    }
    public String getkelas(){
        return kelas;
    }
    public void setkelas(String kelas){
        this.kelas = kelas;
    }
    public void kelasApa(){
        System.out.println("saya " + nama + " umur " + umur + " mahasiswa di " + kelas);
    }
}
