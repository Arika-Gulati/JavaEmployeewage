public class Employeepart {
   public static void main(String args[]) {
        double emppresence=Math.floor(Math.random()*10)%3;
        System.out.println(emppresence);
        int wageperhr=20;
        int empwage=0;
        if(emppresence == 1) {
                System.out.println("Employee is present for full time");
                int time=8;
                empwage=wageperhr*time;
                System.out.println("wage is "+empwage);
        }
	else if(emppresence == 2) {
                System.out.println("Employee is present for part time");
                int time=4;
                empwage=wageperhr*time;
                System.out.println("wage is "+empwage);
	}

        else {
                System.out.println("Employee is absent");
		int time=0;
                empwage=wageperhr*time;
                System.out.println("wage is "+empwage);

        }
   }
}


