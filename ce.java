import javax.microedition.lcdui.Image;

public final class ce implements bq {
   public static Image f = l.b("/mainImage/myTexture2dflare.png");
   private static Image x = l.b("/mainImage/myTexture2ditemaura1.png");
   private static Image y = l.b("/mainImage/myTexture2ditemaura2.png");
   private static Image z = l.b("/mainImage/myTexture2ditemaura3.png");
   public int a;
   public int b;
   public int c;
   public int d;
   public dd e;
   private int g;
   private int h;
   private int i;
   private int j;
   private byte k;
   private int l;
   private int m;
   private int n;
   private int o;
   private int p;
   private int q;
   private int[] r;
   private int[] s;
   private int[] t;
   private int[] u;
   private int v;
   private int w;

   public ce(int var1, short var2, short var3, int var4, int var5, short var6) {
      this.d = var2;
      this.e = dp.a(var3);
      this.g = var4;
      this.a = var4;
      this.h = var5;
      this.b = var5;
      this.k = 1;
      this.c = var1;
      if (this.b()) {
         this.l = var6;
         this.m = this.a;
         this.n = this.b;
         this.q = 120;
         this.o = 0;
         if (!main.a.a) {
            this.p = 360 / this.q;
            this.r = new int[this.q];
            this.s = new int[this.q];
            this.t = new int[this.q];
            this.u = new int[this.q];
            this.c();
         }
      }

   }

   public ce(short var1, short var2, int var3, int var4, int var5, int var6) {
      this.d = var1;
      this.e = dp.a(var2);
      this.a = var5;
      this.b = var4;
      this.g = var5;
      this.h = var6;
      this.i = var5 - var3 >> 2;
      this.j = 5;
   }

   private boolean b() {
      boolean var1;
      if (this.e.b == 22) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   private void c() {
      if (!main.a.a) {
         for(int var1 = 0; var1 < this.s.length; ++var1) {
            this.s[var1] = ds.g(this.l * ds.a(this.o) / 1024);
            this.r[var1] = ds.g(this.l * ds.b(this.o) / 1024);
            if (this.o < 90) {
               this.t[var1] = this.m + this.r[var1];
               this.u[var1] = this.n - this.s[var1];
            } else if (this.o >= 90 && this.o < 180) {
               this.t[var1] = this.m - this.r[var1];
               this.u[var1] = this.n - this.s[var1];
            } else if (this.o >= 180 && this.o < 270) {
               this.t[var1] = this.m - this.r[var1];
               this.u[var1] = this.n + this.s[var1];
            } else {
               this.t[var1] = this.m + this.r[var1];
               this.u[var1] = this.n + this.s[var1];
            }

            this.o += this.p;
         }
      }

   }

   public final void a() {
      if (this.k == 2 && this.a == this.g && this.b == this.h) {
         p.E.removeElement(this);
         if (af.e().aV != null && af.e().aV.equals(this)) {
            af.e().aV = null;
         }
      } else {
         if (this.k <= 0) {
            this.k = (byte)(this.k - 4);
            if (this.k < -12) {
               this.b -= 12;
               this.k = 1;
            }
         } else {
            if (this.i == 0) {
               this.a = this.g;
            }

            if (this.j == 0) {
               this.b = this.h;
            }

            if (this.a != this.g) {
               this.a += this.i;
               if (this.i > 0 && this.a > this.g || this.i < 0 && this.a < this.g) {
                  this.a = this.g;
               }
            }

            if (this.b != this.h) {
               this.b += this.j;
               if (this.j > 0 && this.b > this.h || this.j < 0 && this.b < this.h) {
                  this.b = this.h;
               }
            }
         }

         if (this.b()) {
            ++this.v;
            ++this.w;
            if (this.w >= 40) {
               this.w = 0;
            }

            if (this.v >= this.q) {
               this.v = 0;
            }

            if (this.v % 10 == 0 && !main.a.a) {
               at.a(114, this.a - 5, this.b - 30, 1);
            }
         }
      }

   }

   public final void a(int var1, int var2) {
      this.g = var1;
      this.h = var2;
      this.i = var1 - this.a >> 2;
      this.j = var2 - this.b >> 2;
      this.k = 2;
   }

   public final void a(en var1) {
      if (this.b()) {
         var1.a(bv.x, this.a + 3, this.b, 3);
         if (this.k <= 0) {
            if (this.w < 10) {
               var1.a(x, this.a, this.b + this.k + 3, 33);
            } else {
               var1.a(y, this.a, this.b + this.k + 3, 33);
            }
         } else if (this.w < 10) {
            var1.a(x, this.a, this.b + 3, 33);
         } else {
            var1.a(y, this.a, this.b + 3, 33);
         }

         if (!main.a.a && this.b()) {
            for(int var2 = 0; var2 < this.s.length; ++var2) {
               if (this.v == var2) {
                  if (this.w <= 20) {
                     var1.a(z, this.t[var2], this.u[var2] + 3, 33);
                  } else {
                     bl.b(var1, this.e.f, this.t[var2], this.u[var2] + 3, 0, 33);
                  }
               }
            }
         }
      } else if (!this.b()) {
         if (main.a.w % 4 == 0) {
            var1.a(f, this.a, this.b + this.k + 13, 33);
         }

         if (this.k <= 0) {
            bl.b(var1, this.e.f, this.a, this.b + this.k + 3, 0, 33);
         } else {
            bl.b(var1, this.e.f, this.a, this.b + 3, 0, 33);
         }

         if (af.e().aV != null && af.e().aV.equals(this) && this.k != 2) {
            var1.a(aa.R, 0, 24, 9, 6, 0, this.a, this.b - 17, 3);
         }
      }

   }

   public final int l() {
      return this.a;
   }

   public final int m() {
      return this.b;
   }

   public final int n() {
      return 20;
   }

   public final int o() {
      return 20;
   }

   public final void p() {
   }

   public final boolean q() {
      return false;
   }
}
