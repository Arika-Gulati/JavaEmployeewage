public class Employeepresence {
   public static void main(String args[]) {
	double emppresence=Math.floor(Math.random()*10)%2;
	System.out.println(emppresence);
	if(emppresence == 1) {
		System.out.println("Employee is present");
	}
	else {
		System.out.println("Employee is absent");
	}
   }
}
