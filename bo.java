import javax.microedition.lcdui.Image;

public final class bo {
   public static el a = new el("vPopups");
   private static Image o;
   private static Image p;
   private static Image q;
   private static Image r;
   public int b = 100;
   public String[] c;
   public int d;
   public int e;
   public int f;
   public int g;
   public boolean h = false;
   public de i;
   public boolean j = true;
   public boolean k = false;
   private int l;
   private int m = 0;
   private int n;

   public bo(String var1, int var2, int var3) {
      if (var1.length() < 10) {
         this.b = 60;
      }

      if (main.a.A == 128) {
         this.b = 128;
      }

      this.c = di.f.a(var1, this.b - 10);
      this.l = 7;
      this.d = var2 - this.b / 2 - 1;
      this.e = var3 - 15 + this.l - this.c.length * 12 - 10;
      this.f = this.b + 2;

      for(this.g = (this.c.length + 1) * 12 + 1; this.f % 10 != 0; ++this.f) {
      }

      while(this.g % 10 != 0) {
         ++this.g;
      }

      if (var2 >= 0 && var2 <= 24) {
         this.d += this.f / 2 + 30;
      }

      if (var2 <= bv.a * 24 && var2 >= bv.a * 24 - 24) {
         this.d -= this.f / 2 + 6;
      }

      while(this.d <= 30) {
         this.d += 2;
      }

      while(this.d + this.f >= bv.a * 24 - 30) {
         this.d -= 2;
      }

   }

   public static void a() {
      if (o == null) {
         o = l.b("/mainImage/myTexture2dbd3.png");
      }

      if (q == null) {
         q = l.b("/mainImage/myTexture2dimgPopup.png");
      }

      if (r == null) {
         r = l.b("/mainImage/myTexture2dimgPopup2.png");
      }

      if (p == null && l.c == 1) {
         p = l.b("/mainImage/portal.png");
      }

   }

   public static void a(bo var0) {
      a.addElement(var0);
   }

   public static void a(en var0) {
      for(int var1 = 0; var1 < a.size(); ++var1) {
         bo var8 = (bo)a.elementAt(var1);
         if (var8.j && var8.c != null && ae.m == null && !var8.k) {
            int var2;
            int var3;
            if (l.c == 1) {
               var3 = var8.d;
               var2 = var8.e - main.a.ae;
               var0.e(var3, var2, var8.f, var8.g);
               var0.a(p, var3, var2, 0);
               if (var8.f > 70) {
                  var0.a(p, var3 + 70, var2, 0);
               }

               if (var8.g > 30) {
                  var0.a(p, var3, var2 + 30, 0);
                  if (var8.f > 70) {
                     var0.a(p, var3 + 70, var2 + 30, 0);
                  }
               }

               var0.e(p.j, p.k, main.a.A, main.a.B);
            } else {
               int var5 = var8.d;
               int var6 = var8.e - main.a.ae;
               var3 = var8.f;
               int var4 = var8.g;
               boolean var10;
               if (var8.n == 0) {
                  var10 = false;
               } else {
                  var10 = true;
               }

               if (var10) {
                  var0.a(var5, var6, var3, var4, 16777215);
               } else {
                  var0.a(var5, var6, var3, var4, 0);
               }
            }

            for(var2 = 0; var2 < var8.c.length; ++var2) {
               di var7;
               if (var8.n == 0) {
                  var7 = di.c;
               } else {
                  var7 = di.g;
               }

               String var9 = var8.c[var2];
               var3 = var8.d;
               var7.a(var0, var9, var8.f / 2 + var3, var8.e + (var8.g / 2 - var8.c.length * 12 / 2) + var2 * 12 - main.a.ae, 2);
            }
         }
      }

   }

   public static void a(en var0, int var1, int var2, int var3, int var4, int var5, boolean var6) {
      if (!var6) {
         var0.a(0);
         var0.d(var1 + 6, var2, var3 - 14 + 1, var4);
         var0.d(var1, var2 + 6, var3, var4 - 12 + 1);
         var0.a(var5);
         var0.d(var1 + 6, var2 + 1, var3 - 12, var4 - 2);
         var0.d(var1 + 1, var2 + 6, var3 - 2, var4 - 12);
         var0.a(o, 0, 0, 7, 6, 0, var1, var2, 0);
         var0.a(o, 0, 0, 7, 6, 2, var1 + var3 - 7, var2, 0);
         var0.a(o, 0, 0, 7, 6, 6, var1, var2 + var4 - 7, 0);
         var0.a(o, 0, 0, 7, 6, 3, var1 + var3 - 7, var2 + var4 - 6, 0);
      } else {
         Image var10;
         if (var5 == 1) {
            var10 = r;
         } else {
            var10 = q;
         }

         var0.a(var10, 0, 0, 10, 10, 0, var1, var2, 0);
         var0.a(var10, 0, 20, 10, 10, 0, var1 + var3 - 10, var2, 0);
         var0.a(var10, 0, 50, 10, 10, 0, var1, var2 + var4 - 10, 0);
         var0.a(var10, 0, 70, 10, 10, 0, var1 + var3 - 10, var2 + var4 - 10, 0);
         int var8;
         if ((var3 - 20) % 10 == 0) {
            var8 = (var3 - 20) / 10;
         } else {
            var8 = (var3 - 20) / 10 + 1;
         }

         int var7;
         if ((var4 - 20) % 10 == 0) {
            var7 = (var4 - 20) / 10;
         } else {
            var7 = (var4 - 20) / 10 + 1;
         }

         int var9;
         for(var9 = 0; var9 < var8; ++var9) {
            var0.a(var10, 0, 10, 10, 10, 0, var9 * 10 + var1 + 10, var2, 0);
         }

         for(var9 = 0; var9 < var7; ++var9) {
            var0.a(var10, 0, 30, 10, 10, 0, var1, var2 + 10 + var9 * 10, 0);
         }

         for(var9 = 0; var9 < var8; ++var9) {
            var0.a(var10, 0, 60, 10, 10, 0, var9 * 10 + var1 + 10, var2 + var4 - 10, 0);
         }

         for(var8 = 0; var8 < var7; ++var8) {
            var0.a(var10, 0, 40, 10, 10, 0, var1 + var3 - 10, var8 * 10 + var2 + 10, 0);
         }

         if (var5 == 1) {
            var5 = 12052656;
         } else {
            var5 = 16770503;
         }

         var0.a(var5);
         var0.d(var1 + 10, var2 + 10, var3 - 20, var4 - 20);
      }

   }

   public static void b() {
      for(int var0 = 0; var0 < a.size(); ++var0) {
         bo var1 = (bo)a.elementAt(var0);
         if (af.e().aD != null && af.e().aD.c == 0) {
            if (var1.d + var1.f >= p.j && var1.d <= main.a.A + p.j && var1.e + var1.g >= p.k && var1.e <= main.a.B + p.k) {
               var1.k = false;
            } else {
               var1.k = true;
            }
         }

         if (af.e().aD == null || af.e().aD != null && af.e().aD.c != 0) {
            if (var1.d + var1.f / 2 >= af.e().B - 100 && var1.d + var1.f / 2 <= af.e().B + 100 && var1.e + var1.g >= p.k && var1.e <= main.a.B + p.k) {
               var1.k = false;
            } else {
               var1.k = true;
            }
         }

         if (var1.n > 0) {
            --var1.n;
            if (var1.n == 0 && var1.i != null) {
               var1.i.a();
            }
         }

         if (var1.h) {
            if (af.e().aD != null) {
               if (af.e().aD.c == 0) {
                  if (af.e().aD.a == 0) {
                     var1.j = false;
                  }

                  if (af.e().aD.a == 1) {
                     var1.j = true;
                  }

                  if (af.e().aD.a > 1 && af.e().aD.a < 6) {
                     var1.j = false;
                  }
               } else if (!var1.j) {
                  ++var1.m;
                  if (var1.m == 50) {
                     var1.j = true;
                  }
               }
            } else if (!var1.j) {
               v.i = false;
               ++var1.m;
               if (var1.m == 50) {
                  var1.j = true;
                  v.i = true;
               }
            }
         }
      }

   }

   public final void a(int var1) {
      this.n = 10;
   }

   public final void a(String[] var1, int var2, int var3) {
      int var4 = 0;

      for(this.b = 0; var4 < var1.length; ++var4) {
         if (this.b < di.f.a(var1[var4])) {
            this.b = di.f.a(var1[var4]);
         }
      }

      this.b += 20;
      this.c = var1;
      this.l = 7;
      this.d = var2 - this.b / 2 - 1;
      this.e = var3 - 15 + this.l - this.c.length * 12 - 10;
      this.f = this.b + 2;

      for(this.g = (this.c.length + 1) * 12 + 1; this.f % 10 != 0; ++this.f) {
      }

      while(this.g % 10 != 0) {
         ++this.g;
      }

      if (var2 >= 0 && var2 <= 24) {
         this.d += this.f / 2 + 30;
      }

      if (var2 <= bv.a * 24 && var2 >= bv.a * 24 - 24) {
         this.d -= this.f / 2 + 6;
      }

      while(this.d <= 30) {
         this.d += 2;
      }

      while(this.d + this.f >= bv.a * 24 - 30) {
         this.d -= 2;
      }

   }
}
