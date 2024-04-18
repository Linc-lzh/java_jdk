/**
   目标：JDK 14中的intanceof的模式匹配机制。
*/
public class InstanceofDemo{
	public static void main(String[] args){
		test("黑马Java");
	}
	
	public static void test(Object obj){
		// JDK 14中的intanceof的模式匹配机制:先判断obj的真实类型是否是String
		// 如果是则把obj对象直接转型赋值给str变量指向
		// 如果obj不是String类型，则直接结束if分支，代码变得简洁。
		if(obj instanceof String str){
			System.out.println("结果是："+str.length());
		}
	}
}