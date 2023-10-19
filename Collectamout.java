package basic;

public class Collectamout {

	 int collectedamount=10000;
	public int collectamountgivetome() {
		System.out.println("collected amount"+collectedamount);
		return collectedamount;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Collectamout myson=new Collectamout();
		int amount=myson.collectamountgivetome();
		System.out.println(amount);
	}

}
