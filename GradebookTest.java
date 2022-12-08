import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class GradebookTester {

	private GradeBook g1,g2;
	
	@Before
	public void setup () {
		g1 = new GradeBook(4);
		g1.addScore(100);
		g1.addScore(90);
		g1.addScore(80);
		g1.addScore(70);
		
		g2 = new GradeBook(4);
		g2.addScore(85);
		g2.addScore(80);
		g2.addScore(90);
		g2.addScore(65);
	}
	@After
	public void teardown () {
		g1= null;
		g2= null;
	}
	@Test
	public void testAddScore() {
		assertTrue(g1.toString().equals("100.0 90.0 80.0 70.0 "));
		assertTrue(g2.toString().equals("85.0 80.0 90.0 65.0 "));
		
		assertEquals(g1.getScoreSize(),4);
		assertEquals(g2.getScoreSize(),4);
	}
	@Test
	public void testSum() {
		assertEquals(g1.sum(),340.0,.001);
		assertEquals(g2.sum(),320.0,.001);
	}
	@Test
	public void testMinimum() {
		assertTrue(g1.minimum()==70);
		assertTrue(g2.minimum()==65);
	}
	@Test
	public void testfinalScore() {
		assertTrue(g1.finalScore()==270.0);
		assertTrue(g2.finalScore()==255.0);
	}
}
	
	
	
	