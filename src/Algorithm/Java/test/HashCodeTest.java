package Algorithm.Java.test;

public class HashCodeTest {

    public int hashCode(String s) {
        int g = 31;
        int hash = 0;
        for(int i = 0; i < s.length(); i++)
            hash = g * hash + s.charAt(i);
        return hash;
    }

    public static void main(String[] args) {
        HashCodeTest hashcodetest = new HashCodeTest();

        System.out.println(hashcodetest.hashCode("this"));
        System.out.println(hashcodetest.hashCode("hits"));

    }
}
