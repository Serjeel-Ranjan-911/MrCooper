import User.*;

public class App {
    public static void main(String[] args) throws Exception {

        // creating platform
        FundRaisingPlatform sharkTank = new FundRaisingPlatform("SharkTank");

        // creating users
        User admin = new Admin("Admin");

        User donor1 = new Donors("Donor1");
        User donor2 = new Donors("Donor2");

        User fundRaiser = new FundRaisers("FundRaiser");

        // creating projects
        sharkTank.addProject(fundRaiser.CreateProject("IOT Project", "smart house", "Education"));
        sharkTank.addProject(fundRaiser.CreateProject("Green Planet", "planting tress", "Environment"));
    }
}
