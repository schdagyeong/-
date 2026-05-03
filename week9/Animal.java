interface Animal{
	abstract void makeSound();
}

class Dog implements Animal
{
	
	public void makeSound() 
	{
		System.out.println("멍멍\n");
	}
}

class Cat implements Animal
{
	@Override
	public
	void makeSound() 
	{
		System.out.println("야옹\n");
	}
}

class Bird implements Animal
{
	@Override
	public
	
	void makeSound() 
	{
		System.out.println("짹쨱\n");
	}
}
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal dog =  new Dog();
		dog.makeSound();
		
		Animal cat =  new Cat();
		cat.makeSound();
		
		Animal bird =  new Bird();
		bird.makeSound();
	}
}
