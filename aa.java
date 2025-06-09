import javax.microedition.lcdui.Image;

public class aa implements bq {
   public static el K = new el("lastMob");
   public static el L = new el("newMob");
   public static Image R = l.b("/mainImage/myTexture2dmobHP.png");
   public static dy[] c;
   public boolean A;
   public boolean B;
   public int C;
   public af D;
   public long E;
   public long F;
   public int G;
   public byte H;
   public boolean I;
   public boolean J;
   public boolean M = false;
   public int N;
   public int O;
   public int P;
   public int Q;
   public int S;
   public boolean T = true;
   public int U;
   public int V;
   public int W;
   public Image X;
   public boolean Y;
   public af Z;
   private int a = 1;
   public boolean aa;
   public boolean ab;
   public boolean ac;
   private el ad = new el("vMobMove");
   private boolean ae;
   private int af;
   private boolean ag = true;
   private int ah;
   private int ai;
   private boolean aj;
   private int ak;
   private int al;
   private int am;
   private int[] an;
   private int[] ao;
   private int[] ap;
   private int[] aq;
   private int[] ar;
   private int[] as;
   private int at;
   private aa au;
   private int av;
   private int[][] aw;
   private boolean ax;
   private boolean b;
   boolean d;
   short e;
   public boolean f;
   public boolean g = false;
   public int h;
   public long i;
   public int j;
   public long k;
   public long l;
   public int m;
   public int n;
   public int o = 1;
   public int p;
   public int q;
   public int r;
   public int s;
   public int t;
   public int u;
   public int v;
   public int w;
   public int x;
   public int y;
   public boolean z;

   public aa() {
      int[] var1 = new int[12];
      var1[8] = 1;
      var1[9] = 1;
      var1[10] = 1;
      var1[11] = 1;
      this.an = var1;
      this.ao = new int[]{1, 1, 1, 1, 2, 2, 2, 2, 3, 3, 3, 3, 2, 2, 2};
      this.ap = new int[]{1, 1, 2, 2, 3, 3, 2};
      this.aq = new int[]{4, 5, 6};
      this.ar = new int[]{7, 8, 9};
      this.as = new int[1];
      this.U = 24;
      this.V = 100;
      this.W = 100;
      this.at = 0;
      this.Y = false;
      this.aa = false;
      int[] var5 = new int[8];
      var5[4] = 1;
      var5[5] = 1;
      var5[6] = 1;
      var5[7] = 1;
      var1 = new int[8];
      var1[4] = 1;
      var1[5] = 1;
      var1[6] = 1;
      var1[7] = 1;
      int[] var6 = new int[8];
      var6[4] = 1;
      var6[5] = 1;
      var6[6] = 1;
      var6[7] = 1;
      int[] var2 = new int[8];
      var2[4] = 1;
      var2[5] = 1;
      var2[6] = 1;
      var2[7] = 1;
      int[] var4 = new int[8];
      var4[4] = 1;
      var4[5] = 1;
      var4[6] = 1;
      var4[7] = 1;
      int[] var3 = new int[8];
      var3[4] = 1;
      var3[5] = 1;
      var3[6] = 1;
      var3[7] = 1;
      this.aw = new int[][]{var5, var1, var6, var2, var4, var3};
      this.ax = true;
   }

   public aa(int var1, boolean var2, boolean var3, boolean var4, boolean var5, boolean var6, int var7, int var8, long var9, byte var11, long var12, short var14, short var15, byte var16, byte var17) {
      int[] var18 = new int[12];
      var18[8] = 1;
      var18[9] = 1;
      var18[10] = 1;
      var18[11] = 1;
      this.an = var18;
      this.ao = new int[]{1, 1, 1, 1, 2, 2, 2, 2, 3, 3, 3, 3, 2, 2, 2};
      this.ap = new int[]{1, 1, 2, 2, 3, 3, 2};
      this.aq = new int[]{4, 5, 6};
      this.ar = new int[]{7, 8, 9};
      this.as = new int[1];
      this.U = 24;
      this.V = 100;
      this.W = 100;
      this.at = 0;
      this.Y = false;
      this.aa = false;
      int[] var23 = new int[8];
      var23[4] = 1;
      var23[5] = 1;
      var23[6] = 1;
      var23[7] = 1;
      int[] var21 = new int[8];
      var21[4] = 1;
      var21[5] = 1;
      var21[6] = 1;
      var21[7] = 1;
      int[] var20 = new int[8];
      var20[4] = 1;
      var20[5] = 1;
      var20[6] = 1;
      var20[7] = 1;
      var18 = new int[8];
      var18[4] = 1;
      var18[5] = 1;
      var18[6] = 1;
      var18[7] = 1;
      int[] var19 = new int[8];
      var19[4] = 1;
      var19[5] = 1;
      var19[6] = 1;
      var19[7] = 1;
      int[] var22 = new int[8];
      var22[4] = 1;
      var22[5] = 1;
      var22[6] = 1;
      var22[7] = 1;
      this.aw = new int[][]{var23, var21, var20, var18, var19, var22};
      this.ax = true;
      this.z = var3;
      this.A = var5;
      this.B = var6;
      this.G = var8;
      this.y = var1;
      this.C = var7;
      this.k = var9;
      this.m = var14;
      this.t = var14;
      this.n = var15;
      this.u = var15;
      this.p = var16;
      if (var7 != 70) {
         C();
         this.v();
      }

      if (!a(String.valueOf(var7))) {
         L.addElement(String.valueOf(var7));
      }

      this.l = var12;
      this.H = var17;
      this.A();
      this.b = false;
      this.P = var14;
      this.Q = var15;
      if (this.D()) {
         var18 = new int[]{0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2};
         this.an = var18;
         var18 = new int[]{0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2};
         this.ao = var18;
         var18 = new int[]{0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2};
         this.ap = var18;
         this.aq = new int[]{3, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5, 5};
         this.ar = new int[]{3, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5, 5};
      } else if (this.E()) {
         var18 = new int[12];
         var18[8] = 1;
         var18[9] = 1;
         var18[10] = 1;
         var18[11] = 1;
         this.an = var18;
         this.ao = new int[]{1, 1, 1, 1, 2, 2, 2, 2, 1, 1, 1, 1, 3, 3, 3, 3};
         this.ap = new int[]{1, 1, 2, 2, 1, 1, 3, 3};
         this.aq = new int[]{4, 4, 4, 5, 5, 5, 6, 6, 6, 6, 6};
         this.ar = new int[]{7, 7, 7, 8, 8, 8, 9, 9, 9, 9, 9};
      } else if (this.e()) {
         var18 = new int[12];
         var18[8] = 1;
         var18[9] = 1;
         var18[10] = 1;
         var18[11] = 1;
         this.an = var18;
         this.ao = new int[]{2, 2, 3, 3, 2, 2, 4, 4, 2, 2, 3, 3, 2, 2, 4, 4};
         this.ap = new int[]{2, 2, 3, 3, 2, 2, 4, 4};
         this.aq = new int[]{5, 6, 7, 8, 9, 10, 11, 12};
         this.ar = new int[]{5, 12, 13, 14};
      } else {
         var18 = new int[12];
         var18[8] = 1;
         var18[9] = 1;
         var18[10] = 1;
         var18[11] = 1;
         this.an = var18;
         this.ao = new int[]{1, 1, 1, 1, 2, 2, 2, 2, 3, 3, 3, 3, 2, 2, 2};
         this.ap = new int[]{1, 1, 2, 2, 3, 3, 2};
         this.aq = new int[]{4, 5, 6};
         this.ar = new int[]{7, 8, 9};
      }

      ds.c("MOB ID= " + var1);
   }

   private static void C() {
      byte var3 = 0;
      int var2 = 0;

      int var0;
      int var1;
      for(var0 = 0; var2 < c.length; var0 = var1) {
         var1 = var0;
         if (c[var2].f != null) {
            var1 = var0 + 1;
         }

         ++var2;
      }

      if (var0 >= 10) {
         for(var1 = var3; var1 < c.length; ++var1) {
            if (c[var1].f != null && var0 > 5) {
               c[var1].f = null;
            }
         }
      }

   }

   private boolean D() {
      boolean var1;
      if (this.C == 76) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   private boolean E() {
      boolean var1;
      if (this.C >= 73 && !this.D()) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   private boolean F() {
      boolean var1;
      if (c[this.C].f != null && c[this.C].f.e == 2) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public static cl a(byte var0) {
      aa var1 = (aa)p.F.elementAt(var0);
      cl var2;
      if (var1 instanceof cl) {
         var2 = (cl)var1;
      } else {
         var2 = null;
      }

      return var2;
   }

   private static boolean a(String var0) {
      boolean var2 = false;

      for(int var1 = 0; var1 < L.size(); ++var1) {
         if (((String)L.elementAt(var1)).equals(var0)) {
            var2 = true;
            break;
         }
      }

      return var2;
   }

   public static cc w() {
      int var0 = 0;

      cc var2;
      while(true) {
         if (var0 >= p.F.size()) {
            var2 = null;
            break;
         }

         aa var1 = (aa)p.F.elementAt(var0);
         if (var1 instanceof cc) {
            var2 = (cc)var1;
            break;
         }

         ++var0;
      }

      return var2;
   }

   public static d x() {
      int var0 = 0;

      d var2;
      while(true) {
         if (var0 >= p.F.size()) {
            var2 = null;
            break;
         }

         aa var1 = (aa)p.F.elementAt(var0);
         if (var1 instanceof d) {
            var2 = (d)var1;
            break;
         }

         ++var0;
      }

      return var2;
   }

   public static an y() {
      int var0 = 0;

      an var2;
      while(true) {
         if (var0 >= p.F.size()) {
            var2 = null;
            break;
         }

         aa var1 = (aa)p.F.elementAt(var0);
         if (var1 instanceof an) {
            var2 = (an)var1;
            break;
         }

         ++var0;
      }

      return var2;
   }

   public final void A() {
      this.V = (int)(this.k * 100L / this.l);
      if (this.V >= 100) {
         this.W = this.V;
      }

      this.at = 0;
      if (this.V < 30) {
         this.X = p.aH;
      } else if (this.V < 60) {
         this.X = p.aI;
      } else {
         this.X = p.aK;
      }

   }

   public void B() {
      if (this.ax && this.F() && c[this.C].f != null) {
         this.aw = (int[][])ac.d.get(String.valueOf(this.C));
         this.an = this.aw[0];
         this.ao = this.aw[1];
         this.ap = this.aw[2];
         this.aq = this.aw[3];
         this.ar = this.aw[4];
         this.as = this.aw[5];
         this.ax = false;
      }

   }

   public void a() {
      this.d = false;
   }

   public void a(aa var1) {
      this.au = var1;
      this.T = true;
      this.D = null;
      this.q = 0;
      this.r = 0;
      this.p = 3;
      this.ah = 0;
      byte var2;
      if (var1.m > this.m) {
         var2 = 1;
      } else {
         var2 = -1;
      }

      this.o = var2;
      int var3 = var1.m;
      int var4 = var1.n;
      if (ds.g(var3 - this.m) < this.v << 1 && ds.g(var4 - this.n) < this.w << 1) {
         if (this.m < var3) {
            this.m = var3 - this.v;
         } else {
            this.m = var3 + this.v;
         }

         this.s = 0;
      } else {
         this.s = 1;
      }

   }

   public void a(af var1) {
      this.T = true;
      this.au = null;
      this.D = var1;
      this.q = 0;
      this.r = 0;
      this.p = 3;
      this.ah = 0;
      byte var2;
      if (var1.B > this.m) {
         var2 = 1;
      } else {
         var2 = -1;
      }

      this.o = var2;
      int var4 = var1.B;
      int var3 = var1.C;
      if (ds.g(var4 - this.m) < this.v << 1 && ds.g(var3 - this.n) < this.w << 1) {
         this.s = 0;
      } else {
         this.s = 1;
      }

   }

   public void a(en var1) {
      if (!this.Y) {
         byte var2;
         int var3;
         int var4;
         int var5;
         ck var7;
         if (this.M) {
            if (!this.d) {
               var7 = c[this.C].f;
               var3 = this.ai;
               var5 = this.N;
               var4 = this.O;
               if (this.o == 1) {
                  var2 = 0;
               } else {
                  var2 = 1;
               }

               var7.a(var1, var3, var5, var4, var2, 2);
            } else {
               short var10 = this.e;
               var4 = this.N;
               var3 = this.O;
               if (this.o == 1) {
                  var2 = 0;
               } else {
                  var2 = 2;
               }

               bl.b(var1, var10, var4, var3, var2, 33);
            }
         } else {
            if (this.ag && this.p != 0) {
               byte var8 = bv.i;
               if (bv.a(this.P + var8 / 2, this.Q + 1, 4)) {
                  var1.e(this.P / var8 * var8, (this.Q - 30) / var8 * var8, var8, 100);
               } else if (bv.a((this.P - var8 / 2) / var8, (this.Q + 1) / var8) == 0) {
                  var1.e(this.P / var8 * var8, var8 * ((this.Q - 30) / var8), 100, 100);
               } else if (bv.a((this.P + var8 / 2) / var8, (this.Q + 1) / var8) == 0) {
                  var1.e(this.P / var8 * var8, (this.Q - 30) / var8 * var8, var8, 100);
               } else if (bv.a(this.P - var8 / 2, this.Q + 1, 8)) {
                  var1.e(this.P / 24 * var8, (this.Q - 30) / var8 * var8, var8, 100);
               }

               var1.a(bv.x, this.P, this.Q, 3);
               var1.e(p.j, p.k - main.a.ae, p.d, p.e + main.a.ae * 2);
            }

            if (this.h() && (this.p != 1 || this.s <= 0 || main.a.w % 3 != 0)) {
               var1.a(0, main.a.ae);
               int var6;
               if (!this.d) {
                  var7 = c[this.C].f;
                  var4 = this.ai;
                  var3 = this.m;
                  var5 = this.n;
                  var6 = this.al;
                  if (this.o == 1) {
                     var2 = 0;
                  } else {
                     var2 = 1;
                  }

                  var7.a(var1, var4, var3, var6 + var5, var2, 2);
               } else {
                  short var9 = this.e;
                  var6 = this.m;
                  var4 = this.n;
                  var5 = this.al;
                  if (this.o == 1) {
                     var2 = 0;
                  } else {
                     var2 = 2;
                  }

                  bl.b(var1, var9, var6, var4 + var5 - 9, var2, 33);
               }

               var1.a(0, -main.a.ae);
               if (af.e().aQ != null && af.e().aQ.equals(this) && this.p != 1 && this.k > 0L && this.X != null) {
                  var5 = en.a(this.X);
                  var6 = en.b(this.X);
                  var3 = this.V * var5 / 100;
                  int var11;
                  if (this.W >= this.V) {
                     var4 = this.W;
                     if (main.a.w % 6 > 3) {
                        var11 = this.at++;
                     } else {
                        var11 = this.at;
                     }

                     var11 = var4 - var11;
                     this.W = var11;
                     var4 = var11 * var5 / 100;
                     if (this.W <= 0) {
                        this.W = 0;
                     }

                     if (this.W < this.V) {
                        this.W = this.V;
                     }

                     var11 = var4;
                     if (this.at >= 3) {
                        this.at = 3;
                        var11 = var4;
                     }
                  } else {
                     var11 = var3;
                  }

                  var1.a(p.aJ, this.m - (var5 >> 1), this.n - this.w - 5, 20);
                  var1.a(16777215);
                  var1.d(this.m - (var5 >> 1), this.n - this.w - 5, var11, 2);
                  var1.a(this.X, 0, 0, var3, var6, 0, this.m - (var5 >> 1), this.n - this.w - 5, 20);
               }
            }
         }
      }

   }

   public void a(short var1) {
      this.d = true;
      this.e = var1;
   }

   public void a(int[] var1) {
      if (this.ah > var1.length - 1) {
         this.ah = 0;
      }

      this.ai = var1[this.ah];
      ++this.ah;
   }

   public void b() {
      if (this.S == 0 && main.a.w % 25 == 0) {
         at.a(114, (aa)this, 1);
      }

      if (this.S == 1 && main.a.w % 4 == 0) {
         at.a(132, (aa)this, 1);
      }

      if (this.S == 2 && main.a.w % 7 == 0) {
         at.a(131, (aa)this, 1);
      }

   }

   public void c() {
      if (!this.M) {
         this.B();
         if (this.ab && main.a.w % 5 == 0) {
            at.a(113, this.m, this.n, 1);
         }

         if (this.ac && main.a.w % 10 == 0) {
            ei.a(new ea(41, this.m, this.n, 3, 1, 1));
         }

         int var1;
         int var2;
         if (!main.a.a && this.p != 1 && this.p != 0 && !main.a.a && main.a.w % ((this.y << 1) + 15) == 0) {
            af var6;
            for(var1 = 0; var1 < p.D.size(); ++var1) {
               var6 = (af)p.D.elementAt(var1);
               if (var6 != null && var6.ci && var6.as == 32) {
                  af var7 = new af();
                  var7.B = var6.B;
                  var7.C = var6.C - var6.al;
                  if (var6.K == 0) {
                     var2 = this.m;
                     ah.a(this.o * this.v + var2, this.n, this.j(), -100L, -100L, var7, 25);
                  }
               }
            }

            if (af.e().ci && af.e().as == 32) {
               var6 = new af();
               var6.B = af.e().B;
               var6.C = af.e().C - af.e().al;
               if (af.e().K == 0) {
                  var1 = this.m;
                  ah.a(this.o * this.v + var1, this.n, this.j(), -100L, -100L, var6, 25);
               }
            }
         }

         if (this.j != 0 && main.a.w % 5 == 0) {
            ei.a(new ea(this.j, this.m, this.n + 24, 3, 5, 1));
         }

         if (this.g) {
            if (main.a.w % 5 == 0) {
               at.a(113, this.m, this.n, 1);
            }

            long var4 = System.currentTimeMillis();
            if (var4 - this.i >= 1000L) {
               --this.h;
               this.i = var4;
               if (this.h < 0) {
                  this.g = false;
                  this.h = 0;
               }
            }

            if (this.F()) {
               this.ai = this.as[main.a.w % this.as.length];
            } else if (this.D()) {
               this.ai = this.aq[main.a.w % this.aq.length];
            } else if (this.E()) {
               if (main.a.w % 20 > 5) {
                  this.ai = 11;
               } else {
                  this.ai = 10;
               }
            } else if (this.e()) {
               if (main.a.w % 20 > 5) {
                  this.ai = 1;
               } else {
                  this.ai = 15;
               }
            } else if (main.a.w % 20 > 5) {
               this.ai = 11;
            } else {
               this.ai = 10;
            }
         }

         if (this.i()) {
            byte var8;
            if (this.ag) {
               var8 = bv.i;
               this.P = this.m;
               this.af = 0;
               if (this.Q > 0 && !bv.a(this.P, this.Q, 2)) {
                  if (bv.a(this.P / var8, this.Q / var8) == 0) {
                     this.ae = true;
                  } else if (bv.a(this.P / var8, this.Q / var8) != 0 && !bv.a(this.P, this.Q, 2)) {
                     this.P = this.m;
                     this.Q = this.n;
                     this.ae = false;
                  }

                  while(this.ae && this.af < 10) {
                     ++this.af;
                     this.Q += 24;
                     if (bv.a(this.P, this.Q, 2)) {
                        if (this.Q % 24 != 0) {
                           this.Q -= this.Q % 24;
                        }
                        break;
                     }
                  }
               }
            }

            if (this.ad != null || c[this.C].a == 0) {
               if (this.p != 3 && this.T) {
                  if (this.D != null) {
                     this.D.a(this.E, this.F, false, true);
                  } else if (this.au != null) {
                     this.au.d();
                  }

                  this.T = false;
               }

               if (this.H > 0) {
                  this.b();
               }

               switch(this.p) {
               case 1:
                  this.z = false;
                  this.A = false;
                  this.B = false;
                  this.n += this.q;
                  if (main.a.w % 2 == 0) {
                     if (this.r > 1) {
                        --this.r;
                     } else if (this.r < -1) {
                        ++this.r;
                     }
                  }

                  this.m += this.r;
                  if (this.F()) {
                     this.ai = this.as[main.a.w % this.as.length];
                  } else if (this.D()) {
                     this.ai = this.aq[main.a.w % this.aq.length];
                  } else if (!this.E() && this.e()) {
                     this.ai = 15;
                  } else {
                     this.ai = 11;
                  }

                  if (this.b) {
                     this.b = false;
                     if (this.J) {
                        for(var1 = 0; var1 < p.F.size(); ++var1) {
                           if (((aa)p.F.elementAt(var1)).y == this.y) {
                              p.F.removeElementAt(var1);
                           }
                        }
                     }

                     this.q = 0;
                     this.r = 0;
                     this.n = 0;
                     this.m = 0;
                     this.k = this.z().d;
                     this.p = 0;
                     this.x = 0;
                  } else {
                     if ((bv.b(this.m, this.n) & 2) == 2) {
                        if (this.q > 4) {
                           var1 = -4;
                        } else {
                           var1 = -this.q;
                        }

                        this.q = var1;
                        if (this.s == 0) {
                           this.s = 16;
                        }
                     } else {
                        ++this.q;
                     }

                     if (this.s > 0) {
                        --this.s;
                        if (this.s == 0) {
                           this.b = true;
                        }
                     }
                  }
                  break;
               case 2:
                  if (this.j == 0 && !this.g && !this.ab && !this.ac) {
                     this.x = 0;
                     this.a(this.an);
                     switch(c[this.C].c) {
                     case 0:
                     case 1:
                     case 2:
                     case 3:
                        ++this.q;
                        if (this.q > this.y % 10 + 10 && (this.D == null || ds.g(this.D.B - this.m) > 80) && (this.au == null || ds.g(this.au.m - this.m) > 80)) {
                           this.p = 5;
                        }
                        break;
                     case 4:
                     case 5:
                        ++this.q;
                        if (this.q > this.y % 3 && (this.D == null || ds.g(this.D.B - this.m) > 80) && (this.au == null || ds.g(this.au.m - this.m) > 80)) {
                           this.p = 5;
                        }
                     }

                     if (this.D != null && main.a.w % (this.q % 20 + 10) == 0) {
                        if (this.D.B > this.m) {
                           this.o = 1;
                        } else {
                           this.o = -1;
                        }
                     } else if (this.au != null && main.a.w % (this.q % 20 + 10) == 0) {
                        if (this.au.m > this.m) {
                           this.o = 1;
                        } else {
                           this.o = -1;
                        }
                     }

                     if (this.av > 0) {
                        --this.av;
                        this.p = 2;
                     }
                  }
                  break;
               case 3:
                  if (this.j == 0 && !this.ab && !this.ac && !this.g) {
                     this.f();
                  }
                  break;
               case 4:
                  if (this.j == 0 && !this.ab && !this.ac && !this.g) {
                     this.x = 0;
                     ++this.q;
                     if (this.q > this.y % 5 + 40) {
                        this.n -= 2;
                        this.p = 5;
                        this.q = 0;
                     }
                  }
                  break;
               case 5:
                  if (this.j == 0 && !this.ab && !this.ac) {
                     if (this.g) {
                        if (c[this.C].c == 4) {
                           ++this.am;
                           ++this.ak;
                           var2 = this.al;
                           if (!this.aj) {
                              var8 = 1;
                           } else {
                              var8 = -1;
                           }

                           this.al = var8 + var2;
                           if (this.ak == 10) {
                              this.ak = 0;
                              boolean var3;
                              if (this.aj) {
                                 var3 = false;
                              } else {
                                 var3 = true;
                              }

                              this.aj = var3;
                           }
                        }
                     } else {
                        this.x = 0;
                        this.g();
                     }
                  }
                  break;
               case 6:
                  this.x = 0;
                  ++this.q;
                  this.n += this.q;
                  if (this.n >= this.u) {
                     this.n = this.u;
                     this.q = 0;
                     this.p = 5;
                  }
                  break;
               case 7:
                  if (!this.T && main.a.w % 4 == 0) {
                     if (this.F()) {
                        this.ai = this.as[main.a.w % this.as.length];
                     } else if (this.D()) {
                        this.ai = this.aq[main.a.w % this.aq.length];
                     } else if (this.E()) {
                        if (this.ai != 10) {
                           this.ai = 10;
                        } else {
                           this.ai = 11;
                        }
                     } else if (this.e()) {
                        if (this.ai != 1) {
                           this.ai = 1;
                        } else {
                           this.ai = 15;
                        }
                     } else if (this.ai != 10) {
                        this.ai = 10;
                     } else {
                        this.ai = 11;
                     }
                  }

                  --this.x;
                  if (this.x <= 0 && (this.F() || this.D() || this.E() && this.ai == 11 || this.e() && this.ai == 15 || this.C < 58 && this.ai == 11)) {
                     if ((this.Z == null || !this.aa) && this.k != 0L) {
                        this.p = 5;
                        if (this.Z != null) {
                           this.o = -this.Z.I;
                           if (ds.g(this.m - this.Z.B) < 24) {
                              this.p = 2;
                           }
                        }

                        this.s = 0;
                        this.r = 0;
                        this.q = 0;
                        this.x = 0;
                     } else {
                        this.p = 1;
                        this.r = this.Z.I << 1;
                        this.q = -3;
                        this.s = 0;
                     }

                     this.Z = null;
                  } else if (c[this.C].c != 0 && this.Z != null) {
                     var1 = -this.Z.I;
                     if (this.m > this.t - c[this.C].a && this.m < this.t + c[this.C].a) {
                        this.m -= var1 << 1;
                     }
                  }
               }
            }
         }
      }

   }

   public void d() {
      if (this.k > 0L && this.p != 3 && this.p != 7) {
         this.x = 4;
         this.p = 7;
         if (this.z().c != 0 && ds.g(this.m - this.t) < 30) {
            this.m -= this.o * 10;
         }
      }

   }

   boolean e() {
      boolean var1;
      if ((this.C < 58 || this.C > 65) && this.C != 67 && this.C != 68) {
         var1 = false;
      } else {
         var1 = true;
      }

      return var1;
   }

   public void f() {
      int[] var4;
      if (this.s == 0) {
         var4 = this.aq;
      } else {
         var4 = this.ar;
      }

      if (this.ah < var4.length) {
         this.a(var4);
         if (this.m >= p.j && this.m <= p.j + main.a.A && this.s == 0 && main.a.w % 2 == 0) {
            bu.a();
         }
      }

      if (this.q == 0) {
         int var1;
         if (this.D != null) {
            var1 = this.D.B;
         } else {
            var1 = this.au.m;
         }

         int var2;
         if (this.D != null) {
            var2 = this.D.C;
         } else {
            var2 = this.au.n;
         }

         if (!this.E()) {
            if (this.m > this.t + c[this.C].a) {
               this.q = 1;
            }

            if (this.m < this.t - c[this.C].a) {
               this.q = 1;
            }
         }

         if ((c[this.C].c == 4 || c[this.C].c == 5) && !this.z) {
            int var3 = this.n;
            this.n = (var2 - this.n) / 20 + var3;
         }

         ++this.r;
         if (this.r > var4.length - 1 || this.q == 1) {
            this.q = 1;
            if (this.s == 0) {
               if (this.D != null) {
                  this.D.a(this.E, this.F, false, true);
               } else {
                  this.au.d();
               }

               this.T = false;
            } else {
               if (this.D != null) {
                  var2 = this.m;
                  ah.a(this.o * this.v + var2, this.n, this.j(), this.E, this.F, this.D, this.z().g);
               } else {
                  af var6 = new af();
                  var6.B = this.au.m;
                  var6.C = this.au.n;
                  var6.J = -100;
                  var2 = this.m;
                  ah.a(this.o * this.v + var2, this.n, this.j(), this.E, this.F, var6, this.z().g);
               }

               this.T = false;
            }
         }

         byte var5;
         if (this.m < var1) {
            var5 = 1;
         } else {
            var5 = -1;
         }

         this.o = var5;
      } else if (this.q == 1 && this.ah == var4.length) {
         this.p = 2;
         this.q = 0;
         this.r = 0;
         this.ah = 0;
      }

      if (this.ah == 5 && this.D != null && this.D.J == af.e().J) {
         if (this.C == 88 && this.s != 0) {
            p.bu = 2;
         }

         if (this.C == 89) {
            p.bu = 2;
         }
      }

   }

   public void g() {
      byte var2 = -1;

      boolean var10001;
      try {
         if (this.aa) {
            this.p = 1;
            this.r = this.Z.I << 3;
            this.q = -5;
            this.s = 0;
         }
      } catch (Exception var33) {
         var10001 = false;
         return;
      }

      try {
         if (this.A) {
            return;
         }
      } catch (Exception var32) {
         var10001 = false;
         return;
      }

      label457: {
         try {
            if (!this.z && !this.B) {
               break label457;
            }
         } catch (Exception var36) {
            var10001 = false;
            return;
         }

         try {
            this.a(this.an);
         } catch (Exception var31) {
            var10001 = false;
         }

         return;
      }

      label458: {
         byte var1;
         label459: {
            int var37;
            label460: {
               try {
                  switch(c[this.C].c) {
                  case 0:
                     break label458;
                  case 1:
                  case 2:
                  case 3:
                     break label459;
                  case 4:
                     break label460;
                  case 5:
                     break;
                  default:
                     return;
                  }
               } catch (Exception var35) {
                  var10001 = false;
                  return;
               }

               try {
                  var1 = (byte)(c[this.C].b + this.y % 2);
                  this.m += this.o * var1;
                  var2 = (byte)(var1 + (main.a.w + this.y) % 2);
                  if (main.a.w % 10 > 2) {
                     var37 = this.n;
                     this.n = var2 * this.a + var37;
                  }
               } catch (Exception var11) {
                  var10001 = false;
                  return;
               }

               label337: {
                  try {
                     if (this.m > this.t + c[this.C].a) {
                        this.o = -1;
                        this.p = 2;
                        this.av = main.a.w % 20 + 20;
                        this.q = 0;
                        break label337;
                     }
                  } catch (Exception var10) {
                     var10001 = false;
                     return;
                  }

                  try {
                     if (this.m < this.t - c[this.C].a) {
                        this.o = 1;
                        this.p = 2;
                        this.av = main.a.w % 20 + 20;
                        this.q = 0;
                     }
                  } catch (Exception var9) {
                     var10001 = false;
                     return;
                  }
               }

               label338: {
                  try {
                     if (this.n > this.u + 24) {
                        this.a = -1;
                        break label338;
                     }
                  } catch (Exception var8) {
                     var10001 = false;
                     return;
                  }

                  try {
                     if (this.n < this.u - (main.a.w % 10 + 20)) {
                        this.a = 1;
                     }
                  } catch (Exception var7) {
                     var10001 = false;
                     return;
                  }
               }

               try {
                  if (!bv.a(this.m, this.n, 2)) {
                     return;
                  }

                  if (main.a.w % 10 > 5) {
                     this.n = bv.e(this.n);
                     this.p = 4;
                     this.q = 0;
                     this.a = -1;
                     return;
                  }
               } catch (Exception var6) {
                  var10001 = false;
                  return;
               }

               try {
                  this.a = -1;
               } catch (Exception var5) {
                  var10001 = false;
               }

               return;
            }

            try {
               var2 = (byte)(c[this.C].b + this.y % 2);
               this.m += this.o * var2;
               if (main.a.w % 10 > 2) {
                  var37 = this.n;
                  this.n = var2 * this.a + var37;
               }
            } catch (Exception var17) {
               var10001 = false;
               return;
            }

            label340: {
               try {
                  if (this.m > this.t + c[this.C].a) {
                     this.o = -1;
                     this.p = 2;
                     this.av = main.a.w % 20 + 20;
                     this.q = 0;
                     break label340;
                  }
               } catch (Exception var16) {
                  var10001 = false;
                  return;
               }

               try {
                  if (this.m < this.t - c[this.C].a) {
                     this.o = 1;
                     this.p = 2;
                     this.av = main.a.w % 20 + 20;
                     this.q = 0;
                  }
               } catch (Exception var15) {
                  var10001 = false;
                  return;
               }
            }

            label341: {
               try {
                  if (this.n > this.u + 24) {
                     this.a = -1;
                     break label341;
                  }
               } catch (Exception var14) {
                  var10001 = false;
                  return;
               }

               try {
                  if (this.n < this.u - (main.a.w % 10 + 20)) {
                     this.a = 1;
                  }
               } catch (Exception var13) {
                  var10001 = false;
                  return;
               }
            }

            try {
               this.a(this.ao);
            } catch (Exception var12) {
               var10001 = false;
            }

            return;
         }

         byte var3;
         try {
            var3 = c[this.C].b;
         } catch (Exception var29) {
            var10001 = false;
            return;
         }

         if (var3 == 1) {
            try {
               if (main.a.w % 2 == 1) {
                  return;
               }
            } catch (Exception var27) {
               var10001 = false;
               return;
            }

            var1 = var3;
         } else if (var3 > 2) {
            try {
               var1 = (byte)(var3 + this.y % 2);
            } catch (Exception var26) {
               var10001 = false;
               return;
            }
         } else {
            label342: {
               var1 = var3;

               try {
                  if (main.a.w % 2 != 1) {
                     break label342;
                  }
               } catch (Exception var28) {
                  var10001 = false;
                  return;
               }

               var1 = (byte)(var3 - 1);
            }
         }

         label343: {
            try {
               int var38 = this.m;
               this.m = var1 * this.o + var38;
               if (this.m > this.t + c[this.C].a) {
                  this.o = -1;
                  break label343;
               }
            } catch (Exception var25) {
               var10001 = false;
               return;
            }

            try {
               if (this.m < this.t - c[this.C].a) {
                  this.o = 1;
               }
            } catch (Exception var24) {
               var10001 = false;
               return;
            }
         }

         label344: {
            label252: {
               label251: {
                  try {
                     if (ds.g(this.m - af.e().B) >= 40 || ds.g(this.m - this.t) >= c[this.C].a) {
                        break label344;
                     }

                     if (this.m > af.e().B) {
                        break label251;
                     }
                  } catch (Exception var23) {
                     var10001 = false;
                     return;
                  }

                  var1 = 1;
                  break label252;
               }

               var1 = var2;
            }

            try {
               this.o = var1;
               if (ds.g(this.m - af.e().B) < 20) {
                  this.m -= this.o * 10;
               }
            } catch (Exception var22) {
               var10001 = false;
               return;
            }

            try {
               this.p = 2;
               this.av = 20;
            } catch (Exception var21) {
               var10001 = false;
               return;
            }
         }

         int[] var4;
         label346: {
            try {
               if (this.v > 30) {
                  var4 = this.ao;
                  break label346;
               }
            } catch (Exception var20) {
               var10001 = false;
               return;
            }

            try {
               var4 = this.ap;
            } catch (Exception var19) {
               var10001 = false;
               return;
            }
         }

         try {
            this.a(var4);
         } catch (Exception var18) {
            var10001 = false;
         }

         return;
      }

      try {
         if (this.D()) {
            this.ai = this.an[main.a.w % this.an.length];
            return;
         }
      } catch (Exception var34) {
         var10001 = false;
         return;
      }

      try {
         this.ai = 0;
      } catch (Exception var30) {
         var10001 = false;
      }

   }

   public boolean h() {
      boolean var2 = false;
      boolean var1;
      if (this.m < p.j) {
         var1 = var2;
      } else {
         var1 = var2;
         if (this.m <= p.j + p.d) {
            var1 = var2;
            if (this.n >= p.k) {
               var1 = var2;
               if (this.n <= p.k + p.e + 30) {
                  var1 = var2;
                  if (c[this.C] != null) {
                     var1 = var2;
                     if (c[this.C].f != null) {
                        var1 = var2;
                        if (c[this.C].f.a != null) {
                           var1 = var2;
                           if (this.p != 0) {
                              var1 = true;
                           }
                        }
                     }
                  }
               }
            }
         }
      }

      return var1;
   }

   public boolean i() {
      boolean var2 = false;
      boolean var1;
      if (c[this.C] == null) {
         var1 = var2;
      } else {
         var1 = var2;
         if (c[this.C].f != null) {
            var1 = var2;
            if (this.p != 0) {
               var1 = true;
            }
         }
      }

      return var1;
   }

   public boolean j() {
      boolean var1;
      if (!this.I && this.H <= 0) {
         var1 = false;
      } else {
         var1 = true;
      }

      return var1;
   }

   public void k() {
      this.k = 0L;
      this.aa = true;
      this.k = 0L;
      this.p = 1;
      this.q = -3;
      this.r = -this.o;
      this.s = 0;
   }

   public int l() {
      return this.m;
   }

   public int m() {
      return this.n;
   }

   public int n() {
      return this.w;
   }

   public int o() {
      return this.v;
   }

   public void p() {
      if (this.p == 5) {
         this.p = 2;
         this.s = 0;
         this.r = 0;
         this.q = 0;
         this.av = 50;
      }

   }

   public boolean q() {
      boolean var2 = true;
      boolean var1 = var2;
      if (this.p != 0) {
         var1 = var2;
         if (this.p != 1) {
            var1 = false;
         }
      }

      return var1;
   }

   public void r() {
      if (this.j != 0) {
         this.j = 0;
      }

   }

   public void s() {
      this.ab = false;
   }

   public void t() {
      this.ac = false;
   }

   public final boolean u() {
      boolean var1;
      if (!(this instanceof an) && !(this instanceof d) && !(this instanceof cc) && !(this instanceof cl)) {
         var1 = false;
      } else {
         var1 = true;
      }

      return var1;
   }

   public final void v() {
      if (c[this.C].f == null) {
         c[this.C].f = new ck();
         String var1 = "/Mob/" + this.C;
         if ("".getClass().getResourceAsStream(var1) != null) {
            c[this.C].f.a(var1 + "/data");
            c[this.C].f.a = l.b(var1 + "/img.png");
         } else {
            bt.a().h(this.C);
         }

         if (K.size() > 15) {
            c[Integer.parseInt((String)K.elementAt(0))].f = null;
            K.removeElementAt(0);
         }

         K.addElement(String.valueOf(this.C));
      } else {
         this.v = c[this.C].f.f;
         this.w = c[this.C].f.g;
      }

   }

   public final dy z() {
      return c[this.C];
   }
}
