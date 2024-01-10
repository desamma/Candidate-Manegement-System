
package Model;

public class Name {
    private String fName;
    private String lName;

    public Name(String fName) {
        this(fName, null);
    }

    public Name(String fName, String lName) {
        this.fName = fName;
        this.lName = lName;
    }

}
