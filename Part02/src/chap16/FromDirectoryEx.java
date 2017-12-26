package chap16;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Iterator;
import java.util.stream.Stream;

public class FromDirectoryEx {

	public static void main(String[] args) throws IOException {
		Path path = Paths.get("D:/A영화");
		//Path path = Paths.get("src/chap16");
		Stream<Path> stream = Files.list(path);
				
		stream.forEach(p-> System.out.println(p.getFileName()));

	}

}
