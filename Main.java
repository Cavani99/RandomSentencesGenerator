import java.util.Random;
import java.util.Scanner;

public class Main {

    public static String getRandomWord(String [] words){
    Random random=new Random();
    int randomIndex=random.nextInt(words.length);

        return words[randomIndex];
    }

    public static void makeSentences(){

        String [] names={"Peter", "Michell", "Jane", "Steve"};
        String [] places={"Sofia", "Plovdiv", "Varna", "Burgas"};
        String [] verbs={"eats", "holds", "sees", "plays with", "brings","features", "satisfies", "bids", "clutches", "begins"};
        String [] nouns={"stones", "cake", "apple", "laptop", "bikes","permission",
                "story", "committee", "championship", "insurance", "childhood", "guitar", "mixture",
                "historian", "winner", "friendship", "event", "perspective", "singer", "basket", "feedback",
                "media", "hotel", "instruction", "indication", "employee", "health", "currency",
                "development", "country", "revenue", "finding", "affair", "perception", "activity"};
        String [] concreteNouns={"mouse", "bean", "nose", "water", "shark","stones", "cake", "apple", "laptop", "bikes","hand", "sandal", "balloon", "finger", "stove"
        ,"lake","mountain","river","desert","city","town","village","road","bed","lady", "ostrich", "bow", "rice", "belt"};
        String [] adverbs={"slowly", "diligently", "warmly", "sadly", "rapidly"};
        String [] details={"near the river", "at home", "in the park"};
        String [] locationSides={"near","at","in","around","outside","underneath","along","within","via"
        ,"by","through"};



        Random random=new Random();
        System.out.println("Sentence Generator Starts...");
        while(true){
            int i= random.nextInt(0,2);

            switch (i) {
                case 0 -> structure1(names, places, verbs, concreteNouns, adverbs, details);
                case 1 -> structure2(verbs, concreteNouns, details,locationSides,places);
            }

            System.out.println("Click [ENTER] to generate a new one.");
            Scanner sc=new Scanner(System.in);
            String cont=sc.nextLine();
            if(cont.equals(""))
                continue;
            break;

        }
    }

    public static void structure1(String [] names, String [] places,String [] verbs,
    String [] nouns, String [] adverbs,String [] details){
        String randomName=getRandomWord(names);
        String randomPlace=getRandomWord(places);
        String randomVerb=getRandomWord(verbs);
        String randomNoun=getRandomWord(nouns);
        String randomAdverb=getRandomWord(adverbs);
        String randomDetail=getRandomWord(details);

        switch (randomNoun.charAt(0)) {
            case 'A', 'E', 'I', 'O', 'U', 'a', 'e', 'i', 'o', 'u' -> System.out.printf("%s from %s %s %s an %s %s\n"
                    , randomName, randomPlace, randomAdverb, randomVerb
                    , randomNoun, randomDetail);
            default -> System.out.printf("%s from %s %s %s a %s %s\n"
                    , randomName, randomPlace, randomAdverb, randomVerb
                    , randomNoun, randomDetail);
        }

    }

    public static void structure2(String [] verbs,String [] nouns,String[] details,String[]locationDet,String [] places){

        String randomVerb=getRandomWord(verbs);
        String randomNoun=getRandomWord(nouns);
        String randomDetail=getRandomWord(details);
        String randomSide=getRandomWord(locationDet);
        String randomPlace=getRandomWord(places);
        String secondNoun=getRandomWord(nouns);

        Random random=new Random();
        int placeOrNounOrDetail=random.nextInt(0,3);

        switch (placeOrNounOrDetail) {
            case 0 -> {
                if (randomNoun.charAt(randomNoun.length() - 1) == 's')
                    System.out.printf("Who %s %s %s\n", randomVerb, randomNoun, randomDetail);
                else {
                    switch (randomNoun.charAt(0)) {
                        case 'A', 'E', 'I', 'O', 'U', 'a', 'e', 'i', 'o', 'u' ->
                                System.out.printf("Who %s an %s %s?\n", randomVerb, randomNoun, randomDetail);
                        default -> System.out.printf("Who %s a %s %s?\n", randomVerb, randomNoun, randomDetail);
                    }
                }
            }
            case 1 -> {
                if (randomNoun.charAt(randomNoun.length() - 1) == 's') {
                    if (secondNoun.charAt(secondNoun.length() - 1) == 's')
                        System.out.printf("Who %s %s %s %s\n", randomVerb, randomNoun, randomSide, secondNoun);
                    else {
                        switch (secondNoun.charAt(0)) {
                            case 'A', 'E', 'I', 'O', 'U', 'a', 'e', 'i', 'o', 'u' ->
                                    System.out.printf("Who %s %s %s an %s\n", randomVerb, randomNoun, randomSide, secondNoun);
                            default ->
                                    System.out.printf("Who %s %s %s a %s\n", randomVerb, randomNoun, randomSide, secondNoun);
                        }
                    }
                } else {
                    switch (randomNoun.charAt(0)) {
                        case 'A', 'E', 'I', 'O', 'U', 'a', 'e', 'i', 'o', 'u' -> {
                            if (secondNoun.charAt(secondNoun.length() - 1) == 's')
                                System.out.printf("Who %s an %s %s %s\n", randomVerb, randomNoun, randomSide, secondNoun);
                            else {
                                switch (secondNoun.charAt(0)) {
                                    case 'A', 'E', 'I', 'O', 'U', 'a', 'e', 'i', 'o', 'u' ->
                                            System.out.printf("Who %s an %s %s an %s\n", randomVerb, randomNoun, randomSide, secondNoun);
                                    default ->
                                            System.out.printf("Who %s an %s %s a %s\n", randomVerb, randomNoun, randomSide, secondNoun);
                                }
                            }
                        }
                        default -> {
                            if (secondNoun.charAt(secondNoun.length() - 1) == 's')
                                System.out.printf("Who %s an %s %s %s\n", randomVerb, randomNoun, randomSide, secondNoun);
                            else {
                                switch (secondNoun.charAt(0)) {
                                    case 'A', 'E', 'I', 'O', 'U', 'a', 'e', 'i', 'o', 'u' ->
                                            System.out.printf("Who %s a %s %s an %s\n", randomVerb, randomNoun, randomSide, secondNoun);
                                    default ->
                                            System.out.printf("Who %s a %s %s a %s\n", randomVerb, randomNoun, randomSide, secondNoun);
                                }
                            }
                        }
                    }
                }
            }
            case 2 -> {
                if (randomNoun.charAt(randomNoun.length() - 1) == 's')
                    System.out.printf("Who %s %s %s %s\n", randomVerb, randomNoun, randomSide, randomPlace);
                else {
                    switch (randomNoun.charAt(0)) {
                        case 'A', 'E', 'I', 'O', 'U', 'a', 'e', 'i', 'o', 'u' ->
                                System.out.printf("Who %s an %s %s %s\n", randomVerb, randomNoun, randomSide, randomPlace);
                        default ->
                                System.out.printf("Who %s a %s %s %s\n", randomVerb, randomNoun, randomSide, randomPlace);
                    }
                }
            }
        }

    }

    public static void main(String[] args) {

        makeSentences();

    }
}
