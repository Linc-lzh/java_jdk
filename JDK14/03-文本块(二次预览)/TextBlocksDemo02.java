/**
	目标：JDK 14的新特性 文本块的缩进研究。
*/
public class TextBlocksDemo02{
	public static void main(String[] args){
		// 1、自动删除不必要的缩进。
		System.out.println("""
			hello
			itheima
			text 
			"""
		);
		
		// 2、会保留相对缩进
		System.out.println("""
			hello
				itheima
			text 
			"""
		);
		
		// 3.整体索进
		System.out.println("""
					hello
					itheima
					text 
			"""
		);
		
		// 4、结束行符在最后面的右边是无效的
		System.out.println("""
				hello
				itheima
				text 
						"""
		);
		
	}
}