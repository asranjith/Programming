package array_NumberOcccurance;

import java.util.LinkedHashMap;

public class NumberOccuranceInIntArray {
	public static void main(String[] args) {
		int[] a={2,4,6,6,4,3,2,5,3};
		 LinkedHashMap <Integer,Integer>map=new LinkedHashMap<Integer,Integer>();

		 for(int i=0; i<a.length;i++){
		    if(map.containsKey(a[i])){
		       map.put(a[i],map.get(a[i])+1);
		    }
		  else{
		       map.put(a[i],1);
		     }
		}
		System.out.println(map);
	}

}
