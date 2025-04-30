
public class InheritanceTest {
	    public static void main(String[] args) {
	           // creating object employee of class BasePlusCommisionEmployee
	        BasePlusCommisionEmployee employee = new BasePlusCommisionEmployee("Bob","Lewis","333-333-3333",5000,0.04,300.00);
	        // print employee information by using getters and earnings
	        System.out.println("Employee information obtained by get methods and earnings : \n");
	        System.out.println("First Name           : " + employee.getFirstName());
	        System.out.println("surName              : " + employee.getSurName());
	        System.out.println("socialSecurityNumber : " + employee.getSocialSecurityNumber());
	        System.out.println("Gross Sales          : " + String.format("%.2f", employee.getGrossSales()));
	        System.out.println("commision Rate       : " + String.format("%.2f", employee.getCommisionRate()));
	        System.out.println("Base Salary          : " + String.format("%.2f", employee.getBaseSalary()));
	        System.out.println("Earnings             : " + String.format("%.2f", employee.earnings()));
	        // update a new value of baseSalary
	        employee.setBaseSalary(1000);
	        System.out.println();
	        // print employee information using toString
	        System.out.println("Updated employee information obtained by toString and earnings :\n");
	        System.out.println(employee);
	    }

}
