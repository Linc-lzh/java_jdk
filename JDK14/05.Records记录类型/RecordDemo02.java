/**
	Ŀ�꣺JDK 14�����ԣ�record������ơ�
		
	���ƣ�
		1��������ֱ�Ӷ���ʵ����Ա������	���Զ��徲̬��Ա������
		2�����Զ���ʵ���;�̬�����ġ�
		3��
*/
public class RecordDemo02{
	public static void main(String[] args){
		Test t = new Test(10 , 2);
	}
}

record Test(int x , int y){
	public static String name ;
	
	public Test{
		if(x > y){
			System.out.println("��һ������ֵ���ڵڶ�������ֵ��");
		}
	}
	
	public void test(){
		
	}
	
	public static void test02(){
		
	}
}