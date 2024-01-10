
package Model;

import java.util.ArrayList;

public class CandidateList {
    private ArrayList<Experience> exCan;
    private ArrayList<Fresher> frCan;
    private ArrayList<Intern> inCan;

    public CandidateList(){
        exCan = new ArrayList<>();
        frCan = new ArrayList<>();
        inCan = new ArrayList<>();
    }

    public ArrayList<Experience> getExCan() {
        return exCan;
    }

    public void setExCan(ArrayList<Experience> exCan) {
        this.exCan = exCan;
    }

    public ArrayList<Fresher> getFrCan() {
        return frCan;
    }

    public void setFrCan(ArrayList<Fresher> frCan) {
        this.frCan = frCan;
    }

    public ArrayList<Intern> getInCan() {
        return inCan;
    }

    public void setInCan(ArrayList<Intern> inCan) {
        this.inCan = inCan;
    }
    
    public void addEx(Experience candidate){
        exCan.add(candidate);
    }
    public void addEx(Fresher candidate){
        frCan.add(candidate);
    }
    public void addEx(Intern candidate){
        inCan.add(candidate);
    }
    
    public ArrayList<Candidate> searchAll(String name, int cType){
        ArrayList<Candidate> foundCandidate = new ArrayList<>();
        
        switch(cType){
            case 0:
                return searchInList(exCan, name);
            case 1:
                return searchInList(frCan, name);
            case 2:
                return searchInList(inCan, name);
        }
        return foundCandidate;
    }
    
    public ArrayList<Candidate> searchInList(ArrayList<? extends Candidate> candidateList, String name){
        ArrayList<Candidate> found = new ArrayList<>();
        
        for (Candidate c : candidateList){
            String fullName = c.name.fName + " " + c.name.lName;
            if(fullName.contains(name)) {
                found.add(c);
            };
        }
        return found;
    }
}
