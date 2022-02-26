package mazeGame;

import java.util.Random;

public class generateMaze {
//	static int LEVEL_WIDTH = 20;
//	static int LEVEL_HEIGHT = 20;
	public static void main(String[] args) {
		int[][]printDemo = mazeGen(9);
		
		for (int i = 0; i < printDemo.length; i++) { //this equals to the row in our matrix.
	         for (int j = 0; j < printDemo[i].length; j++) { //this equals to the column in each row.
	            System.out.print(printDemo[i][j] + " ");
	         }
	         System.out.println(); //change line on console as row comes to end in the matrix.
	     }
		
	}
	//generates the maze based on https://en.wikipedia.org/wiki/Maze_generation_algorithm
	public static int[][] mazeGen(int mapSize) {
		//this is our maze map to be
		int[][] mazeMap = new int[mapSize][mapSize];
		
		wallConstruction(mazeMap, mapSize);
		mazeConstruction(mazeMap, mapSize);
		int i = 0;
		while (i < 1) {
			if (mazeMap[mapSize -3][mapSize -2] == 1 && mazeMap[mapSize - 2][mapSize - 3] == 1) {
				wallConstruction(mazeMap, mapSize);
				mazeConstruction(mazeMap, mapSize);
			} else {
				i++;
			}
		}
//		i = 0;
//		while (i < 1) {
//			if (mazeMap[3][2] == 1 || mazeMap[2][3] == 1) {
//				wallConstruction(mazeMap, mapSize);
//				mazeConstruction(mazeMap, mapSize);
//			} else {
//				i++;
//			}
//		}
		return mazeMap;
	}
	
	private static void wallConstruction(int[][] mazeMap, int mapSize) {
		//put walls around entire maze
		//walls are 1, walkable tiles are 0
		//bottom
		for (int i = 0; i < mapSize; i++)
        {
            mazeMap[0][i] = 1;
        }
		//top
		for (int i = 0; i < mapSize; i++)
        {
            mazeMap[mapSize - 1][i] = 1;
        }
		//left
		for (int i = 0; i < mapSize; i++)
        {
            mazeMap[i][0] = 1;
        }
		//right
		for (int i = 0; i < mapSize; i++)
        {
            mazeMap[i][mapSize - 1] = 1;
        }
	}
	private static void mazeConstruction(int[][] mazeMap, int mapSize) {
		
		for (int i = 0; i < mapSize; i+=2) {
			//draw wall horizontally
			for (int x = 0; x < mapSize; x++)
	        {
	            mazeMap[x][i] = 1;
	        }
			//draw wall vertically
			for (int y = 0; y < mapSize; y++)
	        {
	            mazeMap[i][y] = 1;
	            //poke hole vertically
				for (int j = 0; j <= 1;) {
					Random rand = new Random();
					int potHole = (int) rand.nextInt(mapSize);
					if ((potHole % 1) == 0) {
						mazeMap[potHole][y] = 0;
						j++;
					}
				}
	        }
		}
		//poke holes horizontally
		for (int j = 0; j < 1;) {
			Random rand = new Random();
			int potHole = (int) rand.nextInt(mapSize-2) + 1;
			if ((potHole % 1) == 0) {
				mazeMap[mapSize/2 + 1][potHole] = 0;
				j++;
			}
		}
	}
}

/* ----------------------------------------------------------------------
SOURCES
https://stackoverflow.com/questions/36939957/creating-a-matrix-in-java
https://en.wikipedia.org/wiki/Maze_generation_algorithm
https://stackoverflow.com/questions/59807560/maze-generator-using-recursive-division
https://weblog.jamisbuck.org/2011/1/17/maze-generation-aldous-broder-algorithm
-------------------------------------------------------------------------
SPARE CODE
//int i = (mapSize - 1);
//recDiv(mazeMap, 0, 0, mapSize - 2, mapSize - 2);
//makeMazeRecursive(mazeMap, 1, 1, LEVEL_WIDTH - 2, LEVEL_HEIGHT - 2);
int max = 1;
int x = 0;
int y = 0;

for (; x < mazeMap.length; x++) {
    for (; y < mazeMap[x].length; y++) {
        if (mazeMap[x][y] > max) {
            max = mazeMap[x][y];
            System.out.println(max);
        }
        System.out.println(mazeMap[x][y]);
    }
}

//when both horizontal and vertical clutter are full, map is done
int[] horClut = new int[mapSize];
//record placed lines and walls so the maze does not become too full
int[] verClut = new int[mapSize];
//while 
for (int i = 0; i < mapSize; i++) {
	int wallR = (int) (Math.random()*(mapSize));
	int doorR = (int) (Math.random()*(mapSize));
	double coinFlip = (Math.random()*(mapSize));
    if (coinFlip >= 0.5) {
    	//if coinflip is 
    	for (int j = 0; j < mapSize; j++) {
    		
    	}
    }
	//open door
	
}

//int[][] mazeMap = new int[mapSize][mapSize];
 * //returns matrix of 0s framed by 1s
		//return mazeMap;

//if a wall piece is completely surrounded by other walls, do not remove it
if ((mazeMap[potHole - 1][y] == 1) && (mazeMap[potHole + 1][y] == 1) && (mazeMap[potHole][y - 1] == 1) && (mazeMap[potHole - 1][y + 1] == 1)) {
	
} 
//only increment loop if a hole is poked
else {
	mazeMap[potHole][y] = 0;
	j++;
}
-------------------------------------------------------------------------
*/
