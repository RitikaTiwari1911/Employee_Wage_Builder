import java.util.Random;
public class Emp_wage {
    public static void main(String args[]) {
        Random random = new Random();
        int ranNum = random.nextInt(3);
        int EMP_IS_PRESENT = 1;
        int PART_TIME=2;
        int PART_TIME_HR=4;
        int WAGE_PER_HR = 20;
        int salary = 0;
        int FULL_DAY_HR = 8;


        if (ranNum == EMP_IS_PRESENT) {
            salary = WAGE_PER_HR * FULL_DAY_HR;
             }
        else if(ranNum==PART_TIME) {
            salary = WAGE_PER_HR * PART_TIME_HR;
        }
        else {
            salary=0;
        }
    System.out.println("salary for the day is " + salary);

        }
    }

