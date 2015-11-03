
import java.util.Scanner;


public class PersonDriver {
	

	public static void main(String[] args) {
		Person person1 = new Person();
		Person person2 = new Person();
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Please enter the name of the first person: ");
		String name1 = keyboard.next();
		person1.setName(name1);
		System.out.println("Please enter the age of the first person: ");
		int age1 = keyboard.nextInt();
		person1.setAge(age1);
		System.out.println("Please enter the name of the second person: ");
		String name2 = keyboard.next();
		person2.setName(name2);
		System.out.println("Please enter the age of the second person: ");
		int age2 = keyboard.nextInt();
		person2.setAge(age2);
		System.out.println(person1.toString());
		System.out.println(person2.toString());
		if ((person1.getName().equals(person2.getName())) && (person1.getAge() == person2.getAge() )){
			System.out.println("The first and second person are the same person.");
		}else{
			System.out.println("These are not the same two people.");
		}
		if (((person1.getName().equals(person2.getName())))){
			System.out.println("These two people have the same name.");
		}
		if ((person1.getAge() == person2.getAge() )) {
			System.out.println(person1.getName() +" and " + person2.getName() +" are the same age");
		}else if ((person1.getAge() > person2.getAge() )){
			System.out.println(person1.getName() +" is older than " + person2.getName() +".");
		}else{
			System.out.println(person2.getName() +" is older than " + person1.getName() +".");
		}
		
	}
	
}
