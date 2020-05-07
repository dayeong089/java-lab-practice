
public class Animal{
	
}

abstract class Mammal extends Animal{
	public abstract String bark();
	public abstract String getFood();
}

abstract class Reptile extends Animal{
	public abstract String getFood();
}

final class Cat extends Mammal
{
	String name;
	float weight;
	String nameSlave;
	//
	Cat(String name, float weight, String nameSlave)
	{
		this.name = name;
		this.weight = weight;
		this.nameSlave = nameSlave;
	}
	//
	String getName()
	{
		return name;
	}
	void setName(String name)
	{
		this.name = name;
	}
	float getWeight()
	{
		return weight;
	}
	void setWeight(float weight)
	{
		this.weight = weight;
	}
	String getNameSlave()
	{
		return nameSlave;
	}
	void setNameSlave(String nameSlave)
	{
		this.nameSlave = nameSlave;
	}
	//
	public String bark()
	{
		String bark1 = "Meow";
		System.out.println(bark1);
		return bark1;
	}
	
	public String getFood()
	{
		String food1 = "Fish";
		System.out.println(food1);
		return food1;
	}
}

final class Dog extends Mammal
{
	String name;
	float weight;
	String nameMaster;
	//
	Dog(String name, float weight, String nameMaster)
	{
		this.name = name;
		this.weight = weight;
		this.nameMaster = nameMaster;
	}
	//
	String getName()
	{
		return name;
	}
	void setName(String name)
	{
		this.name = name;
	}
	float getWeight()
	{
		return weight;
	}
	void setWeight(float weight)
	{
		this.weight = weight;
	}
	String getNameMaster()
	{
		return nameMaster;
	}
	void setNameMaster(String nameMaster)
	{
		this.nameMaster = nameMaster;
	}
	//
	public String bark()
	{
		String bark2 = "Bowbow";
		System.out.println(bark2);
		return bark2;
	}
	
	public String getFood()
	{
		String food2 = "Apple";
		System.out.println(food2);
		return food2;
	}
} 

final class Crocodile extends Reptile
{
	String name;
	float weight;
	//
	Crocodile(String name, float weight)
	{
		this.name = name;
		this.weight = weight;
	}
	//
	String getName()
	{
		return name;
	}
	void setName(String name)
	{
		this.name = name;
	}
	float getWeight()
	{
		return weight;
	}
	void setWeight(float weight)
	{
		this.weight = weight;
	}
	//
	public String getFood()
	{
		String food3 = "Meat";
		System.out.println(food3);
		return food3;
	}
}

class Ass5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Cat cat1 = new Cat("cat1",23,"ab");
		cat1.getFood();
		cat1.bark();
		
		cat1.getName();
		cat1.setName("cat2");
		cat1.getName();
		
		cat1.getNameSlave();
		cat1.setNameSlave("cd");
		cat1.getNameSlave();
		
		cat1.getWeight();
		cat1.setWeight(25);
		cat1.getWeight();
	}

}
