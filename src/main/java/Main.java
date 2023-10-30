public class Main {

    public String encryptThis(String message) {
        if (message.isEmpty()) {
            return "";
        }

        String[] words = message.split(" ");
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            result.append(encryptWord(word));
            result.append(" ");
        }

        return result.toString().trim();
    }

    private String encryptWord(String word) {
        if (word.length() == 1) {
            return String.valueOf((int) word.charAt(0));
        }

        char firstChar = word.charAt(0);
        char secondChar = word.charAt(1);
        char lastChar = word.charAt(word.length() - 1);
        String middleChars = word.substring(2, word.length() - 1);

        return String.valueOf((int) firstChar) + lastChar + middleChars + secondChar;
    }
}
