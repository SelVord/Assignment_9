import java.util.Set;
import java.io.IOException;


public class Main {
    public static void main(String[] args) {
        WordProcessor wordProcessor1 = new WordProcessor();
        WordProcessor wordProcessor2 = new WordProcessor();
        SimilarityCalculator similarityCalculator = new SimilarityCalculator();

        try {
            wordProcessor1.readFile("file1.txt");
            wordProcessor2.readFile("file2.txt");

            Set<String> distinctWords1 = wordProcessor1.getDistinctWords();
            Set<String> distinctWords2 = wordProcessor2.getDistinctWords();

            double similarityCoefficient = similarityCalculator.calculateSimilarity(distinctWords1, distinctWords2);

            System.out.println("Jaccard Similarity Coefficient: " + similarityCoefficient);
        } catch (IOException e) {
            System.err.println("Error reading files: " + e.getMessage());
        }
    }
}