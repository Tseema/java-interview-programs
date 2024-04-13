package com.example.demo;

public class RoutePlanner {
    public static boolean routeExists(int fromRow, int fromColumn, int toRow, int toColumn,
                                      boolean[][] mapMatrix) {



        for(int row=fromRow; row<=toRow;){
            for(int col=fromColumn;col<=toColumn;){
                if(mapMatrix[row][col]){row++;
                System.out.println(mapMatrix[row][col]);}
                else if (mapMatrix[row][col]) {col++; System.out.println(mapMatrix[row][col]);}
            }
        }

            return false;
        //throw new UnsupportedOperationException("Waiting to be implemented.");
    }

    public static void main(String[] args) {
        boolean[][] mapMatrix = {
                {true,  false, false},
                {true,  true,  false},
                {false, true,  true}
        };

        System.out.println(routeExists(0, 0, 2, 2, mapMatrix));
    }
}



