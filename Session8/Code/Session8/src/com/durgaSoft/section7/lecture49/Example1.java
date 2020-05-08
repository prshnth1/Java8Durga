package com.durgaSoft.section7.lecture49;

import java.util.ArrayList;
import java.util.function.Consumer;

public class Example1 {
	public static void main(String[] args) {
		
		ArrayList<Movie> moviesList=new ArrayList<Movie>();
		populateMovies(moviesList);
		Consumer<Movie> movieConsumer = movie -> System.out.println(movie);
		
		for (Movie movie : moviesList) {
			movieConsumer.accept(movie);
		}
	}

	private static void populateMovies(ArrayList<Movie> moviesList) {
		// TODO Auto-generated method stub
		moviesList.add(new Movie("name1", "hero1", "heroine1"));
		moviesList.add(new Movie("name2", "hero2", "heroine2"));
		moviesList.add(new Movie("name3", "hero3", "heroine3"));
		moviesList.add(new Movie("name4", "hero4", "heroine4"));
		moviesList.add(new Movie("name5", "hero5", "heroine5"));
		
	}
}

class Movie {

	String name;
	String hero;
	String heorine;

	public Movie(String name, String hero, String heorine) {
		super();
		this.name = name;
		this.hero = hero;
		this.heorine = heorine;
	}

	@Override
	public String toString() {
		return "name=" + name + ", hero=" + hero + ", heorine=" + heorine;
	};
	
	

}
