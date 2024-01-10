
package Model;

public class Candidate {
    protected Name name;
    protected Contact contact;
    protected int cType;
    
    public Candidate(){}

    public Candidate(Name name, Contact contact, int cType) {
        this.name = name;
        this.contact = contact;
        this.cType = cType;
    }

    @Override
    public String toString() {
        return name.fName + " " + name.lName + "|" + contact.dob + "|" + contact.address + '|' + contact.phone + "|" + contact.email + "|" + cType;
    }
    
    public String printName(){
        return name.fName + " " + name.lName;
    }
}
