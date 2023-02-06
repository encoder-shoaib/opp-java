// 5. Take four integer values named A, B, C and D. Solve the 
// following equation and print the result. [A=5, B=6, C=7, D=8]
// a) (A * B - C * D)
// b) 2A - B + 3D
// c) A2 + B2- C2 + D2
// d) A3 + B - C2 

import java .util.*;

public class Fifth{
public static void main(String[] args)
{
    // input section 
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter value of A");
    int A= sc.nextInt();

    System.out.println("Enter value of B");
    int B= sc.nextInt();

    System.out.println("Enter value of C");
    int C= sc.nextInt();

    System.out.println("Enter value of D");
    int D= sc.nextInt();

      // Math section
    double sumOfA =A*B-C*D;
    double sumOfB = (2*A)-B+(3*D);
    double A2 = Math.pow(A,2) , A3=Math.pow(A,3), B2=Math.pow(B,2), C2= Math.pow(C,2) , D2=Math.pow(D,2);
    double sumOfC = A2+B2-C2+D2;
    double sumOfD = A3+B-C2;

    // Print section 
    System.out.println("Sum Of A = "+ sumOfA);
    System.out.println("Sum Of B = "+ sumOfB);
    System.out.println("Sum Of C = "+ sumOfC);
    System.out.println("Sum Of D = "+ sumOfD);

}

}