import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestJunit{

	@Test
	public void createBoardtest() {
		ConwayBoard a = new ConwayBoard(4,3,false);
		int x[][] = {{0,2},{1,2},{2,1}};
		a.createBoard(x);
		String s = a.printboard(board);
		System.out.println("--Test case one is passed-- ");
		Assertions.assertSame(s,"..*.\n..*.\n.*..");
		
	}
	@Test
	public void generateboardtest() {
		ConwaysGameOfLife c = new ConwaysGameOfLife();
		c.nextGeneration(); 
		System.out.println("--Test case two is passed-- ");
		Assertions.assertSame("next generation board is created.", c.nextGeneration());
		

 }
}
