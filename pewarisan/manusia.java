public class manusia {
    protected String nama;
    protected int umur;

    public String getnama(){
        return nama;
    }
    public void setnama(String nama){
        this.nama = nama;
    } 
    public int getumur(){
        return umur;
    }
    public void setumur(int umur){
        this.umur = umur;
    }
    public void siapaaku(){
        System.out.println("saya manusia");
    }
}
