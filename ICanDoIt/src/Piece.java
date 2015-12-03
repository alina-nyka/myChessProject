
public class Piece {

	protected String name;
	protected boolean white;
	
	public Piece(boolean white)
	{
		this.white=white;
	}
	
	public String toString(){
		return "|"+(white?name+"W":name+"B")+"|";
	}
	
}
