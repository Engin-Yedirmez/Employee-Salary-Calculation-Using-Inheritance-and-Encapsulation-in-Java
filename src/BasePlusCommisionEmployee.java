	class BasePlusCommisionEmployee extends CommisionEmployee {
	    private double baseSalary;
	    // parameterized constructor
	    public BasePlusCommisionEmployee(String firstName, String surName, String socialSecurityNumber, double grossSales, double commisionRate, double baseSalary) {
	        // calling the constructor of base class
	       super(firstName,surName,socialSecurityNumber,grossSales,commisionRate);
	       this.baseSalary=baseSalary; // assign values
	    }
	    // set a new baseSalary
	    public void setBaseSalary(double baseSalary){
	        this.baseSalary=baseSalary;
	    }
	    //get baseSalary
	    public double getBaseSalary(){
	        return baseSalary;
	    }
	    // method for earnings  (overriding)
	    public double earnings(){
	        // adding base salary to product of grossSales * commisionRate
	        return this.baseSalary + super.earnings();
	    }
	        // toString method
	    public String toString(){
	        // return values
	        // also calling toString of base class
	        return super.toString() + "base Salary          : " + String.valueOf(String.format("%.2f", baseSalary)) + "\n" +
	        "Earnings             : " + String.valueOf(String.format("%.2f", this.earnings())) + "\n";
	    }

}
