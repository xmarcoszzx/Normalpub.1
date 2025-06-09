import java.util.Random;
import java.util.Vector;

public final class du {
   private static Random a = new Random();
   private static Vector b = new Vector();
   private static int c;
   private static int d;
   private static int e;
   private static int f;
   private static int g;
   private static int h;
   private static int i;
   private static float j;
   private static int[] k = new int[3];
   private static int[] l = new int[3];
   private static boolean m = false;
   private static long n = 0L;
   private static long o = 150L;

   private static void a() {
      g = 0;
      i = 16;
      h = 0;
      j = 0.0F;

      for(int var0 = 0; var0 < 3; ++var0) {
         l[var0] = 0;
         k[var0] = f;
      }

      m = true;
   }

   public static void a(en var0) {
      if (m) {
         l[2] = l[1];
         k[2] = k[1];
         l[1] = l[0];
         k[1] = k[0];
         l[0] = d;
         k[0] = c;
         c = (int)(Math.cos((double)e * 3.141592653589793D / 180.0D) * (double)i * (double)h) + f;
         d = (int)((double)i * Math.sin((double)e * 3.141592653589793D / 180.0D) * (double)h - (double)(0.0F * (float)h * (float)h / 2.0F));
         if (System.currentTimeMillis() - n >= o) {
            ++h;
            n = System.currentTimeMillis();
         }
      }

      if (h > 32 && m) {
         m = false;
         b.removeAllElements();
         b.addElement(new ad(ds.b(50, main.a.A - 50), ds.b(main.a.B - 100, main.a.B), 5, 72));
      }

      var0.a(0);
      var0.d(0, 0, 0, 0);
      var0.a(16711680);

      int var1;
      for(var1 = 0; var1 < b.size(); ++var1) {
         ad var5 = (ad)b.elementAt(var1);

         for(int var2 = 0; var2 < var5.a.size(); ++var2) {
            aj var4 = (aj)var5.a.elementAt(var2);
            if (var4.f < -200) {
               var5.a.removeElementAt(var2);
            }

            aj.a(var0, var4.a - var4.e, var4.b - var4.f, var4.j);

            for(int var3 = 0; var3 < 2; ++var3) {
               aj.a(var0, var4.a - var4.o[var3], var4.b - var4.p[var3], var4.j);
            }

            if (var4.n && System.currentTimeMillis() - var4.l >= var4.m) {
               ++var4.i;
               var4.l = System.currentTimeMillis();
               var4.o[1] = var4.o[0];
               var4.p[1] = var4.p[0];
               var4.o[0] = var4.e;
               var4.p[0] = var4.f;
               var4.e = (int)(Math.cos((double)var4.h * 3.141592653589793D / 180.0D) * (double)var4.c * (double)var4.i) + var4.d;
               var4.f = (int)((double)var4.c * Math.sin((double)var4.h * 3.141592653589793D / 180.0D) * (double)var4.i - (double)(var4.k * (float)var4.i * (float)var4.i / 2.0F)) + var4.g;
            }
         }
      }

      if (!m) {
         var1 = -(Math.abs(a.nextInt() % 3) + 5);
         if (var1 == -5 && !m) {
            f = 0;
            e = 80;
            m = true;
            a();
         } else if (var1 == -7 && !m) {
            e = 60;
            f = 0;
            m = true;
            a();
         } else if (var1 == -6 && !m) {
            e = 120;
            f = 0;
            m = true;
            a();
         }
      }

   }
}
