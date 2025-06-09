import java.io.DataInputStream;
import java.io.InputStream;
import javax.microedition.lcdui.Image;

public final class am extends bb implements b {
   public static boolean a;
   private af b;
   private int c;
   private int d;
   private int e;
   private int f = 45;
   private de g;
   private int[] h;
   private int[] i;
   private int j;

   public am() {
      int[] var3 = new int[]{0, 4, 8};
      this.h = var3;
      var3 = new int[10];
      var3[5] = 1;
      var3[6] = 1;
      var3[7] = 1;
      var3[8] = 1;
      var3[9] = 1;
      this.i = var3;
      this.j = 0;

      label59: {
         boolean var10001;
         label64: {
            byte[] var12;
            try {
               if (main.a.a) {
                  break label64;
               }

               var12 = new byte[]{39, 40, 41};
            } catch (Exception var10) {
               var10001 = false;
               break label59;
            }

            int var1 = 0;

            while(true) {
               try {
                  if (var1 >= var12.length) {
                     break;
                  }
               } catch (Exception var9) {
                  var10001 = false;
                  break label59;
               }

               DataInputStream var5;
               try {
                  StringBuffer var4 = new StringBuffer("/mymap/");
                  InputStream var13 = ad.a(var4.append(var12[var1]).toString());
                  var5 = new DataInputStream(var13);
                  dl.a[var1] = (char)var5.read();
                  dl.b[var1] = (char)var5.read();
                  dl.e[var1] = new int[var5.available()];
               } catch (Exception var8) {
                  var10001 = false;
                  break label59;
               }

               int var2 = 0;

               while(true) {
                  label53: {
                     try {
                        if (var2 < dl.a[var1] * dl.b[var1]) {
                           break label53;
                        }

                        dl.f[var1] = new int[dl.e[var1].length];
                     } catch (Exception var11) {
                        var10001 = false;
                        break label59;
                     }

                     ++var1;
                     break;
                  }

                  try {
                     dl.e[var1][var2] = var5.read();
                  } catch (Exception var7) {
                     var10001 = false;
                     break label59;
                  }

                  ++var2;
               }
            }
         }

         try {
            a(new byte[]{39, 40, 41});
         } catch (Exception var6) {
            var10001 = false;
         }
      }

      this.d = 168;
      this.e = 350;
      bl.c = new eg[32000];
      bl.e = new byte[32000];
      bl.g = 32000;
   }

   private static void a(byte[] var0) {
      if (!main.a.a) {
         int var1 = 0;

         label78:
         while(true) {
            Exception var10000;
            label82: {
               short var3;
               StringBuffer var8;
               el[] var9;
               DataInputStream var10;
               boolean var10001;
               el var23;
               try {
                  if (var1 >= var0.length) {
                     break;
                  }

                  var8 = new StringBuffer("/mymap/mapTable");
                  InputStream var22 = ad.a(var8.append(var0[var1]).toString());
                  var10 = new DataInputStream(var22);
                  var3 = var10.readShort();
                  var9 = dl.g;
                  var23 = new el("MapTemplate.vCurrItem[a] ");
               } catch (Exception var20) {
                  var10000 = var20;
                  var10001 = false;
                  break label82;
               }

               var9[var1] = var23;
               int var2 = 0;

               while(true) {
                  if (var2 >= var3) {
                     ++var1;
                     continue label78;
                  }

                  label84: {
                     boolean var7;
                     cz var11;
                     StringBuffer var26;
                     try {
                        short var6 = var10.readShort();
                        short var4 = var10.readShort();
                        short var5 = var10.readShort();
                        if (bv.a(var6) == null) {
                           break label84;
                        }

                        cz var24 = bv.a(var6);
                        var11 = new cz();
                        var11.a = var6;
                        var11.c = var24.c;
                        var11.f = var24.f;
                        var11.g = var24.g;
                        var11.d = bv.i * var4;
                        var11.e = bv.i * var5;
                        var11.h = var24.h;
                        dl.g[var1].addElement(var11);
                        t var25 = cz.k;
                        var26 = new StringBuffer(String.valueOf(var11.c));
                        var7 = var25.containsKey(var26.toString());
                     } catch (Exception var19) {
                        var10000 = var19;
                        var10001 = false;
                        break;
                     }

                     if (!var7) {
                        t var12;
                        Image var28;
                        try {
                           var8 = new StringBuffer("/mapBackGround/");
                           var28 = l.b(var8.append(var11.c).append(".png").toString());
                           var12 = cz.k;
                           var26 = new StringBuffer(String.valueOf(var11.c));
                           var12.put(var26.toString(), var28);
                        } catch (Exception var18) {
                           Image var27;
                           try {
                              var8 = new StringBuffer("/mapBackGround/");
                              var27 = l.c(var8.append(var11.c).append(".png").toString());
                           } catch (Exception var17) {
                              var10000 = var17;
                              var10001 = false;
                              break;
                           }

                           var28 = var27;
                           if (var27 == null) {
                              try {
                                 var28 = Image.createRGBImage(new int[]{-2013265920}, 1, 1, true);
                                 bt.a().c(var11.c);
                              } catch (Exception var16) {
                                 var10000 = var16;
                                 var10001 = false;
                                 break;
                              }
                           }

                           try {
                              var12 = cz.k;
                              var26 = new StringBuffer(String.valueOf(var11.c));
                              var12.put(var26.toString(), var28);
                           } catch (Exception var15) {
                              var10000 = var15;
                              var10001 = false;
                              break;
                           }
                        }

                        try {
                           el var29 = cz.m;
                           var8 = new StringBuffer(String.valueOf(var11.c));
                           var29.addElement(var8.toString());
                        } catch (Exception var14) {
                           var10000 = var14;
                           var10001 = false;
                           break;
                        }
                     }

                     try {
                        var8 = new StringBuffer(String.valueOf(var11.c));
                        if (!cz.a(var8.toString())) {
                           var23 = cz.l;
                           var26 = new StringBuffer(String.valueOf(var11.c));
                           var23.addElement(var26.toString());
                        }
                     } catch (Exception var13) {
                        var10000 = var13;
                        var10001 = false;
                        break;
                     }
                  }

                  ++var2;
               }
            }

            Exception var21 = var10000;
            var21.printStackTrace();
            break;
         }
      }

   }

   public final void a(int var1, Object var2) {
      switch(var1) {
      case 100:
         bs.l();
         break;
      case 101:
         main.a.ak.b();
         break;
      case 102:
         bs.a(-1, true);
         eu.b = false;
         main.a.al.b();
      }

   }

   public final void a(af var1) {
      this.b = new af();
      af var3 = this.b;
      int var2 = var1.K;
      var3.K = var2;
      this.c = var2;
      this.b.bU = var1.bU;
      this.b.bT = var1.bT;
      this.b.bW = var1.bW;
      this.b.bV = var1.bV;
      this.b.bX = var1.bX;
      this.b.ag = var1.ag;
      this.b();
   }

   public final void a(en var1) {
      if (ac.c && !a && !af.bI) {
         main.a.c(var1);
         var1.a(-p.j, -p.k);

         int var2;
         for(var2 = 0; var2 < dl.g[this.c].size(); ++var2) {
            cz var5 = (cz)dl.g[this.c].elementAt(var2);
            if (var5.c != -1 && var5.h == 1) {
               var5.a(var1);
            }
         }

         bv.a(var1);
         var1.a(bv.x, p.j + main.a.C, this.e + this.f + 1, 3);
         if (this.b != null) {
            af var7 = this.b;
            var2 = p.j;
            int var4 = main.a.C;
            int var3 = this.e;
            var7.a(var1, var4 + var2, this.f + var3, 1, this.i[this.j], true);
            di var6 = di.d;
            String var8 = this.b.ag;
            var2 = p.j;
            var6.a(var1, var8, main.a.C + var2, this.e - 15, 2, di.E);
         }

         var1.e(0, 0, main.a.A, main.a.B);
         super.a(var1);
         this.g.a(var1);
      }

   }

   public final void b() {
      main.a.F.a = false;
      main.a.h();
      p.j().a();
      super.b();
      bv.f = new int[dl.e[this.c].length];

      for(int var1 = 0; var1 < dl.e[this.c].length; ++var1) {
         bv.f[var1] = dl.e[this.c][var1];
      }

      bv.g = dl.f[this.c];
      bv.d = dl.d[this.c];
      bv.c = dl.c[this.c];
      bv.e = dl.c[this.c];
      bv.a = dl.a[this.c];
      bv.b = dl.b[this.c];
      bv.e = this.h[this.c] + 1;
      bv.h();
      main.a.a(this.h[this.c]);
      p.a(this.d, this.e);
      af.bI = false;
      super.cn = new de(aw.bv, this, 100, (Object)null);
      super.cm = new de(aw.bz, this, 101, (Object)null);
      this.g = new de(bs.a[bs.n], this, 102, (Object)null);
      this.g.j = 1;
      this.g.k = 3;
   }

   public final void c() {
      super.c();
      if (!br.a().d()) {
         a = true;
         ++this.j;
         if (this.j > 50) {
            bs.k();
            this.j = 0;
         }
      } else {
         a = false;
         ++this.j;
         if (this.j > this.i.length - 1) {
            this.j = 0;
         }

         if (this.g != null && this.g.c()) {
            this.g.a();
         }
      }

   }
}
