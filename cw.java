import java.io.DataInputStream;
import java.io.InputStream;
import javax.microedition.lcdui.Image;

public final class cw extends bb implements b {
   public static cw a;
   public static boolean b = false;
   private static cd d;
   private static int e;
   private static int f;
   private static int g;
   private static int[][] h;
   private static int[] i;
   private static int[] j;
   private de c;
   private int[] k;
   private int l;
   private int m;
   private int n;
   private int o;
   private int p;

   static {
      int[] var0 = new int[]{6, 27, 28};
      h = new int[][]{{64, 30, 31}, {9, 29, 32}, var0};
      i = new int[]{2, 13, 8};
      j = new int[]{1, 12, 7};
   }

   public cw() {
      int[] var8 = new int[]{0, 4, 8};
      this.k = var8;
      this.l = 168;
      this.m = 350;
      this.n = 45;
      if (main.a.I == null) {
         main.a.I = new x();
      }

      label140: {
         Exception var10000;
         Exception var35;
         label139: {
            boolean var10001;
            label144: {
               boolean var7;
               byte[] var10;
               try {
                  if (main.a.a) {
                     break label144;
                  }

                  var10 = new byte[]{39, 40, 41};
                  var7 = main.a.a;
               } catch (Exception var16) {
                  var10000 = var16;
                  var10001 = false;
                  break label139;
               }

               if (!var7) {
                  int var1 = 0;

                  label137:
                  while(true) {
                     label146: {
                        int var2;
                        try {
                           var2 = var10.length;
                        } catch (Exception var25) {
                           var10000 = var25;
                           var10001 = false;
                           break label146;
                        }

                        if (var1 >= var2) {
                           break;
                        }

                        short var3;
                        el[] var9;
                        DataInputStream var11;
                        StringBuffer var26;
                        el var28;
                        try {
                           var26 = new StringBuffer("/mymap/mapTable");
                           InputStream var27 = ad.a(var26.append(var10[var1]).toString());
                           var11 = new DataInputStream(var27);
                           var3 = var11.readShort();
                           var9 = dl.g;
                           var28 = new el("MapTemplate.vCurrItem[a] ");
                        } catch (Exception var24) {
                           var10000 = var24;
                           var10001 = false;
                           break label146;
                        }

                        var9[var1] = var28;
                        var2 = 0;

                        while(true) {
                           if (var2 >= var3) {
                              ++var1;
                              continue label137;
                           }

                           label148: {
                              cz var12;
                              t var30;
                              try {
                                 short var4 = var11.readShort();
                                 short var5 = var11.readShort();
                                 short var6 = var11.readShort();
                                 if (bv.a(var4) == null) {
                                    break label148;
                                 }

                                 cz var29 = bv.a(var4);
                                 var12 = new cz();
                                 var12.a = var4;
                                 var12.c = var29.c;
                                 var12.f = var29.f;
                                 var12.g = var29.g;
                                 var12.d = bv.i * var5;
                                 var12.e = bv.i * var6;
                                 var12.h = var29.h;
                                 dl.g[var1].addElement(var12);
                                 var30 = cz.k;
                                 var26 = new StringBuffer(String.valueOf(var12.c));
                                 var7 = var30.containsKey(var26.toString());
                              } catch (Exception var23) {
                                 var10000 = var23;
                                 var10001 = false;
                                 break;
                              }

                              el var34;
                              if (!var7) {
                                 Image var33;
                                 try {
                                    var26 = new StringBuffer("/mapBackGround/");
                                    var33 = l.b(var26.append(var12.c).append(".png").toString());
                                    t var36 = cz.k;
                                    StringBuffer var32 = new StringBuffer(String.valueOf(var12.c));
                                    var36.put(var32.toString(), var33);
                                 } catch (Exception var22) {
                                    Image var31;
                                    try {
                                       var26 = new StringBuffer("/mapBackGround/");
                                       var31 = l.c(var26.append(var12.c).append(".png").toString());
                                    } catch (Exception var21) {
                                       var10000 = var21;
                                       var10001 = false;
                                       break;
                                    }

                                    var33 = var31;
                                    if (var31 == null) {
                                       try {
                                          var33 = Image.createRGBImage(new int[]{-2013265920}, 1, 1, true);
                                          bt.a().c(var12.c);
                                       } catch (Exception var20) {
                                          var10000 = var20;
                                          var10001 = false;
                                          break;
                                       }
                                    }

                                    try {
                                       var30 = cz.k;
                                       StringBuffer var13 = new StringBuffer(String.valueOf(var12.c));
                                       var30.put(var13.toString(), var33);
                                    } catch (Exception var19) {
                                       var10000 = var19;
                                       var10001 = false;
                                       break;
                                    }
                                 }

                                 try {
                                    var34 = cz.m;
                                    var26 = new StringBuffer(String.valueOf(var12.c));
                                    var34.addElement(var26.toString());
                                 } catch (Exception var18) {
                                    var10000 = var18;
                                    var10001 = false;
                                    break;
                                 }
                              }

                              try {
                                 var26 = new StringBuffer(String.valueOf(var12.c));
                                 if (!cz.a(var26.toString())) {
                                    var34 = cz.l;
                                    var26 = new StringBuffer(String.valueOf(var12.c));
                                    var34.addElement(var26.toString());
                                 }
                              } catch (Exception var17) {
                                 var10000 = var17;
                                 var10001 = false;
                                 break;
                              }
                           }

                           ++var2;
                        }
                     }

                     var35 = var10000;

                     try {
                        var35.printStackTrace();
                        break;
                     } catch (Exception var15) {
                        var10000 = var15;
                        var10001 = false;
                        break label139;
                     }
                  }
               }
            }

            try {
               a(new byte[]{39, 40, 41});
               break label140;
            } catch (Exception var14) {
               var10000 = var14;
               var10001 = false;
            }
         }

         var35 = var10000;
         var35.printStackTrace();
      }

      if (main.a.A <= 200) {
         p.d(128, 100);
         p.bL = (main.a.A - 128) / 2;
         p.bK = 10;
         this.m += 15;
         this.n -= 15;
      }

      e = 1;
      cd var37 = new cd();
      d = var37;
      var37.c = main.a.I.a.c;
      if (main.a.A < 200) {
         d.c = 60;
      }

      d.d = 26;
      if (main.a.A < 200) {
         d.a = p.bL + 45;
         d.b = p.bK + 12;
      } else {
         d.a = main.a.A / 2 - d.c / 2;
         d.b = 35;
      }

      if (!main.a.e) {
         d.e = true;
      }

      d.c(0);
      d.i = aw.av;
      if (d.d().equals("@")) {
         d.a(main.a.I.a.d().substring(0, main.a.I.a.d().indexOf("@")));
      }

      e = 1;
      f = 0;
      super.cn = new de(aw.by, this, 8000, (Object)null);
      super.cm = new de(aw.bz, this, 8001, (Object)null);
      if (!main.a.e) {
         super.co = d.j;
      }

   }

   public static cw a() {
      if (a == null) {
         a = new cw();
      }

      return a;
   }

   private static void a(byte[] var0) {
      for(int var1 = 0; var1 < var0.length; ++var1) {
         DataInputStream var3 = new DataInputStream(ad.a("/mymap/" + var0[var1]));
         dl.a[var1] = (char)var3.read();
         dl.b[var1] = (char)var3.read();
         dl.e[var1] = new int[var3.available()];

         for(int var2 = 0; var2 < dl.a[var1] * dl.b[var1]; ++var2) {
            dl.e[var1][var2] = var3.read();
         }

         dl.f[var1] = new int[dl.e[var1].length];
      }

   }

   private void e() {
      bv.f = new int[dl.e[e].length];

      for(int var1 = 0; var1 < dl.e[e].length; ++var1) {
         bv.f[var1] = dl.e[e][var1];
      }

      bv.g = dl.f[e];
      bv.d = dl.d[e];
      bv.c = dl.c[e];
      bv.e = dl.c[e];
      bv.a = dl.a[e];
      bv.b = dl.b[e];
      bv.e = this.k[e] + 1;
      bv.h();
      main.a.a(this.k[e]);
      p.a(this.l, this.m);
   }

   public final void a(int var1) {
      d.a(var1);
   }

   public final void a(int var1, Object var2) {
      switch(var1) {
      case 8000:
         if (d.d().equals("")) {
            main.a.a(aw.ar);
         } else if (d.d().length() < 5) {
            main.a.a(aw.as);
         } else if (d.d().length() > 15) {
            main.a.a(aw.at);
         } else {
            bp.a();
            bt.a().a(d.d(), e, h[e][f]);
         }
         break;
      case 8001:
         if (main.a.I.n) {
            main.a.a(aw.fU, new de(aw.bm, this, 10019, (Object)null), new de(aw.bn, this, 10020, (Object)null));
         } else {
            br.a().e();
            main.a.ak.b();
         }
         break;
      case 10018:
         bs.a(-1, true);
         eu.b = false;
         main.a.al.b();
         break;
      case 10019:
         br.a().e();
         main.a.h();
         main.a.ak.b();
         break;
      case 10020:
         main.a.h();
      }

   }

   public final void a(en var1) {
      if (!af.bI) {
         main.a.c(var1);
         var1.a(-p.j, -p.k);
         if (!main.a.a) {
            for(int var2 = 0; var2 < dl.g[e].size(); ++var2) {
               cz var10 = (cz)dl.g[e].elementAt(var2);
               if (var10.c != -1 && var10.h == 1) {
                  var10.a(var1);
               }
            }
         }

         bv.a(var1);
         byte var14;
         if (main.a.A == 128) {
            var14 = 20;
         } else {
            var14 = 30;
         }

         int var3 = h[e][f];
         int var5 = i[e];
         int var4 = j[e];
         var1.a(bv.x, this.l, this.m + this.n, 3);
         av var12 = p.x[var3];
         av var13 = p.x[var5];
         av var27 = p.x[var4];
         short var16 = var12.a[af.bC[this.p][0][0]].a;
         int var7 = this.l;
         int var8 = af.bC[this.p][0][1];
         byte var9 = var12.a[af.bC[this.p][0][0]].b;
         int var6 = this.m;
         var5 = af.bC[this.p][0][2];
         byte var15 = var12.a[af.bC[this.p][0][0]].c;
         bl.b(var1, var16, var9 + var7 + var8, this.n + var6 - var5 + var15, 0, 0);
         short var22 = var13.a[af.bC[this.p][1][0]].a;
         var4 = this.l;
         var5 = af.bC[this.p][1][1];
         byte var20 = var13.a[af.bC[this.p][1][0]].b;
         var6 = this.m;
         int var25 = af.bC[this.p][1][2];
         var15 = var13.a[af.bC[this.p][1][0]].c;
         bl.b(var1, var22, var20 + var4 + var5, this.n + var6 - var25 + var15, 0, 0);
         short var19 = var27.a[af.bC[this.p][2][0]].a;
         var8 = this.l;
         var4 = af.bC[this.p][2][1];
         var15 = var27.a[af.bC[this.p][2][0]].b;
         var7 = this.m;
         var5 = af.bC[this.p][2][2];
         var9 = var27.a[af.bC[this.p][2][0]].c;
         bl.b(var1, var19, var15 + var8 + var4, this.n + var7 - var5 + var9, 0, 0);
         if (!main.a.a) {
            for(var3 = 0; var3 < dl.g[e].size(); ++var3) {
               cz var11 = (cz)dl.g[e].elementAt(var3);
               if (var11.c != -1 && var11.h == 3) {
                  var11.a(var1);
               }
            }
         }

         var1.a(-var1.a(), -var1.b());
         Image var28;
         if (main.a.A < 200) {
            cx.b(p.bL, p.bK, p.bM, p.bN, var1);
            var22 = var12.a[af.bC[0][0][0]].a;
            var3 = main.a.A / 2;
            var6 = af.bC[0][0][1];
            var9 = var12.a[af.bC[0][0][0]].b;
            var5 = p.bK;
            var4 = af.bC[0][0][2];
            var20 = var12.a[af.bC[0][0][0]].c;
            bl.b(var1, var22, var9 + var3 + var6, this.n + var5 + 30 + var14 * 3 - var4 + var20, 0, 0);
            var16 = var13.a[af.bC[0][1][0]].a;
            var7 = main.a.A / 2;
            var25 = af.bC[0][1][1];
            var15 = var13.a[af.bC[0][1][0]].b;
            var5 = p.bK;
            var6 = af.bC[0][1][2];
            byte var26 = var13.a[af.bC[0][1][0]].c;
            bl.b(var1, var16, var15 + var7 + var25, this.n + var5 + 30 + var14 * 3 - var6 + var26, 0, 0);
            var22 = var27.a[af.bC[0][2][0]].a;
            var4 = main.a.A / 2;
            var25 = af.bC[0][2][1];
            byte var24 = var27.a[af.bC[0][2][0]].b;
            var3 = p.bK;
            var7 = af.bC[0][2][2];
            byte var23 = var27.a[af.bC[0][2][0]].c;
            bl.b(var1, var22, var24 + var4 + var25, this.n + var3 + 30 + var14 * 3 - var7 + var23, 0, 0);

            for(var3 = 0; var3 < aw.aJ.length; ++var3) {
               if (g == var3) {
                  var28 = p.bw;
                  var5 = p.bL;
                  byte var21;
                  if (main.a.w % 7 > 3) {
                     var21 = 1;
                  } else {
                     var21 = 0;
                  }

                  var1.a(var28, 0, 0, 13, 16, 2, var5 + 10 + var21, var3 * var14 + p.bK + 35, cj.f);
                  var28 = p.bw;
                  var5 = p.bL;
                  var6 = p.bM;
                  if (main.a.w % 7 > 3) {
                     var21 = 1;
                  } else {
                     var21 = 0;
                  }

                  var1.a(var28, 0, 0, 13, 16, 0, var5 + var6 - 10 - var21, var3 * var14 + p.bK + 35, cj.f);
               }

               di.f.a(var1, aw.aJ[var3], p.bL + 20, var3 * var14 + p.bK + 30, 0);
            }

            di.f.a(var1, aw.aK[e], p.bL + 70, var14 * 1 + p.bK + 30, 0);
            di.f.a(var1, aw.fo[e][f], p.bL + 55, var14 * 2 + p.bK + 30, 0);
         } else {
            byte var17;
            if (main.a.A > main.a.B) {
               var17 = 45;
               var14 = 100;
            } else {
               var17 = 60;
               var14 = 110;
            }

            byte var18;
            for(var4 = 0; var4 < 3; ++var4) {
               if (var4 != e) {
                  var1.a(p.aw, main.a.A / 2 - 78 + var4 * 78, var14, 3);
               } else {
                  if (g == 1) {
                     var28 = p.bw;
                     var6 = main.a.A / 2;
                     if (main.a.w % 7 > 3) {
                        var18 = 1;
                     } else {
                        var18 = 0;
                     }

                     var1.a(var28, 0, 0, 13, 16, 4, var4 * 78 + (var6 - 78), var14 - 20 + var18, cj.f);
                  }

                  var1.a(p.ax, main.a.A / 2 - 78 + var4 * 78, var14, 3);
               }

               di.f.a(var1, aw.aK[var4], var4 * 78 + (main.a.A / 2 - 78), var14 - 5, 2);
            }

            for(var4 = 0; var4 < 3; ++var4) {
               if (var4 != f) {
                  var1.a(p.aw, main.a.A / 2 - 78 + var4 * 78, var14 + var17, 3);
               } else {
                  if (g == 2) {
                     var28 = p.bw;
                     var6 = main.a.A / 2;
                     if (main.a.w % 7 > 3) {
                        var18 = 1;
                     } else {
                        var18 = 0;
                     }

                     var1.a(var28, 0, 0, 13, 16, 4, var4 * 78 + (var6 - 78), var14 + var17 - 20 + var18, cj.f);
                  }

                  var1.a(p.ax, main.a.A / 2 - 78 + var4 * 78, var14 + var17, 3);
               }

               di.f.a(var1, aw.fo[e][var4], var4 * 78 + (main.a.A / 2 - 78), var14 + var17 - 5, 2);
            }

            if (g == 0) {
               var28 = p.bw;
               var3 = main.a.A / 2;
               if (main.a.w % 7 > 3) {
                  var14 = 1;
               } else {
                  var14 = 0;
               }

               var1.a(var28, 0, 0, 13, 16, 4, var3, var14 + 20, cj.f);
            }
         }

         d.a(var1);
         var1.e(0, 0, main.a.A, main.a.B);
         if (this.c != null) {
            this.c.a(var1);
         }

         super.a(var1);
      }

   }

   public final void b() {
      x.c = false;
      main.a.F.a = false;
      main.a.h();
      super.b();
      e = ds.b(0, 3);
      f = ds.b(0, 3);
      this.e();
      af.bI = false;
      if (d != null) {
         d.i = aw.av;
      }

      if (main.a.e) {
         this.c = new de(bs.a[bs.n], this, 10018, (Object)null);
         this.c.j = 1;
         this.c.k = 3;
      }

   }

   public final void c() {
      ++this.o;
      if (this.o > 30) {
         this.o = 0;
      }

      if (this.o % 15 < 5) {
         this.p = 0;
      } else {
         this.p = 1;
      }

      d.c();
      if (this.c != null && this.c.c()) {
         this.c.a();
      }

      if (g != 0) {
         d.e = false;
      }

   }

   public final void d() {
      int var1;
      if (main.a.i[2]) {
         var1 = g - 1;
         g = var1;
         if (var1 < 0) {
            g = aw.aJ.length - 1;
         }
      }

      if (main.a.i[8]) {
         var1 = g + 1;
         g = var1;
         if (var1 >= aw.aJ.length) {
            g = 0;
         }
      }

      if (g == 0) {
         if (!main.a.e) {
            super.co = d.j;
         }

         d.c();
      }

      if (g == 1) {
         if (main.a.i[4]) {
            var1 = e - 1;
            e = var1;
            if (var1 < 0) {
               e = aw.aK.length - 1;
            }

            this.e();
         }

         if (main.a.i[6]) {
            var1 = e + 1;
            e = var1;
            if (var1 > aw.aK.length - 1) {
               e = 0;
            }

            this.e();
         }

         super.co = null;
      }

      if (g == 2) {
         if (main.a.i[4]) {
            var1 = f - 1;
            f = var1;
            if (var1 < 0) {
               f = aw.fo[0].length - 1;
            }
         }

         if (main.a.i[6]) {
            var1 = f + 1;
            f = var1;
            if (var1 > aw.fo[0].length - 1) {
               f = 0;
            }
         }

         super.co = null;
      }

      if (main.a.m) {
         byte var5 = 110;
         byte var2 = 60;
         if (main.a.A > main.a.B) {
            var5 = 100;
            var2 = 40;
         }

         if (main.a.a(main.a.A / 2 - 117, 15, 234, 80)) {
            g = 0;
            d.e = true;
         }

         if (main.a.a(main.a.A / 2 - 117, var5 - 30, 234, var2 + 5)) {
            g = 1;
            int var4 = e;
            int var3 = (main.a.p - (main.a.A / 2 - 117)) / 78;
            e = var3;
            if (var3 < 0) {
               e = 0;
            }

            if (e > aw.aK.length - 1) {
               e = aw.aK.length - 1;
            }

            if (var4 != e) {
               this.e();
            }
         }

         if (main.a.a(main.a.A / 2 - 117, var2 + (var5 - 30) + 5, 234, 65)) {
            g = 2;
            var1 = f;
            int var6 = (main.a.p - (main.a.A / 2 - 117)) / 78;
            f = var6;
            if (var6 < 0) {
               f = 0;
            }

            if (f > aw.fo[0].length - 1) {
               f = aw.fo[0].length - 1;
            }

            if (var1 != g) {
               this.e();
            }
         }
      }

      super.d();
      main.a.g();
      main.a.f();
   }
}
