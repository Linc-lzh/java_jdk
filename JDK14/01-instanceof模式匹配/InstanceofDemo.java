/**
   目标：之前是如何使用instanceof
*/
public class InstanceofDemo{
	public static void main(String[] args){
		test("黑马Java");
	}
	
	public static void test(Object obj){
		if(obj instanceof String){
			// 进来了，说明obj是String类型了
			String rs = (String)obj;
			System.out.println(rs.length());
		}
	}
}