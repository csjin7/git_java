package chap141;

public class Student {
	private String name;
	private int englishScore;
	private int mathScore;
	private String sex;
	
	public Student(String name, int englishScore, int mathScore) {
		this.name = name;
		this.englishScore = englishScore;
		this.mathScore = mathScore;
	}
	
	public Student(String name, int englishScore, String sex) {
		this.name = name;
		this.englishScore = englishScore;
		this.sex = sex;
	}


	public String getName() {
		return name;
	}

	public int getEnglishScore() {
		return englishScore;
	}

	public int getMathScore() {
		return mathScore;
	}

	public String getSex() {
		return sex;
	}
	
}
