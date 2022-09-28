public class dosen extends manusia {
    private String nip;
    private String matkul;
    public String getnip(){
        return nip;
    }
    public String getmatkul(){
        return matkul;
    }
    public void setnip(String nip){
        this.nip = nip;
    }
    public void setmatkul(String matkul){
        this.matkul = matkul;
    }
    public void mengajarApa(){
        System.out.println("saya " + nama + " umur " + umur + " mengajar " + matkul);
    }
}
