interface Company {
public void wagecalculation();
}

class Builder implements Company  {
int wageperhr;
int workingdays;
int fulltimehrsperday;
int parttimehrsperday;
   Builder(int wageperhr,int workingdays,int fulltimehrsperday,int parttimehrsperday) {
        this.wageperhr=wageperhr;
        this.workingdays=workingdays;
        this.fulltimehrsperday=fulltimehrsperday;
        this.parttimehrsperday=parttimehrsperday;
        }

public void wagecalculation() {

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

public class Employeebuilderinterface {

public static void main(String args[]) {
System.out.println("COMPANY 1");
Builder c1=new Builder(50,20,8,4);
c1.wagecalculation();

System.out.println("COMPANY 2");
Builder c2=new Builder(70,22,10,5);
c2.wagecalculation();

System.out.println("COMPANY 3");
Builder c3=new Builder(40,25,6,3);
c3.wagecalculation();
   }
}

