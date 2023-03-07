import java.util.HashMap;

public class Hash {
    public static void main(String[] args) {
        String[] words = {"apple", "orange", "banana", "grape", "kiwi"};

        HashMap<String, Integer> wordCount = new HashMap<>();

        // prebroji broj pojavljivanja svake riječi u nizu
        for (String word : words) {
            if (wordCount.containsKey(word)) {
                wordCount.put(word, wordCount.get(word) + 1);
            } else {
                wordCount.put(word, 1);
            }
        }

        // ispiši broj pojavljivanja svake riječi
        for (String word : wordCount.keySet()) {
            System.out.println(word + ": " + wordCount.get(word));
        }
    }
}