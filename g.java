import javax.microedition.lcdui.Image;
import main.GameMidlet;

public final class g implements b, bx {
   public static String[] G;
   public static String[] H;
   public static int I;
   private static Image aQ;
   private static Image aU;
   private static Image aV;
   public static int ab;
   public static boolean ad;
   public static String ar;
   public static boolean as;
   public static el at;
   private static int[][] bA;
   private static int[][] bB;
   private static String[] ba;
   private static String[] bb;
   private static String[][] bc;
   private static String[][] bd;
   private static String[][] be;
   private static String[][] bf;
   private static String[][] bg;
   private static String[][] bh;
   private static byte bi;
   private static byte bj;
   private static byte bk;
   private static byte bl;
   private static byte bm;
   private static byte bn;
   private static byte bo;
   private static int[] bq;
   private static int[] br;
   private static int[] bs;
   private static int[] bt;
   private static int[] bu;
   private static int[] bv;
   private static int[] bw;
   private static int[] bx;
   private static int[] by;
   private static int[][] bz;
   private static String[] cF;
   private static long[] co;
   private static int[] dg;
   private static int dh;
   private static int[][] di;
   public static Image i;
   public static String p;
   public static short q;
   public static Image r;
   public static Image s;
   public static Image t;
   public static Image u;
   public static Image v;
   public static Image w;
   public static Image x;
   public static Image y;
   public static Image z;
   public int A;
   public int B;
   public int C;
   public String[][] D;
   public String[] E;
   public String[] F;
   public String[][] J;
   public int[] K;
   public int[] L;
   public String[][][] M;
   public int N;
   public int O;
   public eh[] P;
   public el Q;
   public el R;
   public el S;
   public el T;
   public el U;
   public el V;
   public el W;
   public el X;
   public el Y;
   public el Z;
   public boolean a;
   public short aA;
   public short aB;
   public String[][] aC;
   private int aD;
   private int aE;
   private int aF;
   private int aG;
   private int aH;
   private int aI;
   private int[] aJ;
   private int aK;
   private int aL;
   private int aM;
   private int aN;
   private int aO;
   private int aP;
   private int aR;
   private boolean aS;
   private boolean aT;
   private de aW;
   private int[] aX;
   private String[][] aY;
   private int[] aZ;
   public de aa;
   public af ac;
   public int ae;
   public int af;
   public int ag;
   public int ah;
   public ae ai;
   public boolean aj;
   public int ak;
   public boolean al;
   public boolean am;
   public boolean an;
   public String ao;
   public String[] ap;
   public String[] aq;
   public boolean au;
   public byte av;
   public int aw;
   public int ax;
   public int ay;
   public boolean az;
   public int b;
   private h bC;
   private eh bD;
   private cb bE;
   private e bF;
   private el bG;
   private int bH;
   private boolean bI;
   private int bJ;
   private int bK;
   private int[] bL;
   private int bM;
   private int bN;
   private int bO;
   private boolean bP;
   private int bQ;
   private int bR;
   private int[] bS;
   private boolean bT;
   private boolean bU;
   private int bV;
   private int bW;
   private int bX;
   private int bY;
   private boolean bZ;
   private int[] bp;
   public int c;
   private int cA;
   private int cB;
   private int cC;
   private boolean cD;
   private int cE;
   private int cG;
   private af cH;
   private boolean cI;
   private boolean cJ;
   private boolean cK;
   private int cL;
   private int cM;
   private int cN;
   private int cO;
   private int cP;
   private int cQ;
   private int cR;
   private int[] cS;
   private int[] cT;
   private int[] cU;
   private int[] cV;
   private int cW;
   private int cX;
   private int cY;
   private int cZ;
   private int ca;
   private int cb;
   private int cc;
   private int cd;
   private boolean ce;
   private int cf;
   private String[][] cg;
   private String ch;
   private dv ci;
   private int cj;
   private int ck;
   private boolean cl;
   private String[] cm;
   private int cn;
   private int[] cp;
   private int cq;
   private h cr;
   private int cs;
   private int ct;
   private int cu;
   private int cv;
   private int cw;
   private int cx;
   private int cy;
   private int cz;
   public int d;
   private int da;
   private boolean db;
   private boolean dc;
   private boolean dd;
   private short de;
   private short[] df;
   private Image dj;
   private Image dk;
   private Image dl;
   private Image dm;
   private byte dn;
   private boolean do;
   public int e;
   public int f;
   public int g;
   public int h;
   public dr j;
   public el k = new el("");
   public int l;
   public boolean m;
   public String n;
   public cq o;

   static {
      aQ = l.b("/img/map" + bv.r + ".png");
      i = l.b("/mainImage/myTexture2dbantay.png");
      l.b("/mainImage/myTexture2dbtX.png");
      w = l.b("/mainImage/myTexture2dimgMoney.png");
      y = l.b("/mainImage/myTexture2dimgDiamond.png");
      z = l.b("/mainImage/luongkhoa.png");
      aU = l.b("/mainImage/myTexture2dup.png");
      aV = l.b("/mainImage/myTexture2ddown.png");
      r = l.b("/mainImage/star.png");
      s = l.b("/mainImage/starE.png");
      t = l.b("/mainImage/star8.png");
      l.b("/mainImage/star9.png");
      u = l.b("/mainImage/starCH.png");
      v = l.b("/mainImage/new.png");
      x = l.b("/mainImage/ticket12.png");
      G = new String[]{aw.bR, aw.bQ, aw.aF, aw.bP, aw.ap, aw.bT, aw.S};
      String var0;
      if (main.a.aj) {
         var0 = aw.fB;
      } else {
         var0 = aw.fC;
      }

      String var2 = aw.bU;
      String var3 = aw.G;
      String var1;
      if (en.b > 1) {
         var1 = aw.bY;
      } else {
         var1 = aw.bX;
      }

      H = new String[]{var0, var2, var3, var1};
      ba = new String[]{aw.fW, aw.bM, aw.bN, aw.ad, aw.fS};
      bb = new String[]{aw.n};
      I = 0;
      bc = new String[][]{aw.cd, aw.ce};
      bd = new String[][]{aw.cf, aw.ce};
      be = new String[][]{aw.cj};
      bf = new String[][]{aw.cg};
      bg = new String[][]{aw.ce, aw.ch, aw.ci};
      bh = aw.aO;
      bi = 0;
      bj = 1;
      bk = 3;
      bl = 4;
      bm = 5;
      bn = 6;
      bo = 7;
      int[] var5 = new int[]{21, 0, 1, 2, 24, 3, 4, 5, 6, 27, 28, 29, 30, 42, 47, 46};
      bq = var5;
      br = new int[]{39, 42, 105, 93, 61, 93, 142, 165, 210, 100, 165, 220, 233, 10, 125, 125};
      bs = new int[]{28, 60, 48, 96, 88, 131, 136, 95, 32, 200, 189, 167, 120, 110, 20, 20};
      bt = new int[]{22, 7, 8, 9, 25, 11, 12, 13, 10, 31, 32, 33, 34, 43};
      bu = new int[]{55, 30, 93, 80, 24, 149, 219, 220, 233, 170, 148, 195, 148, 10};
      bv = new int[]{136, 84, 69, 34, 25, 42, 32, 110, 192, 70, 106, 156, 210, 57};
      bw = new int[]{23, 14, 15, 16, 26, 17, 18, 20, 19, 35, 36, 37, 38, 44};
      bx = new int[]{90, 95, 144, 234, 231, 122, 176, 158, 205, 54, 105, 159, 231, 27};
      by = new int[]{10, 43, 20, 36, 69, 87, 112, 167, 160, 151, 173, 207, 194, 29};
      bz = new int[][]{bq, bt, bw};
      bA = new int[][]{br, bu, bx};
      bB = new int[][]{bs, bv, by};
      ab = 240;
      ad = false;
      co = new long[]{50000000L, 250000000L, 1250000000L, 5000000000L, 15000000000L, 30000000000L, 45000000000L, 60000000000L, 75000000000L, 90000000000L, 110000000000L, 130000000000L, 150000000000L, 170000000000L};
      ar = "";
      as = true;
      at = new el("");
      dg = new int[]{2, 1, 1};
      dh = 1;
      int[] var7 = new int[]{16777215, 15000805, 13487823, 11711155, 9671828, 7895160};
      var5 = new int[]{61952, 58624, 52224, 45824, 39168, 32768};
      int[] var8 = new int[]{16744192, 15037184, 13395456, 11753728, 10046464, 8404992};
      int[] var6 = new int[]{16776192, 15063040, 12635136, 11776256, 10063872, 8290304};
      int[] var4 = new int[]{16711680, 15007744, 13369344, 11730944, 10027008, 8388608};
      di = new int[][]{var7, var5, {13500671, 12058853, 10682572, 9371827, 7995545, 6684800}, var8, {37119, 33509, 28108, 24499, 21145, 17536}, var6, var4};
   }

   public g() {
      this.aW = new de(aw.bv, 0);
      String[][][] var1 = new String[][][]{null, null, bc, be, bf, null, null, {{""}}, {{""}}, {{""}}, {{""}}, {{""}}, bd, bg, {{""}}, {{""}}, {{""}}, {{""}}, {{""}}, {{""}}, {{""}}, bh, {{""}}, {{""}}, {{""}}, {{""}}, {{""}}};
      this.M = var1;
      this.bG = new el("");
      this.S = new el("");
      this.T = new el("");
      this.U = new el("");
      this.V = new el("");
      this.W = new el("");
      this.X = new el("");
      this.Y = new el("");
      this.Z = new el("");
      this.bH = 0;
      this.bJ = -1;
      this.bM = 0;
      this.aj = false;
      this.bS = new int[3];
      this.bY = 0;
      this.bZ = false;
      this.ca = main.a.t + this.aL;
      this.cb = main.a.u + this.aM;
      this.cc = -1;
      this.cd = -1;
      this.cf = -1;
      this.cg = new String[][]{aw.dj, aw.di};
      this.ch = "";
      this.ao = "";
      this.cm = new String[]{aw.t, aw.s, aw.r, aw.v, aw.gk, aw.gl};
      this.cn = 0;
      this.cp = new int[]{43520, 14743570, 14155776};
      this.cq = 0;
      this.cr = null;
      this.cu = 140;
      this.cv = -1;
      this.cx = 0;
      this.cy = 0;
      this.av = -1;
      this.dc = true;
      this.dd = false;
      this.az = true;
      this.dn = 0;
      this.do = false;
      this.a();
      this.aa = new de("", this, 1003, (Object)null);
      this.aa.g = l.b("/mainImage/myTexture2dbtX.png");
      this.aa.q = true;
      this.bC = null;
   }

   private void A(en var1) {
      this.a(var1, af.e());
   }

   private static void B(en var0) {
      di.c.a(var0, aw.aK[bv.r], 60, 4, 0);
      String var1;
      if (bv.l >= 135 && bv.l <= 138) {
         var1 = " " + aw.l + bv.n;
      } else {
         var1 = "";
      }

      di.n.a(var0, bv.k + var1, 60, 16, 0);
      di.c.a(var0, aw.fp + ": ", 60, 27, 0);
      if (p.w() >= 0 && p.w() <= bv.w.length - 1) {
         di.n.a(var0, bv.w[p.w()], 60, 38, 0);
      } else {
         di.n.a(var0, aw.ep, 60, 38, 0);
      }

   }

   private void C(en var1) {
      di.n.a(var1, aw.eW + ": " + af.e().U + " / " + af.e().V, this.b + 60, 2, 0, di.o);
      di.n.a(var1, aw.eX + ": " + af.e().T + " / " + af.e().W, this.b + 60, 14, 0, di.o);
      di.n.a(var1, aw.eY + ": " + af.e().X + ", " + aw.fb + ": " + af.e().P + "%", this.b + 60, 26, 0, di.o);
      di.n.a(var1, aw.eV + ": " + af.e().cv + "%, " + aw.eU + ": " + af.e().cw + "%", this.b + 60, 38, 0, di.o);
   }

   private void D(en var1) {
      var1.e(this.ae, this.af, this.ag, this.ah);
      var1.a(-this.aL, -this.aM);
      var1.a(aQ, this.ae, this.af, 0);
      int var2 = af.e().bU;
      bl.b(var1, p.x[var2].a[af.bC[0][0][0]].a, this.cz, this.cA + 5, 0, 3);
      byte var8 = 2;
      if (this.cz <= 40) {
         var8 = 0;
      }

      if (this.cz >= 220) {
         var8 = 1;
      }

      di.d.a(var1, bv.k, this.cz, this.cA - 12, var8, di.o);
      int var3 = -1;
      if (p.w() != -1) {
         for(var2 = 0; var2 < bz[bv.r].length; ++var2) {
            var3 = var2;
            if (bz[bv.r][var2] == p.w()) {
               break;
            }

            var3 = 4;
         }

         if (main.a.w % 4 > 0) {
            var1.a(ce.f, this.ae + bA[bv.r][var3], this.af + bB[bv.r][var3], 3);
         }
      } else {
         var3 = -1;
      }

      int var4;
      int var5;
      int var6;
      if (!main.a.e) {
         var1.a(i, this.cB, this.cC, cj.b);

         for(var4 = 0; var4 < bA[bv.r].length; ++var4) {
            var5 = bA[bv.r][var4] + this.ae;
            var6 = bB[bv.r][var4] + this.af;
            if (ds.a(var5 - 15, var6 - 15, 30, 30, this.cB, this.cC)) {
               var8 = 2;
               if (var5 <= 20) {
                  var8 = 0;
               }

               if (var5 >= 220) {
                  var8 = 1;
               }

               di.d.a(var1, bv.w[bz[bv.r][var4]], var5, var6 - 12, var8, di.o);
               break;
            }
         }
      } else if (!this.bZ) {
         for(var4 = 0; var4 < bA[bv.r].length; ++var4) {
            var5 = bA[bv.r][var4] + this.ae;
            var6 = bB[bv.r][var4] + this.af;
            if (ds.a(var5 - 15, var6 - 15, 30, 30, this.ca, this.cb)) {
               var8 = 2;
               if (var5 <= 30) {
                  var8 = 0;
               }

               if (var5 >= 220) {
                  var8 = 1;
               }

               var1.a(i, var5, var6, cj.b);
               di.d.a(var1, bv.w[bz[bv.r][var4]], var5, var6 - 12, var8, di.o);
               break;
            }
         }
      }

      var1.a(-var1.a(), -var1.b());
      if (var3 != -1) {
         if (bA[bv.r][var3] + this.ae < this.aL) {
            var1.a(aa.R, 0, 0, 9, 6, 5, this.ae + 5, this.af + this.ah / 2 - 4, 0);
         }

         if (this.aL + this.ag < bA[bv.r][var3] + this.ae) {
            var1.a(aa.R, 0, 0, 9, 6, 6, this.ae + this.ag - 5, this.af + this.ah / 2 - 4, cj.b);
         }

         Image var7;
         if (bB[bv.r][var3] < this.aM) {
            var7 = aa.R;
            var2 = this.ae;
            var1.a(var7, 0, 0, 9, 6, 1, this.ag / 2 + var2, this.af + 5, cj.a);
         }

         if (bB[bv.r][var3] > this.aM + this.ah) {
            var7 = aa.R;
            var2 = this.ae;
            var1.a(var7, 0, 0, 9, 6, 0, this.ag / 2 + var2, this.af + this.ah - 5, cj.c);
         }
      }

   }

   private void E(en var1) {
      byte var6;
      if (main.a.B > 300) {
         var6 = 20;
      } else {
         var6 = 15;
      }

      int var2;
      String var10;
      di var17;
      if (as) {
         p.j();
         if (!p.e()) {
            p.j();
            if (!p.f()) {
               Image var9;
               if (this.cd == 1) {
                  var9 = p.ax;
               } else {
                  var9 = p.aw;
               }

               var1.a(var9, this.ae + this.ag / 2, this.af + this.ah - var6, 3);
               var17 = di.f;
               var10 = aw.cl;
               var2 = this.ae;
               var17.a(var1, var10, this.ag / 2 + var2, this.af + this.ah - (var6 + 5), 2);
            }
         }
      }

      this.cs = this.ae + 5;
      this.ct = this.af + 14;
      this.cy = this.ct;
      var1.e(this.ae, this.af, this.ag, this.ah - 35);
      if (this.ci != null) {
         if (this.ci.d > 0) {
            var1.a(aa.R, 0, 0, 9, 6, 1, this.ae + this.ag - 12, this.af + 3, 0);
         }

         if (this.ci.d < this.ci.l) {
            var1.a(aa.R, 0, 0, 9, 6, 0, this.ae + this.ag - 12, this.af + this.ah - 45, 0);
         }

         var1.a(0, -this.ci.d);
      }

      this.cw = 0;
      boolean var3 = false;
      int var4;
      int var13;
      String var18;
      String var19;
      di var20;
      if (af.e().aD != null) {
         for(var2 = 0; var2 < af.e().aD.d.length; ++var2) {
            var17 = di.o;
            var10 = af.e().aD.d[var2];
            var4 = this.ae;
            var17.a(var1, var10, this.ag / 2 + var4, var2 * 12 + (this.cy - 5), 2);
            ++this.cw;
         }

         this.cy += (af.e().aD.d.length - 1) * 12;
         int var5 = 0;
         byte var14 = 0;
         boolean var12 = var3;

         for(var13 = var14; var5 < af.e().aD.f.length; ++var5) {
            int var7;
            if (af.e().aD.f[var5] != null) {
               label195: {
                  var19 = "- " + af.e().aD.f[var5];
                  if (af.e().aD.b[var5] != -1) {
                     if (af.e().aD.a == var5) {
                        var10 = var19;
                        if (af.e().aD.b[var5] != 1) {
                           var10 = var19 + " (" + af.e().aD.h + "/" + af.e().aD.b[var5] + ")";
                        }

                        if (af.e().aD.h != af.e().aD.b[var5]) {
                           var17 = di.o;
                           if (!var12) {
                              var3 = true;
                              var17 = di.q;
                              var4 = this.cs;
                              if (var17 == di.q && main.a.w % 20 > 10) {
                                 var2 = main.a.w % 4 / 2;
                              } else {
                                 var2 = 0;
                              }

                              var7 = this.cy + 12;
                              this.cy = var7;
                              var17.a(var1, var10, var4 + 5 + var2, var7, 0);
                              var12 = var3;
                           } else {
                              var4 = this.cs;
                              if (var17 == di.q && main.a.w % 20 > 10) {
                                 var13 = main.a.w % 4 / 2;
                              } else {
                                 var13 = 0;
                              }

                              var7 = this.cy + 12;
                              this.cy = var7;
                              var17.a(var1, "- ...", var4 + 5 + var13, var7, 0);
                           }
                           break label195;
                        }

                        di var11 = di.k;
                        var4 = this.cs;
                        var13 = 5;
                        var19 = var10;
                        var20 = var11;
                     } else {
                        if (af.e().aD.a <= var5) {
                           var10 = var19;
                           if (af.e().aD.b[var5] != 1) {
                              var10 = var19 + " 0/" + af.e().aD.b[var5];
                           }

                           var17 = di.o;
                           if (!var12) {
                              var3 = true;
                              var17 = di.q;
                              var4 = this.cs;
                              if (var17 == di.q && main.a.w % 20 > 10) {
                                 var2 = main.a.w % 4 / 2;
                              } else {
                                 var2 = 0;
                              }

                              var7 = this.cy + 12;
                              this.cy = var7;
                              var17.a(var1, var10, var4 + 5 + var2, var7, 0);
                              var12 = var3;
                           } else {
                              var4 = this.cs;
                              if (var17 == di.q && main.a.w % 20 > 10) {
                                 var13 = main.a.w % 4 / 2;
                              } else {
                                 var13 = 0;
                              }

                              var7 = this.cy + 12;
                              this.cy = var7;
                              var17.a(var1, "- ...", var4 + 5 + var13, var7, 0);
                           }
                           break label195;
                        }

                        var18 = var19;
                        if (af.e().aD.b[var5] != 1) {
                           var18 = var19 + " (" + af.e().aD.b[var5] + "/" + af.e().aD.b[var5] + ")";
                        }

                        var20 = di.s;
                        var4 = this.cs;
                        var13 = 5;
                        var19 = var18;
                     }
                  } else if (af.e().aD.a > var5) {
                     var20 = di.s;
                     var4 = this.cs;
                     var13 = 5;
                  } else {
                     var20 = di.o;
                     if (!var12) {
                        var3 = true;
                        var20 = di.q;
                        var4 = this.cs;
                        if (var20 == di.q && main.a.w % 20 > 10) {
                           var2 = main.a.w % 4 / 2;
                        } else {
                           var2 = 0;
                        }

                        var7 = this.cy + 12;
                        this.cy = var7;
                        var20.a(var1, var19, var4 + 5 + var2, var7, 0);
                        var12 = var3;
                        break label195;
                     }

                     var19 = "- ...";
                     var4 = this.cs + 5;
                     if (var20 == di.q && main.a.w % 20 > 10) {
                        var13 = main.a.w % 4 / 2;
                     } else {
                        var13 = 0;
                     }
                  }

                  var7 = this.cy + 12;
                  this.cy = var7;
                  var20.a(var1, var19, var13 + var4, var7, 0);
               }

               ++this.cw;
               var13 = var5;
            } else {
               boolean var15 = var12;
               if (af.e().aD.a <= var5) {
                  var10 = "- " + af.e().aD.f[var13];
                  var17 = di.o;
                  var15 = var12;
                  if (!var12) {
                     var15 = true;
                     var17 = di.q;
                  }

                  var7 = this.cs;
                  if (var17 == di.q && main.a.w % 20 > 10) {
                     var2 = main.a.w % 4 / 2;
                  } else {
                     var2 = 0;
                  }

                  int var8 = this.cy + 12;
                  this.cy = var8;
                  var17.a(var1, var10, var7 + 5 + var2, var8, 0);
               }

               var12 = var15;
            }
         }

         this.cy += 5;

         for(var2 = 0; var2 < af.e().aD.e.length; ++var2) {
            var20 = di.m;
            var19 = af.e().aD.e[var2];
            var4 = this.cs;
            var13 = this.cy + 12;
            this.cy = var13;
            var20.a(var1, var19, var4 + 5, var13, 0);
            ++this.cw;
         }
      } else {
         var13 = p.w();
         byte var16 = p.x();
         if (var13 != -3 && var16 != -3) {
            if (af.e().aD == null && af.e().L == 9 && af.e().ax.a == 0) {
               var19 = aw.aY;
            } else {
               if (var16 < 0 || var13 < 0) {
                  return;
               }

               var19 = aw.aV[0] + do.dg[var16].b + aw.aV[1] + bv.w[var13] + aw.aV[2];
            }
         } else {
            var19 = aw.aV[3];
         }

         String[] var21 = di.s.a(var19, 150);

         for(var2 = 0; var2 < var21.length; ++var2) {
            if (var2 == 0) {
               var20 = di.s;
               var18 = var21[var2];
               var13 = this.cs;
               var4 = this.ct;
               this.cy = var4;
               var20.a(var1, var18, var13 + 5, var4, 0);
            } else {
               var20 = di.s;
               var18 = var21[var2];
               var4 = this.cs;
               var13 = this.cy + 12;
               this.cy = var13;
               var20.a(var1, var18, var4 + 5, var13, 0);
            }
         }
      }

      if (this.ci == null) {
         this.ci = new dv();
         this.ci.a(this.cw, 12, this.ae, this.af, this.ag, this.ah - var6 - 40, true, 1);
      }

   }

   private void F(en var1) {
      var1.e(this.ae, this.af, this.ag, this.ah);
      var1.a(0, -this.g);

      for(int var2 = 0; var2 < H.length; ++var2) {
         int var5 = this.ae;
         int var6 = this.af + this.aD * var2;
         int var4 = this.ag;
         int var7 = this.aD;
         if (var6 - this.g <= this.af + this.ah && var6 - this.g >= this.af - this.aD) {
            int var3;
            if (var2 == this.ak) {
               var3 = 16383818;
            } else {
               var3 = 15196114;
            }

            var1.a(var3);
            var1.d(var5, var6, var4 - 1, var7 - 1);
            di.f.a(var1, H[var2], this.ae + 25, var6 + 6, 0);
         }
      }

      this.f(var1);
   }

   private static int G() {
      int var0 = 0;

      while(true) {
         if (var0 >= bz[bv.r].length) {
            var0 = -1;
            break;
         }

         if (bv.l == bz[bv.r][var0]) {
            var0 = bA[bv.r][var0];
            break;
         }

         ++var0;
      }

      return var0;
   }

   private void G(en var1) {
      var1.e(this.ae, this.af, this.ag, this.ah);
      var1.a(0, -this.g);

      for(int var2 = 0; var2 < ba.length; ++var2) {
         int var7 = this.ae;
         int var4 = this.af + this.aD * var2;
         int var6 = this.ag;
         int var5 = this.aD;
         if (var4 - this.g <= this.af + this.ah && var4 - this.g >= this.af - this.aD) {
            int var3;
            if (var2 == this.ak) {
               var3 = 16383818;
            } else {
               var3 = 15196114;
            }

            var1.a(var3);
            var1.d(var7, var4, var6 - 1, var5 - 1);
            di var9 = di.f;
            String var8 = ba[var2];
            var3 = this.ae;
            var9.a(var1, var8, this.ag / 2 + var3, var4 + 6, 2);
         }
      }

      this.f(var1);
   }

   private static int H() {
      int var0 = 0;

      while(true) {
         if (var0 >= bz[bv.r].length) {
            var0 = -1;
            break;
         }

         if (bv.l == bz[bv.r][var0]) {
            var0 = bB[bv.r][var0];
            break;
         }

         ++var0;
      }

      return var0;
   }

   private static int I() {
      int var0;
      if (af.e().aD == null) {
         var0 = -1;
      } else {
         for(var0 = 0; var0 < bz[bv.r].length; ++var0) {
            if (p.ad[af.e().aD.a] == bz[bv.r][var0]) {
               var0 = bA[bv.r][var0];
               return var0;
            }
         }

         var0 = -1;
      }

      return var0;
   }

   private static int J() {
      int var0;
      if (af.e().aD == null) {
         var0 = -1;
      } else {
         for(var0 = 0; var0 < bz[bv.r].length; ++var0) {
            if (p.ad[af.e().aD.a] == bz[bv.r][var0]) {
               var0 = bB[bv.r][var0];
               return var0;
            }
         }

         var0 = -1;
      }

      return var0;
   }

   private void K() {
      byte var2 = 0;
      p.j();
      if (!p.f() && as) {
         if (v.a(2, 0)) {
            v.f = true;
            p.aD.a(aw.cp, 0);
         }

         if (v.a(3, 0)) {
            v.h = true;
         }

         this.A = 4;
         this.aY = this.M[this.A];
         this.C = this.ae + this.ag / 2 - this.aY.length * this.aE / 2;
         this.aK = 0;
         this.h = 0;
         if (as) {
            if (bv.s != bv.r) {
               ds.c("LOAD TAM HINH");
               if (en.b == 1) {
                  bl.b = null;
                  p.bt = false;
                  System.gc();
               }

               aQ = l.a("/img/map" + bv.r + ".png");
               bv.s = bv.r;
            }

            this.aL = G() - this.ag / 2;
            this.aM = H() + this.af - (this.af + this.ah / 2);
            this.bX = this.aL;
            this.bY = this.aM;
            this.aN = 250 - this.ag;
            this.aO = 220 - this.ah;
            if (this.aN < 0) {
               this.aN = 0;
            }

            int var1 = var2;
            if (this.aO < 0) {
               this.aO = 0;
               var1 = var2;
            }

            while(var1 < bz[bv.r].length) {
               if (bv.l == bz[bv.r][var1]) {
                  this.cB = bA[bv.r][var1] + this.ae;
                  this.cC = bB[bv.r][var1] + this.af + 5;
                  break;
               }

               ++var1;
            }

            this.cz = G() + this.ae;
            this.cA = H() + this.af;
            I();
            J();
         }
      }

   }

   private void L() {
      this.A = 22;
      this.c(0);
      this.O = bb.length;
      this.aD = 24;
      byte var1;
      if (main.a.e) {
         var1 = -1;
      } else {
         var1 = 0;
      }

      this.ak = var1;
      this.aI = this.O * this.aD - this.ah;
      if (this.aI < 0) {
         this.aI = 0;
      }

      int var2 = this.aJ[this.B];
      this.f = var2;
      this.g = var2;
      if (this.g < 0) {
         this.f = 0;
         this.g = 0;
      }

      if (this.g > this.aI) {
         var2 = this.aI;
         this.f = var2;
         this.g = var2;
      }

      this.aK = 0;
      this.h = 0;
   }

   private void M() {
      int var1 = 0;
      byte var2 = 0;
      this.bP = false;
      if (this.A == 0 && this.D.length == 5 && this.B == 3) {
         this.bP = false;
         if (this.ak == 0) {
            this.aZ = new int[this.cg.length];

            for(var1 = var2; var1 < this.aZ.length; this.aZ[var1] = var1++) {
            }

            if (!this.an) {
               this.bP = true;
            }
         } else if (this.ak != 1 && !this.al && this.ak > 0) {
            for(this.aZ = new int[1]; var1 < this.aZ.length; this.aZ[var1] = var1++) {
            }

            this.bP = true;
         }
      }

   }

   private void N() {
      Exception var10000;
      label74: {
         boolean var10001;
         try {
            if (this.A != 0 || this.B != 3 || this.D.length != 5 || this.ak == -1) {
               return;
            }
         } catch (Exception var9) {
            var10000 = var9;
            var10001 = false;
            break label74;
         }

         byte var2 = 0;

         int var1;
         label76: {
            try {
               if (this.ak == 0) {
                  var1 = this.ae + this.ag / 2 - this.cg.length * this.aE / 2;
                  this.bN = (main.a.p - var1) / this.aE;
                  break label76;
               }
            } catch (Exception var8) {
               var10000 = var8;
               var10001 = false;
               break label74;
            }

            try {
               this.bE = this.X();
            } catch (Exception var5) {
               var10000 = var5;
               var10001 = false;
               break label74;
            }

            var1 = var2;

            try {
               if (this.bE == null) {
                  break label76;
               }
            } catch (Exception var7) {
               var10000 = var7;
               var10001 = false;
               break label74;
            }

            var1 = var2;

            try {
               if (this.bE.k != null) {
                  var1 = this.ae + this.ag - 2 - this.bE.k.length * 40;
                  this.bN = (main.a.p - var1) / 40;
               }
            } catch (Exception var6) {
               var10000 = var6;
               var10001 = false;
               break label74;
            }
         }

         try {
            if (main.a.p < var1) {
               this.bN = -1;
            }

            return;
         } catch (Exception var4) {
            var10000 = var4;
            var10001 = false;
         }
      }

      Exception var3 = var10000;
      var3.printStackTrace();
   }

   private void O() {
      if (this.O > 0) {
         boolean var1;
         if (main.a.i[2]) {
            --this.ak;
            if (this.A == 24) {
               this.ak -= 2;
               if (this.ak < 0) {
                  this.ak = 0;
               }
            } else if (this.ak < 0) {
               if (this.equals(main.a.G) && this.bJ == 2 && this.B <= 3 && this.K[this.B] > 1) {
                  bp.a();
                  if (this.L[this.B] <= 0) {
                     bt.a().a((byte)4, -1, (byte)this.B, this.K[this.B] - 1, -1);
                  } else {
                     bt.a().a((byte)4, -1, (byte)this.B, this.L[this.B] - 1, -1);
                  }

                  return;
               }

               this.ak = this.O - 1;
               if (this.bP) {
                  this.ak = -1;
               }

               if (this.dn > 0) {
                  this.ak = -1;
               }
            }

            this.bp[this.B] = this.ak;
            this.bN = 0;
            this.M();
            var1 = true;
         } else if (main.a.i[8]) {
            ++this.ak;
            if (this.A == 24) {
               this.ak += 2;
               if (this.ak > this.O - 1) {
                  this.ak = this.O - 1;
               }
            } else if (this.ak > this.O - 1) {
               if (this.equals(main.a.G) && this.bJ == 2 && this.B <= 3 && this.K[this.B] > 1) {
                  bp.a();
                  if (this.L[this.B] >= this.K[this.B] - 1) {
                     bt.a().a((byte)4, -1, (byte)this.B, 0, -1);
                  } else {
                     bt.a().a((byte)4, -1, (byte)this.B, this.L[this.B] + 1, -1);
                  }

                  return;
               }

               this.ak = 0;
            }

            this.bp[this.B] = this.ak;
            this.bN = 0;
            this.M();
            var1 = true;
         } else {
            var1 = false;
         }

         if (var1) {
            this.f = this.ak * this.aD - this.ah / 2;
            if (this.f > this.aI) {
               this.f = this.aI;
            }

            if (this.f < 0) {
               this.f = 0;
            }

            this.g = this.f;
         }

         int var2;
         int var4;
         if (main.a.k) {
            this.ce = false;
            if (!this.bT && main.a.b(this.ae, this.af, this.ag, this.ah)) {
               for(var4 = 0; var4 < this.bS.length; ++var4) {
                  this.bS[0] = main.a.q;
               }

               this.bR = main.a.q;
               this.bT = true;
               boolean var3;
               if (this.bW != 0) {
                  var3 = true;
               } else {
                  var3 = false;
               }

               this.bU = var3;
               this.bW = 0;
            } else if (this.bT) {
               ++this.bQ;
               if (this.bQ > 5 && this.bR == main.a.q && !this.bU) {
                  this.bR = -1000;
                  this.ak = (this.f + main.a.q - this.af) / this.aD;
                  if (this.ak >= this.O) {
                     this.ak = -1;
                  }

                  this.N();
               }

               var2 = main.a.q - this.bS[0];
               if (var2 != 0 && this.ak != -1) {
                  this.ak = -1;
                  this.bN = -1;
               }

               for(var4 = this.bS.length - 1; var4 > 0; --var4) {
                  this.bS[var4] = this.bS[var4 - 1];
               }

               this.bS[0] = main.a.q;
               this.f -= var2;
               if (this.f < 0) {
                  this.f = 0;
               }

               if (this.f > this.aI) {
                  this.f = this.aI;
               }

               label170: {
                  if (this.g >= 0) {
                     var4 = var2;
                     if (this.g <= this.aI) {
                        break label170;
                     }
                  }

                  var4 = var2 / 2;
               }

               this.g -= var4;
            }
         }

         if (main.a.m && this.bT) {
            this.ce = true;
            var2 = main.a.q;
            var4 = this.bS[0];
            main.a.m = false;
            if (ds.g(var2 - var4) < 20 && ds.g(main.a.q - this.bR) < 20 && !this.bU) {
               this.bW = 0;
               this.f = this.g;
               this.bR = -1000;
               this.ak = (this.f + main.a.q - this.af) / this.aD;
               if (this.ak >= this.O) {
                  this.ak = -1;
               }

               this.N();
               this.bQ = 0;
               this.bV = 10;
               bu.a();
            } else if (this.ak != -1 && this.bQ > 5) {
               this.bQ = 0;
               this.bV = 1;
            } else if (this.ak == -1 && !this.bU) {
               if (this.g < 0) {
                  this.f = 0;
               } else if (this.g > this.aI) {
                  this.f = this.aI;
               } else {
                  var4 = main.a.q - this.bS[0] + (this.bS[0] - this.bS[1]) + (this.bS[1] - this.bS[2]);
                  byte var5;
                  if (var4 > 10) {
                     var5 = 10;
                  } else if (var4 < -10) {
                     var5 = -10;
                  } else {
                     var5 = 0;
                  }

                  this.bW = -var5 * 100;
               }
            }

            if ((this.aw() || this.A == 13) && main.a.q < this.af + 21) {
               this.ak = 0;
               this.ax();
            }

            this.bT = false;
            this.bQ = 0;
            main.a.m = false;
         }
      }

   }

   private void P() {
      this.O = this.cm.length;
      this.aD = 24;
      byte var1;
      if (main.a.e) {
         var1 = -1;
      } else {
         var1 = 0;
      }

      this.ak = var1;
      this.aI = this.O * this.aD - this.ah;
      if (this.aI < 0) {
         this.aI = 0;
      }

      int var2 = this.aJ[this.B];
      this.f = var2;
      this.g = var2;
      if (this.g < 0) {
         this.f = 0;
         this.g = 0;
      }

      if (this.g > this.aI) {
         var2 = this.aI;
         this.f = var2;
         this.g = var2;
      }

   }

   private void Q() {
      bu.a();
      bu.f();
      this.O = G.length;
      this.aD = 24;
      byte var1;
      if (main.a.e) {
         var1 = -1;
      } else {
         var1 = 0;
      }

      this.ak = var1;
      this.aI = this.O * this.aD - this.ah;
      if (this.aI < 0) {
         this.aI = 0;
      }

      int var2 = this.aJ[this.B];
      this.f = var2;
      this.g = var2;
      if (this.g < 0) {
         this.f = 0;
         this.g = 0;
      }

      if (this.g > this.aI) {
         var2 = this.aI;
         this.f = var2;
         this.g = var2;
      }

   }

   private void R() {
      byte var1 = 0;
      this.aD = 30;
      this.O = af.e().ax.b.length + 6;
      this.aI = this.O * this.aD - this.ah;
      if (this.aI < 0) {
         this.aI = 0;
      }

      int var2 = this.aJ[this.B];
      this.f = var2;
      this.g = var2;
      if (this.g < 0) {
         this.f = 0;
         this.g = 0;
      }

      if (this.g > this.aI) {
         this.g = this.aI;
      }

      if (main.a.e) {
         var1 = -1;
      }

      this.ak = var1;
   }

   private void S() {
      byte var1 = 0;
      this.aD = 24;
      this.O = p.j().S.length;
      this.aI = this.O * this.aD - this.ah;
      this.f = 0;
      this.g = 0;
      if (main.a.e) {
         var1 = -1;
      }

      this.ak = var1;
   }

   private void T() {
      byte var1 = 0;
      this.O = this.i(af.e().aG.length);
      this.aD = 24;
      this.aI = this.O * this.aD - this.ah;
      if (this.aI < 0) {
         this.aI = 9;
      }

      int var2 = this.aJ[this.B];
      this.f = var2;
      this.g = var2;
      if (this.g < 0) {
         this.f = 0;
         this.g = 0;
      }

      if (this.g > this.aI) {
         var2 = this.aI;
         this.f = var2;
         this.g = var2;
      }

      if (main.a.e) {
         var1 = -1;
      }

      this.ak = var1;
   }

   private void U() {
      byte var1 = 0;
      this.aD = 30;
      h[] var3 = af.f().aH;
      bf[] var4 = af.f().aI;
      this.O = var3.length + var4.length;
      this.aI = this.O * this.aD - this.ah;
      int var2 = this.aJ[this.B];
      this.f = var2;
      this.g = var2;
      if (this.aI < 0) {
         this.aI = 0;
      }

      if (this.g < 0) {
         this.f = 0;
         this.g = 0;
      }

      if (this.g > this.aI) {
         this.f = 0;
         this.g = 0;
      }

      if (main.a.e) {
         var1 = -1;
      }

      this.ak = var1;
   }

   private void V() {
      if (this.bM > 0) {
         --this.bM;
      }

      if (this.ce && this.equals(main.a.G) && this.bJ == 2 && this.K[this.B] > 1) {
         if (this.g < -50) {
            bp.a();
            this.ce = false;
            if (this.L[this.B] <= 0) {
               bt.a().a((byte)4, -1, (byte)this.B, this.K[this.B] - 1, -1);
            } else {
               bt.a().a((byte)4, -1, (byte)this.B, this.L[this.B] - 1, -1);
            }
         } else if (this.g > this.aI + 50) {
            this.ce = false;
            bp.a();
            if (this.L[this.B] >= this.K[this.B] - 1) {
               bt.a().a((byte)4, -1, (byte)this.B, 0, -1);
            } else {
               bt.a().a((byte)4, -1, (byte)this.B, this.L[this.B] + 1, -1);
            }
         }
      }

      if (this.h != this.aK && !this.bT) {
         this.cj = this.aK - this.h << 2;
         this.ck += this.cj;
         this.h += this.ck >> 3;
         this.ck &= 15;
      }

      if (Math.abs(this.aK - this.h) < 10) {
         this.h = this.aK;
      }

      if (this.cD) {
         this.cD = false;
         this.aK = this.ag;
      }

      if (this.aK >= this.ag - 10 && this.h >= this.ag - 10 && this.bH == 0) {
         this.a = false;
         this.Z();
         if (this.cI) {
            this.cI = false;
            if (af.e().U > 0L && af.e().H != 14) {
               bp.a();
               if (this.A == 3) {
                  bt.a().f(this.ak);
               } else if (this.A == 14) {
                  bt.a().v(this.ak);
               }
            }
         }

         if (this.cl) {
            this.cl = false;
            int var1 = this.S.size() - this.Z.size();
            if (af.e().aU != null) {
               if (this.ak - var1 < 0) {
                  af.e().aU.M = this.ak;
               } else {
                  af.e().aU.M = Short.parseShort((String)this.Z.elementAt(this.ak - var1));
               }
            }

            ((de)this.S.elementAt(this.ak)).a();
         }

         this.S.removeAllElements();
         this.Z.removeAllElements();
         this.ac = null;
      }

      if (this.bW != 0 && !this.bT) {
         this.f += this.bW / 100;
         if (this.f < 0) {
            this.f = 0;
         } else if (this.f > this.aI) {
            this.f = this.aI;
         } else {
            this.g = this.f;
         }

         this.bW = this.bW * 9 / 10;
         if (this.bW < 100 && this.bW > -100) {
            this.bW = 0;
         }
      }

      if (this.g != this.f && !this.bT) {
         this.aH = this.f - this.g << 2;
         this.aG += this.aH;
         this.g += this.aG >> 4;
         this.aG &= 15;
      }

      this.aJ[this.B] = this.g;
   }

   private e W() {
      e var3 = null;
      if (this.ak >= 2) {
         int var2 = this.ak;
         int var1;
         if (this.Q != null) {
            var1 = this.Q.size();
         } else {
            var1 = this.R.size();
         }

         if (var2 <= var1 + 1) {
            if (this.Q != null) {
               var3 = (e)this.Q.elementAt(this.ak - 2);
            } else {
               var3 = (e)this.R.elementAt(this.ak - 2);
            }
         }
      }

      return var3;
   }

   private cb X() {
      cb var1 = null;
      if (this.ak >= 2 && this.ak <= cb.l.size() + 1) {
         var1 = (cb)cb.l.elementAt(this.ak - 2);
      }

      return var1;
   }

   private eh Y() {
      eh var1 = null;
      if (this.ak >= 2 && this.ak <= this.P.length + 1) {
         var1 = this.P[this.ak - 2];
      }

      return var1;
   }

   private void Z() {
      for(int var1 = 0; var1 < this.k.size(); ++var1) {
         ((h)this.k.elementAt(var1)).f = false;
      }

      this.k.removeAllElements();
   }

   private void a(int var1, String var2) {
      if (this.cX < 3) {
         for(int var3 = 0; var3 < p.G.size(); ++var3) {
            do var4 = (do)p.G.elementAt(var3);
            if (var4.df.a == var1) {
               var4.a(var2);
            }
         }
      }

   }

   private void a(int var1, boolean var2) {
      int var3 = var1 / 20;
      byte var4;
      if (var1 % 20 > 0) {
         var4 = 1;
      } else {
         var4 = 0;
      }

      var1 = var4 + var3;
      var3 = this.ae;
      this.bO = (main.a.p - var3) / this.aF;
      if (this.bO > var1 - 1) {
         this.bO = var1 - 1;
      }

      if (main.a.p < var3) {
         this.bO = 0;
      }

      this.b(var2);
   }

   private void a(ae var1, String var2) {
      var1.u = false;
      var1.a = 180;
      int var4 = this.b;
      int var3;
      if (this.b == 0) {
         var3 = 0;
      } else {
         var3 = ds.g(var1.a - this.d) + 8;
      }

      var1.e = var4 + 3 - var3;
      var1.d = di.p.a(var2, var1.a - 10);
      var1.b = 10000000;
      var1.i = null;
      var1.c = 7;
      var1.g = 15 - var1.c + var1.d.length * 12 + 10;
      if (var1.g > main.a.B - 80) {
         var1.g = main.a.B - 80;
         var1.h = var1.d.length * 12 - var1.g + 17;
         if (var1.h < 0) {
            var1.h = 0;
         }

         ae.v = 0;
         var1.u = true;
      }

      az var5;
      for(var1.f = main.a.F.d - var1.g; var1.f < 10; ++var5.d) {
         ++var1.f;
         var5 = main.a.F;
      }

      var1.t = 10;
   }

   private void a(cb var1) {
      byte var3 = 0;
      this.ai = new ae();
      String var4 = "|0|" + var1.d + "\n|1|" + e.a(var1.h);

      int var2;
      for(var2 = 0; var2 < this.R.size(); ++var2) {
         e var5 = (e)this.R.elementAt(var2);
         if (var1.c == var5.a) {
            var4 = var4 + "\n|5|" + aw.cR + ": " + var5.l + "\n|5|" + aw.cS + ": " + var5.k + "\n|4|" + aw.cU + ": " + var5.i + aw.cX + "\n|4|" + aw.cV + ": " + var5.j + aw.cX;
            this.bL = new int[]{var5.b, var5.d, var5.e};
            break;
         }
      }

      var4 = var4 + "\n--";

      for(var2 = var3; var2 < var1.f.length; ++var2) {
         var4 = var4 + "\n" + var1.f[var2];
      }

      String var6 = var4;
      if (var1.b == 1) {
         var6 = var4 + "\n|6|" + aw.cY + " " + var1.i + "/" + var1.j;
      }

      this.a(this.ai, var6);
      this.cH = null;
   }

   private void a(e var1) {
      String var3 = "|0|1|" + var1.f;
      String var2 = "\n|2|1|";
      if (var1.g == 0) {
         var2 = "\n|7|1|";
      }

      if (var1.g == 1) {
         var2 = "\n|1|1|";
      }

      if (var1.g == 2) {
         var2 = "\n|0|1|";
      }

      var2 = var3 + var2 + e.a(var1.g) + "\n|2|1|" + aw.cZ + ": " + var1.h + "\n--" + "\n|5|" + aw.cR + ": " + var1.l + "\n|5|" + aw.cS + ": " + var1.k + "\n|4|" + aw.cU + ": " + var1.i + aw.cX + "\n|4|" + aw.cV + ": " + var1.j + aw.cX + "\n|6|" + aw.da + ": " + var1.m;
      this.ai = new ae();
      this.a(this.ai, var2);
      this.bL = new int[]{var1.b, var1.d, var1.e};
      this.bC = null;
      this.cH = null;
   }

   private void a(eh var1) {
      int var2 = 0;

      Exception var10000;
      label31: {
         StringBuffer var3;
         String[] var4;
         String var10;
         boolean var10001;
         try {
            var3 = new StringBuffer("|0|");
            var10 = var3.append(var1.c).toString();
            var4 = di.r.a(var1.d, this.ag - 60);
         } catch (Exception var8) {
            var10000 = var8;
            var10001 = false;
            break label31;
         }

         while(true) {
            try {
               if (var2 >= var4.length) {
                  StringBuffer var11 = new StringBuffer(String.valueOf(var10));
                  String var12 = var11.append("\n--").toString();
                  var3 = new StringBuffer(String.valueOf(var12));
                  var10 = var3.append("\n|7|").append(aw.db).append(": ").append(var1.i).toString();
                  var11 = new StringBuffer(String.valueOf(var10));
                  var12 = var11.append("\n|1|").append(aw.dd).append(": ").append(var1.f).toString();
                  var3 = new StringBuffer(String.valueOf(var12));
                  var12 = var3.append("\n|4|").append(aw.de).append(": ").append(var1.g).append("/").append(var1.h).toString();
                  var3 = new StringBuffer(String.valueOf(var12));
                  var12 = var3.append("\n|4|").append(aw.dn).append(": ").append(var1.j).toString();
                  var3 = new StringBuffer(String.valueOf(var12));
                  var10 = var3.append("\n|4|").append(aw.do).append(": ").append(ai.a(var1.e)).toString();
                  ae var13 = new ae();
                  this.ai = var13;
                  this.a(this.ai, var10);
                  this.bK = ak.a((short)var1.b).c[0];
                  this.bC = null;
                  return;
               }
            } catch (Exception var7) {
               var10000 = var7;
               var10001 = false;
               break;
            }

            try {
               StringBuffer var5 = new StringBuffer(String.valueOf(var10));
               var10 = var5.append("\n|2|").append(var4[var2]).toString();
            } catch (Exception var6) {
               var10000 = var6;
               var10001 = false;
               break;
            }

            ++var2;
         }
      }

      Exception var9 = var10000;
      var9.printStackTrace();
   }

   private void a(en var1, int var2, int var3, int var4, int var5) {
      if (var2 == 34) {
         if (this.dj != null) {
            var1.a(this.dj, var3, var4 + var5 - this.dj.getHeight(), 0);
         } else {
            this.dj = l.b("/mainImage/o_0.png");
         }

         if (this.dk != null) {
            var1.a(this.dk, var3, var4 + var5 - this.dk.getHeight(), 0);
         } else {
            this.dk = l.b("/mainImage/o_1.png");
         }
      } else if (var2 == 35) {
         if (this.dj != null) {
            var1.a(this.dj, var3, var4 + var5 - this.dj.getHeight(), 0);
         } else {
            this.dj = l.b("/mainImage/o_0.png");
         }

         if (this.dl != null) {
            var1.a(this.dl, var3, var4 + var5 - this.dl.getHeight(), 0);
         } else {
            this.dl = l.b("/mainImage/o_2.png");
         }
      } else if (var2 == 36) {
         if (this.dj != null) {
            var1.a(this.dj, var3, var4 + var5 - this.dj.getHeight(), 0);
         } else {
            this.dj = l.b("/mainImage/o_0.png");
         }

         if (this.dm != null) {
            var1.a(this.dm, var3, var4 + var5 - this.dm.getHeight(), 0);
         } else {
            this.dm = l.b("/mainImage/o_3.png");
         }
      }

   }

   private static void a(en var0, int var1, int var2, int var3, int var4, int var5, int var6) {
      if (var1 == 102 && var2 > ae.s) {
         byte var8 = g(var2);
         int var10 = var2 - ae.s;

         int var9;
         boolean var10001;
         try {
            var9 = ((var6 << 1) + 68) / var10;
            dh = dg.length;
         } catch (Exception var18) {
            var10001 = false;
            return;
         }

         if (var10 > 4) {
            try {
               dh = 2;
            } catch (Exception var17) {
               var10001 = false;
               return;
            }
         }

         for(var5 = 0; var5 < var10; ++var5) {
            int var7 = 0;

            while(true) {
               try {
                  if (var7 >= dh) {
                     break;
                  }
               } catch (Exception var15) {
                  var10001 = false;
                  return;
               }

               label103: {
                  try {
                     if (dg[var7] > 1) {
                        var2 = (dg[var7] >> 1) + 1;
                        break label103;
                     }
                  } catch (Exception var16) {
                     var10001 = false;
                     return;
                  }

                  var2 = 1;
               }

               try {
                  var1 = (var9 * var5 + (main.a.w - (var7 << 2))) % ((var6 << 1) + 68);
               } catch (Exception var14) {
                  var10001 = false;
                  return;
               }

               if (var1 >= 0 && var1 < 34) {
                  var1 %= 34;
               } else if (34 <= var1 && var1 < 34 + var6) {
                  var1 = 34 - var2;
               } else if (34 + var6 <= var1 && var1 < var6 + 68) {
                  var1 = 34 - (var1 - var6) % 34 - var2;
               } else {
                  var1 = 0;
               }

               int var11;
               try {
                  var11 = (var9 * var5 + (main.a.w - (var7 << 2))) % ((var6 << 1) + 68);
               } catch (Exception var13) {
                  var10001 = false;
                  return;
               }

               if (var11 >= 0 && var11 < 34) {
                  var2 = 0;
               } else if (34 <= var11 && var11 < 34 + var6) {
                  var2 = var11 % 34;
               } else if (34 + var6 <= var11 && var11 < var6 + 68) {
                  var2 = var6 - var2;
               } else {
                  var2 = var6 - (var11 - 68) % var6 - var2;
               }

               try {
                  var0.a(di[var8][var7]);
                  var0.d(var3 + var1, var2 + var4, dg[var7], dg[var7]);
               } catch (Exception var12) {
                  var10001 = false;
                  return;
               }

               ++var7;
            }
         }
      }

   }

   private void a(en var1, af var2) {
      di var5 = di.c;
      String var4;
      if (p.bX != 1) {
         var4 = "";
      } else {
         var4 = "       ";
      }

      var5.a(var1, var4 + var2.ag, this.b + 60, 4, 0, di.f);
      if (p.bX == 1) {
         bl.b(var1, 5427, this.b + 55, 4, 0, 0);
      }

      if (var2.cC > 0) {
         di.n.a(var1, aw.fa, this.b + 60, 16, 0, di.o);
         var1.a(p.aG, this.b + 95, 19, 0);
         int var3 = var2.bf * en.a(p.aF) / var2.cC;
         var1.e(95, this.b + 19, var3, 20);
         var1.a(p.aF, this.b + 95, 19, 0);
      }

      var1.e(0, 0, main.a.A, main.a.B);
      if (var2.y > 0L) {
         var5 = di.n;
         if (var2.aq) {
            var4 = var2.c();
         } else {
            var4 = var2.bj;
         }

         var5.a(var1, var4, this.b + 60, 27, 0, di.o);
      }

      di.n.a(var1, aw.cZ + ": " + ai.a(var2.y), this.b + 60, 38, 0, di.o);
   }

   private void a(en var1, boolean var2) {
      var1.a(16711680);
      var1.e(this.ae, this.af, this.ag, this.ah);
      var1.a(0, -this.g);
      el var15;
      if (var2) {
         var15 = this.U;
      } else {
         var15 = this.V;
      }

      int var4 = 0;

      while(true) {
         if (var4 >= this.O) {
            this.f(var1);
            break;
         }

         int var10 = this.ae + 36;
         int var6 = this.af + this.aD * var4;
         int var11 = this.ag - 36;
         int var5 = this.aD - 1;
         int var9 = this.ae;
         int var8 = this.af + this.aD * var4;
         int var7 = this.aD - 1;
         if (var6 - this.g <= this.af + this.ah && var6 - this.g >= this.af - this.aD) {
            int var3;
            String var12;
            di var13;
            Image var19;
            di var20;
            if (var4 == this.O - 1) {
               if (var2) {
                  var1.a(15196114);
                  var1.b(var9, var6, this.ag, var5);
                  if (!this.aS) {
                     if (!this.m) {
                        var13 = di.o;
                        var12 = aw.dT + aw.dL;
                        var3 = this.ae;
                        var13.a(var1, var12, this.ag / 2 + var3, var5 / 2 + var6 - 4, 2);
                     } else {
                        var13 = di.o;
                        var12 = aw.dT + aw.dN;
                        var3 = this.ae;
                        var13.a(var1, var12, this.ag / 2 + var3, var5 / 2 + var6 - 4, 2);
                     }
                  } else if (this.m) {
                     var1.a(15196114);
                     var1.b(var9, var6, this.ag, var5);
                     if (var4 == this.ak) {
                        var19 = p.az;
                     } else {
                        var19 = p.ay;
                     }

                     var1.a(var19, this.ae + this.ag - 5, var6 + 2, cj.b);
                     if (var4 == this.ak) {
                        var20 = di.g;
                     } else {
                        var20 = di.f;
                     }

                     var20.a(var1, aw.dS, this.ae + this.ag - 22, var6 + 7, 2);
                     di.o.a(var1, aw.dT + aw.dN, this.ae + 5, var5 / 2 + var6 - 4, 0);
                  } else {
                     var13 = di.o;
                     var12 = aw.dT + aw.dL;
                     var3 = this.ae;
                     var13.a(var1, var12, this.ag / 2 + var3, var5 / 2 + var6 - 4, 2);
                  }
               }
            } else if (var4 == this.O - 2) {
               if (var2) {
                  var1.a(15196114);
                  var1.b(var9, var6, this.ag, var5);
                  if (!this.aT) {
                     if (!this.aS) {
                        if (var4 == this.ak) {
                           var19 = p.az;
                        } else {
                           var19 = p.ay;
                        }

                        var1.a(var19, this.ae + this.ag - 5, var6 + 2, cj.b);
                        if (var4 == this.ak) {
                           var20 = di.g;
                        } else {
                           var20 = di.f;
                        }

                        var20.a(var1, aw.dV, this.ae + this.ag - 22, var6 + 7, 2);
                        di.o.a(var1, aw.dU + aw.dL, this.ae + 5, var5 / 2 + var6 - 4, 0);
                     } else {
                        if (var4 == this.ak) {
                           var19 = p.az;
                        } else {
                           var19 = p.ay;
                        }

                        var1.a(var19, this.ae + this.ag - 5, var6 + 2, cj.b);
                        if (var4 == this.ak) {
                           var20 = di.g;
                        } else {
                           var20 = di.f;
                        }

                        var20.a(var1, aw.bu, this.ae + this.ag - 22, var6 + 7, 2);
                        di.o.a(var1, aw.dU + aw.dN, this.ae + 5, var5 / 2 + var6 - 4, 0);
                     }
                  }
               } else if (!this.m) {
                  var13 = di.f;
                  var12 = aw.dM;
                  var3 = this.ae;
                  var13.a(var1, var12, this.ag / 2 + var3, var5 / 2 + var6 - 4, 2);
               } else {
                  var13 = di.f;
                  var12 = aw.dO;
                  var3 = this.ae;
                  var13.a(var1, var12, this.ag / 2 + var3, var5 / 2 + var6 - 4, 2);
               }
            } else if (var4 == this.O - 3) {
               if (this.aS) {
                  var3 = 13748667;
               } else if (var4 == this.ak) {
                  var3 = 16383818;
               } else {
                  var3 = 15196114;
               }

               var1.a(var3);
               var1.b(var10, var6, var11, var5);
               if (this.aS) {
                  var3 = 13748667;
               } else if (var4 == this.ak) {
                  var3 = 7300181;
               } else {
                  var3 = 9993045;
               }

               var1.a(var3);
               var1.b(var9, var8, 34, var7);
               var1.a(w, var9 + 17, var7 / 2 + var8, 3);
               var20 = di.m;
               if (var2) {
                  var3 = this.aR;
               } else {
                  var3 = this.l;
               }

               var20.a(var1, ai.a((long)var3) + " " + aw.bC, var10 + 5, var6 + 11, 0);
               di.r.a(var1, aw.dW, var10 + 5, var6, 0);
            } else {
               if (var15.size() == 0) {
                  break;
               }

               if (this.aS) {
                  var3 = 13748667;
               } else if (var4 == this.ak) {
                  var3 = 16383818;
               } else {
                  var3 = 15196114;
               }

               var1.a(var3);
               var1.b(var10, var6, var11, var5);
               if (this.aS) {
                  var3 = 13748667;
               } else if (var4 == this.ak) {
                  var3 = 9541120;
               } else {
                  var3 = 9993045;
               }

               var1.a(var3);
               h var17 = (h)var15.elementAt(var4);
               if (var17 != null) {
                  for(var3 = 0; var3 < var17.a.length; ++var3) {
                     if (var17.a[var3].c.a == 72 && var17.a[var3].a > 0) {
                        byte var18 = g(var17.a[var3].a);
                        if (f(var18) != -1) {
                           if (this.aS) {
                              var5 = 13748667;
                           } else {
                              var5 = this.ak;
                              var5 = f(var18);
                           }

                           var1.a(var5);
                        }
                     }
                  }
               }

               var1.b(var9, var8, 34, var7);
               if (var17 != null) {
                  String var21 = "";
                  di var16 = di.m;
                  var12 = var21;
                  di var14 = var16;
                  if (var17.a != null) {
                     var3 = 0;

                     for(var14 = var16; var3 < var17.a.length; var14 = var20) {
                        if (var17.a[var3].c.a == 72) {
                           var21 = " [+" + var17.a[var3].a + "]";
                        }

                        var20 = var14;
                        if (var17.a[var3].c.a == 41) {
                           if (var17.a[var3].a == 1) {
                              var20 = h(0);
                           } else if (var17.a[var3].a == 2) {
                              var20 = h(2);
                           } else if (var17.a[var3].a == 3) {
                              var20 = h(8);
                           } else {
                              var20 = var14;
                              if (var17.a[var3].a == 4) {
                                 var20 = h(7);
                              }
                           }
                        }

                        ++var3;
                     }

                     var12 = var21;
                  }

                  var14.a(var1, var17.b.d + var12, var10 + 5, var6 + 1, 0);
                  if (var17.a != null) {
                     if (var17.a.length > 0 && var17.a[0] != null) {
                        var12 = "" + var17.a[0].a();
                     } else {
                        var12 = "";
                     }

                     var14 = di.q;
                     var13 = var14;
                     if (var17.A < 0) {
                        var13 = var14;
                        if (var17.b.b != 5) {
                           var13 = di.p;
                        }
                     }

                     String var22 = var12;
                     if (var17.a.length > 1) {
                        for(var3 = 1; var3 < var17.a.length; var12 = var22) {
                           var22 = var12;
                           if (var17.a[var3] != null) {
                              var22 = var12;
                              if (var17.a[var3].c.a != 102) {
                                 var22 = var12;
                                 if (var17.a[var3].c.a != 107) {
                                    var22 = var12 + "," + var17.a[var3].a();
                                 }
                              }
                           }

                           ++var3;
                        }

                        var22 = var12;
                     }

                     var13.a(var1, var22, var10 + 5, var6 + 11, 0);
                  }

                  bl.b(var1, var17.b.f, var9 + 17, var8 + var7 / 2, 0, 3);
                  if (var17.a != null) {
                     for(var3 = 0; var3 < var17.a.length; ++var3) {
                        this.a(var1, var17.a[var3].c.a, var9, var8, var7);
                     }

                     for(var3 = 0; var3 < var17.a.length; ++var3) {
                        a(var1, var17.a[var3].c.a, var17.a[var3].a, var9, var8, 34, var7);
                     }
                  }

                  if (var17.h > 1) {
                     di.n.a(var1, "" + var17.h, var9 + 34, var8 + var7 - di.n.a(), 1);
                  }
               }
            }
         }

         ++var4;
      }

   }

   private void a(et var1, bf var2, bf var3) {
      String var5 = "|0|" + var1.b;

      for(int var4 = 0; var4 < var1.g.length; ++var4) {
         var5 = var5 + "\n|4|" + var1.g[var4];
      }

      var5 = var5 + "\n--";
      String var7;
      if (var2 != null) {
         StringBuffer var6 = (new StringBuffer(String.valueOf(var5 + "\n|2|" + aw.fc + ": " + var2.c + "\n|5|" + ai.a(var1.i, "#", String.valueOf(var2.k))))).append("\n|5|").append(aw.fd).append(var2.i);
         if (var1.d == 1) {
            var5 = "%";
         } else {
            var5 = "";
         }

         String var9 = var6.append(var5).toString() + "\n|5|" + aw.fe + ": " + var2.a() + "s" + "\n--";
         if (var2.c == var1.c) {
            var7 = var9 + "\n|0|" + aw.ff;
         } else {
            var5 = var9;
            if (!var2.a.c()) {
               var5 = var9 + "\n|1|" + aw.fg + ds.a(var3.d) + " " + aw.fh;
            }

            var7 = var5 + "\n|4|" + ai.a(var1.i, "#", String.valueOf(var3.k));
         }
      } else {
         StringBuffer var8 = (new StringBuffer(String.valueOf(var5 + "\n|2|" + aw.fi + "\n|1|" + aw.fj + ds.a(var3.d) + " " + aw.fh + "\n|4|" + ai.a(var1.i, "#", String.valueOf(var3.k))))).append("\n|4|").append(aw.fd).append(var3.i);
         if (var1.d == 1) {
            var7 = "%";
         } else {
            var7 = "";
         }

         var7 = var8.append(var7).toString() + "\n|4|" + aw.fe + ": " + var3.a() + "s";
      }

      this.bC = null;
      this.bL = null;
      this.cH = null;
      this.ai = new ae();
      this.a(this.ai, var7);
      this.bK = 0;
   }

   private static boolean a(int var0, int var1, h[] var2) {
      boolean var4 = false;
      boolean var3 = var4;
      if (var1 == 0) {
         var3 = var4;
         if (var0 - 1 + var1 * 20 < var2.length) {
            var3 = true;
         }
      }

      return var3;
   }

   private void aa() {
      if (this.ak >= -1) {
         if (this.bI) {
            bt.a().a(this.n, (byte)this.ak);
         } else {
            el var1 = new el("");
            var1.addElement(new de(aw.aL[0], this, 9999, (q)this.W.elementAt(this.ak)));
            main.a.F.a(var1, this.b, (this.ak + 1) * this.aD - this.g + this.af);
            q var2 = (q)this.W.elementAt(this.ak);
            String var3 = "|0|1|" + var2.e + "\n|1|Top " + var2.h + "\n|1|" + var2.f + "\n|2|" + var2.i;
            this.ai = new ae();
            this.a(this.ai, var3);
            this.bL = new int[]{var2.a, var2.d, var2.c};
            this.bC = null;
            this.cH = null;
         }
      }

   }

   private void ab() {
      if (this.B == 0 && this.equals(main.a.G)) {
         this.ae();
      } else {
         el var2;
         if (this.B == 0 && this.equals(main.a.H) || this.B == 2) {
            if (this.equals(main.a.H)) {
               this.bC = (h)main.a.H.V.elementAt(this.ak);
            } else {
               this.bC = (h)main.a.G.V.elementAt(this.ak);
            }

            ds.c("toi day select= " + this.ak);
            var2 = new el("");
            var2.addElement(new de(aw.bi, this, 8000, this.bC));
            if (this.bC != null) {
               main.a.F.a(var2, this.b, (this.ak + 1) * this.aD - this.g + this.af);
               this.b(this.bC);
            } else {
               this.ai = null;
            }
         }

         if (this.B == 1) {
            if (this.ak == this.O - 3) {
               if (this.aS) {
                  return;
               }

               if (this.o == null) {
                  this.o = new cq();
                  this.o.a.b = main.a.B - 35 - cq.b().a.d;
                  this.o.a();
                  this.o.c = main.a.G;
               }

               this.o.h = aw.eb;
               this.o.a.i = aw.ec;
               this.o.g = "";
               this.o.b = true;
               this.o.a.c(1);
               this.o.a.b(10);
               if (main.a.e) {
                  this.o.a.a();
               }
            } else if (this.ak == this.O - 2) {
               if (!this.aT) {
                  boolean var1;
                  if (this.aS) {
                     var1 = false;
                  } else {
                     var1 = true;
                  }

                  this.aS = var1;
                  if (this.aS) {
                     bt.a().a((byte)5, (int)-1, (byte)-1, (int)-1);
                  } else {
                     this.A();
                     bp.a();
                     bt.a().a((byte)3, (int)-1, (byte)-1, (int)-1);
                  }
               } else {
                  this.aT = false;
               }
            } else if (this.ak == this.O - 1) {
               if (this.aS && !this.aT && this.m) {
                  main.a.a(aw.et, new de(aw.bm, this, 7002, (Object)null), new de(aw.bn, this, 4005, (Object)null));
               }
            } else {
               if (this.aS) {
                  return;
               }

               this.bC = (h)main.a.G.U.elementAt(this.ak);
               var2 = new el("");
               var2.addElement(new de(aw.bi, this, 8000, this.bC));
               if (this.bC != null) {
                  main.a.F.a(var2, this.b, (this.ak + 1) * this.aD - this.g + this.af);
                  this.b(this.bC);
               } else {
                  this.ai = null;
               }
            }
         }

         if (main.a.e) {
            this.ak = -1;
         }
      }

   }

   private void ac() {
      byte var1 = -1;
      if (this.B == 0) {
         if (this.ak == -1 || this.k.size() == 0) {
            return;
         }

         if (this.ak == this.k.size()) {
            this.cc = -1;
            if (!main.a.e) {
               var1 = 0;
            }

            this.ak = var1;
            bp.a();
            bt.a().a((byte)1, (el)this.k);
            return;
         }

         if (this.ak > this.k.size() - 1) {
            return;
         }

         this.bC = (h)main.a.G.k.elementAt(this.ak);
         el var2 = new el("");
         var2.addElement(new de(aw.dX, this, 6001, this.bC));
         if (this.bC != null) {
            main.a.F.a(var2, this.b, (this.ak + 1) * this.aD - this.g + this.af);
            this.b(this.bC);
         } else {
            this.ai = null;
         }
      }

      if (this.B == 1) {
         this.ae();
      }

   }

   private void ad() {
      if (this.ak >= 0 && af.e().aE[this.ak].d && !af.e().aE[this.ak].e) {
         if (!main.a.e) {
            bt.a().b(this.ak);
         } else if (main.a.p > this.ae + this.ag - 40) {
            bt.a().b(this.ak);
         }
      }

   }

   private void ae() {
      ds.c("fire inventory");
      if (af.e().H == 14) {
         main.a.a(aw.ew);
      } else if (this.ak != -1) {
         if (this.ak == 0) {
            this.a(af.e().aH.length + af.e().aF.length, false);
         } else {
            this.bC = null;
            el var1 = new el("");
            h var2;
            if (!a(this.ak, this.bO, af.e().aH)) {
               var2 = af.e().aF[b(this.ak, this.bO, af.e().aH)];
               if (var2 != null) {
                  this.bC = var2;
                  if (main.a.G.A == 12) {
                     var1.addElement(new de(aw.ex, this, 6000, this.bC));
                  } else if (main.a.G.A == 13) {
                     var1.addElement(new de(aw.ey, this, 7000, this.bC));
                  } else if (var2.b()) {
                     var1.addElement(new de(aw.bl, this, 2000, this.bC));
                     if (af.e().bO) {
                        var1.addElement(new de(aw.dZ, this, 2005, this.bC));
                     }
                  } else {
                     var1.addElement(new de(aw.bl, this, 2001, this.bC));
                  }
               }
            } else {
               var2 = af.e().aH[c(this.ak, this.bO)];
               if (var2 != null) {
                  this.bC = var2;
                  var1.addElement(new de(aw.dX, this, 2002, this.bC));
               }
            }

            if (this.bC != null) {
               af.e().a(this.bC.D, this.bC.E, this.bC.F, this.bC.G);
               if (main.a.G.A != 12 && main.a.G.A != 13) {
                  if (this.bH == 0) {
                     var1.addElement(new de(aw.dY, this, 2003, this.bC));
                  }

                  if (this.bH == 1) {
                     var1.addElement(new de(aw.ea, this, 3002, this.bC));
                  }
               }

               main.a.F.a(var1, this.b, (this.ak + 1) * this.aD - this.g + this.af);
               this.b(this.bC);
            } else {
               this.ai = null;
            }
         }
      }

   }

   private void af() {
      this.A();
      if (aq.f == null || aq.f.size() == 0) {
         bt.a().b((int)0, (int)-1);
      }

      aq.a().b();
   }

   private void ag() {
      if (this.ak >= 0) {
         if (bu.a && this.ak == G.length - 1) {
            bt.a().w();
         } else if (!af.e().bO) {
            switch(this.ak) {
            case 0:
               this.af();
               break;
            case 1:
               bt.a().j(54);
               break;
            case 2:
               this.ah();
               break;
            case 3:
               bt.a().b((byte)0, (byte)-1);
               bp.a();
               break;
            case 4:
               if (af.e().H == 14) {
                  main.a.a(aw.ew);
               } else {
                  bt.a().h();
               }
               break;
            case 5:
               main.a.h();
               if (af.e().Y() < 5) {
                  main.a.a(aw.ez);
               } else {
                  if (this.o == null) {
                     this.o = new cq();
                     this.o.a.b = main.a.B - 35 - cq.b().a.d;
                     this.o.a();
                     this.o.c = main.a.G;
                  }

                  this.o.h = aw.eA;
                  this.o.a.i = aw.bp;
                  this.o.g = "";
                  this.o.b = true;
                  this.o.a.c(0);
                  if (main.a.e) {
                     this.o.a.a();
                  }
               }
               break;
            case 6:
               this.at();
               break;
            case 7:
               this.ar();
               break;
            case 8:
               x.g();
               break;
            case 9:
               if (main.a.I.n) {
                  bu.a();
                  bu.h();
               }
            }
         } else {
            switch(this.ak) {
            case 0:
               this.af();
               break;
            case 1:
               bt.a().j(54);
               break;
            case 2:
               this.ah();
               break;
            case 3:
               bp.a();
               bt.a().t();
               this.bM = 20;
               break;
            case 4:
               bt.a().b((byte)0, (byte)-1);
               bp.a();
               break;
            case 5:
               if (af.e().H == 14) {
                  main.a.a(aw.ew);
               } else {
                  bt.a().h();
               }
               break;
            case 6:
               main.a.h();
               if (af.e().Y() < 5) {
                  main.a.a(aw.ez);
               } else {
                  if (this.o == null) {
                     this.o = new cq();
                     this.o.a.b = main.a.B - 35 - cq.b().a.d;
                     this.o.a();
                     this.o.c = main.a.G;
                  }

                  this.o.h = aw.eA;
                  this.o.a.i = aw.bp;
                  this.o.g = "";
                  this.o.b = true;
                  this.o.a.c(0);
                  if (main.a.e) {
                     this.o.a.a();
                  }
               }
               break;
            case 7:
               this.at();
               break;
            case 8:
               this.ar();
               break;
            case 9:
               x.g();
               break;
            case 10:
               if (main.a.I.n) {
                  bu.a();
                  bu.h();
               }
            }
         }
      }

   }

   private void ah() {
      this.O = at.size();
      this.aD = 24;
      byte var1;
      if (main.a.e) {
         var1 = -1;
      } else {
         var1 = 0;
      }

      this.ak = var1;
      this.aI = this.O * this.aD - this.ah;
      if (this.aI < 0) {
         this.aI = 0;
      }

      if (this.g < 0) {
         this.f = 0;
         this.g = 0;
      }

      if (this.g > this.aI) {
         int var2 = this.aI;
         this.f = var2;
         this.g = var2;
      }

      this.A = 23;
      this.c(0);
   }

   private void ai() {
      this.o.h = aw.dw;
      this.o.a.i = aw.dw;
      this.o.g = "";
      this.o.b = true;
      this.o.a.e = true;
      this.o.a.c(0);
      if (main.a.e) {
         this.o.a.a();
      }

   }

   private void aj() {
      if (this.ak >= 0 && this.X.size() != 0) {
         el var1 = new el("");
         this.cG = this.ak;
         var1.addElement(new de(aw.bq, this, 10000, (r)this.X.elementAt(this.cG)));
         var1.addElement(new de(aw.bj, this, 10001, (r)this.X.elementAt(this.cG)));
         main.a.F.a(var1, this.b, (this.ak + 1) * this.aD - this.g + this.af);
         this.b((r)this.X.elementAt(this.ak));
      }

   }

   private void ak() {
      if (this.ak >= 0 && this.T.size() != 0) {
         el var1 = new el("");
         this.cG = this.ak;
         var1.addElement(new de(aw.bp, this, 8001, (r)this.T.elementAt(this.cG)));
         var1.addElement(new de(aw.bj, this, 8002, (r)this.T.elementAt(this.cG)));
         var1.addElement(new de(aw.gm, this, 8004, (r)this.T.elementAt(this.cG)));
         main.a.F.a(var1, this.b, (this.ak + 1) * this.aD - this.g + this.af);
         this.b((r)this.T.elementAt(this.ak));
      }

   }

   private void al() {
      if (this.ak >= 0) {
         el var1 = new el("");
         this.cG = this.ak;
         var1.addElement(new de(aw.bQ, this, 10030, (Object)null));
         var1.addElement(new de(aw.bz, this, 10031, (Object)null));
         main.a.F.a(var1, this.b, (this.ak + 1) * this.aD - this.g + this.af);
      }

   }

   private void am() {
      byte var1 = 1;
      if (this.ak == 0) {
         boolean var2;
         if (this.au) {
            var2 = false;
         } else {
            var2 = true;
         }

         this.au = var2;
         if (!this.au) {
            var1 = 0;
         }

         av.a("viewchat", var1);
         if (main.a.e) {
            this.ak = -1;
         }
      } else if (this.ak >= 0 && this.bG.size() != 0) {
         el var3 = new el("");
         this.cG = this.ak - 1;
         var3.addElement(new de(aw.bp, this, 8001, (r)this.bG.elementAt(this.cG)));
         var3.addElement(new de(aw.cO, this, 8003, (r)this.bG.elementAt(this.cG)));
         main.a.F.a(var3, this.b, (this.ak + 1) * this.aD - this.g + this.af);
         r var5 = (r)this.bG.elementAt(this.ak - 1);
         String var4 = "|0|1|" + var5.c.ag + "\n" + "\n--" + "\n|5|" + ds.a(var5.a, "|", 0)[2];
         this.ai = new ae();
         this.a(this.ai, var4);
         this.cH = var5.c;
         this.bC = null;
      }

   }

   private void an() {
      if (this.ak != -1) {
         ds.c("FIRE ZONE");
         this.cI = true;
         main.a.G.A();
      }

   }

   private void ao() {
      if (this.ak >= 0) {
         this.bC = null;
         el var2 = new el("");
         byte var1;
         h var3;
         if (this.B == 0 && !this.equals(main.a.H)) {
            if (this.ak == 0) {
               this.a(af.e().aG.length, false);
            } else {
               var1 = (byte)c(this.ak, this.bO);
               var3 = af.e().aG[var1];
               if (var3 != null) {
                  if (this.aj) {
                     var2.addElement(new de(aw.dX, this, 1000, var3));
                     var2.addElement(new de(aw.bl, this, 2010, var3));
                  } else if (var3.b()) {
                     var2.addElement(new de(aw.dX, this, 1000, var3));
                  } else {
                     var2.addElement(new de(aw.dX, this, 1000, var3));
                  }

                  this.bC = var3;
               }
            }
         }

         if (this.B == 1 || this.equals(main.a.H)) {
            if (this.ak == 0) {
               this.a(af.e().aH.length + af.e().aF.length, true);
            } else {
               h[] var4 = af.e().aH;
               if (!a(this.ak, this.bO, var4)) {
                  var1 = (byte)b(this.ak, this.bO, var4);
                  var3 = af.e().aF[var1];
                  if (var3 != null) {
                     var2.addElement(new de(aw.cB, this, 1001, var3));
                     if (var3.b()) {
                        var2.addElement(new de(aw.bl, this, 2000, var3));
                     } else {
                        var2.addElement(new de(aw.bl, this, 2001, var3));
                     }

                     this.bC = var3;
                  }
               } else {
                  var3 = af.e().aH[c(this.ak, this.bO)];
                  if (var3 != null) {
                     var2.addElement(new de(aw.cC, this, 1002, var3));
                     this.bC = var3;
                  }
               }
            }
         }

         if (this.bC != null) {
            af.e().a(this.bC.D, this.bC.E, this.bC.F, this.bC.G);
            if (this.aj) {
               var2.addElement(new de(aw.dY, this, 2011, this.bC));
            }

            main.a.F.a(var2, this.b, (this.ak + 1) * this.aD - this.g + this.af);
            this.b(this.bC);
         } else {
            this.ai = null;
         }

         this.aI = this.O * this.aD - this.ah;
      }

   }

   private void ap() {
      --this.cY;
      if (this.cY < 0) {
         this.cY = 0;
      }

      --this.cZ;
      if (this.cZ < 0) {
         this.cZ = 0;
      }

      if (this.cY == 0) {
         if (!this.dc) {
            if (this.cW > 0) {
               if (this.av != -1) {
                  if (this.cX == 3) {
                     if (main.a.w % 10 == 0) {
                        ei.a(new ea(21, this.ax - 10, this.ay + 25, 4, 1, 1));
                        --this.cW;
                     }
                  } else {
                     if (main.a.w % 2 == 0) {
                        if (this.db) {
                           if (this.cR < 40) {
                              this.cR += 2;
                           }
                        } else if (this.cR > 10) {
                           this.cR -= 2;
                        }
                     }

                     if (this.cZ == 0) {
                        if (this.db) {
                           if (this.cM > 0) {
                              this.cM -= 5;
                           } else if (main.a.w % 10 == 0) {
                              this.db = false;
                              --this.cW;
                              this.cZ = 5;
                              this.da = 10;
                           }
                        } else if (this.cM < 90) {
                           this.cM += 5;
                        } else if (main.a.w % 10 == 0) {
                           this.db = true;
                           this.cZ = 10;
                        }
                     }

                     this.cN = this.cO;
                     this.cN -= this.cR;
                     if (this.cN >= 360) {
                        this.cN -= 360;
                     }

                     if (this.cN < 0) {
                        this.cN += 360;
                     }

                     this.cO = this.cN;
                     this.aq();
                  }
               }
            } else if (main.a.w % 20 == 0) {
               this.dc = true;
            }

            if (main.a.w % 20 == 0) {
               if (this.cX != 3) {
                  ax.a(132, this.ax, this.ay, 2);
               }

               ax.a(114, this.ax, this.ay + 20, 2);
            }
         } else if (this.dc) {
            g var1;
            if (this.av == 1) {
               if (this.da == 10) {
                  ei.a(new ea(22, this.ax - 3, this.ay + 25, 4, 1, 1));
               }

               --this.da;
               if (this.da < 0) {
                  this.da = 0;
               }

               if (this.cM < 300) {
                  this.cM = ds.g(this.cM + 10);
                  if (this.cM == 20) {
                     this.a(this.aw, aw.B);
                  }
               } else if (main.a.w % 20 == 0) {
                  if (main.a.A > ab * 2) {
                     var1 = new g();
                     main.a.H = var1;
                     var1.M[7] = new String[][]{{""}};
                     main.a.H.f();
                     main.a.H.s();
                  }

                  this.av = -1;
                  this.az = true;
                  if (this.cX == 4) {
                     main.a.G.z();
                  }
               }

               this.aq();
            } else if (this.av == 0) {
               if (this.da == 10) {
                  if (this.cX == 2) {
                     ei.a(new ea(20, this.ax - 3, this.ay + 15, 4, 2, 1));
                  } else {
                     ei.a(new ea(21, this.ax - 10, this.ay + 25, 4, 1, 1));
                  }

                  this.a(this.aw, aw.D);
                  this.dd = false;
               }

               if (!this.dd) {
                  --this.da;
                  if (this.da < -50) {
                     this.da = -50;
                     if (this.cX < 3 && main.a.A > ab * 2) {
                        var1 = new g();
                        main.a.H = var1;
                        var1.M[7] = new String[][]{{""}};
                        main.a.H.f();
                        main.a.H.s();
                     }

                     this.av = -1;
                     this.az = true;
                     if (this.cX == 4) {
                        main.a.G.z();
                     }
                  }
               }
            }
         }
      }

   }

   private void aq() {
      for(int var1 = 0; var1 < this.cT.length; ++var1) {
         if (this.cN >= 360) {
            this.cN -= 360;
         }

         if (this.cN < 0) {
            this.cN += 360;
         }

         this.cT[var1] = ds.g(this.cM * ds.a(this.cN) / 1024);
         this.cS[var1] = ds.g(this.cM * ds.b(this.cN) / 1024);
         if (this.cN < 90) {
            this.cU[var1] = this.ax + this.cS[var1];
            this.cV[var1] = this.ay - this.cT[var1];
         } else if (this.cN >= 90 && this.cN < 180) {
            this.cU[var1] = this.ax - this.cS[var1];
            this.cV[var1] = this.ay - this.cT[var1];
         } else if (this.cN >= 180 && this.cN < 270) {
            this.cU[var1] = this.ax - this.cS[var1];
            this.cV[var1] = this.ay + this.cT[var1];
         } else {
            this.cU[var1] = this.ax + this.cS[var1];
            this.cV[var1] = this.ay + this.cT[var1];
         }

         this.cN -= this.cP;
      }

   }

   private void ar() {
      this.A = 19;
      this.c(0);
      bu.a();
      bu.g();
      this.O = H.length;
      this.aD = 24;
      byte var1;
      if (main.a.e) {
         var1 = -1;
      } else {
         var1 = 0;
      }

      this.ak = var1;
      this.aI = this.O * this.aD - this.ah;
      if (this.aI < 0) {
         this.aI = 0;
      }

      int var2 = this.aJ[this.B];
      this.f = var2;
      this.g = var2;
      if (this.g < 0) {
         this.f = 0;
         this.g = 0;
      }

      if (this.g > this.aI) {
         var2 = this.aI;
         this.f = var2;
         this.g = var2;
      }

      this.aK = 0;
      this.h = 0;
   }

   private void as() {
      if (this.ak >= 0) {
         switch(this.ak) {
         case 0:
            bu.a().b();
            break;
         case 1:
            bu.a().e();
         case 2:
         default:
            break;
         case 3:
            bu.a().d();
            break;
         case 4:
            bu.a().c();
         }
      }

   }

   private void at() {
      this.A = 20;
      this.c(0);
      if (l.c == 5) {
         ba = new String[]{aw.fW, aw.bM, aw.bN, aw.ad};
         if (p.bk) {
            ba = new String[]{aw.fW, aw.bM, aw.bN, aw.ad, aw.o};
         }
      } else {
         ba = new String[]{aw.fW, aw.bM, aw.bN, aw.ad, aw.fS};
         if (p.bk) {
            ba = new String[]{aw.fW, aw.bM, aw.bN, aw.ad, aw.fS, aw.o};
         }

         if ((l.c == 2 || l.c == 7) && aw.fA != 2) {
            ba = new String[]{aw.fW, aw.bM, aw.bN, aw.ad, aw.fS};
            if (p.bk) {
               ba = new String[]{aw.fW, aw.bM, aw.bN, aw.ad, aw.fS, aw.o};
            }
         }
      }

      this.O = ba.length;
      this.aD = 24;
      byte var1;
      if (main.a.e) {
         var1 = -1;
      } else {
         var1 = 0;
      }

      this.ak = var1;
      this.aI = this.O * this.aD - this.ah;
      if (this.aI < 0) {
         this.aI = 0;
      }

      int var2 = this.aJ[this.B];
      this.f = var2;
      this.g = var2;
      if (this.g < 0) {
         this.f = 0;
         this.g = 0;
      }

      if (this.g > this.aI) {
         var2 = this.aI;
         this.f = var2;
         this.g = var2;
      }

      this.aK = 0;
      this.h = 0;
   }

   private void au() {
      if (this.ak >= 0) {
         switch(this.ak) {
         case 0:
            main.a.h();
            if (this.o == null) {
               this.o = new cq();
               this.o.a.b = main.a.B - 35 - cq.b().a.d;
               this.o.a();
               this.o.c = main.a.G;
            }

            this.o.a.a("");
            this.o.h = aw.fX;
            this.o.a.i = aw.fX;
            this.o.g = "";
            this.o.b = true;
            this.o.a.e = true;
            this.o.a.c(1);
            if (main.a.e) {
               this.o.a.a();
            }
            break;
         case 1:
            bt.a().a((byte)0, (int)-1);
            bp.a();
            break;
         case 2:
            bt.a().b((byte)0, (int)-1);
            bp.a();
            break;
         case 3:
            this.l();
            if (this.o == null) {
               this.o = new cq();
               this.o.a.b = main.a.B - 35 - cq.b().a.d;
               this.o.a();
               this.o.c = main.a.G;
            }
            break;
         case 4:
            if (aw.fA == 2) {
               String var1 = "http://dragonball.indonaga.com/coda/?username=" + main.a.I.a.d();
               this.z();

               try {
                  GameMidlet.f.platformRequest(var1);
               } catch (Exception var2) {
                  var2.toString();
               }
            } else {
               this.z();
               if (af.e().aD.c <= 10) {
                  main.a.a(aw.fT);
               } else {
                  a.a().b();
               }
            }
            break;
         case 5:
            this.L();
         }
      }

   }

   private void av() {
      byte var1 = 0;
      this.aD = 24;
      this.O = af.e().aK[this.B].length;
      this.aI = this.O * this.aD - this.ah;
      if (this.aI < 0) {
         this.aI = 0;
      }

      int var2 = this.aJ[this.B];
      this.f = var2;
      this.g = var2;
      if (this.g < 0) {
         this.f = 0;
         this.g = 0;
      }

      if (this.g > this.aI) {
         var2 = this.aI;
         this.f = var2;
         this.g = var2;
      }

      if (main.a.e) {
         var1 = -1;
      }

      this.ak = var1;
   }

   private boolean aw() {
      boolean var2 = true;
      boolean var1;
      if (this.A == 0) {
         var1 = var2;
         if (this.B == 1) {
            return var1;
         }
      }

      if (this.A == 7 && this.B == 0) {
         var1 = var2;
      } else {
         var1 = false;
      }

      return var1;
   }

   private void ax() {
      if (this.ak >= 0) {
         if (main.a.i[4]) {
            --this.bO;
            if (this.bO < 0) {
               this.bO = 0;
               if (main.a.W) {
                  main.a.W = false;
                  main.a.G.ak = 0;
               }
            }
         } else if (main.a.i[6]) {
            ++this.bO;
            if (this.bO > this.dn - 1) {
               this.bO = this.dn - 1;
               if (main.a.H != null) {
                  main.a.W = true;
                  main.a.H.ak = 0;
               }
            }
         }
      }

   }

   private void ay() {
      this.O();
      if (this.ak == 0) {
         this.ax();
      }

   }

   private static int b(int var0, int var1, h[] var2) {
      return var0 - 1 + var1 * 20 - var2.length;
   }

   public static di b(int var0, int var1) {
      di var2;
      switch(var0) {
      case 0:
         var2 = di.c;
         break;
      case 1:
         var2 = di.h;
         break;
      case 2:
      default:
         var2 = di.c;
         break;
      case 3:
         var2 = di.F;
         break;
      case 4:
         var2 = di.b;
         break;
      case 5:
         var2 = di.d;
         break;
      case 6:
         var2 = di.a;
         break;
      case 7:
         var2 = di.f;
      }

      return var2;
   }

   private void b(en var1) {
      var1.e(this.ae, this.af, this.ag, this.ah);
      var1.a(0, -this.g);
      var1.a(0);
      if (this.O != 0) {
         int var3 = (this.g + this.ah) / 24 + 1;
         int var2 = var3;
         if (var3 < this.ah / 24 + 1) {
            var2 = this.ah / 24 + 1;
         }

         int var4;
         if (var2 > this.O) {
            var4 = this.O;
         } else {
            var4 = var2;
         }

         var3 = this.g / 24;
         var2 = var3;
         if (var3 >= var4) {
            var2 = var4 - 1;
         }

         var3 = var2;
         if (var2 < 0) {
            var3 = 0;
         }

         for(var2 = var3; var2 < var4; ++var2) {
            int var5 = this.ae;
            int var11 = this.af + this.aD * var2;
            int var6 = this.aD;
            int var10 = this.ae + 24;
            int var7 = this.af + this.aD * var2;
            int var8 = this.ag - 24;
            int var9 = this.aD - 1;
            if (var2 == this.ak) {
               var3 = 16383818;
            } else {
               var3 = 15196114;
            }

            var1.a(var3);
            var1.d(var10, var7, var8, var9);
            if (var2 == this.ak) {
               var3 = 9541120;
            } else {
               var3 = 9993045;
            }

            var1.a(var3);
            var1.d(var5, var11, 24, var6 - 1);
            q var12 = (q)this.W.elementAt(var2);
            if (var12.b != -1) {
               bl.b(var1, var12.b, var5, var11, 0, 0);
            } else {
               av var13 = p.x[var12.a];
               bl.b(var1, var13.a[af.bC[0][0][0]].a, var5 + var13.a[af.bC[0][0][0]].b, var11 + var9 - 1, 0, 36);
            }

            var1.e(this.ae, this.af + this.g, this.ag, this.ah);
            if (var12.g != af.e().J) {
               di.h.a(var1, var12.e, var10 + 5, var7, 0);
            } else {
               di.a.a(var1, var12.e, var10 + 5, var7, 0);
            }

            di.q.a(var1, var12.f, var10 + var8 - 5, var7 + 11, 1);
            di.m.a(var1, aw.bK + ": " + var12.h, var10 + 5, var7 + 11, 0);
         }

         this.f(var1);
      }

   }

   private void b(h var1) {
      this.ai = new ae();
      String var5 = "";
      String var4 = var5;
      if (var1.b.c != af.e().K) {
         if (var1.b.c == 0) {
            var4 = "" + "\n|7|1|" + aw.cq;
         } else if (var1.b.c == 1) {
            var4 = "" + "\n|7|1|" + aw.cr;
         } else {
            var4 = var5;
            if (var1.b.c == 2) {
               var4 = "" + "\n|7|1|" + aw.cs;
            }
         }
      }

      var5 = "";
      String var6 = var5;
      int var2;
      if (var1.a != null) {
         for(var2 = 0; var2 < var1.a.length; ++var2) {
            if (var1.a[var2].c.a == 72) {
               var5 = " [+" + var1.a[var2].a + "]";
            }
         }

         var6 = var5;
      }

      int var3;
      boolean var8;
      if (var1.a != null) {
         var3 = 0;

         for(var8 = false; var3 < var1.a.length; var4 = var5) {
            var5 = var4;
            if (var1.a[var3].c.a == 41) {
               var5 = var4;
               if (var1.a[var3].a == 1) {
                  var5 = var4 + "|0|1|" + var1.b.d + var6;
               }

               var4 = var5;
               if (var1.a[var3].a == 2) {
                  var4 = var5 + "|2|1|" + var1.b.d + var6;
               }

               var5 = var4;
               if (var1.a[var3].a == 3) {
                  var5 = var4 + "|8|1|" + var1.b.d + var6;
               }

               if (var1.a[var3].a == 4) {
                  var5 = var5 + "|7|1|" + var1.b.d + var6;
                  var8 = true;
               } else {
                  var8 = true;
               }
            }

            ++var3;
         }

         var5 = var4;
      } else {
         var8 = false;
         var5 = var4;
      }

      var4 = var5;
      if (!var8) {
         var4 = var5 + "|0|1|" + var1.b.d + var6;
      }

      var5 = var4;
      if (var1.a != null) {
         for(var2 = 0; var2 < var1.a.length; var4 = var6) {
            label156: {
               boolean var9;
               if (var1.a[var2].c.b.startsWith("$")) {
                  var9 = true;
               } else {
                  var9 = false;
               }

               String var7;
               if (var9) {
                  var7 = ai.a(var1.a[var2].c.b, "$", "");
                  var6 = var4;
                  if (var1.a[var2].a == 1) {
                     var6 = var4 + "\n|1|1|" + var7;
                  }

                  var5 = var6;
                  if (var1.a[var2].a == 0) {
                     var5 = var6 + "\n|0|1|" + var7;
                  }
               } else {
                  var7 = var1.a[var2].a();
                  var5 = var4;
                  if (!var7.equals("")) {
                     var6 = var4;
                     if (var1.a[var2].c.a == 72) {
                        break label156;
                     }

                     if (var1.a[var2].c.a == 102) {
                        this.ai.o = (byte)var1.a[var2].a;
                        var5 = var4;
                     } else if (var1.a[var2].c.a == 107) {
                        this.ai.p = (byte)var1.a[var2].a;
                        var5 = var4;
                     } else {
                        var5 = var4 + "\n|1|1|" + var7;
                     }
                  }
               }

               var6 = var5;
               if (var1.a[var2].c.a == 228) {
                  ds.c("========>>> " + var1.a[var2].c.b + "_" + var1.a[var2].a);
                  var6 = var5;
                  if (var1.a[var2].a > 7) {
                     for(var3 = 0; var3 < var1.a[var2].a - 7; ++var3) {
                        this.ai.r[var3 + 7] = true;
                     }

                     var6 = var5;
                  }
               }
            }

            ++var2;
         }

         var5 = var4;
      }

      if (this.bC.b.i > 1) {
         var4 = aw.ct + ": " + this.bC.b.i;
         if ((long)this.bC.b.i > af.e().y) {
            var4 = var5 + "\n|3|1|" + var4 + "\n|3|1|" + aw.cu + ": " + af.e().y;
         } else {
            var4 = var5 + "\n|6|1|" + var4;
         }
      } else {
         var4 = var5 + "\n|6|1|";
      }

      this.bC.A = this.a(this.bC);
      var5 = var4 + "\n--" + "\n|6|" + var1.b.e;
      var4 = var5;
      if (!var1.z.equals("")) {
         var4 = var5;
         if (!var1.b.e.equals("")) {
            var4 = var5 + "\n--";
         }

         var4 = var4 + "\n|2|" + var1.z;
      }

      var5 = var4;
      if (this.ai.p > 0) {
         var5 = var4 + "\n\n";
      }

      this.a(this.ai, var5);
      this.bK = var1.b.f;
      this.bL = null;
      this.cH = null;
   }

   private void b(r var1) {
      String var2 = "|0|1|" + var1.c.ag + "\n";
      if (var1.e) {
         var2 = var2 + "|4|1|" + aw.cM;
      } else {
         var2 = var2 + "|3|1|" + aw.cN;
      }

      var2 = var2 + "\n--" + "\n|5|" + aw.cZ + ": " + var1.a;
      this.ai = new ae();
      this.a(this.ai, var2);
      this.cH = var1.c;
      this.bC = null;
   }

   private void b(boolean var1) {
      byte var2 = 0;
      this.O = this.i(af.e().aH.length + af.e().aF.length);
      this.aD = 24;
      this.aI = this.O * this.aD - this.ah;
      int var3 = this.aJ[this.B];
      this.f = var3;
      this.g = var3;
      if (this.aI < 0) {
         this.aI = 0;
      }

      if (this.g < 0) {
         this.f = 0;
         this.g = 0;
      }

      if (this.g > this.aI) {
         this.f = 0;
         this.g = 0;
      }

      if (var1) {
         if (main.a.e) {
            var2 = -1;
         }

         this.ak = var2;
      }

   }

   private static int c(int var0, int var1) {
      return var0 - 1 + var1 * 20;
   }

   private void c(int var1) {
      this.bJ = -1;
      this.d = ab;
      this.e = main.a.B;
      this.b = 0;
      this.c = 0;
      this.aD = 24;
      this.bH = var1;
      if (var1 == 0) {
         this.ae = 2;
         this.af = 80;
         this.ag = this.d - 4;
         this.ah = this.e - 96;
         this.h = this.ag;
         this.aK = 0;
         this.b = 0;
      } else if (var1 == 1) {
         this.ag = this.d - 4;
         this.ae = main.a.A - this.ag;
         this.af = 80;
         this.ah = this.e - 96;
         this.b = this.ae - 2;
         this.h = -(main.a.A + this.d);
         this.aK = main.a.A - this.d;
      }

      this.aE = this.d / 5 - 1;
      this.B = 0;
      this.aY = this.M[this.A];
      if (this.aY.length < 5) {
         this.aE += 5;
      }

      this.C = this.ae + this.ag / 2 - this.aY.length * this.aE / 2;
      this.bp = new int[this.aY.length];
      this.aJ = new int[this.aY.length];

      for(var1 = 0; var1 < this.aY.length; ++var1) {
         int[] var3 = this.bp;
         byte var2;
         if (main.a.e) {
            var2 = -1;
         } else {
            var2 = 0;
         }

         var3[var1] = var2;
      }

      if (this.aX[this.A] != -1) {
         this.B = this.aX[this.A];
      }

      if (this.B < 0) {
         this.B = 0;
      }

      if (this.B > this.aY.length - 1) {
         this.B = this.aY.length - 1;
      }

      this.ci = null;
   }

   private void c(en var1) {
      Exception var10000;
      label739: {
         boolean var10001;
         try {
            if (this.A == 1 && this.B == this.aY.length - 1 && main.a.H == null && this.bJ != 2) {
               this.x(var1);
               return;
            }
         } catch (Exception var88) {
            var10000 = var88;
            var10001 = false;
            break label739;
         }

         int var2;
         di var12;
         String var13;
         String var90;
         di var92;
         label732: {
            label779: {
               try {
                  var1.a(16711680);
                  var1.e(this.ae, this.af, this.ag, this.ah);
                  if (this.bJ != 2 || !this.equals(main.a.G)) {
                     break label732;
                  }

                  if (this.B > 3 || !main.a.e) {
                     break label779;
                  }

                  if (this.g < -50) {
                     main.a.a(this.ae + this.ag / 2, this.af + 30, var1);
                     break label779;
                  }
               } catch (Exception var87) {
                  var10000 = var87;
                  var10001 = false;
                  break label739;
               }

               try {
                  if (this.g < 0) {
                     var92 = di.o;
                     var90 = aw.fP;
                     var2 = this.ae;
                     var92.a(var1, var90, this.ag / 2 + var2, this.af + 15, 2);
                     break label779;
                  }
               } catch (Exception var86) {
                  var10000 = var86;
                  var10001 = false;
                  break label739;
               }

               try {
                  if (this.aI < 0) {
                     break label779;
                  }

                  if (this.g > this.aI + 50) {
                     main.a.a(this.ae + this.ag / 2, this.af + this.ah - 30, var1);
                     break label779;
                  }
               } catch (Exception var85) {
                  var10000 = var85;
                  var10001 = false;
                  break label739;
               }

               try {
                  if (this.g > this.aI) {
                     var12 = di.o;
                     var13 = aw.fQ;
                     var2 = this.ae;
                     var12.a(var1, var13, this.ag / 2 + var2, this.af + this.ah - 25, 2);
                  }
               } catch (Exception var84) {
                  var10000 = var84;
                  var10001 = false;
                  break label739;
               }
            }

            try {
               if (af.e().aJ[this.B].length == 0 && this.A != 17) {
                  var92 = di.o;
                  var90 = aw.fR;
                  var2 = this.ae;
                  var92.a(var1, var90, this.ag / 2 + var2, this.af + this.ah / 2 - 10, 2);
                  return;
               }
            } catch (Exception var83) {
               var10000 = var83;
               var10001 = false;
               break label739;
            }
         }

         h[] var91;
         try {
            var1.a(0, -this.g);
            var91 = af.e().aJ[this.B];
         } catch (Exception var82) {
            var10000 = var82;
            var10001 = false;
            break label739;
         }

         h[] var15 = var91;

         label745: {
            label746: {
               try {
                  if (this.bJ != 2) {
                     break label745;
                  }

                  if (this.B == 4) {
                     break label746;
                  }
               } catch (Exception var81) {
                  var10000 = var81;
                  var10001 = false;
                  break label739;
               }

               var15 = var91;

               try {
                  if (this.A != 17) {
                     break label745;
                  }
               } catch (Exception var80) {
                  var10000 = var80;
                  var10001 = false;
                  break label739;
               }
            }

            try {
               var91 = af.e().aJ[4];
            } catch (Exception var79) {
               var10000 = var79;
               var10001 = false;
               break label739;
            }

            var15 = var91;

            try {
               if (var91.length == 0) {
                  var92 = di.o;
                  var90 = aw.fR;
                  var2 = this.ae;
                  var92.a(var1, var90, this.ag / 2 + var2, this.af + this.ah / 2 - 10, 2);
                  return;
               }
            } catch (Exception var78) {
               var10000 = var78;
               var10001 = false;
               break label739;
            }
         }

         int var4;
         try {
            var4 = var15.length;
         } catch (Exception var77) {
            var10000 = var77;
            var10001 = false;
            break label739;
         }

         var2 = 0;

         label666:
         while(true) {
            if (var2 >= var4) {
               try {
                  this.cn = 8;
                  this.f(var1);
                  this.cn = 9;
                  return;
               } catch (Exception var18) {
                  var10000 = var18;
                  var10001 = false;
                  break;
               }
            }

            label748: {
               int var3;
               int var5;
               int var6;
               int var7;
               int var8;
               int var9;
               int var10;
               int var11;
               label662: {
                  label661: {
                     try {
                        var10 = this.ae + 26;
                        var6 = this.af + this.aD * var2;
                        var8 = this.ag - 26;
                        var11 = this.aD;
                        var7 = this.ae;
                        var5 = this.af + this.aD * var2;
                        var9 = this.aD - 1;
                        if (var6 - this.g > this.af + this.ah || var6 - this.g < this.af - this.aD) {
                           break label748;
                        }

                        if (var2 != this.ak) {
                           break label661;
                        }
                     } catch (Exception var76) {
                        var10000 = var76;
                        var10001 = false;
                        break;
                     }

                     var3 = 16383818;
                     break label662;
                  }

                  var3 = 15196114;
               }

               label654: {
                  label653: {
                     try {
                        var1.a(var3);
                        var1.b(var10, var6, var8, var11 - 1);
                        if (var2 == this.ak) {
                           break label653;
                        }
                     } catch (Exception var75) {
                        var10000 = var75;
                        var10001 = false;
                        break;
                     }

                     var3 = 9993045;
                     break label654;
                  }

                  var3 = 9541120;
               }

               try {
                  var1.a(var3);
                  var1.b(var7, var5, 24, var9);
               } catch (Exception var41) {
                  var10000 = var41;
                  var10001 = false;
                  break;
               }

               h var17 = var15[var2];
               if (var17 != null) {
                  var13 = "";

                  di var14;
                  try {
                     var14 = di.m;
                  } catch (Exception var40) {
                     var10000 = var40;
                     var10001 = false;
                     break;
                  }

                  var12 = var14;

                  label751: {
                     try {
                        if (var17.B == 0) {
                           break label751;
                        }
                     } catch (Exception var74) {
                        var10000 = var74;
                        var10001 = false;
                        break;
                     }

                     var12 = var14;

                     try {
                        if (this.bJ != 2) {
                           break label751;
                        }
                     } catch (Exception var73) {
                        var10000 = var73;
                        var10001 = false;
                        break;
                     }

                     var12 = var14;

                     try {
                        if (this.B > 3) {
                           break label751;
                        }
                     } catch (Exception var72) {
                        var10000 = var72;
                        var10001 = false;
                        break;
                     }

                     var12 = var14;

                     try {
                        if (this.equals(main.a.H)) {
                           break label751;
                        }
                     } catch (Exception var71) {
                        var10000 = var71;
                        var10001 = false;
                        break;
                     }

                     var12 = var14;

                     try {
                        if (var17.b.d.length() < 20) {
                           var12 = di.h;
                        }
                     } catch (Exception var39) {
                        var10000 = var39;
                        var10001 = false;
                        break;
                     }
                  }

                  di var16 = var12;
                  String var93 = var13;

                  StringBuffer var94;
                  label752: {
                     try {
                        if (var17.a == null) {
                           break label752;
                        }
                     } catch (Exception var65) {
                        var10000 = var65;
                        var10001 = false;
                        break;
                     }

                     var3 = 0;
                     var93 = var13;
                     var92 = var12;

                     while(true) {
                        try {
                           if (var3 >= var17.a.length) {
                              break;
                           }
                        } catch (Exception var66) {
                           var10000 = var66;
                           var10001 = false;
                           break label666;
                        }

                        try {
                           if (var17.a[var3].c.a == 72) {
                              var94 = new StringBuffer(" [+");
                              var93 = var94.append(var17.a[var3].a).append("]").toString();
                           }
                        } catch (Exception var70) {
                           var10000 = var70;
                           var10001 = false;
                           break label666;
                        }

                        var12 = var92;

                        label754: {
                           try {
                              if (var17.a[var3].c.a != 41) {
                                 break label754;
                              }

                              if (var17.a[var3].a == 1) {
                                 var12 = h(0);
                                 break label754;
                              }
                           } catch (Exception var69) {
                              var10000 = var69;
                              var10001 = false;
                              break label666;
                           }

                           try {
                              if (var17.a[var3].a == 2) {
                                 var12 = h(2);
                                 break label754;
                              }
                           } catch (Exception var68) {
                              var10000 = var68;
                              var10001 = false;
                              break label666;
                           }

                           try {
                              if (var17.a[var3].a == 3) {
                                 var12 = h(8);
                                 break label754;
                              }
                           } catch (Exception var67) {
                              var10000 = var67;
                              var10001 = false;
                              break label666;
                           }

                           var12 = var92;

                           try {
                              if (var17.a[var3].a == 4) {
                                 var12 = h(7);
                              }
                           } catch (Exception var38) {
                              var10000 = var38;
                              var10001 = false;
                              break label666;
                           }
                        }

                        ++var3;
                        var92 = var12;
                     }

                     var16 = var92;
                  }

                  try {
                     var94 = new StringBuffer(String.valueOf(var17.b.d));
                     var16.a(var1, var94.append(var93).toString(), var10 + 5, var6 + 1, 0);
                  } catch (Exception var37) {
                     var10000 = var37;
                     var10001 = false;
                     break;
                  }

                  var13 = "";

                  label756: {
                     try {
                        if (var17.a == null || var17.a.length <= 0) {
                           break label756;
                        }
                     } catch (Exception var58) {
                        var10000 = var58;
                        var10001 = false;
                        break;
                     }

                     var90 = var13;

                     label757: {
                        try {
                           if (var17.a[0] == null) {
                              break label757;
                           }
                        } catch (Exception var64) {
                           var10000 = var64;
                           var10001 = false;
                           break;
                        }

                        var90 = var13;

                        try {
                           if (var17.a[0].c.a == 102) {
                              break label757;
                           }
                        } catch (Exception var63) {
                           var10000 = var63;
                           var10001 = false;
                           break;
                        }

                        var90 = var13;

                        try {
                           if (var17.a[0].c.a != 107) {
                              var94 = new StringBuffer(String.valueOf(""));
                              var90 = var94.append(var17.a[0].a()).toString();
                           }
                        } catch (Exception var36) {
                           var10000 = var36;
                           var10001 = false;
                           break;
                        }
                     }

                     try {
                        var14 = di.q;
                     } catch (Exception var35) {
                        var10000 = var35;
                        var10001 = false;
                        break;
                     }

                     var92 = var14;

                     label758: {
                        try {
                           if (var17.A >= 0) {
                              break label758;
                           }
                        } catch (Exception var62) {
                           var10000 = var62;
                           var10001 = false;
                           break;
                        }

                        var92 = var14;

                        try {
                           if (var17.b.b != 5) {
                              var92 = di.p;
                           }
                        } catch (Exception var34) {
                           var10000 = var34;
                           var10001 = false;
                           break;
                        }
                     }

                     var93 = var90;

                     label759: {
                        try {
                           if (this.bJ != 2) {
                              break label759;
                           }
                        } catch (Exception var61) {
                           var10000 = var61;
                           var10001 = false;
                           break;
                        }

                        var93 = var90;

                        try {
                           if (var17.a.length <= 1) {
                              break label759;
                           }
                        } catch (Exception var60) {
                           var10000 = var60;
                           var10001 = false;
                           break;
                        }

                        var93 = var90;

                        try {
                           if (var17.v != -1) {
                              StringBuffer var95 = new StringBuffer(String.valueOf(var90));
                              var93 = var95.toString();
                           }
                        } catch (Exception var33) {
                           var10000 = var33;
                           var10001 = false;
                           break;
                        }
                     }

                     try {
                        if (this.bJ == 2 && (this.bJ != 2 || var17.v > 1)) {
                           break label756;
                        }
                     } catch (Exception var59) {
                        var10000 = var59;
                        var10001 = false;
                        break;
                     }

                     try {
                        var92.a(var1, var93, var10 + 5, var6 + 11, 0);
                     } catch (Exception var32) {
                        var10000 = var32;
                        var10001 = false;
                        break;
                     }
                  }

                  try {
                     if (var17.s > 0) {
                        bl.b(var1, var17.u, var10 + var8 - 7, var6 + 9, 0, 3);
                        di.b.a(var1, ds.a((long)var17.s), var10 + var8 - 15, var6 + 1, 1);
                     }
                  } catch (Exception var31) {
                     var10000 = var31;
                     var10001 = false;
                     break;
                  }

                  label761: {
                     try {
                        if (var17.n == 0 && var17.p == 0) {
                           break label761;
                        }
                     } catch (Exception var48) {
                        var10000 = var48;
                        var10001 = false;
                        break;
                     }

                     label539: {
                        label762: {
                           try {
                              if (this.bJ == 2 || var17.j != 0L) {
                                 break label539;
                              }

                              if (var17.n > 0 && var17.p > 0) {
                                 if (var17.n > 0) {
                                    var1.a(w, var10 + var8 - 7, var6 + 7, 3);
                                    di.d.a(var1, ds.a((long)var17.n), var10 + var8 - 15, var6 + 1, 1);
                                 }
                                 break label762;
                              }
                           } catch (Exception var57) {
                              var10000 = var57;
                              var10001 = false;
                              break;
                           }

                           try {
                              if (var17.n > 0) {
                                 var1.a(w, var10 + var8 - 7, var6 + 7, 3);
                                 di.d.a(var1, ds.a((long)var17.n), var10 + var8 - 15, var6 + 1, 1);
                              }
                           } catch (Exception var30) {
                              var10000 = var30;
                              var10001 = false;
                              break;
                           }

                           try {
                              if (var17.p > 0) {
                                 var1.a(y, var10 + var8 - 7, var6 + 7, 3);
                                 di.h.a(var1, ds.a((long)var17.p), var10 + var8 - 15, var6 + 1, 1);
                              }
                              break label539;
                           } catch (Exception var56) {
                              var10000 = var56;
                              var10001 = false;
                              break;
                           }
                        }

                        try {
                           if (var17.p > 0) {
                              var1.a(y, var10 + var8 - 7, var6 + 7 + 11, 3);
                              di.h.a(var1, ds.a((long)var17.p), var10 + var8 - 15, var6 + 12, 1);
                           }
                        } catch (Exception var29) {
                           var10000 = var29;
                           var10001 = false;
                           break;
                        }
                     }

                     label783: {
                        label516: {
                           label765: {
                              try {
                                 if (this.bJ != 2 || this.B > 3 || this.equals(main.a.H)) {
                                    break label761;
                                 }

                                 if (var17.n <= 0 || var17.p <= 0) {
                                    break label516;
                                 }

                                 if (var17.n <= 0) {
                                    break label783;
                                 }

                                 var1.a(w, var10 + var8 - 7, var6 + 7, 3);
                                 if (af.e().at < (long)var17.n) {
                                    var12 = di.a;
                                    break label765;
                                 }
                              } catch (Exception var55) {
                                 var10000 = var55;
                                 var10001 = false;
                                 break;
                              }

                              try {
                                 var12 = di.d;
                              } catch (Exception var28) {
                                 var10000 = var28;
                                 var10001 = false;
                                 break;
                              }
                           }

                           try {
                              var12.a(var1, ds.b((long)var17.n), var10 + var8 - 15, var6 + 1, 1);
                              break label783;
                           } catch (Exception var27) {
                              var10000 = var27;
                              var10001 = false;
                              break;
                           }
                        }

                        label498: {
                           label767: {
                              try {
                                 if (var17.n <= 0) {
                                    break label498;
                                 }

                                 var1.a(w, var10 + var8 - 7, var6 + 7, 3);
                                 if (af.e().at < (long)var17.n) {
                                    var12 = di.a;
                                    break label767;
                                 }
                              } catch (Exception var54) {
                                 var10000 = var54;
                                 var10001 = false;
                                 break;
                              }

                              try {
                                 var12 = di.d;
                              } catch (Exception var24) {
                                 var10000 = var24;
                                 var10001 = false;
                                 break;
                              }
                           }

                           try {
                              var12.a(var1, ds.b((long)var17.n), var10 + var8 - 15, var6 + 1, 1);
                           } catch (Exception var23) {
                              var10000 = var23;
                              var10001 = false;
                              break;
                           }
                        }

                        label487: {
                           label769: {
                              try {
                                 if (var17.p <= 0) {
                                    break label487;
                                 }

                                 var1.a(y, var10 + var8 - 7, var6 + 7, 3);
                                 if (af.e().av < var17.p) {
                                    var12 = di.a;
                                    break label769;
                                 }
                              } catch (Exception var53) {
                                 var10000 = var53;
                                 var10001 = false;
                                 break;
                              }

                              try {
                                 var12 = di.h;
                              } catch (Exception var22) {
                                 var10000 = var22;
                                 var10001 = false;
                                 break;
                              }
                           }

                           try {
                              var12.a(var1, ds.b((long)var17.p), var10 + var8 - 15, var6 + 1, 1);
                           } catch (Exception var21) {
                              var10000 = var21;
                              var10001 = false;
                              break;
                           }
                        }

                        try {
                           var12 = di.h;
                        } catch (Exception var52) {
                           var10001 = false;
                           break label761;
                        }

                        try {
                           if (!af.e().ag.equals(var17.H)) {
                              var12 = di.h;
                           }
                        } catch (Exception var51) {
                           var10001 = false;
                           break label761;
                        }

                        try {
                           var12.a(var1, var17.H, var10 + var8, di.a.a() + var6 + 1, 1);
                        } catch (Exception var50) {
                           var10001 = false;
                        }
                        break label761;
                     }

                     label772: {
                        try {
                           if (var17.p <= 0) {
                              break label761;
                           }

                           var1.a(y, var10 + var8 - 7, var6 + 7 + 11, 3);
                           if (af.e().av < var17.p) {
                              var12 = di.a;
                              break label772;
                           }
                        } catch (Exception var49) {
                           var10000 = var49;
                           var10001 = false;
                           break;
                        }

                        try {
                           var12 = di.h;
                        } catch (Exception var26) {
                           var10000 = var26;
                           var10001 = false;
                           break;
                        }
                     }

                     try {
                        var12.a(var1, ds.b((long)var17.p), var10 + var8 - 15, var6 + 12, 1);
                     } catch (Exception var25) {
                        var10000 = var25;
                        var10001 = false;
                        break;
                     }
                  }

                  try {
                     bl.b(var1, var17.b.f, var7 + 12, var5 + var9 / 2, 0, 3);
                     if (var17.h > 1) {
                        var92 = di.n;
                        var94 = new StringBuffer();
                        var92.a(var1, var94.append(var17.h).toString(), var7 + 24, var5 + var9 - di.n.a(), 1);
                     }
                  } catch (Exception var47) {
                     var10000 = var47;
                     var10001 = false;
                     break;
                  }

                  try {
                     if (var17.C && main.a.w % 10 > 5) {
                        var1.a(v, var7 + 12, var6 + 19, 3);
                     }
                  } catch (Exception var20) {
                     var10000 = var20;
                     var10001 = false;
                     break;
                  }
               }

               label774: {
                  try {
                     if (this.bJ != 2 || !this.equals(main.a.H) && this.B != 4) {
                        break label774;
                     }
                  } catch (Exception var46) {
                     var10000 = var46;
                     var10001 = false;
                     break;
                  }

                  label784: {
                     try {
                        if (var17.v == 0) {
                           break label774;
                        }

                        if (var17.v == 1) {
                           di.r.a(var1, aw.fL, var10 + var8 - 5, var6 + 1, 1);
                           if (var17.n == -1) {
                              break label784;
                           }

                           var1.a(w, var10 + var8 - 7, var6 + 19, 3);
                           di.d.a(var1, ds.b((long)var17.n), var10 + var8 - 15, var6 + 13, 1);
                           break label774;
                        }
                     } catch (Exception var45) {
                        var10000 = var45;
                        var10001 = false;
                        break;
                     }

                     label412:
                     try {
                        if (var17.v == 2) {
                           di.b.a(var1, aw.fM, var10 + var8 - 5, var6 + 1, 1);
                           if (var17.n == -1) {
                              break label412;
                           }

                           var1.a(w, var10 + var8 - 7, var6 + 17, 3);
                           di.d.a(var1, ds.b((long)var17.n), var10 + var8 - 15, var6 + 11, 1);
                        }
                        break label774;
                     } catch (Exception var43) {
                        var10000 = var43;
                        var10001 = false;
                        break;
                     }

                     try {
                        if (var17.p != -1) {
                           var1.a(z, var10 + var8 - 7, var6 + 17, 3);
                           di.a.a(var1, ds.b((long)var17.p), var10 + var8 - 15, var6 + 11, 1);
                        }
                        break label774;
                     } catch (Exception var42) {
                        var10000 = var42;
                        var10001 = false;
                        break;
                     }
                  }

                  try {
                     if (var17.p != -1) {
                        var1.a(z, var10 + var8 - 7, var6 + 17, 3);
                        di.a.a(var1, ds.b((long)var17.p), var10 + var8 - 15, var6 + 11, 1);
                     }
                  } catch (Exception var44) {
                     var10000 = var44;
                     var10001 = false;
                     break;
                  }
               }

               try {
                  this.cn = 7;
               } catch (Exception var19) {
                  var10000 = var19;
                  var10001 = false;
                  break;
               }
            }

            ++var2;
         }
      }

      Exception var89 = var10000;
      var89.printStackTrace();
      System.out.println("tt >>:" + this.cn);
   }

   private void d(int var1) {
      int var2 = 0;
      if (this.ak == 0) {
         var2 = af.e().cr + 1000;
      }

      if (this.ak == 1) {
         var2 = af.e().cs + 1000;
      }

      if (this.ak == 2) {
         var2 = af.e().cq * af.e().cD;
      }

      if (this.ak == 3) {
         var2 = 500000 + af.e().ct * 100000;
      }

      String var3 = "" + "|5|2|" + aw.bl + " " + var2 + " " + aw.fh;
      String var4 = var3;
      if (var1 == 0) {
         var4 = var3 + "\n|5|2|" + aw.fl;
      }

      var3 = var4;
      if (var1 == 1) {
         var3 = var4 + "\n|5|2|" + aw.fm;
      }

      var4 = var3;
      if (var1 == 2) {
         var4 = var3 + "\n|5|2|" + aw.fn;
      }

      var3 = var4;
      if (var1 == 3) {
         var3 = var4 + "\n|5|2|" + aw.fn;
      }

      this.bC = null;
      this.bL = null;
      this.cH = null;
      this.bK = -1;
      this.ai = new ae();
      this.a(this.ai, var3);
   }

   private void d(en var1) {
      var1.e(this.ae, this.af, this.ag, this.ah);
      var1.a(0, -this.g);

      for(int var2 = 0; var2 < this.cm.length; ++var2) {
         int var6 = this.ae;
         int var4 = this.af + this.aD * var2;
         int var7 = this.ag;
         int var5 = this.aD;
         if (var4 - this.g <= this.af + this.ah && var4 - this.g >= this.af - this.aD) {
            int var3;
            if (var2 == this.ak) {
               var3 = 16383818;
            } else {
               var3 = 15196114;
            }

            var1.a(var3);
            var1.d(var6, var4, var7 - 1, var5 - 1);
            di var9 = di.f;
            String var8 = this.cm[var2];
            var3 = this.ae;
            var9.a(var1, var8, this.ag / 2 + var3, var4 + 6, 2);
         }
      }

      this.f(var1);
   }

   private void e(int var1) {
      try {
         this.bC.t = Integer.parseInt(this.o.a.d());
      } catch (Exception var4) {
         main.a.a(aw.ed);
         this.o.b = false;
         return;
      }

      String var2 = aw.bm;
      short var5;
      if (var1 == 0) {
         var5 = 11000;
      } else {
         var5 = 11001;
      }

      de var6 = new de(var2, this, var5, (Object)null);
      de var3 = new de(aw.bn, this, 11002, (Object)null);
      main.a.a(aw.f, var6, var3);
   }

   private void e(en var1) {
      var1.a(16711680);
      var1.e(this.ae, this.af, this.ag, this.ah);
      var1.a(0, -this.g);
      h[] var18 = af.f().aH;
      bf[] var19 = af.f().aI;

      for(int var3 = 0; var3 < var18.length + var19.length; ++var3) {
         boolean var4;
         if (var3 < var18.length) {
            var4 = true;
         } else {
            var4 = false;
         }

         int var10 = var18.length;
         int var9 = this.ae + 36;
         int var8 = this.af + this.aD * var3;
         int var11 = this.ag;
         int var12 = this.aD;
         int var6 = this.ae;
         int var7 = this.af + this.aD * var3;
         int var5 = this.aD - 1;
         if (var8 - this.g <= this.af + this.ah && var8 - this.g >= this.af - this.aD) {
            h var16;
            if (var4) {
               var16 = var18[var3];
            } else {
               var16 = null;
            }

            int var2;
            if (var3 == this.ak) {
               var2 = 16383818;
            } else if (var4) {
               var2 = 15196114;
            } else {
               var2 = 15723751;
            }

            var1.a(var2);
            var1.b(var9, var8, var11 - 36, var12 - 1);
            if (var3 == this.ak) {
               var2 = 9541120;
            } else if (var4) {
               var2 = 9993045;
            } else {
               var2 = 11837316;
            }

            var1.a(var2);
            if (var16 != null) {
               for(var2 = 0; var2 < var16.a.length; ++var2) {
                  if (var16.a[var2].c.a == 72 && var16.a[var2].a > 0) {
                     byte var20 = g(var16.a[var2].a);
                     if (f(var20) != -1) {
                        var12 = this.ak;
                        var1.a(f(var20));
                     }
                  }
               }
            }

            var1.b(var6, var7, 34, var5);
            if (var16 != null && var16.f && main.a.G.A == 12) {
               if (var3 == this.ak) {
                  var2 = 7040779;
               } else {
                  var2 = 6047789;
               }

               var1.a(var2);
               var1.b(var6, var7, 34, var5);
            }

            if (var16 == null) {
               if (!var4) {
                  bf var24 = var19[var3 - var10];
                  var1.a(p.au, var6 + 17, var5 / 2 + var7, 3);
                  if (var24.a != null) {
                     di.q.a(var1, var24.a.b, var9 + 5, var8 + 1, 0);
                     di.m.a(var1, aw.dn + ": " + var24.c, var9 + 5, var8 + 11, 0);
                     bl.b(var1, var24.a.f, var6 + 17, var7 + var5 / 2, 0, 3);
                  } else {
                     di.m.a(var1, var24.l, var9 + 5, var8 + 5, 0);
                     bl.b(var1, p.y[98].a[0].c, var6 + 17, var7 + var5 / 2, 0, 3);
                  }
               }
            } else {
               String var14 = "";
               di var17 = di.m;
               String var13 = var14;
               di var15 = var17;
               if (var16.a != null) {
                  var2 = 0;

                  di var21;
                  for(var15 = var17; var2 < var16.a.length; var15 = var21) {
                     if (var16.a[var2].c.a == 72) {
                        var14 = " [+" + var16.a[var2].a + "]";
                     }

                     var21 = var15;
                     if (var16.a[var2].c.a == 41) {
                        if (var16.a[var2].a == 1) {
                           var21 = h(0);
                        } else if (var16.a[var2].a == 2) {
                           var21 = h(2);
                        } else if (var16.a[var2].a == 3) {
                           var21 = h(8);
                        } else {
                           var21 = var15;
                           if (var16.a[var2].a == 4) {
                              var21 = h(7);
                           }
                        }
                     }

                     ++var2;
                  }

                  var13 = var14;
               }

               var15.a(var1, var16.b.d + var13, var9 + 5, var8 + 1, 0);
               if (var16.a != null) {
                  if (var16.a.length > 0 && var16.a[0] != null && var16.a[0].c.a != 102 && var16.a[0].c.a != 107) {
                     var13 = "" + var16.a[0].a();
                  } else {
                     var13 = "";
                  }

                  var15 = di.q;
                  di var22 = var15;
                  if (var16.A < 0) {
                     var22 = var15;
                     if (var16.b.b != 5) {
                        var22 = di.p;
                     }
                  }

                  String var23 = var13;
                  if (var16.a.length > 1) {
                     for(var2 = 1; var2 < 2; var13 = var23) {
                        var23 = var13;
                        if (var16.a[var2] != null) {
                           var23 = var13;
                           if (var16.a[var2].c.a != 102) {
                              var23 = var13;
                              if (var16.a[var2].c.a != 107) {
                                 var23 = var13 + "," + var16.a[var2].a();
                              }
                           }
                        }

                        ++var2;
                     }

                     var23 = var13;
                  }

                  var22.a(var1, var23, var9 + 5, var8 + 11, 0);
               }

               bl.b(var1, var16.b.f, var6 + 17, var7 + var5 / 2, 0, 3);
               if (var16.a != null) {
                  for(var2 = 0; var2 < var16.a.length; ++var2) {
                     this.a(var1, var16.a[var2].c.a, var6, var7, var5);
                  }

                  for(var2 = 0; var2 < var16.a.length; ++var2) {
                     a(var1, var16.a[var2].c.a, var16.a[var2].a, var6, var7, 34, var5);
                  }
               }

               if (var16.h > 1) {
                  di.n.a(var1, "" + var16.h, var6 + 34, var7 + var5 - di.n.a(), 1);
               }
            }
         }
      }

      this.f(var1);
   }

   private static int f(int var0) {
      switch(var0) {
      case 1:
         var0 = 2786816;
         break;
      case 2:
         var0 = 7078041;
         break;
      case 3:
         var0 = 12537346;
         break;
      case 4:
         var0 = 1269146;
         break;
      case 5:
         var0 = 13279744;
         break;
      case 6:
         var0 = 11599872;
         break;
      default:
         var0 = -1;
      }

      return var0;
   }

   private void f(en var1) {
      var1.a(-var1.a(), -var1.b());
      if (this.g > 24 && this.O > 0 || this.equals(main.a.G) && this.bJ == 2 && this.K[this.B] > 1) {
         var1.a(aa.R, 0, 0, 9, 6, 1, this.ae + this.ag - 12, this.af + 3, 0);
      }

      if (this.g < this.aI && this.O > 0 || this.equals(main.a.G) && this.bJ == 2 && this.K[this.B] > 1) {
         var1.a(aa.R, 0, 0, 9, 6, 0, this.ae + this.ag - 12, this.af + this.ah - 8, 0);
      }

   }

   private static byte g(int var0) {
      byte var1 = 0;
      if (var0 >= 0) {
         switch(var0) {
         case 0:
         case 1:
         case 2:
         case 3:
         case 4:
         case 5:
         case 6:
         case 7:
         case 8:
            break;
         case 9:
            var1 = 4;
            break;
         case 10:
            var1 = 1;
            break;
         case 11:
            var1 = 5;
            break;
         case 12:
            var1 = 3;
            break;
         case 13:
            var1 = 2;
            break;
         default:
            var1 = 6;
         }
      }

      return var1;
   }

   private void g(en var1) {
      var1.e(this.ae, this.af, this.ag, this.ah);
      var1.a(0, -this.g);

      for(int var2 = 0; var2 < G.length; ++var2) {
         int var5 = this.ae;
         int var4 = this.af + this.aD * var2;
         int var6 = this.ag;
         int var7 = this.aD;
         if (var4 - this.g <= this.af + this.ah && var4 - this.g >= this.af - this.aD) {
            int var3;
            if (var2 == this.ak) {
               var3 = 16383818;
            } else {
               var3 = 15196114;
            }

            var1.a(var3);
            var1.d(var5, var4, var6 - 1, var7 - 1);
            di var9 = di.f;
            String var8 = G[var2];
            var3 = this.ae;
            var9.a(var1, var8, this.ag / 2 + var3, var4 + 6, 2);
            if (G[var2].equals(aw.bR)) {
               for(var3 = 0; var3 < at.size(); ++var3) {
                  if (!((ba)at.elementAt(var3)).d) {
                     if (main.a.w % 20 > 10) {
                        var1.a(v, var5 + 10, var4 + 10, 3);
                     }
                     break;
                  }
               }
            }
         }
      }

      this.f(var1);
   }

   private static di h(int var0) {
      di var2 = di.k;
      di var1 = var2;
      switch(var0) {
      case -1:
         var1 = di.k;
         break;
      case 0:
         var1 = di.f;
         break;
      case 1:
         var1 = di.h;
         break;
      case 2:
         var1 = di.b;
         break;
      case 3:
         var1 = di.p;
         break;
      case 4:
         var1 = di.r;
         break;
      case 5:
         var1 = di.q;
      case 6:
         break;
      case 7:
         var1 = di.a;
         break;
      case 8:
         var1 = di.d;
         break;
      default:
         var1 = var2;
      }

      return var1;
   }

   private void h(en var1) {
      var1.e(this.ae, this.af, this.ag, this.ah);
      var1.a(0, -this.g);

      for(int var2 = 0; var2 < cF.length; ++var2) {
         int var3 = var2 * 15 + this.af;
         if (var3 - this.g <= this.af + this.ah && var3 - this.g >= this.af - this.aD) {
            di.f.a(var1, cF[var2], this.ae + 5, var3 + 6, 0);
         }
      }

      this.f(var1);
   }

   private int i(int var1) {
      int var3 = var1 / 20;
      byte var2;
      if (var1 % 20 > 0) {
         var2 = 1;
      } else {
         var2 = 0;
      }

      int var4 = var2 + var3;
      this.dn = (byte)var4;
      if (this.bO > var4 - 1) {
         this.bO = var4 - 1;
      }

      if (var1 % 20 > 0 && this.bO == var4 - 1) {
         var1 %= 20;
      } else {
         var1 = 20;
      }

      return var1 + 1;
   }

   private void i(en var1) {
      var1.e(this.ae, this.af, this.ag, this.ah);
      var1.a(0, -this.g);

      for(int var2 = 0; var2 < at.size(); ++var2) {
         ba var10 = (ba)at.elementAt(var2);
         int var4 = this.ae;
         int var5 = this.af + this.aD * var2;
         int var7 = this.ag;
         int var6 = this.aD;
         if (var5 - this.g <= this.af + this.ah && var5 - this.g >= this.af - this.aD) {
            int var3;
            if (var2 == this.ak) {
               var3 = 16383818;
            } else {
               var3 = 15196114;
            }

            var1.a(var3);
            var1.d(var4, var5, var7 - 1, var6 - 1);
            di var8 = di.f;
            String var9 = var10.a;
            var3 = this.ae;
            var8.a(var1, var9, this.ag / 2 + var3, var5 + 6, 2);
            if (!var10.d && main.a.w % 20 > 10) {
               var1.a(v, var4 + 10, var5 + 10, 3);
            }
         }
      }

      this.f(var1);
   }

   private void j(en var1) {
      var1.a(16711680);
      var1.e(this.ae, this.af, this.ag, this.ah);
      var1.a(0, -this.g);
      int var5 = af.e().ax.b.length;

      for(int var2 = 0; var2 < var5 + 6; ++var2) {
         int var7 = this.ae + 30;
         int var8 = this.af + this.aD * var2;
         int var6 = this.ag - 30;
         int var4 = this.aD;
         int var9 = this.ae;
         int var10 = this.af + this.aD * var2;
         if (var8 - this.g <= this.af + this.ah && var8 - this.g >= this.af - this.aD) {
            int var3;
            if (var2 == this.ak) {
               var3 = 16383818;
            } else {
               var3 = 15196114;
            }

            var1.a(var3);
            if (var2 == 5) {
               if (var2 == this.ak) {
                  var3 = 16776068;
               } else {
                  var3 = 16765060;
               }

               var1.a(var3);
            }

            var1.d(var7, var8, var6, var4 - 1);
            var1.a(p.au, var9, var10, 0);
            String var13;
            if (var2 == 0) {
               bl.b(var1, 567, var9 + 4, var10 + 4, 0, 0);
               var13 = aw.eW + " " + aw.ek + ": " + ai.a((long)af.e().cr);
               di.b.a(var1, var13, var7 + 5, var8 + 3, 0);
               di.m.a(var1, ai.a((long)(af.e().cr + 1000)) + " " + aw.fh + ": " + aw.eH + " " + af.e().cx, var7 + 5, var8 + 15, 0);
            }

            if (var2 == 1) {
               bl.b(var1, 569, var9 + 4, var10 + 4, 0, 0);
               var13 = aw.eX + " " + aw.ek + ": " + ai.a((long)af.e().cs);
               di.b.a(var1, var13, var7 + 5, var8 + 3, 0);
               di.m.a(var1, ai.a((long)(af.e().cs + 1000)) + " " + aw.fh + ": " + aw.eH + " " + af.e().cy, var7 + 5, var8 + 15, 0);
            }

            if (var2 == 2) {
               bl.b(var1, 568, var9 + 4, var10 + 4, 0, 0);
               var13 = aw.eY + " " + aw.ek + ": " + ai.a((long)af.e().cq);
               di.b.a(var1, var13, var7 + 5, var8 + 3, 0);
               di.m.a(var1, ai.a((long)(af.e().cq * 100)) + " " + aw.fh + ": " + aw.eH + " " + af.e().cz, var7 + 5, var8 + 15, 0);
            }

            if (var2 == 3) {
               bl.b(var1, 721, var9 + 4, var10 + 4, 0, 0);
               var13 = aw.eZ + " " + aw.ek + ": " + ai.a((long)af.e().ct);
               di.b.a(var1, var13, var7 + 5, var8 + 3, 0);
               di.m.a(var1, ai.a((long)(500000 + af.e().ct * 100000)) + " " + aw.fh + ": " + aw.eH + " " + af.e().cA, var7 + 5, var8 + 15, 0);
            }

            if (var2 == 4) {
               bl.b(var1, 719, var9 + 4, var10 + 4, 0, 0);
               var13 = aw.fb + " " + aw.ek + ": " + af.e().cu + "%";
               var4 = af.e().cu;
               var3 = var4;
               if (var4 > co.length - 1) {
                  var3 = co.length - 1;
               }

               long var11 = co[var3];
               di.b.a(var1, var13, var7 + 5, var8 + 3, 0);
               di.m.a(var1, ds.b(var11) + " " + aw.fh + ": " + aw.eH + " " + af.e().cB, var7 + 5, var8 + 15, 0);
            }

            if (var2 == 5) {
               if (p != null) {
                  bl.b(var1, q, var9 + 4, var10 + 4, 0, 0);
                  String[] var18 = di.k.a(p, 120);

                  for(var3 = 0; var3 < var18.length; ++var3) {
                     di.m.a(var1, var18[var3], var7 + 5, var3 * 12 + var8 + 3, 0);
                  }
               } else {
                  di.m.a(var1, "", var7 + 5, var8 + 9, 0);
               }
            }

            if (var2 >= 6) {
               et var15 = af.e().ax.b[var2 - 6];
               bl.b(var1, var15.f, var9 + 4, var10 + 4, 0, 0);
               bf var14 = af.e().a(var15);
               if (var14 != null) {
                  di.b.a(var1, var15.b, var7 + 5, var8 + 3, 0);
                  di.q.a(var1, aw.dn + ": " + var14.c, var7 + var6 - 5, var8 + 3, 1);
                  if (var14.c == var15.c) {
                     di.m.a(var1, aw.ff, var7 + 5, var8 + 15, 0);
                  } else if (var14.a.c()) {
                     var13 = aw.c + ": ";
                     var3 = di.m.a(var13) + var7 + 5;
                     var8 += 15;
                     di.m.a(var1, var13, var7 + 5, var8, 0);
                     di var19 = di.m;
                     StringBuffer var16 = new StringBuffer("(");
                     if (var14.m / 10 >= 100) {
                        var13 = "MAX";
                     } else if (var14.m % 10 == 0) {
                        var13 = var14.m / 10 + "%";
                     } else {
                        short var17 = var14.m;
                        var13 = var14.m / 10 + "." + var17 % 10 % 10 + "%";
                     }

                     var19.a(var1, var16.append(var13).append(")").toString(), var7 + var6 - 5, var8, 1);
                     var6 = var8 + 4;
                     var1.a(7169134);
                     var1.d(var3, var6, 50, 5);
                     var4 = var14.m * 50 / 1000;
                     var1.a(11992374);
                     var1.d(var3, var6, var4, 5);
                  } else {
                     bf var20 = var15.h[var14.c];
                     di.m.a(var1, aw.dn + " " + (var14.c + 1) + " " + aw.el + " " + ds.b(var20.d) + " " + aw.fh, var7 + 5, var8 + 15, 0);
                  }
               } else {
                  var14 = var15.h[0];
                  var13 = aw.em + " " + ds.b(var14.d) + " " + aw.eE;
                  if (var14.a.a == 24 || var14.a.a == 25 || var14.a.a == 26) {
                     var13 = aw.em + " " + ds.b(var14.d) + " " + aw.gn;
                  }

                  di.h.a(var1, var15.b, var7 + 5, var8 + 3, 0);
                  di.m.a(var1, var13, var7 + 5, var8 + 15, 0);
               }
            }
         }
      }

      this.f(var1);
   }

   private void k(en var1) {
      var1.a(16711680);
      var1.e(this.ae, this.af, this.ag, this.ah);
      var1.a(0, -this.g);

      for(int var2 = 0; var2 < this.E.length; ++var2) {
         int var5 = this.af + this.aD * var2;
         int var4 = this.aD;
         if (var5 - this.g <= this.af + this.ah && var5 - this.g >= this.af - this.aD) {
            int var3;
            if (var2 == this.ak) {
               var3 = 16383818;
            } else {
               var3 = 15196114;
            }

            var1.a(var3);
            var1.d(this.ae, var5, this.ag, var4 - 1);
            di.b.a(var1, this.E[var2], 5, var5 + 1, 0);
            di.o.a(var1, this.F[var2], 5, var5 + 11, 0);
         }
      }

      this.f(var1);
   }

   private void l(en var1) {
      var1.a(16711680);
      var1.e(this.ae, this.af, this.ag, this.ah);
      var1.a(0, -this.g);
      String[] var10 = c.b;
      String[] var9 = c.c;

      for(int var2 = 0; var2 < var9.length; ++var2) {
         int var7 = this.ae;
         int var6 = this.af + this.aD * var2;
         int var4 = this.ag;
         int var5 = this.aD;
         int var8 = this.ae;
         if (var6 - this.g <= this.af + this.ah && var6 - this.g >= this.af - this.aD) {
            int var3;
            if (var2 == this.ak) {
               var3 = 16383818;
            } else {
               var3 = 15196114;
            }

            var1.a(var3);
            var1.b(var7, var6, var4, var5 - 1);
            di.o.a(var1, var10[var2], var8 + 5, var6 + 6, 0);
            di.o.a(var1, var9[var2], var7 + var4 - 2, var6 + 6, 1);
         }
      }

      this.f(var1);
   }

   private void m(en var1) {
      var1.a(16711680);
      var1.e(this.ae, this.af, this.ag, this.ah);
      var1.a(0, -this.g);
      int[] var13 = p.j().S;
      int[] var12 = p.j().T;

      for(int var2 = 0; var2 < var12.length; ++var2) {
         int var8 = this.ae + 36;
         int var9 = this.af + this.aD * var2;
         int var4 = this.ag - 36;
         int var6 = this.aD;
         int var5 = this.ae;
         int var11 = this.af;
         int var7 = this.aD;
         int var10 = this.aD;
         if (var9 - this.g <= this.af + this.ah && var9 - this.g >= this.af - this.aD) {
            int var3;
            if (var2 == this.ak) {
               var3 = 16383818;
            } else {
               var3 = 15196114;
            }

            var1.a(var3);
            var1.b(var8, var9, var4, var6 - 1);
            var1.a(this.cp[var12[var2]]);
            var1.b(var5, var7 * var2 + var11, 34, var10 - 1);
            if (var13[var2] != -1) {
               if (var12[var2] != 1) {
                  di.n.a(var1, String.valueOf(var13[var2]), var5 + 17, var9 + 6, 2);
               } else {
                  di.o.a(var1, String.valueOf(var13[var2]), var5 + 17, var9 + 6, 2);
               }

               di.m.a(var1, p.j().U[var2] + "/" + p.j().V[var2], var8 + 5, var9 + 6, 0);
            }

            if (p.j().Y[var2] != null) {
               di.o.a(var1, p.j().Y[var2] + "(Top " + p.j().W[var2] + ")", var8 + var4 - 2, var9 + 1, 1);
               di.o.a(var1, p.j().Z[var2] + "(Top " + p.j().X[var2] + ")", var8 + var4 - 2, var9 + 11, 1);
            }
         }
      }

      this.f(var1);
   }

   private void n(en var1) {
      var1.e(this.ae, this.af, this.ag, this.ah);
      var1.a(0, -this.g);
      var1.a(0);
      if (this.O != 0) {
         int var3 = (this.g + this.ah) / 24 + 1;
         int var2 = var3;
         if (var3 < this.ah / 24 + 1) {
            var2 = this.ah / 24 + 1;
         }

         int var4;
         if (var2 > this.O) {
            var4 = this.O;
         } else {
            var4 = var2;
         }

         var3 = this.g / 24;
         var2 = var3;
         if (var3 >= var4) {
            var2 = var4 - 1;
         }

         var3 = var2;
         if (var2 < 0) {
            var3 = 0;
         }

         for(var2 = var3; var2 < var4; ++var2) {
            int var7 = this.ae;
            int var8 = this.af + this.aD * var2;
            int var9 = this.aD - 1;
            int var5 = this.ae + 24;
            int var6 = this.af + this.aD * var2;
            int var10 = this.ag;
            int var11 = this.aD;
            if (var2 == this.ak) {
               var3 = 16383818;
            } else {
               var3 = 15196114;
            }

            var1.a(var3);
            var1.b(var5, var6, var10 - 24, var11 - 1);
            if (var2 == this.ak) {
               var3 = 9541120;
            } else {
               var3 = 9993045;
            }

            var1.a(var3);
            var1.b(var7, var8, 24, var9);
            bl.b(var1, af.e().aL[this.B][var2], var7 + 12, var8 + var9 / 2, 0, 3);
            String[] var12 = di.o.a(af.e().aK[this.B][var2], 140);

            for(var3 = 0; var3 < var12.length; ++var3) {
               di.o.a(var1, var12[var3], var5 + 5, var3 * 11 + var6 + 1, 0);
            }
         }

         this.f(var1);
      }

   }

   private void o(en var1) {
      var1.a(16711680);
      var1.e(this.ae, this.af, this.ag, this.ah);
      var1.a(0, -this.g);

      label416: {
         byte var2;
         int var3;
         h[] var16;
         boolean var10001;
         label410: {
            label409: {
               try {
                  var16 = af.e().aG;
                  this.O = this.i(var16.length);
                  var3 = var16.length / 20;
                  if (var16.length % 20 > 0) {
                     break label409;
                  }
               } catch (Exception var57) {
                  var10001 = false;
                  break label416;
               }

               var2 = 0;
               break label410;
            }

            var2 = 1;
         }

         int var6 = var3 + var2;

         try {
            this.aF = this.ag / var6;
         } catch (Exception var56) {
            var10001 = false;
            break label416;
         }

         var3 = 0;

         label398:
         while(true) {
            int var58;
            try {
               var58 = this.O;
            } catch (Exception var32) {
               var10001 = false;
               break;
            }

            if (var3 >= var58) {
               break;
            }

            label395: {
               int var4;
               int var5;
               int var7;
               int var8;
               int var9;
               int var10;
               int var11;
               try {
                  var9 = this.ae + 36;
                  var7 = this.af + this.aD * var3;
                  var11 = this.ag;
                  var10 = this.aD;
                  var8 = this.ae;
                  var4 = this.af + this.aD * var3;
                  var5 = this.aD - 1;
                  if (var7 - this.g > this.af + this.ah || var7 - this.g < this.af - this.aD) {
                     break label395;
                  }
               } catch (Exception var55) {
                  var10001 = false;
                  break;
               }

               di var12;
               StringBuffer var13;
               if (var3 == 0) {
                  for(var4 = 0; var4 < var6; ++var4) {
                     byte var59;
                     label376: {
                        label375: {
                           label374: {
                              try {
                                 if (var4 == this.bO && this.ak == 0) {
                                    if (main.a.w % 10 < 7) {
                                       break label375;
                                    }
                                    break label374;
                                 }
                              } catch (Exception var53) {
                                 var10001 = false;
                                 break label398;
                              }

                              var59 = 0;
                              break label376;
                           }

                           var59 = 0;
                           break label376;
                        }

                        var59 = -1;
                     }

                     label384: {
                        label383: {
                           try {
                              if (var4 == this.bO) {
                                 break label383;
                              }
                           } catch (Exception var54) {
                              var10001 = false;
                              break label398;
                           }

                           var5 = 15723751;
                           break label384;
                        }

                        var5 = 16383818;
                     }

                     try {
                        var1.a(var5);
                        var1.d(this.ae + this.aF * var4, var7 + 9 + var59, this.aF - 1, 14);
                        var12 = di.o;
                        var13 = new StringBuffer();
                        var12.a(var1, var13.append(var4).toString(), this.ae + this.aF * var4 + this.aF / 2, this.af + 11 + var59, 2);
                     } catch (Exception var31) {
                        var10001 = false;
                        break label398;
                     }
                  }
               } else {
                  label360: {
                     label359: {
                        try {
                           if (var3 != this.ak) {
                              break label359;
                           }
                        } catch (Exception var52) {
                           var10001 = false;
                           break;
                        }

                        var58 = 16383818;
                        break label360;
                     }

                     var58 = 15196114;
                  }

                  label353: {
                     label352: {
                        try {
                           var1.a(var58);
                           var1.d(var9, var7, var11 - 36, var10 - 1);
                           if (var3 != this.ak) {
                              break label352;
                           }
                        } catch (Exception var51) {
                           var10001 = false;
                           break;
                        }

                        var58 = 9541120;
                        break label353;
                     }

                     var58 = 9993045;
                  }

                  h var17;
                  try {
                     var1.a(var58);
                     var17 = var16[c(var3, this.bO)];
                  } catch (Exception var30) {
                     var10001 = false;
                     break;
                  }

                  if (var17 != null) {
                     var58 = 0;

                     while(true) {
                        try {
                           if (var58 >= var17.a.length) {
                              break;
                           }
                        } catch (Exception var49) {
                           var10001 = false;
                           break label398;
                        }

                        try {
                           if (var17.a[var58].c.a == 72 && var17.a[var58].a > 0) {
                              byte var60 = g(var17.a[var58].a);
                              if (f(var60) != -1) {
                                 var10 = this.ak;
                                 var1.a(f(var60));
                              }
                           }
                        } catch (Exception var50) {
                           var10001 = false;
                           break label398;
                        }

                        ++var58;
                     }
                  }

                  try {
                     var1.b(var8, var4, 34, var5);
                  } catch (Exception var29) {
                     var10001 = false;
                     break;
                  }

                  if (var17 != null) {
                     String var15 = "";

                     di var63;
                     try {
                        var63 = di.m;
                     } catch (Exception var28) {
                        var10001 = false;
                        break;
                     }

                     di var14 = var63;
                     String var61 = var15;

                     String var65;
                     StringBuffer var62;
                     label423: {
                        try {
                           if (var17.a == null) {
                              break label423;
                           }
                        } catch (Exception var43) {
                           var10001 = false;
                           break;
                        }

                        var58 = 0;
                        var61 = var15;

                        while(true) {
                           try {
                              if (var58 >= var17.a.length) {
                                 break;
                              }
                           } catch (Exception var44) {
                              var10001 = false;
                              break label398;
                           }

                           var65 = var61;

                           try {
                              if (var17.a[var58].c.a == 72) {
                                 var62 = new StringBuffer(" [+");
                                 var65 = var62.append(var17.a[var58].a()).append("]").toString();
                              }
                           } catch (Exception var48) {
                              var10001 = false;
                              break label398;
                           }

                           var12 = var63;

                           label425: {
                              try {
                                 if (var17.a[var58].c.a != 41) {
                                    break label425;
                                 }

                                 if (var17.a[var58].a == 1) {
                                    var12 = h(0);
                                    break label425;
                                 }
                              } catch (Exception var47) {
                                 var10001 = false;
                                 break label398;
                              }

                              try {
                                 if (var17.a[var58].a == 2) {
                                    var12 = h(2);
                                    break label425;
                                 }
                              } catch (Exception var46) {
                                 var10001 = false;
                                 break label398;
                              }

                              try {
                                 if (var17.a[var58].a == 3) {
                                    var12 = h(8);
                                    break label425;
                                 }
                              } catch (Exception var45) {
                                 var10001 = false;
                                 break label398;
                              }

                              var12 = var63;

                              try {
                                 if (var17.a[var58].a == 4) {
                                    var12 = h(7);
                                 }
                              } catch (Exception var27) {
                                 var10001 = false;
                                 break label398;
                              }
                           }

                           ++var58;
                           var63 = var12;
                           var61 = var65;
                        }

                        var14 = var63;
                     }

                     try {
                        var13 = new StringBuffer(String.valueOf(var17.b.d));
                        var14.a(var1, var13.append(var61).toString(), var9 + 5, var7 + 1, 0);
                     } catch (Exception var26) {
                        var10001 = false;
                        break;
                     }

                     String var64 = "";

                     label427: {
                        try {
                           if (var17.a == null) {
                              break label427;
                           }
                        } catch (Exception var36) {
                           var10001 = false;
                           break;
                        }

                        var61 = var64;

                        label428: {
                           try {
                              if (var17.a.length <= 0) {
                                 break label428;
                              }
                           } catch (Exception var42) {
                              var10001 = false;
                              break;
                           }

                           var61 = var64;

                           try {
                              if (var17.a[0] != null) {
                                 var62 = new StringBuffer(String.valueOf(""));
                                 var61 = var62.append(var17.a[0].a()).toString();
                              }
                           } catch (Exception var25) {
                              var10001 = false;
                              break;
                           }
                        }

                        try {
                           var14 = di.q;
                        } catch (Exception var24) {
                           var10001 = false;
                           break;
                        }

                        var63 = var14;

                        label429: {
                           try {
                              if (var17.A >= 0) {
                                 break label429;
                              }
                           } catch (Exception var41) {
                              var10001 = false;
                              break;
                           }

                           var63 = var14;

                           try {
                              if (var17.b.b != 5) {
                                 var63 = di.p;
                              }
                           } catch (Exception var23) {
                              var10001 = false;
                              break;
                           }
                        }

                        var65 = var61;

                        label430: {
                           try {
                              if (var17.a.length <= 1) {
                                 break label430;
                              }
                           } catch (Exception var40) {
                              var10001 = false;
                              break;
                           }

                           var58 = 1;

                           while(true) {
                              try {
                                 if (var58 >= var17.a.length) {
                                    break;
                                 }
                              } catch (Exception var37) {
                                 var10001 = false;
                                 break label398;
                              }

                              var65 = var61;

                              label432: {
                                 try {
                                    if (var17.a[var58] == null) {
                                       break label432;
                                    }
                                 } catch (Exception var39) {
                                    var10001 = false;
                                    break label398;
                                 }

                                 var65 = var61;

                                 try {
                                    if (var17.a[var58].c.a == 102) {
                                       break label432;
                                    }
                                 } catch (Exception var38) {
                                    var10001 = false;
                                    break label398;
                                 }

                                 var65 = var61;

                                 try {
                                    if (var17.a[var58].c.a != 107) {
                                       StringBuffer var66 = new StringBuffer(String.valueOf(var61));
                                       var65 = var66.append(",").append(var17.a[var58].a()).toString();
                                    }
                                 } catch (Exception var22) {
                                    var10001 = false;
                                    break label398;
                                 }
                              }

                              ++var58;
                              var61 = var65;
                           }

                           var65 = var61;
                        }

                        try {
                           var63.a(var1, var65, var9 + 5, var7 + 11, 0);
                        } catch (Exception var21) {
                           var10001 = false;
                           break;
                        }
                     }

                     label433: {
                        try {
                           bl.b(var1, var17.b.f, var8 + 17, var4 + var5 / 2, 0, 3);
                           if (var17.a == null) {
                              break label433;
                           }
                        } catch (Exception var34) {
                           var10001 = false;
                           break;
                        }

                        var58 = 0;

                        while(true) {
                           try {
                              if (var58 >= var17.a.length) {
                                 break;
                              }
                           } catch (Exception var35) {
                              var10001 = false;
                              break label398;
                           }

                           try {
                              this.a(var1, var17.a[var58].c.a, var8, var4, var5);
                           } catch (Exception var20) {
                              var10001 = false;
                              break label398;
                           }

                           ++var58;
                        }

                        var58 = 0;

                        while(true) {
                           try {
                              if (var58 >= var17.a.length) {
                                 break;
                              }
                           } catch (Exception var33) {
                              var10001 = false;
                              break label398;
                           }

                           try {
                              a(var1, var17.a[var58].c.a, var17.a[var58].a, var8, var4, 34, var5);
                           } catch (Exception var19) {
                              var10001 = false;
                              break label398;
                           }

                           ++var58;
                        }
                     }

                     try {
                        if (var17.h > 1) {
                           var63 = di.n;
                           var62 = new StringBuffer();
                           var63.a(var1, var62.append(var17.h).toString(), var8 + 34, var4 + var5 - di.n.a(), 1);
                        }
                     } catch (Exception var18) {
                        var10001 = false;
                        break;
                     }
                  }
               }
            }

            ++var3;
         }
      }

      this.f(var1);
   }

   private void p(en var1) {
      var1.e(this.ae, this.af, this.ag, this.ah);
      var1.a(0, -this.g);
      var1.a(0);
      int var2;
      String var11;
      di var12;
      if (this.bG.size() == 0) {
         var12 = di.m;
         var11 = aw.af;
         var2 = this.ae;
         var12.a(var1, var11, this.ag / 2 + var2, this.af + this.ah / 2 - di.k.a() / 2 + 24, 2);
      }

      for(var2 = 0; var2 < this.O; ++var2) {
         int var5 = this.ae;
         int var8 = this.af + this.aD * var2;
         int var7 = this.aD;
         int var6 = this.ae + 24;
         int var4 = this.af + this.aD * var2;
         int var10 = this.ag;
         int var9 = this.aD - 1;
         if (var2 == 0) {
            var1.a(15196114);
            var1.b(var5, var4, this.ag, var9);
            Image var13;
            if (var2 == this.ak) {
               var13 = p.az;
            } else {
               var13 = p.ay;
            }

            var1.a(var13, this.ae + this.ag - 5, var4 + 2, cj.b);
            di var14;
            if (var2 == this.ak) {
               var14 = di.g;
            } else {
               var14 = di.f;
            }

            String var15;
            if (this.au) {
               var15 = aw.fv;
            } else {
               var15 = aw.fw;
            }

            var14.a(var1, var15, this.ae + this.ag - 22, var4 + 7, 2);
            var12 = di.o;
            if (this.au) {
               var11 = aw.fy;
            } else {
               var11 = aw.fz;
            }

            var12.a(var1, var11, this.ae + 5, var9 / 2 + var4 - 4, 0);
         } else {
            int var3;
            if (var2 == this.ak) {
               var3 = 16383818;
            } else {
               var3 = 15196114;
            }

            var1.a(var3);
            var1.b(var6, var4, var10 - 24, var9);
            if (var2 == this.ak) {
               var3 = 9541120;
            } else {
               var3 = 9993045;
            }

            var1.a(var3);
            var1.b(var5, var8, 24, var7 - 1);
            r var17 = (r)this.bG.elementAt(var2 - 1);
            if (var17.c.bT != -1) {
               bl.b(var1, var17.c.bT, var5, var8, 0, 0);
            } else {
               av var16 = p.x[var17.c.bU];
               bl.b(var1, var16.a[af.bC[0][0][0]].a, var5 + var16.a[af.bC[0][0][0]].b, var8 + var16.a[af.bC[0][0][0]].c, 0, 0);
            }

            var1.e(this.ae, this.af + this.g, this.ag, this.ah);
            di.g.a(var1, var17.c.ag, var6 + 5, var4, 0);
            if (!var17.d) {
               di.q.a(var1, ds.a(var17.a, "|", 0)[2], var6 + 5, var4 + 11, 0);
            } else {
               di.p.a(var1, ds.a(var17.a, "|", 0)[2], var6 + 5, var4 + 11, 0);
            }
         }
      }

      this.f(var1);
   }

   private void q(en var1) {
      var1.e(this.ae, this.af, this.ag, this.ah);
      var1.a(0, -this.g);
      var1.a(0);

      for(int var2 = 0; var2 < this.O; ++var2) {
         int var5 = this.ae + 26;
         int var7 = this.af + this.aD * var2;
         int var10 = this.ag;
         int var9 = this.aD;
         int var4 = this.ae;
         int var8 = this.af + this.aD * var2;
         int var6 = this.aD - 1;
         if (var7 - this.g <= this.af + this.ah && var7 - this.g >= this.af - this.aD) {
            int var3;
            if (var2 == this.ak) {
               var3 = 16383818;
            } else {
               var3 = 15196114;
            }

            var1.a(var3);
            var1.b(var5, var7, var10 - 26, var9 - 1);
            if (var2 == this.ak) {
               var3 = 9541120;
            } else {
               var3 = 9993045;
            }

            var1.a(var3);
            var1.b(var4, var8, 24, var6);
            h var13 = (h)this.Y.elementAt(var2);
            if (var13 != null) {
               di.m.a(var1, var13.b.d, var5 + 5, var7 + 1, 0);
               String var12 = "";
               if (var13.a != null && var13.a.length > 0) {
                  String var11 = var12;
                  if (var13.a[0] != null) {
                     var11 = var12;
                     if (var13.a[0].c.a != 102) {
                        var11 = var12;
                        if (var13.a[0].c.a != 107) {
                           var11 = "" + var13.a[0].a();
                        }
                     }
                  }

                  di.q.a(var1, var11, var5 + 5, var7 + 11, 0);
                  bl.b(var1, var13.b.f, var4 + 12, var8 + var6 / 2, 0, 3);
               }
            }
         }
      }

      this.f(var1);
   }

   private void r(en var1) {
      var1.e(this.ae, this.af, this.ag, this.ah);
      var1.a(0, -this.g);
      var1.a(0);
      int var2;
      if (this.O == 0) {
         di var12 = di.m;
         String var11 = aw.fD;
         var2 = this.ae;
         var12.a(var1, var11, this.ag / 2 + var2, this.af + this.ah / 2 - di.k.a() / 2, 2);
      } else {
         for(var2 = 0; var2 < this.O; ++var2) {
            int var7 = this.ae;
            int var5 = this.af + this.aD * var2;
            int var8 = this.aD;
            int var4 = this.ae + 24;
            int var6 = this.af + this.aD * var2;
            int var9 = this.ag;
            int var10 = this.aD;
            int var3;
            if (var2 == this.ak) {
               var3 = 16383818;
            } else {
               var3 = 15196114;
            }

            var1.a(var3);
            var1.b(var4, var6, var9 - 24, var10 - 1);
            if (var2 == this.ak) {
               var3 = 9541120;
            } else {
               var3 = 9993045;
            }

            var1.a(var3);
            var1.b(var7, var5, 24, var8 - 1);
            r var14 = (r)this.X.elementAt(var2);
            if (var14.c.bT != -1) {
               bl.b(var1, var14.c.bT, var7, var5, 0, 0);
            } else {
               av var13 = p.x[var14.c.bU];
               bl.b(var1, var13.a[af.bC[0][0][0]].a, var7 + var13.a[af.bC[0][0][0]].b, var5 + 3 + var13.a[af.bC[0][0][0]].c, 0, 0);
            }

            var1.e(this.ae, this.af + this.g, this.ag, this.ah);
            if (var14.e) {
               di.h.a(var1, var14.c.ag, var4 + 5, var6, 0);
               di.q.a(var1, var14.a, var4 + 5, var6 + 11, 0);
            } else {
               di.o.a(var1, var14.c.ag, var4 + 5, var6, 0);
               di.o.a(var1, var14.a, var4 + 5, var6 + 11, 0);
            }
         }

         this.f(var1);
      }

   }

   private void s(en var1) {
      var1.e(this.ae, this.af, this.ag, this.ah);
      var1.a(0, -this.g);
      var1.a(0);
      int var2;
      if (this.O == 0) {
         di var11 = di.m;
         String var12 = aw.bO;
         var2 = this.ae;
         var11.a(var1, var12, this.ag / 2 + var2, this.af + this.ah / 2 - di.k.a() / 2, 2);
      } else {
         for(var2 = 0; var2 < this.O; ++var2) {
            int var7 = this.ae;
            int var4 = this.af + this.aD * var2;
            int var8 = this.aD;
            int var5 = this.ae + 24;
            int var6 = this.af + this.aD * var2;
            int var10 = this.ag;
            int var9 = this.aD;
            int var3;
            if (var2 == this.ak) {
               var3 = 16383818;
            } else {
               var3 = 15196114;
            }

            var1.a(var3);
            var1.b(var5, var6, var10 - 24, var9 - 1);
            if (var2 == this.ak) {
               var3 = 9541120;
            } else {
               var3 = 9993045;
            }

            var1.a(var3);
            var1.b(var7, var4, 24, var8 - 1);
            r var14 = (r)this.T.elementAt(var2);
            if (var14.c.bT != -1) {
               bl.b(var1, var14.c.bT, var7, var4, 0, 0);
            } else {
               av var13 = p.x[var14.c.bU];
               bl.b(var1, var13.a[af.bC[0][0][0]].a, var7 + var13.a[af.bC[0][0][0]].b, var4 + 3 + var13.a[af.bC[0][0][0]].c, 0, 0);
            }

            var1.e(this.ae, this.af + this.g, this.ag, this.ah);
            if (var14.e) {
               di.h.a(var1, var14.c.ag, var5 + 5, var6, 0);
               di.q.a(var1, var14.a, var5 + 5, var6 + 11, 0);
            } else {
               di.o.a(var1, var14.c.ag, var5 + 5, var6, 0);
               di.o.a(var1, var14.a, var5 + 5, var6 + 11, 0);
            }
         }

         this.f(var1);
      }

   }

   private void t(en var1) {
      var1.e(this.ae, this.af, this.ag, this.ah);
      var1.a(0, -this.g);

      for(int var2 = 0; var2 < this.S.size(); ++var2) {
         int var7 = this.ae;
         int var4 = this.af + this.aD * var2;
         int var6 = this.ag;
         int var5 = this.aD;
         if (var4 - this.g <= this.af + this.ah && var4 - this.g >= this.af - this.aD) {
            de var8 = (de)this.S.elementAt(var2);
            int var3;
            if (var2 == this.ak) {
               var3 = 16383818;
            } else {
               var3 = 15196114;
            }

            var1.a(var3);
            var1.b(var7, var4, var6 - 1, var5 - 1);
            di var9;
            String var11;
            if (var8.p.equals("")) {
               var9 = di.f;
               var11 = var8.b;
               var3 = this.ae;
               var9.a(var1, var11, this.ag / 2 + var3, var4 + 6, 2);
            } else {
               var9 = di.f;
               String var10 = var8.b;
               var3 = this.ae;
               var9.a(var1, var10, this.ag / 2 + var3, var4 + 1, 2);
               var9 = di.f;
               var11 = var8.p;
               var3 = this.ae;
               var9.a(var1, var11, this.ag / 2 + var3, var4 + 11, 2);
            }
         }
      }

      this.f(var1);
   }

   private void u(en var1) {
      Exception var10000;
      label382: {
         int var2;
         int var3;
         int var5;
         String var12;
         boolean var10001;
         di var50;
         String var51;
         label383: {
            try {
               var1.e(this.ae, this.af, this.ag, this.ah);
               var1.a(-this.h, -this.g);
               var1.a(0);
               var5 = this.ae + this.ag / 2 - this.cg.length * this.aE / 2;
               if (this.O != 2) {
                  break label383;
               }

               di var13 = di.m;
               var12 = this.ao;
               var2 = this.ae;
               var13.a(var1, var12, this.ag / 2 + var2, this.af + 24 + this.ah / 2 - di.k.a() / 2, 2);
               if (!this.am || this.R.size() != 1) {
                  break label383;
               }
            } catch (Exception var48) {
               var10000 = var48;
               var10001 = false;
               break label382;
            }

            var2 = 0;

            while(true) {
               try {
                  if (var2 >= aw.dr.length) {
                     break;
                  }
               } catch (Exception var47) {
                  var10000 = var47;
                  var10001 = false;
                  break label382;
               }

               try {
                  var50 = di.f;
                  var51 = aw.dr[var2];
                  var3 = this.ae;
                  var50.a(var1, var51, this.ag / 2 + var3, var2 * 12 + (this.af + 24 + this.ah / 2 - aw.dr.length * 12 / 2), 2);
               } catch (Exception var46) {
                  var10000 = var46;
                  var10001 = false;
                  break label382;
               }

               ++var2;
            }
         }

         try {
            if (this.am) {
               this.O = cb.l.size() + 2;
            }
         } catch (Exception var45) {
            var10000 = var45;
            var10001 = false;
            break label382;
         }

         var2 = 0;

         label358:
         while(true) {
            try {
               if (var2 >= this.O) {
                  this.f(var1);
                  return;
               }
            } catch (Exception var24) {
               var10000 = var24;
               var10001 = false;
               break;
            }

            label355: {
               int var4;
               int var6;
               int var7;
               int var8;
               int var9;
               int var10;
               int var11;
               try {
                  var8 = this.ae;
                  var7 = this.af + this.aD * var2;
                  var10 = this.aD - 1;
                  var11 = this.ae + 24;
                  var6 = this.af + this.aD * var2;
                  var9 = this.ag - 24;
                  var4 = this.aD - 1;
                  if (var6 - this.g > this.af + this.ah || var6 - this.g < this.af - this.aD) {
                     break label355;
                  }
               } catch (Exception var44) {
                  var10000 = var44;
                  var10001 = false;
                  break;
               }

               if (var2 == 0) {
                  var3 = 0;

                  while(true) {
                     try {
                        if (var3 >= this.cg.length) {
                           break;
                        }
                     } catch (Exception var41) {
                        var10000 = var41;
                        var10001 = false;
                        break label358;
                     }

                     label337: {
                        label336: {
                           try {
                              if (var3 == this.bN && var2 == this.ak) {
                                 break label336;
                              }
                           } catch (Exception var42) {
                              var10000 = var42;
                              var10001 = false;
                              break label358;
                           }

                           var4 = 15723751;
                           break label337;
                        }

                        var4 = 16383818;
                     }

                     try {
                        var1.a(var4);
                        var1.b(this.aE * var3 + var5, var6, this.aE - 1, 23);
                     } catch (Exception var23) {
                        var10000 = var23;
                        var10001 = false;
                        break label358;
                     }

                     var4 = 0;

                     while(true) {
                        try {
                           if (var4 >= this.cg[var3].length) {
                              break;
                           }
                        } catch (Exception var43) {
                           var10000 = var43;
                           var10001 = false;
                           break label358;
                        }

                        try {
                           var50 = di.o;
                           var51 = this.cg[var3][var4];
                           var7 = this.aE;
                           var50.a(var1, var51, this.aE / 2 + var7 * var3 + var5, var4 * 11 + this.af, 2);
                        } catch (Exception var22) {
                           var10000 = var22;
                           var10001 = false;
                           break label358;
                        }

                        ++var4;
                     }

                     ++var3;
                  }
               } else if (var2 == 1) {
                  label262: {
                     label261: {
                        try {
                           if (var2 == this.ak) {
                              break label261;
                           }
                        } catch (Exception var35) {
                           var10000 = var35;
                           var10001 = false;
                           break;
                        }

                        var3 = 15196114;
                        break label262;
                     }

                     var3 = 16383818;
                  }

                  try {
                     var1.a(var3);
                     var1.b(this.ae, var6, this.ag, var4);
                     if (this.ch != null) {
                        var50 = di.f;
                        var51 = this.ch;
                        var3 = this.ae;
                        var50.a(var1, var51, this.ag / 2 + var3, var6 + 6, 2);
                     }
                  } catch (Exception var15) {
                     var10000 = var15;
                     var10001 = false;
                     break;
                  }
               } else {
                  label389: {
                     StringBuffer var53;
                     label390: {
                        label321: {
                           label320: {
                              try {
                                 if (!this.al) {
                                    break label390;
                                 }

                                 if (this.P == null || this.P.length == 0) {
                                    break label389;
                                 }

                                 if (var2 != this.ak) {
                                    break label320;
                                 }
                              } catch (Exception var40) {
                                 var10000 = var40;
                                 var10001 = false;
                                 break;
                              }

                              var3 = 16383818;
                              break label321;
                           }

                           var3 = 15196114;
                        }

                        label218: {
                           label217: {
                              try {
                                 var1.a(var3);
                                 var1.b(var11, var6, var9, var4);
                                 if (var2 != this.ak) {
                                    break label217;
                                 }
                              } catch (Exception var28) {
                                 var10000 = var28;
                                 var10001 = false;
                                 break;
                              }

                              var3 = 9541120;
                              break label218;
                           }

                           var3 = 9993045;
                        }

                        label392: {
                           try {
                              var1.a(var3);
                              var1.b(var8, var7, 24, var10);
                              if (ak.a(this.P[var2 - 2].b)) {
                                 if (ak.a((short)this.P[var2 - 2].b).c != null) {
                                    bl.a(var1, ak.a((short)this.P[var2 - 2].b).c[0], var8 + 12, var7 + var10 / 2, 0, cj.f);
                                 }
                                 break label392;
                              }
                           } catch (Exception var27) {
                              var10000 = var27;
                              var10001 = false;
                              break;
                           }

                           try {
                              ak var52 = new ak();
                              var52.a = this.P[var2 - 2].b;
                              if (!ak.a(var52.a)) {
                                 ak.a(var52);
                              }
                           } catch (Exception var26) {
                              var10000 = var26;
                              var10001 = false;
                              break;
                           }
                        }

                        label393: {
                           try {
                              if (this.P[var2 - 2].c.length() > 17) {
                                 var53 = new StringBuffer(String.valueOf(this.P[var2 - 2].c.substring(0, 17)));
                                 var12 = var53.append("...").toString();
                                 break label393;
                              }
                           } catch (Exception var25) {
                              var10000 = var25;
                              var10001 = false;
                              break;
                           }

                           try {
                              var12 = this.P[var2 - 2].c;
                           } catch (Exception var21) {
                              var10000 = var21;
                              var10001 = false;
                              break;
                           }
                        }

                        try {
                           di.g.a(var1, var12, var11 + 5, var6, 0);
                           di.q.a(var1, this.P[var2 - 2].d, var11 + 5, var6 + 11, 0);
                           var50 = di.m;
                           StringBuffer var54 = new StringBuffer(String.valueOf(this.P[var2 - 2].g));
                           var50.a(var1, var54.append("/").append(this.P[var2 - 2].h).toString(), var11 + var9 - 5, var6, 1);
                           break label389;
                        } catch (Exception var20) {
                           var10000 = var20;
                           var10001 = false;
                           break;
                        }
                     }

                     label394: {
                        label305: {
                           label304: {
                              try {
                                 if (!this.an) {
                                    break label305;
                                 }

                                 if (var2 != this.ak) {
                                    break label304;
                                 }
                              } catch (Exception var39) {
                                 var10000 = var39;
                                 var10001 = false;
                                 break;
                              }

                              var3 = 16383818;
                              break label394;
                           }

                           var3 = 15196114;
                           break label394;
                        }

                        cb var58;
                        label294: {
                           label293: {
                              try {
                                 if (!this.am || cb.l.size() == 0) {
                                    break label389;
                                 }

                                 var58 = (cb)cb.l.elementAt(var2 - 2);
                                 if (var2 != this.ak || var58.k != null) {
                                    break label293;
                                 }
                              } catch (Exception var38) {
                                 var10000 = var38;
                                 var10001 = false;
                                 break;
                              }

                              var3 = 16383818;
                              break label294;
                           }

                           var3 = 15196114;
                        }

                        try {
                           var1.a(var3);
                           var1.b(var8, var7, var9 + 24, var4);
                           var58.a(var1, var8, var7);
                           if (var58.k == null) {
                              break label389;
                           }

                           var7 = this.ae + this.ag - 2 - var58.k.length * 40;
                        } catch (Exception var37) {
                           var10000 = var37;
                           var10001 = false;
                           break;
                        }

                        var3 = 0;

                        while(true) {
                           label273: {
                              try {
                                 if (var3 >= var58.k.length) {
                                    break label389;
                                 }

                                 if (var3 == this.bN && var2 == this.ak) {
                                    var1.a(p.az, var3 * 40 + var7 + 20, var4 / 2 + var6, cj.f);
                                    di.g.a(var1, var58.k[var3], var3 * 40 + var7 + 20, var6 + 6, 2);
                                    break label273;
                                 }
                              } catch (Exception var36) {
                                 var10000 = var36;
                                 var10001 = false;
                                 break label358;
                              }

                              try {
                                 var1.a(p.ay, var3 * 40 + var7 + 20, var4 / 2 + var6, cj.f);
                                 di.f.a(var1, var58.k[var3], var3 * 40 + var7 + 20, var6 + 6, 2);
                              } catch (Exception var16) {
                                 var10000 = var16;
                                 var10001 = false;
                                 break label358;
                              }
                           }

                           ++var3;
                        }
                     }

                     label255: {
                        label254: {
                           try {
                              var1.a(var3);
                              var1.b(var11, var6, var9, var4);
                              if (var2 != this.ak) {
                                 break label254;
                              }
                           } catch (Exception var34) {
                              var10000 = var34;
                              var10001 = false;
                              break;
                           }

                           var3 = 9541120;
                           break label255;
                        }

                        var3 = 9993045;
                     }

                     e var56;
                     label397: {
                        try {
                           var1.a(var3);
                           var1.b(var8, var7, 24, var10);
                           if (this.Q != null) {
                              var56 = (e)this.Q.elementAt(var2 - 2);
                              break label397;
                           }
                        } catch (Exception var33) {
                           var10000 = var33;
                           var10001 = false;
                           break;
                        }

                        try {
                           var56 = (e)this.R.elementAt(var2 - 2);
                        } catch (Exception var19) {
                           var10000 = var19;
                           var10001 = false;
                           break;
                        }
                     }

                     label398: {
                        try {
                           if (var56.c != -1) {
                              bl.b(var1, var56.c, var8, var7, 0, 0);
                              break label398;
                           }
                        } catch (Exception var32) {
                           var10000 = var32;
                           var10001 = false;
                           break;
                        }

                        try {
                           av var57 = p.x[var56.b];
                           bl.b(var1, var57.a[af.bC[0][0][0]].a, var8 + var57.a[af.bC[0][0][0]].b, var7 + 3 + var57.a[af.bC[0][0][0]].c, 0, 0);
                        } catch (Exception var18) {
                           var10000 = var18;
                           var10001 = false;
                           break;
                        }
                     }

                     label400: {
                        try {
                           var1.e(this.ae, this.af + this.g, this.ag, this.ah);
                           var50 = di.f;
                           if (var56.g == 0) {
                              var50 = di.a;
                              break label400;
                           }
                        } catch (Exception var30) {
                           var10000 = var30;
                           var10001 = false;
                           break;
                        }

                        try {
                           if (var56.g == 1) {
                              var50 = di.h;
                              break label400;
                           }
                        } catch (Exception var31) {
                           var10000 = var31;
                           var10001 = false;
                           break;
                        }

                        try {
                           if (var56.g == 2) {
                              var50 = di.g;
                           }
                        } catch (Exception var29) {
                           var10000 = var29;
                           var10001 = false;
                           break;
                        }
                     }

                     try {
                        var50.a(var1, var56.f, var11 + 5, var6, 0);
                        var50 = di.q;
                        StringBuffer var14 = new StringBuffer(String.valueOf(aw.cZ));
                        var50.a(var1, var14.append(": ").append(var56.h).toString(), var11 + 5, var6 + 11, 0);
                        bl.b(var1, 7223, var11 + var9 - 7, var6 + 12, 0, 3);
                        di var55 = di.m;
                        var53 = new StringBuffer();
                        var55.a(var1, var53.append(var56.l).toString(), var11 + var9 - 15, var6 + 6, 1);
                     } catch (Exception var17) {
                        var10000 = var17;
                        var10001 = false;
                        break;
                     }
                  }
               }
            }

            ++var2;
         }
      }

      Exception var49 = var10000;
      var49.printStackTrace();
   }

   private void v(en var1) {
      var1.e(this.ae, this.af, this.ag, this.ah);
      var1.a(0, -this.g);
      var1.a(0);
      int var2;
      if (this.O == 0) {
         di var8 = di.m;
         String var9 = aw.fq;
         var2 = this.ae;
         var8.a(var1, var9, this.ag / 2 + var2, this.af + this.ah / 2 - di.k.a() / 2, 2);
      } else if (af.e().aE != null && af.e().aE.length == this.O) {
         for(var2 = 0; var2 < this.O; ++var2) {
            int var4 = this.ae;
            int var5 = this.af + this.aD * var2;
            int var6 = this.ag;
            int var7 = this.aD - 1;
            ao var10 = af.e().aE[var2];
            int var3;
            if (var2 == this.ak && (!var10.e && !var10.d || var10.e && var10.d)) {
               var3 = 16383818;
            } else {
               var3 = 15196114;
            }

            var1.a(var3);
            var1.b(var4, var5, var6, var7);
            if (var10 != null) {
               if (!var10.d) {
                  di.k.a(var1, var10.a, var4 + 5, var5, 0);
                  di.r.a(var1, var10.c + " " + aw.bE, var4 + var6 - 5, var5, 1);
                  di.p.a(var1, var10.b, var4 + 5, var5 + 11, 0);
               } else if (var10.d && !var10.e) {
                  di.k.a(var1, var10.a, var4 + 5, var5, 0);
                  di.q.a(var1, aw.fr + var10.c + " " + aw.bE, var4 + 5, var5 + 11, 0);
                  if (var2 == this.ak) {
                     di.g.a(var1, aw.cn, var4 + var6 - 20, var5 + 6, 2);
                     di.f.a(var1, aw.cn, var4 + var6 - 20, var5 + 6, 2);
                  } else {
                     var1.a(p.ay, var4 + var6 - 20, var7 / 2 + var5, cj.f);
                     di.f.a(var1, aw.cn, var4 + var6 - 20, var5 + 6, 2);
                  }
               } else if (var10.d && var10.e) {
                  di.r.a(var1, var10.a, var4 + 5, var5, 0);
                  di.r.a(var1, var10.b, var4 + 5, var5 + 11, 0);
               }
            }
         }

         this.f(var1);
      }

   }

   private void w(en var1) {
      var1.a(16711680);
      var1.e(this.ae, this.af, this.ag, this.ah);
      var1.a(0, -this.g);
      int var2;
      int var3;
      String var11;
      di var12;
      if (this.k.size() == 0) {
         if (this.ap != null) {
            for(var2 = 0; var2 < this.ap.length; ++var2) {
               var12 = di.f;
               var11 = this.ap[var2];
               var3 = this.ae;
               var12.a(var1, var11, this.ag / 2 + var3, this.af + this.ah / 2 - this.ap.length * 14 / 2 + var2 * 14 + 5, 2);
            }
         }
      } else {
         for(var2 = 0; var2 < this.k.size() + 1; ++var2) {
            int var8 = this.ae + 36;
            int var7 = this.af + this.aD * var2;
            int var10 = this.ag;
            int var9 = this.aD - 1;
            int var4 = this.ae;
            int var5 = this.af + this.aD * var2;
            int var6 = this.aD - 1;
            if (var7 - this.g <= this.af + this.ah && var7 - this.g >= this.af - this.aD) {
               di var17;
               String var18;
               if (var2 == this.k.size()) {
                  if (this.k.size() > 0) {
                     if (!main.a.e && var2 == this.ak) {
                        var1.a(16383818);
                        var1.b(var4, var7, this.ag, var9 + 2);
                     }

                     if ((var2 != this.ak || this.cc != 1) && (main.a.e || var2 != this.ak)) {
                        var1.a(p.aw, this.ae + this.ag / 2, var9 / 2 + var7 + 1, cj.f);
                        var17 = di.f;
                        var18 = aw.cx;
                        var3 = this.ae;
                        var17.a(var1, var18, this.ag / 2 + var3, var9 / 2 + var7 - 4, 2);
                     } else {
                        var1.a(p.ax, this.ae + this.ag / 2, var9 / 2 + var7 + 1, cj.f);
                        var17 = di.g;
                        var18 = aw.cx;
                        var3 = this.ae;
                        var17.a(var1, var18, this.ag / 2 + var3, var9 / 2 + var7 - 4, 2);
                     }
                  }
               } else {
                  if (var2 == this.ak) {
                     var3 = 16383818;
                  } else {
                     var3 = 15196114;
                  }

                  var1.a(var3);
                  var1.b(var8, var7, var10 - 36, var9);
                  if (var2 == this.ak) {
                     var3 = 9541120;
                  } else {
                     var3 = 9993045;
                  }

                  var1.a(var3);
                  h var15 = (h)this.k.elementAt(var2);
                  if (var15 != null) {
                     for(var3 = 0; var3 < var15.a.length; ++var3) {
                        if (var15.a[var3].c.a == 72 && var15.a[var3].a > 0) {
                           byte var16 = g(var15.a[var3].a);
                           if (f(var16) != -1) {
                              var9 = this.ak;
                              var1.a(f(var16));
                           }
                        }
                     }
                  }

                  var1.b(var4, var5, 34, var6);
                  if (var15 != null) {
                     var18 = "";
                     di var14 = di.m;
                     var11 = var18;
                     di var13 = var14;
                     if (var15.a != null) {
                        var3 = 0;

                        for(var13 = var14; var3 < var15.a.length; var13 = var17) {
                           if (var15.a[var3].c.a == 72) {
                              var18 = " [+" + var15.a[var3].a + "]";
                           }

                           var17 = var13;
                           if (var15.a[var3].c.a == 41) {
                              if (var15.a[var3].a == 1) {
                                 var17 = h(0);
                              } else if (var15.a[var3].a == 2) {
                                 var17 = h(2);
                              } else if (var15.a[var3].a == 3) {
                                 var17 = h(8);
                              } else {
                                 var17 = var13;
                                 if (var15.a[var3].a == 4) {
                                    var17 = h(7);
                                 }
                              }
                           }

                           ++var3;
                        }

                        var11 = var18;
                     }

                     var13.a(var1, var15.b.d + var11, var8 + 5, var7 + 1, 0);
                     if (var15.a != null) {
                        if (var15.a.length > 0 && var15.a[0] != null && var15.a[0].c.a != 102 && var15.a[0].c.a != 107) {
                           var11 = "" + var15.a[0].a();
                        } else {
                           var11 = "";
                        }

                        var13 = di.q;
                        var12 = var13;
                        if (var15.A < 0) {
                           var12 = var13;
                           if (var15.b.b != 5) {
                              var12 = di.p;
                           }
                        }

                        String var19 = var11;
                        if (var15.a.length > 1) {
                           for(var3 = 1; var3 < var15.a.length; var11 = var19) {
                              var19 = var11;
                              if (var15.a[var3] != null) {
                                 var19 = var11;
                                 if (var15.a[var3].c.a != 102) {
                                    var19 = var11;
                                    if (var15.a[var3].c.a != 107) {
                                       var19 = var11 + "," + var15.a[var3].a();
                                    }
                                 }
                              }

                              ++var3;
                           }

                           var19 = var11;
                        }

                        var12.a(var1, var19, var8 + 5, var7 + 11, 0);
                     }

                     bl.b(var1, var15.b.f, var4 + 17, var5 + var6 / 2, 0, 3);
                     if (var15.a != null) {
                        for(var3 = 0; var3 < var15.a.length; ++var3) {
                           this.a(var1, var15.a[var3].c.a, var4, var5, var6);
                        }

                        for(var3 = 0; var3 < var15.a.length; ++var3) {
                           a(var1, var15.a[var3].c.a, var15.a[var3].a, var4, var5, 34, var6);
                        }
                     }

                     if (var15.h > 1) {
                        di.n.a(var1, "" + var15.h, var4 + 34, var5 + var6 - di.n.a(), 1);
                     }
                  }
               }
            }
         }

         this.f(var1);
      }

   }

   private void x(en var1) {
      var1.a(16711680);
      h[] var20 = af.e().aH;
      h[] var19 = af.e().aF;
      this.O = this.i(var20.length + var19.length);
      int var3 = (var20.length + var19.length) / 20;
      byte var2;
      if ((var20.length + var19.length) % 20 > 0) {
         var2 = 1;
      } else {
         var2 = 0;
      }

      int var5 = var3 + var2;
      this.aF = this.ag / var5;

      int var4;
      for(var3 = 0; var3 < var5; ++var3) {
         byte var58;
         if (var3 == this.bO && this.ak == 0) {
            if (main.a.w % 10 < 7) {
               var58 = -1;
            } else {
               var58 = 0;
            }
         } else {
            var58 = 0;
         }

         if (var3 == this.bO) {
            var4 = 16383818;
         } else {
            var4 = 15723751;
         }

         var1.a(var4);
         var1.d(this.ae + this.aF * var3, var58 + 89 - 10, this.aF - 1, 21);
         if (var3 == this.bO) {
            var1.a(13524492);
            var1.d(this.ae + this.aF * var3, var58 + 89 - 10 + 21 - 3, this.aF - 1, 3);
         }

         di.o.a(var1, "" + (var3 + 1), this.ae + this.aF * var3 + this.aF / 2, var58 + 91 - 10, 2);
      }

      var1.e(this.ae, this.af + 21, this.ag, this.ah - 21);
      var1.a(0, -this.g);
      var3 = 1;

      label421:
      while(true) {
         label454: {
            boolean var10001;
            int var59;
            try {
               var59 = this.O;
            } catch (Exception var57) {
               var10001 = false;
               break;
            }

            if (var3 >= var59) {
               break;
            }

            int var6;
            int var7;
            int var8;
            int var9;
            int var10;
            int var11;
            int var12;
            boolean var13;
            label413: {
               label412: {
                  try {
                     var7 = this.ae + 36;
                     var8 = this.af + this.aD * var3;
                     var11 = this.ag;
                     var12 = this.aD;
                     var6 = this.ae;
                     var4 = this.af + this.aD * var3;
                     var5 = this.aD - 1;
                     if (var8 - this.g > this.af + this.ah || var8 - this.g < this.af - this.aD) {
                        break label454;
                     }

                     var13 = a(var3, this.bO, af.e().aH);
                     var10 = c(var3, this.bO);
                     var9 = b(var3, this.bO, af.e().aH);
                     if (var3 != this.ak) {
                        break label412;
                     }
                  } catch (Exception var56) {
                     var10001 = false;
                     break;
                  }

                  var59 = 16383818;
                  break label413;
               }

               if (var13) {
                  var59 = 15196114;
               } else {
                  var59 = 15723751;
               }
            }

            label404: {
               label403: {
                  try {
                     var1.a(var59);
                     var1.b(var7, var8, var11 - 36, var12 - 1);
                     if (var3 != this.ak) {
                        break label403;
                     }
                  } catch (Exception var55) {
                     var10001 = false;
                     break;
                  }

                  var59 = 9541120;
                  break label404;
               }

               if (var13) {
                  var59 = 9993045;
               } else {
                  var59 = 11837316;
               }
            }

            try {
               var1.a(var59);
            } catch (Exception var54) {
               var10001 = false;
               break;
            }

            h var16;
            if (var13) {
               var16 = var20[var10];
            } else {
               var16 = var19[var9];
            }

            if (var16 != null) {
               var59 = 0;

               while(true) {
                  try {
                     if (var59 >= var16.a.length) {
                        break;
                     }
                  } catch (Exception var52) {
                     var10001 = false;
                     break label421;
                  }

                  try {
                     if (var16.a[var59].c.a == 72 && var16.a[var59].a > 0) {
                        byte var60 = g(var16.a[var59].a);
                        if (f(var60) != -1) {
                           var9 = this.ak;
                           var1.a(f(var60));
                        }
                     }
                  } catch (Exception var53) {
                     var10001 = false;
                     break label421;
                  }

                  ++var59;
               }
            }

            try {
               var1.b(var6, var4, 34, var5);
            } catch (Exception var51) {
               var10001 = false;
               break;
            }

            if (var16 != null) {
               label374: {
                  label373: {
                     label372: {
                        try {
                           if (!var16.f || main.a.G.A != 12) {
                              break label374;
                           }

                           if (var3 == this.ak) {
                              break label372;
                           }
                        } catch (Exception var50) {
                           var10001 = false;
                           break;
                        }

                        var59 = 6047789;
                        break label373;
                     }

                     var59 = 7040779;
                  }

                  try {
                     var1.a(var59);
                     var1.b(var6, var4, 34, var5);
                  } catch (Exception var49) {
                     var10001 = false;
                     break;
                  }
               }
            }

            if (var16 != null) {
               String var18 = "";

               di var15;
               try {
                  var15 = di.m;
               } catch (Exception var48) {
                  var10001 = false;
                  break;
               }

               di var17 = var15;
               String var14 = var18;

               String var65;
               StringBuffer var61;
               di var62;
               label440: {
                  try {
                     if (var16.a == null) {
                        break label440;
                     }
                  } catch (Exception var47) {
                     var10001 = false;
                     break;
                  }

                  var59 = 0;
                  var14 = var18;

                  while(true) {
                     try {
                        if (var59 >= var16.a.length) {
                           break;
                        }
                     } catch (Exception var42) {
                        var10001 = false;
                        break label421;
                     }

                     var65 = var14;

                     try {
                        if (var16.a[var59].c.a == 72) {
                           var61 = new StringBuffer(" [+");
                           var65 = var61.append(var16.a[var59].a).append("]").toString();
                        }
                     } catch (Exception var43) {
                        var10001 = false;
                        break label421;
                     }

                     var62 = var15;

                     label442: {
                        try {
                           if (var16.a[var59].c.a != 41) {
                              break label442;
                           }

                           if (var16.a[var59].a == 1) {
                              var62 = h(0);
                              break label442;
                           }
                        } catch (Exception var46) {
                           var10001 = false;
                           break label421;
                        }

                        try {
                           if (var16.a[var59].a == 2) {
                              var62 = h(2);
                              break label442;
                           }
                        } catch (Exception var44) {
                           var10001 = false;
                           break label421;
                        }

                        try {
                           if (var16.a[var59].a == 3) {
                              var62 = h(8);
                              break label442;
                           }
                        } catch (Exception var45) {
                           var10001 = false;
                           break label421;
                        }

                        var62 = var15;

                        try {
                           if (var16.a[var59].a == 4) {
                              var62 = h(7);
                           }
                        } catch (Exception var41) {
                           var10001 = false;
                           break label421;
                        }
                     }

                     ++var59;
                     var15 = var62;
                     var14 = var65;
                  }

                  var17 = var15;
               }

               StringBuffer var63;
               try {
                  var63 = new StringBuffer(String.valueOf(var16.b.d));
                  var17.a(var1, var63.append(var14).toString(), var7 + 5, var8 + 1, 0);
               } catch (Exception var40) {
                  var10001 = false;
                  break;
               }

               String var64 = "";

               label444: {
                  try {
                     if (var16.a == null) {
                        break label444;
                     }
                  } catch (Exception var39) {
                     var10001 = false;
                     break;
                  }

                  var14 = var64;

                  label445: {
                     try {
                        if (var16.a.length <= 0) {
                           break label445;
                        }
                     } catch (Exception var38) {
                        var10001 = false;
                        break;
                     }

                     var14 = var64;

                     try {
                        if (var16.a[0] == null) {
                           break label445;
                        }
                     } catch (Exception var37) {
                        var10001 = false;
                        break;
                     }

                     var14 = var64;

                     try {
                        if (var16.a[0].c.a == 102) {
                           break label445;
                        }
                     } catch (Exception var36) {
                        var10001 = false;
                        break;
                     }

                     var14 = var64;

                     try {
                        if (var16.a[0].c.a != 107) {
                           var61 = new StringBuffer(String.valueOf(""));
                           var14 = var61.append(var16.a[0].a()).toString();
                        }
                     } catch (Exception var31) {
                        var10001 = false;
                        break;
                     }
                  }

                  try {
                     var17 = di.q;
                  } catch (Exception var30) {
                     var10001 = false;
                     break;
                  }

                  var15 = var17;

                  label446: {
                     try {
                        if (var16.A >= 0) {
                           break label446;
                        }
                     } catch (Exception var35) {
                        var10001 = false;
                        break;
                     }

                     var15 = var17;

                     try {
                        if (var16.b.b != 5) {
                           var15 = di.p;
                        }
                     } catch (Exception var29) {
                        var10001 = false;
                        break;
                     }
                  }

                  var65 = var14;

                  label447: {
                     try {
                        if (var16.a.length <= 1) {
                           break label447;
                        }
                     } catch (Exception var32) {
                        var10001 = false;
                        break;
                     }

                     for(var59 = 1; var59 < 2; var14 = var65) {
                        var65 = var14;

                        label449: {
                           try {
                              if (var16.a[var59] == null) {
                                 break label449;
                              }
                           } catch (Exception var34) {
                              var10001 = false;
                              break label421;
                           }

                           var65 = var14;

                           try {
                              if (var16.a[var59].c.a == 102) {
                                 break label449;
                              }
                           } catch (Exception var33) {
                              var10001 = false;
                              break label421;
                           }

                           var65 = var14;

                           try {
                              if (var16.a[var59].c.a != 107) {
                                 StringBuffer var66 = new StringBuffer(String.valueOf(var14));
                                 var65 = var66.append(",").append(var16.a[var59].a()).toString();
                              }
                           } catch (Exception var28) {
                              var10001 = false;
                              break label421;
                           }
                        }

                        ++var59;
                     }

                     var65 = var14;
                  }

                  try {
                     var15.a(var1, var65, var7 + 5, var8 + 11, 0);
                  } catch (Exception var27) {
                     var10001 = false;
                     break;
                  }
               }

               label450: {
                  try {
                     bl.b(var1, var16.b.f, var6 + 17, var4 + var5 / 2, 0, 3);
                     if (var16.a == null) {
                        break label450;
                     }
                  } catch (Exception var26) {
                     var10001 = false;
                     break;
                  }

                  var59 = 0;

                  while(true) {
                     try {
                        if (var59 >= var16.a.length) {
                           break;
                        }
                     } catch (Exception var25) {
                        var10001 = false;
                        break label421;
                     }

                     try {
                        this.a(var1, var16.a[var59].c.a, var6, var4, var5);
                     } catch (Exception var23) {
                        var10001 = false;
                        break label421;
                     }

                     ++var59;
                  }

                  var59 = 0;

                  while(true) {
                     try {
                        if (var59 >= var16.a.length) {
                           break;
                        }
                     } catch (Exception var24) {
                        var10001 = false;
                        break label421;
                     }

                     try {
                        a(var1, var16.a[var59].c.a, var16.a[var59].a, var6, var4, 34, var5);
                     } catch (Exception var22) {
                        var10001 = false;
                        break label421;
                     }

                     ++var59;
                  }
               }

               try {
                  if (var16.h > 1) {
                     var62 = di.n;
                     var63 = new StringBuffer();
                     var62.a(var1, var63.append(var16.h).toString(), var6 + 34, var4 + var5 - di.n.a(), 1);
                  }
               } catch (Exception var21) {
                  var10001 = false;
                  break;
               }
            }
         }

         ++var3;
      }

      this.f(var1);
   }

   private void y(en var1) {
      int var2;
      di var7;
      String var8;
      if (this.A != 23 && this.A != 24) {
         String var10;
         di var11;
         if (this.A == 20) {
            var1.a(13524492);
            var1.d(this.b + 1, 78, this.d - 2, 1);
            var11 = di.f;
            var10 = aw.ap;
            var2 = this.ae;
            var11.a(var1, var10, this.ag / 2 + var2, 59, 2);
         } else if (this.A == 22) {
            var1.a(13524492);
            var1.d(this.b + 1, 78, this.d - 2, 1);
            var11 = di.f;
            var10 = aw.o;
            var2 = this.ae;
            var11.a(var1, var10, this.ag / 2 + var2, 59, 2);
         } else if (this.A == 19) {
            var1.a(13524492);
            var1.d(this.b + 1, 78, this.d - 2, 1);
            var7 = di.f;
            var8 = aw.bT;
            var2 = this.ae;
            var7.a(var1, var8, this.ag / 2 + var2, 59, 2);
         } else if (this.A == 18) {
            var1.a(13524492);
            var1.d(this.b + 1, 78, this.d - 2, 1);
            var11 = di.f;
            var10 = aw.bQ;
            var2 = this.ae;
            var11.a(var1, var10, this.ag / 2 + var2, 59, 2);
         } else if (this.A == 13 && this.equals(main.a.H)) {
            var1.a(13524492);
            var1.d(this.b + 1, 78, this.d - 2, 1);
            var11 = di.f;
            var10 = aw.cm;
            var2 = this.ae;
            var11.a(var1, var10, this.ag / 2 + var2, 59, 2);
         } else if (this.A == 12 && main.a.H != null) {
            var1.a(13524492);
            var1.d(this.b + 1, 78, this.d - 2, 1);
            var7 = di.f;
            var8 = aw.cx;
            var2 = this.ae;
            var7.a(var1, var8, this.ag / 2 + var2, 59, 2);
         } else if (this.A == 11) {
            var1.a(13524492);
            var1.d(this.b + 1, 78, this.d - 2, 1);
            var7 = di.f;
            var8 = aw.bM;
            var2 = this.ae;
            var7.a(var1, var8, this.ag / 2 + var2, 59, 2);
         } else if (this.A == 16) {
            var1.a(13524492);
            var1.d(this.b + 1, 78, this.d - 2, 1);
            var7 = di.f;
            var8 = aw.bN;
            var2 = this.ae;
            var7.a(var1, var8, this.ag / 2 + var2, 59, 2);
         } else if (this.A == 15) {
            var1.a(13524492);
            var1.d(this.b + 1, 78, this.d - 2, 1);
            var11 = di.f;
            var10 = this.n;
            var2 = this.ae;
            var11.a(var1, var10, this.ag / 2 + var2, 59, 2);
         } else if (this.A == 2 && main.a.H != null) {
            var1.a(13524492);
            var1.d(this.b + 1, 78, this.d - 2, 1);
            var7 = di.f;
            var8 = aw.cc;
            var2 = this.ae;
            var7.a(var1, var8, this.ag / 2 + var2, 59, 2);
         } else if (this.A == 9) {
            var1.a(13524492);
            var1.d(this.b + 1, 78, this.d - 2, 1);
            var7 = di.f;
            var8 = aw.fs;
            var2 = this.ae;
            var7.a(var1, var8, this.ag / 2 + var2, 59, 2);
         } else if (this.A == 3) {
            var1.a(13524492);
            var1.d(this.b + 1, 78, this.d - 2, 1);
            var7 = di.f;
            var8 = aw.aG;
            var2 = this.C;
            var7.a(var1, var8, this.aE / 2 + var2, 59, 2);
         } else if (this.A == 26) {
            var1.a(13524492);
            var1.d(this.b + 1, 78, this.d - 2, 1);
            var11 = di.f;
            var10 = aw.C;
            var2 = this.C;
            var11.a(var1, var10, this.aE / 2 + var2, 59, 2);
         } else if (this.A == 14) {
            var1.a(13524492);
            var1.d(this.b + 1, 78, this.d - 2, 1);
            var7 = di.f;
            var8 = aw.fx;
            var2 = this.C;
            var7.a(var1, var8, this.aE / 2 + var2, 59, 2);
         } else if (this.A == 4) {
            var11 = di.f;
            var10 = aw.cl;
            var2 = this.C;
            var11.a(var1, var10, this.aE / 2 + var2, 59, 2);
            var1.a(13524492);
            var1.d(this.b + 1, 78, this.d - 2, 1);
         } else if (this.A == 7) {
            var11 = di.f;
            var10 = aw.ft;
            var2 = this.C;
            var11.a(var1, var10, this.aE / 2 + var2, 59, 2);
            var1.a(13524492);
            var1.d(this.b + 1, 78, this.d - 2, 1);
         } else if (this.A == 17) {
            var11 = di.f;
            var10 = aw.fE;
            var2 = this.C;
            var11.a(var1, var10, this.aE / 2 + var2, 59, 2);
            var1.a(13524492);
            var1.d(this.b + 1, 78, this.d - 2, 1);
         } else if (this.A == 8) {
            var11 = di.f;
            var10 = aw.ad;
            var2 = this.C;
            var11.a(var1, var10, this.aE / 2 + var2, 59, 2);
            var1.a(13524492);
            var1.d(this.b + 1, 78, this.d - 2, 1);
         } else if (this.A == 10) {
            var7 = di.f;
            var8 = aw.fu;
            var2 = this.C;
            var7.a(var1, var8, this.aE / 2 + var2, 59, 2);
            var1.a(13524492);
            var1.d(this.b + 1, 78, this.d - 2, 1);
         } else {
            if (this.B == 3 && this.D.length != 4) {
               var1.a(-this.h, 0);
            }

            for(var2 = 0; var2 < this.aY.length; ++var2) {
               int var3;
               if (var2 == this.B) {
                  var3 = 6805896;
               } else {
                  var3 = 16773296;
               }

               var1.a(var3);
               int var4 = this.C;
               int var5 = this.aE;
               int var6 = this.aE;
               byte var9;
               if (var2 == this.B) {
                  var9 = 1;
               } else {
                  var9 = 0;
               }

               bo.a(var1, var5 * var2 + var4, 52, var6 - 1, 25, var9, true);
               if (var2 == this.cf) {
                  var1.a(ce.f, this.C + this.aE * var2 + this.aE / 2, 62, 3);
               }

               if (var2 == this.B) {
                  var7 = di.m;
               } else {
                  var7 = di.o;
               }

               if (!this.aY[var2][1].equals("")) {
                  var8 = this.aY[var2][0];
                  var4 = this.C;
                  var3 = this.aE;
                  var7.a(var1, var8, this.aE / 2 + var4 + var3 * var2, 53, 2);
                  var8 = this.aY[var2][1];
                  var3 = this.C;
                  var4 = this.aE;
                  var7.a(var1, var8, this.aE / 2 + var3 + var4 * var2, 64, 2);
               } else {
                  var8 = this.aY[var2][0];
                  var3 = this.C;
                  var4 = this.aE;
                  var7.a(var1, var8, this.aE / 2 + var3 + var4 * var2, 59, 2);
               }

               if (this.A == 0 && this.aY.length == 5 && p.aW && main.a.w % 4 == 0) {
                  var1.a(ce.f, this.C + this.aE * 3 + this.aE / 2, 77, 33);
               }
            }

            var1.a(13524492);
            var1.d(1, 78, this.d - 2, 1);
         }
      } else {
         var1.a(13524492);
         var1.d(this.b + 1, 78, this.d - 2, 1);
         var7 = di.f;
         var8 = aw.bR;
         var2 = this.ae;
         var7.a(var1, var8, this.ag / 2 + var2, 59, 2);
      }

   }

   private static void z(en var0) {
      di.c.a(var0, aw.an + " " + "2.4.6", 60, 4, 0, di.f);
      di.n.a(var0, aw.ao + ": " + af.e().ag, 60, 16, 0, di.o);
      String var1;
      if (main.a.I.a.d().equals("")) {
         var1 = aw.gj;
      } else {
         var1 = main.a.I.a.d();
      }

      di.n.a(var0, aw.aq + " " + bs.a[bs.n] + ": " + var1, 60, 27, 0, di.o);
   }

   public final void A() {
      if (this.bM > 0) {
         this.cD = false;
      } else {
         this.ai = null;
         if (this.F() || bv.l == 45) {
            af.e().X();
         }

         if (this.o != null && this.A == 13 && this.o.b) {
            this.o = null;
         }

         if (this.A == 13 && !this.aT) {
            bt.a().a((byte)3, (int)-1, (byte)-1, (int)-1);
         }

         if (this.A == 15) {
            bt.a().w(-1);
         }

         bu.a();
         p.bt = true;
         bv.s = -1;
         if (aQ != null) {
            aQ = null;
         }

         System.gc();
         this.bP = false;
         if (this.A != 4) {
            if (this.A == 24) {
               this.ah();
            } else if (this.A == 23) {
               this.q();
            } else if (this.A != 3 && this.A != 14) {
               if (this.A != 18 && this.A != 19 && this.A != 20 && this.A != 21) {
                  if (this.A != 8 && this.A != 11 && this.A != 16) {
                     this.cD = true;
                  } else {
                     this.at();
                     this.aK = 0;
                     this.h = 0;
                  }
               } else {
                  this.q();
                  this.aK = 0;
                  this.h = 0;
               }
            } else if (this.cI) {
               this.cD = true;
            } else {
               this.q();
               this.aK = 0;
               this.h = 0;
            }
         } else {
            this.q();
            this.aK = 0;
            this.h = 0;
         }

         v.a();
         main.a.H = null;
         main.a.l();
         main.a.f();
         main.a.W = false;
         this.bR = 0;
         this.bQ = 0;
         this.bT = false;
         if ((af.e().U <= 0L || af.e().H == 14 || af.e().H == 5) && af.e().cH) {
            de var1 = new de(aw.aW[0], 11038, p.j());
            p.j().cn = var1;
            af.e().U = 0L;
         }
      }

   }

   public final void B() {
      byte var2 = 0;
      if (this.o != null && this.o.b) {
         this.o.c();
      } else if (this.cJ) {
         ++this.cL;
         if (this.cL == 10) {
            this.cL = 0;
            this.cJ = false;
            this.o.a.a("");
            this.o.h = aw.fH + " ";
            this.o.a.i = aw.ec;
            this.o.g = "";
            this.o.b = true;
            this.o.a.c(1);
            this.o.a.b(10);
            if (main.a.e) {
               this.o.a.a();
            }
         }
      } else if (this.cK) {
         ++this.cL;
         if (this.cL == 10) {
            this.cL = 0;
            this.cK = false;
            this.o.a.a("");
            this.o.h = aw.fI + "  ";
            this.o.a.i = aw.ec;
            this.o.g = "";
            this.o.b = true;
            this.o.a.c(1);
            this.o.a.b(10);
            if (main.a.e) {
               this.o.a.a();
            }
         }
      } else {
         if (this.ci != null) {
            this.ci.b();
         }

         if (this.j != null && this.j.k) {
            dr var96 = this.j;
            if (dr.f != null) {
               dr.f.b();
            }

            if (var96.h != var96.g) {
               var96.i = var96.g - var96.h << 2;
               var96.j += var96.i;
               var96.h += var96.j >> 3;
               var96.j &= 15;
            }

            if (Math.abs(var96.g - var96.h) < 10) {
               var96.h = var96.g;
            }

            if (var96.h >= var96.a + var96.b - 10 && var96.g >= var96.a + var96.b - 10) {
               var96.k = false;
            }
         } else {
            this.V();
            int var1 = var2;
            if (this.bV > 0) {
               --this.bV;
               var1 = var2;
               if (this.bV == 0) {
                  this.bp[this.B] = this.ak;
                  var1 = var2;
                  int var3;
                  int var4;
                  String var12;
                  el var83;
                  switch(this.A) {
                  case 0:
                     label984: {
                        Exception var10000;
                        label1018: {
                           boolean var10001;
                           try {
                              if (this.B == 0) {
                                 this.K();
                              }
                           } catch (Exception var80) {
                              var10000 = var80;
                              var10001 = false;
                              break label1018;
                           }

                           try {
                              if (this.B == 1) {
                                 this.ae();
                              }
                           } catch (Exception var79) {
                              var10000 = var79;
                              var10001 = false;
                              break label1018;
                           }

                           de var14;
                           StringBuffer var84;
                           StringBuffer var85;
                           de var86;
                           de var88;
                           label1087: {
                              try {
                                 if (this.B != 2 || this.ak < 0) {
                                    break label1087;
                                 }

                                 if (af.e().H == 14) {
                                    main.a.a(aw.ew);
                                    break label1087;
                                 }
                              } catch (Exception var78) {
                                 var10000 = var78;
                                 var10001 = false;
                                 break label1018;
                              }

                              label1070: {
                                 try {
                                    if (this.ak != 0 && this.ak != 1 && this.ak != 2 && this.ak != 3 && this.ak != 4 && this.ak != 5) {
                                       break label1070;
                                    }
                                 } catch (Exception var77) {
                                    var10000 = var77;
                                    var10001 = false;
                                    break label1018;
                                 }

                                 int var5;
                                 long var6;
                                 StringBuffer var87;
                                 label1071: {
                                    try {
                                       var6 = af.e().aa;
                                       var5 = af.e().cr;
                                       var3 = af.e().cs;
                                       var4 = af.e().cq;
                                       var1 = af.e().ct;
                                       af.e();
                                       if (this.ak != 0) {
                                          break label1071;
                                       }

                                       if (var6 < (long)(af.e().cr + 1000)) {
                                          var84 = new StringBuffer(String.valueOf(aw.eJ));
                                          main.a.c(var84.append(af.e().aa).append(aw.eK).append(af.e().cr + 1000).toString());
                                          break label1087;
                                       }
                                    } catch (Exception var75) {
                                       var10000 = var75;
                                       var10001 = false;
                                       break label1018;
                                    }

                                    if (var6 > (long)var5) {
                                       try {
                                          if (var6 < (long)(((var5 + 1000) * 2 + 180) * 10 / 2)) {
                                             var84 = new StringBuffer(String.valueOf(aw.eL));
                                             var12 = var84.append(var5 + 1000).append(aw.eM).append(af.e().cx).append(aw.eN).toString();
                                             var14 = new de(aw.eI, this, 9000, (Object)null);
                                             var86 = new de(aw.bu, this, 4007, (Object)null);
                                             main.a.a(var12, var14, var86);
                                             break label1087;
                                          }
                                       } catch (Exception var76) {
                                          var10000 = var76;
                                          var10001 = false;
                                          break label1018;
                                       }
                                    }

                                    try {
                                       if (var6 >= (long)(((var5 + 1000) * 2 + 180) * 10 / 2) && var6 < (long)(((var5 + 1000) * 2 + 1980) * 100 / 2)) {
                                          var83 = new el("");
                                          var85 = new StringBuffer(String.valueOf(aw.eI));
                                          var14 = new de(var85.append("\n").append(af.e().cx).append(aw.eW).append("\n").append("-").append(ds.b((long)(var5 + 1000))).toString(), this, 9000, (Object)null);
                                          var83.addElement(var14);
                                          var87 = new StringBuffer(String.valueOf(aw.eI));
                                          var86 = new de(var87.append("\n").append(af.e().cx * 10).append(aw.eW).append("\n").append("-").append(ds.b((long)(((var5 + 1000) * 2 + 180) * 10 / 2))).toString(), this, 9006, (Object)null);
                                          var83.addElement(var86);
                                          main.a.F.a(var83, this.b, (this.ak + 1) * this.aD - this.g + this.af);
                                          this.d(this.ak);
                                       }
                                    } catch (Exception var74) {
                                       var10000 = var74;
                                       var10001 = false;
                                       break label1018;
                                    }

                                    try {
                                       if (var6 >= (long)(((var5 + 1000) * 2 + 1980) * 100 / 2)) {
                                          var83 = new el("");
                                          var87 = new StringBuffer(String.valueOf(aw.eI));
                                          var86 = new de(var87.append("\n").append(af.e().cx).append(aw.eW).append("\n").append("-").append(ds.b((long)(var5 + 1000))).toString(), this, 9000, (Object)null);
                                          var83.addElement(var86);
                                          var85 = new StringBuffer(String.valueOf(aw.eI));
                                          var14 = new de(var85.append("\n").append(af.e().cx * 10).append(aw.eW).append("\n").append("-").append(ds.b((long)(((var5 + 1000) * 2 + 180) * 10 / 2))).toString(), this, 9006, (Object)null);
                                          var83.addElement(var14);
                                          var85 = new StringBuffer(String.valueOf(aw.eI));
                                          var14 = new de(var85.append("\n").append(af.e().cx * 100).append(aw.eW).append("\n").append("-").append(ds.b((long)(((var5 + 1000) * 2 + 1980) * 100 / 2))).toString(), this, 9007, (Object)null);
                                          var83.addElement(var14);
                                          main.a.F.a(var83, this.b, (this.ak + 1) * this.aD - this.g + this.af);
                                          this.d(this.ak);
                                       }
                                    } catch (Exception var62) {
                                       var10000 = var62;
                                       var10001 = false;
                                       break label1018;
                                    }
                                 }

                                 label1094: {
                                    try {
                                       if (this.ak != 1) {
                                          break label1094;
                                       }

                                       if (af.e().aa < (long)(af.e().cs + 1000)) {
                                          var84 = new StringBuffer(String.valueOf(aw.eJ));
                                          main.a.a(var84.append(af.e().aa).append(aw.eK).append(af.e().cs + 1000).toString());
                                          break label1087;
                                       }
                                    } catch (Exception var73) {
                                       var10000 = var73;
                                       var10001 = false;
                                       break label1018;
                                    }

                                    if (var6 > (long)var3) {
                                       try {
                                          if (var6 < (long)(((var3 + 1000) * 2 + 180) * 10 / 2)) {
                                             var84 = new StringBuffer(String.valueOf(aw.eL));
                                             String var89 = var84.append(var3 + 1000).append(aw.eM).append(af.e().cy).append(aw.eO).toString();
                                             var14 = new de(aw.eI, this, 9000, (Object)null);
                                             var88 = new de(aw.bu, this, 4007, (Object)null);
                                             main.a.a(var89, var14, var88);
                                             break label1087;
                                          }
                                       } catch (Exception var72) {
                                          var10000 = var72;
                                          var10001 = false;
                                          break label1018;
                                       }
                                    }

                                    try {
                                       if (var6 >= (long)(((var3 + 1000) * 2 + 180) * 10 / 2) && var6 < (long)(((var3 + 1000) * 2 + 1980) * 100 / 2)) {
                                          var83 = new el("");
                                          var87 = new StringBuffer(String.valueOf(aw.eI));
                                          var86 = new de(var87.append("\n").append(af.e().cy).append(aw.eX).append("\n").append("-").append(ds.b((long)(var5 + 1000))).toString(), this, 9000, (Object)null);
                                          var83.addElement(var86);
                                          var85 = new StringBuffer(String.valueOf(aw.eI));
                                          var14 = new de(var85.append("\n").append(af.e().cy * 10).append(aw.eX).append("\n").append("-").append(ds.b((long)(((var5 + 1000) * 2 + 180) * 10 / 2))).toString(), this, 9006, (Object)null);
                                          var83.addElement(var14);
                                          main.a.F.a(var83, this.b, (this.ak + 1) * this.aD - this.g + this.af);
                                          this.d(this.ak);
                                       }
                                    } catch (Exception var71) {
                                       var10000 = var71;
                                       var10001 = false;
                                       break label1018;
                                    }

                                    try {
                                       if (var6 >= (long)(((var3 + 1000) * 2 + 1980) * 100 / 2)) {
                                          var83 = new el("");
                                          var85 = new StringBuffer(String.valueOf(aw.eI));
                                          var14 = new de(var85.append("\n").append(af.e().cy).append(aw.eX).append("\n").append("-").append(ds.b((long)(var3 + 1000))).toString(), this, 9000, (Object)null);
                                          var83.addElement(var14);
                                          var87 = new StringBuffer(String.valueOf(aw.eI));
                                          var86 = new de(var87.append("\n").append(af.e().cy * 10).append(aw.eX).append("\n").append("-").append(ds.b((long)(((var3 + 1000) * 2 + 180) * 10 / 2))).toString(), this, 9006, (Object)null);
                                          var83.addElement(var86);
                                          var85 = new StringBuffer(String.valueOf(aw.eI));
                                          var14 = new de(var85.append("\n").append(af.e().cy * 100).append(aw.eX).append("\n").append("-").append(ds.b((long)(((var3 + 1000) * 2 + 1980) * 100 / 2))).toString(), this, 9007, (Object)null);
                                          var83.addElement(var14);
                                          main.a.F.a(var83, this.b, (this.ak + 1) * this.aD - this.g + this.af);
                                          this.d(this.ak);
                                       }
                                    } catch (Exception var61) {
                                       var10000 = var61;
                                       var10001 = false;
                                       break label1018;
                                    }
                                 }

                                 label1095: {
                                    try {
                                       if (this.ak != 2) {
                                          break label1095;
                                       }

                                       if (af.e().aa < (long)(af.e().cq * af.e().cD)) {
                                          var84 = new StringBuffer(String.valueOf(aw.eJ));
                                          main.a.a(var84.append(af.e().aa).append(aw.eK).append(var4 * 100).toString());
                                          break label1087;
                                       }
                                    } catch (Exception var70) {
                                       var10000 = var70;
                                       var10001 = false;
                                       break label1018;
                                    }

                                    if (var6 > (long)var4) {
                                       try {
                                          if (var6 < (long)((var4 * 2 + 9) * 10 / 2 * af.e().cD)) {
                                             var84 = new StringBuffer(String.valueOf(aw.eL));
                                             String var90 = var84.append(var4 * 100).append(aw.eM).append(af.e().cz).append(aw.eP).toString();
                                             var88 = new de(aw.eI, this, 9000, (Object)null);
                                             var86 = new de(aw.bu, this, 4007, (Object)null);
                                             main.a.a(var90, var88, var86);
                                             break label1087;
                                          }
                                       } catch (Exception var69) {
                                          var10000 = var69;
                                          var10001 = false;
                                          break label1018;
                                       }
                                    }

                                    try {
                                       if (var6 >= (long)((var4 * 2 + 9) * 10 / 2 * af.e().cD) && var6 < (long)((var4 * 2 + 99) * 100 / 2 * af.e().cD)) {
                                          var83 = new el("");
                                          var87 = new StringBuffer(String.valueOf(aw.eI));
                                          var86 = new de(var87.append("\n").append(af.e().cz).append("\n").append(aw.eY).append("\n").append("-").append(ds.b((long)(var4 * 100))).toString(), this, 9000, (Object)null);
                                          var83.addElement(var86);
                                          var87 = new StringBuffer(String.valueOf(aw.eI));
                                          var86 = new de(var87.append("\n").append(af.e().cz * 10).append("\n").append(aw.eY).append("\n").append("-").append(ds.b((long)((var4 * 2 + 9) * 10 / 2 * af.e().cD))).toString(), this, 9006, (Object)null);
                                          var83.addElement(var86);
                                          main.a.F.a(var83, this.b, (this.ak + 1) * this.aD - this.g + this.af);
                                          this.d(this.ak);
                                       }
                                    } catch (Exception var68) {
                                       var10000 = var68;
                                       var10001 = false;
                                       break label1018;
                                    }

                                    try {
                                       if (var6 >= (long)((var4 * 2 + 99) * 100 / 2 * af.e().cD)) {
                                          var83 = new el("");
                                          var85 = new StringBuffer(String.valueOf(aw.eI));
                                          var14 = new de(var85.append("\n").append(af.e().cz).append("\n").append(aw.eY).append("\n").append("-").append(ds.b((long)(var4 * 100))).toString(), this, 9000, (Object)null);
                                          var83.addElement(var14);
                                          var85 = new StringBuffer(String.valueOf(aw.eI));
                                          var14 = new de(var85.append("\n").append(af.e().cz * 10).append("\n").append(aw.eY).append("\n").append("-").append(ds.b((long)((var4 * 2 + 9) * 10 / 2 * af.e().cD))).toString(), this, 9006, (Object)null);
                                          var83.addElement(var14);
                                          var87 = new StringBuffer(String.valueOf(aw.eI));
                                          var86 = new de(var87.append("\n").append(af.e().cz * 100).append("\n").append(aw.eY).append("\n").append("-").append(ds.b((long)((var4 * 2 + 99) * 100 / 2 * af.e().cD))).toString(), this, 9007, (Object)null);
                                          var83.addElement(var86);
                                          main.a.F.a(var83, this.b, (this.ak + 1) * this.aD - this.g + this.af);
                                          this.d(this.ak);
                                       }
                                    } catch (Exception var60) {
                                       var10000 = var60;
                                       var10001 = false;
                                       break label1018;
                                    }
                                 }

                                 label1096: {
                                    try {
                                       if (this.ak == 3) {
                                          if (af.e().aa >= (long)('썐' + af.e().ct * 1000)) {
                                             break label1096;
                                          }

                                          var84 = new StringBuffer(String.valueOf(aw.eJ));
                                          main.a.a(var84.append(ai.a(af.e().aa)).append(aw.eK).append(ai.a((long)('썐' + af.e().ct * 1000))).toString());
                                          break label1087;
                                       }
                                    } catch (Exception var67) {
                                       var10000 = var67;
                                       var10001 = false;
                                       break label1018;
                                    }

                                    label1033: {
                                       try {
                                          if (this.ak == 4) {
                                             var3 = af.e().cu;
                                             break label1033;
                                          }
                                       } catch (Exception var66) {
                                          var10000 = var66;
                                          var10001 = false;
                                          break label1018;
                                       }

                                       try {
                                          if (this.ak == 5) {
                                             bt.a().a((byte)0);
                                          }
                                          break label1087;
                                       } catch (Exception var64) {
                                          var10000 = var64;
                                          var10001 = false;
                                          break label1018;
                                       }
                                    }

                                    var1 = var3;

                                    try {
                                       if (var3 > co.length - 1) {
                                          var1 = co.length - 1;
                                       }
                                    } catch (Exception var58) {
                                       var10000 = var58;
                                       var10001 = false;
                                       break label1018;
                                    }

                                    try {
                                       var6 = co[var1];
                                       if (af.e().aa < var6) {
                                          var84 = new StringBuffer(String.valueOf(aw.eJ));
                                          main.a.a(var84.append(ds.b(af.e().aa)).append(aw.eK).append(ds.b(var6)).toString());
                                          break label1087;
                                       }
                                    } catch (Exception var65) {
                                       var10000 = var65;
                                       var10001 = false;
                                       break label1018;
                                    }

                                    try {
                                       var84 = new StringBuffer(String.valueOf(aw.eL));
                                       var12 = var84.append(ds.a(var6)).append(aw.eM).append(af.e().cB).append(aw.eQ).toString();
                                       var14 = new de(aw.eI, this, 9000, (Object)null);
                                       var86 = new de(aw.bu, this, 4007, (Object)null);
                                       main.a.a(var12, var14, var86);
                                       break label1087;
                                    } catch (Exception var57) {
                                       var10000 = var57;
                                       var10001 = false;
                                       break label1018;
                                    }
                                 }

                                 try {
                                    long var8 = 1L * (long)((var1 + 5) * 2) / 2L;
                                    long var10 = 10L * (long)((var1 + 5) * 2 + 9) / 2L;
                                    var6 = (long)((var1 + 5) * 2 + 99) * 100L / 2L;
                                    aw.eL = aw.eI;
                                    var83 = new el("");
                                    var85 = new StringBuffer(String.valueOf(aw.eL));
                                    var14 = new de(var85.append("\n").append("1 ").append(aw.eZ).append("\n").append(ds.b(var8 * 100000L)).toString(), this, 9000, (Object)null);
                                    var83.addElement(var14);
                                    var85 = new StringBuffer(String.valueOf(aw.eL));
                                    var14 = new de(var85.append("\n").append("10 ").append(aw.eZ).append("\n").append(ds.b(var10 * 100000L)).toString(), this, 9006, (Object)null);
                                    var83.addElement(var14);
                                    var85 = new StringBuffer(String.valueOf(aw.eL));
                                    var14 = new de(var85.append("\n").append("100 ").append(aw.eZ).append("\n").append(ds.b(var6 * 100000L)).toString(), this, 9007, (Object)null);
                                    var83.addElement(var14);
                                    main.a.F.a(var83, this.b, (this.ak + 1) * this.aD - this.g + this.af);
                                    this.d(this.ak);
                                    break label1087;
                                 } catch (Exception var59) {
                                    var10000 = var59;
                                    var10001 = false;
                                    break label1018;
                                 }
                              }

                              el var15;
                              bf var92;
                              et var93;
                              try {
                                 var1 = this.ak;
                                 var93 = af.e().ax.b[var1 - 6];
                                 var92 = af.e().a(var93);
                                 var15 = new el("");
                              } catch (Exception var56) {
                                 var10000 = var56;
                                 var10001 = false;
                                 break label1018;
                              }

                              de var16;
                              bf var91;
                              if (var92 == null) {
                                 try {
                                    var91 = var93.h[0];
                                    var16 = new de(aw.fk, this, 9004, var91);
                                    var15.addElement(var16);
                                 } catch (Exception var54) {
                                    var10000 = var54;
                                    var10001 = false;
                                    break label1018;
                                 }
                              } else {
                                 label1077: {
                                    label850: {
                                       try {
                                          if (var92.c != var93.c) {
                                             break label850;
                                          }

                                          var88 = new de(aw.cz, this, 9003, var92.a);
                                          var15.addElement(var88);
                                          var88 = new de(aw.bi, 2);
                                          var15.addElement(var88);
                                       } catch (Exception var63) {
                                          var10000 = var63;
                                          var10001 = false;
                                          break label1018;
                                       }

                                       var91 = null;
                                       break label1077;
                                    }

                                    try {
                                       var91 = var93.h[var92.c];
                                       var16 = new de(aw.cx, this, 9002, var91);
                                       var15.addElement(var16);
                                       var16 = new de(aw.cz, this, 9003, var92.a);
                                       var15.addElement(var16);
                                    } catch (Exception var55) {
                                       var10000 = var55;
                                       var10001 = false;
                                       break label1018;
                                    }
                                 }
                              }

                              try {
                                 main.a.F.a(var15, this.b, (this.ak + 1) * this.aD - this.g + this.af);
                                 this.a(var93, var92, var91);
                              } catch (Exception var53) {
                                 var10000 = var53;
                                 var10001 = false;
                                 break label1018;
                              }
                           }

                           label1035: {
                              try {
                                 if (this.B != 3) {
                                    break label1035;
                                 }

                                 if (this.D.length == 4) {
                                    this.ag();
                                    break label1035;
                                 }
                              } catch (Exception var52) {
                                 var10000 = var52;
                                 var10001 = false;
                                 break label1018;
                              }

                              try {
                                 this.bL = null;
                                 this.cH = null;
                                 if (this.ak < 0) {
                                    this.bN = -1;
                                    break label1035;
                                 }
                              } catch (Exception var51) {
                                 var10000 = var51;
                                 var10001 = false;
                                 break label1018;
                              }

                              label1037: {
                                 el var94;
                                 label1038: {
                                    label1039: {
                                       try {
                                          if (af.e().ai != null) {
                                             break label1038;
                                          }

                                          if (this.ak == 0) {
                                             if (this.bN != 0) {
                                                break label1039;
                                             }

                                             this.o.h = aw.ds;
                                             this.o.a.i = aw.dt;
                                             this.o.g = "";
                                             this.o.b = true;
                                             this.o.a.e = true;
                                             this.o.a.c(0);
                                             if (main.a.e) {
                                                this.o.a.a();
                                             }
                                             break label1037;
                                          }
                                       } catch (Exception var50) {
                                          var10000 = var50;
                                          var10001 = false;
                                          break label1018;
                                       }

                                       label1097: {
                                          label668:
                                          try {
                                             if (this.ak != -1) {
                                                if (this.ak != 1) {
                                                   break label668;
                                                }

                                                if (!this.al) {
                                                   break label1097;
                                                }

                                                bt.a().a("");
                                             }
                                             break label1037;
                                          } catch (Exception var36) {
                                             var10000 = var36;
                                             var10001 = false;
                                             break label1018;
                                          }

                                          try {
                                             if (this.al) {
                                                this.bD = this.Y();
                                                if (this.bD != null) {
                                                   var83 = new el("");
                                                   var86 = new de(aw.dz, this, 4000, this.bD);
                                                   var83.addElement(var86);
                                                   var86 = new de(aw.dA, this, 4001, this.bD);
                                                   var83.addElement(var86);
                                                   main.a.F.a(var83, this.b, (this.ak + 1) * this.aD - this.g + this.af);
                                                   this.a(this.Y());
                                                }
                                                break label1037;
                                             }
                                          } catch (Exception var35) {
                                             var10000 = var35;
                                             var10001 = false;
                                             break label1018;
                                          }

                                          try {
                                             if (this.an) {
                                                this.bF = this.W();
                                                if (this.bF != null) {
                                                   var94 = new el("");
                                                   var88 = new de(aw.bi, this, 8000, this.bD);
                                                   var94.addElement(var88);
                                                   main.a.F.a(var94, this.b, (this.ak + 1) * this.aD - this.g + this.af);
                                                   main.a.F.a(var94, 0, (this.ak + 1) * this.aD - this.g + this.af);
                                                   this.a(this.bF);
                                                }
                                             }
                                             break label1037;
                                          } catch (Exception var30) {
                                             var10000 = var30;
                                             var10001 = false;
                                             break label1018;
                                          }
                                       }

                                       try {
                                          if (this.an && this.bD != null) {
                                             var84 = new StringBuffer(String.valueOf(aw.dx));
                                             var12 = var84.append(this.bD.c).toString();
                                             var86 = new de(aw.bm, this, 4000, this.bD);
                                             var14 = new de(aw.bn, this, 4005, this.bD);
                                             main.a.a(var12, var86, var14);
                                          }
                                          break label1037;
                                       } catch (Exception var29) {
                                          var10000 = var29;
                                          var10001 = false;
                                          break label1018;
                                       }
                                    }

                                    try {
                                       if (this.bN != 1) {
                                          break label1037;
                                       }

                                       bp.a();
                                       this.o.h = aw.dv;
                                       this.o.a.i = aw.ds;
                                       this.o.g = "";
                                       this.o.b = true;
                                       this.o.a.c(0);
                                       if (main.a.e) {
                                          this.o.a.a();
                                       }
                                    } catch (Exception var28) {
                                       var10000 = var28;
                                       var10001 = false;
                                       break label1018;
                                    }

                                    try {
                                       bt.a().a((byte)1, -1, (String)null);
                                       break label1037;
                                    } catch (Exception var27) {
                                       var10000 = var27;
                                       var10001 = false;
                                       break label1018;
                                    }
                                 }

                                 label1048: {
                                    label1098: {
                                       label1050: {
                                          try {
                                             if (this.ak != 0) {
                                                break label1050;
                                             }

                                             if (!this.am) {
                                                break label1098;
                                             }

                                             if (this.bN != 0) {
                                                break label1048;
                                             }

                                             if (this.R.size() > 1) {
                                                this.o.h = aw.du;
                                                this.o.a.i = aw.bp;
                                                this.o.g = "";
                                                this.o.b = true;
                                                this.o.a.e = true;
                                                this.o.a.c(0);
                                                if (main.a.e) {
                                                   this.o.a.a();
                                                }
                                                break label1048;
                                             }
                                          } catch (Exception var49) {
                                             var10000 = var49;
                                             var10001 = false;
                                             break label1018;
                                          }

                                          try {
                                             this.Q = null;
                                             this.al = false;
                                             this.an = true;
                                             this.am = false;
                                             this.O = this.R.size() + 2;
                                             this.v();
                                             break label1048;
                                          } catch (Exception var26) {
                                             var10000 = var26;
                                             var10001 = false;
                                             break label1018;
                                          }
                                       }

                                       try {
                                          if (this.ak == 1) {
                                             if (this.al) {
                                                bt.a().a("");
                                             }
                                             break label1037;
                                          }
                                       } catch (Exception var48) {
                                          var10000 = var48;
                                          var10001 = false;
                                          break label1018;
                                       }

                                       try {
                                          if (this.al) {
                                             this.bD = this.Y();
                                             if (this.bD != null) {
                                                var83 = new el("");
                                                var86 = new de(aw.dA, this, 4001, this.bD);
                                                var83.addElement(var86);
                                                main.a.F.a(var83, this.b, (this.ak + 1) * this.aD - this.g + this.af);
                                                this.a(this.Y());
                                             }
                                             break label1037;
                                          }
                                       } catch (Exception var47) {
                                          var10000 = var47;
                                          var10001 = false;
                                          break label1018;
                                       }

                                       label1099: {
                                          label1056: {
                                             try {
                                                if (!this.an) {
                                                   break label1056;
                                                }

                                                ds.c("TOI DAY 1");
                                                this.bF = this.W();
                                                if (this.bF == null) {
                                                   break label1037;
                                                }

                                                var83 = new el("");
                                                ds.c("TOI DAY 2");
                                                if (this.Q != null) {
                                                   var86 = new de(aw.bi, this, 8000, (Object)null);
                                                   var83.addElement(var86);
                                                   ds.c("TOI DAY 3");
                                                   break label1099;
                                                }
                                             } catch (Exception var46) {
                                                var10000 = var46;
                                                var10001 = false;
                                                break label1018;
                                             }

                                             label724: {
                                                try {
                                                   if (this.R == null) {
                                                      break label1099;
                                                   }

                                                   ds.c("TOI DAY 4");
                                                   var85 = new StringBuffer("my role= ");
                                                   ds.c(var85.append(af.e().aj).toString());
                                                   if (af.e().J != this.bF.a && af.e().aj != 2) {
                                                      break label724;
                                                   }
                                                } catch (Exception var42) {
                                                   var10000 = var42;
                                                   var10001 = false;
                                                   break label1018;
                                                }

                                                try {
                                                   var86 = new de(aw.bi, this, 8000, this.bF);
                                                   var83.addElement(var86);
                                                } catch (Exception var22) {
                                                   var10000 = var22;
                                                   var10001 = false;
                                                   break label1018;
                                                }
                                             }

                                             label1059: {
                                                label712: {
                                                   try {
                                                      if (af.e().aj >= 2 || af.e().J == this.bF.a) {
                                                         break label1059;
                                                      }

                                                      if (this.bF.g != 0 && this.bF.g != 1) {
                                                         break label712;
                                                      }
                                                   } catch (Exception var41) {
                                                      var10000 = var41;
                                                      var10001 = false;
                                                      break label1018;
                                                   }

                                                   try {
                                                      var86 = new de(aw.bi, this, 8000, this.bF);
                                                      var83.addElement(var86);
                                                   } catch (Exception var21) {
                                                      var10000 = var21;
                                                      var10001 = false;
                                                      break label1018;
                                                   }
                                                }

                                                try {
                                                   if (this.bF.g == 2) {
                                                      var86 = new de(aw.dB, this, 5002, this.bF);
                                                      var83.addElement(var86);
                                                   }
                                                } catch (Exception var40) {
                                                   var10000 = var40;
                                                   var10001 = false;
                                                   break label1018;
                                                }

                                                try {
                                                   if (af.e().aj == 0) {
                                                      var86 = new de(aw.dC, this, 5001, this.bF);
                                                      var83.addElement(var86);
                                                      if (this.bF.g == 1) {
                                                         var86 = new de(aw.dD, this, 5003, this.bF);
                                                         var83.addElement(var86);
                                                      }
                                                   }
                                                } catch (Exception var20) {
                                                   var10000 = var20;
                                                   var10001 = false;
                                                   break label1018;
                                                }
                                             }

                                             try {
                                                if (af.e().aj < this.bF.g) {
                                                   var86 = new de(aw.dE, this, 5004, this.bF);
                                                   var83.addElement(var86);
                                                }
                                                break label1099;
                                             } catch (Exception var39) {
                                                var10000 = var39;
                                                var10001 = false;
                                                break label1018;
                                             }
                                          }

                                          try {
                                             if (!this.am) {
                                                break label1037;
                                             }

                                             this.bE = this.X();
                                             if (this.bE == null) {
                                                break label1037;
                                             }

                                             if (this.bE.b == 0) {
                                                var94 = new el("");
                                                var88 = new de(aw.bi, this, 8000, this.bE);
                                                var94.addElement(var88);
                                                main.a.F.a(var94, this.b, (this.ak + 1) * this.aD - this.g + this.af);
                                                this.a(this.bE);
                                                break label1037;
                                             }
                                          } catch (Exception var45) {
                                             var10000 = var45;
                                             var10001 = false;
                                             break label1018;
                                          }

                                          try {
                                             if (this.bE.b == 1) {
                                                if (this.bE.c != af.e().J && this.bN != -1) {
                                                   bt.a().d(this.bE.a);
                                                }
                                                break label1037;
                                             }
                                          } catch (Exception var44) {
                                             var10000 = var44;
                                             var10001 = false;
                                             break label1018;
                                          }

                                          label731:
                                          try {
                                             if (this.bE.b == 2 && this.bE.k != null) {
                                                if (this.bN != 0) {
                                                   break label731;
                                                }

                                                bt.a().a((int)this.bE.a, (byte)1);
                                             }
                                             break label1037;
                                          } catch (Exception var43) {
                                             var10000 = var43;
                                             var10001 = false;
                                             break label1018;
                                          }

                                          try {
                                             if (this.bN == 1) {
                                                bt.a().a((int)this.bE.a, (byte)0);
                                             }
                                             break label1037;
                                          } catch (Exception var34) {
                                             var10000 = var34;
                                             var10001 = false;
                                             break label1018;
                                          }
                                       }

                                       try {
                                          main.a.F.a(var83, this.b, (this.ak + 1) * this.aD - this.g + this.af);
                                          this.a(this.bF);
                                          break label1037;
                                       } catch (Exception var19) {
                                          var10000 = var19;
                                          var10001 = false;
                                          break label1018;
                                       }
                                    }

                                    try {
                                       if (!this.an) {
                                          break label1037;
                                       }

                                       if (this.bN == 0) {
                                          this.al = false;
                                          this.an = false;
                                          this.am = true;
                                          this.O = cb.l.size() + 2;
                                          this.v();
                                       }
                                    } catch (Exception var33) {
                                       var10000 = var33;
                                       var10001 = false;
                                       break label1018;
                                    }

                                    label1066: {
                                       try {
                                          if (this.bN != 1) {
                                             break label1066;
                                          }

                                          if (this.R.size() > 1) {
                                             bt.a().b();
                                             break label1066;
                                          }
                                       } catch (Exception var38) {
                                          var10000 = var38;
                                          var10001 = false;
                                          break label1018;
                                       }

                                       try {
                                          this.ai();
                                       } catch (Exception var24) {
                                          var10000 = var24;
                                          var10001 = false;
                                          break label1018;
                                       }
                                    }

                                    label1068: {
                                       try {
                                          if (this.bN != 2) {
                                             break label1068;
                                          }

                                          if (this.R.size() > 1) {
                                             this.ai();
                                             break label1068;
                                          }
                                       } catch (Exception var37) {
                                          var10000 = var37;
                                          var10001 = false;
                                          break label1018;
                                       }

                                       try {
                                          bt.a().a((byte)3, -1, (String)null);
                                       } catch (Exception var23) {
                                          var10000 = var23;
                                          var10001 = false;
                                          break label1018;
                                       }
                                    }

                                    try {
                                       if (this.bN == 3) {
                                          bt.a().a((byte)3, -1, (String)null);
                                       }
                                       break label1037;
                                    } catch (Exception var32) {
                                       var10000 = var32;
                                       var10001 = false;
                                       break label1018;
                                    }
                                 }

                                 try {
                                    if (this.bN == 1) {
                                       bt.a().a(1, (String)null, -1);
                                    }
                                 } catch (Exception var25) {
                                    var10000 = var25;
                                    var10001 = false;
                                    break label1018;
                                 }

                                 try {
                                    if (this.bN == 2) {
                                       this.Q = null;
                                       this.al = false;
                                       this.an = true;
                                       this.am = false;
                                       this.O = this.R.size() + 2;
                                       this.v();
                                       this.M();
                                    }
                                 } catch (Exception var31) {
                                    var10000 = var31;
                                    var10001 = false;
                                    break label1018;
                                 }
                              }

                              try {
                                 if (main.a.e) {
                                    this.bN = -1;
                                    this.ak = -1;
                                 }
                              } catch (Exception var18) {
                                 var10000 = var18;
                                 var10001 = false;
                                 break label1018;
                              }
                           }

                           var1 = var2;

                           try {
                              if (this.B != 4) {
                                 break;
                              }

                              this.ag();
                              break label984;
                           } catch (Exception var17) {
                              var10000 = var17;
                              var10001 = false;
                           }
                        }

                        Exception var95 = var10000;
                        var95.printStackTrace();
                        var1 = var2;
                        break;
                     }

                     var1 = var2;
                     break;
                  case 1:
                  case 17:
                     this.bC = null;
                     var1 = var2;
                     if (this.ak >= 0) {
                        var83 = new el("");
                        var3 = this.B;
                        var4 = this.aY.length;
                        byte var82;
                        if (main.a.H != null) {
                           var82 = 0;
                        } else {
                           var82 = 1;
                        }

                        if (var3 < var4 - var82 && this.A != 17) {
                           this.bC = af.e().aJ[this.B][this.ak];
                           if (this.bC != null) {
                              if (this.bC.y) {
                                 if (this.bC.s > 0) {
                                    var83.addElement(new de(aw.ev + "\n" + ds.b((long)this.bC.s), this, 3005, this.bC));
                                 }
                              } else if (this.bJ == 4) {
                                 var83.addElement(new de(aw.cn, this, 30001, this.bC));
                                 var83.addElement(new de(aw.bj, this, 30002, this.bC));
                                 var83.addElement(new de(aw.co, this, 30003, this.bC));
                              } else if (this.bC.n == 0 && this.bC.p == 0) {
                                 if (this.bC.j != 0L) {
                                    var83.addElement(new de(aw.eu + "\n" + ds.a(this.bC.j) + " \n" + aw.fh, this, 3004, this.bC));
                                 } else {
                                    var83.addElement(new de(aw.cn + "\n" + aw.en, this, 3000, this.bC));
                                 }
                              } else if (this.bJ == 8) {
                                 if (this.bC.n > 0) {
                                    var83.addElement(new de(aw.ev + "\n" + ds.b((long)this.bC.n) + "\n" + aw.bC, this, 30001, this.bC));
                                 }

                                 if (this.bC.p > 0) {
                                    var83.addElement(new de(aw.ev + "\n" + ds.b((long)this.bC.p) + "\n" + aw.bD, this, 30002, this.bC));
                                 }
                              } else if (this.bJ != 2) {
                                 if (this.bC.n > 0) {
                                    var83.addElement(new de(aw.ev + "\n" + ds.b((long)this.bC.n) + "\n" + aw.bC, this, 3000, this.bC));
                                 }

                                 if (this.bC.p > 0) {
                                    var83.addElement(new de(aw.ev + "\n" + ds.b((long)this.bC.p) + "\n" + aw.bD, this, 3001, this.bC));
                                 }
                              } else {
                                 if (this.bC.n != -1) {
                                    var83.addElement(new de(aw.ev + "\n" + ds.b((long)this.bC.n) + "\n" + aw.bC, this, 10016, this.bC));
                                 }

                                 if (this.bC.p != -1) {
                                    var83.addElement(new de(aw.ev + "\n" + ds.b((long)this.bC.p) + "\n" + aw.bD, this, 10017, this.bC));
                                 }
                              }
                           }
                        } else if (this.bJ == 0) {
                           if (this.ak == 0) {
                              this.a(af.e().aH.length + af.e().aF.length, false);
                           } else {
                              this.bC = null;
                              h var13;
                              if (!a(this.ak, this.bO, af.e().aH)) {
                                 var13 = af.e().aF[b(this.ak, this.bO, af.e().aH)];
                                 if (var13 != null) {
                                    this.bC = var13;
                                 }
                              } else {
                                 var13 = af.e().aH[c(this.ak, this.bO)];
                                 if (var13 != null) {
                                    this.bC = var13;
                                 }
                              }

                              if (this.bC != null) {
                                 var83.addElement(new de(aw.ea, this, 3002, this.bC));
                              }
                           }
                        } else {
                           if (this.A == 17) {
                              this.bC = af.e().aJ[4][this.ak];
                           } else {
                              this.bC = af.e().aJ[this.B][this.ak];
                           }

                           if (this.bC.v == 0) {
                              if (this.bC.a(87)) {
                                 var83.addElement(new de(aw.fG, this, 10013, this.bC));
                              } else {
                                 var83.addElement(new de(aw.fF, this, 10012, this.bC));
                              }
                           } else if (this.bC.v == 1) {
                              var83.addElement(new de(aw.fJ, this, 10014, this.bC));
                              var83.addElement(new de(aw.fN, this, 10018, this.bC));
                           } else if (this.bC.v == 2) {
                              var83.addElement(new de(aw.fK, this, 10015, this.bC));
                           }
                        }

                        if (this.bC != null) {
                           af.e().a(this.bC.D, this.bC.E, this.bC.F, this.bC.G);
                           main.a.F.a(var83, this.b, (this.ak + 1) * this.aD - this.g + this.af);
                           this.b(this.bC);
                           var1 = var2;
                        } else {
                           this.ai = null;
                           var1 = var2;
                        }
                     }
                     break;
                  case 2:
                     this.ao();
                     var1 = var2;
                     break;
                  case 3:
                     this.an();
                     var1 = var2;
                     break;
                  case 4:
                     if (aQ != null) {
                        aQ = null;
                     }

                     bv.s = -1;
                     System.gc();
                     bl.a();
                     this.q();
                     this.aK = 0;
                     this.h = 0;
                     var1 = var2;
                  case 5:
                  case 6:
                  case 22:
                  case 24:
                  case 25:
                     break;
                  case 7:
                     if (this.equals(main.a.H) && main.a.G.A == 2) {
                        this.ao();
                        return;
                     }

                     this.ae();
                     var1 = var2;
                     break;
                  case 8:
                     this.am();
                     var1 = var2;
                     break;
                  case 9:
                     this.ad();
                     var1 = var2;
                     break;
                  case 10:
                     var1 = var2;
                     if (this.ak != -1) {
                        this.cl = true;
                        this.A();
                        var1 = var2;
                     }
                     break;
                  case 11:
                     this.ak();
                     var1 = var2;
                     break;
                  case 12:
                     this.ac();
                     var1 = var2;
                     break;
                  case 13:
                     this.ab();
                     var1 = var2;
                     break;
                  case 14:
                     this.an();
                     var1 = var2;
                     break;
                  case 15:
                     this.aa();
                     var1 = var2;
                     break;
                  case 16:
                     this.aj();
                     var1 = var2;
                     break;
                  case 18:
                     this.al();
                     var1 = var2;
                     break;
                  case 19:
                     this.as();
                     var1 = var2;
                     break;
                  case 20:
                     this.au();
                     var1 = var2;
                     break;
                  case 21:
                     if (this.B == 0) {
                        var1 = var2;
                        if (this.ak == -1) {
                           break;
                        }

                        var1 = var2;
                        if (this.ak > af.f().aH.length - 1) {
                           break;
                        }

                        var83 = new el("");
                        this.bC = af.f().aH[this.ak];
                        if (this.bC != null) {
                           var83.addElement(new de(aw.dY, this, 2006, this.bC));
                           main.a.F.a(var83, this.b, (this.ak + 1) * this.aD - this.g + this.af);
                           this.b(this.bC);
                        } else {
                           this.ai = null;
                        }
                     }

                     if (this.B == 1 && this.ak != -1) {
                        if (this.ak == 5) {
                           main.a.a(aw.p, new de(aw.bm, 888351), new de(aw.bn, 2001));
                        } else {
                           bt.a().g((byte)this.ak);
                           if (this.ak < 4) {
                              af.f().A = (byte)this.ak;
                           }
                        }
                     }

                     var1 = var2;
                     if (this.B == 2) {
                        this.ae();
                        var1 = var2;
                     }
                     break;
                  case 23:
                     var1 = var2;
                     if (this.ak != -1) {
                        this.cE = this.ak;
                        ((ba)at.elementAt(this.cE)).d = true;
                        av.a(String.valueOf(((ba)at.elementAt(this.cE)).c), 1);
                        var12 = ((ba)at.elementAt(this.cE)).b;
                        cF = di.o.a(var12, this.ag - 40);
                        this.O = cF.length;
                        this.aD = 16;
                        byte var81;
                        if (main.a.e) {
                           var81 = -1;
                        } else {
                           var81 = 0;
                        }

                        this.ak = var81;
                        this.aI = this.O * this.aD - this.ah;
                        if (this.aI < 0) {
                           this.aI = 0;
                        }

                        if (this.g < 0) {
                           this.f = 0;
                           this.g = 0;
                        }

                        if (this.g > this.aI) {
                           var1 = this.aI;
                           this.f = var1;
                           this.g = var1;
                        }

                        this.A = 24;
                        this.c(0);
                        var1 = var2;
                     }
                     break;
                  case 26:
                     var1 = var2;
                     if (this.ak != -1) {
                        main.a.G.A();
                        var1 = var2;
                     }
                     break;
                  default:
                     var1 = var2;
                  }
               }
            }

            while(var1 < cb.l.size()) {
               ((cb)cb.l.elementAt(var1)).a();
               ++var1;
            }

            this.ap();
         }
      }

   }

   public final void C() {
      if (this.j == null) {
         this.j = new dr();
      }

      this.j.m = this.o.a.d();
      this.j.a(false);
      this.o.b = false;
   }

   public final void D() {
      this.o.a.c(0);
   }

   public final void E() {
      this.A = 25;
      this.c(0);
      this.av();
      this.B = 0;
   }

   public final boolean F() {
      boolean var1 = true;
      if (this.A != 1) {
         var1 = false;
      }

      return var1;
   }

   public final int a(h var1) {
      int var2 = -1;
      if (var1 != null) {
         if (var1.b()) {
            if (var1.a != null) {
               ee var4 = var1.a[0];
               if (var4.c.a == 22) {
                  var4.c = p.j().K[6];
                  var4.a *= 1000;
               }

               if (var4.c.a == 23) {
                  var4.c = p.j().K[7];
                  var4.a *= 1000;
               }

               var2 = 0;

               while(true) {
                  if (var2 >= af.e().aH.length) {
                     var1 = null;
                     break;
                  }

                  h var3 = af.e().aH[var2];
                  if (var4.c.a == 22) {
                     var4.c = p.j().K[6];
                     var4.a *= 1000;
                  }

                  if (var4.c.a == 23) {
                     var4.c = p.j().K[7];
                     var4.a *= 1000;
                  }

                  if (var3 != null && var3.a != null && var3.b.b == var1.b.b) {
                     var1 = var3;
                     break;
                  }

                  ++var2;
               }

               if (var1 == null) {
                  ds.c("5");
                  var2 = var4.a;
               } else if (var1 != null && var1.a != null) {
                  var2 = var4.a - var1.a[0].a;
               } else {
                  var2 = var4.a;
               }
            }
         } else {
            var2 = 0;
         }
      }

      return var2;
   }

   public final void a() {
      this.ca = main.a.t + this.aL;
      this.cb = main.a.u + this.aM;
      this.aX = new int[this.M.length];

      for(int var1 = 0; var1 < this.aX.length; ++var1) {
         this.aX[var1] = -1;
      }

   }

   public final void a(byte var1) {
      boolean var3 = false;
      this.A = 15;
      this.c(0);
      this.aD = 24;
      byte var2;
      if (main.a.e) {
         var2 = -1;
      } else {
         var2 = 0;
      }

      this.ak = var2;
      this.O = this.W.size();
      this.aI = this.O * this.aD - this.ah;
      if (this.aI < 0) {
         this.aI = 0;
      }

      int var4 = this.aJ[this.B];
      this.f = var4;
      this.g = var4;
      if (this.g < 0) {
         this.f = 0;
         this.g = 0;
      }

      if (this.g > this.aI) {
         var4 = this.aI;
         this.f = var4;
         this.g = var4;
      }

      if (this.ak > this.O - 1) {
         this.ak = this.O - 1;
      }

      this.aK = 0;
      this.h = 0;
      if (var1 != 0) {
         var3 = true;
      }

      this.bI = var3;
   }

   public final void a(byte var1, String var2, byte var3, byte var4) {
      main.a.h();
      co var5 = new co();
      var5.c = var1;
      var5.a = var4;
      var5.b = var3;
      main.a.a(var2, new de(aw.bm, this, 2004, var5), new de(aw.bn, this, 4005, (Object)null));
   }

   public final void a(byte var1, String var2, short var3) {
      co var4 = new co();
      var4.c = var1;
      var4.a = var3;
      main.a.a(var2, new de(aw.bm, this, 3003, var4), new de(aw.bn, this, 4005, (Object)null));
   }

   public final void a(int var1) {
      this.A = 1;
      this.c(0);
      this.y();
      this.B = 0;
      this.bJ = var1;
   }

   public final void a(int var1, int var2) {
      this.ai.d[this.ai.d.length - 1] = aw.cY + " " + var1 + "/" + var2;
   }

   public final void a(int var1, Object var2) {
      if (var1 == 9999) {
         q var8 = (q)var2;
         bt.a().w(var8.g);
      }

      if (var1 == 170391) {
         av.a();
         if (en.b > 1) {
            av.a("levelScreenKN", 1);
         } else {
            av.a("levelScreenKN", 0);
         }

         GameMidlet.f.a();
      }

      h var12;
      if (var1 == 6001) {
         var12 = (h)var2;
         var12.f = false;
         main.a.G.k.removeElement(var12);
         if (main.a.G.B == 0) {
            main.a.G.o();
         }
      }

      int var5;
      if (var1 == 6000) {
         var12 = (h)var2;

         for(var5 = 0; var5 < main.a.G.k.size(); ++var5) {
            if (((h)main.a.G.k.elementAt(var5)).b.a == var12.b.a) {
               main.a.a(aw.ei);
               return;
            }
         }

         var12.f = true;
         main.a.G.k.addElement(var12);
         if (main.a.G.B == 0) {
            main.a.G.o();
         }
      }

      h var9;
      if (var1 == 7000) {
         if (this.aS) {
            main.a.a(aw.ej);
            return;
         }

         var12 = (h)var2;

         for(var5 = 0; var5 < main.a.G.U.size(); ++var5) {
            if (((h)main.a.G.U.elementAt(var5)).g == var12.g) {
               main.a.a(aw.ei);
               return;
            }
         }

         if (var12.h > 1) {
            if (this.o == null) {
               this.o = new cq();
               this.o.a.b = main.a.B - 35 - cq.b().a.d;
               this.o.a();
               this.o.c = main.a.G;
            }

            this.o.h = aw.ef;
            this.o.a.i = aw.eg;
            this.o.g = "";
            this.o.b = true;
            this.o.a.c(1);
            if (main.a.e) {
               this.o.a.a();
            }

            return;
         }

         var12.f = true;
         var9 = new h();
         var9.b = var12.b;
         var9.a = var12.a;
         var9.g = var12.g;
         main.a.G.U.addElement(var9);
         bt.a().a((byte)2, (int)-1, (byte)((byte)var9.g), (int)var9.h);
      }

      if (var1 == 7001) {
         var12 = (h)var2;
         var12.f = false;
         main.a.G.U.removeElement(var12);
         if (main.a.G.B == 1) {
            main.a.G.a(true);
         }

         bt.a().a((byte)4, (int)-1, (byte)((byte)var12.g), (int)-1);
      }

      if (var1 == 7002) {
         this.aT = true;
         main.a.h();
         bt.a().a((byte)7, (int)-1, (byte)-1, (int)-1);
         this.A();
      }

      r var14;
      if (var1 == 8003) {
         var14 = (r)var2;
         bt.a().a((byte)1, (int)var14.c.J);
      }

      if (var1 == 8002) {
         var14 = (r)var2;
         bt.a().a((byte)2, (int)var14.c.J);
      }

      if (var1 == 8004) {
         var14 = (r)var2;
         bt.a().a(var14.c.J);
      }

      if (var1 == 8001) {
         ds.c("chat player");
         var14 = (r)var2;
         if (this.o == null) {
            this.o = new cq();
            this.o.a.b = main.a.B - 35 - cq.b().a.d;
            this.o.a();
            this.o.c = main.a.G;
         }

         this.o.h = aw.cP;
         this.o.a.i = aw.cQ + " " + var14.c.ag;
         this.o.g = "";
         this.o.b = true;
         this.o.a.e = true;
         this.o.a.c(0);
         if (main.a.e) {
            this.o.a.a();
         }
      }

      if (var1 == 1000) {
         bt.a().a((byte)0, (byte)((byte)c(this.ak, this.bO)));
      }

      byte var3;
      if (var1 == 1001) {
         var3 = (byte)b(this.ak, this.bO, af.e().aH);
         bt.a().a(bj, var3);
      }

      if (var1 == 1003) {
         this.A();
      }

      if (var1 == 1002) {
         bt.a().a(bk, (byte)c(this.ak, this.bO));
      }

      if (var1 == 2011) {
         bt.a().a((byte)1, (byte)2, (byte)((byte)c(this.ak, this.bO)), (short)-1);
      }

      if (var1 == 2010) {
         bt.a().a((byte)0, (byte)2, (byte)((byte)c(this.ak, this.bO)), (short)-1);
         var12 = (h)var2;
         if (var12 != null && (var12.b.a == 193 || var12.b.a == 194)) {
            main.a.G.A();
         }
      }

      if (var1 == 2000) {
         h[] var17 = af.e().aH;
         var3 = (byte)b(this.ak, this.bO, var17);
         bt.a().a(bl, var3);
      }

      boolean var7;
      byte var11;
      bt var18;
      if (var1 == 2001) {
         ds.c("use item");
         var9 = (h)var2;
         var7 = a(this.ak, this.bO, af.e().aH);
         if (!var7) {
            var3 = (byte)b(this.ak, this.bO, af.e().aH);
         } else {
            var3 = (byte)c(this.ak, this.bO);
         }

         var18 = bt.a();
         if (var7) {
            var11 = 0;
         } else {
            var11 = 1;
         }

         var18.a((byte)0, (byte)((byte)var11), (byte)var3, (short)-1);
         if (var9.b.a == 193 || var9.b.a == 194) {
            main.a.G.A();
         }
      }

      if (var1 == 2002) {
         bt.a().a(bm, (byte)c(this.ak, this.bO));
      }

      if (var1 == 2003) {
         ds.c("remove item");
         var7 = a(this.ak, this.bO, af.e().aH);
         if (!var7) {
            var3 = (byte)b(this.ak, this.bO, af.e().aH);
         } else {
            var3 = (byte)c(this.ak, this.bO);
         }

         var18 = bt.a();
         if (var7) {
            var11 = 0;
         } else {
            var11 = 1;
         }

         var18.a((byte)1, (byte)((byte)var11), (byte)var3, (short)-1);
      }

      if (var1 == 2004) {
         main.a.h();
         co var15 = (co)var2;
         var3 = (byte)var15.b;
         byte var4 = (byte)var15.a;
         var18 = bt.a();
         if (var15.c == 0) {
            var11 = 3;
         } else {
            var11 = 2;
         }

         var18.a((byte)var11, (byte)var3, (byte)var4, (short)-1);
      }

      if (var1 == 2005) {
         var3 = (byte)b(this.ak, this.bO, af.e().aH);
         bt.a().a(bn, var3);
      }

      if (var1 == 2006) {
         af.f();
         var3 = (byte)this.ak;
         bt.a().a(bo, var3);
      }

      if (var1 == 30001) {
         ds.c("nhan do");
         bt.a().a((byte)0, (int)this.ak, (int)0);
      }

      if (var1 == 30002) {
         ds.c("xoa do");
         bt.a().a((byte)1, (int)this.ak, (int)0);
      }

      if (var1 == 30003) {
         ds.c("nhan tat");
         bt.a().a((byte)2, (int)this.ak, (int)0);
      }

      if (var1 == 3000) {
         ds.c("mua do");
         var12 = (h)var2;
         bt.a().a((byte)0, (int)var12.b.a, (int)0);
      }

      if (var1 == 3001) {
         var12 = (h)var2;
         main.a.L.b();
         bt.a().a((byte)1, (int)var12.b.a, (int)0);
      }

      if (var1 == 3002) {
         main.a.h();
         var7 = a(this.ak, this.bO, af.e().aH);
         byte var13;
         if (!var7) {
            var13 = (byte)b(this.ak, this.bO, af.e().aH);
         } else {
            var13 = (byte)c(this.ak, this.bO);
         }

         var18 = bt.a();
         byte var6;
         if (var7) {
            var6 = 0;
         } else {
            var6 = 1;
         }

         var18.a((byte)0, (byte)((byte)var6), (short)((short)var13));
      }

      if (var1 == 3003) {
         main.a.h();
         co var19 = (co)var2;
         bt.a().a((byte)1, (byte)((byte)var19.c), (short)((short)var19.a));
      }

      if (var1 == 3004) {
         var12 = (h)var2;
         bt.a().a((byte)3, (int)var12.b.a, (int)0);
      }

      if (var1 == 3005) {
         ds.c("mua do");
         var12 = (h)var2;
         bt.a().a((byte)3, (int)var12.b.a, (int)0);
      }

      eh var20;
      if (var1 == 4000) {
         var20 = (eh)var2;
         if (var20 != null) {
            main.a.h();
            bt.a().a(2, (String)null, var20.a);
         }
      }

      if (var1 == 4001) {
         var20 = (eh)var2;
         if (var20 != null) {
            bp.a();
            this.ao = aw.aB;
            bt.a().e(var20.a);
         }
      }

      if (var1 == 4005) {
         main.a.h();
      }

      if (var1 == 4007) {
         main.a.h();
      }

      if (var1 == 4006) {
         cb var21 = (cb)var2;
         bt.a().d(var21.a);
      }

      e var22;
      if (var1 == 5001) {
         var22 = (e)var2;
         bt.a().b((int)var22.a, (byte)0);
      }

      if (var1 == 5002) {
         var22 = (e)var2;
         bt.a().b((int)var22.a, (byte)1);
      }

      if (var1 == 5003) {
         var22 = (e)var2;
         bt.a().b((int)var22.a, (byte)2);
      }

      if (var1 == 5004) {
         var22 = (e)var2;
         bt.a().b(var22.a, (byte)-1);
      }

      if (var1 == 9000) {
         bt.a().a((int)this.ak, (int)1);
         main.a.h();
         bp.a();
      }

      if (var1 == 9006) {
         bt.a().a((int)this.ak, (int)10);
         main.a.h();
         bp.a();
      }

      if (var1 == 9007) {
         bt.a().a((int)this.ak, (int)100);
         main.a.h();
         bp.a();
      }

      bf var23;
      if (var1 == 9002) {
         var23 = (bf)var2;
         if (var23.a.c()) {
            main.a.a(aw.b);
         } else {
            main.a.a(aw.eR + var23.d + aw.eS + var23.l + aw.eT);
         }
      }

      if (var1 == 9003) {
         if (main.a.e) {
            p.j();
            p.a((et)var2);
         } else {
            p.j();
            p.b((et)var2);
         }
      }

      if (var1 == 9004) {
         var23 = (bf)var2;
         if (var23.a.c()) {
            main.a.a(aw.a);
         } else {
            main.a.a(aw.eR + var23.d + aw.eS + var23.l + aw.eT);
         }
      }

      if (var1 == 10000) {
         var14 = (r)var2;
         bt.a().b((byte)1, (int)var14.c.J);
         main.a.G.z();
      }

      if (var1 == 10001) {
         var14 = (r)var2;
         bt.a().b((byte)2, (int)var14.c.J);
         bp.a();
      }

      cq var16;
      g var24;
      if (var1 == 10012) {
         if (this.o == null) {
            this.o = new cq();
            this.o.a.b = main.a.B - 35 - cq.b().a.d;
            this.o.a();
            var16 = this.o;
            if (main.a.H == null) {
               var24 = main.a.G;
            } else {
               var24 = main.a.H;
            }

            var16.c = var24;
         }

         this.o.a.c(1);
         this.o.a.a("");
         if (this.bC.h == 1) {
            this.o.h = aw.fH;
            this.o.a.i = aw.ec;
         } else {
            this.o.h = aw.eg + " ";
            this.o.a.i = aw.eg;
         }

         this.o.a.b(10);
         this.o.g = "";
         this.o.b = true;
         this.o.a.c(1);
         if (main.a.e) {
            this.o.a.a();
         }
      }

      if (var1 == 10013) {
         if (this.o == null) {
            this.o = new cq();
            this.o.a.b = main.a.B - 35 - cq.b().a.d;
            this.o.a();
            var16 = this.o;
            if (main.a.H == null) {
               var24 = main.a.G;
            } else {
               var24 = main.a.H;
            }

            var16.c = var24;
         }

         this.o.a.c(1);
         this.o.a.a("");
         if (this.bC.h == 1) {
            this.o.h = aw.fI;
            this.o.a.i = aw.ec;
         } else {
            this.o.h = aw.eg + "  ";
            this.o.a.i = aw.eg;
         }

         this.o.g = "";
         this.o.b = true;
         this.o.a.c(1);
         if (main.a.e) {
            this.o.a.a();
         }
      }

      if (var1 == 10014) {
         var12 = (h)var2;
         bt.a().a((byte)1, var12.d, (byte)-1, -1, -1);
         bp.a();
      }

      if (var1 == 10015) {
         var12 = (h)var2;
         bt.a().a((byte)2, var12.d, (byte)-1, -1, -1);
         bp.a();
      }

      if (var1 == 10016) {
         var12 = (h)var2;
         bt.a().a((byte)3, var12.d, (byte)0, var12.n, -1);
         bp.a();
      }

      if (var1 == 10017) {
         var12 = (h)var2;
         bt.a().a((byte)3, var12.d, (byte)1, var12.p, -1);
         bp.a();
      }

      if (var1 == 10018) {
         h var10 = (h)var2;
         bt.a().a((byte)5, var10.d, (byte)-1, -1, -1);
         bp.a();
      }

      if (var1 == 10019) {
         br.a().e();
         av.a("acc", "");
         av.a("pass", "");
         main.a.I.b.a("");
         main.a.I.a.a("");
         main.a.I.n = false;
         main.a.ak.b();
         main.a.h();
         this.A();
      }

      if (var1 == 10020) {
         main.a.h();
      }

      if (var1 == 10030) {
         bt.a().b((byte)1, (byte)((byte)this.ak));
         main.a.G.z();
      }

      if (var1 == 10031) {
         br.a().e();
      }

      if (var1 == 11000) {
         bt.a().a((byte)0, this.bC.d, (byte)1, this.bC.t, 1);
         main.a.h();
      }

      if (var1 == 11001) {
         bt.a().a((byte)0, this.bC.d, (byte)1, this.bC.t, this.bC.i);
         main.a.h();
      }

      if (var1 == 11002) {
         this.o.b = false;
         main.a.h();
      }

   }

   public final void a(af var1) {
      this.A = 10;
      this.c(0);
      this.g();
      this.ac = var1;
   }

   public final void a(en var1) {
      var1.a(-var1.a(), -var1.b());
      var1.a(-this.h, 0);
      var1.a(this.b, 0);
      int var2;
      do var8;
      if (main.a.G.av != -1) {
         if (this.equals(main.a.G)) {
            p.j();
            p.b(var1);
            var1.a(-p.j, -p.k);
            if (this.cX < 3) {
               for(var2 = 0; var2 < p.G.size(); ++var2) {
                  var8 = (do)p.G.elementAt(var2);
                  if (var8.df.a == this.aw) {
                     var8.a(var1);
                     if (var8.z != null) {
                        var8.z.a(var1, var8.B, var8.C - var8.al - main.a.ae, var8.I);
                     }
                  }
               }
            }

            main.a.a(var1);
            if (main.a.w % 4 == 0) {
               var1.a(ce.f, this.ax - 5, this.ay + 15, 33);
               var1.a(ce.f, this.ax + 5, this.ay + 15, 33);
               var1.a(ce.f, this.ax, this.ay + 15, 33);
            }

            for(var2 = 0; var2 < dc.w.size(); ++var2) {
               ((dc)dc.w.elementAt(var2)).a(var1);
            }

            if (main.a.w % 4 == 0) {
               var1.a(ce.f, this.ax, this.ay + 15, 33);
            }

            if (this.cX == 0) {
               for(var2 = 0; var2 < this.cT.length; ++var2) {
                  bl.b(var1, this.aA, this.ax, this.ay, 0, 3);
                  if (this.dd) {
                     bl.b(var1, this.de, this.cU[var2], this.cV[var2], 0, 3);
                  }
               }
            } else if (this.cX == 1) {
               if (!this.dd) {
                  bl.b(var1, this.aB, this.ax, this.ay, 0, 3);
               } else {
                  for(var2 = 0; var2 < this.cT.length; ++var2) {
                     bl.b(var1, this.aA, this.cU[0], this.cV[0], 0, 3);
                     bl.b(var1, this.de, this.cU[1], this.cV[1], 0, 3);
                  }
               }
            } else if (this.cX == 2) {
               if (!this.dd) {
                  bl.b(var1, this.aB, this.ax, this.ay, 0, 3);
               } else {
                  for(var2 = 0; var2 < this.cT.length; ++var2) {
                     bl.b(var1, this.aA, this.cU[var2], this.cV[var2], 0, 3);
                  }
               }
            } else if (this.cX == 3) {
               if (!this.dd) {
                  bl.b(var1, this.aB, this.ax, this.ay, 0, 3);
               } else {
                  bl.b(var1, this.aA, this.ax, this.ay, 0, 3);
               }
            } else if (this.cX == 4) {
               if (!this.dd) {
                  if (this.aB != -1) {
                     bl.b(var1, this.aB, this.ax, this.ay, 0, 3);
                  }
               } else {
                  for(var2 = 0; var2 < this.df.length; ++var2) {
                     bl.b(var1, this.df[var2], this.cU[var2], this.cV[var2], 0, 3);
                  }
               }
            }
         }
      } else {
         cx.c(this.b, 0, this.d, this.e, var1);

         int var3;
         label803: {
            boolean var10001;
            try {
               var1.e(this.b + 1, 0, this.d - 2, this.af - 2);
               var1.a(9993045);
               var1.d(this.b, 0, this.d - 2, 50);
               var2 = this.A;
            } catch (Exception var65) {
               var10001 = false;
               break label803;
            }

            StringBuffer var72;
            di var9;
            String var73;
            di var74;
            di var10;
            StringBuffer var75;
            String var77;
            label713:
            switch(var2) {
            case 0:
               try {
                  if (this.B == 0) {
                     bl.b(var1, af.e().d(), this.b + 25, 50, 0, 33);
                     this.A(var1);
                  }
               } catch (Exception var61) {
                  var10001 = false;
                  break;
               }

               try {
                  if (this.B == 1) {
                     bl.b(var1, af.e().d(), this.b + 25, 50, 0, 33);
                     this.C(var1);
                  }
               } catch (Exception var60) {
                  var10001 = false;
                  break;
               }

               label812: {
                  label698: {
                     try {
                        if (this.B != 2) {
                           break label812;
                        }

                        bl.b(var1, af.e().d(), this.b + 25, 50, 0, 33);
                        var74 = di.s;
                        var75 = new StringBuffer("Top ");
                        var77 = var75.append(af.e().w).toString();
                        var2 = this.b;
                        var74.a(var1, var77, (this.d - 50) / 2 + var2 + 45, 2, 2);
                        var9 = di.n;
                        var73 = aw.eF;
                        var2 = this.b;
                        var9.a(var1, var73, (this.d - 50) / 2 + var2 + 45, 14, 2);
                        var74 = di.s;
                        var75 = new StringBuffer();
                        var77 = var75.append(ai.a(af.e().aa)).toString();
                        var3 = this.b;
                        if (main.a.w % 20 > 10) {
                           var2 = main.a.w % 4 / 2;
                           break label698;
                        }
                     } catch (Exception var59) {
                        var10001 = false;
                        break;
                     }

                     var2 = 0;
                  }

                  label688: {
                     try {
                        var74.a(var1, var77, (this.d - 50) / 2 + var2 + var3 + 45, 26, 2);
                        var74 = di.n;
                        var75 = new StringBuffer(String.valueOf(aw.bL));
                        var77 = var75.append(": ").append(ai.a(af.e().ab)).toString();
                        var3 = this.b;
                        if (main.a.w % 20 > 10) {
                           var2 = main.a.w % 4 / 2;
                           break label688;
                        }
                     } catch (Exception var58) {
                        var10001 = false;
                        break;
                     }

                     var2 = 0;
                  }

                  try {
                     var74.a(var1, var77, (this.d - 50) / 2 + var2 + var3 + 45, 38, 2);
                  } catch (Exception var57) {
                     var10001 = false;
                     break;
                  }
               }

               label814: {
                  label815: {
                     try {
                        if (this.B != 3) {
                           break label814;
                        }

                        if (this.D.length != 5) {
                           break label815;
                        }

                        if (af.e().ai == null) {
                           bl.b(var1, af.e().d(), 25, 50, 0, 33);
                           di.c.a(var1, aw.dq, (this.ag - 50) / 2 + 50, 20, 2);
                           break label814;
                        }
                     } catch (Exception var56) {
                        var10001 = false;
                        break;
                     }

                     eh var80;
                     label666: {
                        try {
                           if (this.an) {
                              break label666;
                           }

                           var80 = af.e().ai;
                        } catch (Exception var55) {
                           var10001 = false;
                           break;
                        }

                        if (var80 != null) {
                           try {
                              bl.b(var1, af.e().d(), 25, 50, 0, 33);
                              di.c.a(var1, var80.c, 60, 4, 0, di.f);
                              var9 = di.n;
                              StringBuffer var76 = new StringBuffer(String.valueOf(aw.eG));
                              var9.a(var1, var76.append(": ").append(var80.f).toString(), 60, 16, 0, di.o);
                              var9 = di.n;
                              var76 = new StringBuffer(String.valueOf(aw.cT));
                              var9.a(var1, var76.append(": ").append(var80.k).toString(), 60, 27, 0, di.o);
                              var10 = di.n;
                              var75 = new StringBuffer(String.valueOf(aw.dn));
                              var10.a(var1, var75.append(": ").append(var80.j).toString(), 60, 38, 0, di.o);
                              ag.a(var1, var80.d, 60, 38, this.ag - 70, this.aD, di.n);
                           } catch (Exception var53) {
                              var10001 = false;
                              break;
                           }
                        }
                        break label814;
                     }

                     label817: {
                        try {
                           if (this.bD != null) {
                              var80 = this.bD;
                              break label817;
                           }
                        } catch (Exception var54) {
                           var10001 = false;
                           break;
                        }

                        try {
                           var80 = af.e().ai;
                        } catch (Exception var52) {
                           var10001 = false;
                           break;
                        }
                     }

                     try {
                        bl.b(var1, af.e().d(), 25, 50, 0, 33);
                        di.c.a(var1, var80.c, 60, 4, 0, di.f);
                        var10 = di.n;
                        var75 = new StringBuffer(String.valueOf(aw.de));
                        var10.a(var1, var75.append(": ").append(var80.g).append("/").append(var80.h).toString(), 60, 16, 0, di.o);
                        var10 = di.n;
                        var75 = new StringBuffer(String.valueOf(aw.db));
                        var10.a(var1, var75.append(": ").append(var80.i).toString(), 60, 27, 0, di.o);
                        ag.a(var1, var80.d, 60, 38, this.ag - 70, this.aD, di.n);
                        break label814;
                     } catch (Exception var51) {
                        var10001 = false;
                        break;
                     }
                  }

                  try {
                     bl.b(var1, af.e().d(), this.b + 25, 50, 0, 33);
                     z(var1);
                  } catch (Exception var50) {
                     var10001 = false;
                     break;
                  }
               }

               try {
                  if (this.B == 4) {
                     bl.b(var1, af.e().d(), this.b + 25, 50, 0, 33);
                     z(var1);
                  }
               } catch (Exception var49) {
                  var10001 = false;
               }
               break;
            case 1:
               label819: {
                  try {
                     if (this.B == this.aY.length - 1 && main.a.H == null) {
                        bl.b(var1, af.e().d(), this.b + 25, 50, 0, 33);
                        break label819;
                     }
                  } catch (Exception var69) {
                     var10001 = false;
                     break;
                  }

                  try {
                     if (af.e().aT != null) {
                        int var10002 = this.b + 25;
                        bl.b(var1, af.e().aT.aO, var10002, 50, 0, 33);
                     }
                  } catch (Exception var68) {
                     var10001 = false;
                     break;
                  }
               }

               try {
                  if (this.B == this.aY.length - 1 && main.a.H == null) {
                     this.A(var1);
                     break;
                  }
               } catch (Exception var64) {
                  var10001 = false;
                  break;
               }

               label732: {
                  try {
                     if (this.ak >= 0) {
                        break label732;
                     }

                     if (this.bJ != 2) {
                        di.s.a(var1, aw.eq, this.b + 60, 14, 0);
                        di.s.a(var1, ar, this.b + 60, 26, 0);
                        break;
                     }
                  } catch (Exception var67) {
                     var10001 = false;
                     break;
                  }

                  try {
                     di.s.a(var1, aw.eq, this.b + 60, 5, 0);
                     di.s.a(var1, ar, this.b + 60, 17, 0);
                     var9 = di.s;
                     var72 = new StringBuffer(String.valueOf(aw.fO));
                     var9.a(var1, var72.append(" ").append(this.L[this.B] + 1).append("/").append(this.K[this.B]).toString(), this.b + 60, 29, 0);
                  } catch (Exception var47) {
                     var10001 = false;
                  }
                  break;
               }

               h var79;
               try {
                  if (this.B < 0 || this.B > af.e().aJ.length - 1 || this.ak < 0 || this.ak > af.e().aJ[this.B].length - 1) {
                     break;
                  }

                  var79 = af.e().aJ[this.B][this.ak];
               } catch (Exception var63) {
                  var10001 = false;
                  break;
               }

               if (var79 != null) {
                  try {
                     if (this.equals(main.a.G) && this.B <= 3 && this.bJ == 2) {
                        var10 = di.c;
                        var75 = new StringBuffer(String.valueOf(aw.fO));
                        var10.a(var1, var75.append(" ").append(this.L[this.B] + 1).append("/").append(this.K[this.B]).toString(), this.b + 55, 4, 0);
                     }
                  } catch (Exception var62) {
                     var10001 = false;
                     break;
                  }

                  try {
                     di.c.a(var1, var79.b.d, this.b + 55, 24, 0);
                     var75 = new StringBuffer(String.valueOf(aw.ct));
                     var77 = var75.append(" ").append(ds.a((long)var79.b.i)).toString();
                     if ((long)var79.b.i > af.e().y) {
                        di.n.a(var1, var77, this.b + 55, 35, 0);
                        break;
                     }
                  } catch (Exception var66) {
                     var10001 = false;
                     break;
                  }

                  try {
                     di.r.a(var1, var77, this.b + 55, 35, 0);
                  } catch (Exception var48) {
                     var10001 = false;
                  }
               }
               break;
            case 2:
               try {
                  if (this.B == 0) {
                     bl.b(var1, 526, this.b + 25, 50, 0, 33);
                     var72 = new StringBuffer(String.valueOf(aw.cv));
                     var73 = var72.append(": ").append(this.N).append("/").append(af.e().aG.length).append(" ").append(aw.cw).toString();
                     di.c.a(var1, aw.cc, 60, 4, 0);
                     di.n.a(var1, var73, 60, 16, 0);
                  }
               } catch (Exception var46) {
                  var10001 = false;
                  break;
               }

               try {
                  if (this.B == 1) {
                     bl.b(var1, af.e().d(), this.b + 25, 50, 0, 33);
                     this.C(var1);
                  }
               } catch (Exception var45) {
                  var10001 = false;
               }
               break;
            case 3:
               try {
                  bl.b(var1, 561, this.b + 25, 50, 0, 33);
                  var9 = di.c;
                  var72 = new StringBuffer(String.valueOf(aw.ck));
                  var9.a(var1, var72.append(" ").append(bv.n).toString(), 60, 4, 0, di.f);
                  di.n.a(var1, bv.k, 60, 16, 0, di.o);
                  var9 = di.c;
                  var72 = new StringBuffer(String.valueOf(bv.n));
                  var9.a(var1, var72.toString(), 25, 27, 2);
               } catch (Exception var44) {
                  var10001 = false;
               }
               break;
            case 4:
               try {
                  bl.b(var1, af.e().d(), this.b + 25, 50, 0, 33);
                  B(var1);
               } catch (Exception var43) {
                  var10001 = false;
               }
            case 5:
            case 6:
            default:
               break;
            case 7:
            case 17:
               try {
                  bl.b(var1, af.e().d(), this.b + 25, 50, 0, 33);
                  this.A(var1);
               } catch (Exception var42) {
                  var10001 = false;
               }
               break;
            case 8:
               try {
                  bl.b(var1, af.e().d(), this.b + 25, 50, 0, 33);
                  this.A(var1);
               } catch (Exception var41) {
                  var10001 = false;
               }
               break;
            case 9:
               try {
                  bl.b(var1, af.e().d(), this.b + 25, 50, 0, 33);
                  this.A(var1);
               } catch (Exception var40) {
                  var10001 = false;
               }
               break;
            case 10:
               try {
                  if (this.ac != null) {
                     bl.b(var1, this.ac.d(), this.b + 25, 50, 0, 33);
                     this.a(var1, this.ac);
                  }
               } catch (Exception var39) {
                  var10001 = false;
               }
               break;
            case 11:
            case 16:
            case 23:
            case 24:
               try {
                  bl.b(var1, af.e().d(), this.b + 25, 50, 0, 33);
                  this.A(var1);
               } catch (Exception var38) {
                  var10001 = false;
               }
               break;
            case 12:
               label804: {
                  try {
                     if (this.B != 0) {
                        break label804;
                     }
                  } catch (Exception var37) {
                     var10001 = false;
                     break;
                  }

                  var3 = 1410;
                  var2 = 0;

                  while(true) {
                     try {
                        if (var2 >= p.G.size()) {
                           bl.b(var1, var3, this.b + 25, 50, 0, 33);
                           if (this.aq == null) {
                              break label804;
                           }
                           break;
                        }
                     } catch (Exception var36) {
                        var10001 = false;
                        break label713;
                     }

                     try {
                        var8 = (do)p.G.elementAt(var2);
                     } catch (Exception var33) {
                        var10001 = false;
                        break label713;
                     }

                     try {
                        if (var8.df.a == this.aw) {
                           var3 = var8.aO;
                        }
                     } catch (Exception var35) {
                        var10001 = false;
                        break label713;
                     }

                     ++var2;
                  }

                  var2 = 0;

                  while(true) {
                     try {
                        if (var2 >= this.aq.length) {
                           break;
                        }
                     } catch (Exception var34) {
                        var10001 = false;
                        break label713;
                     }

                     try {
                        var74 = di.s;
                        var77 = this.aq[var2];
                        var3 = this.b;
                        var74.a(var1, var77, (this.d - 50) / 2 + var3 + 45, var2 * 14 + 5, 2);
                     } catch (Exception var32) {
                        var10001 = false;
                        break label713;
                     }

                     ++var2;
                  }
               }

               try {
                  if (this.B == 1) {
                     bl.b(var1, af.e().d(), this.b + 25, 50, 0, 33);
                     this.A(var1);
                  }
               } catch (Exception var31) {
                  var10001 = false;
               }
               break;
            case 13:
               label818: {
                  try {
                     if (this.B != 0 && this.B != 1) {
                        break label818;
                     }
                  } catch (Exception var30) {
                     var10001 = false;
                     break;
                  }

                  try {
                     if (this.equals(main.a.G)) {
                        bl.b(var1, af.e().d(), this.b + 25, 50, 0, 33);
                        di.n.a(var1, aw.eo, 60, 4, 0, di.o);
                        di.n.a(var1, aw.dP, 60, 16, 0, di.o);
                        di.n.a(var1, aw.dQ, 60, 27, 0, di.o);
                        di.n.a(var1, aw.dR, 60, 38, 0, di.o);
                     }
                  } catch (Exception var29) {
                     var10001 = false;
                     break;
                  }

                  try {
                     if (this.equals(main.a.H) && this.ac != null) {
                        bl.b(var1, this.ac.d(), this.b + 25, 50, 0, 33);
                        this.a(var1, this.ac);
                     }
                  } catch (Exception var28) {
                     var10001 = false;
                     break;
                  }
               }

               try {
                  if (this.B == 2 && this.ac != null) {
                     bl.b(var1, this.ac.d(), this.b + 25, 50, 0, 33);
                     this.a(var1, this.ac);
                  }
               } catch (Exception var27) {
                  var10001 = false;
               }
               break;
            case 14:
               try {
                  bl.b(var1, af.e().d(), this.b + 25, 50, 0, 33);
                  B(var1);
               } catch (Exception var26) {
                  var10001 = false;
               }
               break;
            case 15:
               try {
                  bl.b(var1, af.e().d(), this.b + 25, 50, 0, 33);
                  this.A(var1);
               } catch (Exception var25) {
                  var10001 = false;
               }
               break;
            case 18:
               try {
                  bl.b(var1, af.e().d(), this.b + 25, 50, 0, 33);
                  this.A(var1);
               } catch (Exception var24) {
                  var10001 = false;
               }
               break;
            case 19:
               try {
                  bl.b(var1, af.e().d(), this.b + 25, 50, 0, 33);
                  z(var1);
               } catch (Exception var23) {
                  var10001 = false;
               }
               break;
            case 20:
               try {
                  bl.b(var1, af.e().d(), this.b + 25, 50, 0, 33);
                  z(var1);
               } catch (Exception var22) {
                  var10001 = false;
               }
               break;
            case 21:
               label808: {
                  label552: {
                     label809: {
                        try {
                           if (this.B != 0) {
                              break label808;
                           }

                           bl.b(var1, af.f().d(), this.b + 25, 50, 0, 33);
                           var9 = di.n;
                           var72 = new StringBuffer(String.valueOf(aw.cZ));
                           var9.a(var1, var72.append(": ").append(ai.a(af.f().y)).toString(), this.b + 60, 4, 0, di.o);
                           if (af.f().y <= 0L) {
                              break label552;
                           }

                           var9 = di.n;
                           if (af.f().aq) {
                              var73 = af.f().c();
                              break label809;
                           }
                        } catch (Exception var21) {
                           var10001 = false;
                           break;
                        }

                        try {
                           var73 = af.f().bj;
                        } catch (Exception var19) {
                           var10001 = false;
                           break;
                        }
                     }

                     try {
                        var9.a(var1, var73, this.b + 60, 16, 0, di.o);
                     } catch (Exception var18) {
                        var10001 = false;
                        break;
                     }
                  }

                  try {
                     if (af.f().X > 0L) {
                        var74 = di.n;
                        var75 = new StringBuffer(String.valueOf(aw.eY));
                        var74.a(var1, var75.append(" :").append(af.f().X).toString(), this.b + 60, 27, 0, di.o);
                     }
                  } catch (Exception var17) {
                     var10001 = false;
                     break;
                  }

                  try {
                     if (af.f().cC > 0) {
                        di.n.a(var1, aw.fa, this.b + 60, 38, 0, di.o);
                        var1.a(p.aG, this.b + 100, 41, 0);
                        var2 = af.f().bf * en.a(p.aF) / af.f().cC;
                        var1.e(100, this.b + 41, var2, 20);
                        var1.a(p.aF, this.b + 100, 41, 0);
                     }
                  } catch (Exception var20) {
                     var10001 = false;
                     break;
                  }

                  try {
                     var1.e(0, 0, main.a.A, main.a.B);
                  } catch (Exception var16) {
                     var10001 = false;
                     break;
                  }
               }

               try {
                  if (this.B == 1) {
                     bl.b(var1, af.f().d(), this.b + 25, 50, 0, 33);
                     var9 = di.c;
                     var72 = new StringBuffer("HP: ");
                     var9.a(var1, var72.append(af.f().U).append("/").append(af.f().V).toString(), this.b + 60, 4, 0, di.f);
                     var74 = di.c;
                     var75 = new StringBuffer("MP: ");
                     var74.a(var1, var75.append(af.f().T).append("/").append(af.f().W).toString(), this.b + 60, 16, 0, di.f);
                     var9 = di.n;
                     var72 = new StringBuffer(String.valueOf(aw.fb));
                     var9.a(var1, var72.append(": ").append(af.f().P).append("|").append(aw.eZ).append(": ").append(af.f().Y).toString(), this.b + 60, 27, 0, di.o);
                     var9 = di.n;
                     var72 = new StringBuffer(String.valueOf(aw.u));
                     var9.a(var1, var72.append(": ").append(this.cm[af.f().A]).toString(), this.b + 60, 38, 0, di.o);
                  }
               } catch (Exception var15) {
                  var10001 = false;
                  break;
               }

               try {
                  if (this.B == 2) {
                     bl.b(var1, af.e().d(), this.b + 25, 50, 0, 33);
                     this.C(var1);
                  }
               } catch (Exception var14) {
                  var10001 = false;
               }
               break;
            case 22:
               try {
                  bl.b(var1, af.e().d(), this.b + 25, 50, 0, 33);
                  z(var1);
               } catch (Exception var13) {
                  var10001 = false;
               }
               break;
            case 25:
               try {
                  bl.b(var1, af.e().d(), this.b + 25, 50, 0, 33);
                  this.A(var1);
               } catch (Exception var12) {
                  var10001 = false;
               }
               break;
            case 26:
               try {
                  bl.b(var1, 561, this.b + 25, 50, 0, 33);
                  bl.b(var1, af.e().d(), this.b + 25, 50, 0, 33);
                  this.A(var1);
               } catch (Exception var11) {
                  var10001 = false;
               }
            }
         }

         if (this.A != 13 || this.B != 2 && !this.equals(main.a.H)) {
            var1.e(0, 0, main.a.A, main.a.B);
            var1.a(11837316);
            var1.d(this.b + 1, this.e - 15, this.d - 2, 14);
            var1.a(13524492);
            var1.d(this.b + 1, this.e - 15, this.d - 2, 1);
            var1.a(w, this.b + 11, this.e - 7, 3);
            var1.a(y, this.b + 75, this.e - 8, 3);
            di.n.a(var1, af.e().o, this.b + 24, this.e - 13, 0, di.o);
            di.n.a(var1, af.e().p, this.b + 85, this.e - 13, 0, di.o);
            var1.a(z, this.b + 130, this.e - 8, 3);
            di.n.a(var1, af.e().q, this.b + 140, this.e - 13, 0, di.o);
         }

         this.y(var1);
         switch(this.A) {
         case 0:
            if (this.B == 0) {
               this.E(var1);
            }

            if (this.B == 1) {
               this.x(var1);
            }

            if (this.B == 2) {
               this.j(var1);
            }

            if (this.B == 3) {
               if (this.D.length == 4) {
                  this.g(var1);
               } else {
                  this.u(var1);
               }
            }

            if (this.B == 4) {
               this.g(var1);
            }
            break;
         case 1:
            this.c(var1);
            break;
         case 2:
            if (this.B == 0) {
               this.o(var1);
            }

            if (this.B == 1) {
               this.x(var1);
            }
            break;
         case 3:
            this.m(var1);
            break;
         case 4:
            this.D(var1);
         case 5:
         case 6:
         case 22:
         default:
            break;
         case 7:
            this.x(var1);
            break;
         case 8:
            this.p(var1);
            break;
         case 9:
            this.v(var1);
            break;
         case 10:
            this.t(var1);
            break;
         case 11:
            this.s(var1);
            break;
         case 12:
            if (this.B == 0) {
               this.w(var1);
            }

            if (this.B == 1) {
               this.x(var1);
            }
            break;
         case 13:
            if (this.B == 0) {
               if (this.equals(main.a.G)) {
                  this.x(var1);
               } else {
                  this.a(var1, false);
               }
            }

            if (this.B == 1) {
               this.a(var1, true);
            }

            if (this.B == 2) {
               this.a(var1, false);
            }
            break;
         case 14:
            this.k(var1);
            break;
         case 15:
            this.b(var1);
            break;
         case 16:
            this.r(var1);
            break;
         case 17:
            this.c(var1);
            break;
         case 18:
            this.q(var1);
            break;
         case 19:
            this.F(var1);
            break;
         case 20:
            this.G(var1);
            break;
         case 21:
            if (this.B == 0) {
               this.e(var1);
            }

            if (this.B == 1) {
               this.d(var1);
            }

            if (this.B == 2) {
               this.x(var1);
            }
            break;
         case 23:
            this.i(var1);
            break;
         case 24:
            this.h(var1);
            break;
         case 25:
            this.n(var1);
            break;
         case 26:
            this.l(var1);
         }

         p.c(var1);
         if (this.ai != null && this.ai.d != null) {
            this.ai.a(var1);
            int var5 = this.ai.e + 13;
            int var4 = this.ai.f + 11;
            var2 = var4;
            var3 = var5;
            if (this.A == 15) {
               var3 = var5 + 5;
               var2 = var4 + 26;
            }

            if (this.A == 0 && this.B == 3) {
               if (this.al) {
                  var3 -= 5;
               } else if (this.bL != null || this.cH != null) {
                  var3 = this.ai.e;
                  var2 = this.ai.f + 40;
                  var3 += 21;
               }
            }

            if (this.bL != null) {
               av var81 = p.x[this.bL[0]];
               av var82 = p.x[this.bL[1]];
               av var78 = p.x[this.bL[2]];
               bl.b(var1, var81.a[af.bC[0][0][0]].a, af.bC[0][0][1] + var3 + var81.a[af.bC[0][0][0]].b, var2 - af.bC[0][0][2] + var81.a[af.bC[0][0][0]].c, 0, 0);
               short var6 = var82.a[af.bC[0][1][0]].a;
               int var7 = af.bC[0][1][1];
               byte var70 = var82.a[af.bC[0][1][0]].b;
               var5 = af.bC[0][1][2];
               bl.b(var1, var6, var70 + var7 + var3, var82.a[af.bC[0][1][0]].c + (var2 - var5), 0, 0);
               var6 = var78.a[af.bC[0][2][0]].a;
               var7 = af.bC[0][2][1];
               byte var71 = var78.a[af.bC[0][2][0]].b;
               var4 = af.bC[0][2][2];
               bl.b(var1, var6, var71 + var7 + var3, var78.a[af.bC[0][2][0]].c + (var2 - var4), 0, 0);
            } else if (this.cH != null) {
               this.cH.a(var1, var3 + 5, var2 + 25, 1, 0, true);
            } else if (this.bK != -1) {
               bl.b(var1, this.bK, this.ai.e + 8, this.ai.f + 2, 0, 20);
            }

            if (this.bC != null && this.bC.b.b != 5) {
               if (this.bC.A > 0) {
                  var1.a(aU, var3 - 7, var2 + 13, 3);
                  di.h.a(var1, String.valueOf(ds.g(this.bC.A)), var3 + 1, var2 + 8, 0);
               } else if (this.bC.A < 0 && this.bC.A != -1) {
                  var1.a(aV, var3 - 7, var2 + 13, 3);
                  di.a.a(var1, String.valueOf(ds.g(this.bC.A)), var3 + 1, var2 + 8, 0);
               }
            }
         }

         if (this.h == this.aK && !main.a.F.a) {
            this.aa.a(var1);
         }

         if (this.j != null && this.j.k) {
            this.j.a(var1);
         }
      }

   }

   public final void a(String var1, String var2) {
      if (this.o.a.d() != null && !this.o.a.d().equals("") && !var1.equals("") && var1 != null) {
         if (this.o.h.equals(aw.ds)) {
            bp.a();
            this.o.b = false;
            bt.a().a(var1);
         } else if (this.o.h.equals(aw.du)) {
            bp.a();
            this.o.b = false;
            bt.a().a(0, var1, -1);
         } else if (this.o.h.equals(aw.dv)) {
            if (this.o.a.d() == "") {
               p.aD.a(aw.dF, 0);
            } else {
               if (this.j == null) {
                  this.j = new dr();
               }

               this.j.m = this.o.a.d();
               this.j.a(false);
               this.o.b = false;
            }
         } else if (this.o.h.equals(aw.dw)) {
            if (this.o.a.d() == "") {
               p.aD.a(aw.dG, 0);
            } else {
               bt.a().a((byte)4, af.e().ai.b, (String)this.o.a.d());
               this.o.b = false;
            }
         } else {
            int var3;
            if (this.o.h.equals(aw.fX)) {
               try {
                  var3 = Integer.parseInt(this.o.a.d());
                  this.o.b = false;
                  this.o.a.c(0);
                  this.A();
                  if (this.o.a.d().length() == 6 && !this.o.a.d().equals("")) {
                     bt.a().x(var3);
                     this.o.b = false;
                     this.o.a.c(0);
                     this.A();
                  } else {
                     main.a.a(aw.fY);
                  }
               } catch (Exception var8) {
                  main.a.a(aw.Q);
               }
            } else if (this.o.h.equals(aw.eA)) {
               if (!this.o.a.d().equals("")) {
                  bt.a().e(this.o.a.d());
                  this.o.b = false;
                  this.A();
               }
            } else if (this.o.h.equals(aw.cP)) {
               this.o.b = false;
               r var10 = null;
               if (this.A == 8) {
                  var10 = (r)this.bG.elementAt(this.cG);
               } else if (this.A == 11) {
                  var10 = (r)this.T.elementAt(this.cG);
               }

               if (var10.c.J != af.e().J) {
                  bt.a().a(var1, var10.c.J);
               }
            } else if (this.o.h.equals(aw.ef)) {
               try {
                  var3 = Integer.parseInt(this.o.a.d());
               } catch (Exception var7) {
                  main.a.a(aw.eh);
                  this.o.b = false;
                  this.o.a.c(0);
                  return;
               }

               if (var3 > 0 && var3 <= this.bC.h) {
                  this.bC.f = true;
                  h var9 = new h();
                  var9.b = this.bC.b;
                  var9.h = var3;
                  var9.g = this.bC.g;
                  var9.a = this.bC.a;
                  main.a.G.U.addElement(var9);
                  bt.a().a((byte)2, (int)-1, (byte)((byte)var9.g), (int)var9.h);
                  this.o.b = false;
                  this.o.a.c(0);
               } else {
                  main.a.a(aw.eh);
                  this.o.b = false;
                  this.o.a.c(0);
               }
            } else if (this.o.h == aw.eb) {
               try {
                  var3 = Integer.parseInt(this.o.a.d());
               } catch (Exception var6) {
                  main.a.a(aw.ed);
                  this.o.b = false;
                  this.o.a.c(0);
                  return;
               }

               if ((long)var3 > af.e().at) {
                  main.a.a(aw.ee);
                  this.o.b = false;
                  this.o.a.c(0);
               } else {
                  this.aR = var3;
                  bt.a().a((byte)2, (int)-1, (byte)-1, (int)var3);
                  this.o.b = false;
                  this.o.a.c(0);
               }
            } else if (this.o.h.equals(aw.fH)) {
               try {
                  bt.a().a((byte)0, this.bC.d, (byte)0, Integer.parseInt(this.o.a.d()), 1);
               } catch (Exception var5) {
                  main.a.a(aw.ed);
               }

               this.o.b = false;
            } else if (this.o.h.equals(aw.fH + " ")) {
               try {
                  bt.a().a((byte)0, this.bC.d, (byte)0, Integer.parseInt(this.o.a.d()), this.bC.i);
               } catch (Exception var4) {
                  main.a.a(aw.ed);
               }

               this.o.b = false;
            } else if (this.o.h.equals(aw.fI)) {
               this.e(0);
               this.o.b = false;
            } else if (this.o.h.equals(aw.fI + "  ")) {
               this.e(1);
               this.o.b = false;
            } else if (this.o.h.equals(aw.eg + " ")) {
               this.bC.i = Integer.parseInt(this.o.a.d());
               if (this.bC.i > this.bC.h) {
                  main.a.a(aw.eh);
               } else {
                  this.cJ = true;
                  this.o.b = false;
               }
            } else if (this.o.h.equals(aw.eg + "  ")) {
               this.bC.i = Integer.parseInt(this.o.a.d());
               if (this.bC.i > this.bC.h) {
                  main.a.a(aw.eh);
               } else {
                  this.cK = true;
                  this.o.b = false;
               }
            }
         }
      } else {
         this.o.b = false;
      }

   }

   public final void a(r var1) {
      this.bG.insertElementAt(var1, 0);
      if (this.bG.size() > 20) {
         this.bG.removeElementAt(this.bG.size() - 1);
      }

   }

   public final void a(boolean var1) {
      int var2;
      if (var1) {
         var2 = this.U.size() + 3;
      } else {
         var2 = this.V.size() + 3;
      }

      this.O = var2;
      this.aD = 24;
      byte var3;
      if (main.a.e) {
         var3 = -1;
      } else {
         var3 = 0;
      }

      this.ak = var3;
      this.aI = this.O * this.aD - this.ah;
      if (this.aI < 0) {
         this.aI = 0;
      }

      var2 = this.aJ[this.B];
      this.f = var2;
      this.g = var2;
      if (this.g < 0) {
         this.f = 0;
         this.g = 0;
      }

      if (this.g > this.aI) {
         var2 = this.aI;
         this.f = var2;
         this.g = var2;
      }

   }

   public final void b() {
      this.A = 14;
      this.c(0);
      this.aD = 24;
      this.O = this.E.length;
      this.aI = this.O * this.aD - this.ah;
      this.f = 0;
      this.g = 0;
      byte var1;
      if (main.a.e) {
         var1 = -1;
      } else {
         var1 = 0;
      }

      this.ak = var1;
      this.aK = 0;
      this.h = 0;
   }

   public final void b(int var1) {
      this.cX = var1;
      this.cM = 90;
      h var2;
      if (this.cX == 0) {
         this.cQ = 5;
         this.cO = 90;
         this.cN = 90;
         this.cW = 2;

         for(var1 = 0; var1 < this.k.size(); ++var1) {
            var2 = (h)this.k.elementAt(var1);
            if (var2 != null) {
               if (var2.b.b == 14) {
                  this.de = var2.b.f;
               } else {
                  this.aA = var2.b.f;
               }
            }
         }
      } else if (this.cX == 1) {
         this.cQ = 2;
         this.cO = 0;
         this.cN = 0;
         this.cW = 1;

         for(var1 = 0; var1 < this.k.size(); ++var1) {
            var2 = (h)this.k.elementAt(var1);
            if (var2 != null) {
               if (var1 == 0) {
                  this.aA = var2.b.f;
               } else {
                  this.de = var2.b.f;
               }
            }
         }
      } else if (this.cX == 2) {
         this.cQ = 7;
         this.cO = 25;
         this.cN = 25;
         this.cW = 1;

         for(var1 = 0; var1 < this.k.size(); ++var1) {
            var2 = (h)this.k.elementAt(var1);
            if (var2 != null) {
               this.aA = var2.b.f;
            }
         }
      } else if (this.cX == 3) {
         this.ax = main.a.C;
         this.ay = main.a.D;
         this.cQ = 1;
         this.cO = 1;
         this.cN = 1;
         this.cW = 4;

         for(var1 = 0; var1 < this.k.size(); ++var1) {
            var2 = (h)this.k.elementAt(var1);
            if (var2 != null) {
               this.aA = var2.b.f;
            }
         }
      } else if (this.cX == 4) {
         this.cQ = this.k.size();
         this.df = new short[this.cQ];
         this.cO = 25;
         this.cN = 25;
         this.cW = 1;

         for(var1 = 0; var1 < this.k.size(); ++var1) {
            var2 = (h)this.k.elementAt(var1);
            if (var2 != null) {
               this.df[var1] = var2.b.f;
            }
         }
      }

      this.cR = 1;
      this.db = true;
      this.az = false;
      this.dc = false;
      this.cP = 360 / this.cQ;
      this.cS = new int[this.cQ];
      this.cT = new int[this.cQ];
      this.cU = new int[this.cQ];
      this.cV = new int[this.cQ];
      this.aq();
      this.dd = true;
      this.cY = 10;
      this.cZ = 30;
      this.da = 10;
      this.a(this.aw, aw.A);
   }

   public final void b(af var1) {
      this.A = 13;
      this.M[this.A] = bg;
      this.aT = false;
      this.aS = false;
      this.m = false;
      this.U.removeAllElements();
      this.V.removeAllElements();
      this.aR = 0;
      this.l = 0;
      if (main.a.A > ab * 2) {
         g var2 = new g();
         main.a.H = var2;
         var2.A = 13;
         main.a.H.M[this.A] = new String[][]{aw.ci};
         main.a.H.c(1);
         main.a.H.a(false);
         main.a.G.M[this.A] = new String[][]{aw.ce, aw.ch};
         main.a.H.s();
         main.a.H.ac = var1;
      }

      if (this.equals(main.a.G)) {
         this.c(0);
      }

      if (this.B == 0) {
         this.b(true);
      }

      if (this.B == 1) {
         this.a(true);
      }

      if (this.B == 2) {
         this.a(false);
      }

      this.ac = var1;
   }

   public final void c() {
      byte var1 = 0;
      this.O = af.e().aE.length;
      this.c(0);
      this.A = 9;
      this.aI = this.O * this.aD - this.ah;
      int var2 = this.aJ[this.B];
      this.f = var2;
      this.g = var2;
      if (this.aI < 0) {
         this.aI = 0;
      }

      if (this.g < 0) {
         this.f = 0;
         this.g = 0;
      }

      if (this.g > this.aI) {
         this.f = 0;
         this.g = 0;
      }

      if (main.a.e) {
         var1 = -1;
      }

      this.ak = var1;
   }

   public final void d() {
      this.A = 17;
      this.c(1);
      this.e();
      this.bJ = 2;
      this.B = 0;
   }

   public final void e() {
      byte var1 = 0;
      this.aD = 24;
      this.O = af.e().aJ[4].length;
      this.aI = this.O * this.aD - this.ah;
      if (this.aI < 0) {
         this.aI = 0;
      }

      int var2 = this.aJ[this.B];
      this.f = var2;
      this.g = var2;
      if (this.g < 0) {
         this.f = 0;
         this.g = 0;
      }

      if (this.g > this.aI) {
         var2 = this.aI;
         this.f = var2;
         this.g = var2;
      }

      if (main.a.e) {
         var1 = -1;
      }

      this.ak = var1;
   }

   public final void f() {
      this.A = 7;
      this.c(1);
      this.b(true);
      this.B = 0;
   }

   public final void g() {
      byte var1 = 0;
      this.aD = 24;
      this.O = this.S.size();
      this.aI = this.O * this.aD - this.ah;
      if (this.aI < 0) {
         this.aI = 0;
      }

      int var2 = this.aJ[this.B];
      this.f = var2;
      this.g = var2;
      if (this.g < 0) {
         this.f = 0;
         this.g = 0;
      }

      if (this.g > this.aI) {
         var2 = this.aI;
         this.f = var2;
         this.g = var2;
      }

      if (main.a.e) {
         var1 = -1;
      }

      this.ak = var1;
   }

   public final void h() {
      this.A = 18;
      this.c(0);
      this.aD = 24;
      byte var1;
      if (main.a.e) {
         var1 = -1;
      } else {
         var1 = 0;
      }

      this.ak = var1;
      this.O = this.Y.size();
      this.aI = this.O * this.aD - this.ah;
      if (this.aI < 0) {
         this.aI = 0;
      }

      int var2 = this.aJ[this.B];
      this.f = var2;
      this.g = var2;
      if (this.g < 0) {
         this.f = 0;
         this.g = 0;
      }

      if (this.g > this.aI) {
         var2 = this.aI;
         this.f = var2;
         this.g = var2;
      }

      if (this.ak > this.O - 1) {
         this.ak = this.O - 1;
      }

      this.aK = 0;
      this.h = 0;
   }

   public final void i() {
      byte var1 = 0;
      this.A = 11;
      this.c(0);
      this.aD = 24;
      if (main.a.e) {
         var1 = -1;
      }

      this.ak = var1;
      this.k();
   }

   public final void j() {
      this.A = 16;
      this.c(0);
      this.aD = 24;
      byte var1;
      if (main.a.e) {
         var1 = -1;
      } else {
         var1 = 0;
      }

      this.ak = var1;
      this.O = this.X.size();
      this.aI = this.O * this.aD - this.ah;
      if (this.aI < 0) {
         this.aI = 0;
      }

      int var2 = this.aJ[this.B];
      this.f = var2;
      this.g = var2;
      if (this.g < 0) {
         this.f = 0;
         this.g = 0;
      }

      if (this.g > this.aI) {
         var2 = this.aI;
         this.f = var2;
         this.g = var2;
      }

      if (this.ak > this.O - 1) {
         this.ak = this.O - 1;
      }

      this.aK = 0;
      this.h = 0;
   }

   public final void k() {
      this.O = this.T.size();
      this.aI = this.O * this.aD - this.ah;
      if (this.aI < 0) {
         this.aI = 0;
      }

      int var1 = this.aJ[this.B];
      this.f = var1;
      this.g = var1;
      if (this.g < 0) {
         this.f = 0;
         this.g = 0;
      }

      if (this.g > this.aI) {
         var1 = this.aI;
         this.f = var1;
         this.g = var1;
      }

      if (this.ak > this.O - 1) {
         this.ak = this.O - 1;
      }

      this.aK = 0;
      this.h = 0;
   }

   public final void l() {
      this.A = 8;
      this.c(0);
      this.aD = 24;
      this.x();
      byte var1;
      if (main.a.e) {
         var1 = -1;
      } else {
         var1 = 0;
      }

      this.ak = var1;
      this.B = 0;
   }

   public final void m() {
      this.A = 2;
      if (main.a.A > ab * 2) {
         bc = new String[][]{aw.cd};
      } else {
         bc = new String[][]{aw.cd, aw.ce};
      }

      this.M[2] = bc;
      this.c(0);
      if (this.B == 0) {
         this.T();
      }

      if (this.B == 1) {
         this.b(true);
      }

      if (main.a.A > ab * 2) {
         g var1 = new g();
         main.a.H = var1;
         var1.M[7] = new String[][]{{""}};
         main.a.H.f();
         main.a.H.s();
      }

   }

   public final void n() {
      this.A = 12;
      if (main.a.A > ab * 2) {
         bd = new String[][]{aw.cf};
      } else {
         bd = new String[][]{aw.cf, aw.ce};
      }

      this.M[this.A] = bd;
      this.c(0);
      if (this.B == 0) {
         this.o();
      }

      if (this.B == 1) {
         this.b(true);
      }

      if (main.a.A > ab * 2) {
         g var1 = new g();
         main.a.H = var1;
         var1.M[7] = new String[][]{{""}};
         main.a.H.f();
         main.a.H.s();
      }

      this.av = -1;
      this.az = true;
   }

   public final void o() {
      byte var1 = 0;
      this.O = this.k.size() + 1;
      this.aD = 24;
      this.aI = this.O * this.aD - this.ah;
      if (this.aI < 0) {
         this.aI = 9;
      }

      int var2 = this.aJ[this.B];
      this.f = var2;
      this.g = var2;
      if (this.g < 0) {
         this.f = 0;
         this.g = 0;
      }

      if (this.g > this.aI) {
         var2 = this.aI;
         this.f = var2;
         this.g = var2;
      }

      if (main.a.e) {
         var1 = -1;
      }

      this.ak = var1;
   }

   public final void p() {
      this.A = 21;
      if (main.a.H != null) {
         bh = aw.aP;
      } else {
         bh = aw.aO;
      }

      this.M[21] = bh;
      if (af.e().K == 1) {
         this.cm = new String[]{aw.t, aw.s, aw.r, aw.v, aw.gk, aw.gl};
      } else {
         this.cm = new String[]{aw.t, aw.s, aw.r, aw.v, aw.gk};
      }

      this.c(2);
      if (this.B == 0) {
         this.U();
      }

      if (this.B == 1) {
         this.P();
      }

      if (this.B == 2) {
         this.b(true);
      }

   }

   public final void q() {
      this.A = 0;
      this.c(0);
      if (this.B == 1) {
         this.b(true);
      }

      if (this.B == 2) {
         this.R();
      }

      if (this.B == 3) {
         if (this.D.length == 4) {
            this.Q();
         } else {
            this.w();
         }
      }

      if (this.B == 4) {
         this.Q();
      }

   }

   public final void r() {
      this.A = 3;
      this.c(0);
      this.S();
      this.aK = 0;
      this.h = 0;
   }

   public final void s() {
      if (main.a.e) {
         this.aa.j = 156;
         this.aa.k = 3;
      } else {
         this.aa.j = main.a.A - 19;
         this.aa.k = main.a.B - 19;
      }

      this.aa.f = false;
      ae.m = null;
      bp.c();
      this.bM = 20;
      this.a = true;
      this.cD = false;
      bu.a();
      if (this.F()) {
         af.e().W();
      }

   }

   public final void t() {
      if (this.o != null && this.o.b) {
         if (this.o.d != null && (main.a.i[12] || bb.a(this.o.d)) && this.o.d != null) {
            this.o.d.a();
         }

         if (this.o.e != null && (main.a.i[13] || bb.a(this.o.e)) && this.o.e != null) {
            this.o.e.a();
         }

         if (this.o.f != null && (main.a.i[5] || bb.a(this.o.f)) && this.o.f != null) {
            this.o.f.a();
         }

         if (this.o.b && main.a.ag != 0) {
            this.o.a(main.a.ag);
            main.a.ag = 0;
         }

         main.a.g();
         main.a.f();
      }

   }

   public final void u() {
      byte var2 = 0;
      if ((this.o == null || !this.o.b) && main.a.G.az && !bp.a) {
         if (this.j != null && this.j.k) {
            dr var5 = this.j;
            if (var5.c != null && (main.a.i[12] || bb.a(var5.c))) {
               var5.c.a();
            }

            if (var5.d != null && (main.a.i[13] || bb.a(var5.d))) {
               var5.d.a();
            }

            if (!var5.l) {
               if (dr.f == null) {
                  return;
               }

               if (main.a.e) {
                  dr.f.a();
                  var5.n = dr.f.n;
               }

               if (main.a.i[2]) {
                  main.a.i[2] = false;
                  --var5.n;
                  if (var5.n < 0) {
                     var5.n = var5.e - 1;
                  }

                  dr.f.a(var5.n * dr.f.o);
               }

               if (main.a.i[8]) {
                  main.a.i[8] = false;
                  ++var5.n;
                  if (var5.n > var5.e - 1) {
                     var5.n = 0;
                  }

                  dr.f.a(var5.n * dr.f.o);
               }

               if (var5.n != -1) {
                  var5.o = var5.n;
               }
            }

            main.a.g();
            main.a.f();
         } else if (!this.cD && this.a) {
            if (this.aa.c()) {
               this.aa.a();
            } else {
               if (main.a.i[13]) {
                  if (this.A != 4) {
                     this.A();
                     return;
                  }

                  this.q();
                  this.aK = 0;
                  this.h = 0;
               }

               if (main.a.i[12] || main.a.i[5]) {
                  if (this.aW.e > 0) {
                     this.a(this.aW.e, this.aW.o);
                  } else {
                     this.bV = 2;
                  }
               }

               if (this.equals(main.a.G) && main.a.H == null && main.a.m && !main.a.b(this.b, 0, this.d, this.e) && !this.bT) {
                  this.A();
               } else {
                  int var3;
                  int var7;
                  if (!this.bP && (this.ci == null || !this.ci.m) && !this.bT) {
                     boolean var1;
                     label478: {
                        var3 = this.B;
                        if (this.dn > 0) {
                           if (this.aY.length > 1) {
                              if (this.ak == 0) {
                                 var1 = true;
                                 break label478;
                              }
                           } else if (this.ak >= 0) {
                              var1 = true;
                              break label478;
                           }
                        }

                        var1 = false;
                     }

                     if (!var1) {
                        if (main.a.i[6]) {
                           if (this.aw()) {
                              if (this.ak >= 0) {
                                 this.ax();
                              } else {
                                 ++this.B;
                                 if (this.B >= this.aY.length) {
                                    if (main.a.H != null) {
                                       this.B = this.aY.length - 1;
                                       main.a.W = true;
                                    } else {
                                       this.B = 0;
                                    }
                                 }

                                 this.ak = this.bp[this.B];
                                 this.aX[this.A] = this.B;
                              }
                           } else {
                              ++this.B;
                              if (this.B >= this.aY.length) {
                                 if (main.a.H != null) {
                                    this.B = this.aY.length - 1;
                                    main.a.W = true;
                                 } else {
                                    this.B = 0;
                                 }
                              }

                              this.ak = this.bp[this.B];
                              this.aX[this.A] = this.B;
                           }
                        }

                        if (main.a.i[4]) {
                           --this.B;
                           if (this.B < 0) {
                              this.B = this.aY.length - 1;
                           }

                           if (main.a.W) {
                              main.a.W = false;
                           }

                           this.ak = this.bp[this.B];
                           this.aX[this.A] = this.B;
                        }
                     }

                     this.cf = -1;

                     for(var7 = 0; var7 < this.aY.length; ++var7) {
                        if (main.a.b(this.C + this.aE * var7, 52, this.aE - 1, 25)) {
                           this.cf = var7;
                           if (main.a.m) {
                              this.B = var7;
                              this.aX[this.A] = var7;
                              main.a.m = false;
                              this.ak = this.bp[this.B];
                              if (var3 == this.B && this.bW == 0) {
                                 this.f = 0;
                                 byte var8;
                                 if (main.a.e) {
                                    var8 = -1;
                                 } else {
                                    var8 = 0;
                                 }

                                 this.ak = var8;
                              }
                              break;
                           }
                        }
                     }

                     if (var3 != this.B) {
                        this.dn = 0;
                        bu.a();
                        switch(this.A) {
                        case 0:
                           if (this.B == 0) {
                              this.aP = 0;
                           }

                           if (this.B == 1) {
                              this.b(true);
                           }

                           if (this.B == 2) {
                              this.R();
                           }

                           if (this.B == 3) {
                              if (this.D.length > 4) {
                                 this.w();
                              } else {
                                 this.Q();
                              }
                           }

                           if (this.B == 4) {
                              this.Q();
                           }
                           break;
                        case 1:
                           this.y();
                           break;
                        case 2:
                           if (this.B == 0) {
                              this.T();
                           }

                           if (this.B == 1) {
                              this.b(true);
                           }
                           break;
                        case 3:
                           this.S();
                           break;
                        case 12:
                           if (this.B == 0) {
                              this.o();
                           }

                           if (this.B == 1) {
                              this.b(true);
                           }
                           break;
                        case 13:
                           if (this.B == 0) {
                              if (this.equals(main.a.G)) {
                                 this.b(true);
                              } else if (this.equals(main.a.H)) {
                                 this.a(false);
                              }
                           }

                           if (this.B == 1) {
                              this.a(true);
                           }

                           if (this.B == 2) {
                              this.a(false);
                           }
                           break;
                        case 21:
                           if (this.B == 0) {
                              this.U();
                           }

                           if (this.B == 1) {
                              this.P();
                           }

                           if (this.B == 2) {
                              this.b(true);
                           }
                           break;
                        case 25:
                           this.av();
                        }

                        this.ak = this.bp[this.B];
                     }
                  }

                  int var6;
                  byte var9;
                  switch(this.A) {
                  case 0:
                     if (this.B == 0) {
                        if (main.a.j[2]) {
                           this.aP -= 5;
                        }

                        if (main.a.j[8]) {
                           this.aP += 5;
                        }

                        if (this.aP < 0) {
                           this.aP = 0;
                        }

                        var7 = this.cw * 12 - (this.ah - 60);
                        if (var7 < 0) {
                           var7 = var2;
                        }

                        if (this.aP > var7) {
                           this.aP = var7;
                        }

                        if (this.ci != null) {
                           if (!main.a.e) {
                              this.ci.d = this.aP;
                           }

                           this.ci.a();
                        }

                        var6 = this.ae + this.ag / 2 - 35;
                        if (main.a.B > 300) {
                           var9 = 20;
                        } else {
                           var9 = 15;
                        }

                        var3 = this.af + this.ah - var9 - 15;
                        var7 = main.a.p;
                        int var4 = main.a.q;
                        this.cd = -1;
                        if (as) {
                           p.j();
                           if (!p.e() && var7 >= var6 && var7 <= var6 + 70 && var4 >= var3 && var4 <= var3 + 30 && (this.ci == null || !this.ci.m)) {
                              this.cd = 1;
                              if (main.a.m) {
                                 bu.a();
                                 this.bV = 2;
                                 main.a.l();
                              }
                           }
                        }

                        main.a.f();
                        return;
                     }

                     if (this.B == 1) {
                        this.ay();
                     }

                     if (this.B == 2) {
                        this.O();
                     }

                     if (this.B == 3) {
                        if (this.D.length == 4) {
                           this.O();
                        } else {
                           this.O();
                           if (this.aZ != null) {
                              if (main.a.i[4]) {
                                 this.bE = this.X();
                                 --this.bN;
                                 if (this.ak == 0 && this.bN < 0) {
                                    this.bN = this.aZ.length - 1;
                                 }

                                 if (this.ak > 1 && this.am && this.bE.k != null && this.bN < 0) {
                                    this.bN = this.bE.k.length - 1;
                                 }
                              } else if (main.a.i[6]) {
                                 this.bE = this.X();
                                 ++this.bN;
                                 if (this.ak == 0 && this.bN > this.aZ.length - 1) {
                                    this.bN = 0;
                                 }

                                 if (this.ak > 1 && this.am && this.bE.k != null && this.bN > this.bE.k.length - 1) {
                                    this.bN = 0;
                                 }
                              }
                           }
                        }
                     }

                     if (this.B != 4) {
                        break;
                     }
                  case 20:
                     this.O();
                     break;
                  case 1:
                  case 17:
                  case 25:
                     var3 = this.B;
                     var6 = this.aY.length;
                     if (main.a.H != null) {
                        var9 = 0;
                     } else {
                        var9 = 1;
                     }

                     if (var3 < var6 - var9 && this.A != 17) {
                        this.O();
                     } else if (this.bJ == 0) {
                        this.ay();
                     } else {
                        this.O();
                     }
                     break;
                  case 2:
                     this.ay();
                     break;
                  case 3:
                  case 26:
                     this.O();
                     break;
                  case 4:
                     if (main.a.j[2]) {
                        this.cC -= 5;
                        this.aM = this.cC - (this.af + this.ah / 2);
                        if (this.cC < this.af) {
                           this.cC = this.af;
                        }
                     }

                     if (main.a.j[8]) {
                        this.cC += 5;
                        this.aM = this.cC - (this.af + this.ah / 2);
                        if (this.cC > this.af + 200) {
                           this.cC = this.af + 200;
                        }
                     }

                     if (main.a.j[4]) {
                        this.cB -= 5;
                        this.aL = this.cB - this.ag / 2;
                        if (this.cB < 16) {
                           this.cB = 16;
                        }
                     }

                     if (main.a.j[6]) {
                        this.cB += 5;
                        this.aL = this.cB - this.ag / 2;
                        if (this.cB > 250) {
                           this.cB = 250;
                        }
                     }

                     if (main.a.k) {
                        this.bT = true;
                        if (!this.bZ) {
                           this.bX = this.aL;
                           this.bY = this.aM;
                           this.bZ = true;
                        }

                        this.aL = this.bX + (main.a.t - main.a.p);
                        this.aM = this.bY + (main.a.u - main.a.q);
                     }

                     if (main.a.m) {
                        this.bZ = false;
                        main.a.t = main.a.p;
                        main.a.u = main.a.q;
                        this.ca = main.a.t + this.aL;
                        this.cb = main.a.u + this.aM;
                     }

                     if (main.a.l) {
                        this.bT = false;
                     }

                     if (this.aL < 0) {
                        this.aL = 0;
                     }

                     if (this.aL > this.aN) {
                        this.aL = this.aN;
                     }

                     if (this.aM < 0) {
                        this.aM = 0;
                     }

                     if (this.aM > this.aO) {
                        this.aM = this.aO;
                     }

                     main.a.f();
                     return;
                  case 5:
                  case 6:
                  case 22:
                  default:
                     break;
                  case 7:
                     this.ay();
                     break;
                  case 8:
                     this.O();
                     break;
                  case 9:
                     this.O();
                     break;
                  case 10:
                     this.O();
                     break;
                  case 11:
                  case 16:
                     this.O();
                     break;
                  case 12:
                     if (this.B == 0) {
                        this.O();
                        this.cc = -1;
                        if (this.ak == this.k.size() && main.a.l) {
                           main.a.l = false;
                           this.cc = 1;
                        }
                     }

                     if (this.B == 1) {
                        this.O();
                     }
                     break;
                  case 13:
                     if (this.B == 0) {
                        if (this.equals(main.a.G)) {
                           this.ay();
                        }

                        if (this.equals(main.a.H)) {
                           this.O();
                        }
                     }

                     if (this.B == 1 || this.B == 2) {
                        this.O();
                     }
                     break;
                  case 14:
                     this.O();
                     break;
                  case 15:
                     this.O();
                     break;
                  case 18:
                     this.O();
                     break;
                  case 19:
                     this.O();
                     break;
                  case 21:
                     if (this.B == 0) {
                        this.O();
                     }

                     if (this.B == 1) {
                        this.O();
                     }

                     if (this.B == 2) {
                        this.O();
                     }
                     break;
                  case 23:
                  case 24:
                     this.O();
                  }

                  main.a.g();

                  for(var7 = 0; var7 < main.a.i.length; ++var7) {
                     main.a.i[var7] = false;
                  }
               }
            }
         }
      }

   }

   public final void v() {
      int var1;
      if (this.al) {
         if (this.P == null) {
            var1 = 2;
         } else {
            var1 = this.P.length + 2;
         }

         this.O = var1;
         this.ch = aw.dp;
      } else if (this.an) {
         this.ao = "";
         if (this.Q == null) {
            var1 = this.R.size();
         } else {
            var1 = this.Q.size();
         }

         this.O = var1 + 2;
         StringBuffer var3 = (new StringBuffer(String.valueOf(aw.de))).append(" ");
         String var2;
         if (this.bD != null) {
            var2 = this.bD.c;
         } else {
            var2 = af.e().ai.c;
         }

         this.ch = var3.append(var2).toString();
      } else if (this.am) {
         this.O = cb.l.size() + 2;
         this.ch = aw.ad;
         this.ao = "";
      }

      if (af.e().ai == null) {
         this.cg = new String[][]{aw.dj, aw.di};
      } else if (!this.an) {
         if (this.R.size() > 1) {
            this.cg = new String[][]{aw.dg, aw.dm, aw.df};
         } else {
            this.cg = new String[][]{aw.df};
         }
      } else if (af.e().aj > 0) {
         this.cg = new String[][]{aw.ae, aw.dh};
      } else if (this.R.size() > 1) {
         this.cg = new String[][]{aw.ae, aw.dh, aw.dk, aw.dl};
      } else {
         this.cg = new String[][]{aw.ae, aw.dk, aw.dl};
      }

      this.aI = this.O * this.aD - this.ah;
      if (this.aI < 0) {
         this.aI = 0;
      }

      var1 = this.aJ[this.B];
      this.f = var1;
      this.g = var1;
      if (this.g < 0) {
         this.f = 0;
         this.g = 0;
      }

      if (this.g > this.aI) {
         var1 = this.aI;
         this.f = var1;
         this.g = var1;
      }

   }

   public final void w() {
      p.aW = false;
      this.aD = 24;
      if (this.bp != null && this.bp[3] == 0) {
         this.bp[3] = -1;
      }

      this.O = 2;
      if (af.e().ai != null) {
         this.am = true;
         this.an = false;
         this.al = false;
      } else {
         this.am = false;
         this.an = false;
         this.al = true;
      }

      if (af.e().ai != null) {
         this.O = cb.l.size() + 2;
      }

      this.v();
      this.bN = -1;
      if (this.o == null) {
         this.o = new cq();
         this.o.a.b = main.a.B - 35 - cq.b().a.d;
         this.o.a();
         this.o.c = main.a.G;
      }

      if (af.e().ai == null) {
         this.ao = aw.dJ;
         bt.a().a("");
      }

      this.ak = this.bp[this.B];
      if (main.a.e) {
         this.ak = -1;
      }

   }

   public final void x() {
      this.O = this.bG.size() + 1;
      this.aI = this.O * this.aD - this.ah;
      if (this.aI < 0) {
         this.aI = 0;
      }

      int var1 = this.aJ[this.B];
      this.f = var1;
      this.g = var1;
      if (this.g < 0) {
         this.f = 0;
         this.g = 0;
      }

      if (this.g > this.aI) {
         var1 = this.aI;
         this.f = var1;
         this.g = var1;
      }

      this.aK = 0;
      this.h = 0;
   }

   public final void y() {
      byte var1 = 0;
      this.aD = 24;
      if (this.B == this.aY.length - 1 && main.a.H == null && this.bJ != 2) {
         this.O = this.i(af.e().aH.length + af.e().aF.length);
      } else {
         this.O = af.e().aJ[this.B].length;
      }

      this.aI = this.O * this.aD - this.ah;
      if (this.aI < 0) {
         this.aI = 0;
      }

      int var2 = this.aJ[this.B];
      this.f = var2;
      this.g = var2;
      if (this.g < 0) {
         this.f = 0;
         this.g = 0;
      }

      if (this.g > this.aI) {
         var2 = this.aI;
         this.f = var2;
         this.g = var2;
      }

      if (main.a.e) {
         var1 = -1;
      }

      this.ak = var1;
   }

   public final void z() {
      if (this.bM > 0) {
         this.cD = false;
      } else {
         this.ai = null;
         if (this.F() || bv.l == 45) {
            af.e().X();
         }

         if (this.o != null && this.A == 13 && this.o.b) {
            this.o = null;
         }

         if (this.A == 13 && !this.aT) {
            bt.a().a((byte)3, (int)-1, (byte)-1, (int)-1);
         }

         bu.a();
         p.bt = true;
         bv.s = -1;
         aQ = null;
         System.gc();
         this.bP = false;
         this.cD = true;
         this.Z();
         v.a();
         main.a.H = null;
         main.a.l();
         main.a.f();
         this.bR = 0;
         this.bQ = 0;
         this.bT = false;
         this.a = false;
         if ((af.e().U <= 0L || af.e().H == 14 || af.e().H == 5) && af.e().cH) {
            de var1 = new de(aw.aW[0], 11038, p.j());
            p.j().cn = var1;
            af.e().U = 0L;
         }
      }

   }
}
