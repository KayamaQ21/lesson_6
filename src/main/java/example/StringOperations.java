package example;

public class StringOperations {
    public String concatTwo (String str1, String str2) {
        return str1 + str2;
    }

    public String concat(String str1, String str2, String str3) {
        return str1.concat(str2).concat(str3);
    }

    public int length(String str) {
        return str.length();
    }
}
