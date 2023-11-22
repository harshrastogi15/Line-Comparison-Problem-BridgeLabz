class LineComparison{

	// UC1 - Length of Line given coordinate

	public static double lengthOfLine (int x1,int y1, int x2, int y2){
		return Math.sqrt((double)(x2-x1)*(x2-x1) + (double)(y2-y1)*(y2-y1));
	}

	public static void main(String[] args){
		System.out.println("Welcome to Line Comparison Computation Program");
		int x1 = 2, y1 = 3;
		int x2 = 3, y2 = 3;
		
		double length = lengthOfLine(x1,y1,x2,y2);
		System.out.println("Length of Line " + length);
	}	
}