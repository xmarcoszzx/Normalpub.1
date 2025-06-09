import javax.microedition.lcdui.Image;
import main.GameMidlet;

public final class ae extends dc implements b {
   private static long C;
   private static long D;
   private static String G;
   private static do H;
   private static boolean I;
   private static int K;
   public static ae m;
   public static ae n;
   public static dv q;
   public static int s = 7;
   public static int v;
   private int E;
   private String[] F;
   private int J;
   private int L;
   private int M = 0;
   private int N = 0;
   private int O = 0;
   private Image P;
   private int Q = 0;
   private int R = 0;
   public int a = 100;
   public int b;
   public int c;
   public String[] d;
   public int e;
   public int f;
   public int g;
   public int h;
   public do i;
   public de j;
   public de k;
   public de l;
   public byte o = 0;
   public byte p = 0;
   public boolean[] r = new boolean[20];
   public int t;
   public boolean u = false;

   public static ae a(String var0, int var1, do var2, int var3) {
      ds.c("ADD POP");
      String var6;
      if (af.e().aT != null) {
         var6 = "!null";
      } else {
         var6 = "null";
      }

      ds.c(var6);
      K = 10;
      ae var7 = new ae();
      var3 = main.a.A;
      if (main.a.F.a) {
         var1 = main.a.F.c;
      } else {
         var1 = 0;
      }

      var7.a = var3 - 30 - var1;
      if (var7.a > 320) {
         var7.a = 320;
      }

      if (var0.length() < 10) {
         var7.a = 64;
      }

      if (main.a.A == 128) {
         var7.a = 128;
      }

      var7.d = di.p.a(var0, var7.a - 10);
      var7.b = 100000;
      var7.i = var2;
      var7.J = 5820;
      af.x = var7;
      var7.g = 15 - var7.c + var7.d.length * 12 + 10;
      if (var7.g > main.a.B - 80) {
         var7.g = main.a.B - 80;
      }

      dc.x.addElement(var7);
      I = false;
      if (var2 != null && var2.J == 5) {
         I = true;
         p.aD.a("", 1);
      }

      var7.g += 15;
      long var4 = l.d();
      D = var4;
      C = var4;
      return var7;
   }

   private void a(int var1) {
      var1 = v + var1 * 12;
      v = var1;
      if (var1 < 0) {
         v = 0;
      }

      if (v > this.h) {
         v = this.h;
      }

   }

   public static void a(String var0, int var1, do var2) {
      String[] var3 = new String[]{var0};
      if (var2.J != 5 && p.aD.e) {
         p.aD.f = false;
      }

      af.bH = true;
      ae var4 = c(var3[0], 100000, var2);
      n = var4;
      var4.t = 5;
      n.e = main.a.A / 2 - n.a / 2 - 1;
      n.f = main.a.B - 20 - n.g;
      n.E = 0;
      n.F = var3;
      q = new dv();
      var1 = n.d.length;
      q.a(var1, 12, n.e, n.f - n.t + 12, n.a + 2, n.g - 25, true, 1);
      bu.a();
   }

   public static void a(String var0, do var1) {
      G = var0;
      H = var1;
      if (m == null) {
         b(G, 100000, H);
         G = null;
         H = null;
      }

   }

   public static void b(String var0, int var1, do var2) {
      ds.c("chat= " + var0);
      String[] var3 = ds.a(var0, "\n", 0);
      af.bH = true;
      ae var4 = c(var3[0], 100000, var2);
      m = var4;
      var4.E = 0;
      m.F = var3;
      var0 = aw.bk;
      if (var3.length == 1) {
         var0 = aw.bi;
      }

      m.j = new de(var0, m, 8000, (Object)null);
      m.j.j = main.a.A / 2 - 35;
      m.j.k = main.a.B - 35;
      bu.a();
   }

   public static ae c(String var0, int var1, do var2) {
      ds.c("ADD POP");
      String var7;
      if (af.e().aT != null) {
         var7 = "!null";
      } else {
         var7 = "null";
      }

      ds.c(var7);
      K = 10;
      ae var8 = new ae();
      int var4 = main.a.A;
      int var3;
      if (main.a.F.a) {
         var3 = main.a.F.c;
      } else {
         var3 = 0;
      }

      var8.a = var4 - 30 - var3;
      if (var8.a > 320) {
         var8.a = 320;
      }

      if (var0.length() < 10) {
         var8.a = 64;
      }

      if (main.a.A == 128) {
         var8.a = 128;
      }

      var8.d = di.p.a(var0, var8.a - 10);
      var8.b = var1;
      var8.i = var2;
      af.x = var8;
      var8.g = 15 - var8.c + var8.d.length * 12 + 10;
      if (var8.g > main.a.B - 80) {
         var8.g = main.a.B - 80;
      }

      dc.x.addElement(var8);
      I = false;
      if (var2 != null && var2.J == 5) {
         I = true;
         p.aD.a("", 1);
      }

      long var5 = l.d();
      D = var5;
      C = var5;
      return var8;
   }

   public final void a() {
      if (q != null) {
         p.aD.f = false;
         q.b();
      } else {
         p.aD.f = true;
      }

      if (main.a.F.a) {
         this.t = 0;
         this.e = main.a.A / 2 - this.a / 2 - 1;
         this.f = main.a.F.d - this.g;
      } else {
         this.t = 0;
         if (p.j().co == null && p.j().cm == null && p.j().cn == null && this.j == null && this.k == null) {
            this.e = main.a.A / 2 - this.a / 2 - 1;
            this.f = main.a.B - 5 - this.g;
         } else {
            this.t = 5;
            this.e = main.a.A / 2 - this.a / 2 - 1;
            this.f = main.a.B - 20 - this.g;
         }
      }

      if (this.b > 0) {
         --this.b;
      }

      if (K > 0) {
         --K;
      } else {
         p.aD.b.e = 0;

         for(int var1 = 0; var1 < p.aD.b.a.size(); ++var1) {
            if (((r)p.aD.b.a.elementAt(var1)).b != 70) {
               ((r)p.aD.b.a.elementAt(var1)).b = 10;
            }
         }
      }

      if (this.c > 1) {
         --this.c;
      }

      if (this.i != null && af.x != null && af.x != this || this.i != null && af.x == null || this.b <= 0) {
         dc.z.removeElement(this);
         dc.x.removeElement(this);
      }

   }

   public final void a(int var1, Object var2) {
      if (var1 == 1000) {
         try {
            GameMidlet.f.platformRequest((String)var2);
         } catch (Exception var3) {
            var3.printStackTrace();
         }

         GameMidlet.f.notifyDestroyed();
         main.a.h();
      }

      if (var1 == 1001) {
         q = null;
         af.x = null;
         n = null;
         p.aD.f = true;
         af.bH = false;
         if (I) {
            p.aD.b.e = 0;
            p.aD.b.b.b = 10;
         }
      }

      if (var1 == 8000 && K <= 0) {
         var1 = m.E + 1;
         if (var1 >= m.F.length) {
            af.x = null;
            m = null;
            p.aD.f = true;
            af.bH = false;
            if (G != null) {
               b(G, 100000, H);
               G = null;
               H = null;
            } else if (I) {
               p.aD.b.e = 0;

               for(var1 = 0; var1 < p.aD.b.a.size(); ++var1) {
                  if (((r)p.aD.b.a.elementAt(var1)).b == 10000000) {
                     ((r)p.aD.b.a.elementAt(var1)).b = 10;
                  }
               }
            }
         } else {
            ae var4 = c(m.F[var1], m.b, m.i);
            var4.E = var1;
            var4.F = m.F;
            var4.j = m.j;
            m = var4;
         }
      }

   }

   public final void a(en var1) {
      if (!p.j().bd || !p.j().ba) {
         main.a.a(var1);
         int var11 = this.e;
         int var12 = this.f;
         int var9 = this.a + 2;
         int var10 = this.g;
         if (var11 > 0 && var12 > 0 || main.a.G.a) {
            byte var2;
            if (this.i != null) {
               if (main.a.w % 10 > 2) {
                  var2 = 0;
               } else {
                  var2 = 1;
               }

               bl.b(var1, this.i.aO, this.e + 14, this.f + var2, 0, cj.d);
            }

            if (this.J != 0) {
               if (main.a.w % 10 > 2) {
                  var2 = 0;
               } else {
                  var2 = 1;
               }

               bl.b(var1, this.J, this.e + var9 / 2, this.f + this.g - 15 + var2, 0, cj.f);
            }

            bo.a(var1, var11, var12, var9, var10, 16777215, false);
            if (q != null) {
               var1.e(var11, var12, var9, var10 - 16);
               var1.a(0, -q.d);
            }

            int var3 = 0;
            int var4 = 0;
            if (this.u) {
               var3 = var1.a();
               var4 = var1.b();
               var1.e(var11, var12 + 1, var9, var10 - 17);
               var1.a(0, -v);
            }

            int var18 = -1;

            for(int var5 = 0; var5 < this.d.length; ++var5) {
               if (this.d[var5].startsWith("--")) {
                  var1.a(0);
                  var1.d(var11 + 10, this.f + this.c + var5 * 12 + 6, var9 - 20, 1);
               } else {
                  di var17 = di.k;
                  String var15 = this.d[var5];
                  int var6;
                  int var7;
                  String[] var16;
                  String var19;
                  if (this.d[var5].startsWith("|")) {
                     var16 = ds.a(this.d[var5], "|", 0);
                     if (var16.length == 3) {
                        var15 = var16[2];
                     }

                     if (var16.length == 4) {
                        var15 = var16[3];
                        var18 = Integer.parseInt(var16[2]);
                     } else {
                        var18 = 2;
                     }

                     int var8 = Integer.parseInt(var16[1]);
                     var7 = var8;
                     var6 = var18;
                     var18 = var8;
                     var19 = var15;
                  } else {
                     var7 = var18;
                     var6 = 2;
                     var19 = var15;
                  }

                  di var20;
                  switch(var7) {
                  case -1:
                     var20 = di.k;
                     break;
                  case 0:
                     var20 = di.f;
                     break;
                  case 1:
                     var20 = di.h;
                     break;
                  case 2:
                     var20 = di.b;
                     break;
                  case 3:
                     var20 = di.p;
                     break;
                  case 4:
                     var20 = di.r;
                     break;
                  case 5:
                     var20 = di.q;
                     break;
                  case 6:
                  default:
                     var20 = var17;
                     break;
                  case 7:
                     var20 = di.a;
                     break;
                  case 8:
                     var20 = di.d;
                     break;
                  case 9:
                     var20 = di.d;
                  }

                  if (this.d[var5].startsWith("<")) {
                     var16 = ds.a(ds.a(this.d[var5], "<", 0)[1], ">", 1);
                     if (this.L == 0) {
                        this.L = Integer.parseInt(var16[1]);
                     } else {
                        long var13 = l.d();
                        C = var13;
                        if (var13 - D >= 1000L) {
                           D = C;
                           --this.L;
                        }
                     }

                     var19 = this.L + " " + var16[2];
                     var7 = this.e;
                     var20.a(var1, var19, this.a / 2 + var7, this.f + this.c + var5 * 12 - this.t + 12, var6);
                  } else {
                     if (var6 == 2) {
                        var7 = this.e;
                        var20.a(var1, var19, this.a / 2 + var7, this.f + this.c + var5 * 12 - this.t + 12, var6);
                     }

                     if (var6 == 1) {
                        var20.a(var1, var19, this.e + this.a - 5, this.f + this.c + var5 * 12 - this.t + 12, var6);
                     }
                  }
               }
            }

            if (this.u) {
               main.a.a(var1);
               var1.a(var3, var4);
            }

            if (this.p > 4) {
               this.N = (this.p + 1) / 2;
               this.M = this.p - this.N;
               int[] var22 = new int[this.p];
               int[] var21 = new int[this.p];

               for(var18 = 0; var18 < this.N; ++var18) {
                  var1.a(g.s, var9 / 2 + var11 - this.N * 20 / 2 + var18 * 20 + en.a(g.s), var12 + var10 - 17, 3);
                  var22[var18] = var9 / 2 + var11 - this.N * 20 / 2 + var18 * 20 + en.a(g.s);
                  var21[var18] = var12 + var10 - 17;
               }

               for(var18 = 0; var18 < this.M; ++var18) {
                  var1.a(g.s, var9 / 2 + var11 - this.M * 20 / 2 + var18 * 20 + en.a(g.s), var12 + var10 - 8, 3);
                  var22[this.N + var18] = var9 / 2 + var11 - this.M * 20 / 2 + var18 * 20 + en.a(g.s);
                  var21[this.N + var18] = var12 + var10 - 8;
               }

               ds.b(this.p + "maxStarSlot");
               if (this.p >= 7) {
                  for(var18 = 7; var18 < this.p; ++var18) {
                     if (this.r[var18]) {
                        var1.a(g.u, var22[var18], var21[var18], 3);
                     }
                  }
               }

               if (this.o > 0) {
                  this.P = g.r;
                  if (this.o < this.N) {
                     for(var18 = 0; var18 < this.o; ++var18) {
                        var1.a(this.P, var9 / 2 + var11 - this.N * 20 / 2 + var18 * 20 + en.a(this.P), var12 + var10 - 17, 3);
                     }
                  } else {
                     this.O = this.o - this.N;

                     for(var18 = 0; var18 < this.N; ++var18) {
                        var1.a(this.P, var9 / 2 + var11 - this.N * 20 / 2 + var18 * 20 + en.a(this.P), var12 + var10 - 17, 3);
                     }

                     for(var18 = 0; var18 < this.O; ++var18) {
                        if (this.N + var18 >= s) {
                           this.P = g.t;
                        }

                        var1.a(this.P, var9 / 2 + var11 - this.M * 20 / 2 + var18 * 20 + en.a(this.P), var12 + var10 - 8, 3);
                     }
                  }
               }
            } else {
               for(var18 = 0; var18 < this.p; ++var18) {
                  var1.a(g.s, var9 / 2 + var11 - this.p * 20 / 2 + var18 * 20 + en.a(g.s), var12 + var10 - 13, 3);
               }

               if (this.o > 0) {
                  for(var18 = 0; var18 < this.o; ++var18) {
                     var1.a(g.r, var9 / 2 + var11 - this.p * 20 / 2 + var18 * 20 + en.a(g.r), var12 + var10 - 13, 3);
                  }
               }
            }

            var1.a(-var1.a(), -var1.b());
            var1.e(0, 0, main.a.A, main.a.B);
            if (this.j != null) {
               cx.a(var1, (de)null, this.j, (de)null);
            }

            if (this.k != null) {
               cx.a(var1, this.k, (de)null, this.l);
            }
         }
      }

   }

   public final void a(en var1, int var2) {
      int var9 = this.e;
      int var3 = this.f;
      int var8 = this.a;
      int var10 = var1.a();
      int var7 = var1.b();
      var1.a(0, -var2);
      if (var9 > 0 && var3 > 0 || main.a.G.a) {
         var2 = -1;

         for(var3 = 0; var3 < this.d.length; ++var3) {
            if (this.d[var3].startsWith("--")) {
               var1.a(16777215);
               var1.d(var9 + 10, this.f + this.c + var3 * 12 - 6, var8 - 20, 1);
            } else {
               di var15 = di.s;
               String var13 = this.d[var3];
               int var4;
               int var5;
               String[] var14;
               String var16;
               if (this.d[var3].startsWith("|")) {
                  var14 = ds.a(this.d[var3], "|", 0);
                  if (var14.length == 3) {
                     var13 = var14[2];
                  }

                  if (var14.length == 4) {
                     var13 = var14[3];
                     var2 = Integer.parseInt(var14[2]);
                  } else {
                     var2 = 2;
                  }

                  int var6 = Integer.parseInt(var14[1]);
                  var5 = var6;
                  var4 = var2;
                  var2 = var6;
                  var16 = var13;
               } else {
                  var5 = var2;
                  var4 = 2;
                  var16 = var13;
               }

               di var17;
               switch(var5) {
               case -1:
                  var17 = di.s;
                  break;
               case 0:
                  var17 = di.c;
                  break;
               case 1:
                  var17 = di.h;
                  break;
               case 2:
                  var17 = di.a;
                  break;
               default:
                  var17 = var15;
               }

               if (this.d[var3].startsWith("<")) {
                  var14 = ds.a(ds.a(this.d[var3], "<", 0)[1], ">", 1);
                  if (this.L == 0) {
                     this.L = Integer.parseInt(var14[1]);
                  } else {
                     long var11 = l.d();
                     C = var11;
                     if (var11 - D >= 1000L) {
                        D = C;
                        --this.L;
                     }
                  }

                  var16 = this.L + " " + var14[2];
                  var5 = this.e;
                  var17.a(var1, var16, this.a / 2 + var5, this.f + this.c + var3 * 12 - this.t, var4);
               } else {
                  if (var4 == 2) {
                     var5 = this.e;
                     var17.a(var1, var16, this.a / 2 + var5, this.f + this.c + var3 * 12 - this.t, var4);
                  }

                  if (var4 == 1) {
                     var17.a(var1, var16, this.e + this.a - 5, this.f + this.c + var3 * 12 - this.t, var4);
                  }
               }
            }
         }

         main.a.a(var1);
         var1.a(var10, var7);
      }

   }

   public final void b() {
      if (this.u) {
         if (main.a.i[8]) {
            main.a.i[8] = false;
            this.a(1);
         }

         if (main.a.i[2]) {
            main.a.i[2] = false;
            this.a(-1);
         }

         if (main.a.a(this.e, 0, this.a + 2, this.g)) {
            if (main.a.n) {
               if (this.R == 0) {
                  this.R = main.a.q;
               }

               this.Q = this.R - main.a.q;
               if (this.Q != 0) {
                  v += this.Q;
                  this.R = main.a.q;
               }

               if (v < 0) {
                  v = 0;
               }

               if (v > this.h) {
                  v = this.h;
               }
            } else {
               this.R = 0;
               this.R = 0;
            }
         }
      }

      if (q != null) {
         if (main.a.e) {
            q.a();
         }

         dv var1;
         if (main.a.j[2]) {
            var1 = q;
            var1.b -= 12;
            if (q.b < 0) {
               q.b = 0;
            }
         }

         if (main.a.j[8]) {
            main.a.i[8] = false;
            var1 = q;
            var1.b += 12;
            if (q.b > q.l) {
               q.b = q.l;
            }
         }
      }

      if (main.a.i[5] || bb.a(main.a.E.cn)) {
         main.a.i[5] = false;
         bb.cs = -1;
         if (this.j != null) {
            this.j.a();
         } else if (this.k != null) {
            this.k.a();
         } else if (this.l != null) {
            this.l.a();
         }
      }

      if (q == null || !q.m) {
         if (this.k != null && (main.a.i[12] || main.a.i[5] || bb.a(this.k))) {
            main.a.i[12] = false;
            main.a.i[5] = false;
            main.a.l = false;
            main.a.m = false;
            this.k.a();
            bb.cs = -1;
         }

         if (this.l != null && (main.a.i[13] || bb.a(this.l))) {
            main.a.i[13] = false;
            main.a.l = false;
            main.a.m = false;
            this.l.a();
            bb.cs = -1;
         }
      }

   }
}
