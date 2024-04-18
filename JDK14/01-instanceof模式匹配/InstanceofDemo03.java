/**
   目标：JDK 14中的intanceof的模式匹配机制的变量访问范围的注意事项。
*/
public class InstanceofDemo03{
	public static void main(String[] args){
		test("黑马Java");
	}
	
	public static void test(Object obj){
		// JDK 14中的intanceof的模式匹配机制:先判断obj的真实类型是否是String
		// 如果是则把obj对象直接转型赋值给str变量指向
		// 如果obj不是String类型，则直接结束if分支，代码变得简洁。
		/*
		if(obj instanceof String str){
			System.out.println("结果是："+str.length());
		}else{
			System.out.println(str); // 这里不能访问str变量
		}
		*/
		
		/*
		if (!(obj instanceof String str)) {
			 // 这里不能访问str
		} else {
			System.out.println("第二个分支："+str.length()); // 能访问str
		}
		*/
		
		/*
		if(obj instanceof String str && str.length() > 7){
			// 这里是可以访问str的
		}else{
			System.out.println("第二个分支："+str.length()); // 这里不能访问str
		}
		*/
		
		if(obj instanceof String str || str.length() > 7){  // || 后面也不能访问str
			//System.out.println("第一个分支："+str.length()); // 这里不能访问str
		}else{
			System.out.println("第二个分支："+str.length()); // 这里不能访问str
		}
		
	}
}