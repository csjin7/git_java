package chap131;

public class MyFunctionalInterfaceEx {

	public static void main(String[] args) {
		MyFunctionalInterface fi;
		
//		fi = (x,y)->{
//			int result = x + y;
//			return result;
//		};
//		
//		System.out.println(fi.method(2, 5));
//		
//		fi = (x, y)->{
//			return x + y;
//		};
//		
//		System.out.println(fi.method(2, 5));
//		
//		fi = (x,y)-> x + y;
//		System.out.println(fi.method(2, 5));
//	
//		fi = (x,y) -> sum(x,y);
//		System.out.println(fi.method(2, 5));
//		
//		
//		
		
		
		
//		fi = (x)->{
//			int result = x+5;
//			System.out.println(result);
//		};
//		
//		fi.method(2);   
//		
//				
//		
//		fi = (x)->{
//			System.out.println(x*5);
//		};
//		
//		fi.method(2);
//		
//		fi = x-> System.out.println(x*5);
//		
//		fi.method(2);
//		
//		fi = new MyFunctionalInterface( ) {
//			@Override
//			public void method(int x) {
//				System.out.println(x*10);
//			}
//		};
//		
//		fi.method(2);
		
		

	}
	
	public static int sum(int x, int y) {
		return (x+y);
	}
}

