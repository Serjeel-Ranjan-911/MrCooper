package User;

import java.util.*;
import Project.*;
public class Donor extends User{

    public Donor(String name) {
        super(name);
    }
    
    public void donateTo(int projectId,int amount,String currency,ArrayList<Project> projects){
        for(Project project: projects){
            if(project.id == projectId){
                project.acceptDonation(this.name, amount, currency);
            }
        }
    }
    
}
