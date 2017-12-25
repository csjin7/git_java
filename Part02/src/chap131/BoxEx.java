package chap131;

public class BoxEx {

	public static void main(String[] args) {
		Box<String>	box1 = new Box<String>();
		//Box<String>	box1 = new Box();
		box1.set("헬로 만만세");
		
		String str = box1.get();
		System.out.println(str);
		
		Box<Integer> box2 = new Box<Integer>();
		box2.set(10);
		
		int val = box2.get();
		
		
		System.out.println(val);
		
		
		
		
		

	}

}
