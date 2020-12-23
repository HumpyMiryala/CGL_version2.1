import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestJunit{

	@Test
	public void createBoardtest1() {
		conwayBoard a = new conwayBoard();
		a.printboard(false);
		a.createBoard(5);
		System.out.println("--Test case one is passed-- ");
		Assertions.assertSame("created conway board ", a.createBoard(5));
		
	}
	@Test
	public void generateboardtest2() {
		ConwaysGameOfLife c = new ConwaysGameOfLife();
		c.nextGeneration(); 
		System.out.println("--Test case two is passed-- ");
		Assertions.assertSame("next generation board is created.", c.nextGeneration());
		

 }
}
