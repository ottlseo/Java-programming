
public class StudentScore extends StudentInformation {

	StudentScore(){}
	StudentScore(String id, String name, int korean, int math, int english){
		super(id,name); //StudentInformation클래스의 생성자 super()로 상속받기
		this.korean=korean;
		this.math=math;
		this.english=english; // 세 과목 변수에 인자로 받은 값 저장
	}
	private int korean, math, english;
	
	public int getKorean() {
		return this.korean; //korean의 getter메서드
	}
	public int getMath() {
		return this.math;//math의 getter메서드
	}
	public int getEnglish() {
		return this.english;//english의 getter메서드
	}
	
	public void display() {
		super.display(); //StudentInformation클래스의 display()메서드 오버라이딩
		System.out.print(korean+"	"+math+"	"+english+"	");
		System.out.print(sum()+"	"+std_avg(sum())); //std_avg 메서드에 sum()을 인자로 하여 평균 출력
		System.out.println("");
	}
	public int sum() {
		return korean+math+english; //korean, math, english 값의 합을 리턴
	}
	public double std_avg(int sum) { //학생 개인의 평균 출력
		return sum/3; //세 과목 합을 3으로 나눈, 평균 리턴
	}
	
		
}
