
package Model;

public class Contact {
    protected String address;
    protected String phone;
    protected String email;
    protected int dob;

    public Contact(int dob, String address, String phone, String email) {
        this.dob = dob;
        this.address = address;
        this.phone = phone;
        this.email = email;
    }

    public int getDob() {
        return dob;
    }

    public void setDob(int dob) throws Exception {
        if (dob < 1900 ) throw new Exception ("Dob must be higher than 1900");
        this.dob = dob;
    }
    
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) throws Exception {
        if(phone.length() < 10) throw new Exception ("Minimum phone number is 10!");
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) throws Exception {
        if (email.matches("^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$")) throw new Exception ("Wrong email format");
        this.email = email;
    }
    
}
