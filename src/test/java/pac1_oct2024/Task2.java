package pac1_oct2024;
class Person
{
	String Firstname;
	String Lastname;
	String gender;
	int age;
	double weight;
  
	public Person(String First_name,String Lastname,String gender,int age,double weight)
	{
		this.Firstname = First_name;
		this.Lastname =Lastname;
		this.gender = gender;
		this.age = age;
		this.weight = weight;	
	}

public void Print()
{
	System.out.println("Firstname is " + Firstname );
	System.out.println("Lastname is " + Lastname );
	System.out.println("Gender is " + gender );
	System.out.println("Age is " + age );
	System.out.println("Weight is " + weight );

}
}
public class Task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Person person = new Person("Sachin","Jha","M",22,83);
		 person.Print();
		

	}

}
