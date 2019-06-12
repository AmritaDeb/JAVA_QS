class Animal 
{
	void eat()
	{
		System.out.println("Animal eat food");
	}
}
class Herbivore extends Animal 
{
	void eat()
	{
		System.out.println("Herbivore eat vegitable");
	}
}
class Carnivore extends Animal 
{
	void eat()
	{
		System.out.println("Carnivore eat meat");
	}
}
class Elephant extends Herbivore
{

}
class Lion extends Carnivore
{

}
class World
{
	public static void main(String[] args)
	{
		Elephant e = new Elephant();
		Lion l = new Lion();
		e.eat();
		l.eat();
	}
}