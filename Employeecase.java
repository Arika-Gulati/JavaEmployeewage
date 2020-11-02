public class Employeecase {
   public static void main(String args[]) {
        int emppresence=(int)Math.floor(Math.random()*10)%3;
        System.out.println(emppresence);
        int wageperhr=20;
        int empwage=0;
	int time=0;
switch(emppresence) {
        case 1:
                System.out.println("Employee is present for full time");
                 time=8;
        break;
        case 2: 
                System.out.println("Employee is present for part time");
                 time=4;
        break;

        default:
                System.out.println("Employee is absent");
                time=0;
  }
 empwage=wageperhr*time;
 System.out.println("wage is "+empwage);

   }
}



