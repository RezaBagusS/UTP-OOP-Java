public class Admin {
    private String name;
    private String password;
    
    // Constructor
    public Admin(String name, String password){
        setName(name);
        setPassword(password);
    }
    
    // Basic Setters
    
    public void setName(String name) {
        this.name = name;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }
    
    // Basic Getters
    
    public String getName() {
        return name;
    }
    
    public String getPassword() {
        return password;
    }

    // CLEAR
    
    // To String return a formattet string of admin
    // Mengembalikan formatted string sesuai dengan contoh g
    public String toString() {
        return String.format("Name\t\t: %s \n", getName());
    }

    // CLEAR
    
    // Is match with Name and Password
    // Mengembalikan nilai perbandingan dari nama dan password dari suatu admin
    // Berhubungan dengan fungsi authentication pada "Helper.java"
    public boolean isMatch(String name, String password){
        // Rubah kode di sini
        for (int i = 0; i < Main.admins.length; i++) {
            if (Main.admins[i].getName().equals(name) && Main.admins[i].getPassword().equals(password)) {
                return true;
            }
        }
        return false;
    }
}
