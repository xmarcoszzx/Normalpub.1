public final class bc extends n {
   public boolean a;
   private String[] e;
   private int f;
   private int g = 35;
   private long h = -1L;

   public bc() {
      if (main.a.A <= 176) {
         this.g = 10;
      }

      if (main.a.A > 320) {
         this.g = 80;
      }

   }

   public final void a() {
      super.a();
      if (this.h != -1L && l.d() > this.h) {
         main.a.h();
      }

   }

   public final void a(en var1) {
      var1.e(0, 0, main.a.A, main.a.B);
      if (!x.c) {
         int var3 = main.a.B - this.f - 38;
         int var4 = main.a.A;
         int var2 = this.g;
         cx.a(this.g, var3, var4 - (var2 << 1), this.f, var1);
         var3 = var3 + (this.f - this.e.length * di.t.a()) / 2 - 2;
         var2 = var3;
         if (this.a) {
            var2 = var3 + 8;
            main.a.a(main.a.C, var2 - 12, var1);
         }

         byte var5 = 0;
         var3 = var2;

         for(var2 = var5; var2 < this.e.length; ++var2) {
            di.f.a(var1, this.e[var2], main.a.C, var3, 2);
            var3 += di.t.a();
         }

         super.a(var1);
      }

   }

   public final void a(String var1) {
      this.e = di.t.a(var1, main.a.A - ((this.g << 1) + 20));
      this.f = 80;
      if (this.e.length >= 5) {
         this.f = this.e.length * di.t.a() + 20;
      }

   }

   public final void a(String var1, de var2, de var3, de var4) {
      this.e = di.t.a(var1, main.a.A - ((this.g << 1) + 20));
      super.b = var2;
      super.c = var3;
      super.d = var4;
      this.f = 80;
      if (this.e.length >= 5) {
         this.f = this.e.length * di.t.a() + 20;
      }

      if (main.a.e) {
         if (var2 != null) {
            super.b.j = main.a.A / 2 - 68 - 5;
            super.b.k = main.a.B - 50;
         }

         if (var4 != null) {
            super.d.j = main.a.A / 2 + 5;
            super.d.k = main.a.B - 50;
         }

         if (var3 != null) {
            super.c.j = main.a.A / 2 - 35;
            super.c.k = main.a.B - 50;
         }
      }

      this.a = false;
      this.h = -1L;
   }

   public final void b() {
      this.a(aw.aB, (de)null, (de)null, (de)null);
      main.a.K = this;
      this.h = l.d() + 5000L;
   }

   public final void c() {
      main.a.K = this;
      this.h = -1L;
   }
}
