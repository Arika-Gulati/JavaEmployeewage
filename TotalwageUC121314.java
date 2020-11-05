import java.util.*;
class Calculation {
int wageperhr,workingdays,workinghrs;
String companyname;
int totalwage;
Calculation(String companyname,int wageperhr,int workingdays,int workinghrs) {
this.companyname=companyname;
this.wageperhr=wageperhr;
this.workingdays=workingdays;
this.workinghrs=workinghrs;
  }
public int wagecal() {
totalwage=wageperhr*workingdays*workinghrs;
return totalwage;
  }
}


public class TotalwageUC121314 {
public static void main(String args[]) {
Calculation c1=new Calculation("Company1",50,22,8); 

Calculation c2=new Calculation("Company2",70,20,10);

Calculation c3=new Calculation("Company3",100,25,6);

	ArrayList<Calculation>list=new ArrayList<Calculation>();
	list.add(c1);
	list.add(c2);
	list.add(c3);
Iterator itr=list.iterator();
while(itr.hasNext()) {
Calculation ob=(Calculation)itr.next();
System.out.println("Daily wage for "+ob.companyname+" is "+ob.wageperhr);
System.out.println("total wage for "+ob.companyname+" is "+ob.wagecal());
     }
   }
 }




