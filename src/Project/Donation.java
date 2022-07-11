package Project;

public class Donation {
    public String donorName;
    public int donorId;
    public int donationAmount;
    public String donorCurrency;

    public Donation(String donorName,int donorId,int donationAmount,String donorCurrency){
        this.donorName = donorName;
        this.donorId = donorId;
        this.donationAmount = donationAmount;
        this.donorCurrency = donorCurrency;
    }

    @Override
    public String toString(){
        return "Donor Name: "+donorName+" Donation Amount: "+donationAmount+" "+donorCurrency;
    }
}
