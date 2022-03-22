package CaseStudy;

import java.util.LinkedList;
import java.util.Random;

public class RandomPlay {
	public static void play(LinkedList<MusicDb> l1) {
		Random ran = new Random();
		int key = ran.nextInt(l1.size() - 1);
		System.out.println("song playing");
		System.out.print(l1.get(key).getTitle());

		try {
			for (int i = 0; i < 10; i++) {
				System.out.print(".");

				Thread.sleep(900);
			}
			System.out.print("[completed]");
			System.out.println();

		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void playInOrder(LinkedList<MusicDb> l1) {
		System.out.println("song playing");
		try {
			for (int j = 0; j < l1.size() - 1; j++) {
				System.out.print(j + 1 + "|" + (l1.get(j).getTitle()));

				for (int i = 0; i < 10; i++) {
					System.out.print(".");

					Thread.sleep(900);
				}
				System.out.print("[completed]");
				System.out.println();
			}

		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
		}

	}

	public static void playBySearch(String key, LinkedList l1) {
		{
			key = key.toLowerCase();
			boolean found = false;
			for (Object Db : l1) {
				MusicDb musicDb = (MusicDb) Db;
				String first = musicDb.getTitle().toLowerCase();

				if (first.contains(key)) {
					System.out.println(musicDb.getTitle());
					System.out.print("song playing");
					try {
						for (int i = 0; i < 10; i++) {
							System.out.print(".");

							Thread.sleep(900);
						}
						System.out.print("[completed]");
						System.out.println();

					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					found = true;
					// System.out.println(" Music found succesfully :)");
				}

			}
		}

	}
}
