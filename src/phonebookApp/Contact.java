package phonebookApp;

public class Contact {
    private String name;
    private String address;
    private String email;
    private String phoneNumber;

    public Contact(String name, String address, String email, String phoneNumber) {
        this.name = name;
        this.address = address;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public void setName(String name){
       this.name = name;

    }

    public String getName() {
        return name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }
    public String getPhoneNumber(){

        return phoneNumber;
    }
    public String toString(){
        return String.format("Name: %s\nPhone: %s\nAddress: %s\nEmail: %s\n", name, phoneNumber, address, email);
    }
}
