public final class ag {
   private static int a;
   private static int b;
   private static int c;
   private static boolean d;
   private static String e = "";

   public static void a() {
      a = 0;
      b = 0;
      d = false;
   }

   public static void a(en var0, String var1, int var2, int var3, int var4, int var5, di var6) {
      if (c != var6.a(var1) || !e.equals(var1)) {
         e = var1;
         a = 0;
         c = var6.a(var1);
         d = false;
         b = 0;
      }

      var0.e(var2, var3, var4, var5);
      if (c > var4) {
         var6.a(var0, var1, var2 - a, var3, 0);
      } else {
         var6.a(var0, var1, var2 + var4 / 2, var3, 2);
      }

      main.a.a(var0);
      if (c > var4) {
         if (!d) {
            var2 = b + 1;
            b = var2;
            if (var2 > 50) {
               var2 = a + 1;
               a = var2;
               if (var2 >= c) {
                  b = 0;
                  a = -var4 + 30;
                  d = true;
               }
            }
         } else {
            if (a < 0) {
               a += a + var4 >> 1;
            }

            if (a > 0) {
               a = 0;
            }

            if (a == 0) {
               var2 = b + 1;
               b = var2;
               if (var2 == 50) {
                  b = 0;
                  d = false;
               }
            }
         }
      }

   }
}
