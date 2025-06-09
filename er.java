public final class er extends bb implements b {
   private static er b;
   public cd[] a;
   private int c;
   private int d;
   private int e;
   private int f;
   private String[] g;
   private String h;
   private cq i;
   private int j;
   private int k;

   public static er a() {
      if (b == null) {
         b = new er();
      }

      return b;
   }

   public final void a(int var1) {
      for(int var2 = 0; var2 < this.a.length; ++var2) {
         if (this.a[var2].e) {
            this.a[var2].a(var1);
            break;
         }
      }

      super.a(var1);
   }

   public final void a(int var1, Object var2) {
      byte var3 = 0;
      if (var1 == 1) {
         p.c.b();
         b = null;
      }

      if (var1 == 2) {
         label64: {
            if (l.c != 5 || this.a.length != 1) {
               var1 = var3;
               if (l.c != 3) {
                  break label64;
               }

               var1 = var3;
               if (this.a.length != 1) {
                  break label64;
               }
            }

            if (this.i.a.d() != null && !this.i.a.d().equals("")) {
               this.a[0].a(this.i.a.d());
               bt.a().a(this.a);
               p.c.b();
               return;
            }

            main.a.a(aw.gi);
            return;
         }

         while(true) {
            if (var1 >= this.a.length) {
               bt.a().a(this.a);
               p.c.b();
               break;
            }

            if (this.a[var1].d() == null || this.a[var1].d().equals("")) {
               main.a.a(aw.gi);
               break;
            }

            ++var1;
         }
      }

   }

   public final void a(int var1, String var2) {
      this.k = var1;
      this.h = var2;
      this.e = main.a.A - 20;
      if (this.e > 320) {
         this.e = 320;
      }

      ds.c("title= " + var2);
      this.g = di.f.a(var2, this.e - 20);
      this.c = (main.a.A - this.e) / 2;
      this.a = new cd[this.k];
      this.f = this.a.length * 35 + (this.g.length - 1) * 20 + 40;
      this.d = main.a.B - this.f - 40 - (this.g.length - 1) * 20;

      for(var1 = 0; var1 < this.a.length; ++var1) {
         this.a[var1] = new cd();
         this.a[var1].i = "";
         this.a[var1].a = this.c + 10;
         this.a[var1].b = this.d + 35 + (this.g.length - 1) * 20 + var1 * 35;
         this.a[var1].c = this.e - 20;
         this.a[var1].d = bb.cp + 2;
         if (main.a.e) {
            this.a[0].e = false;
         } else {
            this.a[0].e = true;
         }

         if (!main.a.e) {
            super.co = this.a[0].j;
         }
      }

      super.cm = new de(aw.bi, this, 1, (Object)null);
      super.cn = new de(aw.br, this, 2, (Object)null);
      if (main.a.e) {
         super.cn.j = main.a.A / 2 + 18;
         super.cm.j = main.a.A / 2 - 85;
         de var4 = super.cn;
         de var3 = super.cm;
         var1 = this.d + this.f + 5;
         var3.k = var1;
         var4.k = var1;
      }

      this.b();
   }

   public final void a(en var1) {
      byte var3 = 0;
      p.j().a(var1);
      bo.a(var1, this.c, this.d, this.e, this.f, -1, true);

      int var2;
      for(var2 = 0; var2 < this.g.length; ++var2) {
         di.g.a(var1, this.g[var2], main.a.A / 2, var2 * 20 + this.d + 15, 2);
      }

      for(var2 = var3; var2 < this.a.length; ++var2) {
         this.a[var2].a(var1);
      }

      super.a(var1);
   }

   public final void b() {
      if (l.c == 5 && this.a.length == 1 || l.c == 3 && this.a.length == 1) {
         this.i = new cq();
         this.i.h = this.h;
         this.i.a.i = this.a[0].f;
         this.i.g = "";
         this.i.b = true;
         this.i.a.c(0);
         if (main.a.e) {
         }
      } else {
         this.j = 0;
         super.b();
      }

   }

   public final void c() {
      p.j().c();

      for(int var1 = 0; var1 < this.a.length; ++var1) {
         this.a[var1].c();
      }

   }

   public final void d() {
      if (main.a.i[2]) {
         --this.j;
         if (this.j < 0) {
            this.j = this.a.length - 1;
         }
      } else if (main.a.i[8]) {
         ++this.j;
         if (this.j > this.a.length - 1) {
            this.j = 0;
         }
      }

      if (main.a.i[2] || main.a.i[8]) {
         main.a.f();

         for(int var1 = 0; var1 < this.a.length; ++var1) {
            if (this.j == var1) {
               this.a[var1].e = true;
               if (!main.a.e) {
                  super.co = this.a[var1].j;
               }
            } else {
               this.a[var1].e = false;
            }

            if (main.a.m && main.a.a(this.a[var1].a, this.a[var1].b, this.a[var1].c, this.a[var1].d)) {
               this.j = var1;
               break;
            }
         }
      }

      super.d();
      main.a.f();
   }
}
