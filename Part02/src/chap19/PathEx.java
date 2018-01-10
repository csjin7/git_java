package chap19;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Iterator;

public class PathEx {

	public static void main(String[] args) {
		//Path path = Paths.get("src/chap19/PathEx.java");
		Path path = Paths.get("src/chap19/곤줄박이/test.txt");
		System.out.println("파일명 : " + path.getFileName());
		System.out.println("부모 디렉토리 명 : " + path.getParent().getFileName());
		System.out.println("충첩 경로수 : " + path.getNameCount());

		System.out.println();
		for (int i = 0; i < path.getNameCount(); i++) {
			System.out.println(path.getName(i));
		}
		
		System.out.println();
		
		Iterator<Path> iterator = path.iterator();
		while (iterator.hasNext()) {
			Path temp = iterator.next();
			System.out.println(temp.getFileName());
			
		}
		

	}

}
