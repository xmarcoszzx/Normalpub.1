import javax.microedition.lcdui.Image;

public final class es {
   public static boolean a;
   public static boolean b;
   private static Image c = l.b("/mainImage/myTexture2dmobCapcha.png");
   private static int d;
   private static int e;
   private static int f;
   private static int g;
   private static int h;
   private static int i;
   private static int j;
   private static int k;
   private static int l = 0;
   private static int m;
   private static int n;
   private static int o;

   public static void a(en var0, int var1, int var2) {
      int var3;
      if (!b) {
         if (main.a.w % 3 == 0) {
            if (af.e().I == 1) {
               h = var1 - 20 - p.j;
            }

            if (af.e().I == -1) {
               h = var1 + 20 - p.j;
            }
         }

         d = af.e().C - 40 - p.k;
      } else {
         var3 = l + 1;
         l = var3;
         if (var3 == 5) {
            b = false;
            l = 0;
         }

         h = var1 - p.j;
         d = var2 - p.k;
      }

      if (i > var1 - p.j) {
         o = -1;
      } else {
         o = 1;
      }

      var0.a(p.br, i, e - 40, 3);
      bo.a(var0, i - 25, e - 70, 50, 20, 16777215, false);
      int var10004 = e - 65;
      di.f.a(var0, p.j().bs, i, var10004, 2);
      if (a) {
         a = false;
         ei.a(new ea(18, i + p.j, e + p.k, 2, 10, -1));
         p.j().aL = null;
         h = -p.j;
         d = -p.k;
      }

      Image var6 = c;
      var3 = n;
      byte var7;
      if (o == 1) {
         var7 = 0;
      } else {
         var7 = 2;
      }

      int var4 = i;
      int var5 = e;
      byte var8;
      if (main.a.w % 10 > 5) {
         var8 = 1;
      } else {
         var8 = 0;
      }

      var0.a(var6, 0, var3 * 40, 40, 40, var7, var4, var5 + 3 + var8, 3);
      if (e != d) {
         g = d - e << 2;
         f += g;
         e += f >> 4;
         f &= 15;
      }

      if (i != h) {
         k = h - i << 2;
         j += k;
         i += j >> 4;
         j &= 15;
      }

      var1 = m + 1;
      m = var1;
      if (var1 == 5) {
         m = 0;
         var1 = n + 1;
         n = var1;
         if (var1 > 2) {
            n = 0;
         }
      }

   }
}
