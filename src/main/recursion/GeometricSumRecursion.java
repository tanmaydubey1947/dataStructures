package main.recursion;


public class GeometricSumRecursion {
	
	public static double findGeometricSum(int k){

		if(k==0) {
			
			return 1;
		} else {
			
			return 1/Math.pow(2, k) + findGeometricSum(k-1);
		}
	}
	
	public static void main(String[] args) {
		
		System.out.println(findGeometricSum(4));
		
	}

}
