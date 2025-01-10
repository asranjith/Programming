package string_Program;

import java.util.Arrays;

public class LeftRotation {
	public static void main(String[] args) {
		String s="Bengaluru the silicon city";
		String[] str = s.split(" ");
		
		for(int j=0;j<4;j++) {
			String temp=str[0];
		   for(int i=1;i<str.length;i++) {
			str[i-1]=str[i];
		   }
		str[str.length-1]=temp;
		}
		System.out.println(Arrays.toString(str));
	}

}
