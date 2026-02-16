package fundamentals.strings;
public class StringBufferPractice{
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Pookie Shringi");
        System.out.println(sb);
        System.out.println(sb.length());
        System.out.println(sb.charAt(0));
        sb.setCharAt(0,'k');
        System.out.println(sb);
        sb.deleteCharAt(0);
        System.out.println(sb);
    }
}