package basic;

public class Swiccondition {
String superhero="tamilselvan";
public  void heroguess() {
	switch (superhero) {
	case "minnalmurali": 
		System.out.println("minnalmurali is super hero");
		break;
	case "mugamudi":	
		System.out.println("mugamudi is super hero");
		break;
	default:
		System.out.println(superhero+"sorry i am not about super hero");
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Swiccondition hero=new Swiccondition();
hero.heroguess();
	}

}
