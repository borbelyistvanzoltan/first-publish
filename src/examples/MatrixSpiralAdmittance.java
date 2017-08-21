package examples;

import java.util.ArrayList;

public class MatrixSpiralAdmittance {
	
	static int[][] tomb={
						 {1,3,4,6},
						 {1,2,4,6},
						 {5,1,0,7},
						};
	
//	static int h;
	
	public static ArrayList<Integer> spiralOrder(int[][] matrix) {
        ArrayList<Integer> result = new ArrayList<Integer>();
 
        if(matrix == null || matrix.length == 0) return result;
 
        int m = matrix.length;
        int n = matrix[0].length;
 
        int x=0; 
        int y=0;
 
        while(m>0 && n>0){
 
            //ha már csak egy sor vagy oszlop maradt, akkor nem tudunk körben haladni
            if(m==1){
                for(int i=0; i<n; i++){
                    result.add(matrix[x][y++]);
                }
                break;
            }else if(n==1){
                for(int i=0; i<m; i++){
                    result.add(matrix[x++][y]);
                }
                break;
            }
 
            //lentebb a körben haladás mozdulatai
 
            //felül vagyunk, jobbra mozgunk
            for(int i=0;i<n-1;i++){
                result.add(matrix[x][y++]);
            }
 
            //jobbszélen vagyunk, lefelé mozgunk
            for(int i=0;i<m-1;i++){
                result.add(matrix[x++][y]);
            }
 
            //alul vagyunk, balra mozgunk
            for(int i=0;i<n-1;i++){
                result.add(matrix[x][y--]);
            }
 
            //balszélen vagyunk - felfelé mozgunk
            for(int i=0;i<m-1;i++){
                result.add(matrix[x--][y]);
            }
 
            x++;
            y++;
            m=m-2;
            n=n-2;
        }
 
        return result;
    }
	
	public static void main(String[] args){
		
		System.out.print(spiralOrder(tomb));
		
				
//		for(int w=0; w<tomb[h].length-1; w++){
//			
//			System.out.print(tomb[w][h] + ", ");
			
		}
	
}
