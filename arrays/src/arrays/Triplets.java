/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrays;

import java.util.ArrayList;

/**
 *
 * @author Hanley
 */
public class Triplets {
public static void main(String[] args) {
            //This program will use a dynamic arrays
        ArrayList<String> nouns = new ArrayList<String>();
        nouns.add("cat");
        nouns.add("dog");
        nouns.add("horse");
        nouns.add("goat");
        nouns.add("eagle");
        nouns.add("lion");
        nouns.add("giraffe");

        ArrayList<String> verbs1 = new ArrayList<String>();
        verbs1.add("jumped");
        verbs1.add("raced");
        verbs1.add("ran");
 
    
        ArrayList<String> verbs2 = new ArrayList<String>();
        verbs2.add("eat");
        verbs2.add("hug");
        verbs2.add("trip");
        verbs2.add("tap");
    
        ArrayList<String> rhymingNouns = new ArrayList<String>();
        rhymingNouns.add("hair");
        rhymingNouns.add("chair");
        rhymingNouns.add("millionaire");
        rhymingNouns.add("air");
        rhymingNouns.add("armchair");
        rhymingNouns.add("horsehair");
        
        ArrayList<String> rhymingNounsB = new ArrayList<String>();
        rhymingNounsB.add("bear");
        rhymingNounsB.add("pear");

        String noun;
        String verb1, verb2;
        String rhymingNoun1, rhymingNoun2;
        String rhymingNounB;
        int randomNum;

        //get a random noun from the nouns array
        //use .size() to get the # of elements
        randomNum = (int) (Math.random() * nouns.size());
        noun = nouns.get(randomNum);

        //get the first random verb from the verbs array &
        // remove from ArrayList
        randomNum = (int) (Math.random() * verbs1.size());
        verb1 = verbs1.get(randomNum);
        verbs1.remove(randomNum);

        //get the second random verb from verbs array and remove it
        randomNum = (int) (Math.random() * verbs2.size());
        verb2 = verbs2.get(randomNum);
        verbs2.remove(randomNum);

        //get the first rhyming noun and remove it
        randomNum = (int) (Math.random() * rhymingNouns.size());
        rhymingNoun1 = rhymingNouns.get(randomNum);
        rhymingNouns.remove(randomNum);

        //get the thirs rhyming noun and remove it
        randomNum = (int) (Math.random() * rhymingNouns.size());
        rhymingNoun2 = rhymingNouns.get(randomNum);
        rhymingNouns.remove(randomNum);

        //get the second rhyming noun and remove it
        randomNum = (int) (Math.random() * rhymingNounsB.size());
        rhymingNounB = rhymingNounsB.get(randomNum);
        rhymingNounsB.remove(randomNum);


        //Display the poem
        System.out.println(" The " + noun + " " + verb1 + " to the " + 
          rhymingNoun1 + "\n" + " So it could  " + verb2 + 
          "  the " + rhymingNounB +
                "\n But it was a " + rhymingNoun2);
  }
    
}
