//4. Find the area of a Circle. [Print 2 digits after decimal point].

import java.util.*;
public class Fourth {
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of circle =");
        int radius  =sc.nextInt();
        double area = radius *radius*3.1416;
        System.out.println("Area="+String.format("%.2f",area));


    }
}
