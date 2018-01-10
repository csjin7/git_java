package chap19;

import java.nio.file.FileStore;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Path;

public class FileSystemEx {

	public static void main(String[] args) throws Exception {
		FileSystem fileSystem = FileSystems.getDefault();
		for (FileStore store : fileSystem.getFileStores()) {
			System.out.println(" 드리이브 명 : " + store.name());
			System.out.println(" 파일시스템 명 : " + store.type());
			
			System.out.println(" 전체 공간 : " + store.getTotalSpace() + " 바이트");
			System.out.println(" 사용 중인 공간 : " + (store.getTotalSpace() -  store.getUnallocatedSpace())  + " 바이트");
			System.out.println(" 사용 가능한 공간 getUsableSpace() :  " + store.getUsableSpace() + " 바이트");
			System.out.println(" 사용 가능한 공간 getUnallocatedSpace() : " + store.getUnallocatedSpace() + " 바이트");
			System.out.println();
		}
		
		System.out.println("파일 구분자 : " + fileSystem.getSeparator());
		System.out.println();
		
		for (Path path : fileSystem.getRootDirectories()) {
			System.out.println(path.toString());
		}

	}

}
