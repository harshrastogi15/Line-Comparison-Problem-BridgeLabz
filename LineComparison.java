class LineComparison{

	// UC1 - Length of Line given coordinate

	public static double lengthOfLine (int x1,int y1, int x2, int y2){
		return Math.sqrt((double)(x2-x1)*(x2-x1) + (double)(y2-y1)*(y2-y1));
	}
	
	// UC2 - Equality of Two Lines
	public static void equalityOfLines (double lengthOfLine1, double lengthOfLine2){
		if(lengthOfLine1 == lengthOfLine2){
			System.out.println("Lines are equal");
		}else{
			System.out.println("Lines are not equal");
		}
	}

	public static void main(String[] args){
		System.out.println("Welcome to Line Comparison Computation Program");
		int x1 = 2, y1 = 3;
		int x2 = 3, y2 = 3;
		
		double lengthofFirst = lengthOfLine(x1,y1,x2,y2);
		
		x1 =3;y1=4; x2=2;y2=5;

		double lengthofSecond = lengthOfLine(x1,y1,x2,y2);
		System.out.println("Length of First Line " + lengthofFirst);
		System.out.println("Length of Second Line " + lengthofSecond);
		equalityOfLines(lengthofFirst,lengthofSecond);
	}	
}