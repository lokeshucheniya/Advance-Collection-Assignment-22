package in.co.capgemini;

public class Movietest {
	public static void main(String args[]) {
		Movie_DetailsList movie = new Movie_DetailsList();
		movie.add_movie(new Movie_Details("Sample5", "Actor9", "Actress1", "Genre1"));
		movie.add_movie(new Movie_Details("Sample2", "Actor5", "Actress2", "Genre2"));
		movie.add_movie(new Movie_Details("Sample1", "Actor2", "Actress3", "Genre3"));
		movie.add_movie(new Movie_Details("Sample4", "Actor1", "Actress4", "Genre4"));
		movie.add_movie(new Movie_Details("Sample3", "Actor7", "Actress5", "Genre5"));
		
		
		boolean checkByName = movie.find_movie_By_mov_Name("Sample12");
		
		if(checkByName) {
			System.out.println("Movie found");
		}
		else {
			System.out.println("Movie Not found");
		}
		
		
		boolean checkByGenre = movie.find_movie_By_Genre("Genre12");
		
		if(checkByGenre) {
			System.out.println("Genre found");
		}
		else {
			System.out.println("Genre Not found");
		}
		
		movie.sort();
		movie.remove_movie("Sampl2 ");
		movie.remove_allmovie();
		movie.disp();
		
		
		
	}
}
