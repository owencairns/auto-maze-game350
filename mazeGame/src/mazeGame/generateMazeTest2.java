/**
 * 
 */
package mazeGame;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * @author Alex Desktop
 *
 */
class generateMazeTest2 {
	static generateMaze mazeTest = new generateMaze();
	/**
	 * @throws java.lang.Exception
	 */
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeEach
	void setUp() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testWallGen() {
		int[][] wall3 = new int[100][100];
		mazeTest.wallConstruction(wall3, 100);
		for (int i = 0; i < 100; i++)
        {
            assertTrue(wall3[0][i] == 1);
        }
		for (int i = 0; i < 100; i++)
        {
			assertTrue(wall3[100 - 1][i] == 1);
        }
		//left
		for (int i = 0; i < 100; i++)
        {
			assertTrue(wall3[i][0] == 1);
        }
		//right
		for (int i = 0; i < 100; i++)
        {
			assertTrue(wall3[i][100 - 1] == 1);
        }
		int[][] wall2 = new int[0][0];
		mazeTest.wallConstruction(wall2, 0);
		for (int i = 0; i < 0; i++)
        {
            assertTrue(wall2[0][i] == 1);
        }
		for (int i = 0; i < 0; i++)
        {
			assertTrue(wall2[0 - 1][i] == 1);
        }
		//left
		for (int i = 0; i < 0; i++)
        {
			assertTrue(wall2[i][0] == 1);
        }
		//right
		for (int i = 0; i < 0; i++)
        {
			assertTrue(wall2[i][0 - 1] == 1);
        }
		//because mazes are random, we cant verify what they will look like
		//we can only verify that they can generate, and that mazes that are
		//too small will throw errors
		int[][] wall4 = new int[100][100];
		int[][] wall5 = new int[0][0];
		
		mazeTest.mazeConstruction(wall4, 100);
		try {
			mazeTest.mazeConstruction(wall5, 0);
		}
		catch(Exception e) {
			System.out.println("small maze caught");
		}
		
		mazeTest.mazeGen(100);
		try {
			mazeTest.mazeGen(0);
		}
		catch(Exception e) {
			System.out.println("small maze caught");
		}
		
	}

}
