import java.util.HashMap;
import java.util.Map;

/**
 * OOPS Banner App - UC8
 * Demonstrates use of HashMap for character patterns
 */
public class OOPSBannerAppUC8 {

    /**
     * Utility method to build the character pattern map
     * @return HashMap containing character patterns
     */
    public static Map<Character, String[]> buildCharacterPatterns() {
        Map<Character, String[]> patterns = new HashMap<>();

        patterns.put('O', new String[]{
            "*****", "*   *", "*   *", "*   *", "*   *", "*   *", "*****"
        });

        patterns.put('P', new String[]{
            "*****", "*   *", "*   *", "*****", "*    ", "*    ", "*    "
        });

        patterns.put('S', new String[]{
            "*****", "*    ", "*    ", "*****", "    *", "    *", "*****"
        });

        return patterns;
    }

    /**
     * Utility method to print banner for a given word
     * @param word the word to display
     * @param patterns the map of character patterns
     */
    public static void printBanner(String word, Map<Character, String[]> patterns) {
        for (int row = 0; row < 7; row++) {
            StringBuilder line = new StringBuilder();
            for (char c : word.toCharArray()) {
                String[] pattern = patterns.get(c);
                if (pattern != null) {
                    line.append(pattern[row]).append(" ");
                }
            }
            System.out.println(line.toString());
        }
    }

    public static void main(String[] args) {
        System.out.println("OOPS Banner App - UC8: Use Map for Character Patterns\n");

        // Build the character pattern map
        Map<Character, String[]> patterns = buildCharacterPatterns();

        // Print the banner for "OOPS"
        printBanner("OOPS", patterns);
    }
}
