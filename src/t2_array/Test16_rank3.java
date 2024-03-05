package t2_array;

//순위를 구한후 순위 순으로 오름차순 출력하시오.
public class Test16_rank3 {
	public static void main(String[] args) {
		int[] no = {1,2,3,4,5};
		int[] su = {50,70,100,90,80};
		int[] rank = new int[su.length];//[]입력받은수만큼
		
		//순위구하기
		for(int i =1; i<=su.length; i++) {
			rank[i-1] = 1;
			for(int j=1;j<=su.length; j++) {
				if(su[i-1] < su[j-1]) rank[i-1] ++;
			}
		}
		
		//출력1
		System.out.println("===> 원본자료 출력");
		System.out.println("번호\t점수\t순위");
		System.out.println("===============");
		for(int i=0; i<su.length;i++) {
			System.out.println(no[i] + "\t" + su[i] + "\t" + rank[i]);
		}
		
		//순위순 오름차순 정렬처리
		int temp = 0;
		for(int i=1;i<=no.length-1;i++) {
			for(int j=i+1; j<=no.length; j++) {
				if(rank[i-1] > rank[j-1]) {
					temp = rank[i-1];rank[i-1] = rank[j-1];rank[j-1] = temp;//3줄이나 쓴이유는 랭크에 맞처서 다같이 대가족이동
					temp = no[i-1]; no[i-1] = no[j-1]; no[j-1] = temp;
					temp = su[i-1]; su[i-1] = su[j-1]; su[j-1] = temp;
				}
			}
		}
		
	  //출력2
			System.out.println("===>순위순 정렬자료 출력");
			System.out.println("점수\t순위");
			System.out.println("===============");
			for(int i=0; i<su.length;i++) {
				System.out.println(no[i] + "\t" + su[i] + "\t" + rank[i]);
			}
			
			
	}
}
