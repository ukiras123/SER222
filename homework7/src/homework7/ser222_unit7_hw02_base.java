package homework7;
/**
 * Write a description of class Base_HW01 here.
 * 
 * @author (your name), Acuna
 * @version (a version number or a date)
 */
import java.util.Random;

public class ser222_unit7_hw02_base {
    //standard console size in characters.
    private static final int LEVEL_HEIGHT = 25;//25;
    private static final int LEVEL_WIDTH = 80;//80;       
    
    private static final char ICON_WALL = '#';           
    private static final char ICON_BLANK = ' ';

    /**
     * Returns a 2D array containing a statically created maze with dimentions 80x24.
     * 
     * @return     2D array containing a maze 
     */
    private static char[][] makeMazeStatic()
    {
        //the following maze was generated with the recursive division method and then modified by hand.
        
        char level[][] =     
        {{'#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#'}, 
        {'#', ' ', ' ', ' ', '#', ' ', ' ', '#', ' ', '#', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '#'}, 
        {'#', ' ', '#', ' ', '#', ' ', ' ', '#', ' ', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', ' ', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', ' ', '#', '#', '#', '#', '#', ' ', '#', '#', '#', '#', '#', '#', ' ', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#'}, 
        {'#', ' ', '#', ' ', '#', ' ', ' ', '#', ' ', '#', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '#', ' ', ' ', ' ', '#', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '#', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '#', ' ', '#', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '#', ' ', ' ', ' ', ' ', ' ', '#', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '#', ' ', ' ', ' ', ' ', ' ', ' ', '#'}, 
        {'#', ' ', '#', ' ', '#', ' ', ' ', '#', ' ', '#', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '#', '#', ' ', '#', ' ', '#', ' ', ' ', '#', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '#', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '#', ' ', '#', ' ', '#', ' ', '#', '#', '#', ' ', '#', ' ', '#', '#', ' ', '#', '#', '#'}, 
        {'#', ' ', '#', ' ', '#', ' ', ' ', '#', ' ', '#', '#', '#', ' ', '#', '#', '#', '#', '#', '#', '#', '#', '#', ' ', '#', '#', '#', ' ', ' ', ' ', ' ', '#', ' ', ' ', ' ', ' ', '#', '#', '#', '#', '#', ' ', '#', ' ', '#', '#', '#', ' ', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', ' ', '#', '#', '#', '#', '#', ' ', ' ', ' ', '#', ' ', ' ', ' ', ' ', ' ', '#', ' ', '#', ' ', ' ', ' ', ' ', '#'}, 
        {'#', ' ', '#', ' ', ' ', ' ', ' ', ' ', ' ', '#', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '#', ' ', '#', ' ', ' ', '#', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '#', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '#', '#', ' ', '#', '#', '#', '#', '#', ' ', '#', '#', ' ', '#', ' ', ' ', '#', ' ', '#'}, 
        {'#', ' ', '#', ' ', '#', ' ', ' ', '#', ' ', '#', '#', '#', ' ', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', ' ', '#', '#', '#', ' ', ' ', '#', '#', '#', '#', '#', '#', '#', '#', ' ', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', ' ', ' ', ' ', '#', ' ', ' ', ' ', ' ', ' ', '#', ' ', ' ', '#', ' ', '#', ' ', '#'}, 
        {'#', ' ', '#', ' ', '#', ' ', ' ', '#', ' ', '#', ' ', ' ', ' ', ' ', ' ', ' ', '#', ' ', ' ', ' ', ' ', ' ', '#', ' ', ' ', '#', ' ', '#', ' ', ' ', '#', ' ', ' ', '#', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '#', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '#', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '#', ' ', ' ', ' ', '#'}, 
        {'#', ' ', '#', ' ', '#', ' ', ' ', '#', ' ', ' ', ' ', '#', ' ', '#', ' ', ' ', ' ', ' ', '#', ' ', '#', ' ', '#', ' ', ' ', '#', ' ', ' ', ' ', ' ', '#', ' ', ' ', '#', ' ', '#', '#', '#', '#', ' ', '#', '#', '#', ' ', ' ', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', ' ', '#', '#', '#', '#', '#', '#', '#', '#', ' ', '#', '#', '#', '#', '#', '#', '#', '#', ' ', '#', '#', '#', '#', '#', '#'}, 
        {'#', ' ', '#', ' ', '#', ' ', ' ', '#', ' ', '#', ' ', ' ', ' ', '#', ' ', ' ', '#', ' ', '#', ' ', ' ', ' ', ' ', ' ', ' ', '#', ' ', '#', ' ', ' ', '#', ' ', ' ', '#', ' ', ' ', ' ', '#', ' ', ' ', ' ', ' ', ' ', '#', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '#', ' ', ' ', ' ', ' ', ' ', '#', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '#'}, 
        {'#', ' ', ' ', ' ', '#', ' ', ' ', '#', ' ', '#', '#', ' ', '#', '#', '#', ' ', '#', ' ', '#', '#', ' ', '#', '#', '#', ' ', '#', ' ', '#', ' ', '#', '#', ' ', ' ', '#', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '#', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '#', ' ', ' ', ' ', ' ', ' ', '#', ' ', ' ', ' ', ' ', '#', ' ', ' ', ' ', ' ', '#', ' ', ' ', ' ', '#', ' ', ' ', '#'}, 
        {'#', ' ', '#', ' ', '#', '#', ' ', '#', ' ', '#', ' ', ' ', ' ', ' ', ' ', ' ', '#', ' ', '#', ' ', ' ', ' ', '#', ' ', ' ', '#', ' ', ' ', ' ', ' ', '#', '#', ' ', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', ' ', '#', '#', '#', '#', '#', '#', '#', '#', '#', ' ', '#', '#', '#', '#', ' ', '#', '#', '#', '#', ' ', '#', '#', '#', ' ', '#', '#'}, 
        {'#', ' ', '#', ' ', '#', ' ', ' ', ' ', ' ', '#', '#', '#', '#', '#', '#', ' ', '#', ' ', '#', ' ', '#', ' ', '#', ' ', ' ', '#', ' ', '#', ' ', ' ', '#', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '#', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '#', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '#', ' ', ' ', ' ', ' ', ' ', ' ', '#'}, 
        {'#', ' ', '#', ' ', '#', ' ', ' ', '#', ' ', '#', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '#', ' ', ' ', ' ', ' ', ' ', ' ', '#', ' ', '#', ' ', ' ', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', ' ', '#', '#', '#', '#', '#', '#', '#', '#', '#', ' ', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#'}, 
        {'#', ' ', '#', ' ', '#', ' ', ' ', '#', ' ', '#', '#', ' ', '#', '#', ' ', '#', '#', ' ', '#', ' ', '#', ' ', '#', ' ', ' ', '#', ' ', '#', ' ', ' ', '#', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '#', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '#', ' ', ' ', ' ', ' ', '#', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '#'}, 
        {'#', '#', '#', ' ', '#', ' ', '#', '#', '#', '#', ' ', ' ', ' ', ' ', ' ', ' ', '#', ' ', '#', ' ', '#', ' ', '#', ' ', ' ', '#', ' ', '#', ' ', ' ', '#', '#', '#', '#', '#', '#', ' ', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', ' ', '#', '#', '#', '#', '#', '#', '#', '#', '#', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '#', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '#'}, 
        {'#', ' ', ' ', ' ', '#', ' ', ' ', ' ', ' ', '#', '#', '#', '#', '#', ' ', '#', '#', '#', '#', '#', '#', ' ', '#', '#', '#', '#', ' ', '#', ' ', ' ', '#', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '#', '#', ' ', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', ' ', '#', '#', '#', '#'}, 
        {'#', ' ', '#', ' ', '#', '#', ' ', '#', ' ', '#', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '#', ' ', ' ', '#', ' ', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', ' ', '#', '#', '#', '#', '#', '#', '#', '#', ' ', '#', '#', '#', '#', '#', '#', '#', ' ', '#', '#', ' ', ' ', ' ', ' ', ' ', '#', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '#'}, 
        {'#', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '#', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '#', ' ', ' ', ' ', ' ', ' ', ' ', '#', ' ', '#', ' ', ' ', '#', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '#', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '#', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '#'}, 
        {'#', ' ', '#', '#', '#', '#', '#', '#', '#', '#', '#', ' ', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', ' ', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#'}, 
        {'#', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '#', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '#', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '#'}, 
        {'#', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '#', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '#'}, 
        {'#', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '#', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '#', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '#'},         
        {'#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#'}};
    
        return level;
    }
    
    /**
     * Creates a random maze in a 2D array.
     * 
     * @see <a href="http://en.wikipedia.org/wiki/Maze_generation_algorithm#Recursive_division_method">Recursive_division_method</a>
     * @return 2D array containing a maze
     */
    private static char[][] makeMaze()
    {
        char level[][] = createBlankLevel();
        
        makeMazeRecursive(level, 1, 1, LEVEL_WIDTH-2, LEVEL_HEIGHT-2); //TODO: may need to change but probably not.
        
        return level;
    }

    /**
     * Creates an empty level of standard level height and width. Level will be
     * blank but bordered with wall characters.
     * 
     * @return  2D array containing a maze
     */
    private static char[][] createBlankLevel()
    {   
        char level[][] = new char[LEVEL_HEIGHT][LEVEL_WIDTH];
        
        //reset level to be entirely blank
        for (int y = 0; y < LEVEL_HEIGHT; y++) 
            for (int x = 0; x < LEVEL_WIDTH; x++)
                level[y][x] = ' ';
    
        //top barrier   
        for (int x = 0; x < LEVEL_WIDTH; x++)
            level[0][x] = ICON_WALL;
    
        //bottom barrier
        for (int x = 0; x < LEVEL_WIDTH; x++)
            level[LEVEL_HEIGHT-1][x] = ICON_WALL;
    
        //left barrier
        for (int y = 0; y < LEVEL_HEIGHT; y++)
            level[y][0] = ICON_WALL;
    
        //left barrier
        for (int y = 0; y < LEVEL_HEIGHT; y++)
            level[y][LEVEL_WIDTH-1] = ICON_WALL;
            
        return level;
    }

    //TODO: complete method.
    private static void makeMazeRecursive(char[][]level, int startX, int startY, int endX, int endY) {
    	
    	//base case
    	if( endX - startX < 2 || endY - startY < 2 ) {
//    		System.out.println(startX + "," + endX + "," + startY + "," + endY);
    		return;
    	
    	} else {
    		
    		//Create walls
    		if(endY > startY && endX > startX) {
    			int randY = getRandom(startY, endY);
    			int randX = getRandom(startX, endX);
    		
	        	for (int x = startX; x <= endX; x++) {
	        		level[randY][x] = ICON_WALL;
	        	}
	        	
	        	for (int y = startY; y <= endY; y++) {
	        		level[y][randX] = ICON_WALL;
	        	}
	        	
	        	//open holes on three walls
	    		openHoleOnThreeWalls(level, randX, randY);
	    		
	    		
	    		int[] leftBottomArea = getLeftBottomArea(level, randX, randY, ' ');
	    		makeMazeRecursive(level, leftBottomArea[0], leftBottomArea[1], leftBottomArea[2], leftBottomArea[3]); 
	    		
	    		int[] leftAboveArea = getLeftAboveArea(level, randX, randY, ' ');
	    		makeMazeRecursive(level, leftAboveArea[0], leftAboveArea[1], leftAboveArea[2], leftAboveArea[3]);
//	    		
	    		int[] rightAboveArea = getRightAboveArea(level, randX, randY, ' ');
	    		makeMazeRecursive(level, rightAboveArea[0], rightAboveArea[1], rightAboveArea[2], rightAboveArea[3]);
	    		
	    		int[] rightBottomArea = getRightBottomArea(level, randX, randY, ' ');
	    		makeMazeRecursive(level, rightBottomArea[0], rightBottomArea[1], rightBottomArea[2], rightBottomArea[3]);
    		}
    	}
    	
    	
    }
    
    private static int[] getRightBottomArea(char[][] level, int crossX, int crossY, char debug) {
    	int[] point = new int[4];// [startX, startY, endX, ednY]
    	int x = crossX + 1;
    	int y = crossY + 1;
    	
    	for(int i = y; y < LEVEL_HEIGHT; i ++) {
    		
    		if(level[y + 1][crossX + 1] == '#') {
    			break;
    		} else {
    			
    			y = y + 1;
    		}
	   	}
    
    	for(int i = x; x < LEVEL_WIDTH; i ++) {
    		
    		if(level[crossY + 1][x + 1] == '#') {
    			break;
    		} else {
    			
    			x = x + 1;
    		}
	   	}
    	
    	level[crossY + 1][crossX + 1] = debug;
    	level[y][x] = debug;
    	point[0] = crossX + 1;
    	point[1] = crossY + 1;
    	point[2] = x;
    	point[3] = y;
        
    	return point;
    }
    
    private static int[] getRightAboveArea(char[][] level, int crossX, int crossY, char debug) {
    	int[] point = new int[4];// [startX, startY, endX, ednY]
    	int x = crossX + 1;
    	int y = crossY - 1;
    	
    	for(int i = y; y > 0; i --) {
    		
    		if(level[y - 1][crossX + 1] == '#') {
    			break;
    		} else {
    			
    			y = y - 1;
    		}
	   	}
    
    	for(int i = x; x < LEVEL_WIDTH; i ++) {
    		
    		if(level[crossY - 1][x + 1] == '#') {
    			break;
    		} else {
    			
    			x = x + 1;
    		}
	   	}
    	
    	level[y][crossX + 1] = debug;
    	level[crossY - 1][x] = debug;
    	point[0] = crossX + 1;
    	point[1] = y;
    	point[2] = x;
    	point[3] = crossY - 1;
        
    	return point;
    }
    
    private static int[] getLeftAboveArea(char[][] level, int crossX, int crossY, char debug) {
    	int[] point = new int[4];// [startX, startY, endX, ednY]
    	int x = crossX - 1;
    	int y = crossY - 1;
    	
    	for(int i = x; i > 0; i --) {
    		
    		if(level[y][x - 1] == '#') {
    			break;
    		} else {
    			
    			x = x - 1;
    		}
	   	}
    
    	for(int i = y; y > 0; i --) {
    		
    		if(level[y - 1][crossX - 1] == '#') {
    			break;
    		} else {
    			
    			y = y - 1;
    		}
	   	}
    	
    	level[y][x] = debug;
    	level[crossY - 1][crossX - 1] = debug;
    	point[0] = x;
    	point[1] = y;
    	point[2] = crossX - 1;
    	point[3] = crossY - 1;
        
    	return point;
    }
    
    private static int[] getLeftBottomArea(char[][] level, int crossX, int crossY, char debug) {
    	int[] point = new int[4];// [startX, startY, endX, ednY]
    	int x = crossX - 1;
    	int y = crossY + 1;
    	
    	for(int i = x; i > 0; i --) {
    		
    		if(level[crossY + 1][x - 1] == '#') {
    			break;
    		} else {
    			level[crossY + 1][x] = debug;
    			x = x - 1;
    		}
	   	}
    	
    	level[crossY + 1][x] = debug;
    	point[0] = x;
    	point[1] = crossY + 1;
    	
    	for(int i = y; y < LEVEL_HEIGHT; i ++) {
    		
    		if(level[y + 1][crossX - 1] == '#') {
    			break;
    		} else {
    			level[y][crossX - 1] = debug;
    			y = y + 1;
    		}
	   	}
    	
    	level[y][crossX - 1] = debug;
    	point[2] = crossX - 1;
    	point[3] = y;
        
    	return point;
    }
    
    private static void openHoleOnThreeWalls(char[][] level, int crossX, int crossY) {
    	//get random number from 0 to 3
    	int rand = getRandom(0,3);
    	if(rand == 0) {
//    		if(crossX + 1 < LEVEL_WIDTH - 1) {
//	    		int openRight = getRandom(crossX + 1, LEVEL_WIDTH - 1);
//	        	level[crossY][openRight] = ' ';
//    		}
        	
    		if(1 < crossX - 1) {
	        	int openLeft = getRandom(1, crossX - 1);
	        	level[crossY][openLeft] = ' ';
    		}
        	
    		if(crossY + 1 < LEVEL_HEIGHT - 1) {
	        	int openBottom =  getRandom(crossY + 1, LEVEL_HEIGHT - 1);
	        	level[openBottom][crossX] = ' ';
    		}
    		
    		if(1 < crossY - 1) {
	        	int openTop =  getRandom(1, crossY - 1);
	        	level[openTop][crossX] = ' ';
    		}
        	
    	} else if (rand == 1) {
    		
    		if(crossX + 1 < LEVEL_WIDTH - 1) {
	    		int openRight = getRandom(crossX + 1, LEVEL_WIDTH - 1);
	        	level[crossY][openRight] = ' ';
    		}
        	
//    		if(1 < crossX - 1) {
//	        	int openLeft = getRandom(1, crossX - 1);
//	        	level[crossY][openLeft] = ' ';
//    		}
        	
    		if(crossY + 1 < LEVEL_HEIGHT - 1) {
	        	int openBottom =  getRandom(crossY + 1, LEVEL_HEIGHT - 1);
	        	level[openBottom][crossX] = ' ';
    		}
    		
    		if(1 < crossY - 1) {
	        	int openTop =  getRandom(1, crossY - 1);
	        	level[openTop][crossX] = ' ';
    		}
    		
    	} else if(rand == 2) {
    		
    		if(crossX + 1 < LEVEL_WIDTH - 1) {
	    		int openRight = getRandom(crossX + 1, LEVEL_WIDTH - 1);
	        	level[crossY][openRight] = ' ';
    		}
        	
    		if(1 < crossX - 1) {
	        	int openLeft = getRandom(1, crossX - 1);
	        	level[crossY][openLeft] = ' ';
    		}
        	
//    		if(crossY + 1 < LEVEL_HEIGHT - 1) {
//	        	int openBottom =  getRandom(crossY + 1, LEVEL_HEIGHT - 1);
//	        	level[openBottom][crossX] = ' ';
//    		}
    		
    		if(1 < crossY - 1) {
	        	int openTop =  getRandom(1, crossY - 1);
	        	level[openTop][crossX] = ' ';
    		}
    	
    	} else if(rand == 3){
    		
    		if(crossX + 1 < LEVEL_WIDTH - 1) {
	    		int openRight = getRandom(crossX + 1, LEVEL_WIDTH - 1);
	        	level[crossY][openRight] = ' ';
    		}
        	
    		if(1 < crossX - 1) {
	        	int openLeft = getRandom(1, crossX - 1);
	        	level[crossY][openLeft] = ' ';
    		}
        	
    		if(crossY + 1 < LEVEL_HEIGHT - 1) {
	        	int openBottom =  getRandom(crossY + 1, LEVEL_HEIGHT - 1);
	        	level[openBottom][crossX] = ' ';
    		}
    		
//    		if(1 < crossY - 1) {
//	        	int openTop =  getRandom(1, crossY - 1);
//	        	level[openTop][crossX] = ' ';
//    		}
    		
    	} else {
    		
    		System.out.println("openHoleOnThreeWalls error");
    		System.exit(1);
    	}
    	
    }
    
    private static int getRandom(int min, int max) {
    	int rand = (int)(Math.random()*max);
    	
    	if(max < min) {
    		System.out.println(min + " " + max);
    		System.out.println("max < min error");
    		System.exit(1);
    		
    	}
    	
    	if(min <= rand && rand <= max) {
    		return rand;
    	} else {
//    		System.out.println(min + " " + max);
    		return getRandom(min, max);
    	}
    }
    
    /**
     * Displays a level in the console.
     * 
     * @param level  2D array containing a maze
     */
    private static void drawLevel(char[][] level)
    {
        int y, x;
    
        for (y = 0; y < LEVEL_HEIGHT; y++) 
        {
            for (x = 0; x < LEVEL_WIDTH; x++)
                System.out.print(level[y][x]);
            System.out.println();
        }
    }

    /**
     * Entry point.
     * 
     * @param args command line arguments
     */
    public static void main(String[] args) {       
        //show static maze (uncomment for sample output)
//        drawLevel(makeMazeStatic());
        //show recursive maze
    	try{
    		//test 100 times
//    		for(int i = 0; i < 100; i ++) {
    			drawLevel(makeMaze());
//    		}
    	} catch(StackOverflowError error) {
    		System.out.println(error);
    		System.out.println("StackOverflowError occured");
    	}
    	
    	
    	//TEST
    	System.out.println("\n-------------------------------");
    	System.out.println("TEST size m problem. The size m problem is\n"
    					+ "to get rectagle and randomly make walls and open\n"
    					+ "holes on 3 of 4 walls.");
    	System.out.println();
    	char[][] testLevel = createBlankLevel();
    	int randY = getRandom(1, LEVEL_HEIGHT - 2);
		int randX = getRandom(1, LEVEL_WIDTH - 2);
	
    	for (int x = 1; x <= LEVEL_WIDTH - 2; x++) {
    		testLevel[randY][x] = ICON_WALL;
    	}
    	
    	for (int y = 1; y <= LEVEL_HEIGHT - 2; y++) {
    		testLevel[y][randX] = ICON_WALL;
    	}
    	
    	//open holes on three walls
		openHoleOnThreeWalls(testLevel, randX, randY);
		drawLevel(testLevel);
		
		
    	
    }
}