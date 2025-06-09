import javax.microedition.lcdui.Image;

public final class cl extends aa implements bq {
   private static Image ad = l.b("/mainImage/shadowBig.png");
   public int a;
   private int ae;
   private int af;
   private boolean ag = true;
   private int ah;
   private int ai;
   private af[] aj;
   private long[] ak;
   private byte al;
   private int am;
   private int an = -1;
   private int ao = -1;
   private int ap = -1;
   private int[][] aq;
   public int b;

   static {
      l.b("/mainImage/myTexture2dmobHP.png");
   }

   public cl(int var1, short var2, short var3, int var4, long var5, long var7) {
      int[] var22 = new int[8];
      var22[4] = 1;
      var22[5] = 1;
      var22[6] = 1;
      var22[7] = 1;
      int[] var10 = new int[8];
      var10[4] = 1;
      var10[5] = 1;
      var10[6] = 1;
      var10[7] = 1;
      int[] var11 = new int[8];
      var11[4] = 1;
      var11[5] = 1;
      var11[6] = 1;
      var11[7] = 1;
      int[] var13 = new int[8];
      var13[4] = 1;
      var13[5] = 1;
      var13[6] = 1;
      var13[7] = 1;
      int[] var17 = new int[8];
      var17[4] = 1;
      var17[5] = 1;
      var17[6] = 1;
      var17[7] = 1;
      int[] var9 = new int[8];
      var9[4] = 1;
      var9[5] = 1;
      var9[6] = 1;
      var9[7] = 1;
      int[] var21 = new int[8];
      var21[4] = 1;
      var21[5] = 1;
      var21[6] = 1;
      var21[7] = 1;
      int[] var18 = new int[8];
      var18[4] = 1;
      var18[5] = 1;
      var18[6] = 1;
      var18[7] = 1;
      int[] var19 = new int[8];
      var19[4] = 1;
      var19[5] = 1;
      var19[6] = 1;
      var19[7] = 1;
      int[] var15 = new int[8];
      var15[4] = 1;
      var15[5] = 1;
      var15[6] = 1;
      var15[7] = 1;
      int[] var14 = new int[8];
      var14[4] = 1;
      var14[5] = 1;
      var14[6] = 1;
      var14[7] = 1;
      int[] var24 = new int[8];
      var24[4] = 1;
      var24[5] = 1;
      var24[6] = 1;
      var24[7] = 1;
      int[] var23 = new int[8];
      var23[4] = 1;
      var23[5] = 1;
      var23[6] = 1;
      var23[7] = 1;
      int[] var12 = new int[8];
      var12[4] = 1;
      var12[5] = 1;
      var12[6] = 1;
      var12[7] = 1;
      int[] var25 = new int[8];
      var25[4] = 1;
      var25[5] = 1;
      var25[6] = 1;
      var25[7] = 1;
      int[] var20 = new int[8];
      var20[4] = 1;
      var20[5] = 1;
      var20[6] = 1;
      var20[7] = 1;
      int[] var16 = new int[8];
      var16[4] = 1;
      var16[5] = 1;
      var16[6] = 1;
      var16[7] = 1;
      this.aq = new int[][]{var22, var10, var11, var13, var17, var9, var21, var18, var19, var15, var14, var24, var23, var12, var25, var20, var16};
      super.y = var1;
      var1 = var2 + 20;
      super.t = var1;
      super.m = var1;
      super.u = var3;
      super.n = var3;
      this.a = super.m;
      this.b = super.n;
      super.l = var7;
      super.k = var5;
      super.C = var4;
      super.U = 100;
      this.A();
      if (aa.c[super.C].f == null) {
         bt.a().h(super.C);
      }

      super.p = 2;
      this.aq = null;
   }

   public final void B() {
      try {
         t var1 = ac.d;
         StringBuffer var2 = new StringBuffer(String.valueOf(super.C));
         this.aq = (int[][])var1.get(var2.toString());
         super.v = aa.c[super.C].f.f;
         super.w = aa.c[super.C].f.g;
      } catch (Exception var3) {
      }

   }

   public final void C() {
      super.p = 4;
   }

   public final void D() {
      super.p = 0;
   }

   public final void a() {
      super.d = false;
   }

   public final void a(aa var1) {
      super.D = null;
      super.q = 0;
      super.r = 0;
      super.p = 3;
      this.ah = 0;
      int var2 = var1.m;
      int var3 = var1.n;
      if (ds.g(var2 - super.m) < super.v << 1 && ds.g(var3 - super.n) < super.w << 1) {
         if (super.m < var2) {
            super.m = var2 - super.v;
         } else {
            super.m = var2 + super.v;
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
      this.ah = 0;
      int var3 = var1.B;
      int var2 = var1.C;
      if (ds.g(var3 - super.m) < super.v << 1 && ds.g(var2 - super.n) < super.w << 1) {
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
      byte var2 = 1;
      byte var3 = 1;
      if (aa.c[super.C].f != null && !super.Y) {
         int var4;
         int var5;
         int var6;
         ck var9;
         int var10;
         if (super.M) {
            if (!super.d) {
               var9 = aa.c[super.C].f;
               var4 = this.ai;
               var6 = super.N;
               var5 = super.O;
               var2 = var3;
               if (super.o == 1) {
                  var2 = 0;
               }

               var9.a(var1, var4, var6, var5, var2, 2);
            } else {
               short var12 = super.e;
               var5 = super.N;
               var10 = super.O;
               if (super.o == 1) {
                  var2 = 0;
               } else {
                  var2 = 2;
               }

               bl.b(var1, var12, var5, var10, var2, 33);
            }
         } else {
            if (this.ag) {
               byte var11 = bv.i;
               if ((bv.l < 114 || bv.l > 120) && bv.l != 127 && bv.l != 128) {
                  if (bv.a(this.ae + var11 / 2, this.af + 1, 4)) {
                     var1.e(this.ae / var11 * var11, (this.af - 30) / var11 * var11, var11, 100);
                  } else if (bv.a((this.ae - var11 / 2) / var11, (this.af + 1) / var11) == 0) {
                     var1.e(this.ae / var11 * var11, var11 * ((this.af - 30) / var11), 100, 100);
                  } else if (bv.a((this.ae + var11 / 2) / var11, (this.af + 1) / var11) == 0) {
                     var1.e(this.ae / var11 * var11, (this.af - 30) / var11 * var11, var11, 100);
                  } else if (bv.a(this.ae - var11 / 2, this.af + 1, 8)) {
                     var1.e(this.ae / 24 * var11, (this.af - 30) / var11 * var11, var11, 100);
                  }
               }

               var1.a(ad, this.ae, this.af - 5, 3);
               var1.e(p.j, p.k - main.a.ae, p.d, p.e + main.a.ae * 2);
            }

            var1.a(0, main.a.ae);
            if (!super.d) {
               if (this.ap == -1) {
                  this.ap = super.n;
               }

               if (bv.a(super.m + 33, super.n, 4)) {
                  this.ao = bv.f(super.m + 33) - 33;
                  this.an = bv.f(super.m + 33);
                  if (super.m > this.ao && super.m < this.an && this.an != -1) {
                     super.m = this.ao;
                  }
               }

               if (super.n < this.ap && this.ap != -1) {
                  this.ap = super.n;
                  super.m += 33;
               }

               if (super.n > this.ap) {
                  this.ap = super.n;
                  super.m -= 33;
               }

               var9 = aa.c[super.C].f;
               var10 = this.ai;
               var5 = super.m;
               var4 = super.n;
               if (super.o == 1) {
                  var2 = 0;
               }

               var9.a(var1, var10, var5, var4, var2, 2);
            } else {
               short var13 = super.e;
               var5 = super.m;
               var4 = super.n;
               if (super.o == 1) {
                  var2 = 0;
               } else {
                  var2 = 2;
               }

               bl.b(var1, var13, var5, var4 - 9, var2, 33);
            }

            var1.a(0, -main.a.ae);
            if (super.k > 0L) {
               var4 = en.a(super.X);
               int var7 = en.b(super.X);
               var6 = super.m - var4;
               int var8 = super.n - super.w - 5;
               int var14 = (var4 << 1) * super.V / 100;
               if (super.W >= super.V) {
                  var5 = super.W;
                  if (main.a.w % 6 > 3) {
                     var10 = this.am++;
                  } else {
                     var10 = this.am;
                  }

                  var10 = var5 - var10;
                  super.W = var10;
                  var5 = var10 * var4 / 100;
                  if (super.W <= 0) {
                     super.W = 0;
                  }

                  if (super.W < super.V) {
                     super.W = super.V;
                  }

                  if (this.am >= 3) {
                     this.am = 3;
                  }
               } else {
                  var5 = var14;
               }

               if (var14 > var4) {
                  var10 = var14 - var4;
                  if (var10 <= 0) {
                     var10 = 0;
                     var14 = var4;
                  } else {
                     var14 = var4;
                  }
               } else {
                  var10 = 0;
               }

               var1.a(p.aJ, var6, var8, 20);
               var1.a(p.aJ, var6 + var4, var8, 20);
               var1.a(16777215);
               var1.d(var6, var8, var5, 2);
               var1.a(super.X, 0, 0, var14, var7, 0, var6, var8, 20);
               var1.a(super.X, 0, 0, var10, var7, 0, var6 + var4, var8, 20);
            }
         }
      }

   }

   public final void a(short var1) {
      super.d = true;
      super.e = var1;
   }

   public final void a(short var1, short var2) {
      if (var2 != -1) {
         if (ds.a(super.m, super.n, this.a, this.b) > 100) {
            super.m = var1;
            super.n = var2;
            super.p = 2;
         } else {
            this.a = var1;
            this.b = var2;
            super.p = 5;
         }
      } else {
         this.a = var1;
         super.p = 5;
      }

   }

   public final void a(int[] var1) {
      ++this.ah;
      if (this.ah > var1.length - 1) {
         this.ah = 0;
      }

      this.ai = var1[this.ah];
   }

   public final void a(af[] var1, long[] var2, byte var3, byte var4) {
      this.aj = var1;
      this.ak = var2;
      this.al = var3;
      super.o = var4;
      super.p = 3;
      if (super.m != this.a || super.n != this.b) {
         super.m += (this.a - super.m) / 4;
         super.n += (this.b - super.n) / 4;
      }

   }

   public final void b() {
   }

   public final void c() {
      if (this.aq == null && aa.c[super.C].f != null) {
         this.B();
      }

      if (this.aq != null && this.i()) {
         this.ae = super.m;
         if (bv.a(super.m, super.n, 2)) {
            this.af = super.n;
         } else {
            this.af = super.n;
            int var1 = 0;

            while(var1 < 30) {
               ++var1;
               this.af += 24;
               if (bv.a(this.ae, this.af, 2)) {
                  if (this.af % 24 != 0) {
                     this.af -= this.af % 24;
                  }
                  break;
               }
            }
         }

         switch(super.p) {
         case 0:
         case 1:
            ++this.ah;
            if (this.ah > this.aq[13].length - 1) {
               this.ah = this.aq[13].length - 1;
            }

            this.ai = this.aq[13][this.ah];
            if (super.m != this.a || super.n != this.b) {
               super.m += (this.a - super.m) / 4;
               super.n += (this.b - super.n) / 4;
            }
            break;
         case 2:
            this.a(this.aq[0]);
            if (super.m != this.a || super.n != this.b) {
               super.m += (this.a - super.m) / 4;
               super.n += (this.b - super.n) / 4;
            }
            break;
         case 3:
            this.f();
         case 4:
         default:
            break;
         case 5:
            super.x = 0;
            this.g();
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
            break;
         case 7:
            super.c();
         }
      }

   }

   public final void f() {
      if (this.ah == this.aq[this.al + 1].length - 1) {
         super.p = 2;
      }

      this.a(this.aq[this.al + 1]);
      if (this.ah == this.aq[15][this.al - 1]) {
         for(int var1 = 0; var1 < this.aj.length; ++var1) {
            this.aj[var1].a(this.ak[var1], 0L, false, false);
            at.a(this.aq[16][this.al - 1], this.aj[var1].B, this.aj[var1].C, 1);
         }
      }

   }

   public final void g() {
      this.a(this.aq[1]);
      byte var2 = aa.c[super.C].b;
      int var1 = var2;
      if (ds.g(super.m - this.a) < var2) {
         var1 = ds.g(super.m - this.a);
      }

      int var3 = super.m;
      if (super.m >= this.a) {
         var1 = -var1;
      }

      super.m = var1 + var3;
      super.n = this.b;
      if (super.m < this.a) {
         super.o = 1;
      } else if (super.m > this.a) {
         super.o = -1;
      }

      if (ds.g(super.m - this.a) <= 1) {
         super.m = this.a;
         super.p = 2;
      }

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
      return super.n;
   }

   public final int n() {
      return super.w;
   }

   public final int o() {
      return super.v;
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
