/**
   Ŀ�꣺֮ǰ�����ʹ��instanceof
*/
public class InstanceofDemo{
	public static void main(String[] args){
		test("����Java");
	}
	
	public static void test(Object obj){
		if(obj instanceof String){
			// �����ˣ�˵��obj��String������
			String rs = (String)obj;
			System.out.println(rs.length());
		}
	}
}