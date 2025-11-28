package Tugas.TugasCleanCode;

public class Pengguna {
    private String username;  // Username
    private String password;  // Password

    public Pengguna(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public void penyimpanan() {
        System.out.println("Username: " + username);
        System.out.println("Password: " + password);
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public static void main(String[] args) {
        Pengguna pengguna = new Pengguna("AryaWijaya", "IMLP");

        pengguna.penyimpanan();
    }
}
