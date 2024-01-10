
package Model;

public class Intern extends Candidate{
    private String Major;
    private String Semester;
    private String uniName;

    public Intern(String Major, String Semester, String uniName, Name name, int cDate, Contact contact, int cType) {
        super(name, contact, cType);
        this.Major = Major;
        this.Semester = Semester;
        this.uniName = uniName;
    }

    public String getMajor() {
        return Major;
    }

    public void setMajor(String Major) {
        this.Major = Major;
    }

    public String getSemester() {
        return Semester;
    }

    public void setSemester(String Semester) {
        this.Semester = Semester;
    }

    public String getUniName() {
        return uniName;
    }

    public void setUniName(String uniName) {
        this.uniName = uniName;
    }
    
}
