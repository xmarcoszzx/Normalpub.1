import javax.microedition.lcdui.Image;

public final class aq extends bb {
   private static int A;
   private static int B;
   private static int C;
   private static int D;
   private static int E;
   private static int F;
   private static int G;
   private static int H;
   private static int[] I = new int[0];
   private static int[] J = new int[0];
   private static int[][] K;
   private static int[][] L;
   private static int[] M;
   private static int S;
   public static df a;
   public static int b;
   public static int c;
   public static int d;
   public static int e;
   public static el f;
   public static el g;
   private static aq h;
   private static boolean i;
   private static df j;
   private static df k;
   private static Image l;
   private static Image m;
   private static Image n;
   private static Image o;
   private static Image p;
   private static Image q;
   private static Image r;
   private static Image s;
   private static Image t;
   private static Image u;
   private static Image v;
   private static Image w;
   private static Image x;
   private static Image y;
   private static Image[] z;
   private int N;
   private int[] O;
   private int P;
   private int Q;
   private int R = 0;
   private ef T;
   private int U = 0;
   private int V = 0;
   private int W;
   private int X;
   private int Y;

   static {
      int[] var0 = new int[]{-2, -1, 0, 1, 2};
      M = var0;
   }

   public aq() {
      i = true;
      Image var12 = l.b("/radar/17.png");
      Image var10 = l.b("/radar/3.png");
      Image var11 = l.b("/radar/23.png");
      j = new df(var12, 28, 28);
      k = new df(var10, 30, 30);
      a = new df(var11, 11, 11);
      l = l.b("/radar/0.png");
      n = l.b("/radar/1.png");
      o = l.b("/radar/2.png");
      m = l.b("/radar/17.png");
      p = l.b("/radar/4.png");
      q = l.b("/radar/5.png");
      r = l.b("/radar/6.png");
      z = new Image[7];

      int var1;
      for(var1 = 0; var1 < 7; ++var1) {
         z[var1] = l.b("/radar/" + (var1 + 7) + ".png");
      }

      s = l.b("/radar/14.png");
      t = l.b("/radar/15.png");
      u = l.b("/radar/16.png");
      m = l.b("/radar/18.png");
      w = l.b("/radar/19.png");
      x = l.b("/radar/20.png");
      y = l.b("/radar/21.png");
      v = l.b("/radar/22.png");
      C = 200;
      D = 219;
      A = main.a.C - (C + 40) / 2;
      B = main.a.D - D / 2;
      b = A + C - 81;
      c = B + 29;
      d = 120;
      e = 80;
      int[] var13 = new int[]{A + 34, B + D - 42};
      int var6 = A;
      int var8 = C / 2;
      int var2 = p.getWidth() / 2;
      int var9 = B;
      int var3 = D / 2;
      int var7 = A;
      int var5 = C;
      var1 = B;
      int var4 = D;
      K = new int[][]{var13, {var6 + var8 - var2, var9 + var3 + 33}, {var7 + var5 - 41, var1 + var4 - 42}};
      L = new int[][]{{A + 25, B + D - 82}, {A + 57, B + D - 62}, {A + C / 2 - 14, B + D - 102}, {A + C - 57 - 28, B + D - 62}, {A + C - 25 - 28, B + D - 82}};
      this.O = new int[2];
      this.N = 0;
      E = A + 73;
      F = B + D / 2 + 5;
      H = B + D - 22;
      I = new int[]{A + C / 2 - 8 - 80, A + C / 2 - 8, A + C / 2 - 8 + 80};
      J = new int[3];
      this.X = c + 10 + 70;
      this.Y = 0;
      f = new el("");
      g = new el("");
      this.P = 1;
      this.Q = 2;
   }

   public static aq a() {
      if (h == null) {
         h = new aq();
      }

      return h;
   }

   public static void a(int var0, int var1) {
      S = var0;
   }

   private void b(int var1) {
      byte var2 = 1;
      byte var3 = 1;
      if (var1 == 0) {
         boolean var4;
         if (i) {
            var4 = false;
         } else {
            var4 = true;
         }

         i = var4;
         this.P = 1;
         this.R = 0;
         byte var5;
         if (i) {
            int var6 = f.size() / 5;
            if (f.size() % 5 > 0) {
               var5 = var3;
            } else {
               var5 = 0;
            }

            this.Q = var6 + var5;
         } else {
            int var7 = g.size() / 5;
            if (g.size() % 5 > 0) {
               var5 = var2;
            } else {
               var5 = 0;
            }

            this.Q = var7 + var5;
         }

         this.f();
         e = 0;
      } else if (var1 == 1) {
         if (this.T != null) {
            bt.a().b((int)1, (int)this.T.e);
         }
      } else if (var1 == 2) {
         p.j().b();
      }

      bu.a();
   }

   private void c(int var1) {
      byte var4 = 0;
      byte var2 = 0;
      byte var3 = 1;
      if (i) {
         int var7 = f.size() / 5;
         if (f.size() % 5 > 0) {
            var2 = 1;
         }

         this.Q = var2 + var7;
      } else {
         int var5 = g.size() / 5;
         var2 = var4;
         if (g.size() % 5 > 0) {
            var2 = 1;
         }

         this.Q = var2 + var5;
      }

      int var6 = this.P;
      if (var1 == 0) {
         if (this.P == 1) {
            return;
         }

         var1 = var6 - 1;
         if (var1 <= 0) {
            var1 = var3;
         }
      } else {
         if (this.P == this.Q) {
            return;
         }

         ++var6;
         var1 = var6;
         if (var6 > this.Q) {
            var1 = this.Q;
         }
      }

      if (var1 != this.P) {
         this.P = var1;
         this.f();
      }

   }

   private void d(int var1) {
      var1 = G + var1 * 12;
      G = var1;
      if (var1 < 0) {
         G = 0;
      }

      if (G > this.T.r.h) {
         G = this.T.r.h;
      }

   }

   public static void e() {
      g = new el("");

      for(int var0 = 0; var0 < f.size(); ++var0) {
         ef var1 = (ef)f.elementAt(var0);
         if (var1 != null && var1.k == 1) {
            g.addElement(var1);
         }
      }

   }

   private void e(int var1) {
      int var2 = this.R;
      int var3 = this.P;
      if (var1 == 0) {
         var1 = var2 + 1;
      } else {
         var1 = var2 - 1;
      }

      if (var1 >= M.length) {
         if (this.P < this.Q) {
            var1 = var3 + 1;
            var2 = 0;
         } else {
            var2 = M.length - 1;
            var1 = var3;
         }
      } else {
         var2 = var1;
         var1 = var3;
      }

      if (var2 < 0) {
         if (this.P > 1) {
            var2 = M.length - 1;
            --var1;
         } else {
            var2 = 0;
         }
      }

      if (var2 != this.R) {
         this.R = var2;
         G = 0;
         e = 0;
      }

      if (var1 != this.P) {
         this.P = var1;
         this.f();
      }

   }

   private void f() {
      el var3 = g;
      if (i) {
         var3 = f;
      }

      int var2 = (this.P - 1) * 5;

      for(int var1 = var2; var1 < var2 + 5; ++var1) {
         if (var1 >= var3.size()) {
            M[var1 - var2] = -1;
         } else {
            ef var4 = (ef)var3.elementAt(var1);
            if (var4 != null) {
               M[var1 - var2] = var4.e;
            }
         }
      }

      bu.a();
   }

   public final void a(el var1, int var2, int var3) {
      byte var4 = 1;
      byte var6 = 1;
      f = var1;
      S = var2;
      this.P = 1;
      this.R = 2;
      this.f();
      i = true;
      e();
      byte var5;
      if (i) {
         int var7 = var1.size() / 5;
         if (var1.size() % 5 > 0) {
            var5 = var6;
         } else {
            var5 = 0;
         }

         this.Q = var5 + var7;
      } else {
         var3 = g.size() / 5;
         if (g.size() % 5 > 0) {
            var5 = var4;
         } else {
            var5 = 0;
         }

         this.Q = var5 + var3;
      }

   }

   public final void a(en var1) {
      Exception var10000;
      label214: {
         int var2;
         int var3;
         boolean var10001;
         label215: {
            Image var6;
            try {
               p.j().a(var1);
               var1.a(-p.j, -p.k);
               var1.a(0, main.a.ae);
               p.c(var1);
               var1.a(l, A, B, 0);
               var1.a(x, A + C / 2 - l.a(x) / 2, B - l.b(x) / 2 - 2, 0);
               var1.e(A + C / 2 - l.a(x) / 2 + 13, B - l.b(x) / 2 + 3, this.W, l.b(x));
               var1.a(y, A + C / 2 - l.a(x) / 2 + 13, B - l.b(x) / 2 + 3, 0);
               p.c(var1);
               var1.a(u, I[0], H + J[0], 0);
               var1.a(r, I[1], H + J[1], 0);
               var1.a(t, I[2], H + J[2], 0);
               if (i) {
                  var6 = s;
                  var2 = I[1];
                  var3 = H;
                  var1.a(var6, 0, 0, 17, 17, 0, var2, J[1] + var3, 0);
                  break label215;
               }
            } catch (Exception var29) {
               var10000 = var29;
               var10001 = false;
               break label214;
            }

            try {
               var6 = s;
               var3 = I[1];
               var2 = H;
               var1.a(var6, 0, 0, 17, 17, 1, var3, J[1] + var2, 0);
            } catch (Exception var28) {
               var10000 = var28;
               var10001 = false;
               break label214;
            }
         }

         ef var32;
         label216: {
            try {
               if (this.T == null) {
                  break label216;
               }

               var1.e(A + 30, B + 13, C - 60, D / 2);
               var32 = this.T;
               var2 = E;
               var3 = F;
               ++var32.p;
               if (var32.p > var32.o.length - 1) {
                  var32.p = 0;
               }
            } catch (Exception var27) {
               var10000 = var27;
               var10001 = false;
               break label214;
            }

            label217: {
               label218: {
                  try {
                     if (var32.d == 0) {
                        if (aa.c[var32.m.C] == null) {
                           break label217;
                        }

                        if (aa.c[var32.m.C].f == null) {
                           break label218;
                        }

                        aa.c[var32.m.C].f.a(var1, var32.o[var32.p], var2, var3, 0, 0);
                        break label217;
                     }
                  } catch (Exception var26) {
                     var10000 = var26;
                     var10001 = false;
                     break label214;
                  }

                  try {
                     if (var32.l != null) {
                        var32.l.a(var1, var2, var3, 1, var32.o[var32.p], true);
                     }
                     break label217;
                  } catch (Exception var25) {
                     var10000 = var25;
                     var10001 = false;
                     break label214;
                  }
               }

               try {
                  if (var32.q - main.a.b < 0L) {
                     var32.q = main.a.b + 1500L;
                     var32.m.v();
                  }
               } catch (Exception var24) {
                  var10000 = var24;
                  var10001 = false;
                  break label214;
               }
            }

            di var7;
            StringBuffer var8;
            String var33;
            label173: {
               try {
                  p.c(var1);
                  var7 = di.d;
                  var8 = new StringBuffer;
                  if (this.T.j > 0) {
                     StringBuffer var34 = new StringBuffer("Lv.");
                     var33 = var34.append(this.T.j).append(" ").toString();
                     break label173;
                  }
               } catch (Exception var23) {
                  var10000 = var23;
                  var10001 = false;
                  break label214;
               }

               var33 = "";
            }

            try {
               var8.<init>(String.valueOf(var33));
               var33 = var8.append(this.T.h).toString();
               var2 = A;
               var7.a(var1, var33, C / 2 + var2, B + 15, 2);
               di var36 = di.s;
               StringBuffer var35 = new StringBuffer("no.");
               var36.a(var1, var35.append(this.T.f).toString(), A + 30, c - 2, 0);
               var1.a(v, A + 36, c + 10, 0);
               var1.e(A + 36, this.X - this.Y, 7, this.Y);
               var1.a(w, A + 36, c + 10, 0);
               p.c(var1);
               var1.a(z[this.T.a], A + 39 - 5 + 14, c + 12, 0);
            } catch (Exception var22) {
               var10000 = var22;
               var10001 = false;
               break label214;
            }
         }

         try {
            var1.e(b, c, d + 5, e + 8);
            if (this.T != null) {
               var1.a(m, b, c, 0);
            }
         } catch (Exception var21) {
            var10000 = var21;
            var10001 = false;
            break label214;
         }

         try {
            p.c(var1);
            var1.e(b, c + 1, d, e + 5);
            if (this.T != null && this.T.r != null && this.T.r.d != null) {
               this.T.r.a(var1, G);
            }
         } catch (Exception var20) {
            var10000 = var20;
            var10001 = false;
            break label214;
         }

         label220: {
            label157: {
               try {
                  p.c(var1);
                  if (!i && g.size() > 5) {
                     break label157;
                  }
               } catch (Exception var19) {
                  var10000 = var19;
                  var10001 = false;
                  break label214;
               }

               try {
                  if (!i) {
                     break label220;
                  }
               } catch (Exception var18) {
                  var10000 = var18;
                  var10001 = false;
                  break label214;
               }
            }

            try {
               if (this.P > 1) {
                  var1.a(n, K[0][0], K[0][1] + this.O[0], 0);
               }
            } catch (Exception var17) {
               var10000 = var17;
               var10001 = false;
               break label214;
            }

            try {
               if (this.P < this.Q) {
                  var1.a(o, K[2][0], K[2][1] + this.O[1], 0);
               }
            } catch (Exception var16) {
               var10000 = var16;
               var10001 = false;
               break label214;
            }
         }

         var2 = 0;

         while(true) {
            try {
               if (var2 >= M.length) {
                  return;
               }
            } catch (Exception var13) {
               var10000 = var13;
               var10001 = false;
               break;
            }

            byte var4;
            int var5;
            byte var31;
            label136: {
               label135: {
                  try {
                     if (var2 != this.R) {
                        break label135;
                     }

                     var5 = this.N;
                     var1.a(p, L[var2][0] + 10, L[var2][1] + this.N + 29 - 10, 0);
                  } catch (Exception var15) {
                     var10000 = var15;
                     var10001 = false;
                     break;
                  }

                  var4 = 1;
                  var31 = -10;
                  break label136;
               }

               var4 = 0;
               var31 = 0;
               var5 = 0;
            }

            try {
               var32 = ef.a(g, M[var2]);
               if (i) {
                  var32 = ef.a(f, M[var2]);
               }
            } catch (Exception var12) {
               var10000 = var12;
               var10001 = false;
               break;
            }

            if (var32 != null) {
               try {
                  j.a(var32.a, L[var2][0], L[var2][1] + var5 + var31, 0, 0, var1);
                  bl.b(var1, var32.g, L[var2][0] + 14, L[var2][1] + 14 + var5 + var31, 0, cj.f);
                  var32.a(var1, L[var2][0], L[var2][1] + var5 + var31);
                  if (var32.j == 0) {
                     var1.a(q, L[var2][0], L[var2][1] + var5 + var31, 0);
                  }
               } catch (Exception var10) {
                  var10000 = var10;
                  var10001 = false;
                  break;
               }

               try {
                  if (var2 == this.R) {
                     j.a(7, L[var2][0], L[var2][1] + var5 + var31, 0, 0, var1);
                  }
               } catch (Exception var14) {
                  var10000 = var14;
                  var10001 = false;
                  break;
               }

               try {
                  if (var32.k == 1) {
                     j.a(8, L[var2][0], L[var2][1] + var5 + var31, 0, 0, var1);
                  }
               } catch (Exception var9) {
                  var10000 = var9;
                  var10001 = false;
                  break;
               }
            } else {
               try {
                  k.a(var4, L[var2][0] - 1, L[var2][1] - 1 + var5 + var31, 0, 0, var1);
               } catch (Exception var11) {
                  var10000 = var11;
                  var10001 = false;
                  break;
               }
            }

            ++var2;
         }
      }

      Exception var30 = var10000;
      System.out.println("-paint-radaScr-null: " + var30.toString());
   }

   public final void b() {
      p.a = true;
      super.b();
   }

   public final void c() {
      Exception var10000;
      label62: {
         boolean var10001;
         label58: {
            int var1;
            try {
               if (e >= 80) {
                  break label58;
               }

               var1 = e + 4;
               e = var1;
            } catch (Exception var8) {
               var10000 = var8;
               var10001 = false;
               break label62;
            }

            if (var1 > 80) {
               try {
                  e = 80;
               } catch (Exception var7) {
                  var10000 = var7;
                  var10001 = false;
                  break label62;
               }
            }
         }

         try {
            this.T = ef.a(g, M[this.R]);
            if (i) {
               this.T = ef.a(f, M[this.R]);
            }
         } catch (Exception var6) {
            var10000 = var6;
            var10001 = false;
            break label62;
         }

         label63: {
            try {
               p.j().c();
               if (main.a.w % 10 < 6) {
                  if (main.a.w % 2 == 0) {
                     --this.N;
                  }
                  break label63;
               }
            } catch (Exception var5) {
               var10000 = var5;
               var10001 = false;
               break label62;
            }

            try {
               this.N = 0;
            } catch (Exception var4) {
               var10000 = var4;
               var10001 = false;
               break label62;
            }
         }

         try {
            if (this.T != null) {
               this.Y = this.T.b * 100 / this.T.c * w.getHeight() / 100;
               this.W = S * 100 / f.size() * y.getWidth() / 100;
            }

            return;
         } catch (Exception var3) {
            var10000 = var3;
            var10001 = false;
         }
      }

      Exception var2 = var10000;
      System.out.println("-upd-radaScr-null: " + var2.toString());
   }

   public final void d() {
      if (!bp.b) {
         if (main.a.e && !cq.b().b && !main.a.F.a) {
            if (main.a.l) {
               int var1;
               for(var1 = 0; var1 < 5; ++var1) {
                  if (main.a.a(L[var1][0], L[var1][1], 30, 30) && main.a.l && main.a.m && var1 != this.R) {
                     this.R = var1;
                     this.f();
                  }
               }

               if (main.a.a(K[0][0] - 5, K[0][1] - 5, 20, 20)) {
                  if (main.a.k) {
                     this.O[0] = 1;
                  }

                  if (main.a.l && main.a.m) {
                     this.c(0);
                     this.O[0] = 0;
                  }
               }

               if (main.a.a(K[2][0] - 5, K[2][1] - 5, 20, 20)) {
                  if (main.a.k) {
                     this.O[1] = 1;
                  }

                  if (main.a.l && main.a.m) {
                     this.c(1);
                     this.O[1] = 0;
                  }
               }

               for(var1 = 0; var1 < I.length; ++var1) {
                  if (main.a.a(I[var1] - 5, H - 5, 20, 20)) {
                     if (main.a.k) {
                        J[var1] = 1;
                     }

                     if (main.a.l && main.a.m) {
                        this.b(var1);
                        J[var1] = 0;
                     }
                  }
               }
            } else {
               J[0] = 0;
               J[1] = 0;
               J[2] = 0;
               this.O[0] = 0;
               this.O[1] = 0;
            }

            if (main.a.a(b, 0, d, c + e)) {
               if (main.a.n) {
                  if (this.V == 0) {
                     this.V = main.a.q;
                  }

                  this.U = this.V - main.a.q;
                  if (this.U != 0) {
                     G += this.U;
                     this.V = main.a.q;
                  }

                  if (G < 0) {
                     G = 0;
                  }

                  if (G > this.T.r.h) {
                     G = this.T.r.h;
                  }
               } else {
                  this.V = 0;
                  this.V = 0;
               }
            }
         }

         if (main.a.i[8]) {
            main.a.i[8] = false;
            this.d(1);
         }

         if (main.a.i[2]) {
            main.a.i[2] = false;
            this.d(-1);
         }

         if (main.a.i[4]) {
            main.a.i[4] = false;
            this.e(1);
         }

         if (main.a.i[6]) {
            main.a.i[6] = false;
            this.e(0);
         }

         if (main.a.i[12]) {
            main.a.i[12] = false;
            this.b(0);
         }

         if (main.a.i[5]) {
            main.a.i[5] = false;
            this.b(1);
         }

         if (main.a.i[13]) {
            this.b(2);
         }

         main.a.f();
      }

   }
}
