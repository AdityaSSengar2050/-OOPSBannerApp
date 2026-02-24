public class OOPSBannerAppUC6 {

    // Method for letter O
    public static String[] getOPattern() {
        return new String[]{
                " *****  ",
                "**   ** ",
                "**   ** ",
                "**   ** ",
                "**   ** ",
                "**   ** ",
                " *****  "
        };
    }

    // Method for letter P
    public static String[] getPPattern() {
        return new String[]{
                "******* ",
                "**    **",
                "**    **",
                "******* ",
                "**      ",
                "**      ",
                "**      "
        };
    }

    // Method for letter S
    public static String[] getSPattern() {
        return new String[]{
                "******* ",
                "**      ",
                "**      ",
                " ****** ",
                "      **",
                "      **",
                "******* "
        };
    }

    public static void main(String[] args) {

        String[] oPattern = getOPattern();
        String[] pPattern = getPPattern();
        String[] sPattern = getSPattern();

        for (int i = 0; i < oPattern.length; i++) {
            System.out.println(
                    oPattern[i] + " " +
                    oPattern[i] + " " +
                    pPattern[i] + " " +
                    sPattern[i]
            );
        }
    }
}