public class practicefile {
	
	public static void main(String[] arge) {
		
		int score=89;
		
		switch (score/10) {
			case 10 :
			case 9 :
				System.out.println("A");
				break;
			case 8 :
				System.out.println("B");
				break;
			case 7 :
				System.out.println("C");
				break;
			default :
				System.out.println("D");
			
				
		}
		//2
		char a=65;


		System.out.println((score/10==10) ?(char) (a):((score/10>=7) ? (char)(a+(10-(score/10+1))) : "D"));

	}
}
