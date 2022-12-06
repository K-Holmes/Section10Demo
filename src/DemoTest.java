import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class DemoTest {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Colors c = new Colors();
        Demo d = new Demo();
        d.display();
        System.out.println("What is the outlier value we need to find?");
        int target = sc.nextInt();
        System.out.println("\nOutlier "+c.RED+target+c.RESET+" located at coordinates "+c.CYAN+Arrays.toString(d.linearSearch(d.nums, target))+c.RESET);
        System.out.println("Should we replace it with a random number in range ('"+c.YELLOW+"r"+c.RESET+"') or with a value"+
                " you choose ('"+c.YELLOW+"c"+c.RESET+"') ?");
        String ans = sc.next();
        if (ans.equalsIgnoreCase("c")){
            System.out.println("Please give the new value to be replaced");
            int next = sc.nextInt();
            while (!(next>=0 && next<=101)){
                System.out.println("Not in range, must be between"+c.PURPLE+" 0 "+c.RESET+"and "+c.PURPLE+"100"+c.RESET+" inclusive");
                next=sc.nextInt();
            }
            System.out.println("What are the coordinates? (Type the"+c.CYAN+" CYAN "+c.RESET+"numbers)");
            System.out.println("First coordinate");
            int iCoordinate = sc.nextInt();
            System.out.println("Second coordinate");
            int jCoordinate = sc.nextInt();
            d.nums[iCoordinate][jCoordinate] = next;
            d.display();
        } else if (ans.equalsIgnoreCase("r")){
            Random rn = new Random();
            int replace = rn.nextInt(101);
            System.out.println("What are the coordinates? (Type the"+c.CYAN+" CYAN "+c.RESET+"numbers)");
            System.out.println("First value");
            int iCoordinate = sc.nextInt();
            System.out.println("Second value");
            int jCoordinate = sc.nextInt();
            d.nums[iCoordinate][jCoordinate] = replace;
            d.display();
        } else {
            System.out.println(c.RED+"Invalid, ending system");
        }
    }
}
