package p0920;

public class ScoreAverage {
	public static void main(String[] args) {
		double score[][] = {{3.3, 3.4}, 	//1학년 1,2학기 평점
				{3.5, 3.6}, 	//2학년
				{3.7, 4.0}, 	//3학년
				{4.1, 4.2}};	//4학년
		double sum = 0;
		for(int year=0; year<score.length; year++)	//각 학년별로 반복
			for(int term=0; term<score[year].length; term++)	//각 학년의 학기별로 반복
				sum += score[year][term];	//전체 평점 합

		int n = score.length;	//배열의 행 개수, 4
		int m = score[0].length;	//배열의 열 개수, 2
		System.out.println("4년 전체 평점 평균은 " + sum/(n*m));
		
		//1학년의 평균 계산
		System.out.println("1학년 평균 = " + (score[0][0]+score[0][1])/2 );	
		//각 학년의 2학기 합
		System.out.println("2학기의 합 = " + (score[0][1]+score[1][1]+score[2][1]+score[3][1]));
		
		//각 학년의 성적 출력
		System.out.println("각 학년의 성적 출력");
		for(int i=0; i<score.length; i++) {
			for(int j=0; j<score[i].length; j++)
			System.out.println((i+1) + "학년 " + (j+1) + "학기의 성적 = " + score[i][j]);
		}
		
	}
}
