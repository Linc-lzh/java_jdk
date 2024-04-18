import java.util.Objects;
/**
	Ŀ�꣺JDK 14��������ģʽƥ����Ƽ򻯶������ݱȽϵĴ���д����	
	
	��дhashCode()��equals()�����Ƚ϶���������Ƿ�һ����
	
		
*/
public class InstanceofDemo04{
	public static void main(String[] args){
		Student s1 = new Student("����");
		Student s2 = new Student("����");
		System.out.println(s1.equals(s2));
	}
}

class Student{
	private String name;
	
	public Student(String name){
		this.name = name;
	}
	
	/*
	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Student student = (Student) o;
		return Objects.equals(name, student.name);
	}
	*/
	
	// JDK 14֮���instanceof��ģʽƥ����Ƽ�equals�������д 
	@Override
	public boolean equals(Object o){
		return o instanceof Student s && Objects.equals(this.name , s.name); 
	}
	
	 @Override
    public int hashCode() {
        return Objects.hash(name);
    }
	
}