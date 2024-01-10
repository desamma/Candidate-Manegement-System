
package Controller;

import Common.Library;
import Model.Candidate;
import Model.CandidateList;
import Model.Contact;
import Model.Experience;
import Model.Fresher;
import Model.Intern;
import Model.Name;
import View.CandidateView;
import java.util.ArrayList;
import view.Menu;

public class Controller extends Menu<String>{
    
    private Menu parentMenu;
    private static String[] mc = {"Experience", "Fresher", "Intern", "Searching", "Exit"};
    private Library lib;
    private CandidateList canList;
    private CandidateView canView;
    
    public Controller (Menu parentMenu){
        super("Candidate Management System", mc, parentMenu);
        this.parentMenu = parentMenu;
        lib = new Library();
        canList = new CandidateList();
        canView = new CandidateView();
    }
    
    @Override
    public void execute(int n) {
        switch(n){
            case 1:
                addExperience();
                break;
            case 2:
                addFresher();
                break;
            case 3:
                addIntern();
                break;
            case 4:
                doSearch();
                break;
            case 5:
                System.exit(0);
        }
    }
    
    public void addExperience(){
        try{
        String fName = lib.getString("Enter first name: ");
        String lName = lib.getString("Enter last name: ");
        String address = lib.getString("Enter address: ");
        String phone = lib.getString("Enter phone number: ");
        String email = lib.getString("Enter email: ");
        int date = lib.getInt("Enter birth: ");
        int type = 0;
        Name n = new Name(fName, lName);
        Contact c = new Contact(date, address, phone, email);
        
        int ExpInYear = lib.getInt("Enter experience years: ");
        String ProSkill = lib.getString("Enter pro skills: ");
        
        Experience ex = new Experience(ExpInYear, ProSkill, n, date, c, type);
        canList.getExCan().add(ex);
        System.out.println(ex);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    public void addFresher(){
        try{
        String fName = lib.getString("Enter first name: ");
        String lName = lib.getString("Enter last name: ");
        String address = lib.getString("Enter address: ");
        String phone = lib.getString("Enter phone number: ");
        String email = lib.getString("Enter email: ");
        int date = lib.getInt("Enter birth: ");
        int type = 1;
        Name n = new Name(fName, lName);
        Contact c = new Contact(date, address, phone, email);
        
        int Graduation_date = lib.getInt("Enter graduation date: ");
        String Graduation_rank = lib.getString("Enter graduation rank: ");
        String Education = lib.getString("Enter education: ");
        
        Fresher fr = new Fresher(Graduation_date, Graduation_rank, Education, n, date, c, type);
        canList.getFrCan().add(fr);
        System.out.println(fr);
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
    
    public void addIntern(){
        try{
        String fName = lib.getString("Enter first name: ");
        String lName = lib.getString("Enter last name: ");
        String address = lib.getString("Enter address: ");
        String phone = lib.getString("Enter phone number: ");
        String email = lib.getString("Enter email: ");
        int date = lib.getInt("Enter birth: ");
        int type = 2;
        Name n = new Name(fName, lName);
        Contact c = new Contact(date, address, phone, email);
        
        String Major = lib.getString("Enter major: ");
        String Semester = lib.getString("Enter semester: ");
        String uniName = lib.getString("Enter university name: ");
        
        Intern in = new Intern(Major, Semester, uniName, n, date, c, type);
        canList.getInCan().add(in);
        System.out.println(in);
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
    
    public void doSearch(){
        System.out.println("List of candidate:");
        canView.displayCandidateLists(canList);
        String searchName = lib.getString("Input Candidate name (First name or Last name):  ");
        int searchType = lib.getInt("Input type of candidate: ");

        ArrayList<Candidate> searchResults = canList.searchAll(searchName, searchType);

        if (searchResults.isEmpty()) {
            System.out.println("No matching candidates found.");
        } else {
            System.out.println("Matching candidates:");
            display(searchResults);
        }
    }
    
    public void display (ArrayList<Candidate> candidates){
        for (Candidate c : candidates) {
            System.out.println(c.toString());
        }
    }
}
