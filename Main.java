import java.util.Random;
import java.util.Scanner;

public class Main {

    public static String getRandomWord(String [] words){
    Random random=new Random();
    int randomIndex=random.nextInt(words.length);

        return words[randomIndex];
    }

    public static void makeSentences( String [] names, String [] places,String [] verbs
    , String [] nouns,String [] adverbs, String [] details){

        while(true){
            String randomName=getRandomWord(names);
            String randomPlace=getRandomWord(places);
            String randomVerb=getRandomWord(verbs);
            String randomNoun=getRandomWord(nouns);
            String randomAdverb=getRandomWord(adverbs);
            String randomDetail=getRandomWord(details);

            System.out.printf("%s from %s %s %s %s %s\n"
                    ,randomName,randomPlace,randomAdverb,randomVerb
                    ,randomNoun,randomDetail);
            System.out.println("Click [ENTER] to generate a new one.");
            Scanner sc=new Scanner(System.in);
            String cont=sc.nextLine();
            if(cont.equals(""))
                continue;
            break;

        }
    }

    public static void main(String[] args) {
        String [] names={"Peter", "Michell", "Jane", "Steve"};
        String [] places={"Sofia", "Plovdiv", "Varna", "Burgas"};
        String [] verbs={"eats", "holds", "sees", "plays with", "brings"};
        String [] nouns={"stones", "cake", "apple", "laptop", "bikes"};
        String [] adverbs={"slowly", "diligently", "warmly", "sadly", "rapidly"};
        String [] details={"near the river", "at home", "in the park"};

        System.out.println("Sentence Generator Starts...");
        makeSentences(names,places,verbs,nouns,adverbs,details);

    }
}
