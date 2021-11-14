
import java.time.LocalDate;
import java.time.Period;

class Person {
	LocalDate today,birthday;
	int year;

  int getBirthdate()
    {
        today =LocalDate.now();
         birthday=LocalDate.of(1996,12,27);
        year=Period.between(birthday,today).getYears();
	
		return year;
    }
}

class DriversLicense{
    
    boolean isJuniorOperator(Person p)    {
     int years=p.getBirthdate();
     if(years<18)
{
    

 return true;    
 
}
else
{	
     return false;
 }   
         }
}

class BirthDate{
    public static void main(String[] args) {
	int year;
	boolean isyoung =true;
       	Person objp=new Person();
	DriversLicense objd=new DriversLicense();
	
	System.out.print("Person age is : ");
	year=objp.getBirthdate();
	System.out.print(year);
 	System.out.println(" ");
	if(isyoung==objd.isJuniorOperator(objp))
	{
	System.out.println("You are not eligible for Driving License.");
	}
	else
	{	
	System.out.println("Yes you are eligible.");
	} 
}

}
