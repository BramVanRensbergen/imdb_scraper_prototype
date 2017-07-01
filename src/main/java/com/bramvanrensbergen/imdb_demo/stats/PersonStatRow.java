package com.bramvanrensbergen.imdb_demo.stats;

import java.util.List;

import com.bramvanrensbergen.imdb_demo.data.Person;

/**
 * Object representing statistics generated for a specific actor. Created in the Statistics class.
 * @author Bram Van Rensbergen
 */
public class PersonStatRow {

	protected Person actor;
	protected int nbOfOccurrences = 0;
	protected double ratingSum = 0;
	protected int userRatingSum = 0;
	protected double ratingAvg;
	protected double userRatingAvg; 
	
	public PersonStatRow(Person actor) {
		this.actor = actor;
		
		nbOfOccurrences = 0;
		ratingSum = 0;
		userRatingSum = 0;
	}

	public Person getActor() {
		return actor;
	}

	public int getNbOfOccurrences() {
		return nbOfOccurrences;
	}

	public double getRatingSum() {
		return ratingSum;
	}

	public int getUserRatingSum() {
		return userRatingSum;
	}

	public String getRatingAvg() {
		return String.format( "%.2f", ratingAvg);
	}

	public String getUserRatingAvg() {
		return String.format( "%.2f", userRatingAvg);
	}
	
	protected static void calculateAndSetAllAverages(List<PersonStatRow> stats) {
		for (PersonStatRow p : stats) {
			p.ratingAvg = (double) p.ratingSum / p.nbOfOccurrences;
			p.userRatingAvg = (double) p.userRatingSum / p.nbOfOccurrences;			
		}
	}
}
