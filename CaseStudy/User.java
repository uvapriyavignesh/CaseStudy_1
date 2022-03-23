package CaseStudy;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.Scanner;

//import com.te.learn.Assessment.musicplayer.MusicDb;

public class User {

	public void test() {
		boolean exit = true;
		Scanner s = new Scanner(System.in);
		int ch;
		LinkedList<MusicDb> db = new LinkedList<MusicDb>();

		db.add(new MusicDb(01, "Yathe Yathe", "G.V.Prakash", "Aadukalam", "Melody songs"));
		db.add(new MusicDb(02, "Venmegam", "Yuvan Shankar Raja", "Yaaradi Nee Mohini", "Melody songs"));
		db.add(new MusicDb(03, "Kani Mozhiyae", "Harris Jayaraj", "Irandam Ulagam", "Melody songs"));
		db.add(new MusicDb(04, "Yennodu Vaa Vaa", "Ilaiyaraaja", "Neethaney en Ponvasantham", "Melody songs"));
		db.add(new MusicDb(05, "Nallai Allai", "A.R.Rahman", "Kaatru Veliyidai", "Melody songs"));
		do {
			System.out.println("1. Press 1 to 'Play a Song'" + "\n2. Press 2 to 'Search a Song' "
					+ "\n3. Press 3 to 'Show all Songs'" + "\n4. Press 4 to 'Operate on Songs Database"
					+ "\n5. Press 5 to 'Exit' ");
			ch = s.nextInt();
			switch (ch) {
			case 1:
				System.out.println("1. Press 1 to 'Play by order'" + "\n2. Press 2 to 'Search a Song and play' "
						+ "\n3. Press 3 to 'play random'");
				int key1 = s.nextInt();
				switch (key1) {
				case 1:
					System.out.println("================Music====================");
					RandomPlay.playInOrder(db);
					
					break;
				case 2:
					System.out.println("Enter the key to search: ");
					s.nextLine();
					String skey = s.nextLine();
					RandomPlay.playBySearch(skey, db);
					System.out.println("================Music====================");
					break;
				case 3:

					RandomPlay.play(db);
					System.out.println("================Music====================");
					break;

				default:
					System.out.println("WARNING!!!! \n Enter correct option");
					break;
				}
				// RandomPlay.play(db);
				System.out.println("================Music====================");
				break;
			case 2:
				System.out.println("Enter the key to search: ");
				s.nextLine();
				String key = s.nextLine();
				SearchSong.test(key, db);
				System.out.println("================Music====================");
				break;
			case 3:
				System.out.println("\n3. Press 3 to 'Show all Songs'");
				Comparator<MusicDb> c1 = (o1, o2) -> {
					MusicDb m1 = (MusicDb) o1;
					MusicDb m2 = (MusicDb) o2;
					String m1l = m1.getTitle().toLowerCase();
					String m2l = m2.getTitle().toLowerCase();
					if (m1l.charAt(0) < m2l.charAt(0)) {
						return -1;
					} else if (m1l.charAt(0) > m2l.charAt(0)) {
						return 1;
					}
					return 0;
				};
				LinkedList<MusicDb> sortByName = db;
				Display.test(c1, sortByName);
				System.out.println("================Music====================");
				break;
			case 4:
				System.out.println("\n Press A to Add new Song\n Press B to Edit Song\n Press C to Delete Song");
				s.nextLine();
				String choose = s.nextLine();
				switch (choose) {
				case "A":
					ManipulateMusic.add(db);
					break;
				case "B":
					ManipulateMusic.editExistingSong(db);
					break;
				case "C":
					ManipulateMusic.deleteExistingSong(db);
					break;

				default:
					System.out.println("WARNING!!!! \n Enter correct option");
					break;
				}
				System.out.println("================Music====================");
				// ManipulateMusic.deleteExistingSong(db);
				break;
			case 5:
				System.out.println("\n'Exit' Sucessfully ");
				exit = false;
				break;

			default:
				System.out.println("WARNING!!!! \n Enter correct option");
				break;
			}

		} while (exit);

	}
}
