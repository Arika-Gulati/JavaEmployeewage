import java.util.Scanner;
 public class EmployeebuilderarrayUC10 {

public void employeebuilder1() {
int n=4;
Scanner s=new Scanner(System.in);
System.out.println("Enter wageperhr,workingdays,fulltimehrsperday,parttimehrsperday through array ");
int array1[]=new int[n];
for(int i=0;i<n;i++) {
     array1[i]=s.nextInt();
     }
System.out.println("Array elements for company1 are ");
for(int j=0;j<n;j++) {
System.out.println(array1[j]);
   }
	int empwage;
        int emppresence=(int)Math.floor(Math.random()*10)%3;
        System.out.println("\n"+emppresence);
switch(emppresence) {
        case 1:
                System.out.println("Employee is present for full time");
                   empwage=array1[0]*array1[1]*array1[2];
                  System.out.println("wage is "+empwage);

        break;
        case 2:
                System.out.println("Employee is present for part time");
                   empwage=array1[0]*array1[1]*array1[3];
                  System.out.println("wage is "+empwage);

        break;

        default:
                System.out.println("Employee is absent");
                int absenthrs=0;
                  empwage=array1[0]*array1[1]*absenthrs;
                 System.out.println("wage is "+empwage);

     }
  }
public void employeebuilder2() {
int n=4;
Scanner s=new Scanner(System.in);
System.out.println("Enter wageperhr,workingdays,fulltimehrsperday,parttimehrsperday through array ");
int array2[]=new int[n];
for(int i=0;i<n;i++) {
     array2[i]=s.nextInt();
     }
System.out.println("Array elements for company1 are ");
for(int j=0;j<n;j++) {
System.out.println(array2[j]);
   }
        int empwage;
        int emppresence=(int)Math.floor(Math.random()*10)%3;
        System.out.println("\n"+emppresence);
switch(emppresence) {
        case 1:
                System.out.println("Employee is present for full time");
                   empwage=array2[0]*array2[1]*array2[2];
                  System.out.println("wage is "+empwage);

        break;
        case 2:
                System.out.println("Employee is present for part time");
                   empwage=array2[0]*array2[1]*array2[3];
                  System.out.println("wage is "+empwage);

        break;

        default:
                System.out.println("Employee is absent");
                int absenthrs=0;
                  empwage=array2[0]*array2[1]*absenthrs;
                 System.out.println("wage is "+empwage);

     }
  }

public void employeebuilder3() {
int n=4;
Scanner s=new Scanner(System.in);
System.out.println("Enter wageperhr,workingdays,fulltimehrsperday,parttimehrsperday through array ");
int array3[]=new int[n];
for(int i=0;i<n;i++) {
     array3[i]=s.nextInt();
     }
System.out.println("Array elements for company1 are ");
for(int j=0;j<n;j++) {
System.out.println(array3[j]);
   }
        int empwage;
        int emppresence=(int)Math.floor(Math.random()*10)%3;
        System.out.println("\n"+emppresence);
switch(emppresence) {
        case 1:
                System.out.println("Employee is present for full time");
                   empwage=array3[0]*array3[1]*array3[2];
                  System.out.println("wage is "+empwage);

        break;
        case 2:
                System.out.println("Employee is present for part time");
                   empwage=array3[0]*array3[1]*array3[3];
                  System.out.println("wage is "+empwage);

        break;

        default:
                System.out.println("Employee is absent");
                int absenthrs=0;
                  empwage=array3[0]*array3[1]*absenthrs;
                 System.out.println("wage is "+empwage);

     }
  }



public static void main(String args[]) {
System.out.println("COMPANY 1");
EmployeebuilderarrayUC10 c1=new EmployeebuilderarrayUC10();
c1.employeebuilder1();
System.out.println("\n"+"COMPANY 2");
c1.employeebuilder2();
System.out.println("\n"+"COMPANY 3");
c1.employeebuilder3();
   }
}

