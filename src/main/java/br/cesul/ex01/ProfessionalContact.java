package br.cesul.ex01;

public class ProfessionalContact extends Contact {

    private String company;
    private String comercialphone;
    private String linkedin;
    private String profession;
    private String sector;

    public ProfessionalContact(String name, String phone, String email, String address, String instagram, String company, String comercialphone, String linkedin, String profession, String sector) {
        super(name, phone, email, address, instagram);
        this.company = company;
        this.comercialphone = comercialphone;
        this.linkedin = linkedin;
        this.profession = profession;
        this.sector = sector;
    }

    public String getCompany() {
        return company;
    }

    public String getComercialphone() {
        return comercialphone;
    }

    public String getLinkedin() {
        return linkedin;
    }

    public String getProfession() {
        return profession;
    }

    public String getSector() {
        return sector;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public void setComercialphone(String comercialphone) {
        this.comercialphone = comercialphone;
    }

    public void setLinkedin(String linkedin) {
        this.linkedin = linkedin;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public void setSector(String sector) {
        this.sector = sector;
    }
}

