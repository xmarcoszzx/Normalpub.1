import javax.microedition.io.ConnectionNotFoundException;
import javax.microedition.lcdui.Image;
import main.GameMidlet;

public final class l {
   public static boolean a = false;
   public static boolean b = false;
   public static int c = 1;
   public static byte d = 0;
   public static byte e = 0;
   public static byte f = 5;
   public static String g;
   public static boolean h = false;
   private static Image i = b("/mainImage/black.png");

   public static int a(Image var0) {
      int var1;
      if (c == 5) {
         var1 = var0.getWidth();
      } else {
         var1 = var0.getWidth();
      }

      return var1;
   }

   public static String a(long var0) {
      boolean var2;
      String var6;
      String var7;
      label240: {
         boolean var3;
         label243: {
            boolean var4 = true;
            var2 = true;
            var6 = "" + var0;
            boolean var10001;
            StringBuffer var8;
            if (var0 < 0L) {
               var0 = -var0;
               var7 = var6;
               var3 = var4;

               try {
                  var8 = new StringBuffer;
               } catch (Exception var37) {
                  var10001 = false;
                  break label243;
               }

               var7 = var6;
               var3 = var4;

               try {
                  var8.<init>();
               } catch (Exception var36) {
                  var10001 = false;
                  break label243;
               }

               var7 = var6;
               var3 = var4;

               try {
                  var6 = var8.append(var0).toString();
               } catch (Exception var35) {
                  var10001 = false;
                  break label243;
               }
            } else {
               var2 = false;
            }

            int var38;
            String var39;
            StringBuffer var9;
            if (var0 >= 1000000000L) {
               var39 = "b";
               var7 = var6;
               var3 = var2;

               try {
                  var0 /= 1000000000L;
               } catch (Exception var34) {
                  var10001 = false;
                  break label243;
               }

               var7 = var6;
               var3 = var2;

               try {
                  var9 = new StringBuffer;
               } catch (Exception var33) {
                  var10001 = false;
                  break label243;
               }

               var7 = var6;
               var3 = var2;

               try {
                  var9.<init>();
               } catch (Exception var32) {
                  var10001 = false;
                  break label243;
               }

               var7 = var6;
               var3 = var2;

               try {
                  var38 = var9.append(var0).toString().length();
               } catch (Exception var31) {
                  var10001 = false;
                  break label243;
               }
            } else if (var0 >= 1000000L) {
               var39 = "m";
               var7 = var6;
               var3 = var2;

               try {
                  var0 /= 1000000L;
               } catch (Exception var30) {
                  var10001 = false;
                  break label243;
               }

               var7 = var6;
               var3 = var2;

               try {
                  var9 = new StringBuffer;
               } catch (Exception var29) {
                  var10001 = false;
                  break label243;
               }

               var7 = var6;
               var3 = var2;

               try {
                  var9.<init>();
               } catch (Exception var28) {
                  var10001 = false;
                  break label243;
               }

               var7 = var6;
               var3 = var2;

               try {
                  var38 = var9.append(var0).toString().length();
               } catch (Exception var27) {
                  var10001 = false;
                  break label243;
               }
            } else {
               if (var0 < 1000L) {
                  var7 = var6;
                  if (!var2) {
                     return var7;
                  }

                  var7 = var6;
                  var3 = var2;

                  try {
                     var8 = new StringBuffer;
                  } catch (Exception var12) {
                     var10001 = false;
                     break label243;
                  }

                  var7 = var6;
                  var3 = var2;

                  try {
                     var8.<init>("-");
                  } catch (Exception var11) {
                     var10001 = false;
                     break label243;
                  }

                  var7 = var6;
                  var3 = var2;

                  try {
                     var6 = var8.append(var6).toString();
                  } catch (Exception var10) {
                     var10001 = false;
                     break label243;
                  }

                  var7 = var6;
                  return var7;
               }

               var39 = "k";
               var7 = var6;
               var3 = var2;

               try {
                  var0 /= 1000L;
               } catch (Exception var26) {
                  var10001 = false;
                  break label243;
               }

               var7 = var6;
               var3 = var2;

               try {
                  var9 = new StringBuffer;
               } catch (Exception var25) {
                  var10001 = false;
                  break label243;
               }

               var7 = var6;
               var3 = var2;

               try {
                  var9.<init>();
               } catch (Exception var24) {
                  var10001 = false;
                  break label243;
               }

               var7 = var6;
               var3 = var2;

               try {
                  var38 = var9.append(var0).toString().length();
               } catch (Exception var23) {
                  var10001 = false;
                  break label243;
               }
            }

            var7 = var6;
            var3 = var2;

            int var5;
            try {
               var5 = Integer.parseInt(var6.substring(var38, 2));
            } catch (Exception var22) {
               var10001 = false;
               break label243;
            }

            if (var5 == 0) {
               label249: {
                  var7 = var6;
                  var3 = var2;

                  try {
                     var9 = new StringBuffer;
                  } catch (Exception var21) {
                     var10001 = false;
                     break label249;
                  }

                  var7 = var6;
                  var3 = var2;

                  try {
                     var9.<init>(String.valueOf(var6.substring(0, var38)));
                  } catch (Exception var20) {
                     var10001 = false;
                     break label249;
                  }

                  var7 = var6;
                  var3 = var2;

                  try {
                     var6 = var9.append(var39).toString();
                     break label240;
                  } catch (Exception var13) {
                     var10001 = false;
                  }
               }
            } else if (var5 % 10 == 0) {
               label250: {
                  var7 = var6;
                  var3 = var2;

                  try {
                     var9 = new StringBuffer;
                  } catch (Exception var19) {
                     var10001 = false;
                     break label250;
                  }

                  var7 = var6;
                  var3 = var2;

                  try {
                     var9.<init>(String.valueOf(var6.substring(0, var38)));
                  } catch (Exception var18) {
                     var10001 = false;
                     break label250;
                  }

                  var7 = var6;
                  var3 = var2;

                  try {
                     var6 = var9.append(",").append(var6.substring(var38, 1)).append(var39).toString();
                     break label240;
                  } catch (Exception var17) {
                     var10001 = false;
                  }
               }
            } else {
               label251: {
                  var7 = var6;
                  var3 = var2;

                  try {
                     var9 = new StringBuffer;
                  } catch (Exception var16) {
                     var10001 = false;
                     break label251;
                  }

                  var7 = var6;
                  var3 = var2;

                  try {
                     var9.<init>(String.valueOf(var6.substring(0, var38)));
                  } catch (Exception var15) {
                     var10001 = false;
                     break label251;
                  }

                  var7 = var6;
                  var3 = var2;

                  try {
                     var6 = var9.append(",").append(var6.substring(var38, 2)).append(var39).toString();
                     break label240;
                  } catch (Exception var14) {
                     var10001 = false;
                  }
               }
            }
         }

         var6 = var7;
         var2 = var3;
      }

      var7 = var6;
      if (var2) {
         var7 = "-" + var6;
      }

      return var7;
   }

   public static String a(long var0, int var2, boolean var3, boolean var4) {
      var0 = ((long)(var2 * 1000) + var0 - System.currentTimeMillis()) / 1000L;
      String var5;
      if (var0 <= 0L) {
         var5 = "";
      } else {
         var5 = String.valueOf(var0);
      }

      return var5;
   }

   public static Image a(String var0) {
      String var2 = "/x" + en.b + var0;
      ds.c("path load rms= " + var0);
      Image var1 = bn.a(var0);
      Image var3 = var1;
      if (var1 == null) {
         String[] var4 = ds.a(ds.a(var2, ".", 0)[0], "/", 0);
         byte[] var5 = av.b("x" + en.b + var4[var4.length - 1]);
         var3 = var1;
         if (var5 != null) {
            var3 = Image.createImage(var5, 0, var5.length);
         }
      }

      return var3;
   }

   public static void a() {
      e = 0;
   }

   public static void a(en var0) {
      for(int var1 = 0; var1 < 5; ++var1) {
         if (p.bI[var1] != -1 && main.a.d(p.bG[var1], p.bH[var1])) {
            if (p.bJ[var1] == 0) {
               di.v.b(var0, p.bF[var1], p.bG[var1], p.bH[var1], 2);
            } else if (p.bJ[var1] == 1) {
               di.x.b(var0, p.bF[var1], p.bG[var1], p.bH[var1], 2);
            } else if (p.bJ[var1] == 2) {
               di.y.b(var0, p.bF[var1], p.bG[var1], p.bH[var1], 2);
            } else if (p.bJ[var1] == 3) {
               di.x.b(var0, p.bF[var1], p.bG[var1], p.bH[var1], 2, di.y);
            } else if (p.bJ[var1] == 8) {
               di.r.b(var0, p.bF[var1], p.bG[var1], p.bH[var1], 2, di.f);
            } else if (p.bJ[var1] == 4) {
               di.s.b(var0, p.bF[var1], p.bG[var1], p.bH[var1], 2, di.o);
            } else if (p.bJ[var1] == 5) {
               di.z.b(var0, p.bF[var1], p.bG[var1], p.bH[var1], 2);
            } else if (p.bJ[var1] == 6) {
               di.x.b(var0, p.bF[var1], p.bG[var1], p.bH[var1], 2, di.v);
            } else if (p.bJ[var1] == 7) {
               di.c.b(var0, p.bF[var1], p.bG[var1], p.bH[var1], 2, di.f);
            } else if (p.bJ[var1] == 9) {
               di.p.b(var0, p.bF[var1], p.bG[var1], p.bH[var1], 2, di.f);
            } else if (p.bJ[var1] == 10) {
               di.l.b(var0, p.bF[var1], p.bG[var1], p.bH[var1], 2, di.f);
            }
         }
      }

   }

   public static void a(en var0, int var1, int var2, int var3) {
      int var4 = var3 / en.a(i);

      for(var3 = 0; var3 < var4 + 1; ++var3) {
         var0.a(i, en.a(i) * var3 + var1, var2, 0);
      }

   }

   public static void a(boolean var0) {
      if (main.a.E.equals(em.a)) {
         main.a.a(aw.x + " [1]", 8884, (Object)null);
      } else {
         br.a().c();
         br.b().c();
         bs.c = false;
         if (ac.a) {
            main.a.a(aw.x, 8885, (Object)null);
         } else {
            x.c = false;
            x.i = bs.a[bs.n];
            if (main.a.E != main.a.ak) {
               ds.c("===========> 2 vào OnconnectFail");
            } else {
               main.a.h();
               bs.u = true;
               main.a.ak.b();
            }

            af.bI = false;
            if (var0) {
               bs.t = 0;
            }
         }
      }

   }

   public static int b(Image var0) {
      int var1;
      if (c == 5) {
         var1 = var0.getHeight();
      } else {
         var1 = var0.getWidth();
      }

      return var1;
   }

   public static Image b(String var0) {
      Object var1 = null;

      Image var3;
      try {
         var3 = bn.a(var0);
      } catch (Exception var2) {
         var3 = (Image)var1;
      }

      return var3;
   }

   public static void b() {
      try {
         GameMidlet.f.platformRequest(bs.l);
      } catch (ConnectionNotFoundException var1) {
         var1.printStackTrace();
      }

   }

   public static void b(boolean var0) {
      br.a().c();
      br.b().c();
      if (ac.a) {
         main.a.h.k();
         main.a.a(aw.aE, 8885, (Object)null);
      } else {
         if (main.a.E != main.a.ak) {
            main.a.a(aw.x + " [2]", 8884, (Object)null);
         } else {
            main.a.h();
         }

         af.bI = false;
         if (var0) {
            bs.t = 0;
         }

         main.a.h.k();
      }

   }

   public static Image c(String var0) {
      String var1 = "/x" + en.b + var0;
      Image var3 = null;

      Image var4;
      try {
         var4 = Image.createImage(var1);
      } catch (Exception var2) {
         return var3;
      }

      var3 = var4;
      return var3;
   }

   public static void c() {
      while(ac.b) {
         try {
            Thread.sleep(1000L);
         } catch (InterruptedException var1) {
            var1.printStackTrace();
         }
      }

   }

   public static long d() {
      return System.currentTimeMillis();
   }

   public static df d(String var0) {
      Object var3 = null;
      bm var4 = as.a(var0, as.a);
      df var5 = (df)var3;
      if (var4.a != null) {
         int var2 = var4.a.getHeight() / var4.d;
         int var1 = var2;
         if (var2 <= 0) {
            var1 = 1;
         }

         var5 = new df(var4.a, var4.a.getWidth(), var1);
      }

      return var5;
   }

   public static void e(String var0) {
      System.out.println(var0);
   }
}
