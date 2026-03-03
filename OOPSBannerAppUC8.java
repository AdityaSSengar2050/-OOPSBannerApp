import java.util.HashMap;

public class OOPSBannerAppUC8 {

    /**
     * Creates a HashMap containing ASCII art patterns
     * for supported characters.
     */
    public static HashMap<Character, String[]> createCharacterMap() {

        HashMap<Character, String[]> charMap = new HashMap<>();

        // Pattern for 'O'
        charMap.put('O', new String[]{
                " *** ",
                "*   *",
                "*   *",
                "*   *",
                " *** "
        });

        // Pattern for 'P'
        charMap.put('P', new String[]{
                "**** ",
                "*   *",
                "**** ",
                "*    ",
                "*    "
        });

        // Pattern for 'S'
        charMap.put('S', new String[]{
                " ****",
                "*    ",
                " *** ",
                "    *",
                "**** "
        });

        return charMap;
    }

    /**
     * Displays banner message using character map
     */
    public static void displayBanner(String message, HashMap<Character, String[]> charMap) {

        int patternHeight = charMap.get('O').length;

        for (int line = 0; line < patternHeight; line++) {

            StringBuilder sb = new StringBuilder();

            for (char ch : message.toCharArray()) {

                String[] pattern = charMap.get(ch);
                sb.append(pattern[line]).append("  ");
            }

            System.out.println(sb.toString());
        }
    }

    /**
     * Main Method
     */
    public static void main(String[] args) {

        HashMap<Character, String[]> charMap = createCharacterMap();

        String message = "OOPS";

        displayBanner(message, charMap);
    }
}