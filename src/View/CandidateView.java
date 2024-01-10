
package View;

import Model.CandidateList;
import Model.Experience;
import Model.Fresher;
import Model.Intern;
import java.util.ArrayList;

public class CandidateView {

    public  void displayCandidateLists(CandidateList candidateList) {
        System.out.println("===========EXPERIENCE CANDIDATE============");
        displayExperienceCandidates(candidateList.getExCan());

        System.out.println("==========FRESHER CANDIDATE==============");
        displayFresherCandidates(candidateList.getFrCan());

        System.out.println("===========INTERN CANDIDATE==============");
        displayInternCandidates(candidateList.getInCan());
    }

    public void displayExperienceCandidates(ArrayList<Experience> experienceCandidates) {
        for (Experience candidate : experienceCandidates) {
            System.out.println(candidate.printName());
        }
    }

    public void displayFresherCandidates(ArrayList<Fresher> fresherCandidates) {
        for (Fresher candidate : fresherCandidates) {
            System.out.println(candidate.printName());
        }
    }

    public void displayInternCandidates(ArrayList<Intern> internCandidates) {
        for (Intern candidate : internCandidates) {
            System.out.println(candidate.printName());
        }
    }
    
    
}