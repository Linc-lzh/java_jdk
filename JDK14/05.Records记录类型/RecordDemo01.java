/**
	Ŀ�꣺JDK 14�����ԣ�records��¼����
*/
public class RecordDemo01{
	public static void main(String[] args){
		// 1���жϼ�¼�������Ƿ�����޲��������� ��û���޲����������ģ������в���������
		People p = new People("����",10);
		// 2����д��toString()����
		System.out.println(p);
		// 3���ж��Ƿ����set����:û���ṩ
		// p.setName("���");
		// 4���ṩ��һЩ��ȡ���ݵķ�������Щ�������������Ա����һ��
		System.out.println(p.name());
		System.out.println(p.age());
	}
}

// JDK 14�еļ�¼����
record People(String name , int age){}
	
