/**
   Ŀ�꣺JDK 14�е�intanceof��ģʽƥ����Ƶı������ʷ�Χ��ע�����
*/
public class InstanceofDemo03{
	public static void main(String[] args){
		test("����Java");
	}
	
	public static void test(Object obj){
		// JDK 14�е�intanceof��ģʽƥ�����:���ж�obj����ʵ�����Ƿ���String
		// ��������obj����ֱ��ת�͸�ֵ��str����ָ��
		// ���obj����String���ͣ���ֱ�ӽ���if��֧�������ü�ࡣ
		/*
		if(obj instanceof String str){
			System.out.println("����ǣ�"+str.length());
		}else{
			System.out.println(str); // ���ﲻ�ܷ���str����
		}
		*/
		
		/*
		if (!(obj instanceof String str)) {
			 // ���ﲻ�ܷ���str
		} else {
			System.out.println("�ڶ�����֧��"+str.length()); // �ܷ���str
		}
		*/
		
		/*
		if(obj instanceof String str && str.length() > 7){
			// �����ǿ��Է���str��
		}else{
			System.out.println("�ڶ�����֧��"+str.length()); // ���ﲻ�ܷ���str
		}
		*/
		
		if(obj instanceof String str || str.length() > 7){  // || ����Ҳ���ܷ���str
			//System.out.println("��һ����֧��"+str.length()); // ���ﲻ�ܷ���str
		}else{
			System.out.println("�ڶ�����֧��"+str.length()); // ���ﲻ�ܷ���str
		}
		
	}
}