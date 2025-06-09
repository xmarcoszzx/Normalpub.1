public class bb {
   public static int cp;
   public static int cq = 68;
   public static int cr = 26;
   public static int cs = -1;
   public de cm;
   public de cn;
   public de co;

   public static boolean a(de var0) {
      boolean var2 = false;
      boolean var1;
      if (var0 == null) {
         var1 = var2;
      } else if (var0.j >= 0 && var0.k != 0) {
         var1 = var0.c();
      } else if (main.a.K != null) {
         if (main.a.K.c != null && main.a.a(main.a.A - cq >> 1, main.a.B - cr - 5, cq, cr + 10)) {
            cs = 1;
            if (var0 == main.a.K.c && main.a.l && main.a.m) {
               var1 = true;
               return var1;
            }
         }

         if (main.a.K.b != null && main.a.a(0, main.a.B - cr - 5, cq, cr + 10)) {
            cs = 0;
            if (var0 == main.a.K.b && main.a.l && main.a.m) {
               var1 = true;
               return var1;
            }
         }

         var1 = var2;
         if (main.a.K.d != null) {
            var1 = var2;
            if (main.a.a(main.a.A - cq, main.a.B - cr - 5, cq, cr + 10)) {
               cs = 2;
               if (var0 != main.a.K.d) {
                  var1 = var2;
                  if (var0 != cq.b().e) {
                     return var1;
                  }
               }

               var1 = var2;
               if (main.a.l) {
                  var1 = var2;
                  if (main.a.m) {
                     var1 = true;
                  }
               }
            }
         }
      } else {
         if (var0 == main.a.E.cm && main.a.a(0, main.a.B - cr - 5, cq, cr + 10)) {
            cs = 0;
            if (main.a.l && main.a.m) {
               var1 = true;
               return var1;
            }
         }

         if (var0 == main.a.E.co && main.a.a(main.a.A - cq, main.a.B - cr - 5, cq, cr + 10)) {
            cs = 2;
            if (main.a.l && main.a.m) {
               var1 = true;
               return var1;
            }
         }

         if (var0 != main.a.E.cn) {
            var1 = var2;
            if (ae.m == null) {
               return var1;
            }
         }

         var1 = var2;
         if (main.a.a(main.a.A - cq >> 1, main.a.B - cr - 5, cq, cr + 10)) {
            cs = 1;
            var1 = var2;
            if (main.a.l) {
               var1 = var2;
               if (main.a.m) {
                  var1 = true;
               }
            }
         }
      }

      return var1;
   }

   public void a(int var1) {
   }

   public void a(en var1) {
      var1.a(-var1.a(), -var1.b());
      var1.e(0, 0, main.a.A, main.a.B + 1);
      if (!cq.b().b && main.a.K == null && !main.a.F.a) {
         cx.a(var1, this.cm, this.cn, this.co);
      }

   }

   public void b() {
      main.a.f();
      main.a.g();
      main.a.E = this;
      main.a.h.setFullScreenMode(true);
   }

   public void c() {
   }

   public void d() {
      if (main.a.i[5] || a(main.a.E.cn)) {
         main.a.i[5] = false;
         cs = -1;
         main.a.m = false;
         if (this.cn != null) {
            this.cn.a();
         }
      }

      if (main.a.i[12] || a(main.a.E.cm)) {
         main.a.i[12] = false;
         cs = -1;
         main.a.m = false;
         if (cq.b().b) {
            if (cq.b().d != null) {
               cq.b().d.a();
            }
         } else if (this.cm != null) {
            this.cm.a();
         }
      }

      if (main.a.i[13] || a(main.a.E.co)) {
         main.a.i[13] = false;
         cs = -1;
         main.a.m = false;
         if (cq.b().b) {
            if (cq.b().e != null) {
               cq.b().e.a();
            }
         } else if (this.co != null) {
            this.co.a();
         }
      }

   }
}
