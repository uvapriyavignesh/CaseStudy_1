package CaseStudy;

import java.util.LinkedList;

public class SearchSong {
	public static void test(String key, LinkedList l1) {
		key = key.toLowerCase();
		boolean found = false;
		for (Object Db : l1) {
			MusicDb musicDb = (MusicDb) Db;
			String first = musicDb.getTitle().toLowerCase();
			String sample =first.substring(0, key.length());
            //System.out.println(sample);
			if (sample.contains(key)) {
				System.out.println(musicDb);
				found = true;
				// System.out.println(" Music found succesfully :)");
			}

		}
		if (found) {
			System.out.println(" Music found succesfully :)");
		} else {

			System.out.println(" Music  not found :(");
		}

	}

}
