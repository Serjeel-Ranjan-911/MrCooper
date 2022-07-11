import User.*;
import Project.*;

public class App {
    public static void main(String[] args) throws Exception {

        // creating platform
        FundRaisingPlatform sharkTank = new FundRaisingPlatform("SharkTank");

        // creating users
        Admin admin = new Admin("Admin");

        Donor donor1 = new Donor("Donor1");
        Donor donor2 = new Donor("Donor2");

        FundRaiser fundRaiser = new FundRaiser("FundRaiser");

        // creating projects
        Project project1 = fundRaiser.CreateProject("IOT Project", "smart house", "Education");
        Project project2 = fundRaiser.CreateProject("Green Planet", "planting tress", "Environment");

        sharkTank.addProject(project1);
        sharkTank.addProject(project2);

        // verifying the projects
        admin.verifyProject(project1.id, sharkTank.projects);
        admin.verifyProject(project2.id, sharkTank.projects);

        //donating to projects
        donor1.donateTo(project1.id, 100, "$", sharkTank.projects);
        donor2.donateTo(project1.id, 150, "Rs", sharkTank.projects);

        donor1.donateTo(project2.id, 50, "$", sharkTank.projects);
        donor1.donateTo(project2.id, 100, "Rs", sharkTank.projects);

        // printing projects
        sharkTank.viewAllProjects();

        //widthDrawing money
        fundRaiser.widthdrawFund(project1.id, sharkTank.projects);
        fundRaiser.widthdrawFund(project2.id, sharkTank.projects);
    }
}
