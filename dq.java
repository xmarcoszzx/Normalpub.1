public final class dq {
   private static byte[] l;
   private static int[] m;
   private static int[] n;
   public int a = 0;
   public int b;
   public int c;
   private int d;
   private int e;
   private int f;
   private int g;
   private int h;
   private int i;
   private af j;
   private cv k = null;

   static {
      byte[] var0 = new byte[]{0, 1, 2, 1, 0, 1, 2, 1, 0, 1, 2, 1, 0, 1, 2, 1, 0, 1, 2, 1, 0, 1, 2, 1, 0};
      l = var0;
      int[] var1 = new int[]{0, 15, 37, 52, 75, 105, 127, 142, 165, 195, 217, 232, 255, 285, 307, 322, 345, 370};
      m = var1;
      var1 = new int[]{0, 0, 0, 7, 6, 6, 6, 2, 2, 3, 3, 4, 5, 5, 5, 1};
      n = var1;
   }

   public dq(af var1, cv var2) {
      this.j = var1;
      this.k = var2;
   }

   private void b() {
      this.j.cc = null;
      this.i = 0;
      this.h = 0;
      this.g = 0;
      this.f = 0;
      this.e = 0;
      this.d = 0;
      this.c = 0;
      this.b = 0;
      this.j.E();
   }

   public final void a() {
      if (this.j.aQ != null || this.j.aU != null) {
         if (this.j.aQ != null) {
            this.d = this.j.aQ.m;
            this.e = this.j.aQ.n - this.j.aQ.w / 4;
         } else if (this.j.aU != null) {
            this.d = this.j.aU.B;
            this.e = this.j.aU.C - this.j.aU.al / 4;
         }

         int var2 = this.d - this.b;
         int var3 = this.e - this.c;
         byte var1 = 4;
         if (var2 + var3 < 60) {
            var1 = 3;
         } else if (var2 + var3 < 30) {
            var1 = 2;
         }

         if (this.b != this.d) {
            if (var2 > 0 && var2 < 5) {
               this.b = this.d;
            } else if (var2 < 0 && var2 > -5) {
               this.b = this.d;
            } else {
               this.f = this.d - this.b << 2;
               this.h += this.f;
               this.b += this.h >> var1;
               this.h &= 15;
            }
         }

         if (this.c != this.e) {
            if (var3 > 0 && var3 < 5) {
               this.c = this.e;
            } else if (var3 < 0 && var3 > -5) {
               this.c = this.e;
            } else {
               this.g = this.e - this.c << 2;
               this.i += this.g;
               var2 = this.c;
               this.c = (this.i >> var1) + var2;
               this.i &= 15;
            }
         }

         int var4;
         int var5;
         int var6;
         if (this.j.aQ != null) {
            var4 = this.d - this.j.aQ.v / 4;
            var2 = this.d;
            var5 = this.j.aQ.v / 4;
            var3 = this.e - this.j.aQ.w / 4;
            var6 = this.e + this.j.aQ.w / 4;
            var2 += var5;
         } else if (this.j.aU != null) {
            var4 = this.d - this.j.aU.ak / 4;
            var2 = this.d;
            var5 = this.j.aU.ak / 4;
            var3 = this.e - this.j.aU.al / 4;
            var6 = this.e + this.j.aU.al / 4;
            var2 += var5;
         } else {
            var6 = 0;
            var2 = 0;
            var3 = 0;
            var4 = 0;
         }

         if (this.a > 0) {
            --this.a;
         }

         if (this.a != 0 && (this.b < var4 || this.b > var2 || this.c < var3 || this.c > var6)) {
            return;
         }
      }

      this.b();
   }

   public final void a(en var1) {
      int var3 = ds.a(this.d - this.b, -(this.e - this.c));
      int var2 = 0;

      while(true) {
         if (var2 >= m.length - 1) {
            var3 = 0;
            break;
         }

         if (var3 >= m[var2] && var3 <= m[var2 + 1]) {
            var3 = var2;
            if (var2 >= 16) {
               var3 = 0;
            }
            break;
         }

         ++var2;
      }

      bl.b(var1, this.k.a[l[var3]], this.b, this.c, n[var3], 3);
   }
}
