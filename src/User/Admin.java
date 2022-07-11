package User;

import Project.*;

public class Admin extends User{
    
    public Admin(String name) {
        super(name);
    }

    public void verifyProject(Project project) {
        project.isVerified = true;
    }
}
