/**
   Ŀ�꣺JDK 14�е�intanceof��ģʽƥ����ơ�
*/
public class InstanceofDemo{
	public static void main(String[] args){
		test("����Java");
	}
	
	public static void test(Object obj){
		// JDK 14�е�intanceof��ģʽƥ�����:���ж�obj����ʵ�����Ƿ���String
		// ��������obj����ֱ��ת�͸�ֵ��str����ָ��
		// ���obj����String���ͣ���ֱ�ӽ���if��֧�������ü�ࡣ
		if(obj instanceof String str){
			System.out.println("����ǣ�"+str.length());
		}
	}
}