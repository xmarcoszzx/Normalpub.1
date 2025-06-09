import java.util.Random;

public final class ah extends dc {
   public static Random a = new Random(System.currentTimeMillis());
   public static final int[] b;
   public static final byte[] c;
   private static int[] s;
   private int d;
   private by e;
   private int f;
   private int g;
   private int h;
   private int i;
   private int j;
   private int k;
   private boolean l = false;
   private long m;
   private long n;
   private af o;
   private el p = new el("vDarts");
   private int q = 0;
   private int r = 0;

   static {
      int[] var0 = new int[]{0, 15, 37, 52, 75, 105, 127, 142, 165, 195, 217, 232, 255, 285, 307, 322, 345, 370};
      s = var0;
      var0 = new int[]{0, 0, 0, 7, 6, 6, 6, 2, 2, 3, 3, 4, 5, 5, 5, 1};
      b = var0;
      byte[] var1 = new byte[]{0, 1, 2, 1, 0, 1, 2, 1, 0, 1, 2, 1, 0, 1, 2, 1, 0, 1, 2, 1, 0, 1, 2, 1, 0};
      c = var1;
   }

   private ah(int var1, int var2, boolean var3, long var4, long var6, af var8, int var9) {
      this.e = p.w[var9];
      this.i = var1;
      this.j = var2;
      this.m = var4;
      this.n = var6;
      this.o = var8;
      this.d = this.e.i;
      var2 = ds.a(var8.B - var1, var8.C - var2);
      this.f = var2;
      this.g = this.d * ds.b(var2) >> 10;
      var9 = this.d;
      this.h = ds.a(var2) * var9 >> 10;
      if (var1 >= p.j && var1 <= p.j + main.a.A) {
         bu.a();
      }

   }

   public static int a(int var0) {
      byte var2 = 0;
      int var1 = 0;

      while(true) {
         if (var1 >= s.length - 1) {
            var0 = var2;
            break;
         }

         if (var0 >= s[var1] && var0 <= s[var1 + 1]) {
            var0 = var2;
            if (var1 < 16) {
               var0 = var1;
            }
            break;
         }

         ++var1;
      }

      return var0;
   }

   public static void a(int var0, int var1, boolean var2, long var3, long var5, af var7, int var8) {
      dc.x.addElement(new ah(var0, var1, var2, var3, var5, var7, var8));
   }

   public final void a() {
      byte var4 = 0;

      int var1;
      for(var1 = 0; var1 < this.e.h; ++var1) {
         if (this.e.c.length > 0) {
            this.p.addElement(new dx(this.i, this.j));
         }

         int var2;
         if (this.o != null) {
            var2 = this.o.B;
         } else {
            var2 = 0;
         }

         this.q = var2 - this.i;
         if (this.o != null) {
            var2 = this.o.C;
         } else {
            var2 = 0;
         }

         this.r = var2 - 10 - this.j;
         short var7 = 60;
         if (bv.l == 0) {
            var7 = 600;
         }

         ++this.k;
         if (this.o != null && (this.o.H == 5 || this.o.H == 14) || this.o == null) {
            int var5 = this.i;
            int var3;
            if (this.o != null) {
               var3 = this.o.B;
            } else {
               var3 = 0;
            }

            this.i = (var3 - this.i) / 2 + var5;
            var5 = this.j;
            if (this.o != null) {
               var3 = this.o.C;
            } else {
               var3 = 0;
            }

            this.j = (var3 - this.j) / 2 + var5;
         }

         if (ds.g(this.q) < 16 && ds.g(this.r) < 16 || this.k > var7) {
            if (this.o != null && this.o.J >= 0 && this.n != -1L) {
               if (this.n != -100L) {
                  this.o.a(this.m, this.n, false, true);
               } else {
                  at.a(80, (af)this.o, 1);
               }
            }

            dc.x.removeElement(this);
            if (this.n != -100L) {
               at.a(81, (af)this.o, 1);
               if (this.i >= p.j && this.i <= p.j + main.a.A) {
                  bu.a();
               }
            }
         }

         var2 = ds.a(this.q, this.r);
         if (Math.abs(var2 - this.f) < 90 || this.q * this.q + this.r * this.r > 4096) {
            if (Math.abs(var2 - this.f) < 15) {
               this.f = var2;
            } else if ((var2 - this.f < 0 || var2 - this.f >= 180) && var2 - this.f >= -180) {
               this.f = ds.c(this.f - 15);
            } else {
               this.f = ds.c(this.f + 15);
            }
         }

         if (this.d < 8192) {
            this.d += 1024;
         }

         this.g = this.d * ds.b(this.f) >> 10;
         this.h = this.d * ds.a(this.f) >> 10;
         this.q += this.g;
         this.i += this.q >> 10;
         this.q &= 1023;
         this.r += this.h;
         this.j += this.r >> 10;
         this.r &= 1023;
      }

      for(var1 = var4; var1 < this.p.size(); ++var1) {
         dx var6 = (dx)this.p.elementAt(var1);
         ++var6.a;
         if (var6.a >= this.e.c.length) {
            this.p.removeElementAt(var1);
         }
      }

   }

   public final void a(en var1) {
      int var2 = a(360 - this.f);
      byte var3 = c[var2];
      int var4 = b[var2];

      dx var6;
      for(var2 = this.p.size() / 2; var2 < this.p.size(); ++var2) {
         var6 = (dx)this.p.elementAt(var2);
         bl.b(var1, this.e.d[var6.a], var6.b, var6.c, 0, 3);
      }

      int var5 = main.a.w % this.e.b.length;
      bl.b(var1, this.e.b[var5][var3], this.i, this.j, var4, 3);

      for(var2 = 0; var2 < this.p.size(); ++var2) {
         var6 = (dx)this.p.elementAt(var2);
         bl.b(var1, this.e.c[var6.a], var6.b, var6.c, 0, 3);
      }

      bl.b(var1, this.e.a[var5][var3], this.i, this.j, var4, 3);

      for(var2 = 0; var2 < this.p.size(); ++var2) {
         var6 = (dx)this.p.elementAt(var2);
         if (ds.g(a.nextInt(100)) < this.e.g) {
            short var7;
            if (main.a.w % 2 == 0) {
               var7 = this.e.e[var6.a];
            } else {
               var7 = this.e.f[var6.a];
            }

            bl.b(var1, var7, var6.b, var6.c, 0, 3);
         }
      }

   }
}
