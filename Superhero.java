package basic;

public class Superhero
{
  String myheroName="Minnal Murali";
  public void superheroguess() {
	  if(myheroName.equals("maveeran")) {
		  System.out.println("you thought about you maveeran");
		  }else if(myheroName.equals("mugamudi")) {
			  System.out.println("you thought about you mugamudi");
		 }else if(myheroName.equals("tamilselvan")) {
			 System.out.println("you thought about you tamilselvan") ;
		 }else {System.out.println("sorry i canot guess");}
  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Superhero hero=new Superhero();
       hero.superheroguess();
	}

}
