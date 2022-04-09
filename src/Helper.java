public class Helper {
    // Helper to initialize
    static void initialize(){
        // Initilaize admin
        Main.admins[0] = new Admin("Joko", "ini_password_joko");
        Main.admins[1] = new Admin("Dengklek", "ini_password_dengklek");
        
        // Initialize Layanan
        // Masukkan daftar-daftar layanan bersesuaian dengan dokumen
        Main.layanans[0] = new Layanan("Layanan Ganti Oli", 500_000, "Layanan Mengganti Oli Pada Mesin");
        Main.layanans[1] = new Layanan("Layanan \"Operasi Mobil\"", 2_000_000, "Layanan Operasio Mobil agar kembali sehat");
        Main.layanans[2] = new Layanan("Layanan \"Ketok Magic\"", 3_000_000, "Layanan untuk menghilangkan penyok pada body mobil");
        Main.layanans[3] = new Layanan("Layanan Modifikasi Mobil Racing", 5_000_000, "Layanan Penambahan NOS serta body untuk Balapan");
        Main.layanans[4] = new Layanan("Layanan Mobil Elektrik", 5_500_000, "Layanan Mengubah mesin bertenaga fosil menjadi listrik");
    }

    // Helper function to authentication
    // Fungsi yang digunakan untuk "melakukan loop" pada iterasi admins
    static boolean authentication(String username, String password) {
        // Rubah Kode di sini
        Admin admin = new Admin(username,password);
        return admin.isMatch(username, password);
    }

    // Helper to format price to rupiah
    static String getFormattedPrice(int price){
        return String.format("Rp. %,d", price);
    }
}
