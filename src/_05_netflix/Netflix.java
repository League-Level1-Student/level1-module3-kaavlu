package _05_netflix;

import java.util.ArrayList;

public class Netflix {
	public static void main(String[] args) {
		Movie movie1 = new Movie("Fast and Furious 1", 1);
		Movie movie2 = new Movie("Fast and Furious 2", 2);
		Movie movie3 = new Movie("Fast and Furious 3", 3);
		Movie movie4 = new Movie("Fast and Furious 4", 4);
		Movie movie5 = new Movie("Fast and Furious 5", 5);
		
		movie1.getTicketPrice();
		movie2.getTicketPrice();
		movie3.getTicketPrice();
		movie4.getTicketPrice();
		movie5.getTicketPrice();
		NetflixQueue newQ = new NetflixQueue();
		newQ.addMovie(movie1);
		newQ.addMovie(movie2);
		newQ.addMovie(movie3);
		newQ.addMovie(movie4);
		newQ.addMovie(movie5);
		
		newQ.printMovies();
		
		newQ.get1BestMovie();
		newQ.get2BestMovie();
	}
}
