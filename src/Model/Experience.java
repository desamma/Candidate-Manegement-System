
package Model;

public class Experience extends Candidate{
    private int ExpInYear;
    private String ProSkill;

    public Experience(int ExpInYear, String ProSkill, Name name, int cDate, Contact contact, int cType) {
        super(name, cDate, contact, cType);
        this.ExpInYear = ExpInYear;
        this.ProSkill = ProSkill;
    }

    public int getExpInYear() {
        return ExpInYear;
    }

    public void setExpInYear(int ExpInYear) {
        this.ExpInYear = ExpInYear;
    }

    public String getProSkill() {
        return ProSkill;
    }

    public void setProSkill(String ProSkill) {
        this.ProSkill = ProSkill;
    }
    
}
