import javax.microedition.lcdui.Image;

public final class eu extends bb implements b {
   private static Image[] aa;
   public static boolean b;
   private static String m = "area_select";
   private int A;
   private int B;
   private int C;
   private int D;
   private int E;
   private int F;
   private int G;
   private int H;
   private int I;
   private int J;
   private int K;
   private int L;
   private int M;
   private int N;
   private int O;
   private int P;
   private int Q;
   private int R;
   private int S;
   private int T;
   private int U;
   private int V = 15;
   private String[] W = new String[]{"VIỆT NAM", "GLOBAL"};
   private String[] X = new String[]{"Máy chủ tiêu chuẩn", "Máy chủ Super"};
   private String[] Y = new String[]{"Máy chủ tiêu chuẩn:\nTiến trình game bình thường.", "Máy chủ Super:\n -Không thể giao dịch vàng.\n x3 Sức mạnh\n x3 Tiềm năng\n x3 Vàng\n x3 Vật phẩm khác"};
   private String Z = "Chỉ hiện thị máy chủ đã chơi.";
   public boolean a;
   private int c = 0;
   private el d = new el("");
   private de e;
   private int f;
   private int g;
   private int h;
   private int i;
   private int j;
   private de k;
   private de l;
   private boolean n;
   private bh o;
   private byte p = 0;
   private byte q = 0;
   private byte r = 0;
   private de s;
   private boolean t;
   private int u;
   private int v;
   private int w;
   private int x;
   private int y;
   private int z;

   public eu() {
      byte var1 = (byte)((int)(System.currentTimeMillis() % 9L));
      bv.o = var1;
      if (var1 == 5 || bv.o == 6) {
         bv.o = 4;
      }

      p.a(-1, (int)-1);
      p.j = 100;
      p.k = 200;
   }

   private void a() {
      byte var2 = 0;
      this.c = bs.n;
      this.h = 5;
      this.f = 90;
      this.g = bb.cr;
      this.i = 2;
      if (this.d.size() > 2) {
         this.i = main.a.A / (this.f + this.h);
      }

      int var3 = this.d.size() / this.i;
      byte var1;
      if (this.d.size() % this.i == 0) {
         var1 = 0;
      } else {
         var1 = 1;
      }

      this.j = var1 + var3;

      for(int var13 = var2; var13 < this.d.size(); ++var13) {
         de var12 = (de)this.d.elementAt(var13);
         if (var12 != null) {
            int var8 = main.a.C;
            var3 = this.i * (this.f + this.h) / 2;
            int var6 = this.i;
            int var11 = this.f;
            int var10 = this.h;
            int var9 = main.a.D;
            int var5 = this.j * (this.g + this.h) / 2;
            int var14 = var13 / this.i;
            int var4 = this.g;
            int var7 = this.h;
            var12.j = var8 - var3 + var13 % var6 * (var11 + var10);
            var12.k = var9 - var5 + var14 * (var4 + var7);
            var12.l = this.f;
         }
      }

   }

   private void a(byte var1, byte var2) {
      this.d.removeAllElements();
      this.R = 1;
      this.p = var1;
      aw.a(var1);

      int var4;
      for(var4 = 0; var4 < bs.a.length; ++var4) {
         if (var1 == 1) {
            if (bs.d[var4] != 0 && bs.h[var4] == 1) {
               this.R = 2;
            }
         } else if (bs.h[var4] == 1) {
            this.R = 2;
         }
      }

      byte var3 = var2;
      if (var2 > (byte)(this.R - 1)) {
         var3 = (byte)(this.R - 1);
      }

      this.r = var3;

      de var14;
      for(var4 = 0; var4 < bs.a.length; ++var4) {
         byte var5;
         boolean var13;
         if (var1 == 1) {
            if (bs.d[var4] != 0) {
               if (bs.h[var4] == 1) {
                  this.R = 2;
               }

               if (bs.h[var4] == var3) {
                  if (bs.e != null && var4 < bs.e.length) {
                     var5 = bs.e[var4];
                  } else {
                     var5 = -1;
                  }

                  if (!b || var5 != -1) {
                     var14 = new de(bs.a[var4], this, var4 + 100, (Object)null);
                     if (bs.i[var4] == 1) {
                        var13 = true;
                     } else {
                        var13 = false;
                     }

                     var14.r = var13;
                     if (var5 >= 0) {
                        var14.i = aa[var5];
                     }

                     this.d.addElement(var14);
                  }
               }
            }
         } else {
            if (bs.h[var4] == 1) {
               this.R = 2;
            }

            if (bs.d[var4] == 0 && bs.h[var4] == var3) {
               if (bs.e != null && var4 < bs.e.length) {
                  var5 = bs.e[var4];
               } else {
                  var5 = -1;
               }

               if (!b || var5 != -1) {
                  var14 = new de(bs.a[var4], this, var4 + 100, (Object)null);
                  if (bs.i[var4] == 1) {
                     var13 = true;
                  } else {
                     var13 = false;
                  }

                  var14.r = var13;
                  if (var5 >= 0) {
                     var14.i = aa[var5];
                  }

                  this.d.addElement(var14);
               }
            }
         }
      }

      int var18;
      for(var4 = 0; var4 < this.d.size() - 1; ++var4) {
         var14 = (de)this.d.elementAt(var4);

         de var15;
         for(var18 = var4 + 1; var18 < this.d.size(); var14 = var15) {
            de var16 = (de)this.d.elementAt(var18);
            var15 = var14;
            if (var16.r) {
               var15 = var14;
               if (!var14.r) {
                  this.d.setElementAt(var16, var4);
                  this.d.setElementAt(var14, var18);
                  var15 = var16;
               }
            }

            ++var18;
         }
      }

      this.c = bs.n;
      this.h = 5;
      this.f = 76;
      this.g = bb.cr;
      this.i = 1;
      int var7 = this.A;
      var18 = this.C / 2;
      this.F = this.B + 5;
      System.out.println(">>>>" + this.C + "/(" + this.f + " + " + this.h + ")");
      this.i = this.C / (this.f + this.h);
      if (this.i <= 0) {
         this.i = 1;
      }

      int var6 = this.d.size() / this.i;
      byte var17;
      if (this.d.size() % this.i == 0) {
         var17 = 0;
      } else {
         var17 = 1;
      }

      this.j = var17 + var6;
      this.E = var7 + var18 + 3 - this.i * (this.f + this.h) / 2;

      for(var4 = 0; var4 < this.d.size(); ++var4) {
         var14 = (de)this.d.elementAt(var4);
         if (var14 != null) {
            var7 = this.E;
            int var11 = this.i;
            int var8 = this.f;
            var6 = this.h;
            int var10 = this.F;
            int var12 = var4 / this.i;
            int var9 = this.g;
            var18 = this.h;
            var14.j = var7 + var4 % var11 * (var8 + var6);
            var14.k = var10 + var12 * (var9 + var18);
            var14.l = this.f;
         }
      }

      this.o = new bh(this.A, this.B, this.C, this.D, 0, 0, 0, true);
      bh var19 = this.o;
      var18 = this.j * (this.g + this.h) - this.D;
      var4 = var18;
      if (var18 < 0) {
         var4 = 0;
      }

      var19.c = var4;
      if (var19.b > var19.c) {
         var19.b = var19.c;
      }

      if (var19.a > var19.c) {
         var19.a = var19.c;
      }

      this.o.a = 0;
   }

   private void a(int var1, int var2) {
      this.n = false;
      if (l.c != 1) {
         this.a = true;
      }

      this.S = 10;
      this.w = main.a.A / 3 << 1;
      this.x = main.a.B / 3 << 1;
      this.u = (main.a.A - this.w) / 2;
      this.v = (main.a.B - this.x) / 2 + 20;
      this.y = main.a.A / 2;
      this.z = this.v - 30;
      this.C = this.w / 3 << 1;
      this.I = this.w - this.C - 15;
      if (this.I < 80) {
         this.I = 80;
         this.C = this.w - this.I - 15;
      }

      this.D = this.x - 10 - this.S;
      this.A = this.u + this.w - this.C - 5;
      this.B = this.v + 5;
      this.G = this.u + 5;
      this.H = this.v + 5;
      this.J = 20;
      this.K = this.u + 5;
      this.L = this.v + this.X.length * (this.J + 5) + 5;
      this.M = this.I;
      this.N = this.x - (this.X.length * (this.J + 5) + 5 + 5) - this.S;
      this.O = 10;
      this.P = 70;
      this.Q = 20;
      this.a((byte)var1, (byte)var2);
   }

   private void a(en var1, int var2, int var3) {
      int var4 = var2 - 5;
      this.T = var4;
      bo.a(var1, var4, var3, this.P, this.Q, 0, true);
      di.f.a(var1, this.W[this.p], var4 + (this.P - 10) / 2, var3 + 5, 2);
      var1.a(aa.R, 0, 30, 9, 6, 0, this.P + var4 - 10, var3 + 14, 33);
      if (this.t) {
         this.U = this.Q + var3 + 5;
         var1.a(10254674);
         var1.d(var4, this.U, this.P, this.W.length * this.V + 1);

         for(var2 = 0; var2 < this.W.length; ++var2) {
            di.s.a(var1, this.W[var2], var4 + this.P / 2, this.U + this.V * var2 + 2, 2);
            if (this.p == var2) {
               var1.a(15591444);
               var1.c(var4 + 2, this.U + this.V * var2 + 1, this.P - 4, this.V - 2);
            }
         }
      }

   }

   private void e() {
      byte var1 = 0;
      if (this.a) {
         int var2;
         if (this.o != null) {
            this.o.b();
            if (main.a.b(this.A, 0, this.C, main.a.B)) {
               this.o.a();
            }

            var2 = this.o.b;
         } else {
            var2 = 0;
         }

         int var3;
         if (main.a.b(this.A, this.B, this.C, this.D)) {
            var3 = (main.a.p - this.E) / (this.f + this.h) + (main.a.q - this.F + var2) / (this.g + this.h) * this.i;
            int var4 = this.d.size();
            if (var3 >= 0 && var3 < var4) {
               this.c = var3;

               for(var3 = 0; var3 < this.d.size(); ++var3) {
                  de var6 = (de)this.d.elementAt(var3);
                  if (var6 != null) {
                     if (var3 == this.c) {
                        if (var6.a(0, var2)) {
                           var6.a();
                        }
                     } else {
                        var6.n = false;
                     }
                  }
               }
            }
         }

         if (main.a.b(this.K - 2, this.L + this.N, this.S + 4, this.S + 4) && main.a.m) {
            boolean var5;
            if (b) {
               var5 = false;
            } else {
               var5 = true;
            }

            b = var5;
            this.a(this.p, this.r);
         }

         if (this.R != 1) {
            while(var1 < this.R) {
               var2 = this.H;
               var3 = this.J;
               if (main.a.a(this.G, var2 + (var3 + 5) * var1, this.I, this.J) && main.a.k) {
                  this.a(this.p, var1);
                  break;
               }

               ++var1;
            }
         }
      }

   }

   private void f() {
      if (main.a.b(this.T, this.O, this.P, this.Q) && main.a.m) {
         boolean var4;
         if (this.t) {
            var4 = false;
         } else {
            var4 = true;
         }

         this.t = var4;
         main.a.m = false;
      }

      if (this.t) {
         for(byte var1 = 0; var1 < this.W.length; ++var1) {
            int var2 = this.U;
            int var3 = this.V;
            if (main.a.a(this.T, var2 + var3 * var1, this.P, this.V) && main.a.k) {
               if (this.n) {
                  this.p = var1;
               } else {
                  this.a((int)var1, (int)this.r);
               }

               this.t = false;
               break;
            }
         }
      }

   }

   private void g() {
      byte[] var1 = av.b(m);

      try {
         this.p = var1[0];
         this.q = var1[1];
      } catch (Exception var2) {
         this.q = 0;
         this.p = 0;
      }

   }

   public final void a(int var1, Object var2) {
      byte var5 = 0;
      byte var6 = 0;
      ds.c("perform trong ServerScr:" + var1);
      switch(var1) {
      case 97:
         if (!this.a) {
            this.d.removeAllElements();

            for(var1 = var6; var1 < bs.a.length; ++var1) {
               if (bs.d[var1] != 0) {
                  this.d.addElement(new de(bs.a[var1], this, var1 + 100, (Object)null));
               }
            }

            this.a();
         }

         return;
      case 98:
         if (!this.a) {
            this.d.removeAllElements();

            for(var1 = var5; var1 < bs.a.length; ++var1) {
               if (bs.d[var1] == 0) {
                  this.d.addElement(new de(bs.a[var1], this, var1 + 100, (Object)null));
               }
            }

            this.a();
         }

         return;
      case 99:
         br.a().c();
         bs.a(this.c, false);
         break;
      case 999:
         byte var3 = this.p;
         byte var4 = this.q;
         av.a(m, new byte[]{var3, var4});
         this.a((int)this.p, (int)0);
         return;
      default:
         br.a().e();
         bs.a(var1 - 100, true);
         bs.k();
         if (main.a.ak == null) {
            main.a.ak = new bs();
         }
      }

      main.a.ak.i();
      main.a.ak.b();
   }

   public final void a(en var1) {
      main.a.c(var1);
      if (this.n) {
         if (this.n) {
            this.a(var1, main.a.C - this.P / 2, this.O);
            this.s.a(var1);
         }
      } else {
         int var2;
         if (this.a) {
            if (this.a) {
               var1.a(14601141);
               var1.d(this.u, this.v, this.w, this.x);
               bo.a(var1, this.y - 50, this.z, 100, 20, 0, true);
               di.f.a(var1, aw.aa, this.y, this.z + 5, 2);

               int var10;
               for(var2 = 0; var2 < this.R; ++var2) {
                  int var4 = this.H + (this.J + 5) * var2;
                  int var5 = this.G;
                  int var6 = this.I;
                  int var7 = this.J;
                  byte var3;
                  if (this.r == var2) {
                     var3 = 1;
                  } else {
                     var3 = 0;
                  }

                  bo.a(var1, var5, var4, var6, var7, var3, true);
                  di var8 = di.f;
                  String var9 = this.X[var2];
                  var10 = this.G;
                  var8.a(var1, var9, this.I / 2 + var10, var4 + 5, 2);
               }

               var1.a(10254674);
               var1.d(this.K, this.L, this.M, this.N);
               String[] var11 = di.k.a(this.Y[this.r], this.M - 10);

               for(var2 = 0; var2 < var11.length; ++var2) {
                  di.s.a(var1, var11[var2], this.K + 5, var2 * 11 + this.L + 5, 0);
               }

               var10 = this.K;
               var2 = this.L + this.N + 2;
               var1.a(16777215);
               var1.d(var10, var2, this.S, this.S);
               if (b) {
                  var1.a(3329330);
                  var1.d(var10 + 1, var2 + 1, this.S - 2, this.S - 2);
               }

               di.f.a(var1, this.Z, var10 + this.S + 2, var2, 0);
               this.a(var1, 10, this.O);
               var1.a(10254674);
               var1.d(this.A, this.B, this.C, this.D);
               var1.e(this.A, this.B, this.C, this.D);
               var1.a(0, -this.o.b);

               for(var2 = 0; var2 < this.d.size(); ++var2) {
                  de var12 = (de)this.d.elementAt(var2);
                  if (var12 != null) {
                     var12.a(var1);
                     if (var12.r && main.a.w % 10 > 1) {
                        var1.a(g.v, var12.j + 60, var12.k, 0);
                     }
                  }
               }

               main.a.a(var1);
            }
         } else {
            for(var2 = 0; var2 < this.d.size(); ++var2) {
               if (this.d.elementAt(var2) != null) {
                  ((de)this.d.elementAt(var2)).a(var1);
               }
            }
         }
      }

      super.a(var1);
   }

   public final void b() {
      bu.a();
      super.b();
      if (aa == null) {
         aa = new Image[3];

         for(int var1 = 0; var1 < aa.length; ++var1) {
            aa[var1] = l.b("/iconHead_" + var1 + ".png");
         }
      }

      this.c = bs.n;
      this.i = 1;
      this.j = 1;
      if (main.a.e) {
         if (av.b(m) == null) {
            this.n = true;
            this.s = new de(aw.br, this, 999, (Object)null);
            this.s.j = main.a.C - 38;
            this.s.k = main.a.D + 50;
            this.d = new el("");
            this.d.addElement(this.s);
            this.O = main.a.D - 30;
            this.P = 70;
            this.Q = 20;
         } else {
            this.n = false;
            this.g();
            this.a((int)this.p, (int)this.r);
         }
      }

      if (!this.a && !this.n) {
         this.k = new de(this.W[0], this, 98, (Object)null);
         this.k.j = 0;
         this.k.k = 0;
         this.l = new de(this.W[1], this, 97, (Object)null);
         this.l.j = 50;
         this.l.k = 0;
         this.d = new el("");
         this.d.addElement(this.k);
         this.d.addElement(this.l);
         this.a();
      }

   }

   public final void c() {
      int var1 = p.j + 1;
      p.j = var1;
      if (var1 > main.a.A * 3 + 100) {
         p.j = 100;
      }

      if (!this.a) {
         for(var1 = 0; var1 < this.d.size(); ++var1) {
            de var2 = (de)this.d.elementAt(var1);
            if (!main.a.e) {
               if (var1 == this.c) {
                  if (main.a.w % 10 < 4) {
                     var2.n = true;
                  } else {
                     var2.n = false;
                  }

                  this.e = new de(aw.bv, this, var2.e, (Object)null);
                  super.cn = this.e;
               } else {
                  var2.n = false;
               }
            } else if (var2 != null && var2.c()) {
               ds.c("sellllect      " + this.c + "   " + var2.b);
               var2.a();
            }
         }
      }

      this.e();
      this.f();
      bs.e();
   }

   public final void d() {
      super.d();
      int var1 = this.c % this.i;
      int var2 = this.c / this.i;
      if (main.a.i[4]) {
         if (var1 > 0) {
            --this.c;
         }

         main.a.i[4] = false;
      } else if (main.a.i[6]) {
         if (var1 < this.i - 1) {
            ++this.c;
         }

         main.a.i[6] = false;
      } else if (main.a.i[2]) {
         if (var2 > 0) {
            this.c -= this.i;
         }

         main.a.i[2] = false;
      } else if (main.a.i[8]) {
         System.out.println("-----------vo mainSelect: " + this.c);
         if (var2 < this.j - 1) {
            this.c += this.i;
         }

         main.a.i[8] = false;
      }

      if (this.c < 0) {
         this.c = 0;
      }

      if (this.c >= this.d.size()) {
         this.c = this.d.size() - 1;
      }

      if (main.a.i[5]) {
         ((de)this.d.elementAt(var1)).a();
         main.a.i[5] = false;
      }

      main.a.f();
   }
}
