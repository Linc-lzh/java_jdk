/**
	Ŀ�꣺JDK 14�������ԣ��ѺõĿ�ָ���쳣���ơ�
*/
public class NullPointerExceptionDemo02{
	public static void main(String[] args){
		A a = new A();
		B b = null;
		System.out.println(a.i == b.j);
	}
}

class A{
	int i;
}


class B{
	int j;
}