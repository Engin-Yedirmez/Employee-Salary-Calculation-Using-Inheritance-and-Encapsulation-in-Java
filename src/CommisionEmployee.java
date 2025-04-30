
public class CommisionEmployee {
	private String firstName;
	private String surName;
	private String socialSecurityNumber;
	private double grossSales;
    private double commisionRate;
    
    // parameterized constructor
    public  CommisionEmployee(String firstName, String surName, String socialSecurityNumber, double grossSales, double commisionRate){
    	// controlling if grossSales is > 0 and commisionRate >0 and  < 1
    	if(grossSales >=0 && (commisionRate > 0 && commisionRate < 1))
        {
            // assigning values
            this.firstName = firstName;
            this.surName = surName;
            this.socialSecurityNumber = socialSecurityNumber;
            this.grossSales = grossSales;
            this.commisionRate = commisionRate;
        }
    	else
            // terminate the program
            System.exit(0);
        }
    // set a new firstName	
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    // set a new sureName
    public void setSurName(String surName){
        this.surName = surName;
    }
    // set a new socialSecurityNumber
    public void setSocialSecurityNumber(String socialSecurityNumber){
        this.socialSecurityNumber = socialSecurityNumber;
    }
    public void setGrossSales(double grossSales){
        // controlling condition  is grossSales > 0
        if(grossSales >=0)
         // assign value
         this.grossSales=grossSales;
        else
         // print output
          System.out.println("Sorry! Invalid Value...");
        
    }
    // set a new commisionRate
    public void setCommisionRate(double commisionRate){
        // controlling if commisionRate > 0 and  < 1
        if(commisionRate > 0 && commisionRate < 1)
         // assign value
         this.commisionRate=commisionRate; 
         else
         // print output
         System.out.println("Sorry! Invalid Value...");
    }
    // get getFirstName
    public String getFirstName(){
        return firstName;
    }
    // getter surName
    public String getSurName(){
        return surName;
    }
    // get socialSecurityNumber
    public String getSocialSecurityNumber(){
        return socialSecurityNumber;
    }
    // get grossSales
    public double getGrossSales(){
        return grossSales;
    }
    // get commisionRate
    public double getCommisionRate(){
        return commisionRate;
    }
    // method for earnings
    public double earnings(){
        // calculating and returning value
        return grossSales * commisionRate;
    }
    // toString method
    public String toString(){
        // return values
        return  "First Name           : " + firstName + "\n" +
                "surName              : " + surName + "\n" +
                "socialSecurityNumber : " + socialSecurityNumber + "\n" +
                "gross Sales          : " + String.valueOf(String.format("%.2f", grossSales)) +"\n" +
                "commision Rate       : " + String.valueOf(String.format("%.2f", commisionRate)) + "\n";
    }

}
