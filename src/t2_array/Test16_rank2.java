package t2_array;

public class Test16_rank2 {
	public static void main(String[] args) {
		int[] su = {50,70,100,90,80};
		int[] rank = new int[su.length];//[]입력받은수만큼
		
		//순위에 초기값(1) 부여하기
		for(int i =0; i<su.length; i++) {
			rank[i-1] = 1;
		}
		//순위구하기
		for(int i =1; i<=su.length; i++) {
			for(int j=i+1;j<=su.length; j++) {
				if(su[i-1] < su[j-1]) rank[i-1] ++;
				else if(su[i-1] > su[j-1]) rank[j-1] ++;
			}
		}
		
		//출력
		System.out.println("점수\t순위");
		System.out.println("===============");
		for(int i=0; i<su.length;i++) {
			System.out.println(su[i] + "\t" + rank[i]);
		}
	}
}
