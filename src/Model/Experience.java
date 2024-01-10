
package Model;

public class Experience extends Candidate{
    private int ExpInYear;
    private String ProSkill;

    public Experience(int ExpInYear, String ProSkill, Name name, int cDate, Contact contact, int cType) {
        super(name, contact, cType);
        this.ExpInYear = ExpInYear;
        this.ProSkill = ProSkill;
    }

    public int getExpInYear() {
        return ExpInYear;
    }

    public void setExpInYear(int ExpInYear) throws Exception {
        if (ExpInYear < 0 && ExpInYear > 100) throw new Exception ("You cannot have over 100 years or under 0 year of EXP!");
        this.ExpInYear = ExpInYear;
    }

    public String getProSkill() {
        return ProSkill;
    }

    public void setProSkill(String ProSkill) {
        this.ProSkill = ProSkill;
    }
    
}
