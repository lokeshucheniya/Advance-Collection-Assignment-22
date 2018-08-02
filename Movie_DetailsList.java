package in.co.capgemini;


import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Movie_DetailsList {
	
	Set<Movie_Details> movie = new LinkedHashSet<Movie_Details>();

	public void add_movie(Movie_Details movName) {
		movie.add(movName);
		System.out.println(movName.getMov_Name() +" Added");
	}
	
	public void remove_movie(String movName) {
		Predicate<Movie_Details> delmovie = Movie_Details -> Movie_Details.getMov_Name().equals(movName);
		movie.removeIf(delmovie);
	}
	
	public void remove_allmovie() {
		movie.clear();
		System.out.println("Cleared");
	}
	
	public boolean find_movie_By_mov_Name(String movName) {
		Predicate<Movie_Details>  find_movie_By_mov_Name = Movie_Details -> Movie_Details.getMov_Name().equals(movName);
		return movie.stream().anyMatch(find_movie_By_mov_Name);
	}
	
	public void disp() {
		Consumer<Movie_Details> disp = Movie_Details -> System.out.println(Movie_Details);
		movie.stream().forEach(disp);
	}
	
	public boolean find_movie_By_Genre(String movName) {
		Predicate<Movie_Details>  find_movie_By_Genre = Movie_Details -> Movie_Details.getGenre().equals(movName);
		return movie.stream().anyMatch(find_movie_By_Genre);
	}
	
	
	public void sort() {
		
		System.out.println("Sorting using Movie Name");
		System.out.println("#######################################################################################");
		movie.stream().sorted(Comparator.comparing(Movie_Details::getMov_Name)).forEach(System.out::println);
		
		
		System.out.println("Sorting using Movie Genre");
		System.out.println("#######################################################################################");
		movie.stream().sorted(Comparator.comparing(Movie_Details::getGenre)).forEach(System.out::println);
		
		
		System.out.println("Sorting based on Lead Actor ");
		System.out.println("#######################################################################################");
		movie.stream().sorted(Comparator.comparing(Movie_Details::getLead_Actor)).forEach(System.out::println);
		
		
		System.out.println("Sorting based on Lead Actress");
		System.out.println("#######################################################################################");
		movie.stream().sorted(Comparator.comparing(Movie_Details::getLead_Actress)).forEach(System.out::println);
	}
	
	
	
}	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

