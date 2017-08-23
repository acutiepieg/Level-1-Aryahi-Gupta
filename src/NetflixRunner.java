
public class NetflixRunner {
	public static void main(String[] args) {
		// 1. Instantiate some Movie objects (at least 5).
		Movie lionKing = new Movie("The Lion King", 4);
		Movie incredibles = new Movie("The Incredibles", 3);
		Movie belle = new Movie("Beauty and the Beast", 5);
		Movie cauldron = new Movie("The Black Cauldron", 1);
		Movie peterPan = new Movie("Peter Pan", 2);

		// 2. Use the Movie class to get the ticket price of one of your movies.
		System.out.println(belle.getTicketPrice());
		System.out.println(cauldron.getTicketPrice());

		// 3. Instantiate a NetflixQueue.
		Queue q = new Queue();
		// 4. Add your movies to the Netflix queue.
		q.addMovie(peterPan);
		q.addMovie(cauldron);
		q.addMovie(belle);
		q.addMovie(incredibles);
		q.addMovie(lionKing);
		// 5. Print all the movies in your queue.
		q.sortMoviesByRating();
		q.printMovies();
		// 6. Use your NetflixQueue object to finish the sentence "the best movie
		// is...."
		System.out.println("The best movie is " + q.getBestMovie() );
		// 7. Use your NetflixQueue to finish the sentence "the second best movie
		// is...."
System.out.println("The second best movie is " + q.getMovie(1));
	}
}
