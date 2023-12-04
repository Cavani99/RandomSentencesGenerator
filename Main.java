import java.util.Random;
import java.util.Scanner;

public class Main {

    public static String getRandomWord(String [] words){
    Random random=new Random();
    int randomIndex=random.nextInt(words.length);

        return words[randomIndex];
    }

    public static void makeSentences(){

        String [] names={"Peter", "Michell", "Jane", "Steve","Evgeni","Sam","Adam"};
        String [] places={"Sofia", "Plovdiv", "Varna", "Burgas","Ruse","Czech Republic","Germany","Gibraltar"};
        String [] verbsWithS={"eats", "holds", "sees", "plays with", "brings","features", "satisfies", "bids", "clutches", "begins"};
        String [] nouns={"stone", "cake", "apple", "laptop", "bike","permission",
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
        String [] verbs={"eat", "hold", "see", "play", "bring", "satisfy", "bid", "clutch", "begin","hang","ask","replace","admire","frighten"};
        String[] adjectives={"intelligent","painful","nauseating","naive","dark","tasteful","tall","pointless","classy","pathetic"};

        Random random=new Random();
        System.out.println("Sentence Generator Starts...");
        while(true){
            int i= random.nextInt(0,5);

            switch (i) {
                case 0 -> structure1(names, places, verbsWithS, concreteNouns, adverbs, details);
                case 1 -> structure2(verbsWithS, concreteNouns, details,locationSides,places);
                case 2 -> structure3(nouns,details,locationSides,names,places);
                case 3 -> structure4(verbs,nouns);
                case 4 -> structure5(nouns,adjectives);
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
                                    System.out.printf("Who %s %s %s an %s?\n", randomVerb, randomNoun, randomSide, secondNoun);
                            default ->
                                    System.out.printf("Who %s %s %s a %s?\n", randomVerb, randomNoun, randomSide, secondNoun);
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
                                            System.out.printf("Who %s an %s %s an %s?\n", randomVerb, randomNoun, randomSide, secondNoun);
                                    default ->
                                            System.out.printf("Who %s an %s %s a %s?\n", randomVerb, randomNoun, randomSide, secondNoun);
                                }
                            }
                        }
                        default -> {
                            if (secondNoun.charAt(secondNoun.length() - 1) == 's')
                                System.out.printf("Who %s an %s %s %s?\n", randomVerb, randomNoun, randomSide, secondNoun);
                            else {
                                switch (secondNoun.charAt(0)) {
                                    case 'A', 'E', 'I', 'O', 'U', 'a', 'e', 'i', 'o', 'u' ->
                                            System.out.printf("Who %s a %s %s an %s?\n", randomVerb, randomNoun, randomSide, secondNoun);
                                    default ->
                                            System.out.printf("Who %s a %s %s a %s?\n", randomVerb, randomNoun, randomSide, secondNoun);
                                }
                            }
                        }
                    }
                }
            }
            case 2 -> {
                if (randomNoun.charAt(randomNoun.length() - 1) == 's')
                    System.out.printf("Who %s %s %s %s?\n", randomVerb, randomNoun, randomSide, randomPlace);
                else {
                    switch (randomNoun.charAt(0)) {
                        case 'A', 'E', 'I', 'O', 'U', 'a', 'e', 'i', 'o', 'u' ->
                                System.out.printf("Who %s an %s %s %s?\n", randomVerb, randomNoun, randomSide, randomPlace);
                        default ->
                                System.out.printf("Who %s a %s %s %s?\n", randomVerb, randomNoun, randomSide, randomPlace);
                    }
                }
            }
        }

    }

    public static String pluralize(String input){
        char lastSymbol=input.charAt(input.length()-1);
        String lastTwoSymbols=input.substring(input.length()-2,input.length()-1);


        if(lastSymbol=='s' || lastSymbol=='z' || lastSymbol=='x' || lastTwoSymbols.equals("sh")
        || lastTwoSymbols.equals("ch")){
            if(input.length()>3)
                return input+"es";
            else
                return input+lastSymbol+"es";
        }
        if(lastSymbol=='y'){
            char secondLast=input.charAt(input.length()-2);
            switch (secondLast) {
                case 'A', 'E', 'I', 'O', 'U', 'a', 'e', 'i', 'o', 'u' -> {
                    return input + "s";
                }
                default -> {
                    String cut=input.substring(0,input.length()-1);
                    return cut+"ies";
                }
            }
        }

        String substring = input.substring(0, input.length() - 2);
        if(lastTwoSymbols.equals("us")){
            return substring +"i";
        }
        if(lastTwoSymbols.equals("is")){
            return substring +"es";
        }
        if(lastTwoSymbols.equals("on")){
            return substring +"a";
        }

        return input+"s";
    }

    public static void structure3(String [] nouns, String [] details, String [] sides,String [] names,String [] places){

        String randomNoun=getRandomWord(nouns);
        String randomDetail=getRandomWord(details);
        String randomSide=getRandomWord(sides);

        Random random=new Random();
        int amount=random.nextInt(1,21);
        int detailedLocationOrSide=random.nextInt(0,2);

        //There must be at least {1-21} [noun]{s} [location/side+ person|place]!
        if(amount>1)
            randomNoun=pluralize(randomNoun);

        switch (detailedLocationOrSide) {
            case 0 -> System.out.printf("There must be at least %d %s %s!\n",
                    amount, randomNoun, randomDetail);
            case 1 -> {
                int personOrPlace = random.nextInt(0, 2);
                if (personOrPlace == 0) {
                    String randomName = getRandomWord(names);
                    System.out.printf("There must be at least %d %s %s %s!\n",
                            amount, randomNoun, randomSide, randomName);
                } else {
                    String randomPlace = getRandomWord(places);
                    System.out.printf("There must be at least %d %s %s %s!\n",
                            amount, randomNoun, randomSide, randomPlace);
                }
            }
        }
    }

    public static void structure4(String []verbs,String[]nouns){
        //I wish I could [verb] that [noun].
        String randomNoun=getRandomWord(nouns);
        String randomVerb=getRandomWord(verbs);

        System.out.printf("I wish I could %s this %s",randomVerb,randomNoun);

        Random random=new Random();
        int extraPart= random.nextInt(0,2);
        if(extraPart==0){
            System.out.println(".");
        }else {
            randomNoun = getRandomWord(nouns);
            randomVerb = getRandomWord(verbs);

            System.out.printf(" and %s the %s.\n", randomVerb, randomNoun);

        }
    }

    public static void structure5(String []nouns,String[] adjectives){
        //This [noun] seems [adjective]
        String randomNoun=getRandomWord(nouns);
        String randomAdjective=getRandomWord(adjectives);

        Random random=new Random();
        int pluralOrNot=random.nextInt(0,2);

        if(pluralOrNot==0){
            System.out.printf("This %s seems %s.\n",randomNoun,randomAdjective);
        }else{
            randomNoun=pluralize(randomNoun);

            System.out.printf("This %s seem %s.\n",randomNoun,randomAdjective);
        }
    }


    public static void main(String[] args) {

        makeSentences();

    }
}
