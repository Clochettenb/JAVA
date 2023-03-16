class Decipher {
    public static void main(String[] args) {
        System.out.println(decipher("0@sn9sirppa@#?ia'jgtvryko1"));
        System.out.println(decipher("q8e?wsellecif@#?sel@#?setuotpazdsy0*b9+mw@x1vj"));
        System.out.println(decipher("aopi?sedohtém@#?sedhtmg+p9l!"));

    }

    public static String decipher(String code) {
        int key = code.length() / 2;
        String subString = code.substring(5, key+5);
        subString = subString.replace("@#?", " ");
        StringBuilder sb = new StringBuilder(subString);
        sb.reverse();
        return sb.toString();
    }
}