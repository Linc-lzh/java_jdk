/**
	Ŀ�꣺JDK 14�����ԣ�switch��Ϊ���ʽ���õ�һ�������
		
	JDK 14����ʾ��swicth������Ϊ���ʽ��һ��������أ�	
*/
public class SwitchDemo02{
	public static void main(String[] args){
		// ����һ������ 
		var score = 'F';
		String rs = switch(score){
			case 'A' -> "����";
            case 'B' -> "����";
            case 'C' -> "��";
            case 'D' -> "����";
            case 'E' -> "������";
            default -> "�ɼ����ݷǷ���";
		};
		System.out.println("����ǣ�"+rs);
	}
}