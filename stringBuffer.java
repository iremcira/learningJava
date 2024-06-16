public class stringBuffer {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Irem");
        sb.append("nur");
        sb.ensureCapacity(100);

        // System.out.println(sb);

        String str = sb.toString();

        System.out.println(str);
    }
}
