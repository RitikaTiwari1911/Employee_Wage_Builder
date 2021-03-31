import java.util.Random;

public class Emp_wage {

    public static void main(String[] args) {
        {
            Random random = new Random();
            int ranNum = random.nextInt(2);

            if (ranNum == 0) {
                System.out.println("emp absent");
            } else {
                System.out.println("emp present");
            }
        }
    }
}
