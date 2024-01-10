
package Controller;

import Common.Library;
import Model.CandidateList;
import Model.Contact;
import Model.Experience;
import Model.Fresher;
import Model.Intern;
import Model.Name;
import view.Menu;

public class CandidateManagement extends Menu<String>{
    
    private Menu parentMenu;
    private static String[] mc = {"Experience", "Fresher", "Intern", "Searching", "Exit"};
    private Experience ex;
    private Fresher fr;
    private Intern in;
    private Library lib;
    private CandidateList canList;
    
    public CandidateManagement (Menu parentMenu){
        super("Candidate Management System", mc, parentMenu);
        this.parentMenu = parentMenu;
        lib = new Library();
        canList = new CandidateList();
    }
    
    @Override
    public void execute(int n) {
        switch(n){
            case 1:
                addExperience();
                break;
            case 2:
            case 3:
            case 4:
            case 5:
                System.exit(0);
        }
    }
    
    public void addExperience(){
        String fName = lib.getString("Enter first name: ");
        String lName = lib.getString("Enter last name: ");
        String address = lib.getString("Enter address: ");
        String phone = lib.getString("Enter phone number: ");
        String email = lib.getString("Enter email: ");
        int date = lib.getInt("Enter birth: ");
        int type = lib.getInt("Enter type of employee: ");
        Name n = new Name(fName, lName);
        Contact c = new Contact(address, phone, email);
        
        int ExpInYear = lib.getInt("Enter experience years: ");
        String ProSkill = lib.getString("Enter pro skills: ");
        
        ex = new Experience(ExpInYear, ProSkill, n, date, c, type);
        canList.getExCan().add(ex);
        System.out.println(ex);
    }
    
    public void addFresher(){
        String fName = lib.getString("Enter first name: ");
        String lName = lib.getString("Enter last name: ");
        String address = lib.getString("Enter address: ");
        String phone = lib.getString("Enter phone number: ");
        String email = lib.getString("Enter email: ");
        int date = lib.getInt("Enter birth: ");
        int type = lib.getInt("Enter type of employee: ");
        Name n = new Name(fName, lName);
        Contact c = new Contact(address, phone, email);
        
        int Graduation_date = lib.getInt("Enter graduation date: ");
        String Graduation_rank = lib.getString("Enter graduation rank: ");
        String Education = lib.getString("Enter education: ");
        
        fr = new Fresher(Graduation_date, Graduation_rank, Education, n, date, c, type);
        canList.getFrCan().add(fr);
        System.out.println(fr);
    }
    
    public void addIntern(){
        String fName = lib.getString("Enter first name: ");
        String lName = lib.getString("Enter last name: ");
        String address = lib.getString("Enter address: ");
        String phone = lib.getString("Enter phone number: ");
        String email = lib.getString("Enter email: ");
        int date = lib.getInt("Enter birth: ");
        int type = lib.getInt("Enter type of employee: ");
        Name n = new Name(fName, lName);
        Contact c = new Contact(address, phone, email);
        
        String Major = lib.getString("Enter major: ");
        String Semester = lib.getString("Enter semester: ");
        String uniName = lib.getString("Enter university name: ");
        
        in = new Intern(Major, Semester, uniName, n, date, c, type);
        canList.getInCan().add(in);
        System.out.println(in);
    }
}
