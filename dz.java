import javax.microedition.lcdui.Image;

public final class dz implements b {
   public de a;
   private de b;
   private String[] c;
   private int d;
   private int e;
   private int f = 120;
   private int g;
   private int h;
   private long i;
   private long j;

   public final void a() {
      if (this.c != null) {
         this.d = main.a.A - 5 - this.f;
         this.e = 45;
         if (main.a.A - 50 > this.f + 155) {
            this.d = main.a.A - 55 - this.f;
            this.e = 5;
         }

         this.a.j = this.d - 35;
         this.a.k = this.e;
         this.j = System.currentTimeMillis();
         ds.c("curr - last= " + (this.j - this.i));
         if (this.j - this.i >= 1000L) {
            this.i = System.currentTimeMillis();
            --this.h;
         }

         if (this.h == 0) {
            p.j().bQ = null;
         }
      }

   }

   public final void a(int var1, Object var2) {
   }

   public final void a(en var1) {
      int var6 = this.d;
      int var5 = this.e;
      int var4 = this.f;
      int var3 = this.g;
      byte var2;
      if (!main.a.e) {
         var2 = 10;
      } else {
         var2 = 0;
      }

      bo.a(var1, var6, var5, var4, var3 + var2, 16777215, false);
      if (this.c != null) {
         String var7 = this.c[0];
         var4 = this.d;
         var5 = this.e;
         var3 = this.g / 2;
         if (main.a.e) {
            var2 = 4;
         } else {
            var2 = 6;
         }

         ag.a(var1, var7, var4 + 5, var3 + var5 - var2, this.f - 10, this.g, di.k);
         int var9;
         if (main.a.e) {
            this.a.a(var1);
            di var8 = di.n;
            var7 = String.valueOf(this.h);
            var9 = this.a.j;
            var8.a(var1, var7, this.a.l / 2 + var9, this.a.k + this.a.m + 5, 2, di.o);
         } else {
            di var10;
            String var11;
            if (cd.g) {
               var10 = di.b;
               var11 = aw.cJ + this.h + ")";
               var3 = this.d;
               var9 = this.f / 2;
               var4 = this.e;
               var10.a(var1, var11, var9 + var3, this.g + var4, 2);
            } else {
               var10 = di.b;
               var11 = aw.cK + this.h + ")";
               var9 = this.d;
               var3 = this.f / 2;
               var4 = this.e;
               var10.a(var1, var11, var3 + var9, this.g + var4, 2);
            }
         }
      }

   }

   public final void a(String var1, de var2, de var3) {
      this.c = new String[]{var1};
      this.g = 29;
      this.a = var2;
      this.b = var3;
      de var5 = this.a;
      de var4 = this.b;
      Image var7 = p.bo;
      var4.g = var7;
      var5.g = var7;
      var3 = this.a;
      var4 = this.b;
      Image var6 = p.bp;
      var4.h = var6;
      var3.h = var6;
      this.a.l = en.a(var2.g);
      this.b.l = en.a(var2.g);
      this.a.m = en.b(var2.g);
      this.b.m = en.b(var2.g);
      this.i = System.currentTimeMillis();
      this.h = this.c[0].length() / 3;
      if (this.h < 15) {
         this.h = 15;
      }

      ag.a();
   }
}
