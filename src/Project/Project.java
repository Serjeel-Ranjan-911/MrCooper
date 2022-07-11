package Project;

import java.util.*;

public class Project {
    public static int _id=1;
    public int id;
    public String name;
    public String description;
    public double fundRaisedAmount;
    public int fundRaiserId;
    public boolean isVerified;
    public ArrayList<String> donorList;

    public Project(String name, String description, int fundRaiserId) {
        this.id = Project._id;
        _id++;
        this.name = name;
        this.description = description;
        this.fundRaiserId = fundRaiserId;
        this.isVerified = false;
        this.donorList = new ArrayList<String>();
    }

    public String getDetails(){
        return "Project ID: " + id + "\n" +
                "Project Name: " + name + "\n" +
                "Project Description: " + description + "\n" +
                "Fund Raiser ID: " + fundRaiserId + "\n" +
                "Is Verified: " + isVerified + "\n" +
                "Donor List: " + donorList;
    }

    public String thankTheDonor(){
        return "Thank you for your donation!";
    }
}
