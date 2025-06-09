import javax.microedition.lcdui.Image;

public final class cx {
   public static int a;
   private static int b = 15787715;
   private static Image[] c = new Image[6];
   private static int d;

   static {
      for(int var0 = 0; var0 < c.length; ++var0) {
         c[var0] = l.b("/mainImage/myTexture2dgoc" + (var0 + 1) + ".png");
      }

      a = 24;
      d = 0;
      l.b("/mainImage/myTexture2dcheck.png");
   }

   public static void a(int var0, int var1, int var2, int var3, en var4) {
      var4.a(9340251);
      var4.c(var0 + 18, var1, (var2 - 36) / 2 - 32, var3);
      var4.c(var0 + 18 + (var2 - 36) / 2 + 32, var1, (var2 - 36) / 2 - 22, var3);
      var4.c(var0, var1 + 8, var2, var3 - 17);
      var4.a(b);
      var4.d(var0 + 18, var1 + 3, (var2 - 36) / 2 - 32, var3 - 4);
      var4.d(var0 + 18 + (var2 - 36) / 2 + 31, var1 + 3, (var2 - 38) / 2 - 22, var3 - 4);
      var4.d(var0 + 1, var1 + 6, var2 - 1, var3 - 11);
      var4.a(14667919);
      var4.d(var0 + 18, var1 + 1, (var2 - 36) / 2 - 32, 2);
      var4.d(var0 + 18 + (var2 - 36) / 2 + 32, var1 + 1, (var2 - 36) / 2 - 12, 2);
      var4.d(var0 + 18, var1 + var3 - 2, (var2 - 36) / 2 - 31, 2);
      var4.d(var0 + 18 + (var2 - 36) / 2 + 32, var1 + var3 - 2, (var2 - 36) / 2 - 31, 2);
      var4.d(var0 + 1, var1 + 11, 2, var3 - 18);
      var4.d(var0 + var2 - 2, var1 + 11, 2, var3 - 18);
      var4.a(c[0], var0 - 3, var1 - 2, 20);
      var4.a(c[2], var0 + var2 + 3, var1 - 2, cj.b);
      var4.a(c[1], var0 - 3, var1 + var3 + 3, cj.d);
      var4.a(c[3], var0 + var2 + 4, var1 + var3 + 2, cj.e);
      var4.a(c[4], var2 / 2 + var0, var1, cj.a);
      var4.a(c[5], var2 / 2 + var0, var1 + var3 + 1, cj.c);
   }

   public static void a(en var0, de var1, de var2, de var3) {
      boolean var5 = main.a.e;
      di var7 = di.f;
      int var4;
      if (var1 != null) {
         var4 = var7.a(var1.b);
         d = var4;
         if (var4 > 0) {
            if (var1.j >= 0 && var1.k > 0) {
               var1.a(var0);
            } else {
               Image var6;
               if (bb.cs == 0) {
                  var6 = p.ax;
               } else {
                  var6 = p.aw;
               }

               var0.a(var6, 1, main.a.B - bb.cr - 1, 0);
               var7.a(var0, var1.b, 35, main.a.B - bb.cr + 3 + 3, 2);
            }
         }
      }

      Image var8;
      if (var2 != null) {
         var4 = var7.a(var2.b);
         d = var4;
         if (var4 > 0) {
            if (var2.j > 0 && var2.k > 0) {
               var2.a(var0);
            } else {
               if (bb.cs == 1) {
                  var8 = p.ax;
               } else {
                  var8 = p.aw;
               }

               var0.a(var8, main.a.C - 35, main.a.B - bb.cr - 1, 0);
               var7.a(var0, var2.b, main.a.C, main.a.B - bb.cr + 3 + 3, 2);
            }
         }
      }

      if (var3 != null) {
         var4 = var7.a(var3.b);
         d = var4;
         if (var4 > 0) {
            if (var3.j > 0 && var3.k > 0) {
               var3.a(var0);
            } else {
               if (bb.cs == 2) {
                  var8 = p.ax;
               } else {
                  var8 = p.aw;
               }

               var0.a(var8, main.a.A - 71, main.a.B - bb.cr - 1, 0);
               var7.a(var0, var3.b, main.a.A - 35, main.a.B - bb.cr + 3 + 3, 2);
            }
         }
      }

   }

   public static void b(int var0, int var1, int var2, int var3, en var4) {
      var4.a(13524492);
      var4.c(var0 + 6, var1, var2 - 12, var3);
      var4.c(var0, var1 + 6, var2, var3 - 12);
      var4.c(var0 + 7, var1 + 1, var2 - 14, var3 - 2);
      var4.c(var0 + 1, var1 + 7, var2 - 2, var3 - 14);
      var4.a(14338484);
      var4.d(var0 + 8, var1 + 2, var2 - 16, var3 - 3);
      var4.d(var0 + 2, var1 + 8, var2 - 3, var3 - 14);
      var4.a(main.a.Z[2], var0, var1, 20);
      var4.a(main.a.Z[2], 0, 0, 16, 16, 2, var0 + var2 + 1, var1, cj.b);
      var4.a(main.a.Z[2], 0, 0, 16, 16, 1, var0, var1 + var3 + 1, cj.d);
      var4.a(main.a.Z[2], 0, 0, 16, 16, 3, var0 + var2 + 1, var1 + var3 + 1, cj.e);
   }

   public static void c(int var0, int var1, int var2, int var3, en var4) {
      var4.a(6702080);
      var4.d(var0, var1, var2, var3);
      var4.a(14338484);
      var4.d(var0 + 1, var1 + 1, var2 - 2, var3 - 2);
   }

   public final void a(en var1, int var2, int var3, int var4, int var5, String[] var6) {
      b(var2, var3, var4, 69, var1);
      var5 = var3 + 20 - di.t.a();

      for(var3 = 0; var3 < var6.length; ++var3) {
         di.t.a(var1, var6[var3], var2 + var4 / 2, var5, 2);
         var5 += di.t.a();
      }

   }
}
