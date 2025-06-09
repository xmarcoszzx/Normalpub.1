import main.GameMidlet;

public final class bi extends bb implements b {
   private static boolean j = false;
   private boolean A = false;
   private int B = 2;
   private int C = 0;
   private int D = -40;
   private int E = 1;
   private cd a;
   private cd b;
   private cd c;
   private cd d;
   private cd e;
   private cd f;
   private cd g;
   private cd h;
   private cd i;
   private int k;
   private int l;
   private int m;
   private boolean n = false;
   private boolean o = false;
   private de p;
   private de q;
   private de r;
   private de s;
   private de t;
   private int u;
   private de v;
   private int w;
   private int x = 130;
   private int y;
   private int z = -1;

   static {
      int[] var0 = new int[]{0, 8, 2, 6, 9};
   }

   public bi(byte var1) {
      byte var2 = (byte)((int)(System.currentTimeMillis() % 9L));
      bv.o = var2;
      if (var2 == 5 || bv.o == 6) {
         bv.o = 4;
      }

      p.a(-1, (int)-1);
      p.j = 100;
      p.k = 200;
      if (main.a.B > 200) {
         this.m = main.a.D - 80;
      } else {
         this.m = main.a.D - 65;
      }

      this.l = -50;
      this.u = main.a.D - bb.cp - 5;
      if (main.a.B <= 160) {
         this.u = 20;
      }

      this.i = new cd();
      this.i.c(1);
      this.i.c = 220;
      this.i.d = bb.cp + 2;
      this.i.i = "Số điện thoại";
      if (var1 == 1) {
         this.i.a("01234567890");
      }

      this.a = new cd();
      this.a.c = 220;
      this.a.d = bb.cp + 2;
      this.a.e = true;
      this.a.i = "Họ và tên";
      if (var1 == 1) {
         this.a.a("Nguyễn Văn A");
      }

      this.a.c(0);
      this.b = new cd();
      this.b.c(1);
      this.b.c = 70;
      this.b.d = bb.cp + 2;
      this.b.i = "Ngày sinh";
      if (var1 == 1) {
         this.b.a("01");
      }

      this.c = new cd();
      this.c.c(1);
      this.c.c = 70;
      this.c.d = bb.cp + 2;
      this.c.i = "Tháng sinh";
      if (var1 == 1) {
         this.c.a("01");
      }

      this.d = new cd();
      this.d.c(1);
      this.d.c = 70;
      this.d.d = bb.cp + 2;
      this.d.i = "Năm sinh";
      if (var1 == 1) {
         this.d.a("1980");
      }

      this.e = new cd();
      this.e.c(0);
      this.e.c = 220;
      this.e.d = bb.cp + 2;
      this.e.i = "Địa chỉ đăng ký thường trú";
      if (var1 == 1) {
         this.e.a("123 đường số 1, Quận 1, TP.HCM");
      }

      this.f = new cd();
      this.f.c(1);
      this.f.c = 220;
      this.f.d = bb.cp + 2;
      this.f.i = "Số Chứng minh nhân dân hoặc số hộ chiếu";
      if (var1 == 1) {
         this.f.a("123456789");
      }

      this.g = new cd();
      this.g.c(0);
      this.g.c = 220;
      this.g.d = bb.cp + 2;
      this.g.i = "Ngày cấp";
      if (var1 == 1) {
         this.g.a("01/01/1990");
      }

      this.h = new cd();
      this.h.c(0);
      this.h.c = 220;
      this.h.d = bb.cp + 2;
      this.h.i = "Nơi cấp";
      if (var1 == 1) {
         this.h.a("TP.HCM");
      }

      this.u += 35;
      this.n = true;
      this.k = 0;
      String var3;
      if (main.a.A > 200) {
         var3 = aw.aw;
      } else {
         var3 = aw.ax;
      }

      this.p = new de(var3, main.a.h, 888393, (Object)null);
      new de(aw.bs, this, 2001, (Object)null);
      this.r = new de(aw.ay, this, 2002, (Object)null);
      this.t = new de(aw.bu, this, 10021, (Object)null);
      de var7 = new de(aw.bh, this, 2003, (Object)null);
      this.s = var7;
      super.cm = var7;
      if (main.a.e) {
         this.p.j = main.a.A / 2 - 100;
         this.s.j = main.a.A / 2 - bb.cq - 8;
         if (main.a.B >= 200) {
            this.p.k = main.a.B / 2 - 40;
            this.s.k = this.x + 110;
         }

         this.t.j = main.a.A / 2 + 3;
         this.t.k = this.x + 110;
         this.r.j = main.a.A / 2 - 84;
         this.r.k = this.s.k;
      }

      this.y = 170;
      short var5 = 184;
      if (184 >= main.a.A) {
         var5 = 152;
      }

      this.w = main.a.A / 2 - var5 / 2;
      this.x = 5;
      this.a.a = this.w + 10;
      this.a.b = this.x + 20;
      this.v = new de(aw.br, this, 2008, (Object)null);
      this.v.j = 260;
      this.v.k = main.a.B - 60;
      this.q = new de("Thoát", this, 1003, (Object)null);
      this.q.j = 260;
      this.q.k = main.a.B - 30;
      this.v.j = main.a.A / 2 - 80;
      this.q.j = main.a.A / 2 + 10;
      var7 = this.q;
      de var4 = this.v;
      int var6 = main.a.B - 25;
      var4.k = var6;
      var7.k = var6;
      super.cn = this.v;
      super.cm = this.q;
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
      switch(var1) {
      case 1000:
         try {
            GameMidlet.f.platformRequest((String)var2);
         } catch (Exception var7) {
            var7.printStackTrace();
         }

         main.a.h();
         break;
      case 1001:
         main.a.h();
         this.o = false;
      case 1002:
      case 2000:
      case 10041:
      case 10042:
      default:
         break;
      case 1003:
         main.a.ak.b();
         br.a().e();
         break;
      case 1004:
         bs.a();
         main.a.ak.b();
         break;
      case 1005:
         try {
            GameMidlet.f.platformRequest("http://ngocrongonline.com");
         } catch (Exception var6) {
            var6.printStackTrace();
         }
         break;
      case 2001:
         if (this.n) {
            this.n = false;
         } else {
            this.n = true;
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
               boolean var9;
               String var11;
               label117: {
                  if (aw.fA == 2) {
                     if (this.a.d().indexOf("@") == -1 || this.a.d().indexOf(".") == -1) {
                        var11 = aw.X;
                        var9 = var3;
                        break label117;
                     }
                  } else {
                     label116: {
                        label90: {
                           try {
                              Long.parseLong(this.a.d());
                              if (this.a.d().length() < 8 || this.a.d().length() > 12 || !this.a.d().startsWith("0") && !this.a.d().startsWith("84")) {
                                 var11 = aw.W;
                                 break label90;
                              }
                           } catch (Exception var8) {
                              if (this.a.d().indexOf("@") != -1 && this.a.d().indexOf(".") != -1) {
                                 break label116;
                              }

                              var11 = aw.X;
                              var9 = var3;
                              break label117;
                           }

                           var11 = null;
                        }

                        var9 = true;
                        break label117;
                     }
                  }

                  var11 = null;
                  var9 = var3;
               }

               if (var11 != null) {
                  main.a.a(var11);
               } else {
                  bc var5 = main.a.L;
                  StringBuffer var4 = new StringBuffer(String.valueOf(aw.ah));
                  if (var9) {
                     var11 = aw.ai + ": ";
                  } else {
                     var11 = aw.aj + ": ";
                  }

                  var5.a(var4.append(var11).append(this.a.d()).append("\n").append(aw.ac).append(": ").append(this.b.d()).toString(), new de(aw.bt, this, 4000, (Object)null), (de)null, new de(aw.bn, main.a.h, 8882, (Object)null));
               }

               main.a.K = main.a.L;
            }
         }
         break;
      case 2003:
         el var10 = new el("vMenu Login");
         var10.addElement(new de(aw.Y, this, 2004, (Object)null));
         var10.addElement(new de(aw.Z, this, 1004, (Object)null));
         var10.addElement(new de(aw.ab, this, 1003, (Object)null));
         var10.addElement(new de(aw.aH, this, 1005, (Object)null));
         if (av.d("lowGraphic") == 1) {
            var10.addElement(new de(aw.bU, this, 10041, (Object)null));
         } else {
            var10.addElement(new de(aw.bV, this, 10042, (Object)null));
         }

         var10.addElement(new de(aw.bo, main.a.h, 8885, (Object)null));
         main.a.F.a(var10);
         break;
      case 2004:
         main.a.h();
         main.a.a(aw.fV);
         this.o = true;
         this.b.e = false;
         this.a.e = true;
         break;
      case 2008:
         if (!this.b.d().equals("") && !this.c.d().equals("") && !this.d.d().equals("") && !this.i.d().equals("") && !this.a.d().equals("")) {
            main.a.a(aw.aB);
            bt.a().a(this.b.d(), this.c.d(), this.d.d(), "", "", "", "", this.i.d(), this.a.d());
         } else {
            main.a.a("Vui lòng điền đầy đủ thông tin");
         }
         break;
      case 10021:
         this.o = false;
         this.b.e = false;
         this.a.e = true;
         super.cm = this.s;
      }

   }

   public final void a(en var1) {
      main.a.c(var1);
      if (ae.m == null && ae.n == null) {
         if (main.a.K == null) {
            this.w = main.a.C - 120;
            this.x = (main.a.B - 110) / 2;
            bo.a(var1, this.w, this.x, 240, 110, -1, true);
            this.a.a = this.w + 10;
            this.a.b = this.x + 15;
            this.i.a = this.a.a;
            this.i.b = this.a.b + 30;
            this.b.a = this.w + 10;
            this.b.b = this.i.b + 30;
            this.c.a = this.b.a + 75;
            this.c.b = this.b.b;
            this.d.a = this.c.a + 75;
            this.d.b = this.c.b;
            di.i.a(var1, "Cập nhật thông tin", main.a.C, this.x + 2, 2);
            this.a.a(var1);
            this.i.a(var1);
            this.b.a(var1);
            this.c.a(var1);
            this.d.a(var1);
         }

         main.a.a(var1);
         var1.a(main.a.O);
         var1.d(main.a.A - 40, 4, 36, 11);
         di.o.a(var1, "2.4.6", main.a.A - 22, 4, 2);
         var1.a(main.a.ah, 10, 10, 0);
         super.a(var1);
      }

   }

   public final void b() {
      System.out.println("Res switch");
      bu.a();
      this.a.e = true;
      this.b.e = false;
      if (main.a.e) {
         this.a.e = false;
      }

      super.b();
   }

   public final void c() {
      this.a.c();
      this.i.c();
      this.b.c();
      this.c.c();
      this.d.c();

      int var1;
      for(var1 = 0; var1 < dc.x.size(); ++var1) {
         ((dc)dc.x.elementAt(var1)).a();
      }

      var1 = p.j + 1;
      p.j = var1;
      if (var1 > main.a.A * 3 + 100) {
         p.j = 100;
      }

      if (ae.m == null) {
         if (this.m != this.l) {
            this.l += this.m - this.l >> 1;
         }

         if (this.C >= 0) {
            this.D += this.E * this.C;
            this.C += this.E * this.B;
            if (this.C <= 0) {
               this.E = -this.E;
            }

            if (this.D > 0) {
               this.E = -this.E;
               this.C -= this.B * 2;
            }
         }

         if (this.z >= 0 && main.a.w % 100 == 0) {
            ++this.z;
            if (this.z >= aw.aX.length) {
               this.z = 0;
            }

            if (main.a.K == main.a.L && main.a.L.a) {
               main.a.L.a(aw.aX[this.z]);
            }
         }

         if (main.a.e) {
            if (this.o) {
               super.cn = this.r;
               super.cm = this.t;
            } else {
               super.cn = this.v;
               super.cm = this.q;
            }
         } else if (this.o) {
            super.cn = this.r;
            super.cm = this.t;
         } else {
            super.cn = this.v;
            super.cm = this.q;
         }
      }

   }

   public final void d() {
      if (!main.a.e) {
         if (this.a.e) {
            super.co = this.a.j;
         } else {
            super.co = this.b.j;
         }
      }

      if (main.a.i[2]) {
         --this.k;
         if (this.k < 0) {
            this.k = 1;
         }
      } else if (main.a.i[8]) {
         ++this.k;
         if (this.k > 1) {
            this.k = 1;
         }
      }

      if (main.a.i[2] || main.a.i[8]) {
         main.a.f();
         if (this.k == 1) {
            this.a.e = false;
            this.b.e = true;
         } else if (this.k == 0) {
            this.a.e = true;
            this.b.e = false;
         } else {
            this.a.e = false;
            this.b.e = false;
         }
      }

      if (main.a.e) {
         if (this.o) {
            super.cn = this.r;
            super.cm = this.t;
         } else {
            super.cn = this.v;
            super.cm = this.q;
         }
      } else if (this.o) {
         super.cn = this.r;
         super.cm = this.t;
      } else {
         super.cn = this.v;
         super.cm = this.q;
      }

      if (main.a.m) {
         if (main.a.a(this.a.a, this.a.b, this.a.c, this.a.d)) {
            this.k = 0;
         } else if (main.a.a(this.b.a, this.b.b, this.b.c, this.b.d)) {
            this.k = 1;
         }
      }

      super.d();
      main.a.f();
   }
}
