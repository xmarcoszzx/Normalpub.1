public final class al extends af {
   private static ck a;
   private static ck b;
   private int c = 0;
   private int d;
   private int[] df;
   private int[] dg;
   private int[][] dh;
   private byte di;
   private int dj;
   private int dk;
   private boolean e;
   private ea f;
   private af g;
   private int h;
   private int i;
   private af[] j;
   private long[] k;
   private int l;
   private int[] m;
   private int[] n;

   public al() {
      int[] var1 = new int[]{0, 0, 1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5};
      this.m = var1;
      var1 = new int[]{0, 0, 6, 6, 7, 7, 8, 8, 9, 9, 9, 9, 9, 10, 10};
      this.n = var1;
      var1 = new int[]{0, 0, 1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 6, 6, 7, 7, 8, 8, 9, 9, 10, 10, 11, 11, 12, 12};
      this.df = var1;
      this.dg = new int[]{13, 13, 14, 14, 15, 15, 16, 16};
      this.dh = new int[][]{this.m, this.n, this.df, this.dg};
      this.di = -1;
      a = null;
      a = new ck();
      String var4 = "/x" + en.b + "/effectdata/" + 102 + "/data";

      try {
         a.b(var4);
         a.a = l.c("/effectdata/102/img.png");
      } catch (Exception var3) {
      }

      b = null;
      b = new ck();
      var4 = "/x" + en.b + "/effectdata/" + 103 + "/data";

      try {
         b.b(var4);
         b.a = l.c("/effectdata/103/img.png");
      } catch (Exception var2) {
      }

   }

   public final void a() {
      byte var1;
      ea var3;
      if (this.g != null) {
         if (this.f.e >= 30) {
            var3 = this.f;
            var3.f += (super.B - this.f.f) / 4;
            var3 = this.f;
            var3.g += (super.C - this.f.g) / 4;
            this.g.B = this.f.f;
            this.g.C = this.f.g;
            this.g.ck = true;
         } else {
            var3 = this.f;
            if (this.f.f > this.g.B) {
               var1 = 1;
            } else {
               var1 = 0;
            }

            var3.k = var1;
            var3 = this.f;
            var3.f += (this.g.B - this.f.f) / 3;
            var3 = this.f;
            var3.g += (this.g.C - this.f.g) / 3;
         }
      }

      if (this.di != -1) {
         if (this.di == 0 && this.e && main.a.w % 2 == 0) {
            int var2 = this.l;
            byte var4;
            if (this.h > super.B) {
               var4 = 30;
            } else {
               var4 = -30;
            }

            this.l = var4 + var2;
            var3 = new ea(103, super.B + this.l, super.C + 20, 2, 1, -1);
            if (this.h > super.B) {
               var1 = 0;
            } else {
               var1 = 1;
            }

            var3.k = var1;
            ei.a(var3);
            if (super.I == 1 && super.B + this.l >= this.h || super.I == -1 && super.B + this.l <= this.h) {
               this.e = false;
               this.di = -1;
               this.l = 0;
               this.c = 0;
               super.I = this.d;

               for(int var5 = 0; var5 < this.j.length; ++var5) {
                  this.j[var5].a(this.k[var5], 0L, false, false);
               }
            }
         }

         if (this.di == 3) {
            this.h = this.j[this.dk].B;
            this.i = this.j[this.dk].C;
            super.B += (this.h - super.B) / 3;
            super.C += (this.i - super.C) / 3;
            if (main.a.w % 5 == 0) {
               ei.a(new ea(19, super.B, super.C, 2, 1, -1));
            }

            if (ds.g(super.B - this.h) <= 20 && ds.g(super.C - this.i) <= 20) {
               super.B = this.h;
               super.C = this.i;
               this.j[this.dk].a(this.k[this.dk], 0L, false, false);
               ++this.dk;
               if (this.dk == this.j.length) {
                  this.di = -1;
                  this.dk = 0;
               }
            }
         }
      } else {
         super.a();
      }

   }

   public final void a(byte var1, short var2, short var3, af[] var4, long[] var5) {
      this.di = var1;
      this.h = var2;
      this.i = var3;
      this.d = super.I;
      byte var6;
      if (this.h > super.B) {
         var6 = 1;
      } else {
         var6 = -1;
      }

      super.I = var6;
      this.j = var4;
      this.k = var5;
   }

   public final void a(en var1) {
      byte var2 = 1;
      byte var3 = 1;
      if (this.di != -1) {
         this.c(var1);
         var1.a(0, main.a.ae);
         this.a(this.dh[this.di]);
         int var4;
         int var5;
         int var6;
         ck var8;
         if (this.di != 0 && this.di != 1) {
            var8 = b;
            int var9 = this.dj;
            var4 = super.B;
            var6 = super.C;
            var5 = super.bS;
            if (super.I == 1) {
               var2 = 0;
            }

            var8.a(var1, var9, var4, var5 + var6, var2, 2);
         } else {
            var8 = a;
            var6 = this.dj;
            var4 = super.B;
            int var7 = super.C;
            var5 = super.bS;
            var2 = var3;
            if (super.I == 1) {
               var2 = 0;
            }

            var8.a(var1, var6, var4, var5 + var7, var2, 2);
         }

         var1.a(0, -main.a.ae);
      } else {
         super.a(var1);
      }

   }

   public final void a(int[] var1) {
      if (this.di == 0) {
         if (this.c == 11) {
            this.e = true;
            ei.a(new ea(19, super.B, super.C + 20, 2, 1, -1));
         }

         if (this.c >= var1.length - 1) {
            this.di = 2;
            return;
         }
      }

      if (this.di == 1 && this.c == var1.length - 1) {
         this.di = 3;
         super.C -= 15;
      } else {
         ++this.c;
         if (this.c > var1.length - 1) {
            this.c = 0;
         }

         this.dj = var1[this.c];
      }

   }

   public final void c(int var1) {
      this.f = new ea(105, super.B, super.C + 20, 2, 1, -1);
      ei.a(this.f);
      if (var1 == af.e().J) {
         this.g = af.e();
      } else {
         this.g = p.b(var1);
      }

   }
}
