package com.practice.dfs;

public class IslandProblem {

	public static void main (String[] args) throws java.lang.Exception 
	{ 
		int M[][]= new int[][] {{1, 1, 0, 0, 0}, 
								{0, 1, 0, 0, 1}, 
								{1, 0, 0, 1, 1}, 
								{0, 0, 0, 0, 0}, 
								{1, 0, 1, 0, 1} 
								}; 
		boolean visited[][] = new boolean[5][5];
		IslandProblem I = new IslandProblem(); 
		System.out.println("Number of islands is: "+ I.countIslands(M, visited)); 
	} 
	
	public String countIslands(int M[][], boolean visited[][]) {
		
		
		for(int i=0; i<5;i++) {
			for (int k=0;k<5;k++) {
				visited[i][k] = true;
				if(M[i][k] == 1 && M[i][k+1] ==1) {
					
				}
				
			}
		}
		
		return "";
	}
	
}
