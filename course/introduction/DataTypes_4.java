public class Test {
    public static void main(String args[]) {
      byte b1 = 10;

      short s1 = 128;

      int i1 = 1024;

      long l1 = 1235797785;

      float f1 = 1.5f;

      double d1 = 2.5d;

      char c1 = 'a';

      boolean bl1 = true;

      String a = "10";
      String t1 = a + b1, t2 = a + s1, t3 = a + i1, t4 = a + l1, t5 = a + f1, t6 = a + d1, t7 = a + c1, t8 = a + bl1;

      System.out.println(t1); // 1010
      System.out.println(t2); // 10128
      System.out.println(t3); // 101024
      System.out.println(t4); // 101235797785
      System.out.println(t5); // 101.5
      System.out.println(t6); // 102.5
      System.out.println(t7); // 10a
      System.out.println(t8); // 10true
    }
}
