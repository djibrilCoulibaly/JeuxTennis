package Tennis;

import java.util.Arrays;
import java.util.List;

public class Joueur {
	
	
    private String nomJoueur;
	private  int scoreJoueur;
	public static final List<String>points=Arrays.asList("0","15","30","40");
	
	
	
	public Joueur(String nomJoueur) {
        this.nomJoueur = nomJoueur;
    }
	
	
	public int getScoreJoueur() {
		return scoreJoueur;
	}

	public void setScoreJoueur(int scoreJoueur) {
		this.scoreJoueur = scoreJoueur;
	}




	public String getNomJoueur() {
		return nomJoueur;
	}
	

	public void Ball() {
       scoreJoueur += scoreJoueur ;
    }
	
	
	 public String getScorePoints(){
	        return points.get(scoreJoueur);
	    }

	
}
