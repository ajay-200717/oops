/**
 * OOPS Banner App - UC7
 * Demonstrates encapsulation of character patterns in a class
 */
public class OOPSBannerAppUC7 {

    /**
     * Inner static class to store character and its banner pattern
     */
    static class CharacterPattern {
        private char character;
        private String[] pattern;

        /**
         * Constructor to initialize character and its pattern
         * @param character the character being represented
         * @param pattern the 7-line banner pattern for the character
         */
        public CharacterPattern(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        /** @return the character */
        public char getCharacter() {
            return character;
        }

        /** @return the banner pattern */
        public String[] getPattern() {
            return pattern;
        }
    }

    /**
     * Utility method to print a banner for a given word
     * @param word the word to display
     * @param patterns array of CharacterPattern objects
     */
    public static void printBanner(String word, CharacterPattern[] patterns) {
        // Build each line using StringBuilder for efficiency
        for (int row = 0; row < 7; row++) {
            StringBuilder line = new StringBuilder();
            for (char c : word.toCharArray()) {
                for (CharacterPattern cp : patterns) {
                    if (cp.getCharacter() == c) {
                        line.append(cp.getPattern()[row]).append(" ");
                    }
                }
            }
            System.out.println(line.toString());
        }
    }

    public static void main(String[] args) {
        System.out.println("OOPS Banner App - UC7: Store Character Pattern in a Class\n");

        // Define patterns for O, P, S
        CharacterPattern O = new CharacterPattern('O', new String[]{
            "*****", "*   *", "*   *", "*   *", "*   *", "*   *", "*****"
        });

        CharacterPattern P = new CharacterPattern('P', new String[]{
            "*****", "*   *", "*   *", "*****", "*    ", "*    ", "*    "
        });

        CharacterPattern S = new CharacterPattern('S', new String[]{
            "*****", "*    ", "*    ", "*****", "    *", "    *", "*****"
        });

        // Store patterns in an array
        CharacterPattern[] patterns = {O, P, S};

        // Print the banner for "OOPS"
        printBanner("OOPS", patterns);
    }
}