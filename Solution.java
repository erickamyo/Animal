import java.util.Locale;
import java.util.ResourceBundle;

class Animal {
	void walk(){
		System.out.println("I am walking");
	}
}

class Bird extends Animal {
	String fly() {
		String aStr = "I am flying";
		return aStr;
	}

	//Question 1. implement the sing() method
	String sing(){
		String aStr = "I am singing";
		return aStr;
	}
}

//Question2. implement Duck
class Duck extends Bird {
	String swim(){
		String aStr = "I am swimming";
		return aStr;
	}

	@Override
	String sing(){
		String aStr = "Quack, quack";
		return aStr;
	}
}

//Question2. implement Chicken
class Chicken extends Animal {
	String sing(){
		String aStr = "Cluck, cluck";
		return aStr;
	}

}

//Question3. rooster is a chicken
class Rooster{
	Chicken aChic=new Chicken();

	void walk(){
		aChic.walk();

	}

	String sing(){
		String aStr="Cock-a-doodle-doo";
		return aStr;
	}

}



//Question 4. Parrot that imitates the sounds from neighobour
interface Thing {
	public String sound();
}

class Parrot{

	String sing(Thing thing){
		return thing.sound();
	}
}

class Dog implements Thing{

	public String sound(){
		String aStr = "Woof, woof";
		return aStr;
	}
}

class Cat implements Thing{
	public String sound(){
		String aStr = "Meow";
		return aStr;
	}
}

class RoosterB extends Rooster implements Thing {
	public String sound(){
		return sing();
	}
}




	//Question B. 1.
	class Fish{
		protected String size;
		protected String color;

		String swim(){
			String aStr = "I am swimming";
			return aStr;
		}

		void setSize(String ss){
			size=ss;
		}

		String getSize(){
			return size;
		}


		void setColor(String ss){
			color=ss;
		}

		String getColor(){
			return color;
		}
	}


	//Question B. 2.
	class Shark extends Fish{
		Shark(){
			super.size="large";
			super.color="grey";
		}


		void eat(){
			System.out.println("Shark eats others fishes !! ");
		}
	}

	//Question B. 2.
	class ClownFish extends Fish{
		ClownFish(){
			super.size="small";
			super.color="orange";
		}

		void joke(){
			System.out.println("Clownfish makes joke !! ");
		}

	}

	//Question B.3
	class Dolphin {
		Fish aFish= new Fish();

		void swim(){
			aFish.swim();
		}

	}


	//Question D . 1 and 2.
	abstract class ButterflyLifeCycle{

		abstract boolean canFly();
		abstract boolean canWalk();
	}

	class Caterpillar extends ButterflyLifeCycle{

		boolean canWalk(){
			return true;
		}


		boolean canFly(){
			return false;
		}

	}


	class Butterfly extends ButterflyLifeCycle{

		boolean canFly(){
			return true;
		}


		boolean canWalk(){
			return false;   //my assumption: butterfly cannot walk.
		}
	}



	public class Solution {
		public static void main(String[] args) {
			Bird bird = new Bird();
			bird.walk();
			bird.fly();
			bird.sing();


			//Question 4. continued
			Parrot aParrot = new Parrot();
			System.out.println(aParrot.sing(new Dog()));	//a parrot stays with dogs at home
			System.out.println(aParrot.sing(new Cat()));	//a parrot stays with cat at home
			System.out.println(aParrot.sing(new RoosterB())); //a prrot stays with rooster on farm


		}


		//Question E , number 1
		void count() {

			int numOfFlyAnimals=0;
			int numOfWalkAnimals=0;
			int numOfSingAnimals=0;
			int numOfSwimAnimals=0;

			Object[] animals = new Object[] {
				new Bird(),
				new Duck(),
				new Chicken(),
				new Rooster(),
				new Parrot(),
				new Fish(),
				new Shark(),
				new Dolphin(),
				new Dog(),
				new Cat(),
				new Butterfly()

			};

		  for (Object obj: animals) {

			  if (obj instanceof Animal) {
				  numOfWalkAnimals++;
			  }

			  if (obj instanceof Bird) {
				  numOfFlyAnimals++;
			  }

			  if ((obj instanceof Bird) || (obj instanceof Chicken) || (obj instanceof Rooster))  {
				  numOfSingAnimals++;
			  }

			  if ((obj instanceof Fish) || (obj instanceof Duck) || (obj instanceof Dolphin))  {
				  numOfSwimAnimals ++;
			  }

		  }



		}
	}

	//Bonus question 1.
	//rooster is a chicken
	class RoosterInter{

		Locale englishLocale = new Locale("en", "us");
        ResourceBundle engMessages = ResourceBundle.getBundle("MessagesBundle", englishLocale);

		Locale frenchLocale = new Locale("Fr", "FR");
        ResourceBundle frenchMessages = ResourceBundle.getBundle("MessagesBundle", englishLocale);


		Chicken aChic=new Chicken();

		void walk(){
			aChic.walk();

		}

		void sing(){

			System.out.println(engMessages.getString("singText")); // in english
			System.out.println(frenchMessages.getString("singText")); // in French
		}

	}

////Bonus question 2.

/*
RestfulAPI Design

GET /myapp/animals

Response attributes

* animalName: String
* canWalk: Boolean
* canSing: Boolean
* canFly: Boolean
* canSwim: Boolean
* singAs: String


*/






