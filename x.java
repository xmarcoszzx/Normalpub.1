import javax.microedition.lcdui.Image;
import main.GameMidlet;

public final class x extends bb implements b {
   public static boolean c = false;
   public static boolean d;
   public static boolean e;
   public static boolean f;
   public static boolean g;
   public static boolean h;
   public static String i;
   public static Image j;
   public static short k;
   public static long l;
   public static long m;
   private int A;
   private de B;
   private int C;
   private int D;
   private int E;
   private int F = -1;
   private int G = 2;
   private int H = 0;
   private int I = -40;
   private int J = 1;
   private de K;
   public cd a;
   public cd b;
   public boolean n = false;
   private int o;
   private int p;
   private int q;
   private int r;
   private boolean s = false;
   private boolean t = false;
   private de u;
   private de v;
   private de w;
   private de x;
   private de y;
   private de z;

   static {
      int[] var0 = new int[]{0, 8, 2, 6, 9};
   }

   public x() {
      this.D = main.a.D - 30;
      byte var1 = (byte)((int)(System.currentTimeMillis() % 9L));
      bv.o = var1;
      if (var1 == 5 || bv.o == 6) {
         bv.o = 4;
      }

      p.a(-1, (int)-1);
      p.j = 100;
      p.k = 200;
      if (main.a.B > 200) {
         this.r = main.a.D - 80;
      } else {
         this.r = main.a.D - 65;
      }

      this.q = -50;
      short var4;
      if (main.a.A >= 200) {
         var4 = 160;
      } else {
         var4 = 140;
      }

      this.p = var4;
      this.A = main.a.D - bb.cp - 5;
      if (main.a.B <= 160) {
         this.A = 20;
      }

      this.a = new cd();
      this.a.b = main.a.D - bb.cp - 9;
      this.a.c = this.p;
      this.a.d = bb.cp + 2;
      this.a.e = true;
      this.a.c(0);
      cd var3 = this.a;
      String var2;
      if (aw.fA == 2) {
         var2 = "";
      } else {
         var2 = aw.ai + "/";
      }

      var3.i = var2 + aw.aj;
      this.b = new cd();
      this.b.b = main.a.D - 4;
      this.b.c(2);
      this.b.c = this.p;
      this.b.d = bb.cp + 2;
      this.A += 35;
      this.s = true;
      int var5 = av.d("check");
      if (var5 == 1) {
         this.s = true;
      } else if (var5 == 2) {
         this.s = false;
      }

      this.a.a(av.c("acc"));
      this.b.a(av.c("pass"));
      this.a.a((String)null);
      this.b.a((String)null);
      if (this.K == null) {
         this.K = new de("Gọi hotline", this, 13, (Object)null);
         this.K.j = main.a.A - 75;
         if (l.c == 1 && !main.a.e) {
            this.K.k = main.a.B - 20;
         } else {
            this.K.k = 8;
         }
      }

      this.o = 0;
      if (main.a.A > 200) {
         var2 = aw.aw;
      } else {
         var2 = aw.ax;
      }

      this.u = new de(var2, main.a.h, 888393, (Object)null);
      new de(aw.bs, this, 2001, (Object)null);
      this.w = new de(aw.ay, this, 2002, (Object)null);
      this.y = new de(aw.bu, this, 10021, (Object)null);
      this.z = new de(aw.bz, this, 101, (Object)null);
      de var6 = new de(aw.bh, this, 2003, (Object)null);
      this.x = var6;
      super.cm = var6;
      if (main.a.e) {
         this.u.j = main.a.A / 2 + 8;
         this.x.j = main.a.A / 2 - bb.cq - 8;
         if (main.a.B >= 200) {
            this.u.k = this.D + 110;
            this.x.k = this.D + 110;
         }

         this.y.j = main.a.A / 2 + 3;
         this.y.k = this.D + 110;
         this.w.j = main.a.A / 2 - 84;
         this.w.k = this.x.k;
         this.z.j = 2;
         this.z.k = main.a.B - bb.cr;
      }

      this.E = 170;
      var4 = 184;
      if (184 >= main.a.A) {
         var4 = 152;
      }

      this.C = main.a.A / 2 - var4 / 2;
      this.D = main.a.D - 30;
      this.a.a = this.C + 10;
      this.a.b = this.D + 20;
      this.B = new de(aw.br, this, 2008, (Object)null);
      this.B.j = main.a.A / 2 - 84;
      this.B.k = this.u.k;
      this.v = new de(aw.ab, this, 1003, (Object)null);
      this.v.j = main.a.A / 2 + 3;
      this.v.k = this.u.k;
      super.cn = this.B;
      super.cm = this.v;
   }

   public static void g() {
      l.d();
      if (main.a.I.n) {
         main.a.a(aw.fU, new de(aw.bm, main.a.G, 10019, (Object)null), new de(aw.bn, main.a.G, 10020, (Object)null));
      } else {
         eu.b = false;
         main.a.e();
      }

   }

   private void h() {
      if (this.n) {
         this.a();
      } else {
         this.t = false;
         this.b.e = false;
         this.a.e = true;
         super.cm = this.x;
      }

   }

   public final void a() {
      byte var1 = 1;
      ds.c("user ao= " + av.c("userAo" + bs.n));
      String var5 = av.c("acc");
      String var4 = av.c("pass");
      if ((var5 == null || var5.equals("")) && av.c("userAo" + bs.n) != null && !av.c("userAo" + bs.n).equals("")) {
         this.n = true;
      } else {
         this.n = false;
      }

      String var2;
      String var3;
      label49: {
         ds.c("isLogin 2= " + this.n);
         if (var5 != null) {
            var3 = var4;
            var2 = var5;
            if (!var5.equals("")) {
               break label49;
            }
         }

         var3 = var4;
         var2 = var5;
         if (this.n) {
            var2 = av.c("userAo" + bs.n);
            var3 = "a";
         }
      }

      ds.c("user = " + var2 + " pass= " + var3);
      if (var2 != null && var3 != null && !var2.equals("")) {
         if (var3.equals("")) {
            this.o = 1;
            this.a.e = false;
            this.b.e = true;
            if (!main.a.e) {
               super.co = this.b.j;
            }
         } else {
            if (!br.a().d()) {
               main.a.b();
            }

            bt var6 = bt.a();
            if (!this.n) {
               var1 = 0;
            }

            var6.a(var2, var3, "2.4.6", var1);
            av.a(bs.w, bs.n);
            if (br.a().d) {
               main.a.i();
            } else {
               main.a.a(aw.x + " [0]", 8884, (Object)null);
            }

            this.o = 0;
            if (!this.n) {
               this.h();
            }

            l.d();
         }
      }

   }

   public final void a(int var1) {
      if (this.a.e) {
         this.a.a(var1);
      } else if (this.b.e) {
         this.b.a(var1);
      }

      super.a(var1);
   }

   public final void a(int var1, Object var2) {
      boolean var3 = false;
      String var11;
      switch(var1) {
      case 13:
         switch(l.c) {
         case 1:
            l.b();
            return;
         case 2:
         case 3:
         case 4:
         case 5:
         case 6:
         default:
            return;
         }
      case 101:
         main.a.ak.b();
         break;
      case 1000:
         try {
            GameMidlet.f.platformRequest((String)var2);
         } catch (Exception var8) {
            var8.printStackTrace();
         }

         main.a.h();
         break;
      case 1001:
         main.a.h();
         this.t = false;
         break;
      case 1002:
         main.a.i();
         var11 = av.c("userAo" + bs.n);
         if (var11 != null && !var11.equals("")) {
            main.a.I.n = true;
            main.a.b();
            bt.a().c();
            bt.a().a(var11, "", "2.4.6", (byte)1);
         } else {
            bt.a().f("");
         }
         break;
      case 1003:
         main.a.a(aw.am);
         break;
      case 1004:
         bs.a();
         main.a.ak.b();
         break;
      case 1005:
         try {
            GameMidlet.f.platformRequest("http://ngocrongonline.com");
         } catch (Exception var7) {
            var7.printStackTrace();
         }
      case 2000:
      default:
         break;
      case 2001:
         if (this.s) {
            this.s = false;
         } else {
            this.s = true;
         }
         break;
      case 2002:
         if (this.a.d().equals("")) {
            main.a.a(aw.T);
         } else {
            this.a.d().toCharArray();
            if (this.b.d().equals("")) {
               main.a.a(aw.U);
            } else if (this.a.d().length() < 5) {
               main.a.a(aw.V);
            } else {
               boolean var10;
               label112: {
                  if (aw.fA == 2) {
                     if (this.a.d().indexOf("@") == -1 || this.a.d().indexOf(".") == -1) {
                        var11 = aw.X;
                        var10 = var3;
                        break label112;
                     }
                  } else {
                     label106: {
                        label105: {
                           try {
                              Long.parseLong(this.a.d());
                              if (this.a.d().length() < 8 || this.a.d().length() > 12 || !this.a.d().startsWith("0") && !this.a.d().startsWith("84")) {
                                 var11 = aw.W;
                                 break label105;
                              }
                           } catch (Exception var9) {
                              if (this.a.d().indexOf("@") != -1 && this.a.d().indexOf(".") != -1) {
                                 break label106;
                              }

                              var11 = aw.X;
                              var10 = var3;
                              break label112;
                           }

                           var11 = null;
                        }

                        var10 = true;
                        break label112;
                     }
                  }

                  var11 = null;
                  var10 = var3;
               }

               if (var11 != null) {
                  main.a.a(var11);
               } else {
                  bc var14 = main.a.L;
                  StringBuffer var13 = new StringBuffer(String.valueOf(aw.ah));
                  if (var10) {
                     var11 = aw.ai + ": ";
                  } else {
                     var11 = aw.aj + ": ";
                  }

                  var14.a(var13.append(var11).append(this.a.d()).append("\n").append(aw.ac).append(": ").append(this.b.d()).toString(), new de(aw.bt, this, 4000, (Object)null), (de)null, new de(aw.bn, main.a.h, 8882, (Object)null));
               }

               main.a.K = main.a.L;
            }
         }
         break;
      case 2003:
         el var12 = new el("vMenu Login");
         var12.addElement(new de(aw.Y, this, 2004, (Object)null));
         if (!this.n) {
            var12.addElement(new de(aw.Z, this, 1004, (Object)null));
         }

         var12.addElement(new de(aw.ab, this, 1003, (Object)null));
         var12.addElement(new de(aw.aH, this, 1005, (Object)null));
         if (av.d("lowGraphic") == 1) {
            var12.addElement(new de(aw.bU, this, 10041, (Object)null));
         } else {
            var12.addElement(new de(aw.bV, this, 10042, (Object)null));
         }

         var12.addElement(new de(aw.bo, main.a.h, 8885, (Object)null));
         main.a.F.a(var12);
         break;
      case 2004:
         this.f();
         break;
      case 2008:
         av.a("acc", this.a.d().trim());
         av.a("pass", this.b.d().trim());
         if (bs.u) {
            main.a.ak.b();
         } else {
            main.a.ak.j();
         }
         break;
      case 4000:
         String var6 = this.a.d();
         main.a.b(aw.aC);
         main.a.b();
         main.a.b(aw.I);
         bt var4 = bt.a();
         String var5 = this.b.d();
         var11 = av.c("userAo" + bs.n);
         av.c("passAo");
         var4.a(var6, var5, var11, "2.4.6");
         av.a("acc", var6);
         av.a("pass", this.b.d());
         break;
      case 10021:
         this.h();
         break;
      case 10041:
         av.a("lowGraphic", 0);
         main.a.a(aw.cL, 8885, (Object)null);
         break;
      case 10042:
         av.a("lowGraphic", 1);
         main.a.a(aw.cL, 8885, (Object)null);
      }

   }

   public final void a(en var1) {
      main.a.c(var1);
      int var2 = this.a.b - 50;
      if (main.a.B <= 220) {
         var2 += 5;
      }

      di.s.a(var1, "v2.4.6", main.a.A - 2, 17, 1, di.o);
      if (l.c == 1 && !main.a.e) {
         di.s.a(var1, bs.l, main.a.A - 2, main.a.B - 15, 1, di.o);
      } else {
         di.s.a(var1, bs.l, main.a.A - 2, 2, 1, di.o);
      }

      if (main.a.K == null) {
         short var3;
         if (main.a.A >= 200) {
            var3 = 180;
         } else {
            var3 = 160;
         }

         bo.a(var1, this.C, this.D - 10, var3, 105, -1, true);
         if (main.a.B > 160 && j != null) {
            var1.a(j, main.a.C, var2, 3);
         }

         short var4 = 184;
         if (184 >= main.a.A) {
            var4 = 152;
         }

         this.C = main.a.A / 2 - var4 / 2;
         this.a.a = this.C + 10;
         this.a.b = this.D + 20;
         this.b.a = this.C + 10;
         this.b.b = this.D + 55;
         this.a.a(var1);
         this.b.a(var1);
         if (main.a.A < 176) {
            di.g.a(var1, aw.ak + ":", this.a.a - 35, this.a.b + 7, 0);
            di.g.a(var1, aw.al + ":", this.b.a - 35, this.b.b + 7, 0);
            di.g.a(var1, aw.aI + ": " + i, main.a.A / 2, this.b.b + 32, 2);
         }
      }

      super.a(var1);
      this.z.a(var1);
   }

   public final void b() {
      bu.a();
      this.a.e = true;
      this.b.e = false;
      if (main.a.e) {
         this.a.e = false;
      }

      main.a.a(0);
      super.cm = new de(aw.bz, this, 101, (Object)null);
      super.b();
   }

   public final void c() {
      if (k > 0) {
         main.a.i();
         long var3 = System.currentTimeMillis();
         m = var3;
         if (var3 - l >= 1000L) {
            short var1 = (short)(k - 1);
            k = var1;
            if (var1 == 0) {
               main.a.I.a();
            }

            l = m;
         }
      }

      String var5;
      cd var6;
      if (this.n && !this.t) {
         var6 = this.a;
         if (aw.fA == 2) {
            var5 = "";
         } else {
            var5 = aw.ai + "/";
         }

         var6.i = var5 + aw.aj;
         this.b.i = aw.ac;
         this.a.k = false;
         this.b.k = false;
         this.a.c();
         this.b.c();
      } else {
         var6 = this.a;
         if (aw.fA == 2) {
            var5 = "";
         } else {
            var5 = aw.ai + "/";
         }

         var6.i = var5 + aw.aj;
         this.b.i = aw.ac;
         this.a.c();
         this.b.c();
      }

      int var2;
      for(var2 = 0; var2 < dc.x.size(); ++var2) {
         ((dc)dc.x.elementAt(var2)).a();
      }

      if (d && !e && !h && !f && !g) {
         d = false;
         System.gc();
         bt.a().r();
      }

      var2 = p.j + 1;
      p.j = var2;
      if (var2 > main.a.A * 3 + 100) {
         p.j = 100;
      }

      if (ae.m == null) {
         if (this.r != this.q) {
            this.q += this.r - this.q >> 1;
         }

         if (this.H >= 0) {
            this.I += this.J * this.H;
            this.H += this.J * this.G;
            if (this.H <= 0) {
               this.J = -this.J;
            }

            if (this.I > 0) {
               this.J = -this.J;
               this.H -= this.G * 2;
            }
         }

         if (this.F >= 0 && main.a.w % 100 == 0) {
            ++this.F;
            if (this.F >= aw.aX.length) {
               this.F = 0;
            }

            if (main.a.K == main.a.L && main.a.L.a) {
               main.a.L.a(aw.aX[this.F]);
            }
         }

         if (this.n && !this.t) {
            this.a.k = false;
            this.b.k = false;
            this.a.c();
            this.b.c();
         } else {
            var6 = this.a;
            if (aw.fA == 2) {
               var5 = "";
            } else {
               var5 = aw.ai + "/";
            }

            var6.i = var5 + aw.aj;
            this.b.i = aw.ac;
            this.a.c();
            this.b.c();
         }

         if (main.a.e) {
            if (this.t) {
               super.cn = this.w;
               super.cm = this.y;
            } else {
               super.cn = this.B;
               super.cm = this.v;
            }

            if (this.z != null && this.z.c()) {
               this.z.a();
            }
         } else if (this.t) {
            super.cn = this.w;
            super.cm = this.y;
         } else {
            super.cn = this.B;
            super.cm = this.v;
         }
      }

   }

   public final void d() {
      if (main.a.e && this.K != null && this.K.c()) {
         this.K.a();
      }

      if (!c) {
         if (!main.a.e) {
            if (this.a.e) {
               super.co = this.a.j;
            } else {
               super.co = this.b.j;
            }
         }

         if (main.a.i[2]) {
            --this.o;
            if (this.o < 0) {
               this.o = 1;
            }
         } else if (main.a.i[8]) {
            ++this.o;
            if (this.o > 1) {
               this.o = 1;
            }
         }

         if (main.a.i[2] || main.a.i[8]) {
            main.a.f();
            if (!this.n || this.t) {
               if (this.o == 1) {
                  this.a.e = false;
                  this.b.e = true;
               } else if (this.o == 0) {
                  this.a.e = true;
                  this.b.e = false;
               } else {
                  this.a.e = false;
                  this.b.e = false;
               }
            }
         }

         if (main.a.e) {
            if (this.t) {
               super.cn = this.w;
               super.cm = this.y;
            } else {
               super.cn = this.B;
               super.cm = this.v;
            }
         } else if (this.t) {
            super.cn = this.w;
            super.cm = this.y;
         } else {
            super.cn = this.B;
            super.cm = this.v;
         }

         if (main.a.m && (!this.n || this.t)) {
            if (main.a.a(this.a.a, this.a.b, this.a.c, this.a.d)) {
               this.o = 0;
            } else if (main.a.a(this.b.a, this.b.b, this.b.c, this.b.d)) {
               this.o = 1;
            }
         }

         super.d();
         main.a.f();
      }

   }

   public final void e() {
      if (this.s) {
         av.a("check", 1);
         av.a("acc", this.a.d().toLowerCase().trim());
         av.a("pass", this.b.d().toLowerCase().trim());
      } else {
         av.a("check", 2);
         av.a("acc", "");
         av.a("pass", "");
      }

   }

   public final void f() {
      main.a.h();
      main.a.a(aw.fV);
      this.t = true;
      this.b.e = false;
      this.a.e = true;
   }
}
