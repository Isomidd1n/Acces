package uz.pdp.online.model;

public class User {
//    Model package ini ichida quyidagicha atributlari bor bo’lgan
//    User klassini yarating: id,  username(public), email(public),
//    password(private),  name, address. Parolni o’zgartiradigan changePassword methodini yarating.
//    Bunda eski parol kiritiladi agar u to’g’ri bo’lsa
//    yangi parol kiritish mumkin bo’lsin.Main metodi  ham bo'lsin

    public int id;
    public String username;
    public String email;
    private int password;
    private String name;
    private String address;

    public User() {
    }

    public User(int id, String username, String email, int password, String name, String address) {
        this.id = id;
        this.username = username;
        this.email = email;
        this.password = password;
        this.name = name;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
