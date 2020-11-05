class Company1  {
int wageperhr;
int workingdays;
int fulltimehrsperday;
int parttimehrsperday;
   Company1(int wageperhr,int workingdays,int fulltimehrsperday,int parttimehrsperday) {
	this.wageperhr=wageperhr;
	this.workingdays=workingdays;
	this.fulltimehrsperday=fulltimehrsperday;
	this.parttimehrsperday=parttimehrsperday;
	}

public void employeebuilder1() {

        int empwage=0;
        int emppresence=(int)Math.floor(Math.random()*10)%3;
        System.out.println(emppresence);
switch(emppresence) {
        case 1:
                System.out.println("Employee is present for full time");
                  empwage=wageperhr*workingdays*fulltimehrsperday;
                  System.out.println("wage is "+empwage);

        break;
        case 2:
                System.out.println("Employee is present for part time");
                  empwage=wageperhr*workingdays*parttimehrsperday;
                  System.out.println("wage is "+empwage);

        break;

        default:
                System.out.println("Employee is absent");
                int absenthrs=0;
                 empwage=wageperhr*workingdays*absenthrs;
                 System.out.println("wage is "+empwage);

     }
  }

}

class Company2 {
int wageperhr;
int workingdays;
int fulltimehrsperday;
int parttimehrsperday;

     Company2(int wageperhr,int workingdays,int fulltimehrsperday,int parttimehrsperday) {
	this.wageperhr=wageperhr;
        this.workingdays=workingdays;
        this.fulltimehrsperday=fulltimehrsperday;
        this.parttimehrsperday=parttimehrsperday;
        }
public void employeebuilder2() {
        int empwage=0;
        int emppresence=(int)Math.floor(Math.random()*10)%3;
        System.out.println(emppresence);
switch(emppresence) {
        case 1:
                System.out.println("Employee is present for full time");
                  empwage=wageperhr*workingdays*fulltimehrsperday;
                  System.out.println("wage is "+empwage);

        break;
        case 2:
                System.out.println("Employee is present for part time");
                  empwage=wageperhr*workingdays*parttimehrsperday;
                  System.out.println("wage is "+empwage);

        break;

        default:
                System.out.println("Employee is absent");
                int absenthrs=0;
                 empwage=wageperhr*workingdays*absenthrs;
                 System.out.println("wage is "+empwage);
      }
   }
}

class Company3 {
int wageperhr;
int workingdays;
int fulltimehrsperday;
int parttimehrsperday;

     Company3(int wageperhr,int workingdays,int fulltimehrsperday,int parttimehrsperday) {
        this.wageperhr=wageperhr;
        this.workingdays=workingdays;
        this.fulltimehrsperday=fulltimehrsperday;
        this.parttimehrsperday=parttimehrsperday;
        }
public void employeebuilder3() {
        int empwage=0;
        int emppresence=(int)Math.floor(Math.random()*10)%3;
        System.out.println(emppresence);
switch(emppresence) {
        case 1:
                System.out.println("Employee is present for full time");
                  empwage=wageperhr*workingdays*fulltimehrsperday;
                  System.out.println("wage is "+empwage);

        break;
        case 2:
                System.out.println("Employee is present for part time");
                  empwage=wageperhr*workingdays*parttimehrsperday;
                  System.out.println("wage is "+empwage);

        break;

        default:
                System.out.println("Employee is absent");
                int absenthrs=0;
                 empwage=wageperhr*workingdays*absenthrs;
                 System.out.println("wage is "+empwage);

     }
   }
}

public class EmployeebuilderUC9 {

public static void main(String args[]) {
System.out.println("COMPANY 1");
Company1 c1=new Company1(50,20,8,4);
c1.employeebuilder1();

System.out.println("COMPANY 2");
Company2 c2=new Company2(70,22,10,5);
c2.employeebuilder2();

System.out.println("COMPANY 3");
Company3 c3=new Company3(40,25,6,3);
c3.employeebuilder3();
   }
}
