import java.util.*;
import Project.*;

public class FundRaisingPlatform {
    public String platformName;
    public ArrayList<Project> projects;

    public FundRaisingPlatform(String platformName) {
        this.platformName = platformName;
        this.projects = new ArrayList<Project>();
    }

    public void addProject(Project project) {
        projects.add(project);
    }

    public void viewAllProjects(){

        for(Project project:projects){
            System.out.println(project.getDetails());
            System.out.println("\n");
        }
    }
}
