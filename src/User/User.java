package User;

import Project.*;

public class User {
    public static int _id = 1;
    public int id;
    public String name;

    public User(String name) {
        this.id = _id;
        this.name = name;
        _id++;
    }

    public Project CreateProject(String name, String description,String projectType) {
        if(projectType.equals("NGOMedical")){
            return new NGOMedicalProject(id, name, description, this.id);
        }
        else if(projectType.equals("Education")){
            return new EducationProject(id, name, description, this.id);
        }
        else if(projectType.equals("Environment")){
            return new EnvironmentProject(id, name, description, this.id);
        }
        
        return null;
    }
}
