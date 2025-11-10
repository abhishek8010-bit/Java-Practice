
//Common Prefix in an Array


class Q1 {
    public String commonPrefix(String str[]) {
        if (str == null || str.length == 0) {
            return "";
        }
        String prefix = str[0];

        for (int i = 1; i < str.length; i++) {
            while (str[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);  
                if (prefix.isEmpty()) {
                    return "";

                }

            }
        }
        return prefix;

    }

    public static void main(String[] args) {
        Q1 sc = new Q1();

        String words[] = { "flower", "flow", "flight" };
        String result = sc.commonPrefix(words);

        System.out.println("Common Prefix:" + result);

    }

}
