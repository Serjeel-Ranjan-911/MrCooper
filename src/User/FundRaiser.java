package User;

import java.util.*;
import Project.*;

public class FundRaiser extends User {

    public FundRaiser(String name) {
        super(name);
    }

    public void widthdrawFund(int projectId, ArrayList<Project> projects) {
        for (Project project : projects) {
            if (project.id == projectId && this.id == project.fundRaiserId) {
                if (project.widthdrawFund())
                    System.out.println("Your ammount was successfully widthdrawn");
            }
        }
    }
}
