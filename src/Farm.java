import java.util.ArrayList;

public class Farm {
public static void main(String[] args) {
	ArrayList<Animal > farm = new ArrayList<Animal>();
	Animal one = new Cat();
	Animal two = new Dog();
	Animal three = new Pig();
	Animal four = new Cow();
	Animal five = new Cat();
	Animal Six = new Dog();
	farm.add(one);
	farm.add(two);
	farm.add(three);
	farm.add(four);
	farm.add(five);
	farm.add(Six);
	for (int i = 0; i <farm.size(); i++) {
		farm.get(i).makeNoise(true);
		farm.get(i).livesInFarm(true);
	}
	
}
}
