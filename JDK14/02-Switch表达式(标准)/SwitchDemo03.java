/**
	Ŀ�꣺JDK 14�����ԣ�switch�Ķ�ֵƥ�䷽ʽ
		
	JDK 14����ʾ��switch�Ķ�ֵƥ�䷽ʽ���򻯹ᴩ�ԵĴ���д��
*/
public class SwitchDemo03{
	public static void main(String[] args){
		// ����һ������ 
		var score = 'A';
		String rs = switch(score){
			case 'A','B' -> "�ϵ�";
            case 'C', 'D' -> "�е�";
            case 'E' -> "������";
            default -> "�ɼ����ݷǷ���";
		};
		System.out.println("����ǣ�"+rs);
	}
}