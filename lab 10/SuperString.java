public class SuperString {
    public static void method1(String str){
        String[] words = {"hat", "cat", "bat", "fine", "pine", "at", "pi", "bee", "art", "dog"};
        for(int i = 0; i < words.length; i++) {
            if(str.contains(words[i])) {
                System.out.println(words[i]);
            }
        }
    }

    public static void method2(String str, int int1, char ch){
        for(int i = 0; i < str.length()-int1; i++) {
            if(ch == str.charAt(i)) {
                System.out.println(str.substring(i, i+int1));
            }
        }
    }

}
