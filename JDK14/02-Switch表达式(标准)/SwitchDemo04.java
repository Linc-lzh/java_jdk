/**
	目标：JDK 14新特性：switch使用yield返回一个结果。
		
	JDK 14中演示：switch使用yield返回一个结果。
*/
public class SwitchDemo04{
	public static void main(String[] args){
		// 定义一个变量 
		var score = '0';
		String rs = switch(score){
			case 'A','B' -> "上等";
            case 'C', 'D' -> "中等";
            case 'E' -> "不及格";
            default -> {
				if(score > 'E'){
					yield "您输入的成绩过大";
				}else{
					yield "成绩数据非法";
				}
			}
		};
		System.out.println("结果是："+rs);
	}
}