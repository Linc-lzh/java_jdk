/**
	目标：JDK 14的新特性：友好的空指针异常机制。
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