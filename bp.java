public final class bp {
   public static boolean a;
   public static boolean b;
   private static String c;
   private static String d;
   private static int e;

   public static void a() {
      a(aw.aB, (String)null, 1000);
      b = true;
   }

   public static void a(en var0) {
      if (a && (!b || e <= 4990)) {
         cx.a(main.a.C - 75, 10, 150, 55, var0);
         if (b) {
            main.a.a(main.a.C - di.t.a(c) / 2 - 10, 38, var0);
            di.t.a(var0, c, main.a.C + 5, 31, 2);
         } else if (d != null) {
            di.t.a(var0, c, main.a.C, 23, 2);
            di.m.a(var0, d, main.a.C, 40, 2);
         } else {
            di.t.a(var0, c, main.a.C, 31, 2);
         }
      }

   }

   public static void a(String var0, String var1, int var2) {
      if (var0 != null) {
         a = true;
         c = var0;
         d = var1;
         e = var2;
      }

   }

   public static void b() {
      if (a && e > 0) {
         int var0 = e - 1;
         e = var0;
         if (var0 <= 0) {
            c();
         }
      }

   }

   public static void c() {
      c = "";
      d = null;
      b = false;
      e = 0;
      a = false;
   }
}
