/**
	目标：JDK 14新特性：switch的多值匹配方式
		
	JDK 14中演示：switch的多值匹配方式，简化贯穿性的代码写法
*/
public class SwitchDemo03{
	public static void main(String[] args){
		// 定义一个变量 
		var score = 'A';
		String rs = switch(score){
			case 'A','B' -> "上等";
            case 'C', 'D' -> "中等";
            case 'E' -> "不及格";
            default -> "成绩数据非法！";
		};
		System.out.println("结果是："+rs);
	}
}