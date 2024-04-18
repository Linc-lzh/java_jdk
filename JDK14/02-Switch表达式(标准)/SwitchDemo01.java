/**
	目标：JDK 14新特性：switch表达式的标准化写法。
		
	JDK 14中演示：switch无需书写break也不会发生贯穿现象！可以省略break。	
	
	小结：
		JDK 14中已经确定了switch无需书写break就可以实现switch分支操作，代码结构简化了很多！
*/
public class SwitchDemo01{
	public static void main(String[] args){
		// 定义一个变量 
		var score = 'C';
		switch(score){
			case 'A' -> System.out.println("优秀");
            case 'B' -> System.out.println("良好");
            case 'C' -> System.out.println("中");
            case 'D' -> System.out.println("及格");
            case 'E' -> System.out.println("不及格");
            default -> System.out.println("成绩数据非法！");
		}
	}
}