public class LongestCommonPrefix {

    public String longestCommonPrefix(String[] strs) {

        StringBuilder sb = new StringBuilder();

        int menor = strs[0].length();

        for (int j = 1; j < strs.length; j++) {
            if (strs[j].length() < menor) {
                menor = strs[j].length();
            }
        }

        for (int i = 0; i < menor; i++) {

            char c1 = strs[0].charAt(i);
            boolean t = true;

            for (int j = 0; j < strs.length; j++) {
                boolean b = strs[j].charAt(i) == c1;
                t = t && b;
            }

            if (t) {
                sb.append(c1);
            } else {
                break;
            }
        }

        return sb.toString();
    }
}
