/**
	Ŀ�꣺JDK 14�����ԣ�switch���ʽ�ı�׼��д����
		
	JDK 14����ʾ��switch������дbreakҲ���ᷢ���ᴩ���󣡿���ʡ��break��	
	
	С�᣺
		JDK 14���Ѿ�ȷ����switch������дbreak�Ϳ���ʵ��switch��֧����������ṹ���˺ܶ࣡
*/
public class SwitchDemo01{
	public static void main(String[] args){
		// ����һ������ 
		var score = 'C';
		switch(score){
			case 'A' -> System.out.println("����");
            case 'B' -> System.out.println("����");
            case 'C' -> System.out.println("��");
            case 'D' -> System.out.println("����");
            case 'E' -> System.out.println("������");
            default -> System.out.println("�ɼ����ݷǷ���");
		}
	}
}