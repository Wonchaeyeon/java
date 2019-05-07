
public class Program2 {
public static void main(String[] args) {
	//equals()
	Integer in1 = new Integer(100);
	Integer in2 = new Integer(100);
	Integer in3 = new Integer(200);
	System.out.println("in1==in2 -->"+(in1 == in2));
	System.out.println("in1.equals(in2) -->"+in1.equals(in2));
	System.out.println("in1.equals(in3) -->"+in1.equals(in3));
	System.out.println("========================");
//toString()
	System.out.println(new Integer(100).toString());
	System.out.println(new Double(55.7).toString());
	System.out.println("========================");
	//valueOf() : String -> Wrapper클래스
	System.out.println(Integer.valueOf("123"));
	System.out.println(Double.valueOf("123.456"));
	System.out.println("========================");
	//parseInt() : String -> int
	System.out.println(Integer.parseInt("456"));
	System.out.println("========================");
	//parseDouble() : String -> double
	System.out.println(Double.parseDouble("789.123"));
	System.out.println("========================");
	//Wrapper 클래스 -> 기본자료형 
	System.out.println(new Integer(100).intValue());
	System.out.println(new Double(3.31).doubleValue());
	
	
}
}
