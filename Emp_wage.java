import java.util.Random;

public class Emp_wage {
	
		private final String companyName;
		private final int wagePerHr;
		private final int maxWorkingDays;
		private final int maxHr;
		private int totalWageOfMonth;
		
		public Emp_wage(String companyName, int wagePerHr, int maxWorkingDays, int maxHr)
		{
			this.companyName=companyName;
			this.wagePerHr=wagePerHr;
			this.maxWorkingDays=maxWorkingDays;
			this.maxHr=maxHr;
			
		}
        public void calculateEmpWage(){
            Random random = new Random();
            
            //constants
            int FULL_DAY_HR = 8;
            int PART_TIME_HR = 4;
            
            //variables
            int totalWorkingDays = 0;
            int empHr = 0;
            //int totalWageOfMonth = 0;
            int salary=0;
            int totalEmpHr=0;
            
            //Calculation Part
            while (totalWorkingDays <= maxWorkingDays &&  totalEmpHr<= maxHr) {
                totalWorkingDays++;
                int ranNum = random.nextInt(3);

                switch (ranNum) {
                    case 1:
                        empHr = FULL_DAY_HR;
                        break;

                    case 2:
                        empHr = PART_TIME_HR;
                        break;

                    default:
                        empHr = 0;
                        break;
                }
                salary=empHr*wagePerHr;
                totalWageOfMonth += salary;
                
            }          
        }
        
        public String toString() {
        	return "Total employee Wage for the Company: "+companyName+ " is: "+totalWageOfMonth ;
        }
        
        
        public static void main(String args[]){
            Emp_wage dMart=new Emp_wage("dMart",10,25,150);
            Emp_wage Reliance=new Emp_wage("Reliance",20,20,100);
            dMart.calculateEmpWage();
            System.out.println(dMart);
            Reliance.calculateEmpWage();
            System.out.println(Reliance);
            
        }
    }

