package CaseStudy;



import java.util.LinkedList;
import java.util.Scanner;




public class ManipulateMusic {
	private static String title;
	private static String artist;
	private static String type;
	private static int id;
	private static String albumName;
	public static void add(LinkedList<MusicDb> list) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter song  Title, ArtistName, AlbumName, type ");
		id = list.size()+1;
		//sc.nextLine();
		title = sc.nextLine();
		artist = sc.nextLine();
		albumName = sc.nextLine();
		type = sc.nextLine();
		list.add(new MusicDb(id, title, artist, albumName, type));
		System.out.println("Song added to the PlayList!");
		for (MusicDb musicFiles : list) {
			System.out.println(musicFiles);
		}
	
		
	}
	public static void editExistingSong(LinkedList<MusicDb> list) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the song Id that you want to edit");
		int id = sc.nextInt();
		for(int i=0;i<list.size();i++) {
			//System.out.println(list.get(i)+":"+list.get(i).getSongId()+" --"+id);
			if(list.get(i).getId()==id) {
				System.out.println("Enter song name:");
				sc.nextLine();
				String title=sc.nextLine();
				System.out.println("Enter song artistName:");
				String artist=sc.nextLine();
				System.out.println("Enter song AlbumName:");
				String albumName=sc.nextLine();
				System.out.println("Enter song Type:");
				String type=sc.nextLine();
				System.out.println("After update:"+list.get(i));
				try {
				list.add(i, new MusicDb(id,title,artist, albumName, type));
				System.out.println("After update:"+list.get(i));
				System.out.println("song updated succesfully :)");
				}catch (Exception e) {
					System.out.println("updating song is failed!!!!");
				}
				
				break;
			}
		}

	}

	public static void deleteExistingSong(LinkedList<MusicDb> list) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the song Id that you want to Delete");
		int id = sc.nextInt();
		for(int i=0;i<list.size();i++) {
			//System.out.println(list.get(i)+":"+list.get(i).getSongId()+" --"+id);
			if(list.get(i).getId()==id) {
				try {
				System.out.println("Deleting..........:"+list.get(i));
				list.remove(i);//(i, new MusicFiles(id,title,songArtist, albumName, songType, "song"));
				
				System.out.println("song Deleted succesfully :)");
				}catch (Exception e) {
					System.out.println("Delete song is failed!!!!");
				}
				
				break;
			}
		}
	}

}
