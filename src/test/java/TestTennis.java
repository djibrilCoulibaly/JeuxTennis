import static org.junit.Assert.*;

import org.hamcrest.Matcher;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.Matchers.hasProperty;

import org.junit.Before;
import org.junit.Test;

import tennis.model.Jeux;
import tennis.model.Joueur;

public class TestTennis {

	Joueur joueur1;
	Joueur joueur2;
	Jeux jeux;

	@Before
	public void beforeTest() {

		Joueur joueur1 = new Joueur("joueur1");
		Joueur joueur2 = new Joueur("joueur2");
		jeux = new Jeux(joueur1, joueur2);
	}

	@Test
	public void Score0() {

		Jeux jeux = new Jeux(joueur1, joueur2);
		assertThat(jeux, hasProperty("score", is("0,0")));
	}

	



	@Test
	public void Score1() {
		Jeux jeux = new Jeux(joueur1, joueur2);
		joueur1.Ball();
		assertThat(jeux, hasProperty("score", is("15,0")));
	}

	@Test
	public void Score2() {
		Jeux jeux = new Jeux(joueur1, joueur2);
		joueur1.Ball();
		joueur1.Ball();
		assertThat(jeux, hasProperty("score", is("30,0")));
	}

	@Test
	public void Score3() {
		Jeux jeux = new Jeux(joueur1, joueur2);
		joueur1.Ball();
		joueur1.Ball();
		joueur1.Ball();
		assertThat(jeux, hasProperty("score", is("40,0")));
	}

	@Test
	public void Score4() {
		Jeux jeux = new Jeux(joueur1, joueur2);
		joueur1.Ball();
		joueur1.Ball();
		joueur2.Ball();
		assertThat(jeux, hasProperty("score", is("30,15")));
	}
	
	@Test
	public void Score5() {
		Jeux jeux = new Jeux(joueur1, joueur2);
		joueur1.Ball();
		joueur1.Ball();
		joueur2.Ball();
		assertThat(jeux, hasProperty("score", is("30,15")));
	}
	
	
	@Test
	public void Deuce() {
		Jeux jeux = new Jeux(joueur1, joueur2);
		joueur1.Ball();
		joueur1.Ball();
		joueur1.Ball();
		joueur2.Ball();
		joueur2.Ball();
		joueur2.Ball();
		assertThat(jeux, hasProperty("score", is("Deuce")));
		
	}
	
	
	@Test
	public void Deuce2() {
		Jeux jeux = new Jeux(joueur1, joueur2);
		joueur1.Ball();
		joueur1.Ball();
		joueur1.Ball();
		joueur2.Ball();
		joueur2.Ball();
		joueur2.Ball();
		assertThat(jeux, hasProperty("score", is("Deuce")));
		joueur1.Ball();
		assertThat(jeux, hasProperty("score", is(not(" Deuce"))));
		joueur2.Ball();
		assertThat(jeux, hasProperty("score", is("Deuce")));
	}
	
	@Test
	public void Avantage() {
		Jeux jeux = new Jeux(joueur1, joueur2);
		joueur1.Ball();
		joueur1.Ball();
		joueur1.Ball();
		joueur2.Ball();
		joueur2.Ball();
		joueur2.Ball();
		joueur2.Ball();
		assertThat(jeux, hasProperty("score", is("Avantage joueur2")));
	}

	@Test
	public void Gagnant() {
		Jeux jeux = new Jeux(joueur1, joueur2);
		joueur1.Ball();
		joueur1.Ball();
		joueur1.Ball();
		joueur2.Ball();
		joueur2.Ball();
		joueur2.Ball();
		joueur2.Ball();
		assertThat(jeux, hasProperty("score", is(not("joueur2 gagne"))));
		joueur2.Ball();
		assertThat(jeux, hasProperty("score", is("joueur 2 gagne")));
	}

	
	
	
	
}
