public class Multiplecompany {
   public static void company1(int wageperhr,int workingdays,int fulltimehrsperday,int parttimehrsperday) {
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

    public static void company2(int wageperhr,int workingdays,int fulltimehrsperday,int parttimehrsperday) {
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

 public static void company3(int wageperhr,int workingdays,int fulltimehrsperday,int parttimehrsperday) {
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

public static void main(String args[]) {
company1(50,20,8,4);
company2(70,22,10,5);
company3(40,25,6,3);
   }
}

