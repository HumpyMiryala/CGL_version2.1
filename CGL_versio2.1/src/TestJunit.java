import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestJunit{

	@Test
	public void createBoardtest() {
		ConwayBoard b = new ConwayBoard();
		int x[][] = {{0,2},{1,2},{2,1}};
		System.out.println("--Test case one is passed-- ");
		Assertions.assertEquals(null,b.createBoard(-10));
		
	}
	@Test
	public void generateboardtest1() {
		ConwaysGameOfLife c = new ConwaysGameOfLife(); 
		System.out.println("--Test case two is passed-- ");
		Assertions.assertEquals("..........\n...**.....\n...**.....\n..........\n..........\n..***.....\n..**......\n...**.....\n..........\n..........\n", ((ConwaysGameOfLife)c).nextGeneration(c.createBoard(10),1));
	 }
	@Test
	public void generateboardtest2() {
		ConwaysGameOfLife c = new ConwaysGameOfLife(); 
		System.out.println("--Test case three is passed-- ");
		Assertions.assertEquals("..........\n...**.....\n...**.....\n..........\n...**.....\n....*.....\n..*.**....\n...***....\n....**....\n..........\n", ((ConwaysGameOfLife)c).nextGeneration(c.createBoard(10),2));
	 }
	@Test
	public void generateboardtest3() {
		ConwaysGameOfLife c = new ConwaysGameOfLife(); 
		System.out.println("--Test case four is passed-- ");
		Assertions.assertEquals("it can't be performed.",((ConwaysGameOfLife)c).nextGeneration(c.createBoard(10), -3));
}
}