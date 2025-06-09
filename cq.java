public final class cq implements b {
   private static cq i;
   public cd a;
   public boolean b = false;
   public bx c;
   public de d;
   public de e;
   public de f = null;
   public String g;
   public String h;
   private long j = 0L;
   private int k;
   private int l;
   private int m;
   private int n;

   public cq() {
      this.h = aw.bp + " ";
      this.a = new cd();
      this.a.i = aw.bp;
      this.a.c = main.a.A - 32;
      if (this.a.c > 250) {
         this.a.c = 250;
      }

      this.a.d = bb.cp + 2;
      this.a.a = main.a.A / 2 - this.a.c / 2;
      this.a.e = true;
      this.a.b(80);
   }

   public static cq b() {
      cq var0;
      if (i == null) {
         var0 = new cq();
         i = var0;
      } else {
         var0 = i;
      }

      return var0;
   }

   public final void a() {
      this.d = new de(aw.br, this, 8000, (Object)null, 1, main.a.B - bb.cr + 1);
      this.e = new de(aw.bj, this, 8001, (Object)null, main.a.A - 70, main.a.B - bb.cr + 1);
      this.f = null;
      this.m = this.a.c + 28;
      this.n = this.a.d + 26;
      this.k = main.a.A / 2 - this.m / 2;
      this.l = this.a.b - 18;
      if (this.m > 320) {
         this.m = 320;
      }

      this.d.j = this.k;
      this.e.j = this.k + this.m - 68;
      if (main.a.e) {
         cd var1 = this.a;
         var1.b -= 5;
         this.l -= 20;
         this.n += 30;
         this.d.j = main.a.A / 2 - 68 - 5;
         this.e.j = main.a.A / 2 + 5;
         this.d.k = main.a.B - 30;
         this.e.k = main.a.B - 30;
      }

   }

   public final void a(int var1) {
      if (this.b) {
         this.a.a(var1);
      }

      if (this.a.d().equals("")) {
         this.e.b = aw.bi;
      } else {
         this.e.b = aw.bj;
      }

   }

   public final void a(int var1, bx var2, String var3) {
      this.e.b = aw.bi;
      this.g = var3;
      this.a.a(var1);
      if (!this.a.d().equals("") && main.a.K == null) {
         this.c = var2;
         this.b = true;
      }

   }

   public final void a(int var1, Object var2) {
      switch(var1) {
      case 8000:
         ds.c("perform chat 1");
         if (this.c != null) {
            long var3 = System.currentTimeMillis();
            if (var3 - this.j >= 1000L) {
               this.j = var3;
               this.c.a(this.a.d(), this.g);
               this.a.a("");
               this.e.b = aw.bi;
            }
         }
         break;
      case 8001:
         ds.c("perform chat 2");
         if (this.a.d().equals("")) {
            this.b = false;
            this.c.D();
         }

         this.a.b();
      }

   }

   public final void a(en var1) {
      if (this.b && l.c != 5 && l.c != 3) {
         bo.a(var1, this.k, this.l, this.m, this.n, -1, true);
         di var5 = di.g;
         String var6 = this.h + this.g;
         int var3 = this.a.a;
         int var4 = this.a.b;
         byte var2;
         if (main.a.e) {
            var2 = 17;
         } else {
            var2 = 12;
         }

         var5.a(var1, var6, var3, var4 - var2, 0);
         cx.a(var1, this.d, this.f, this.e);
         this.a.a(var1);
      }

   }

   public final void a(String var1) {
      this.e.b = aw.bi;
      this.g = var1;
      if (main.a.K == null) {
         this.b = true;
         if (main.a.e) {
            this.a.a();
         }
      }

   }

   public final void c() {
      if (this.b) {
         if (l.c != 5 && l.c != 3) {
            this.a.c();
         }

         if (this.a.h) {
            this.a.h = false;
            this.c.a(this.a.d(), this.g);
            this.a.a("");
            this.e.b = aw.bi;
         }
      }

   }
}
