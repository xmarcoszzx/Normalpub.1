public final class v {
   public static int a;
   public static int b;
   public static int c;
   public static int d;
   public static boolean e;
   public static boolean f;
   public static boolean g;
   public static boolean h;
   public static boolean i;
   public static boolean j;
   public static int k;
   public static boolean l;
   public static boolean m;

   public static void a() {
      byte var0 = 1;
      if (main.a.G.a) {
         i = false;
      }

      if (p.s() != null) {
         a = p.s().B;
         b = p.s().C;
         k = 0;
         j = true;
         if (!main.a.e) {
            var0 = 0;
         }

         c = var0;
      }

   }

   public static void a(int var0) {
      if (!main.a.G.a && bo.a.size() - 1 >= var0) {
         bo var1 = (bo)bo.a.elementAt(var0);
         a = var1.d + var1.b / 2;
         b = var1.e + 30;
         if (!var1.k && var1.j) {
            i = true;
         } else {
            i = false;
         }

         c = 0;
         j = true;
         k = 0;
         if (!main.a.e) {
            i = false;
         }
      }

   }

   public static boolean a(int var0, int var1) {
      boolean var2;
      if (af.e().aD != null && af.e().aD.c == var0 && af.e().aD.a == 0) {
         var2 = true;
      } else {
         var2 = false;
      }

      return var2;
   }

   public static void b() {
      c = 1;
      if (main.a.G.a) {
         i = false;
      }

      int var0 = 0;

      boolean var3;
      while(true) {
         if (var0 >= p.F.size()) {
            var3 = false;
            break;
         }

         if (((aa)p.F.elementAt(var0)).f) {
            var3 = true;
            break;
         }

         ++var0;
      }

      for(int var1 = 0; var1 < p.F.size(); ++var1) {
         aa var2 = (aa)p.F.elementAt(var1);
         if (var2.f) {
            a = var2.m;
            b = var2.n + 5;
            j = true;
            if (var2.p == 0) {
               var2.f = false;
            }
            break;
         }

         if (!var3) {
            if (var2.p != 0) {
               var2.f = true;
               break;
            }

            var2.f = false;
         }
      }

   }

   public static boolean c() {
      boolean var1 = false;
      if (main.a.G.a) {
         i = false;
      }

      for(int var0 = 0; var0 < p.E.size(); ++var0) {
         ce var2 = (ce)p.E.elementAt(var0);
         if (var2.c == af.e().J && var2.e.a == 73) {
            c = 1;
            a = var2.a;
            b = var2.b + 5;
            j = true;
            var1 = true;
            break;
         }
      }

      return var1;
   }
}
