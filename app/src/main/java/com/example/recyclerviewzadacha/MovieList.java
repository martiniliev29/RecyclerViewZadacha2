package com.example.recyclerviewzadacha;

public class MovieList {
    public Movie[] generateMovies() {
        Movie movie = new Movie("Fast and Furious", "Action", 2001);
        Movie movie2 = new Movie("Taxi 2", "Action/Comedy", 2000);
        Movie movie3 = new Movie("Alien vs Predator", "Sci-Fi", 2004);
        Movie movie4 = new Movie("Avatar", "Sci-Fi", 2009);
        Movie movie5 = new Movie("Inception", "Sci-Fi", 2010);
        Movie movie6 = new Movie("Get Rich or Die Tryin'", "Drama", 2005);
        Movie movie7 = new Movie("Avengers: Endgame", "Fantasy", 2019);

        return new Movie[]{movie, movie2, movie3, movie4, movie5, movie6, movie7};
    }
}
