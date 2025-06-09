import javax.microedition.lcdui.Image;

public final class de {
   private static Image s = l.b("/mainImage/btn0left.png");
   private static Image t = l.b("/mainImage/btn0mid.png");
   private static Image u = l.b("/mainImage/btn0right.png");
   private static Image v = l.b("/mainImage/btn1left.png");
   private static Image w = l.b("/mainImage/btn1mid.png");
   private static Image x = l.b("/mainImage/btn1right.png");
   public boolean a = false;
   public String b;
   public String[] c;
   public b d;
   public int e;
   public boolean f = true;
   public Image g;
   public Image h;
   public Image i;
   public int j = 0;
   public int k = 0;
   public int l;
   public int m;
   public boolean n;
   public Object o;
   public String p;
   public boolean q;
   public boolean r;

   public de(String var1, int var2) {
      this.l = bb.cq;
      this.m = bb.cr;
      this.n = false;
      this.p = "";
      this.b = var1;
      this.e = var2;
   }

   public de(String var1, int var2, int var3, int var4) {
      this.l = bb.cq;
      this.m = bb.cr;
      this.n = false;
      this.p = "";
      this.b = var1;
      this.e = 0;
      this.j = var3;
      this.k = var4;
   }

   public de(String var1, int var2, Object var3) {
      this.l = bb.cq;
      this.m = bb.cr;
      this.n = false;
      this.p = "";
      this.b = var1;
      this.e = var2;
      this.o = var3;
   }

   public de(String var1, b var2, int var3, Object var4) {
      this.l = bb.cq;
      this.m = bb.cr;
      this.n = false;
      this.p = "";
      this.b = var1;
      this.e = var3;
      this.d = var2;
      this.o = var4;
   }

   public de(String var1, b var2, int var3, Object var4, int var5, int var6) {
      this.l = bb.cq;
      this.m = bb.cr;
      this.n = false;
      this.p = "";
      this.b = var1;
      this.e = var3;
      this.d = var2;
      this.o = null;
      this.j = var5;
      this.k = var6;
   }

   private static void a(Image var0, Image var1, Image var2, int var3, int var4, int var5, en var6) {
      int var7;
      for(var7 = 10; var7 <= var5 - 20; var7 += 10) {
         var6.a(var1, var3 + var7, var4, 0);
      }

      var7 = var5 % 10;
      if (var7 > 0) {
         var6.a(var1, 0, 0, var7, 24, 0, var3 + var5 - 10 - var7, var4, 0);
      }

      var6.a(var0, var3, var4, 0);
      var6.a(var2, var3 + var5 - 10, var4, 0);
   }

   public final void a() {
      main.a.l();
      if (this.f && (this.b != null && !this.b.equals("") && !this.b.equals(aw.cD) || this.g != null)) {
         bu.a();
      }

      if (this.e > 0) {
         if (this.d != null) {
            this.d.a(this.e, this.o);
         } else {
            p.j().a(this.e, this.o);
         }
      }

   }

   public final void a(en var1) {
      byte var3 = 2;
      di var7;
      int var8;
      String var10;
      if (this.g != null) {
         var1.a(this.g, this.j, this.k, 0);
         if (this.n) {
            if (this.h == null) {
               if (this.q) {
                  var1.a(ce.f, this.j + 8, this.k + 8, 3);
               } else {
                  Image var6 = ce.f;
                  int var9 = this.j;
                  byte var2;
                  if (this.g.equals(p.at)) {
                     var2 = 10;
                  } else {
                     var2 = 0;
                  }

                  var1.a(var6, var9 - var2, this.k, 0);
               }
            } else {
               var1.a(this.h, this.j, this.k, 0);
            }
         }

         if (this.b != "" && this.b != null) {
            if (!this.n) {
               var7 = di.f;
               var10 = this.b;
               var8 = this.j;
               var7.a(var1, var10, en.a(this.g) / 2 + var8, this.k + en.b(this.g) / 2 - 5, 2);
            } else {
               di var11 = di.g;
               String var12 = this.b;
               var8 = this.j;
               var11.a(var1, var12, en.a(this.g) / 2 + var8, this.k + en.b(this.g) / 2 - 5, 2);
            }
         }
      } else {
         if (this.b != "") {
            if (!this.n) {
               a(s, t, u, this.j, this.k, this.l, var1);
            } else {
               a(v, w, x, this.j, this.k, this.l, var1);
            }
         }

         int var4 = this.j + this.l / 2;
         if (this.i != null) {
            var8 = this.i.getWidth();
            var4 = this.j + var8;
            if (!this.n) {
               var1.a(this.i, this.j, this.k, 0);
            } else {
               var1.a(this.i, this.j, this.k + 1, 0);
            }
         } else {
            var8 = 0;
         }

         int var5;
         if (!this.n) {
            var7 = di.f;
            var10 = this.b;
            var5 = this.k;
            if (var8 != 0) {
               var3 = 0;
            }

            var7.a(var1, var10, var4, var5 + 7, var3);
         } else {
            var7 = di.g;
            var10 = this.b;
            var5 = this.k;
            if (var8 != 0) {
               var3 = 0;
            }

            var7.a(var1, var10, var4, var5 + 7, var3);
         }
      }

   }

   public final boolean a(int var1, int var2) {
      boolean var3 = true;
      this.n = false;
      if (main.a.a(this.j, this.k - var2, this.l, this.m)) {
         if (main.a.k) {
            this.n = true;
         }

         if (main.a.m) {
            return var3;
         }
      }

      var3 = false;
      return var3;
   }

   public final void b() {
      this.l = 160;
   }

   public final boolean c() {
      boolean var1 = true;
      this.n = false;
      if (main.a.a(this.j, this.k, this.l, this.m)) {
         if (main.a.k) {
            this.n = true;
         }

         if (main.a.m) {
            return var1;
         }
      }

      var1 = false;
      return var1;
   }
}
