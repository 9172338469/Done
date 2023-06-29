package EnumTest;


public class Test {

//	public static String c1="RED";
//	public static String c2="BLACK";
//	public static String c3="BLUE";

	enum Color{
		//RED,BLCK,BLUE VARIABLES BYDEFAULT PUBLICT STATIC FINAL
		RED,BLACK,BLUE
	}
	public static void main(String[] args) {
		Color c1=Color.RED;

		System.out.println(c1);
		
		
		Test obj=new Test();
		obj.checkColorUsingEqual(Color.BLACK);
		
		obj.checkColor(Color.RED);
	}
	void checkColorUsingEqual(Color c1){
		
		if(Color.BLUE.equals(c1)){
			System.out.println("Blue Color is Matched");
		}
		else {
			System.out.println("Blue Color is not Matched");
		}
		
	}
	
	void checkColor(Color c){
		
		if(Color.RED ==c){
			System.out.println("RED color is Matched");
		}
		else{
			System.out.println("Color is not matched  ");
						System.out.println("not matched  ");


		}
	}
	
}
