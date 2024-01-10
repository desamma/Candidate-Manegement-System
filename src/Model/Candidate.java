
package Model;

public class Candidate {
    protected Name name;
    protected int cDate;
    protected Contact contact;
    protected int cType;
    
    public Candidate(){}

    public Candidate(Name name, int cDate, Contact contact, int cType) {
        this.name = name;
        this.cDate = cDate;
        this.contact = contact;
        this.cType = cType;
    }

    public Name getName() {
        return name;
    }

    public void setName(Name name) {
        this.name = name;
    }

    public int getcDate() {
        return cDate;
    }

    public void setcDate(int cDate) {
        this.cDate = cDate;
    }

    public Contact getContact() {
        return contact;
    }

    public void setContact(Contact contact) {
        this.contact = contact;
    }

    public int getcType() {
        return cType;
    }

    public void setcType(int cType) {
        this.cType = cType;
    }
    
}
