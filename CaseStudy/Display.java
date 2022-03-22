package CaseStudy;

import java.util.Comparator;
import java.util.LinkedList;

public class Display {
	public static void test(Comparator c1, LinkedList<MusicDb> db) {
		db.sort(c1);
		// System.out.println(db);
		System.out.println();
		System.out.println();

		for (MusicDb musicDb : db) {
			System.out.println(musicDb);

		}

	}
}
