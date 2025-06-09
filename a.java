import main.GameMidlet;

public final class a extends bb implements b {
   public static a a;
   private cd b;
   private cd c;
   private int d;
   private int e;
   private int f;
   private int g;
   private String[] h;
   private int i;

   public a() {
      this.f = main.a.A - 20;
      if (this.f > 320) {
         this.f = 320;
      }

      this.h = di.g.a(aw.bb, this.f - 20);
      this.d = (main.a.A - this.f) / 2;
      this.e = main.a.B - 150 - (this.h.length - 1) * 20;
      this.g = (this.h.length - 1) * 20 + 110;
      this.b = new cd();
      this.b.i = aw.aZ;
      this.b.a = this.d + 10;
      this.b.b = this.e + 35 + (this.h.length - 1) * 20;
      this.b.c = this.f - 20;
      this.b.d = bb.cp + 2;
      if (main.a.e) {
         this.b.e = false;
      } else {
         this.b.e = true;
      }

      this.b.c(0);
      if (!main.a.e) {
         super.co = this.b.j;
      }

      this.c = new cd();
      this.c.i = aw.ba;
      this.c.a = this.d + 10;
      this.c.b = this.b.b + 35;
      this.c.c = this.f - 20;
      this.c.d = bb.cp + 2;
      this.c.e = false;
      this.c.c(0);
      super.cm = new de(aw.bi, this, 1, (Object)null);
      super.cn = new de(aw.bc, this, 2, (Object)null);
      if (main.a.e) {
         super.cn.j = main.a.A / 2 + 18;
         super.cm.j = main.a.A / 2 - 85;
         de var2 = super.cn;
         de var3 = super.cm;
         int var1 = this.e + this.g + 5;
         var3.k = var1;
         var2.k = var1;
      }

   }

   public static a a() {
      if (a == null) {
         a = new a();
      }

      return a;
   }

   public final void a(int var1) {
      if (this.b.e) {
         this.b.a(var1);
      } else if (this.c.e) {
         this.c.a(var1);
      }

      super.a(var1);
   }

   public final void a(int var1, Object var2) {
      if (var1 == 1) {
         p.c.b();
         a = null;
      }

      if (var1 == 2) {
         if (this.b.d() != null && !this.b.d().equals("")) {
            if (this.c.d() != null && !this.c.d().equals("")) {
               bt.a().a(this.b.d(), this.c.d());
               p.c.b();
               a = null;
            } else {
               main.a.a(aw.be);
            }
         } else {
            main.a.a(aw.bd);
         }
      }

   }

   public final void a(en var1) {
      p.j().a(var1);
      bo.a(var1, this.d, this.e, this.f, this.g, -1, true);

      for(int var2 = 0; var2 < this.h.length; ++var2) {
         di.g.a(var1, this.h[var2], main.a.A / 2, var2 * 20 + this.e + 15, 2);
      }

      this.b.a(var1);
      this.c.a(var1);
      super.a(var1);
   }

   public final void b() {
      this.i = 0;

      try {
         if (aw.fA == 0) {
            GameMidlet.f.platformRequest("http://ngocrongonline.com/");
         }

         if (aw.fA == 2) {
            GameMidlet.f.platformRequest("http://dragonball.indonaga.com/");
         }

         if (aw.fA == 1) {
            GameMidlet.f.platformRequest("http://world.teamobi.com/games-page-0.html");
         }
      } catch (Exception var2) {
         var2.printStackTrace();
      }

   }

   public final void c() {
      p.j().c();
      this.b.c();
      this.c.c();
   }

   public final void d() {
      if (main.a.i[2]) {
         --this.i;
         if (this.i < 0) {
            this.i = 1;
         }
      } else if (main.a.i[8]) {
         ++this.i;
         if (this.i > 1) {
            this.i = 1;
         }
      }

      if (main.a.i[2] || main.a.i[8]) {
         main.a.f();
         if (this.i == 1) {
            this.b.e = false;
            this.c.e = true;
            if (!main.a.e) {
               super.co = this.c.j;
            }
         } else if (this.i == 0) {
            this.b.e = true;
            this.c.e = false;
            if (!main.a.e) {
               super.co = this.b.j;
            }
         } else {
            this.b.e = false;
            this.c.e = false;
         }
      }

      if (main.a.m) {
         if (main.a.a(this.b.a, this.b.b, this.b.c, this.b.d)) {
            this.i = 0;
         } else if (main.a.a(this.c.a, this.c.b, this.c.c, this.c.d)) {
            this.i = 1;
         }
      }

      super.d();
      main.a.f();
   }
}
