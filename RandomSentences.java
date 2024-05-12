import java.util.Random;

public class RandomSentences {
    public static void main(String[] args) {
        String[] articles = { "the", "a", "one", "some", "any" };
        String[] nouns = { "boy", "girl", "dog", "town", "car" };
        String[] verbs = { "drove", "jumped", "ran", "walked", "skipped" };
        String[] prepositions = { "to", "from", "over", "under", "on" };

        Random random = new Random();
        StringBuilder sentence = new StringBuilder();

        for (int i = 0; i < 20; i++) {
            sentence.setLength(0); // Clear the StringBuilder for the new sentence
            String article = articles[random.nextInt(articles.length)];
            String noun = nouns[random.nextInt(nouns.length)];
            String verb = verbs[random.nextInt(verbs.length)];
            String preposition = prepositions[random.nextInt(prepositions.length)];

            // Capitalize the first letter of the article
            sentence.append(Character.toUpperCase(article.charAt(0)))
                    .append(article.substring(1))
                    .append(" ")
                    .append(noun).append(" ")
                    .append(verb).append(" ")
                    .append(preposition).append(".");

            System.out.println(sentence.toString());
        }
    }
}
