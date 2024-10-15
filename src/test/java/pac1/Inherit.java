package pac1;
 
class Person
{
	private String name;
	private float age;

public Person(String name,float age)
{
	this.name = name;
	this.age = age;
}
public String getName()
{
	return name;
}
public void setName(String name)
{
	this.name = name;
}
public float getAge()
{
	return age;
}
public void setAge(float age)
{
	this.age=age;
}
public String toString()
{
	return "Person[name:"+name+ ",age=" +age + "]";
}
}

class Account
{
	private long accNum;
    private double balance;
    private Person accHolder;
    private static long accCounter = 1000;








public static void main(String[] args) {
	
}

 
