public class tester {
    public static void main(String[] args){
        dosen Dosen = new dosen();
        Dosen.setnama("antonio kentot");
        Dosen.setumur(24);
        Dosen.setnip("12345678");
        Dosen.setmatkul("sex education");
        System.out.println("nip dosen = " + Dosen.getnip());
        Dosen.mengajarApa();
        System.out.println("");
        mahasiswa Mahasiswa = new mahasiswa();
        Mahasiswa.setnama("kontolodon");
        Mahasiswa.setumur(20);
        Mahasiswa.setnim("678910");
        Mahasiswa.setkelas("1F");
        System.out.println("nim mahasiswa = " + Mahasiswa.getnim());
        Mahasiswa.kelasApa();
    }
}
