package com.devdojo.arrays;

public class TwoDimensionalArrays {
	
	int[][] twoDimensionalArray = new int[][] {{1,2,3},{1,2,3}};
	
	void printArray() {
		
		System.out.println(twoDimensionalArray);
		
	}
	
	int[][] teste = new int[3][4];
	void populateArr() {
		
		for(int[] linha : teste) {
		    
		    for(int coluna : linha){
		        
		        linha[coluna] = coluna;
		        
		    }
		    
		}
		
		
		    
	    for(int[] linha : teste) {
	    
		    for(int coluna : linha){
		        
		        System.out.print(coluna);
		        
		    }
		    System.out.print("\n");
	    
	    }
	    
	}

}
