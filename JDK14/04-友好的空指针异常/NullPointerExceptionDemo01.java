/**
	Ŀ�꣺JDK 14�������ԣ��ѺõĿ�ָ���쳣�о���
	
*/
public class NullPointerExceptionDemo01{
	public static void main(String[] args){
		People p = new People();
		p.addr.in();
	}
}

class People{
	Address addr;
}

class Address{
	public void in(){
		System.out.println("�����й���");
	}
}