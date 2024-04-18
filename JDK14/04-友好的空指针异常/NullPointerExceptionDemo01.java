/**
	目标：JDK 14中新特性：友好的空指针异常研究。
	
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
		System.out.println("我在中国！");
	}
}