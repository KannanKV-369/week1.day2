package week1.day2;

import java.util.Arrays;

public class FindDups {

	public static void main(String[] args) {
		
		int[] num = {1,2,3,4,5,55,55,6,7,99,99,99,};
		int length = num.length;
		Arrays.sort(num);
		for (int i = 0; i < length-1; i++) {
			
			if(num[i] == num[i+1])
				System.out.println("Duplicate Vales are:  "+num[i]);
		}

	}

}
