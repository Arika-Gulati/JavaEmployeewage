public class Employeewhile {
   public static void main(String args[]) {
        int wageperhr=20;
        int empwage=0;
	int wage20days=0;
	int workinghrs=0;
	int workingdays=0;
	int time=0;
while(workinghrs<=100 && workingdays<=20) {
	int emppresence=(int)Math.floor(Math.random()*10)%3;
        if(emppresence == 1) {
                 time=8;
              }
        else if(emppresence == 2) {
               
                 time=4;
              }

        else {
                time=0;
             }
  workinghrs++;
  workingdays++;
}
	empwage=wageperhr*time;
        System.out.println("wage is "+empwage);
	wage20days=empwage*20;
	System.out.println("wage for month "+wage20days);

   }
}




