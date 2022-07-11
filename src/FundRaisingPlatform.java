import java.util.*;
import Project.*;

public class FundRaisingPlatform {
    public String platformName;
    public ArrayList<Project> projects;

    public FundRaisingPlatform(String platformName) {
        this.platformName = platformName;
    }

    public void addProject(Project project) {
        projects.add(project);
    }
}
