package fundamentals.strings;
public class StringBuilderPractice{
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("");
        System.out.println(sb.capacity());
        sb = new StringBuilder("pooki shringi");
        System.out.println(sb.capacity());
        System.out.println(sb);
        System.out.println(sb.length());
        System.out.println(sb.charAt(0));
        sb.setCharAt(0,'k');
        System.out.println(sb);
        sb.deleteCharAt(0);
        System.out.println(sb);
    }
}