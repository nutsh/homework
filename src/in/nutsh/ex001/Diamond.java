package in.nutsh.ex001;

public class Diamond {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		for (int y = 8; y > 0; y-=2) {

			for (int z= y; z >0 ; z-=2) {
				System.out.print(" ");
		 }
			for (int x = y; x < 9; x++){
				System.out.print("*") ; 			
     	 }
    	 System.out.print("\n");

	 }
		for (int y = 6; y > 0; y-=2) {


			for (int x = y/2; x < 5; x++){
				System.out.print(" ") ; 			
     	 }
			for (int z= y-1; z >0 ; z--) {
				System.out.print("*");
		 }
    	 System.out.print("\n");

	 }

	}

}
