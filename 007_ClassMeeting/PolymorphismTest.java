public class PolymorphismTest
{
	public static void main(String[] args)
	{
		Animal a = new Animal();
		a.makeSound();

		a = new Dog();
		a.makeSound();

		a = new Cat();
		a.makeSound();
	}
}