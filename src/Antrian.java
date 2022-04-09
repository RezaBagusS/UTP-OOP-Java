public class Antrian {
    private String name;
    private String phoneNumber;
    private String licenseNumber;
    private Layanan[] layanans;
    private int totalPrice;

    // Helper index in layanans
    private int indexLayanan;

    // Constructor
    public Antrian(String name, String phoneNumber, String licenseNumber){
        setName(name);
        setPhoneNumber(phoneNumber);
        setLicenseNumber(licenseNumber);
        this.indexLayanan = 0;
        setLayanans(new Layanan[3]);
        setTotalPrice(0);
    }

    // Basic Setter

    public void setName(String name){
        this.name =  name;
    }

    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber =  phoneNumber;
    }

    public void setLicenseNumber(String licenseNumber){
        this.licenseNumber =  licenseNumber;
    }

    public void setLayanans(Layanan[] layanans){
        this.layanans = layanans;
    }

    public void setTotalPrice(int totalPrice){
        this.totalPrice = totalPrice;
    }

    // Basic Getters

    public String getName(){
        return name;
    }

    public String getPhoneNumber(){
        return phoneNumber;
    }
    
    public String getLicenseNumber(){
        return licenseNumber;
    }

    public Layanan[] getLayanan(){
        return layanans;
    }
    
    public int getTotalPrice(){
        return totalPrice;
    }

    // Public helper getFormatted Price
    // Ini nanti juga ditanyakan
    public String getFormattedPrice(){
        return Helper.getFormattedPrice(getTotalPrice());
    }

    // To String return a formattet string of layanan
    // Mengembalikan formatted string terhadap Antrian sesuai dengan gambar yang terlampir
    public String toString(){
        // Rubah Kode di sini
        System.out.println("Name\t\t: "+this.getName());
        System.out.println("Phone\t\t: "+this.getPhoneNumber());
        System.out.println("License\t\t: "+this.getLicenseNumber());
        System.out.println("Daftar Layanan ");
        System.out.println("-------------------------------------------------");

        int index = 1;
        for (Layanan layanan : layanans) {
            if (layanan == null) {
                break;
            }

            // Print to string
            System.out.println("----------------------------------------------------------\n");
            System.out.printf("Layanan Nomor\t: %d\n", index);
            System.out.println(layanan.toString());
            System.out.println("----------------------------------------------------------\n");
            index++;
        }
        System.out.println("Total\t\t: "+getFormattedPrice());
        return "";
    }

    // Helper untuk menambahkan layanan
    // Fungsi helper ketika akan menambahkan daftar layanan
    public void addLayanan(Layanan layanan){
        // Rubah kode di sini
        layanans[this.indexLayanan] = layanan;
        addTotalPrice(layanan.getPrice());
        this.indexLayanan++;
    }

    // Helper untuk menambahkan totalPrice
    // Fungsi helper ketika akan menambahkan totalPrice
    public void addTotalPrice(int layananPrice){
        // Rubah kode di sini
        this.totalPrice = this.totalPrice + layananPrice;
    }
}
