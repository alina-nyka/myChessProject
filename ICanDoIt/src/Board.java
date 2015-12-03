
public class Board {

	Object [][] myBoard=new Object[][]{
		{new Rock(false),new Knight(false),new Bishop(false),new Queen(false),new King(false),new Bishop(false),new Knight(false),new Rock(false)},
		{new Pawn(false),new Pawn(false),new Pawn(false),new Pawn(false),new Pawn(false),new Pawn(false),new Pawn(false),new Pawn(false)},
		{"|  |","|  |","|  |","|  |","|  |","|  |","|  |","|  |"},
		{"|  |","|  |","|  |","|  |","|  |","|  |","|  |","|  |"},
		{"|  |","|  |","|  |","|  |","|  |","|  |","|  |","|  |"},
		{"|  |","|  |","|  |","|  |","|  |","|  |","|  |","|  |"},
		{new Pawn(true),new Pawn(true),new Pawn(true),new Pawn(true),new Pawn(true),new Pawn(true),new Pawn(true),new Pawn(true)},
		{new Rock(true),new Knight(true),new Bishop(true),new Queen(true),new King(true),new Bishop(true),new Knight(true),new Rock(true)},
	};
	
	
	
	
	public void printBoard(){
		
		String letterRow="   A   B   C   D   E   F   H   G";
		System.out.println(letterRow);
		for(int i=0; i<myBoard.length;i++){
			for(int j=0; j<myBoard[i].length;j++){
				
				if(j==0)
					System.out.print(i+1+" ");
					if(j==myBoard.length-1)
						System.out.print(myBoard[i][j]+" "+(i+1));
					else 
						System.out.print(myBoard[i][j]);
					
			}
		System.out.println();
		}
		System.out.println(letterRow);
	}
}
