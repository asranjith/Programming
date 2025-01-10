package string_Program;

import java.util.Arrays;

public class RightRotation {
	public static void main(String[] args) {
		String s="Bengaluru the silicon city";
		String[] str = s.split(" ");
		
		for(int j=0;j<4;j++) {
		String temp=str[str.length-1];
		for(int i=str.length-2;i>=0;i--) {
			str[i+1]=str[i];
			
		}
		str[0]=temp;
		}
		System.out.println(Arrays.toString(str));
		
	}

}
