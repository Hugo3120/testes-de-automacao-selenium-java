package introduction;

public class CoreJavaBrushUp1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//int myNum = 5;
		//System.out.println(myNum);
		
		int [] lis = new int [5];
		lis[0] = 10;
		lis [1]= 5;
		lis [2]= 6;
		lis [3]= 4;
		lis [4]= 3;
		
		int []lis2 = {10,5,6,4,3,5,7,58,3};
	
		for(int i= 0; i < lis.length; i++) {
			System.out.println(lis[i]);
		}
		
		for (int i = 0; i < lis2.length; i++) {
			System.out.println(lis2[i]);
		}
		
		String [] name = {"Hugo Leonardo", "Selenium"};
		for (int i = 0; i < name.length; i++) {
			System.out.println(name[i]);
		}
		
		
	}

}
