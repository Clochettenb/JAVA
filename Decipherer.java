class Decipherer {

    public static String decipher(String code) {
        int key = code.length() / 2;
        String subString = code.substring(5, 5 + key);
        subString = subString.replace("@#?", " ");
        return new StringBuilder(subString).reverse().toString();
    }

    public static void main(String[] args) {
        System.out.println(decipher("0@sn9sirppa@#?ia'jgtvryko1"));
        System.out.println(decipher("q8e?wsellecif@#?sel@#?setuotpazdsy0*b9+mw@x1vj"));
        System.out.println(decipher("aopi?sedohtém@#?sedhtmg+p9l!"));

    }
}