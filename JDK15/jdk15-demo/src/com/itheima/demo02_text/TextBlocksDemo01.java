package com.itheima.demo02_text;

/**
	目标：研究JDK 14中文本块的使用。
*/	
public class TextBlocksDemo01{
	public static void main(String[] args){
		String html = "<html>\n" +
              "    <body>\n" +
              "        <p>Hello, world</p>\n" +
              "    </body>\n" +
              "</html>\n";
		System.out.println(html);	  
		
		// 使用JDK 13 14 15中的文本块进行解决
		String html2 =  """
              <html>
                  <body>
                      <p>Hello, world</p>
                  </body>
              </html>
              """;
		System.out.println(html2);	
		
		String data1 = """
					line 1
					line 2
					line 3""";
					
		System.out.println(data1);		
		
		System.out.println("line 1\nline 2\nline 3\n");
		
		String sql = "select * from `CITY`\n"
			+ "where id > 6";
			
		String sql2 = """
			select * from `CITY`
			where id > 6
			""";
		System.out.println(sql2);	
	}
}
