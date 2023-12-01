import java.io.BufferedReader;
import java.io.IOException;
import java.io.FileReader;
import java.util.HashSet;
import java.util.Set;

class WordProcessor {
    private Set<String> distinctWords;

    public WordProcessor() {
        distinctWords = new HashSet<>();
    }

    public void readFile(String filePath) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] words = line.split("\\s+");
                for (String word : words) {
                    word = word.replaceAll("[^a-zA-Z]", "").toLowerCase();
                    distinctWords.add(word);
                }
            }
        }
    }

    public Set<String> getDistinctWords() {
        return distinctWords;
    }
}