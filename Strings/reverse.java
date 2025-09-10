public class reverse {

    // reverse word
    static void word(String s) {
        char arr[] = s.toCharArray();
        int n = arr.length;
        for (int i = 0; i < n / 2; i++) {
            char temp = arr[i];
            arr[i] = arr[n - i - 1];
            arr[n - i - 1] = temp;
        }

        String reversed = new String(arr);
        System.out.println(reversed);
    }

    // reverse sentence
    static void Reverse(String s) {
        String[] words = s.split(" "); // String[] words = s.trim().split("\\s+");
        for (int i = 0; i < words.length / 2; i++) {
            String temp = words[i];
            words[i] = words[words.length - i - 1];
            words[words.length - i - 1] = temp;
        }
        String reversed = String.join(" ", words);
        System.out.println(reversed);

    }

    // words in place
    static void inPlace(String s) {
        String[] words = s.trim().split("\\s+");
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < words.length; i++) {
            char arr[] = words[i].toCharArray();
            int n = arr.length;
            for (int i = 0; i < n / 2; i++) {
                char temp = arr[i];
                arr[i] = arr[n - i - 1];
                arr[n - i - 1] = temp;
            }
            result.append(new String(arr));
            if (i != words.length - 1) {
                result.append(" ");
            }
        }
    }

    public static void main(String[] args) {
        String s = "the sky is blue";
        // Reverse(s);
        word("blue");
    }
}
