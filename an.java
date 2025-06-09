import javax.microedition.lcdui.Image;

public final class an extends aa implements bq {
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
   private af[] am;
   private long[] an;
   private byte ao;
   private int[] ap;
   private int[] aq;
   private int[] ar;
   private int[] as;
   public int b;

   static {
      l.b("/mainImage/myTexture2dmobHP.png");
   }

   public an(int var1, short var2, short var3, int var4, long var5, long var7) {
      int[] var9 = new int[12];
      var9[6] = 1;
      var9[7] = 1;
      var9[8] = 1;
      var9[9] = 1;
      var9[10] = 1;
      var9[11] = 1;
      this.ap = var9;
      var9 = new int[]{0, 0, 0, 2, 2, 2, 3, 3, 3, 4, 4, 4};
      this.aq = var9;
      var9 = new int[]{0, 0, 0, 4, 4, 4, 5, 5, 5, 6, 6, 6};
      this.ar = var9;
      var9 = new int[]{0, 0, 0, 7, 7, 7, 8, 8, 8, 9, 9, 9, 10, 10, 10, 11, 11};
      this.as = var9;
      super.y = var1;
      super.m = var2 + 20;
      super.n = var3;
      this.a = super.m;
      this.b = super.n;
      super.l = var7;
      super.k = var5;
      super.C = 71;
      super.U = 100;
      this.A();
      ae = null;
      ae = new ck();
      String var11 = "/x" + en.b + "/effectdata/" + 108 + "/data";

      try {
         ae.b(var11);
         ae.a = l.c("/effectdata/108/img.png");
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
      this.am = var1;
      this.an = var2;
      this.ao = var3;
      super.p = 3;
   }

   public final void b() {
   }

   public final void b(short var1) {
      this.a = var1;
      super.p = 5;
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
            this.a(this.ap);
            if (main.a.w % 5 == 0) {
               at.a(167, ds.b(super.m - 20, super.m + 20), ds.b(super.n - 40 + 20, super.n - 40 + 40), 1);
            }

            if (super.m != this.a || super.n != this.b) {
               super.m += (this.a - super.m) / 4;
               super.n += (this.b - super.n) / 4;
            }
            break;
         case 2:
            this.a(this.ap);
            if (super.m != this.a || super.n != this.b) {
               super.m += (this.a - super.m) / 4;
               super.n += (this.b - super.n) / 4;
            }
            break;
         case 3:
            this.f();
         case 4:
         case 7:
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
      byte var2 = -1;
      byte var1;
      int var3;
      if (this.ao == 3) {
         if (this.ak == this.ar.length - 1) {
            super.p = 2;
         }

         if (super.m < this.am[0].B) {
            var1 = 1;
         } else {
            var1 = -1;
         }

         super.o = var1;
         this.a(this.ar);
         super.m += (this.am[0].B - super.m) / 4;
         super.n += (this.am[0].C - super.n) / 4;
         this.a = super.m;
         if (this.ak == 8) {
            for(var3 = 0; var3 < this.am.length; ++var3) {
               this.am[var3].a(this.an[var3], 0L, false, false);
               at.a(102, this.am[var3].B, this.am[var3].C, 1);
            }
         }
      }

      if (this.ao == 4) {
         if (this.ak == this.as.length - 1) {
            super.p = 2;
         }

         var1 = var2;
         if (super.m < this.am[0].B) {
            var1 = 1;
         }

         super.o = var1;
         this.a(this.as);
         if (this.ak == 8) {
            for(var3 = 0; var3 < this.am.length; ++var3) {
               this.am[var3].a(this.an[var3], 0L, false, false);
               at.a(102, this.am[var3].B, this.am[var3].C, 1);
            }
         }
      }

   }

   public final void g() {
      this.a(this.aq);
      int var2 = super.m;
      byte var1;
      if (super.m < this.a) {
         var1 = 2;
      } else {
         var1 = -2;
      }

      super.m = var1 + var2;
      super.n = this.b;
      if (super.m < this.a) {
         var1 = 1;
      } else {
         var1 = -1;
      }

      super.o = var1;
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
      return super.n - 40;
   }

   public final int n() {
      return 40;
   }

   public final int o() {
      return 40;
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
