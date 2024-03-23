// You are given an array start where start = [startX, startY] represents your initial position (startX, startY) in a 2D space. You are also given the array target where target = [targetX, targetY] represents your target position (targetX, targetY).

// The cost of going from a position (x1, y1) to any other position in the space (x2, y2) is |x2 - x1| + |y2 - y1|.

// There are also some special roads. You are given a 2D array specialRoads where specialRoads[i] = [x1i, y1i, x2i, y2i, costi] indicates that the ith special road can take you from (x1i, y1i) to (x2i, y2i) with a cost equal to costi. You can use each special road any number of times.

// Return the minimum cost required to go from (startX, startY) to (targetX, targetY).
//here i have relaized that
public class minimumCost{
    public static void main(String args[]){

    }
    public static int minimumCost(int[] start, int[] target, int[][] specialRoads) {
        int row=0;
        int newRoads[]=new int[specialRoads.length][]
        for(int i=0;i<specialRoads.length;i++){
            int isSafe=Math.abs(specialRoads[i][1]-specialRoads[i][3])+Math.abs(specialRoads[i][2]-specialRoads[i][4]);
            if(isSafe<=)
        }
    }
}