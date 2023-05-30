class Animal {
	String name;
	
	void setName(String name) {
		this.name = name;
	}
}

interface Predator {
	String getFood();
}

interface Barkable {
	void bark();
}

class Tiger extends Animal implements Predator, Barkable {
	public String getFood() {
		return "apple";
	}
	
	public void bark() {
		System.out.println("으르렁");
	}
}

class Lion extends Animal implements Predator, Barkable {
	public String getFood() {
		return "banana";
	}
	public void bark() {
		System.out.println("어흥");
	}
}

class Croco extends Animal implements Predator, Barkable {
	public String getFood() {
		return "carrot";
	}
	public void bark() {
		System.out.println("쩝쩝");
	}
}

class Leopard extends Animal implements Predator, Barkable {
	public String getFood() {
		return "rabbit";
	}
	public void bark() {
		System.out.println("크헝");
	}
}

class ZooKeeper {
	void feed(Predator predator) {
		System.out.println("feed " +  predator.getFood());
	}
}

class Bouncer {
	void barkAnimal(Barkable animal) {
		animal.bark();
	}
}

public class Exam_02 {
	public static void main(String[] args) {
		ZooKeeper zooKeeper = new ZooKeeper();
		Tiger tiger = new Tiger();
		Lion lion = new Lion();
		zooKeeper.feed(tiger);
		zooKeeper.feed(lion);
		
		Bouncer bouncer = new Bouncer();
		bouncer.barkAnimal(lion);
		bouncer.barkAnimal(tiger);
	}
}
