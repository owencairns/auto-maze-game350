package mazeGame;

import java.util.Random;

public class generateMaze {
	public static void main(String[] args) {
		
		int[][]printDemo = mazeGen(9);
		
		for (int i = 0; i < printDemo.length; i++) { //this equals to the row in our matrix.
	         for (int j = 0; j < printDemo[i].length; j++) { //this equals to the column in each row.
	            System.out.print(printDemo[i][j] + " ");
	         }
	         System.out.println(); //change line on console as row comes to end in the matrix.
	     }
		
	}
	
	/*
     * generates the maze based on https://en.wikipedia.org/wiki/Maze_generation_algorithm
     * main function for creating the maze
     * @Param int mapSize, takes and int to determine what the maze size will be
     * @return int[][] returns a randomly generated maze int array
     */
	
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
		return mazeMap;
	}
	
	
	/*
     * creates walls around the outside of the maze
     * walls are 1, walkable tiles are 0
     * function for walling up the outside of the maze
     * @Param int mapSize, takes and int to determine what the maze size will be
     * @Param int[][] mazeMap, takes an int[][] to change the value of
     */
	
	public static void wallConstruction(int[][] mazeMap, int mapSize) {
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
	
	/*
     * constructs a maze of a given size on an int[][]
     * function for generating the maze
     * will not work on mazes smaller than 3x3
     * @Param int mapSize, takes and int to determine what the maze size will be
     * @Param int[][] mazeMap, takes an int[][] to change the value of
     */
	
	public static void mazeConstruction(int[][] mazeMap, int mapSize) {
		if (mapSize < 3) {
			throw new ArithmeticException("Maze too small");
		}
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
