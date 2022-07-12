package week1.day2;

public class FindCharCount {

	public static void main(String[] args) {
		String str = "cognizant";
		char ch = 'n'; //0
		char[] charArray = str.toCharArray();
		int count = 0;
		for (int i = 0; i < charArray.length; i++) {
			if(ch==charArray[i])
				count++;
		}
		System.out.println(count);


	}

}
