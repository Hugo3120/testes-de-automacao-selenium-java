package introduction;

public class CoreJavaBrushUp3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "Hugo Leonardo da Silva";
		String[] splittedString = s.split("Leonardo");
		System.out.println(splittedString[0]);
		System.out.println(splittedString[1]);
		System.out.println(splittedString[1].trim());
//		for(int i = 0; i<s.length(); i++){
//			
//			System.out.println(s.charAt(i));
//		}
//		
		// de trás para frente
		for(int i = s.length()-1; i>=0; i--) {
			System.err.println(s.charAt(i));
		}
		

	}

}
