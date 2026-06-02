package practice5;

class Emplo {
	
	String name;
	int age;
	
	String getName() {
		return name;
	}
	
	int getAge() {
		return age;
	}
	
	void setEmplo(String n, int a) {
		name = n;
		age = a;
	}
}
	
 public class Practice_07 {											
	  
	  public static void main(String[] args)
		{
		  
		  Emplo emp = new Emplo(); 
		  
		  emp.setEmplo("田中", 27);
		  
		  String name = emp.getName();
		  int age = emp.getAge();
		  
		  System.out.println("社員名:" + name );
		  System.out.println("年齢:" + age );
		}
}