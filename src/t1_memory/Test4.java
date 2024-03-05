package t1_memory;

public class Test4 {
	public static void main(String[] args) {
		String  name1 = "홍길동";
		String  name2 = new String("홍길동");//객체 생성(new)을 통해 1번과 같은위치가 아닌 새로운 객체를 생성한다
				
		if(name1 == name2) System.out.println("name1과 name2는 같습니다");
		else System.out.println("name1과 name2는 다릅니다");
		System.out.println();
		
		if(name1.equals("홍길동")) System.out.println("name1은 '홍길동' 입니다.");
		else System.out.println("name1은 '홍길동' 아닙니다");
		System.out.println();
		
		if(name1.equals(name2)) System.out.println("name1과 name2 같습니다.");
		else System.out.println("name1과 name2는 다릅니다.");
	}
}
