public final class dr implements b {
   public static dv f;
   int a;
   int b;
   de c;
   de d;
   public int e = 0;
   public int g;
   public int h;
   public int i;
   public int j;
   public boolean k;
   public boolean l;
   public String m;
   int n;
   int o;
   private int p;
   private int q;
   private int r = 24;
   private int s = 50;
   private el t = new el("vItems");

   public dr() {
      this.c = new de(aw.bv, this, 1, (Object)null);
      this.d = new de(aw.bi, this, 2, (Object)null);
   }

   private void a() {
      this.g = this.a + this.b;
   }

   public final void a(int var1, Object var2) {
      if (var1 == 2) {
         this.a();
      }

      if (var1 == 1 && !this.l && this.o >= 0) {
         this.a();
         if (af.e().ai == null) {
            bt.a().a((byte)2, ((ak)ak.f.elementAt(this.o)).a, (String)this.m);
         } else {
            bt.a().a((byte)4, ((ak)ak.f.elementAt(this.o)).a, (String)"");
         }
      }

   }

   public final void a(en var1) {
      var1.a(-this.h, 0);
      bo.a(var1, this.a, this.p - 17, this.b, this.q + 17, -1, true);
      di var8 = di.f;
      String var7 = aw.dy;
      int var2 = this.a;
      var8.a(var1, var7, this.b / 2 + var2, this.p - 7, 2);
      if (this.o >= 0 && this.o <= ak.f.size() - 1) {
         ak var9 = (ak)ak.f.elementAt(this.o);
         if (var9.c != null) {
            af.e().a(var1, var9.c, main.a.A / 2, this.p + 45, 1, false);
         }
      }

      af.e().a(var1, main.a.A / 2, this.p + 45, 1, af.e().as, false);
      var1.e(this.a, this.p + this.s, this.b, this.q - this.s - 10);
      if (f != null) {
         var1.a(0, -f.d);
      }

      for(var2 = 0; var2 < this.e; ++var2) {
         int var4 = this.a + 10;
         int var5 = this.p + this.r * var2 + this.s;
         int var6 = this.r;
         int var3;
         if (f != null) {
            var3 = f.d;
         } else {
            var3 = 0;
         }

         if (var5 + var6 - var3 >= this.p + this.s) {
            if (f != null) {
               var3 = f.d;
            } else {
               var3 = 0;
            }

            if (var5 - var3 <= this.p + this.s + this.q) {
               ak var11 = (ak)ak.f.elementAt(var2);
               di var10 = di.o;
               if (var2 == this.o) {
                  var10 = di.q;
               }

               if (var11.b != null) {
                  var10.a(var1, var11.b, var4 + 20, var5, 0);
               }

               if (var11.d > 0) {
                  var10.a(var1, var11.d + " " + aw.bC, this.b + var4 - 20, var5, 1);
               } else if (var11.e > 0) {
                  var10.a(var1, var11.e + " " + aw.bD, this.b + var4 - 20, var5, 1);
               }

               if (var11.c != null) {
                  bl.b(var1, var11.c[0], var4, var5, 0, 0);
               }
            }
         }
      }

      var1.a(0, -var1.b());
      var1.e(0, 0, main.a.A, main.a.B);
      cx.a(var1, this.c, (de)null, this.d);
   }

   public final void a(boolean var1) {
      af.e();
      this.k = true;
      this.l = false;
      if (this.l) {
         this.b = 170;
         this.q = 118;
         this.a = main.a.A / 2 - this.b / 2;
         this.p = main.a.B / 2 - this.q / 2;
      } else {
         this.b = 170;
         this.q = 170;
         this.a = main.a.A / 2 - this.b / 2;
         this.p = main.a.B / 2 - this.q / 2;
         if (main.a.B < 240) {
            this.p -= 10;
         }
      }

      this.h = this.a;
      this.g = 0;
      this.e = ak.f.size();
      if (main.a.e) {
         this.c.j = this.a;
         this.c.k = this.p + this.q + 5;
         this.d.j = this.a + this.b - 68;
         this.d.k = this.p + this.q + 5;
      }

      dv var2 = new dv();
      f = var2;
      var2.a(this.e, this.r, this.a, this.p + this.s, this.b, this.q - this.s, true, 1);
   }
}
