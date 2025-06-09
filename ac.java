import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import javax.microedition.lcdui.Image;

public final class ac implements bd {
   public static boolean a = false;
   public static boolean b;
   public static boolean c = false;
   public static t d = new t("frame new boss");
   private static ac e;
   private y f;
   private float g;

   public static ac a() {
      if (e == null) {
         e = new ac();
      }

      return e;
   }

   private static Image a(byte[] var0) {
      Image var2;
      try {
         var2 = Image.createImage(var0, 0, var0.length);
      } catch (Exception var1) {
         var2 = null;
      }

      return var2;
   }

   private static void a(byte var0) {
      byte var2 = -1;
      ds.c("is loading map = " + af.bI);
      p.j().aX = 0;
      p.bl = false;
      cw.a = null;
      p.aD.f = false;
      p.aE.f = false;
      p.z = 0;
      main.a.G.a = false;
      bu.a();
      if (!p.b && !cw.b) {
         p.j().a();
      }

      int var1;
      if (var0 == 1) {
         var1 = af.e().B;
      } else {
         var1 = -1;
      }

      if (var0 != 0) {
         var2 = 0;
      }

      p.a(var1, (int)var2);
      bv.h();
      bv.c(bv.e);
      ds.c("LOAD GAMESCR 2");
      af.e().D = 0;
      af.e().H = 4;
      af.e().bP = null;
      af.e().aQ = null;
      af.e().aU = null;
      af.e().aT = null;
      af.e().aV = null;
      af.e().cf = null;
      af.e().c(false);
      af.e().cg = null;
      main.a.l();
      if (af.e().C >= bv.d - 100) {
         af.e().bq = true;
         af var6 = af.e();
         var6.B += ds.g(ds.b(0, 80));
         bt.a().g();
      }

      p.j().l();
      main.a.a(bv.o);
      af.bH = false;

      for(var1 = 0; var1 < af.e().aB.size(); ++var1) {
         af.e().aB.elementAt(var1);
      }

      main.a.g();
      main.a.f();
      p.j().bC = af.e().U;
      p.j().bz = af.e().T;
      af.bG = false;
      p.j().b();
      if (af.e().C <= 10 && var0 != 0 && var0 != 2) {
         int var5 = af.e().B;
         int var7 = af.e().C;
         int var3 = af.e().bU;
         int var4 = af.e().I;
         if (var0 == 1) {
            var1 = af.e().K;
         } else {
            var1 = var0;
         }

         cn.a(new cn(var5, var7, var3, var4, 1, true, var1));
         af.e().s = true;
      }

      if (var0 == 2) {
         af.e().r();
      }

      if (p.j().bb) {
         if (bv.l == p.j().bh && bv.n == p.j().bi) {
            p.j().c(p.j().bf, p.j().bg);
         }

         if (en.b > 1) {
            p.j().p();
         }
      }

      bp.c();
      bp.a(bv.k, aw.ck + " " + bv.n, 30);
      main.a.h();
      main.a.d = false;
      v.b();
      v.a();
      main.a.X = 2;
      main.a.Y = l.d() + 1000L;
   }

   private static void a(byte var0, y var1) {
      boolean var3 = false;
      if (var0 == 127) {
         label123: {
            byte var2;
            StringBuffer var5;
            boolean var10001;
            try {
               main.a.h();
               String var6 = var1.c().readUTF();
               bs.j = var6;
               bs.a(var6);
               var5 = new StringBuffer(">>>>read.isEXTRA_LINK ");
               ds.c(var5.append(var6).toString());
               var2 = var1.c().readByte();
               var5 = new StringBuffer(">>>>read.isEXTRA_LINK  numSv: ");
               ds.c(var5.append(var2).toString());
            } catch (Exception var18) {
               var10001 = false;
               break label123;
            }

            if (var2 > 0) {
               try {
                  bs.e = new byte[var2];
                  bs.f = new af[var2];
               } catch (Exception var16) {
                  var10001 = false;
                  break label123;
               }

               for(int var19 = 0; var19 < var2; ++var19) {
                  af var23;
                  af[] var24;
                  try {
                     bs.e[var19] = var1.c().readByte();
                     var5 = new StringBuffer(String.valueOf(bs.a[var19]));
                     ds.c(var5.append(">>>>read.isEXTRA_LINK  typeClass: ").append(bs.e[var19]).toString());
                     if (bs.e[var19] < 0) {
                        continue;
                     }

                     bs.g = true;
                     var24 = bs.f;
                     var23 = new af();
                  } catch (Exception var17) {
                     var10001 = false;
                     break label123;
                  }

                  var24[var19] = var23;

                  try {
                     bs.f[var19].K = bs.e[var19];
                     bs.f[var19].bU = var1.c().readShort();
                     bs.f[var19].bW = var1.c().readShort();
                     bs.f[var19].bV = var1.c().readShort();
                     bs.f[var19].bX = var1.c().readShort();
                     bs.f[var19].ag = var1.c().readUTF();
                  } catch (Exception var15) {
                     var10001 = false;
                     break label123;
                  }
               }
            }

            try {
               bs.m();
               bs.c = false;
               af.bI = false;
               x.c = false;
               bs.m = false;
            } catch (Exception var14) {
               var10001 = false;
               break label123;
            }

            boolean var22;
            label127: {
               boolean var4;
               try {
                  var4 = av.c("acc").equals("");
               } catch (Exception var8) {
                  var22 = false;
                  break label127;
               }

               boolean var20;
               if (!var4) {
                  var20 = true;
               } else {
                  var20 = false;
               }

               try {
                  StringBuffer var21 = new StringBuffer("userAo");
                  var4 = av.c(var21.append(bs.n).toString()).equals("");
               } catch (Exception var7) {
                  var22 = var20;
                  break label127;
               }

               var22 = var20;
               if (!var4) {
                  var3 = true;
                  var22 = var20;
               }
            }

            label93: {
               try {
                  if (bs.g) {
                     break label93;
                  }
               } catch (Exception var13) {
                  var10001 = false;
                  break label123;
               }

               if (!var22 && !var3) {
                  try {
                     bs.l();
                     return;
                  } catch (Exception var9) {
                     var10001 = false;
                     break label123;
                  }
               }
            }

            try {
               if (av.d(bs.w) == -1) {
                  eu.b = false;
                  main.a.al.b();
                  return;
               }
            } catch (Exception var12) {
               var10001 = false;
               break label123;
            }

            try {
               bs.a(av.d(bs.w), false);
               if (bs.f != null && bs.f[bs.n] != null) {
                  main.a.am.a(bs.f[bs.n]);
                  return;
               }
            } catch (Exception var11) {
               var10001 = false;
               break label123;
            }

            try {
               bs.l();
               return;
            } catch (Exception var10) {
               var10001 = false;
            }
         }

         ds.c(">>>>read.isEXTRA_LINK  errr:");
         main.a.al.b();
      }

   }

   private static void a(bf var0) {
      if (af.e().aC == null) {
         af.e().aC = var0;
      } else if (var0.a.equals(af.e().aC.a)) {
         af.e().aC = var0;
      }

      af.e().az.addElement(var0);
      if ((var0.a.e == 1 || var0.a.e == 4 || var0.a.e == 2 || var0.a.e == 3) && (var0.a.c == 0 || var0.a.c > 0 && var0.c > 0)) {
         if (var0.a.a == af.e().aP) {
            bt.a().i(af.e().aP);
         }

         af.e().aA.addElement(var0);
      }

   }

   private static void a(DataInputStream var0) {
      p.an = var0.readByte();
      p.j().L = new ek[var0.readByte()];

      int var1;
      for(var1 = 0; var1 < p.j().L.length; ++var1) {
         p.j().L[var1] = new ek();
         p.j();
         p.j();
         var0.readUTF();
      }

      p.I = new da[var0.readByte()];

      for(var1 = 0; var1 < p.I.length; ++var1) {
         p.I[var1] = new da();
         p.I[var1].a = var1;
         var0.readUTF();
         p.I[var1].b = new et[var0.readByte()];

         for(int var2 = 0; var2 < p.I[var1].b.length; ++var2) {
            p.I[var1].b[var2] = new et();
            p.I[var1].b[var2].a = var0.readByte();
            p.I[var1].b[var2].b = var0.readUTF();
            p.I[var1].b[var2].c = var0.readByte();
            p.I[var1].b[var2].d = var0.readByte();
            p.I[var1].b[var2].e = var0.readByte();
            p.I[var1].b[var2].f = var0.readShort();
            p.I[var1].b[var2].i = var0.readUTF();
            short var3 = 130;
            if (main.a.A == 128 || main.a.B <= 208) {
               var3 = 100;
            }

            p.I[var1].b[var2].g = di.m.a(var0.readUTF(), var3);
            p.I[var1].b[var2].h = new bf[var0.readByte()];

            for(int var4 = 0; var4 < p.I[var1].b[var2].h.length; ++var4) {
               p.I[var1].b[var2].h[var4] = new bf();
               p.I[var1].b[var2].h[var4].b = var0.readShort();
               p.I[var1].b[var2].h[var4].a = p.I[var1].b[var2];
               p.I[var1].b[var2].h[var4].c = var0.readByte();
               p.I[var1].b[var2].h[var4].d = var0.readLong();
               p.I[var1].b[var2].h[var4].i = var0.readShort();
               p.I[var1].b[var2].h[var4].e = var0.readInt();
               p.I[var1].b[var2].h[var4].g = var0.readShort();
               p.I[var1].b[var2].h[var4].h = var0.readShort();
               var0.readByte();
               p.I[var1].b[var2].h[var4].k = var0.readShort();
               var0.readShort();
               p.I[var1].b[var2].h[var4].l = var0.readUTF();
               o.a(p.I[var1].b[var2].h[var4]);
            }
         }
      }

   }

   private static void a(DataInputStream var0, boolean var1) {
      p.al = var0.readByte();
      ds.c("vcData= " + p.al + " vData=" + p.ap);
      av.a("NR_dart", ai.a(var0));
      av.a("NR_arrow", ai.a(var0));
      av.a("NR_effect", ai.a(var0));
      av.a("NR_image", ai.a(var0));
      av.a("NR_part", ai.a(var0));
      av.a("NR_skill", ai.a(var0));
      av.a("NRdata");
   }

   private static void a(y var0, int var1) {
      boolean var4 = false;
      boolean var3 = false;

      Exception var10000;
      label149: {
         byte var2;
         cb var5;
         boolean var10001;
         try {
            var5 = new cb();
            var2 = var0.c().readByte();
            var5.b = var2;
            var5.a = var0.c().readInt();
            var5.c = var0.c().readInt();
            var5.d = var0.c().readUTF();
            var5.h = var0.c().readByte();
            var5.e = (long)(var0.c().readInt() + 1000000000);
            StringBuffer var6 = new StringBuffer("type= ");
            ds.c(var6.append(var5.b).append(" id= ").append(var5.a).append(" playID= ").append(var5.c).append(" time= ").append(var5.e).toString());
            p.aW = false;
         } catch (Exception var21) {
            var10000 = var21;
            var10001 = false;
            break label149;
         }

         if (var2 == 0) {
            label151: {
               String var23;
               try {
                  var23 = var0.c().readUTF();
                  StringBuffer var7 = new StringBuffer("str chat ");
                  ds.c(var7.append(var23).toString());
                  p.aW = true;
                  if (di.k.a(var23) > g.ab - 60) {
                     var5.f = di.k.a(var23, g.ab - 10);
                     break label151;
                  }
               } catch (Exception var16) {
                  var10000 = var16;
                  var10001 = false;
                  break label149;
               }

               try {
                  var5.f = new String[1];
                  var5.f[0] = var23;
               } catch (Exception var15) {
                  var10000 = var15;
                  var10001 = false;
                  break label149;
               }
            }

            try {
               var5.g = var0.c().readByte();
            } catch (Exception var14) {
               var10000 = var14;
               var10001 = false;
               break label149;
            }

            var4 = var3;
         } else if (var2 == 1) {
            label152: {
               try {
                  var5.i = var0.c().readByte();
                  var5.j = var0.c().readByte();
               } catch (Exception var13) {
                  var10000 = var13;
                  var10001 = false;
                  break label149;
               }

               var3 = var4;

               label136: {
                  try {
                     if (var0.c().readByte() != 1) {
                        break label136;
                     }
                  } catch (Exception var20) {
                     var10000 = var20;
                     var10001 = false;
                     break label149;
                  }

                  var3 = true;
               }

               if (var3) {
                  try {
                     p.aW = true;
                  } catch (Exception var12) {
                     var10000 = var12;
                     var10001 = false;
                     break label149;
                  }
               }

               label130: {
                  try {
                     if (var5.c == af.e().J) {
                        break label130;
                     }

                     if (var5.i < var5.j) {
                        var5.k = new String[]{aw.cF};
                        break label130;
                     }
                  } catch (Exception var19) {
                     var10000 = var19;
                     var10001 = false;
                     break label149;
                  }

                  try {
                     var5.k = null;
                  } catch (Exception var11) {
                     var10000 = var11;
                     var10001 = false;
                     break label149;
                  }
               }

               var4 = var3;

               try {
                  if (main.a.G.ai == null) {
                     break label152;
                  }

                  main.a.G.a(var5.i, var5.j);
               } catch (Exception var18) {
                  var10000 = var18;
                  var10001 = false;
                  break label149;
               }

               var4 = var3;
            }
         } else {
            var4 = var3;
            if (var2 == 2) {
               label154: {
                  var4 = var3;

                  try {
                     if (af.e().aj != 0) {
                        break label154;
                     }

                     p.aW = true;
                     var5.k = new String[]{aw.bu, aw.cG};
                  } catch (Exception var17) {
                     var10000 = var17;
                     var10001 = false;
                     break label149;
                  }

                  var4 = var3;
               }
            }
         }

         label155: {
            try {
               if (main.a.E != p.c) {
                  p.aW = false;
                  break label155;
               }
            } catch (Exception var10) {
               var10000 = var10;
               var10001 = false;
               break label149;
            }

            try {
               if (main.a.G.a && main.a.G.A == 0 && main.a.G.B == 3) {
                  p.aW = false;
               }
            } catch (Exception var9) {
               var10000 = var9;
               var10001 = false;
               break label149;
            }
         }

         try {
            cb.a(var5, var1, var4);
            return;
         } catch (Exception var8) {
            var10000 = var8;
            var10001 = false;
         }
      }

      Exception var22 = var10000;
      var22.printStackTrace();
   }

   private static boolean a(af var0, y var1) {
      boolean var4 = true;

      Exception var10000;
      label85: {
         StringBuffer var5;
         boolean var10001;
         try {
            var0.Q = var1.c().readByte();
            var0.bc = var1.c().readBoolean();
            var0.aN = var1.c().readByte();
            var5 = new StringBuffer("ADD TYPE PK= ");
            ds.c(var5.append(var0.aN).append(" to player ").append(var0.J).toString());
            var0.ax = p.I[var1.c().readByte()];
            var0.K = var1.c().readByte();
            var0.bU = var1.c().readShort();
            var0.ag = var1.c().readUTF();
            var0.U = var1.c().readLong();
            var0.cT = var0.U;
            if (var0.U == 0L) {
               var0.H = 14;
            }
         } catch (Exception var13) {
            var10000 = var13;
            var10001 = false;
            break label85;
         }

         try {
            var0.V = var1.c().readLong();
            if (var0.C >= bv.d - 100) {
               var0.bq = true;
            }
         } catch (Exception var12) {
            var10000 = var12;
            var10001 = false;
            break label85;
         }

         try {
            var0.bW = var1.c().readShort();
            var0.bV = var1.c().readShort();
            var0.bX = var1.c().readShort();
            var5 = new StringBuffer(" body= ");
            ds.c(var5.append(var0.bW).append(" leg= ").append(var0.bV).append(" bag=").append(var0.bX).append("BAG ==").append(var0.bX).append("*********************************").toString());
            var0.bd = true;
            var1.c().readByte();
            if (var0.bY == -1) {
               var0.t();
            }
         } catch (Exception var11) {
            var10000 = var11;
            var10001 = false;
            break label85;
         }

         try {
            if (var0.bW == -1) {
               var0.u();
            }
         } catch (Exception var10) {
            var10000 = var10;
            var10001 = false;
            break label85;
         }

         try {
            if (var0.bV == -1) {
               var0.v();
            }
         } catch (Exception var9) {
            var10000 = var9;
            var10001 = false;
            break label85;
         }

         byte var3;
         try {
            ds.c("1");
            var0.B = var1.c().readShort();
            var0.C = var1.c().readShort();
            var0.cl = var0.B;
            var0.cm = var0.C;
            var0.R = var1.c().readShort();
            var0.S = var1.c().readShort();
            var3 = var1.c().readByte();
         } catch (Exception var8) {
            var10000 = var8;
            var10001 = false;
            break label85;
         }

         for(int var2 = 0; var2 < var3; ++var2) {
            try {
               ec var16 = new ec(var1.c().readByte(), var1.c().readInt(), var1.c().readInt(), var1.c().readShort());
               var0.aB.addElement(var16);
            } catch (Exception var7) {
               var10000 = var7;
               var10001 = false;
               break label85;
            }
         }

         try {
            StringBuffer var15 = new StringBuffer("Controller readCharInfo body: body|leg|bag ");
            ds.c(var15.append(var0.bW).append(var0.bV).append(var0.bX).toString());
            return var4;
         } catch (Exception var6) {
            var10000 = var6;
            var10001 = false;
         }
      }

      Exception var14 = var10000;
      var14.printStackTrace();
      var4 = false;
      return var4;
   }

   public static ee b(y param0) {
      // $FF: Couldn't be decompiled
   }

   private static void b(DataInputStream var0) {
      byte var4 = 0;
      System.out.println(">>>createMap: " + var0.available());
      p.am = var0.readByte();
      bv.w = new String[var0.readShort()];

      int var1;
      for(var1 = 0; var1 < bv.w.length; ++var1) {
         bv.w[var1] = var0.readUTF();
      }

      do.dg = new ap[var0.readByte()];

      for(byte var5 = 0; var5 < do.dg.length; ++var5) {
         do.dg[var5] = new ap();
         do.dg[var5].a = var5;
         do.dg[var5].b = var0.readUTF();
         do.dg[var5].c = var0.readShort();
         do.dg[var5].d = var0.readShort();
         do.dg[var5].e = var0.readShort();
         do.dg[var5].f = new String[var0.readByte()][];

         for(int var2 = 0; var2 < do.dg[var5].f.length; ++var2) {
            do.dg[var5].f[var2] = new String[var0.readByte()];

            for(int var3 = 0; var3 < do.dg[var5].f[var2].length; ++var3) {
               do.dg[var5].f[var2][var3] = var0.readUTF();
            }
         }
      }

      aa.c = new dy[var0.readShort()];

      for(var1 = var4; var1 < aa.c.length; ++var1) {
         aa.c[var1] = new dy();
         aa.c[var1].c = var0.readByte();
         aa.c[var1].e = var0.readUTF();
         aa.c[var1].d = var0.readLong();
         aa.c[var1].a = var0.readByte();
         aa.c[var1].b = var0.readByte();
         aa.c[var1].g = var0.readByte();
      }

   }

   private void b(DataInputStream var1, boolean var2) {
      int var4 = 0;
      byte var5 = 0;

      Exception var10000;
      label146: {
         byte var6;
         boolean var10001;
         try {
            var1.mark(1000000);
            p.ao = var1.readByte();
            var6 = var1.readByte();
         } catch (Exception var23) {
            var10000 = var23;
            var10001 = false;
            break label146;
         }

         byte[] var26;
         if (var6 == 0) {
            label151: {
               try {
                  p.j().K = new dn[var1.readShort()];
               } catch (Exception var14) {
                  var10000 = var14;
                  var10001 = false;
                  break label151;
               }

               var4 = var5;

               while(true) {
                  try {
                     if (var4 >= p.j().K.length) {
                        break;
                     }
                  } catch (Exception var13) {
                     var10000 = var13;
                     var10001 = false;
                     break label151;
                  }

                  dn[] var7;
                  dn var8;
                  try {
                     var7 = p.j().K;
                     var8 = new dn();
                  } catch (Exception var12) {
                     var10000 = var12;
                     var10001 = false;
                     break label151;
                  }

                  var7[var4] = var8;

                  try {
                     p.j().K[var4].a = var4;
                     p.j().K[var4].b = var1.readUTF();
                     p.j();
                     var1.readByte();
                  } catch (Exception var11) {
                     var10000 = var11;
                     var10001 = false;
                     break label151;
                  }

                  ++var4;
               }

               if (!var2) {
                  return;
               }

               try {
                  var1.reset();
                  var26 = new byte[var1.available()];
                  var1.readFully(var26);
                  av.a("NRitem0", var26);
                  return;
               } catch (Exception var10) {
                  var10000 = var10;
                  var10001 = false;
               }
            }
         } else {
            short var25;
            if (var6 == 1) {
               label153: {
                  try {
                     dp.a.clear();
                     var25 = var1.readShort();
                  } catch (Exception var17) {
                     var10000 = var17;
                     var10001 = false;
                     break label153;
                  }

                  for(var4 = 0; var4 < var25; ++var4) {
                     try {
                        dd var27 = new dd((short)var4, var1.readByte(), var1.readByte(), var1.readUTF(), var1.readUTF(), var1.readByte(), var1.readInt(), var1.readShort(), var1.readShort(), var1.readBoolean());
                        dp.a(var27);
                     } catch (Exception var16) {
                        var10000 = var16;
                        var10001 = false;
                        break label153;
                     }
                  }

                  if (!var2) {
                     return;
                  }

                  try {
                     var1.reset();
                     var26 = new byte[var1.available()];
                     var1.readFully(var26);
                     av.a("NRitem1", var26);
                     av.a("NRitemVersion", new byte[]{p.ao});
                     return;
                  } catch (Exception var15) {
                     var10000 = var15;
                     var10001 = false;
                  }
               }
            } else {
               if (var6 == 2) {
                  return;
               }

               if (var6 == 100) {
                  label155: {
                     try {
                        af.cU = c(var1);
                     } catch (Exception var19) {
                        var10000 = var19;
                        var10001 = false;
                        break label155;
                     }

                     if (!var2) {
                        return;
                     }

                     try {
                        var1.reset();
                        var26 = new byte[var1.available()];
                        var1.readFully(var26);
                        av.a("NRitem100", var26);
                        return;
                     } catch (Exception var18) {
                        var10000 = var18;
                        var10001 = false;
                     }
                  }
               } else {
                  if (var6 != 101) {
                     return;
                  }

                  label157: {
                     try {
                        var25 = var1.readShort();
                        af.da = new short[var25];
                     } catch (Exception var22) {
                        var10001 = false;
                        break label157;
                     }

                     for(; var4 < var25; ++var4) {
                        try {
                           short var3 = var1.readShort();
                           af.da[var4] = var3;
                        } catch (Exception var21) {
                           var10001 = false;
                           break label157;
                        }
                     }

                     if (!var2) {
                        return;
                     }

                     try {
                        var1.reset();
                        var26 = new byte[var1.available()];
                        var1.readFully(var26);
                        av.a("NRitem101", var26);
                        return;
                     } catch (Exception var20) {
                        var10001 = false;
                     }
                  }

                  try {
                     af.da = new short[0];
                     return;
                  } catch (Exception var9) {
                     var10000 = var9;
                     var10001 = false;
                  }
               }
            }
         }
      }

      Exception var24 = var10000;
      var24.printStackTrace();
   }

   private static void b(y var0, int var1) {
      Exception var10000;
      label48: {
         byte var4;
         int[][] var6;
         boolean var10001;
         try {
            var4 = var0.c().readByte();
            var6 = new int[var4][];
         } catch (Exception var11) {
            var10000 = var11;
            var10001 = false;
            break label48;
         }

         int var2 = 0;

         label41:
         while(true) {
            if (var2 >= var4) {
               try {
                  t var7 = d;
                  StringBuffer var13 = new StringBuffer(String.valueOf(var1));
                  var7.put(var13.toString(), var6);
                  return;
               } catch (Exception var8) {
                  var10000 = var8;
                  var10001 = false;
                  break;
               }
            }

            byte var5;
            try {
               var5 = var0.c().readByte();
               var6[var2] = new int[var5];
            } catch (Exception var10) {
               var10000 = var10;
               var10001 = false;
               break;
            }

            for(int var3 = 0; var3 < var5; ++var3) {
               try {
                  var6[var2][var3] = var0.c().readByte();
               } catch (Exception var9) {
                  var10000 = var9;
                  var10001 = false;
                  break label41;
               }
            }

            ++var2;
         }
      }

      Exception var12 = var10000;
      var12.printStackTrace();
   }

   private void c(y var1) {
      h var3;
      try {
         int var2 = var1.c().readUnsignedByte();
         var3 = p.Q.aH[var2];
         var3.r = var1.c().readInt();
         var3.l = var1.c().readByte();
         el var4 = new el("item.options");
         var3.c = var4;
      } catch (Exception var7) {
         var7.printStackTrace();
         return;
      }

      while(true) {
         while(true) {
            boolean var10001;
            ee var8;
            try {
               var8 = b(var1);
            } catch (Exception var6) {
               var10001 = false;
               return;
            }

            if (var8 != null) {
               try {
                  var3.c.addElement(var8);
               } catch (Exception var5) {
                  var10001 = false;
                  return;
               }
            }
         }
      }
   }

   private static int[][] c(DataInputStream var0) {
      int[][] var4 = new int[][]{{542, 543}};

      int[][] var5;
      label72: {
         Exception var10000;
         label65: {
            boolean var10001;
            try {
               var5 = new int[var0.readShort()][];
            } catch (Exception var10) {
               var10000 = var10;
               var10001 = false;
               break label65;
            }

            int var1 = 0;

            label55:
            while(true) {
               var4 = var5;

               try {
                  if (var1 >= var5.length) {
                     break label72;
                  }
               } catch (Exception var9) {
                  var10000 = var9;
                  var10001 = false;
                  break;
               }

               var4 = var5;

               byte var3;
               try {
                  var3 = var0.readByte();
               } catch (Exception var8) {
                  var10000 = var8;
                  var10001 = false;
                  break;
               }

               var4 = var5;

               try {
                  var5[var1] = new int[var3];
               } catch (Exception var7) {
                  var10000 = var7;
                  var10001 = false;
                  break;
               }

               for(int var2 = 0; var2 < var3; ++var2) {
                  var4 = var5;

                  try {
                     var5[var1][var2] = var0.readShort();
                  } catch (Exception var6) {
                     var10000 = var6;
                     var10001 = false;
                     break label55;
                  }
               }

               ++var1;
            }
         }

         Exception var11 = var10000;
         var11.printStackTrace();
         return var4;
      }

      var4 = var5;
      return var4;
   }

   private static void d(y var0) {
      byte var5 = var0.c().readByte();
      ab.a = new bg[var5];
      ds.c("[LEN] sl nguoi choi " + var5);

      for(int var4 = 0; var4 < var5; ++var4) {
         int var6 = var0.c().readInt();
         String var9 = var0.c().readUTF();
         short var2 = var0.c().readShort();
         short var3 = var0.c().readShort();
         short var1 = var0.c().readShort();
         long var7 = var0.c().readLong();
         ab.a[var4] = new bg(var6, var9, var2, var3, var1, var7);
      }

      throw new NullPointerException();
   }

   private void e(y var1) {
      label694: {
         label696: {
            StringBuffer var13;
            boolean var10001;
            String var98;
            label692: {
               label691: {
                  try {
                     var13 = new StringBuffer("123 char= ");
                     if (var13.append(af.e()).toString() == null) {
                        break label691;
                     }
                  } catch (Exception var86) {
                     var10001 = false;
                     break label696;
                  }

                  var98 = "!null";
                  break label692;
               }

               var98 = "null";
            }

            short var5;
            label697: {
               try {
                  ds.c(var98);
                  af var14 = af.e();
                  af var99 = af.e();
                  af.e();
                  var5 = var1.c().readShort();
                  var99.bD = var5;
                  var14.B = var5;
                  var14 = af.e();
                  var99 = af.e();
                  af.e();
                  var5 = var1.c().readShort();
                  var99.bE = var5;
                  var14.C = var5;
                  af.e().cl = af.e().B;
                  af.e().cm = af.e().C;
                  var13 = new StringBuffer("head= ");
                  ds.c(var13.append(af.e().bU).append(" body= ").append(af.e().bW).append(" left= ").append(af.e().bV).append(" x= ").append(af.e().B).append(" y= ").append(af.e().C).append(" chung toc= ").append(af.e().K).toString());
                  if (af.e().B >= 0 && af.e().B <= 100) {
                     af.e().I = 1;
                     break label697;
                  }
               } catch (Exception var85) {
                  var10001 = false;
                  break label696;
               }

               try {
                  if (af.e().B >= bv.a - 100 && af.e().B <= bv.a) {
                     af.e().I = -1;
                  }
               } catch (Exception var84) {
                  var10001 = false;
                  break label696;
               }
            }

            byte var6;
            try {
               var6 = var1.c().readByte();
               var13 = new StringBuffer("vGo size= ");
               ds.c(var13.append(var6).toString());
               if (!p.aD.e) {
                  p.aD.d = af.e().B - p.j;
                  p.aD.c = af.e().C - p.k;
               }
            } catch (Exception var83) {
               var10001 = false;
               break label696;
            }

            int var87;
            for(var87 = 0; var87 < var6; ++var87) {
               try {
                  new bw(var1.c().readShort(), var1.c().readShort(), var1.c().readShort(), var1.c().readShort(), var1.c().readBoolean(), var1.c().readBoolean(), var1.c().readUTF());
               } catch (Exception var82) {
                  var10001 = false;
                  break label696;
               }
            }

            try {
               var6 = var1.c().readByte();
               aa.L.removeAllElements();
            } catch (Exception var81) {
               var10001 = false;
               break label696;
            }

            byte var88 = 0;

            label653:
            while(true) {
               if (var88 >= var6) {
                  try {
                     if (af.e().aR != null && p.c(af.e().aR.y) == null) {
                        af.e().aR.v();
                        af.e().aR.m = af.e().B;
                        af.e().aR.n = af.e().C - 40;
                        p.F.addElement(af.e().aR);
                     }
                  } catch (Exception var66) {
                     var10001 = false;
                     break;
                  }

                  try {
                     var1.c().readByte();
                     var6 = var1.c().readByte();
                     var13 = new StringBuffer("NPC size= ");
                     ds.c(var13.append(var6).toString());
                  } catch (Exception var65) {
                     var10001 = false;
                     break;
                  }

                  byte var7;
                  short var8;
                  short var9;
                  for(var87 = 0; var87 < var6; ++var87) {
                     short var10;
                     byte var11;
                     try {
                        var7 = var1.c().readByte();
                        var10 = var1.c().readShort();
                        var9 = var1.c().readShort();
                        var11 = var1.c().readByte();
                        var13 = new StringBuffer("tempalte = ");
                        ds.c(var13.append(var11).toString());
                        var8 = var1.c().readShort();
                        ds.c("1");
                     } catch (Exception var62) {
                        var10001 = false;
                        break label653;
                     }

                     if (var11 != 6) {
                        label704: {
                           try {
                              ds.c("2");
                              if (af.e().aD.c >= 7 && (af.e().aD.c != 7 || af.e().aD.a > 1)) {
                                 break label704;
                              }
                           } catch (Exception var64) {
                              var10001 = false;
                              break label653;
                           }

                           if (var11 == 7 || var11 == 8 || var11 == 9) {
                              continue;
                           }

                           try {
                              ds.c("3");
                           } catch (Exception var61) {
                              var10001 = false;
                              break label653;
                           }
                        }

                        label569: {
                           try {
                              if (af.e().aD.c >= 6) {
                                 break label569;
                              }
                           } catch (Exception var63) {
                              var10001 = false;
                              break label653;
                           }

                           if (var11 == 16) {
                              continue;
                           }
                        }

                        if (var11 == 4) {
                           try {
                              p var102 = p.j();
                              k var109 = new k(var87, var7, var10, var9, var11, var8);
                              var102.aM = var109;
                              bt.a().e((byte)2);
                              p.G.addElement(p.j().aM);
                              ds.c("5");
                           } catch (Exception var60) {
                              var10001 = false;
                              break label653;
                           }
                        } else {
                           try {
                              do var110 = new do(var87, var7, var10, var9 + 3, var11, var8);
                              p.G.addElement(var110);
                              ds.c("6");
                           } catch (Exception var59) {
                              var10001 = false;
                              break label653;
                           }
                        }
                     }
                  }

                  try {
                     var7 = var1.c().readByte();
                     var13 = new StringBuffer("item size = ");
                     ds.c(var13.append(var7).toString());
                  } catch (Exception var58) {
                     var10001 = false;
                     break;
                  }

                  int var89;
                  boolean var91;
                  for(var87 = 0; var87 < var7; ++var87) {
                     short var3;
                     short var4;
                     try {
                        var3 = var1.c().readShort();
                        var4 = var1.c().readShort();
                        var8 = var1.c().readShort();
                        var9 = var1.c().readShort();
                        var89 = var1.c().readInt();
                     } catch (Exception var55) {
                        var10001 = false;
                        break label653;
                     }

                     short var2 = 0;
                     if (var89 == -2) {
                        try {
                           var2 = var1.c().readShort();
                        } catch (Exception var54) {
                           var10001 = false;
                           break label653;
                        }
                     }

                     ce var115;
                     try {
                        var115 = new ce(var89, var3, var4, var8, var9, var2);
                     } catch (Exception var53) {
                        var10001 = false;
                        break label653;
                     }

                     var89 = 0;

                     label547: {
                        while(true) {
                           try {
                              if (var89 >= p.E.size()) {
                                 break;
                              }
                           } catch (Exception var57) {
                              var10001 = false;
                              break label653;
                           }

                           label540: {
                              try {
                                 if (((ce)p.E.elementAt(var89)).d == var115.d) {
                                    break label540;
                                 }
                              } catch (Exception var56) {
                                 var10001 = false;
                                 break label653;
                              }

                              ++var89;
                              continue;
                           }

                           var91 = true;
                           break label547;
                        }

                        var91 = false;
                     }

                     if (!var91) {
                        try {
                           p.E.addElement(var115);
                        } catch (Exception var52) {
                           var10001 = false;
                           break label653;
                        }
                     }
                  }

                  try {
                     bv.v.removeAllElements();
                     if (en.b == 1) {
                        cz.a();
                     }
                  } catch (Exception var51) {
                     var10001 = false;
                     break;
                  }

                  label708: {
                     short var92;
                     label709: {
                        label514: {
                           try {
                              cz.l.removeAllElements();
                              if (!main.a.a || main.a.a && bv.a()) {
                                 break label514;
                              }
                           } catch (Exception var50) {
                              var10001 = false;
                              break;
                           }

                           try {
                              if (bv.l != 45 && bv.l != 46 && bv.l != 47 && bv.l != 48 && bv.l != 120 && bv.l != 128 && bv.l != 170 && bv.l != 49) {
                                 break label709;
                              }
                           } catch (Exception var49) {
                              var10001 = false;
                              break;
                           }
                        }

                        try {
                           var8 = var1.c().readShort();
                        } catch (Exception var38) {
                           var10001 = false;
                           break;
                        }

                        int var90;
                        StringBuffer var104;
                        t var114;
                        for(var90 = 0; var90 < var8; ++var90) {
                           cz var103;
                           label713: {
                              try {
                                 var5 = var1.c().readShort();
                                 var9 = var1.c().readShort();
                                 var92 = var1.c().readShort();
                                 if (bv.a(var5) == null) {
                                    continue;
                                 }

                                 cz var117 = bv.a(var5);
                                 var103 = new cz();
                                 var103.a = var5;
                                 var103.c = var117.c;
                                 var103.f = var117.f;
                                 var103.g = var117.g;
                                 var103.d = bv.i * var9;
                                 var103.e = bv.i * var92;
                                 var103.h = var117.h;
                                 if (!bv.b(var103.a)) {
                                    break label713;
                                 }
                              } catch (Exception var48) {
                                 var10001 = false;
                                 break label653;
                              }

                              byte var93;
                              if (var90 % 2 == 0) {
                                 var93 = 0;
                              } else {
                                 var93 = 2;
                              }

                              try {
                                 var103.b = var93;
                                 if (bv.l == 45) {
                                    var103.b = 0;
                                 }
                              } catch (Exception var37) {
                                 var10001 = false;
                                 break label653;
                              }
                           }

                           el var116;
                           label482: {
                              label714: {
                                 Image var107;
                                 Image var121;
                                 label731: {
                                    try {
                                       t var118 = cz.k;
                                       var104 = new StringBuffer(String.valueOf(var103.c));
                                       if (var118.containsKey(var104.toString())) {
                                          break label482;
                                       }

                                       if (en.b == 1) {
                                          var13 = new StringBuffer("/mapBackGround/");
                                          var107 = l.c(var13.append(var103.c).append(".png").toString());
                                          break label731;
                                       }
                                    } catch (Exception var47) {
                                       var10001 = false;
                                       break label653;
                                    }

                                    var91 = false;

                                    byte[] var119;
                                    try {
                                       var13 = new StringBuffer(String.valueOf(en.b));
                                       var119 = av.b(var13.append("bgItem").append(var103.c).toString());
                                    } catch (Exception var34) {
                                       var10001 = false;
                                       break label653;
                                    }

                                    t var108;
                                    if (var119 != null) {
                                       boolean var96 = var91;

                                       label718: {
                                          try {
                                             if (cz.n == null) {
                                                break label718;
                                             }

                                             var104 = new StringBuffer("Small  last= ");
                                             ds.c(var104.append(var119.length % 127).append("new Version= ").append(cz.n[var103.c]).toString());
                                          } catch (Exception var46) {
                                             var10001 = false;
                                             break label653;
                                          }

                                          var96 = var91;

                                          try {
                                             if (var119.length % 127 == cz.n[var103.c]) {
                                                break label718;
                                             }
                                          } catch (Exception var45) {
                                             var10001 = false;
                                             break label653;
                                          }

                                          var96 = true;
                                       }

                                       var91 = var96;
                                       if (!var96) {
                                          try {
                                             var107 = Image.createImage(var119, 0, var119.length);
                                          } catch (Exception var33) {
                                             var10001 = false;
                                             break label653;
                                          }

                                          if (var107 != null) {
                                             try {
                                                var108 = cz.k;
                                                var13 = new StringBuffer(String.valueOf(var103.c));
                                                var108.put(var13.toString(), var107);
                                             } catch (Exception var32) {
                                                var10001 = false;
                                                break label653;
                                             }

                                             var91 = var96;
                                          } else {
                                             var91 = true;
                                          }
                                       }
                                    } else {
                                       var91 = true;
                                    }

                                    if (var91) {
                                       try {
                                          var13 = new StringBuffer("/mapBackGround/");
                                          var107 = l.c(var13.append(var103.c).append(".png").toString());
                                       } catch (Exception var31) {
                                          var10001 = false;
                                          break label653;
                                       }

                                       var121 = var107;
                                       if (var107 == null) {
                                          try {
                                             var121 = Image.createRGBImage(new int[]{-2013265920}, 1, 1, true);
                                             bt.a().c(var103.c);
                                          } catch (Exception var30) {
                                             var10001 = false;
                                             break label653;
                                          }
                                       }

                                       try {
                                          var108 = cz.k;
                                          var104 = new StringBuffer(String.valueOf(var103.c));
                                          var108.put(var104.toString(), var121);
                                       } catch (Exception var29) {
                                          var10001 = false;
                                          break label653;
                                       }
                                    }
                                    break label714;
                                 }

                                 var121 = var107;
                                 if (var107 == null) {
                                    try {
                                       var121 = Image.createRGBImage(new int[]{-2013265920}, 1, 1, true);
                                       br.b().d();
                                       bt.a().c(var103.c);
                                    } catch (Exception var36) {
                                       var10001 = false;
                                       break label653;
                                    }
                                 }

                                 try {
                                    var114 = cz.k;
                                    StringBuffer var112 = new StringBuffer(String.valueOf(var103.c));
                                    var114.put(var112.toString(), var121);
                                 } catch (Exception var35) {
                                    var10001 = false;
                                    break label653;
                                 }
                              }

                              try {
                                 var116 = cz.m;
                                 var13 = new StringBuffer(String.valueOf(var103.c));
                                 var116.addElement(var13.toString());
                              } catch (Exception var28) {
                                 var10001 = false;
                                 break label653;
                              }
                           }

                           try {
                              var13 = new StringBuffer(String.valueOf(var103.c));
                              if (!cz.a(var13.toString())) {
                                 var116 = cz.l;
                                 var13 = new StringBuffer(String.valueOf(var103.c));
                                 var116.addElement(var13.toString());
                              }
                           } catch (Exception var44) {
                              var10001 = false;
                              break label653;
                           }

                           try {
                              bv.v.addElement(var103);
                           } catch (Exception var27) {
                              var10001 = false;
                              break label653;
                           }
                        }

                        var87 = 0;

                        while(true) {
                           label720: {
                              try {
                                 if (var87 >= cz.m.size()) {
                                    ed.d = false;
                                    ed.e = 0;
                                    ei.a.removeAllElements();
                                    ed.a.removeAllElements();
                                    ea.m.removeAllElements();
                                    var8 = var1.c().readShort();
                                    PrintStream var120 = System.out;
                                    var13 = new StringBuffer("nKey= ");
                                    var120.println(var13.append(var8).toString());
                                    break;
                                 }
                              } catch (Exception var41) {
                                 var10001 = false;
                                 break label653;
                              }

                              t var105;
                              try {
                                 var98 = (String)cz.m.elementAt(var87);
                                 if (cz.a(var98)) {
                                    break label720;
                                 }

                                 cz.k.remove(var98);
                                 var105 = cz.k;
                                 var104 = new StringBuffer(String.valueOf(var98));
                                 if (var105.containsKey(var104.append("blend").append(1).toString())) {
                                    var114 = cz.k;
                                    StringBuffer var106 = new StringBuffer(String.valueOf(var98));
                                    var114.remove(var106.append("blend").append(1).toString());
                                 }
                              } catch (Exception var42) {
                                 var10001 = false;
                                 break label653;
                              }

                              try {
                                 var105 = cz.k;
                                 var104 = new StringBuffer(String.valueOf(var98));
                                 if (var105.containsKey(var104.append("blend").append(3).toString())) {
                                    var105 = cz.k;
                                    var104 = new StringBuffer(String.valueOf(var98));
                                    var105.remove(var104.append("blend").append(3).toString());
                                 }
                              } catch (Exception var43) {
                                 var10001 = false;
                                 break label653;
                              }

                              try {
                                 cz.m.removeElementAt(var87);
                              } catch (Exception var26) {
                                 var10001 = false;
                                 break label653;
                              }

                              --var87;
                           }

                           ++var87;
                        }

                        var87 = 0;

                        while(true) {
                           if (var87 >= var8) {
                              break label708;
                           }

                           label422: {
                              String var111;
                              String var113;
                              label722: {
                                 int var12;
                                 int var94;
                                 int var95;
                                 int var97;
                                 String[] var122;
                                 label420: {
                                    label723: {
                                       try {
                                          var111 = var1.c().readUTF();
                                          var113 = var1.c().readUTF();
                                          PrintStream var123 = System.out;
                                          var104 = new StringBuffer("key= ");
                                          var123.println(var104.append(var111).append(" value= ").append(var113).append("--------------------------------------------------------------------").toString());
                                          if (!var111.equals("eff")) {
                                             break label722;
                                          }

                                          if (g.I > 0) {
                                             break label422;
                                          }

                                          var122 = ds.a(var113, ".", 0);
                                          var97 = Integer.parseInt(var122[0]);
                                          var95 = Integer.parseInt(var122[1]);
                                          var94 = Integer.parseInt(var122[2]);
                                          var12 = Integer.parseInt(var122[3]);
                                          if (var122.length <= 4) {
                                             break label723;
                                          }
                                       } catch (Exception var40) {
                                          var10001 = false;
                                          break label653;
                                       }

                                       try {
                                          var89 = Integer.parseInt(var122[4]);
                                          var90 = Integer.parseInt(var122[5]);
                                          break label420;
                                       } catch (Exception var25) {
                                          var10001 = false;
                                          break label653;
                                       }
                                    }

                                    var89 = -1;
                                    var90 = 1;
                                 }

                                 ea var124;
                                 try {
                                    var124 = new ea(var97, var94, var12, var95, var89, var90);
                                    if (var122.length > 6) {
                                       var124.b = Integer.parseInt(var122[6]);
                                       if (var122.length > 7) {
                                          var124.c = Integer.parseInt(var122[7]);
                                          var124.d = Integer.parseInt(var122[8]);
                                       }
                                    }
                                 } catch (Exception var39) {
                                    var10001 = false;
                                    break label653;
                                 }

                                 try {
                                    ei.a(var124);
                                    break label422;
                                 } catch (Exception var24) {
                                    var10001 = false;
                                    break label653;
                                 }
                              }

                              try {
                                 if (var111.equals("beff") && g.I <= 1) {
                                    ed.a(Integer.parseInt(var113));
                                 }
                              } catch (Exception var23) {
                                 var10001 = false;
                                 break label653;
                              }
                           }

                           ++var87;
                        }
                     }

                     try {
                        var92 = var1.c().readShort();
                     } catch (Exception var22) {
                        var10001 = false;
                        break;
                     }

                     for(var87 = 0; var87 < var92; ++var87) {
                        try {
                           var1.c().readShort();
                           var1.c().readShort();
                           var1.c().readShort();
                        } catch (Exception var21) {
                           var10001 = false;
                           break label653;
                        }
                     }

                     try {
                        var92 = var1.c().readShort();
                     } catch (Exception var20) {
                        var10001 = false;
                        break;
                     }

                     for(var87 = 0; var87 < var92; ++var87) {
                        try {
                           var1.c().readUTF();
                           var1.c().readUTF();
                        } catch (Exception var19) {
                           var10001 = false;
                           break label653;
                        }
                     }
                  }

                  try {
                     bv.p = var1.c().readByte();
                     a(var1.c().readByte());
                     break label694;
                  } catch (Exception var18) {
                     var10001 = false;
                     break;
                  }
               }

               aa var17;
               label728: {
                  try {
                     var17 = new aa(var88, var1.c().readBoolean(), var1.c().readBoolean(), var1.c().readBoolean(), var1.c().readBoolean(), var1.c().readBoolean(), var1.c().readShort(), var1.c().readByte(), var1.c().readLong(), var1.c().readByte(), var1.c().readLong(), var1.c().readShort(), var1.c().readShort(), var1.c().readByte(), var1.c().readByte());
                     var17.P = var17.m;
                     var17.Q = var17.n;
                     var17.I = var1.c().readBoolean();
                     if (aa.c[var17.C].c == 0) {
                        break label728;
                     }
                  } catch (Exception var77) {
                     var10001 = false;
                     break;
                  }

                  if (var88 % 3 == 0) {
                     try {
                        var17.o = -1;
                     } catch (Exception var67) {
                        var10001 = false;
                        break;
                     }
                  } else {
                     try {
                        var17.o = 1;
                     } catch (Exception var76) {
                        var10001 = false;
                        break;
                     }
                  }

                  try {
                     var17.m += 10 - var88 % 20;
                  } catch (Exception var75) {
                     var10001 = false;
                     break;
                  }
               }

               try {
                  var17.J = false;
               } catch (Exception var74) {
                  var10001 = false;
                  break;
               }

               an var100 = null;

               cc var101;
               label633: {
                  try {
                     if (var17.C == 70) {
                        var101 = new cc(var88, (short)var17.m, (short)var17.n, 70, var17.k, var17.l, var17.G);
                        break label633;
                     }
                  } catch (Exception var78) {
                     var10001 = false;
                     break;
                  }

                  var101 = null;
               }

               try {
                  if (var17.C == 71) {
                     var100 = new an(var88, (short)var17.m, (short)var17.n, 71, var17.k, var17.l);
                  }
               } catch (Exception var73) {
                  var10001 = false;
                  break;
               }

               d var15;
               label642: {
                  try {
                     if (var17.C == 72) {
                        var15 = new d(var88, (short)var17.m, (short)var17.n, 72, var17.k, var17.l);
                        break label642;
                     }
                  } catch (Exception var79) {
                     var10001 = false;
                     break;
                  }

                  var15 = null;
               }

               cl var16;
               label650: {
                  try {
                     if (var17.I) {
                        var16 = new cl(var88, (short)var17.m, (short)var17.n, var17.C, var17.k, var17.l);
                        break label650;
                     }
                  } catch (Exception var80) {
                     var10001 = false;
                     break;
                  }

                  var16 = null;
               }

               if (var16 != null) {
                  try {
                     p.F.addElement(var16);
                  } catch (Exception var72) {
                     var10001 = false;
                     break;
                  }
               } else if (var101 != null) {
                  try {
                     p.F.addElement(var101);
                  } catch (Exception var71) {
                     var10001 = false;
                     break;
                  }
               } else if (var100 != null) {
                  try {
                     p.F.addElement(var100);
                  } catch (Exception var70) {
                     var10001 = false;
                     break;
                  }
               } else if (var15 != null) {
                  try {
                     p.F.addElement(var15);
                  } catch (Exception var69) {
                     var10001 = false;
                     break;
                  }
               } else {
                  try {
                     p.F.addElement(var17);
                  } catch (Exception var68) {
                     var10001 = false;
                     break;
                  }
               }

               ++var88;
            }
         }

         ds.b(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> Loadmap khong thanh cong");
         main.a.e();
         bs.m = true;
         main.a.h();
      }

      main.a.d = false;
      ds.b(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> Loadmap thanh cong");
   }

   private void f(y param1) {
      // $FF: Couldn't be decompiled
   }

   private static void g(y param0) {
      // $FF: Couldn't be decompiled
   }

   private void h(y param1) {
      // $FF: Couldn't be decompiled
   }

   private void i(y param1) {
      // $FF: Couldn't be decompiled
   }

   private void j(y var1) {
      byte var4 = 1;

      byte var5;
      try {
         var5 = var1.c().readByte();
      } catch (Exception var16) {
         return;
      }

      if (var5 == 0) {
         byte var6;
         boolean var10001;
         try {
            var6 = var1.c().readByte();
         } catch (Exception var15) {
            var10001 = false;
            return;
         }

         short var2;
         cg var17;
         byte var18;
         int var20;
         if (var6 == 0) {
            try {
               var2 = var1.c().readShort();
               String var7 = var1.c().readUTF();
               String var8 = var1.c().readUTF();
               var20 = var1.c().readInt();
               short var3 = var1.c().readShort();
               var18 = var1.c().readByte();
               var17 = new cg(var5, var2, var7, var8, var20, var3);
               p.bY = var17;
               var17.g = var18;
               p.bY.a(var5, 0, 0);
            } catch (Exception var9) {
               var10001 = false;
            }
         } else if (var6 == 1) {
            try {
               var20 = var1.c().readInt();
               int var19 = var1.c().readInt();
               if (p.bY != null) {
                  var17 = p.bY;
                  var17.a = var5;
                  var17.c = var20;
                  var17.d = var19;
               }
            } catch (Exception var10) {
               var10001 = false;
            }
         } else if (var6 == 2) {
            try {
               var5 = var1.c().readByte();
            } catch (Exception var12) {
               var10001 = false;
               return;
            }

            if (var5 != 1) {
               if (var5 == 2) {
                  var4 = 2;
               } else {
                  var4 = 0;
               }
            }

            try {
               p.bY = null;
               p.a(var4, -1, 0, main.a.C, main.a.D, 0, 0, (short)-1, (bk[])null);
            } catch (Exception var11) {
               var10001 = false;
            }
         } else if (var6 == 5) {
            try {
               var2 = var1.c().readShort();
               if (p.bY != null) {
                  var17 = p.bY;
                  var17.a = var5;
                  var17.m = var2;
                  var17.n = main.a.b;
               }
            } catch (Exception var13) {
               var10001 = false;
            }
         } else if (var6 == 4) {
            try {
               var18 = var1.c().readByte();
               var6 = var1.c().readByte();
               if (p.bY != null) {
                  p.bY.a(var5, var18, var6);
               }
            } catch (Exception var14) {
               var10001 = false;
            }
         }
      }

   }

   private void k(y var1) {
      int var4 = 0;

      byte var2;
      boolean var10001;
      try {
         var2 = var1.c().readByte();
      } catch (Exception var77) {
         var10001 = false;
         return;
      }

      short var3;
      if (var2 == 0) {
         try {
            var3 = var1.c().readShort();
            af.e().cZ = var3;
            bu.a();
            bu.g();
         } catch (Exception var56) {
            var10001 = false;
         }
      } else {
         StringBuffer var7;
         StringBuffer var78;
         String var79;
         byte var80;
         if (var2 == 2) {
            try {
               int var5 = var1.c().readInt();
               var80 = var1.c().readByte();
               short var6 = var1.c().readShort();
               var78 = new StringBuffer(String.valueOf(var6));
               var79 = var78.append(",").append(var80).toString();
               var7 = new StringBuffer("banner_");
               as.a(var7.append(var6).toString(), as.a);
               t var8 = main.a.T;
               var7 = new StringBuffer(String.valueOf(var5));
               var8.put(var7.toString(), var79);
            } catch (Exception var57) {
               var10001 = false;
            }
         } else if (var2 == 3) {
            try {
               var3 = var1.c().readShort();
               bl.a(var3);
               ed.c = var3;
            } catch (Exception var58) {
               var10001 = false;
            }
         } else if (var2 == 4) {
            try {
               var79 = var1.c().readUTF();
               main.a.U.addElement(var79);
            } catch (Exception var59) {
               var10001 = false;
            }
         } else if (var2 == 5) {
            byte var82;
            try {
               var82 = var1.c().readByte();
            } catch (Exception var75) {
               var10001 = false;
               return;
            }

            if (var82 == 0) {
               try {
                  p.cc = var1.c().readUTF();
                  var80 = var1.c().readByte();
                  p.bZ = var80;
                  p.ca = var80;
                  p.cd = var80 << 1;
                  p.ce = false;
                  var78 = new StringBuffer(String.valueOf("\n|ChienTruong|Log: "));
                  var79 = var78.append("\tsub    0|  nCT_team= ").append(p.cc).append("|nCT_TeamA =").append(p.ca).append("  isPaint_CT=false \n").toString();
               } catch (Exception var70) {
                  var10001 = false;
                  return;
               }
            } else if (var82 == 1) {
               try {
                  var4 = var1.c().readInt();
                  var2 = var1.c().readByte();
                  p.cf = var2;
                  p.cb = (long)(var4 * 1000) + l.d();
                  p.ce = true;
                  var78 = new StringBuffer(String.valueOf("\n|ChienTruong|Log: "));
                  var79 = var78.append("\tsub    1 floor= ").append(var2).append("|timeBallte= ").append(var4).append("isPaint_CT=true \n").toString();
               } catch (Exception var69) {
                  var10001 = false;
                  return;
               }
            } else if (var82 == 2) {
               try {
                  p.ca = var1.c().readByte();
                  p.bZ = var1.c().readByte();
                  p.cg.removeAllElements();
                  var82 = var1.c().readByte();
               } catch (Exception var68) {
                  var10001 = false;
                  return;
               }

               for(; var4 < var82; ++var4) {
                  try {
                     var7 = new StringBuffer(String.valueOf(""));
                     String var83 = var7.append(var1.c().readByte()).append("|").toString();
                     StringBuffer var84 = new StringBuffer(String.valueOf(var83));
                     var83 = var84.append(var1.c().readUTF()).append("|").toString();
                     var84 = new StringBuffer(String.valueOf(var83));
                     var83 = var84.append(var1.c().readShort()).append("|").toString();
                     var84 = new StringBuffer(String.valueOf(var83));
                     var83 = var84.append(var1.c().readInt()).toString();
                     p.cg.addElement(var83);
                  } catch (Exception var67) {
                     var10001 = false;
                     return;
                  }
               }

               try {
                  var78 = new StringBuffer(String.valueOf("\n|ChienTruong|Log: "));
                  var79 = var78.append("\tsub   2|  A= ").append(p.ca).append("|B =").append(p.bZ).append("  isPaint_CT=true \n").toString();
               } catch (Exception var66) {
                  var10001 = false;
                  return;
               }
            } else if (var82 == 3) {
               bt var85;
               try {
                  var85 = bt.a();
               } catch (Exception var65) {
                  var10001 = false;
                  return;
               }

               label455: {
                  label454: {
                     label453: {
                        label452: {
                           try {
                              var1 = new y((byte)24);
                              break label452;
                           } catch (Exception var73) {
                           } finally {
                              ;
                           }

                           var1 = null;
                           break label453;
                        }

                        try {
                           try {
                              var1.d().writeByte(var2);
                              var1.d().writeByte(var82);
                              var7 = new StringBuffer(" =====> SEND OPTION_HAT ");
                              ds.b(var7.append(var2).append("_").append(var82).toString());
                              var85.a.a(var1);
                              break label454;
                           } catch (Exception var71) {
                           }
                        } catch (Throwable var72) {
                           y var86 = var1;
                           Throwable var81 = var72;

                           try {
                              var86.e();
                              throw var81;
                           } catch (Exception var55) {
                              var10001 = false;
                              return;
                           }
                        }
                     }

                     try {
                        var1.e();
                        break label455;
                     } catch (Exception var63) {
                        var10001 = false;
                        return;
                     }
                  }

                  try {
                     var1.e();
                  } catch (Exception var64) {
                     var10001 = false;
                     return;
                  }
               }

               try {
                  p.cf = 0;
                  p.cb = 0L;
                  p.ce = false;
                  var78 = new StringBuffer(String.valueOf("\n|ChienTruong|Log: "));
                  var79 = var78.append("\tsub    3|  isPaint_CT=false \n").toString();
               } catch (Exception var62) {
                  var10001 = false;
                  return;
               }
            } else {
               if (var82 == 4) {
                  try {
                     p.ci = var1.c().readByte();
                     p.cj = var1.c().readByte();
                  } catch (Exception var61) {
                     var10001 = false;
                     return;
                  }
               }

               var79 = "\n|ChienTruong|Log: ";
            }

            try {
               var7 = new StringBuffer(String.valueOf(var79));
               ds.b(var7.append("END LOG CT.").toString());
            } catch (Exception var60) {
               var10001 = false;
            }
         } else {
            try {
               a(var2, var1);
            } catch (Exception var76) {
               var10001 = false;
            }
         }
      }

   }

   private static void l(y var0) {
      byte var4 = 0;
      byte var5 = 0;

      short var2;
      boolean var10001;
      try {
         var2 = var0.c().readShort();
      } catch (Exception var26) {
         var10001 = false;
         return;
      }

      byte var3;
      try {
         var3 = var0.c().readByte();
      } catch (Exception var8) {
         var3 = -1;
      }

      bf var27;
      int var29;
      if (var3 == 0) {
         short var1;
         try {
            var1 = var0.c().readShort();
         } catch (Exception var11) {
            var10001 = false;
            return;
         }

         var29 = var5;

         while(true) {
            try {
               if (var29 >= af.e().az.size()) {
                  break;
               }
            } catch (Exception var9) {
               var10001 = false;
               break;
            }

            try {
               var27 = (bf)af.e().az.elementAt(var29);
               if (var27.b == var2) {
                  var27.m = var1;
                  break;
               }
            } catch (Exception var10) {
               var10001 = false;
               break;
            }

            ++var29;
         }
      } else if (var3 == 1) {
         byte var30;
         try {
            var30 = var0.c().readByte();
         } catch (Exception var14) {
            var10001 = false;
            return;
         }

         var29 = 0;

         bf var6;
         while(true) {
            try {
               if (var29 >= af.e().az.size()) {
                  return;
               }

               var6 = (bf)af.e().az.elementAt(var29);
               if (var6.b == var2) {
                  break;
               }
            } catch (Exception var13) {
               var10001 = false;
               return;
            }

            ++var29;
         }

         for(var29 = var4; var29 < 20; ++var29) {
            try {
               StringBuffer var28 = new StringBuffer("Skills_");
               as.a(var28.append(var6.a.a).append("_").append(var30).append("_").append(var29).toString(), as.a);
            } catch (Exception var12) {
               var10001 = false;
               break;
            }
         }
      } else if (var3 == -1) {
         try {
            var27 = o.a(var2);
         } catch (Exception var25) {
            var10001 = false;
            return;
         }

         var29 = 0;

         while(true) {
            try {
               if (var29 >= af.e().az.size()) {
                  break;
               }
            } catch (Exception var23) {
               var10001 = false;
               return;
            }

            try {
               if (((bf)af.e().az.elementAt(var29)).a.a == var27.a.a) {
                  af.e().az.setElementAt(var27, var29);
                  break;
               }
            } catch (Exception var24) {
               var10001 = false;
               return;
            }

            ++var29;
         }

         var29 = 0;

         while(true) {
            try {
               if (var29 >= af.e().aA.size()) {
                  break;
               }
            } catch (Exception var21) {
               var10001 = false;
               return;
            }

            try {
               if (((bf)af.e().aA.elementAt(var29)).a.a == var27.a.a) {
                  af.e().aA.setElementAt(var27, var29);
                  break;
               }
            } catch (Exception var22) {
               var10001 = false;
               return;
            }

            ++var29;
         }

         var29 = 0;

         while(true) {
            try {
               if (var29 >= p.aQ.length) {
                  break;
               }
            } catch (Exception var19) {
               var10001 = false;
               return;
            }

            try {
               if (p.aQ[var29] != null && p.aQ[var29].a.a == var27.a.a) {
                  p.aQ[var29] = var27;
                  break;
               }
            } catch (Exception var20) {
               var10001 = false;
               return;
            }

            ++var29;
         }

         var29 = 0;

         while(true) {
            try {
               if (var29 >= p.aP.length) {
                  break;
               }
            } catch (Exception var17) {
               var10001 = false;
               return;
            }

            try {
               if (p.aP[var29] != null && p.aP[var29].a.a == var27.a.a) {
                  p.aP[var29] = var27;
                  break;
               }
            } catch (Exception var18) {
               var10001 = false;
               return;
            }

            ++var29;
         }

         try {
            if (af.e().aC.a.a == var27.a.a) {
               af.e().aC = var27;
            }
         } catch (Exception var16) {
            var10001 = false;
            return;
         }

         try {
            eo var7 = p.aD;
            StringBuffer var31 = new StringBuffer(String.valueOf(aw.eC));
            var7.a(var31.append(var27.a.b).append(aw.eD).append(var27.c).toString(), 0);
         } catch (Exception var15) {
            var10001 = false;
         }
      }

   }

   private void m(y param1) {
      // $FF: Couldn't be decompiled
   }

   public final void a(y param1) {
      // $FF: Couldn't be decompiled
   }

   public final void a(boolean var1) {
      if (main.a.E != main.a.al || !main.a.al.a) {
         if (var1) {
            System.out.println("connect 1 ok");
            bs.t = 2;
            bt.a().c();
            bt.a();
         } else {
            bt var2 = bt.a();
            if (av.d("clienttype") != -1) {
               l.c = av.d("clienttype");
            }

            label34: {
               IOException var10000;
               label45: {
                  boolean var10001;
                  y var3;
                  StringBuffer var4;
                  InputStream var10;
                  try {
                     ds.c("setType");
                     var3 = bt.d((byte)2);
                     var3.d().writeByte(l.c);
                     var3.d().writeByte(en.b);
                     var3.d().writeBoolean(false);
                     var3.d().writeInt(main.a.A);
                     var3.d().writeInt(main.a.B);
                     var3.d().writeBoolean(cd.g);
                     var3.d().writeBoolean(main.a.e);
                     DataOutputStream var5 = var3.d();
                     var4 = new StringBuffer(String.valueOf(System.getProperty("microedition.platform")));
                     var5.writeUTF(var4.append("|").append("2.4.6").toString());
                     var10 = var2.getClass().getResourceAsStream("res\\info");
                  } catch (IOException var8) {
                     var10000 = var8;
                     var10001 = false;
                     break label45;
                  }

                  if (var10 != null) {
                     try {
                        var10.read((byte[])null);
                        var3.d().writeShort(((Object[])null).length);
                        var3.d().write((byte[])null);
                        var4 = new StringBuffer("write ");
                        ds.b(var4.append(((Object[])null).length).append("|").append("2.4.6").toString());
                     } catch (IOException var7) {
                        var10000 = var7;
                        var10001 = false;
                        break label45;
                     }
                  }

                  try {
                     var2.a = br.b();
                     var2.a.a(var3);
                     var2.a = br.a();
                     var3.e();
                     break label34;
                  } catch (IOException var6) {
                     var10000 = var6;
                     var10001 = false;
                  }
               }

               IOException var9 = var10000;
               var9.printStackTrace();
            }

            bt.a();
         }
      }

   }

   public final void b(boolean var1) {
      if (!var1) {
         if (main.a.E == main.a.ak && bs.s && !bt.f) {
            bs.t = 0;
            main.a.ak.h();
         }

         l.a(var1);
      } else {
         l.a(var1);
      }

   }

   public final void c(boolean var1) {
      if (!var1) {
         if (main.a.E == main.a.ak && !bt.f) {
            main.a.ak.h();
         }

         if (main.a.E != main.a.I || bt.f) {
            return;
         }
      }

      l.b(var1);
   }
}
