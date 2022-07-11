package User;

import java.util.*;
import Project.*;

public class Admin extends User{
    
    public Admin(String name) {
        super(name);
    }

    public void verifyProject(int projectId,ArrayList<Project> projects){

        for(Project project: projects){
            if(project.id == projectId){
                project.isVerified = true;
            }
        }

    }
}
