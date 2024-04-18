/**
	目标：JDK 14新特性：switch作为表达式，得到一个结果。
		
	JDK 14中演示：swicth可以作为表达式的一个结果返回！	
*/
public class SwitchDemo02{
	public static void main(String[] args){
		// 定义一个变量 
		var score = 'F';
		String rs = switch(score){
			case 'A' -> "优秀";
            case 'B' -> "良好";
            case 'C' -> "中";
            case 'D' -> "及格";
            case 'E' -> "不及格";
            default -> "成绩数据非法！";
		};
		System.out.println("结果是："+rs);
	}
}