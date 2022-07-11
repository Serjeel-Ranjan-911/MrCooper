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
    public ArrayList<Donation> donorList;

    public Project(String name, String description, int fundRaiserId) {
        this.id = Project._id;
        _id++;
        this.name = name;
        this.description = description;
        this.fundRaiserId = fundRaiserId;
        this.isVerified = false;
        this.donorList = new ArrayList<Donation>();
    }

    public String getDetails(){
        return "Project ID: " + id + "\n" +
                "Project Name: " + name + "\n" +
                "Project Description: " + description + "\n" +
                "Fund Raiser ID: " + fundRaiserId + "\n" +
                "Is Verified: " + isVerified + "\n" +
                "Donor List: " + donorList;
    }

    public boolean acceptDonation(String userName,int userId,int amount,String currency){
        this.fundRaisedAmount += amount;
        this.donorList.add(new Donation(userName, id, amount, currency));
        return true;
    }

    public boolean widthdrawFund(){
        System.out.println("Amount widthdrawn = "+this.fundRaisedAmount);
        this.fundRaisedAmount = 0;
        return true;
    }

    public String thankTheDonor(){
        return "Thank you for your donation!";
    }
}
