package chap15;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class VectorEx {

	public static void main(String[] args) {
		//List<Board> list = new Vector<Board>();
		List<Board> list = new Vector<>();
		
		list.add(new Board("제목1", "내용1", "글쓴이1"));
		list.add(new Board("제목2", "내용2", "글쓴이2"));
		list.add(new Board("제목3", "내용3", "글쓴이3"));
		list.add(new Board("제목4", "내용4", "글쓴이4"));
		list.add(new Board("제목5", "내용5", "글쓴이5"));
		
		list.remove(2);
		list.remove(3);
		

		for (Board board : list) {
			printlist(board);
		}
		System.out.println();
		
		List<Board> list2 = new ArrayList<>();
		
		list2.add(new Board("제목1", "내용1", "글쓴이1"));
		list2.add(new Board("제목2", "내용2", "글쓴이2"));
		list2.add(new Board("제목3", "내용3", "글쓴이3"));
		list2.add(new Board("제목4", "내용4", "글쓴이4"));
		list2.add(new Board("제목5", "내용5", "글쓴이5"));

		list2.remove(1);
		list2.remove(3);
		
		for (Board board : list2) {
			printlist(board);
		}
		
	}

	public static void printlist(Board board) {
		System.out.println(board.subject + "\t" + board.content + "\t" + board.writer);
	}
}
