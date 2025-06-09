import javax.microedition.lcdui.Image;

public final class em extends bb {
   public static em a;
   public static Image b = l.b("/gamelogo.png");
   private static int c;
   private static int e = -1;
   private static int f = -1;
   private boolean d = false;

   public em() {
      a = this;
   }

   public static void a() {
      c = 0;
   }

   public static void e() {
      ds.b(">>>>>loadIP:  svselect == " + av.d(bs.w));
      bs.a(av.d(bs.w), false);
      if (bs.n == -1) {
         ds.b(">>>loadIP:  svselect == -1");
         byte var0 = bs.b;
         bs.a(bs.b, true);
      }

      bs.k();
   }

   public static void f() {
      b = l.b("/gamelogo.png");
   }

   public final void a(en var1) {
      if (b != null && c < 30) {
         var1.a(16777215);
         var1.d(0, 0, main.a.A, main.a.B);
         var1.a(b, main.a.A / 2, main.a.B / 2, 3);
      }

      if (e != -1) {
         var1.a(0);
         var1.d(0, 0, main.a.A, main.a.B);
         var1.a(x.j, main.a.A / 2, main.a.B / 2 - 24, cj.c);
         main.a.a(main.a.C, main.a.B / 2 + 24, var1);
         di.c.a(var1, aw.aD + e * 100 / f + "%", main.a.A / 2, main.a.B / 2, 2);
      } else if (c >= 30) {
         var1.a(0);
         var1.d(0, 0, main.a.A, main.a.B);
         main.a.a(main.a.C, main.a.D, var1);
         bs.b(var1);
      }

   }

   public final void c() {
      boolean var3 = false;
      int var1 = c + 1;
      c = var1;
      if (var1 == 30 && !this.d) {
         this.d = true;
         boolean var2;
         if (av.d("serverchat") != -1) {
            if (av.d("serverchat") == 0) {
               var2 = true;
            } else {
               var2 = false;
            }

            p.bV = var2;
         }

         if (av.d("isPlaySound") != -1) {
            var2 = var3;
            if (av.d("isPlaySound") == 1) {
               var2 = true;
            }

            main.a.aj = var2;
         }

         if (main.a.aj) {
            bu.a();
         }

         bu.a();
         bu.g();
         bs.f();
      }

      if (c >= 150) {
         if (br.a().d()) {
            bs.u = true;
         } else {
            l.b(true);
            if (main.a.ak == null) {
               main.a.ak = new bs();
            }
         }

         main.a.ak.b();
      }

      bs.e();
   }
}
