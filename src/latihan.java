public class latihan {
    public static void main(String[] args) {
        int muridKelas = 0;
        int full = 32;

        System.out.println("Pendaftaran kelas ini masih dibuka untuk : " + muridKelas) ;
        System.out.println("pendaftaran ditutup untuk : " + full );

        while (muridKelas != full){
            muridKelas++;
            System.out.println("Sedang memproses data...");
            System.out.println("Daftarkan Sekarang!" + full);
        }
        System.out.println("Finale: isi kuota kelas : " + muridKelas );
    }
}
