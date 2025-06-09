public final class bk {
   public byte a;
   public int b;
   public int c;
   public int d;
   public int e;
   public int f;
   public int g;
   public int h;
   public int i;
   public int j;
   public int k;
   public int l;
   public boolean m = false;
   public boolean n = false;
   public boolean o = false;
   public df p;
   public df q;
   public byte[] r;
   public byte[] s;
   private byte[] t;

   public bk() {
      byte[] var1 = new byte[]{12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0, 23, 22, 21, 20, 19, 18, 17, 16, 15, 14, 13};
      this.t = var1;
      var1 = new byte[24];
      var1[2] = 2;
      var1[3] = 1;
      var1[4] = 1;
      var1[5] = 2;
      var1[8] = 2;
      var1[9] = 1;
      var1[10] = 1;
      var1[11] = 2;
      var1[14] = 2;
      var1[15] = 1;
      var1[16] = 1;
      var1[17] = 2;
      var1[20] = 2;
      var1[21] = 1;
      var1[22] = 1;
      var1[23] = 2;
      this.r = var1;
      var1 = new byte[]{2, 2, 3, 3, 3, 4, 5, 5, 5, 5, 5, 1, 0, 0, 0, 0, 0, 7, 6, 6, 6, 6, 6, 2};
      this.s = var1;
   }

   public final int a(int var1) {
      byte var2 = 24;
      byte var3;
      if (var1 > 15 && var1 <= 345) {
         var1 = (var1 - 15) / 15 + 1;
         if (var1 > 24) {
            var1 = var2;
         }

         var3 = this.t[var1];
      } else {
         var3 = 12;
      }

      return var3;
   }

   public final void a() {
      ++this.i;
      this.b += this.e;
      this.c += this.f;
   }

   public final void a(en var1, df var2, int var3, boolean var4) {
      if (var2 != null) {
         var3 = var2.c / 3;
         int var5 = var3;
         if (var3 <= 0) {
            var5 = 1;
         }

         if (var2.c > 3) {
            if (this.i / 3 % 2 == 0) {
               var3 = 0;
            } else {
               var3 = 3;
            }
         } else {
            var3 = this.i % var5;
         }

         var3 += var5 * this.r[this.k];
         if (var2.c < 3) {
            var3 = this.i / 3 % var2.c;
         }

         var2.a(var3, this.b, this.c, this.s[this.k], 3, var1);
      }

   }
}
