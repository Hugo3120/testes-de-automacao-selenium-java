package introduction;

import java.util.ArrayList;

public class CoreJavaBrushUp2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int []lis2 = {3,5,6,4,3,5,7,58,3};
		for(int i = 0; i < lis2.length; i++) {
			
			if(lis2[i] % 2 ==0) {
				System.out.println(lis2[i]);
				break;
				
			}else {
				System.out.println(lis2[i] + " Is not multiple of 2");
			}
		}
		ArrayList<String> a = new ArrayList<String>();
		a.add("Hugo");
		a.add("Leonardo");
		a.add("Da Silva");
		a.add("Curso Selenium");
		System.out.println(a.get(3));
	}
}


