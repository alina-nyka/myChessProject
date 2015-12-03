
public class Main {

	public static void main(String[] args) {
		
		System.out.println("LET'S GET IT STARTED!!!");
		System.out.println("+++++++++++++++++++++++++++++++++++");
		
		Board myBoard=new Board();
		myBoard.printBoard();
		System.out.println("your first move:");
		System.out.println("chose a piece that you want to move");
		String piece=InputUtility.input().toUpperCase();
		System.out.println("move to ==>");
		String moveTo=InputUtility.input().toUpperCase();
		
		System.out.println(piece+" "+moveTo);

	}

}
