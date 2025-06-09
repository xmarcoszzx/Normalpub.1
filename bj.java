public final class bj {
   public ci a;
   private af b;
   private by c;
   private el d = new el("vDARTS");
   private int e;
   private int f;
   private int g;
   private int h;
   private int i;
   private int j;
   private int k;
   private int l = 0;
   private int m = 0;
   private boolean n = false;
   private boolean o = true;

   public bj(af var1, int var2, ci var3, int var4, int var5) {
      this.a = var3;
      this.b = var1;
      this.c = p.w[var2];
      this.h = this.c.i;
      this.i = var4;
      this.j = var5;
      Object var6;
      if (var1.aQ == null) {
         var6 = var1.aU;
      } else {
         var6 = var1.aQ;
      }

      var4 = ds.a(((bq)var6).l() - var4, ((bq)var6).m() - var5);
      this.e = var4;
      this.f = this.h * ds.b(var4) >> 10;
      var2 = this.h;
      this.g = ds.a(var4) * var2 >> 10;
   }

   private void b() {
      ds.c("END ME!");
      if (!this.b.ch && this.i >= p.j && this.i <= p.j + main.a.A) {
         bu.a();
      }

      this.b.E();
      if (this.b.ch) {
         this.b.ch = false;
         if (this.b.bJ && this.b.aq && this.b.H != 14 && this.b.H != 5) {
            this.b.bJ = false;
         }

         if (this.b.K == 2) {
            int var1;
            if (this.b.aq) {
               var1 = af.e().aC.b;
            } else {
               var1 = this.b.aP;
            }

            if (var1 < 77 || var1 > 83) {
               p.j().b(this.i, this.j);
            }
         } else {
            p.j().b(this.i, this.j);
         }
      }

      this.b.cd = null;
      this.b.ce = false;
      this.b.cf = null;
      this.b.cg = null;
      this.b.C();
   }

   public final void a() {
      byte var3 = 0;
      if (this.o) {
         if (this.b.aQ == null && this.b.aU == null) {
            this.b();
         } else {
            Object var4;
            if (this.b.aQ == null) {
               var4 = this.b.aU;
            } else {
               var4 = this.b.aQ;
            }

            int var1 = 0;

            while(true) {
               if (var1 >= this.c.h) {
                  for(var1 = var3; var1 < this.d.size(); ++var1) {
                     dx var6 = (dx)this.d.elementAt(var1);
                     ++var6.a;
                     if (var6.a >= this.c.c.length) {
                        this.d.removeElementAt(var1);
                     }
                  }

                  return;
               }

               if (this.c.c.length > 0) {
                  this.d.addElement(new dx(this.i, this.j));
               }

               byte var2;
               if (this.b.l() > ((bq)var4).l()) {
                  var2 = 10;
               } else {
                  var2 = -10;
               }

               this.l = var2 + ((bq)var4).l() - this.i;
               this.m = ((bq)var4).m() - ((bq)var4).n() / 2 - this.j;
               ++this.k;
               if (ds.g(this.l) < 20 && ds.g(this.m) < 20) {
                  if (this.b.aU != null && this.b.aU.aq) {
                     this.b.aU.a(this.b.aU.ac, 0L, this.b.aU.ae, this.b.aU.ad);
                  }

                  this.b();
                  break;
               }

               int var5 = ds.a(this.l, this.m);
               if (Math.abs(var5 - this.e) < 90 || this.l * this.l + this.m * this.m > 4096) {
                  if (Math.abs(var5 - this.e) < 15) {
                     this.e = var5;
                  } else if ((var5 - this.e < 0 || var5 - this.e >= 180) && var5 - this.e >= -180) {
                     this.e = ds.c(this.e - 15);
                  } else {
                     this.e = ds.c(this.e + 15);
                  }
               }

               if (this.h < 8192) {
                  this.h += 1024;
               }

               this.f = this.h * ds.b(this.e) >> 10;
               this.g = this.h * ds.a(this.e) >> 10;
               this.l += this.f;
               this.i += this.l >> 10;
               this.l &= 1023;
               this.m += this.g;
               this.j += this.m >> 10;
               this.m &= 1023;
               ++var1;
            }
         }
      }

   }

   public final void a(en var1) {
      if (this.o) {
         int var2 = ah.a(360 - this.e);
         byte var3 = ah.c[var2];
         int var4 = ah.b[var2];

         dx var6;
         for(var2 = this.d.size() / 2; var2 < this.d.size(); ++var2) {
            var6 = (dx)this.d.elementAt(var2);
            bl.b(var1, this.c.d[var6.a], var6.b, var6.c, 0, 3);
         }

         int var5 = main.a.w % this.c.b.length;
         bl.b(var1, this.c.b[var5][var3], this.i, this.j, var4, 3);

         for(var2 = 0; var2 < this.d.size(); ++var2) {
            var6 = (dx)this.d.elementAt(var2);
            bl.b(var1, this.c.c[var6.a], var6.b, var6.c, 0, 3);
         }

         bl.b(var1, this.c.a[var5][var3], this.i, this.j, var4, 3);

         for(var2 = 0; var2 < this.d.size(); ++var2) {
            var6 = (dx)this.d.elementAt(var2);
            if (ds.g(ah.a.nextInt(100)) < this.c.g) {
               short var7;
               if (main.a.w % 2 == 0) {
                  var7 = this.c.e[var6.a];
               } else {
                  var7 = this.c.f[var6.a];
               }

               bl.b(var1, var7, var6.b, var6.c, 0, 3);
            }
         }

         var1.a(16711680);
      }

   }
}
