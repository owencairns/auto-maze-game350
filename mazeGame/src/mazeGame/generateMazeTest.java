package mazeGame;

public class generateMazeTest {
	
	static generateMaze mazeTest = new generateMaze();
	private int [][] test = mazeTest.mazeGen(-13);
	
    private static int [][] test1 = mazeTest.mazeGen(101);
    private static int [][] test2 = mazeTest.mazeGen(100);
    private static int [][] test3 = mazeTest.mazeGen(0);
    private static int [][] test4 = mazeTest.mazeGen(1);
    private static int [][] test5 = mazeTest.mazeGen(-1);
    
	void test_Constructor() {
		for (int i = 0; i < test1.length; i++) { //this equals to the row in our matrix.
	         for (int j = 0; j < test1[i].length; j++) { //this equals to the column in each row.
	            System.out.print(test1[i][j] + " ");
	         }
	         System.out.println(); //change line on console as row comes to end in the matrix.
	    }
		for (int i = 0; i < test2.length; i++) { //this equals to the row in our matrix.
	         for (int j = 0; j < test2[i].length; j++) { //this equals to the column in each row.
	            System.out.print(test2[i][j] + " ");
	         }
	         System.out.println(); //change line on console as row comes to end in the matrix.
	    }
		for (int i = 0; i < test3.length; i++) { //this equals to the row in our matrix.
	         for (int j = 0; j < test3[i].length; j++) { //this equals to the column in each row.
	            System.out.print(test3[i][j] + " ");
	         }
	         System.out.println(); //change line on console as row comes to end in the matrix.
	    }
		for (int i = 0; i < test4.length; i++) { //this equals to the row in our matrix.
	         for (int j = 0; j < test4[i].length; j++) { //this equals to the column in each row.
	            System.out.print(test4[i][j] + " ");
	         }
	         System.out.println(); //change line on console as row comes to end in the matrix.
	    }
		for (int i = 0; i < test5.length; i++) { //this equals to the row in our matrix.
	         for (int j = 0; j < test5[i].length; j++) { //this equals to the column in each row.
	            System.out.print(test5[i][j] + " ");
	         }
	         System.out.println(); //change line on console as row comes to end in the matrix.
	    }
		
	}
	void test_mazeGen() {
		
	}
	void test_wallConstruction() {
		
	}
	void test_mazeConstruction() {
		
	}	
}