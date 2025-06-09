import javax.microedition.lcdui.Image;

public final class au extends bb implements b {
   private static au f;
   private static Image g = l.b("/mainImage/myTexture2dfutherShip.png");
   private static Image h = l.b("/mainImage/taungam.png");
   public byte a;
   public short b;
   public short c;
   public long d;
   public long e;
   private int i = 5;
   private int[] j;
   private int[] k;
   private int[] l;
   private int[] m;
   private int n;
   private int o = 20;
   private boolean p;
   private boolean q;
   private int r;

   public au() {
      this.j = new int[this.o];
      this.k = new int[this.o];

      int var1;
      for(var1 = 0; var1 < this.o; ++var1) {
         this.j[var1] = ds.b(0, main.a.A);
         this.k[var1] = main.a.B / this.o * var1;
      }

      this.l = new int[this.o];
      this.m = new int[this.o];

      for(var1 = 0; var1 < this.o; ++var1) {
         this.l[var1] = ds.b(0, main.a.A);
         this.m[var1] = main.a.B / this.o * var1;
      }

   }

   public static au a() {
      if (f == null) {
         f = new au();
      }

      return f;
   }

   public final void a(int var1, Object var2) {
      if (var1 == 1) {
         main.a.a(aw.ga, new de(aw.bm, this, 2, (Object)null), new de(aw.bn, this, 3, (Object)null));
      }

      if (var1 == 2 && af.e().Y() > 0) {
         this.p = true;
         main.a.h();
         super.cn = null;
      }

      if (var1 == 3) {
         main.a.h();
      }

   }

   public final void a(en var1) {
      byte var4 = 0;
      int var2;
      if (this.a == 0) {
         var2 = 0;
      } else {
         var2 = 3056895;
      }

      var1.a(var2);
      var1.d(0, 0, main.a.A, main.a.B);

      int var3;
      for(var2 = 0; var2 < this.o; ++var2) {
         if (this.a == 0) {
            var3 = 14802654;
         } else {
            var3 = 11140863;
         }

         var1.a(var3);
         var1.d(this.j[var2], this.k[var2], 10, 2);
      }

      if (this.a == 0) {
         var1.a(g, 0, 0, 72, 95, 7, this.n + this.r, main.a.B / 2, 3);
      }

      var2 = var4;
      if (this.a == 1) {
         var1.a(h, 0, 0, 144, 79, 2, this.n + this.r, main.a.B / 2, 3);
         var2 = var4;
      }

      while(var2 < this.o) {
         if (this.a == 0) {
            var3 = 14935011;
         } else {
            var3 = 7536127;
         }

         var1.a(var3);
         var1.d(this.l[var2], this.m[var2], 18, 3);
         ++var2;
      }

      super.a(var1);
   }

   public final void b() {
      this.p = false;
      this.q = false;
      if (af.e().Y() > 0 && this.a == 0) {
         super.cn = new de(aw.fZ, this, 1, (Object)null);
      } else {
         super.cn = null;
      }

      this.r = 0;
      super.b();
   }

   public final void c() {
      byte var2 = 0;
      if (this.a == 0) {
         if (!this.p) {
            this.r = main.a.A / 2 * this.b / this.c;
         }
      } else {
         this.r += 2;
      }

      ac.b = false;
      this.n = (((main.a.A / 2 + this.n) / 2 + this.n) / 2 + this.n) / 2;
      if (this.a == 1) {
         this.n = 0;
      }

      int var1;
      int[] var3;
      for(var1 = 0; var1 < this.o; ++var1) {
         var3 = this.j;
         var3[var1] -= this.i / 2;
         if (this.j[var1] < -20) {
            this.j[var1] = main.a.A;
         }
      }

      for(var1 = var2; var1 < this.o; ++var1) {
         var3 = this.l;
         var3[var1] -= this.i;
         if (this.l[var1] < -20) {
            this.l[var1] = main.a.A;
         }
      }

      int var4;
      byte var5;
      if (main.a.w % 3 == 0) {
         var4 = this.i;
         if (this.p) {
            var5 = 2;
         } else {
            var5 = 1;
         }

         this.i = var5 + var4;
      }

      var4 = this.i;
      if (this.p) {
         var5 = 80;
      } else {
         var5 = 25;
      }

      if (var4 > var5) {
         if (this.p) {
            var5 = 80;
         } else {
            var5 = 25;
         }

         this.i = var5;
      }

      this.e = System.currentTimeMillis();
      if (this.e - this.d >= 1000L) {
         ++this.b;
         this.d = this.e;
      }

      if (this.p) {
         this.r += 3;
      }

      if (this.r >= main.a.A / 2 + 30 && !this.q) {
         this.q = true;
         bt.a().u();
      }

      super.c();
   }

   public final void d() {
      super.d();
   }
}
