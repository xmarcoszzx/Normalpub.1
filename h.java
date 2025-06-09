public final class h {
   public int A;
   public byte B;
   public boolean C;
   public int D = -1;
   public int E = -1;
   public int F = -1;
   public int G = -1;
   public String H = "";
   public ee[] a;
   public dd b;
   public el c;
   public int d;
   public int e;
   public boolean f;
   public int g;
   public int h;
   public int i;
   public long j;
   public boolean k;
   public int l;
   public int m;
   public int n;
   public int o;
   public int p;
   public int q;
   public int r;
   public int s;
   public int t;
   public short u = -1;
   public byte v = -1;
   public int w;
   public boolean x;
   public boolean y = false;
   public String z = "";

   public h() {
      int[] var1 = new int[]{0, 0, 0, 0, 600841, 600841, 667658, 667658, 3346944, 3346688, 4199680, 5052928, 3276851, 3932211, 4587571, 5046280, 6684682, 3359744};
      int[] var10000 = new int[]{16711705, 15007767, 13369364, 11730962, 10027023, 8388621};
   }

   public final void a() {
      this.A = main.a.G.a(this);
   }

   public final void a(int var1, int var2, int var3, int var4) {
      this.D = var1;
      this.E = var2;
      this.F = var3;
      this.G = var4;
   }

   public final boolean a(int var1) {
      boolean var2 = false;

      for(var1 = 0; var1 < this.a.length; ++var1) {
         ee var3 = this.a[var1];
         if (var3 != null && var3.c.a == 87) {
            var2 = true;
            break;
         }
      }

      return var2;
   }

   public final boolean b() {
      boolean var1;
      if ((this.b.b < 0 || this.b.b >= 6) && this.b.b != 32 && this.b.b != 35 && this.b.b != 11 && this.b.b != 23) {
         var1 = false;
      } else {
         var1 = true;
      }

      return var1;
   }
}
