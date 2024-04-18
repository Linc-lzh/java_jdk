/**
	目标：JDK 14新特性：record类的限制。
		
	限制：
		1、不允许直接定义实例成员变量。	可以定义静态成员变量。
		2、可以定义实例和静态方法的。
		3、
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
			System.out.println("第一个参数值大于第二个参数值！");
		}
	}
	
	public void test(){
		
	}
	
	public static void test02(){
		
	}
}