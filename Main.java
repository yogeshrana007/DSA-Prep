
class Main {

    public static String makeFancyString(String s) {
        StringBuilder sb = new StringBuilder("");
        int i = 0;
        while (i < s.length() - 2) {
            if ((s.charAt(i) == s.charAt(i + 1)) && (s.charAt(i + 1) == s.charAt(i + 2))) {
                continue;
            }
            sb.append(s.charAt(i));
            i++;
        }
        sb.append(s.charAt(s.length() - 2));
        sb.append(s.charAt(s.length() - 1));

        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(makeFancyString("leeetcode"));
    }
}
