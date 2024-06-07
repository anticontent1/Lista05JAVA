package br.cesul.ex01;

public abstract class Contact {

    private final String name;
    private final String phone;
    private final String email;
    private final String address;
    private final String instagram;

    public Contact(String name, String phone, String email, String address, String instagram) {
        this.name = name;
        this.phone = phone;
        this.email = email;
        this.address = address;
        this.instagram = instagram;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }

    public String getAddress() {
        return address;
    }

    public String getInstagram() {
        return instagram;
    }


}
