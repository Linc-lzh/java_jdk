/**
	Ŀ�꣺JDK 14�����ԣ�switchʹ��yield����һ�������
		
	JDK 14����ʾ��switchʹ��yield����һ�������
*/
public class SwitchDemo04{
	public static void main(String[] args){
		// ����һ������ 
		var score = '0';
		String rs = switch(score){
			case 'A','B' -> "�ϵ�";
            case 'C', 'D' -> "�е�";
            case 'E' -> "������";
            default -> {
				if(score > 'E'){
					yield "������ĳɼ�����";
				}else{
					yield "�ɼ����ݷǷ�";
				}
			}
		};
		System.out.println("����ǣ�"+rs);
	}
}