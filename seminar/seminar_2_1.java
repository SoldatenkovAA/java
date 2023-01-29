package seminar;
public class seminar_2_1 {
    public static void main(String[] args) { 
        var s = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 100; i++) {
        sb.append("TEST");
        }
        System.out.println(sb);
        System.out.println(System.currentTimeMillis() - s);     
    } 
}
