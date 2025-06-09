import javax.microedition.lcdui.Image;

public final class cc extends aa implements bq {
   private static Image ad = l.b("/mainImage/shadowBig.png");
   private static ck ae;
   public int a;
   private int[] aA;
   private int[] aB;
   private boolean aC;
   private int af;
   private int ag;
   private boolean ah;
   private int ai;
   private boolean aj = true;
   private int ak;
   private int al;
   private boolean am;
   private boolean an;
   private int ao;
   private int ap;
   private af[] aq;
   private long[] ar;
   private byte as;
   private int[] at;
   private int[] au;
   private int[] av;
   private int[] aw;
   private int[] ax;
   private int[] ay;
   private int[] az;
   public boolean b;

   public cc(int var1, short var2, short var3, int var4, long var5, long var7, int var9) {
      int[] var10 = new int[12];
      var10[8] = 1;
      var10[9] = 1;
      var10[10] = 1;
      var10[11] = 1;
      this.at = var10;
      this.au = new int[]{37, 37, 37, 38, 38, 38, 39, 39, 40, 40, 40, 39, 39, 39, 38, 38, 38};
      var10 = new int[]{0, 0, 34, 34, 35, 35, 36, 36, 2, 2, 1, 1};
      this.av = var10;
      var10 = new int[]{0, 0, 0, 4, 4, 6, 6, 9, 9, 10, 10, 13, 13, 15, 15, 17, 17, 19, 19, 21, 21, 23, 23};
      this.aw = var10;
      var10 = new int[]{0, 0, 1, 1, 4, 4, 6, 6, 8, 8, 25, 25, 26, 26, 28, 28, 30, 30, 32, 32, 2, 2, 1, 1};
      this.ax = var10;
      this.ay = new int[]{37, 37, 5, 5, 7, 7, 11, 11, 14, 14, 16, 16, 18, 18, 20, 20, 22, 22, 24, 24};
      this.az = new int[]{37, 37, 37, 38, 38, 5, 5, 7, 7, 11, 11, 27, 27, 29, 29, 31, 31, 33, 33, 38, 38};
      this.aA = new int[]{8, 8, 9, 9, 10, 10, 12, 12};
      var10 = new int[]{0, 0, 1, 1, 4, 4, 6, 6, 8, 8, 25, 25, 26, 26, 28, 28, 30, 30, 32, 32, 2, 2, 1, 1};
      this.aB = var10;
      int var12 = var2 + 20;
      super.m = var12;
      super.t = var12;
      super.n = var3;
      super.u = var3;
      super.y = var1;
      super.k = var5;
      super.l = var7;
      super.C = 70;
      super.U = 100;
      this.A();
      if (var9 == 0) {
         ae = null;
         ae = new ck();
         String var13 = "/x" + en.b + "/effectdata/" + 101 + "/data";

         try {
            ae.b(var13);
            ae.a = l.c("/effectdata/101/img.png");
         } catch (Exception var11) {
            bt.a().h(super.C);
         }

         super.v = ae.f;
         super.w = ae.g;
      }

      if (var9 == 1) {
         this.C();
      }

      if (var9 == 2) {
         this.C();
         this.b = true;
      }

      super.p = 2;
   }

   public final void C() {
      ae = null;
      ae = new ck();
      String var1 = "/x" + en.b + "/effectdata/" + 100 + "/data";

      try {
         ae.b(var1);
         ae.a = l.c("/effectdata/100/img.png");
      } catch (Exception var2) {
         bt.a().h(super.C);
      }

      super.p = 2;
      super.v = ae.f;
      super.w = ae.g;
   }

   public final void D() {
      super.p = 4;
      this.am = true;
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
      int var3 = var1.m;
      int var4 = var1.n;
      if (ds.g(var3 - super.m) < super.v << 1 && ds.g(var4 - super.n) < super.w << 1) {
         if (super.m < var3) {
            super.m = var3 - super.v;
         } else {
            super.m = var3 + super.v;
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
      int var3 = var1.B;
      int var4 = var1.C;
      if (ds.g(var3 - super.m) < super.v << 1 && ds.g(var4 - super.n) < super.w << 1) {
         if (super.m < var3) {
            super.m = var3 - super.v;
         } else {
            super.m = var3 + super.v;
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
         if (super.M) {
            if (!super.d) {
               var8 = ae;
               var3 = this.al;
               var4 = super.N;
               var5 = super.O;
               if (super.o == 1) {
                  var2 = 0;
               } else {
                  var2 = 1;
               }

               var8.a(var1, var3, var4, var5, var2, 2);
            } else {
               short var10 = super.e;
               var5 = super.N;
               var3 = super.O;
               if (super.o == 1) {
                  var2 = 0;
               } else {
                  var2 = 2;
               }

               bl.b(var1, var10, var5, var3, var2, 33);
            }
         } else {
            if (this.aj && super.p != 0) {
               var1.a(ad, this.af, super.u, 3);
               var1.e(p.j, p.k - main.a.ae, p.d, p.e + main.a.ae * 2);
            }

            var1.a(0, main.a.ae);
            if (!super.d) {
               var8 = ae;
               var4 = this.al;
               var5 = super.m;
               var3 = super.n;
               if (super.o == 1) {
                  var2 = 0;
               } else {
                  var2 = 1;
               }

               var8.a(var1, var4, var5, var3, var2, 2);
            } else {
               short var9 = super.e;
               var4 = super.m;
               var5 = super.n;
               if (super.o == 1) {
                  var2 = 0;
               } else {
                  var2 = 2;
               }

               bl.b(var1, var9, var4, var5 - 9, var2, 33);
            }

            var1.a(0, -main.a.ae);
            var4 = en.a(super.X);
            int var6 = en.b(super.X);
            var5 = super.m - var4;
            int var7 = super.n - super.w - 5;
            int var11 = (var4 << 1) * super.V / 100;
            if (var11 > var4) {
               var3 = var11 - var4;
               if (var3 <= 0) {
                  var3 = 0;
                  var11 = var4;
               } else {
                  var11 = var4;
               }
            } else {
               var3 = 0;
            }

            var1.a(p.aJ, var5, var7, 20);
            var1.a(p.aJ, var5 + var4, var7, 20);
            var1.a(super.X, 0, 0, var11, var6, 0, var5, var7, 20);
            var1.a(super.X, 0, 0, var3, var6, 0, var5 + var4, var7, 20);
            if (this.aC) {
               ++this.ap;
               if (this.as == 2) {
                  var2 = 19;
               } else {
                  var2 = 22;
               }

               ei.a(new ea(var2, super.m + this.ap * 50, super.n + 25, 2, 1, -1));
               if (this.as == 2) {
                  var2 = 19;
               } else {
                  var2 = 22;
               }

               ei.a(new ea(var2, super.m - this.ap * 50, super.n + 25, 2, 1, -1));
               if (this.ap == 50) {
                  this.ap = 0;
                  this.aC = false;
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
      this.aq = var1;
      this.ar = var2;
      this.as = var3;
      this.ak = 0;
      if (var3 < 3) {
         super.p = 3;
      }

      if (var3 == 3) {
         this.am = true;
         super.p = 4;
      }

      if (var3 == 4) {
         for(int var4 = 0; var4 < this.aq.length; ++var4) {
            this.aq[var4].a(this.ar[var4], 0L, false, false);
         }
      }

      if (var3 == 7) {
         super.p = 3;
      }

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

         int[] var2;
         switch(super.p) {
         case 0:
         case 1:
            if (this.b) {
               var2 = this.au;
            } else {
               var2 = this.at;
            }

            this.a(var2);
            if (main.a.w % 5 == 0) {
               at.a(167, ds.b(super.m - 30, super.m + 30), ds.b(this.m() + 20, this.m() + 40), 1);
            }

            if (super.m != super.t || super.n != super.u) {
               super.m += (super.t - super.m) / 4;
               super.n += (super.u - super.n) / 4;
            }
            break;
         case 2:
            if (this.b) {
               var2 = this.au;
            } else {
               var2 = this.at;
            }

            this.a(var2);
            if (super.m != super.t || super.n != super.u) {
               super.m += (super.t - super.m) / 4;
               super.n += (super.u - super.n) / 4;
            }
            break;
         case 3:
            this.f();
            break;
         case 4:
            super.x = 0;
            if (this.am) {
               ++this.ao;
               super.n -= this.ao;
               this.a(this.aA);
               if (super.n <= -500) {
                  this.am = false;
                  this.an = true;
                  this.ao = 0;
               }
            }

            if (this.an) {
               super.m = this.a;
               this.ao += 2;
               super.n += this.ao;
               this.a(this.aB);
               if (super.n > super.u) {
                  super.n = super.u;
                  this.an = false;
                  this.ao = 0;
                  super.p = 2;
                  p.bu = 10;
                  this.aC = true;
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
      byte var3 = -1;
      byte var1;
      int var2;
      if (this.as == 7) {
         if (this.ak > 8) {
            this.ak = 8;
         }

         this.a(this.av);
         if (main.a.w % 4 == 0) {
            var2 = super.m;
            if (super.o == 1) {
               var1 = 15;
            } else {
               var1 = -15;
            }

            at.a(70, var1 + var2, super.n - 40, 1);
         }
      }

      int var7;
      if (this.as == 0) {
         if (this.ak == this.av.length - 1) {
            super.p = 2;
         }

         if (super.m < this.aq[0].B) {
            var1 = 1;
         } else {
            var1 = -1;
         }

         super.o = var1;
         this.a(this.av);
         if (this.ak == 8) {
            for(var7 = 0; var7 < this.aq.length; ++var7) {
               int var4 = super.m;
               byte var6;
               if (super.o == 1) {
                  var6 = 45;
               } else {
                  var6 = -45;
               }

               ah.a(var6 + var4, super.n - 30, true, this.ar[var7], 0L, this.aq[var7], 24);
            }
         }
      }

      int[] var5;
      if (this.as == 1) {
         var2 = this.ak;
         if (this.b) {
            var7 = this.ay.length - 1;
         } else {
            var7 = this.aw.length - 1;
         }

         if (var2 == var7) {
            super.p = 2;
         }

         if (super.m < this.aq[0].B) {
            var1 = 1;
         } else {
            var1 = -1;
         }

         super.o = var1;
         if (this.b) {
            var5 = this.ay;
         } else {
            var5 = this.aw;
         }

         this.a(var5);
         super.m += (this.aq[0].B - super.m) / 4;
         super.n += (this.aq[0].C - super.n) / 4;
         if (this.ak == 18) {
            for(var7 = 0; var7 < this.aq.length; ++var7) {
               this.aq[var7].a(this.ar[var7], 0L, false, false);
               at.a(102, this.aq[var7].B, this.aq[var7].C, 1);
            }
         }
      }

      if (this.as == 2) {
         var2 = this.ak;
         if (this.b) {
            var7 = this.az.length - 1;
         } else {
            var7 = this.ax.length - 1;
         }

         if (var2 == var7) {
            super.p = 2;
         }

         var1 = var3;
         if (super.m < this.aq[0].B) {
            var1 = 1;
         }

         super.o = var1;
         if (this.b) {
            var5 = this.az;
         } else {
            var5 = this.ax;
         }

         this.a(var5);
         if (this.ak == 13) {
            p.bu = 10;
            this.aC = true;

            for(var7 = 0; var7 < this.aq.length; ++var7) {
               this.aq[var7].a(this.ar[var7], 0L, false, false);
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
      int var1;
      if (this.b) {
         var1 = super.n - 20;
      } else {
         var1 = super.n - 60;
      }

      return var1;
   }

   public final int n() {
      return 40;
   }

   public final int o() {
      return 60;
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
