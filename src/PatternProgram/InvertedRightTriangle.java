package PatternProgram;

public class InvertedRightTriangle {
	public static void main(String[] args) {
		int r=3;
		for(int i=1;i<=r;i++) {
			for(int j=1;j<=r;j++) {
				if(i<=j) {
					System.out.print("*");
					
				}else {
					System.out.print(" ");
				}

			}
			System.out.println();
		}
	}

}
