package number_Program;

public class Denomination {
	public static void main(String[] args) {
		int [] arr= {2000,500,200,100,50,20,10,5,2,1};
		int amount=2600;
		for(int i=0;i<arr.length;i++) {
			int count =amount/arr[i];
		}
	}

}
