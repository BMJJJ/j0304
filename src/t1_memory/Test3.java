package t1_memory;
//name.equals(name2)를 붙이면 주소에 있는 번지가 아니라 번지에 저장된 내용으로 비교를한다
public class Test3 {
	public static void main(String[] args) {
		String  name1 = "홍길동";
		String  name2 = "홍길동";
				
		if(name1 == name2) System.out.println("name1과 name2는 같습니다");
		else System.out.println("name1과 name2는 다릅니다");
//이름이 완전히 같으면 먼저 만든곳을 가르키라고 시스템적으로 만듬 ex)name2는 만들어지지 않은것과 같다 
		System.out.println();
		
		if(name1.equals("홍길동")) System.out.println("name1은 '홍길동' 입니다.");
		else System.out.println("name1은 '홍길동' 아닙니다");
		System.out.println();
		
		if(name1.equals(name2)) System.out.println("name1과 name2 같습니다.");
		else System.out.println("name1과 name2는 다릅니다.");
	}
}
