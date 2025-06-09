import javax.microedition.lcdui.Image;

public final class d extends aa implements bq {
   private static Image ad = l.b("/mainImage/shadowBig.png");
   private static ck ae;
   public int a;
   private int af;
   private int ag;
   private boolean ah;
   private int ai;
   private boolean aj = true;
   private int ak;
   private int al;
   private boolean am;
   private int an;
   private int ao;
   private af[] ap;
   private long[] aq;
   private byte ar;
   private int[] as;
   private int[] at;
   private int[] au;
   private int[] av;
   private int[] aw;
   private boolean ax;
   public int b;

   static {
      l.b("/mainImage/myTexture2dmobHP.png");
   }

   public d(int var1, short var2, short var3, int var4, long var5, long var7) {
      int[] var9 = new int[12];
      var9[6] = 1;
      var9[7] = 1;
      var9[8] = 1;
      var9[9] = 1;
      var9[10] = 1;
      var9[11] = 1;
      this.as = var9;
      var9 = new int[]{0, 0, 0, 7, 7, 7, 8, 8, 8, 9, 9, 9};
      this.at = var9;
      var9 = new int[]{0, 0, 0, 10, 10, 10, 11, 11, 11, 12, 12, 12};
      this.au = var9;
      var9 = new int[]{0, 0, 1, 1, 4, 4, 6, 6, 8, 8, 25, 25, 26, 26, 28, 28, 30, 30, 32, 32, 2, 2, 1, 1};
      this.av = new int[]{4, 4, 4, 5, 5, 5, 6, 6, 6, 6, 6, 6, 3, 3, 3, 2, 2, 2, 1, 1, 1};
      this.aw = new int[]{6, 6, 6, 3, 3, 3, 2, 2, 2, 1, 1, 1};
      super.y = var1;
      var1 = var2 + 20;
      super.m = var1;
      this.a = var1;
      super.n = var3;
      this.b = var3;
      super.u = var3;
      super.k = var5;
      super.l = var7;
      super.C = 72;
      super.U = 100;
      this.A();
      ae = null;
      ae = new ck();
      String var11 = "/x" + en.b + "/effectdata/" + 109 + "/data";

      try {
         ae.b(var11);
         ae.a = l.c("/effectdata/109/img.png");
      } catch (Exception var10) {
         bt.a().h(super.C);
      }

      super.v = ae.f;
      super.w = ae.g;
      super.p = 2;
   }

   public final void a() {
      super.d = false;
   }

   public final void a(aa var1) {
      super.D = null;
      super.q = 0;
      super.r = 0;
      super.p = 3;
      this.ak = 0;
      byte var2;
      if (var1.m > super.m) {
         var2 = 1;
      } else {
         var2 = -1;
      }

      super.o = var2;
      int var4 = var1.m;
      int var3 = var1.n;
      if (ds.g(var4 - super.m) < super.v << 1 && ds.g(var3 - super.n) < super.w << 1) {
         if (super.m < var4) {
            super.m = var4 - super.v;
         } else {
            super.m = var4 + super.v;
         }

         super.s = 0;
      } else {
         super.s = 1;
      }

   }

   public final void a(af var1) {
      super.D = var1;
      super.q = 0;
      super.r = 0;
      super.p = 3;
      this.ak = 0;
      byte var2;
      if (var1.B > super.m) {
         var2 = 1;
      } else {
         var2 = -1;
      }

      super.o = var2;
      int var4 = var1.B;
      int var3 = var1.C;
      if (ds.g(var4 - super.m) < super.v << 1 && ds.g(var3 - super.n) < super.w << 1) {
         if (super.m < var4) {
            super.m = var4 - super.v;
         } else {
            super.m = var4 + super.v;
         }

         super.s = 0;
      } else {
         super.s = 1;
      }

   }

   public final void a(en var1) {
      if (ae != null && !super.Y) {
         byte var2;
         int var3;
         int var4;
         int var5;
         ck var8;
         short var9;
         if (super.M) {
            if (!super.d) {
               var8 = ae;
               var5 = this.al;
               var3 = super.N;
               var4 = super.O;
               if (super.o == 1) {
                  var2 = 0;
               } else {
                  var2 = 1;
               }

               var8.a(var1, var5, var3, var4, var2, 2);
            } else {
               var9 = super.e;
               var5 = super.N;
               var3 = super.O;
               if (super.o == 1) {
                  var2 = 0;
               } else {
                  var2 = 2;
               }

               bl.b(var1, var9, var5, var3, var2, 33);
            }
         } else {
            if (this.aj && super.p != 0) {
               var1.a(ad, this.af, super.u, 3);
               var1.e(p.j, p.k - main.a.ae, p.d, p.e + main.a.ae * 2);
            }

            var1.a(0, main.a.ae);
            if (!super.d) {
               var8 = ae;
               var5 = this.al;
               var4 = super.m;
               var3 = super.n;
               if (super.o == 1) {
                  var2 = 0;
               } else {
                  var2 = 1;
               }

               var8.a(var1, var5, var4, var3, var2, 2);
            } else {
               var9 = super.e;
               var3 = super.m;
               var5 = super.n;
               if (super.o == 1) {
                  var2 = 0;
               } else {
                  var2 = 2;
               }

               bl.b(var1, var9, var3, var5 - 9, var2, 33);
            }

            var1.a(0, -main.a.ae);
            var4 = en.a(super.X);
            var5 = en.b(super.X);
            int var7 = super.m - var4;
            int var6 = super.n - super.w - 5;
            int var10 = (var4 << 1) * super.V / 100;
            if (var10 > var4) {
               var3 = var10 - var4;
               if (var3 <= 0) {
                  var3 = 0;
                  var10 = var4;
               } else {
                  var10 = var4;
               }
            } else {
               var3 = 0;
            }

            var1.a(p.aJ, var7, var6, 20);
            var1.a(p.aJ, var7 + var4, var6, 20);
            var1.a(super.X, 0, 0, var10, var5, 0, var7, var6, 20);
            var1.a(super.X, 0, 0, var3, var5, 0, var7 + var4, var6, 20);
            if (this.ax) {
               ++this.ao;
               if (this.ar == 2) {
                  var2 = 19;
               } else {
                  var2 = 22;
               }

               ei.a(new ea(var2, super.m + this.ao * 50, super.n + 25, 2, 1, -1));
               if (this.ar == 2) {
                  var2 = 19;
               } else {
                  var2 = 22;
               }

               ei.a(new ea(var2, super.m - this.ao * 50, super.n + 25, 2, 1, -1));
               if (this.ao == 50) {
                  this.ao = 0;
                  this.ax = false;
               }
            }
         }
      }

   }

   public final void a(short var1) {
      super.d = true;
      super.e = var1;
   }

   public final void a(int[] var1) {
      ++this.ak;
      if (this.ak > var1.length - 1) {
         this.ak = 0;
      }

      this.al = var1[this.ak];
   }

   public final void a(af[] var1, long[] var2, byte var3) {
      super.p = 3;
      this.ap = var1;
      this.aq = var2;
      this.ar = var3;
      this.ak = 0;
   }

   public final void b() {
   }

   public final void c() {
      if (this.i()) {
         byte var1 = bv.i;
         this.af = super.m;
         this.ai = 0;
         if (this.ag > 0 && !bv.a(this.af, this.ag, 2)) {
            if (bv.a(this.af / var1, this.ag / var1) == 0) {
               this.ah = true;
            } else if (bv.a(this.af / var1, this.ag / var1) != 0 && !bv.a(this.af, this.ag, 2)) {
               this.af = super.m;
               this.ag = super.n;
               this.ah = false;
            }

            while(this.ah && this.ai < 10) {
               ++this.ai;
               this.ag += 24;
               if (bv.a(this.af, this.ag, 2)) {
                  if (this.ag % 24 != 0) {
                     this.ag -= this.ag % 24;
                  }
                  break;
               }
            }
         }

         switch(super.p) {
         case 0:
         case 1:
            this.a(this.as);
            if (main.a.w % 5 == 0) {
               at.a(167, ds.b(super.m - 25, super.m + 25), ds.b(super.n - 50 + 20, super.n - 50 + 40), 1);
            }

            if (super.m != this.a || super.n != this.b) {
               super.m += (this.a - super.m) / 4;
               super.n += (this.b - super.n) / 4;
            }
            break;
         case 2:
            this.a(this.as);
            if (super.m != this.a || super.n != this.b) {
               super.m += (this.a - super.m) / 4;
               super.n += (this.b - super.n) / 4;
            }
            break;
         case 3:
            this.f();
            break;
         case 4:
            super.x = 0;
            if (this.am) {
               super.m = this.a;
               this.an += 2;
               super.n += this.an;
               this.a(this.aw);
               if (super.n > super.u) {
                  super.n = super.u;
                  this.am = false;
                  this.an = 0;
                  super.p = 2;
                  p.bu = 10;
                  this.ax = true;
               }
            }
            break;
         case 5:
            super.x = 0;
            break;
         case 6:
            super.x = 0;
            ++super.q;
            super.n += super.q;
            if (super.n >= super.u) {
               super.n = super.u;
               super.q = 0;
               super.p = 5;
            }
         case 7:
         }
      }

   }

   public final void d() {
   }

   final boolean e() {
      boolean var1;
      if ((super.C < 58 || super.C > 65) && super.C != 67 && super.C != 68) {
         var1 = false;
      } else {
         var1 = true;
      }

      return var1;
   }

   public final void f() {
      byte var1;
      int var4;
      if (this.ar == 0) {
         if (this.ak == this.at.length - 1) {
            super.p = 2;
         }

         if (super.m < this.ap[0].B) {
            var1 = 1;
         } else {
            var1 = -1;
         }

         super.o = var1;
         this.a(this.at);
         super.m += (this.ap[0].B - super.m) / 4;
         super.n += (this.ap[0].C - super.n) / 4;
         this.a = super.m;
         if (this.ak == 8) {
            for(var4 = 0; var4 < this.ap.length; ++var4) {
               this.ap[var4].a(this.aq[var4], 0L, false, false);
               at.a(102, this.ap[var4].B, this.ap[var4].C, 1);
            }
         }
      }

      if (this.ar == 1) {
         if (this.ak == this.au.length - 1) {
            super.p = 2;
         }

         if (super.m < this.ap[0].B) {
            var1 = 1;
         } else {
            var1 = -1;
         }

         super.o = var1;
         this.a(this.au);
         if (this.ak == 8) {
            for(var4 = 0; var4 < this.ap.length; ++var4) {
               int var3 = super.m;
               byte var2;
               if (super.o == 1) {
                  var2 = 45;
               } else {
                  var2 = -45;
               }

               ah.a(var2 + var3, super.n - 25, true, this.aq[var4], 0L, this.ap[var4], 24);
            }
         }
      }

      if (this.ar == 2) {
         if (this.ak == this.av.length - 1) {
            super.p = 2;
         }

         if (super.m < this.ap[0].B) {
            var1 = 1;
         } else {
            var1 = -1;
         }

         super.o = var1;
         this.a(this.av);
         super.m += (this.ap[0].B - super.m) / 4;
         this.a = super.m;
         this.b = super.n;
         if (this.ak == 12) {
            for(var4 = 0; var4 < this.ap.length; ++var4) {
               this.ap[var4].a(this.aq[var4], 0L, false, false);
               at.a(102, this.ap[var4].B, this.ap[var4].C, 1);
            }
         }
      }

   }

   public final void g() {
   }

   public final boolean h() {
      boolean var2 = false;
      boolean var1;
      if (super.m < p.j) {
         var1 = var2;
      } else {
         var1 = var2;
         if (super.m <= p.j + p.d) {
            var1 = var2;
            if (super.n >= p.k) {
               var1 = var2;
               if (super.n <= p.k + p.e + 30) {
                  var1 = var2;
                  if (super.p != 0) {
                     var1 = true;
                  }
               }
            }
         }
      }

      return var1;
   }

   public final boolean i() {
      boolean var1;
      if (super.p == 0) {
         var1 = false;
      } else {
         var1 = true;
      }

      return var1;
   }

   public final boolean j() {
      boolean var1;
      if (!super.I && super.H <= 0) {
         var1 = false;
      } else {
         var1 = true;
      }

      return var1;
   }

   public final void k() {
      super.k = 0L;
      super.k = 0L;
      super.p = 1;
      super.q = -3;
      super.r = -super.o;
      super.s = 0;
   }

   public final int l() {
      return super.m;
   }

   public final int m() {
      return super.n - 50;
   }

   public final int n() {
      return 40;
   }

   public final int o() {
      return 50;
   }

   public final void p() {
      if (super.p == 5) {
         super.p = 2;
         super.s = 0;
         super.r = 0;
         super.q = 0;
      }

   }

   public final boolean q() {
      boolean var2 = true;
      boolean var1 = var2;
      if (super.p != 0) {
         var1 = var2;
         if (super.p != 1) {
            var1 = false;
         }
      }

      return var1;
   }

   public final void r() {
      if (super.j != 0) {
         super.j = 0;
      }

   }

   public final void s() {
   }

   public final void t() {
   }
}
