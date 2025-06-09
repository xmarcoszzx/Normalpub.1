import java.io.DataInputStream;
import javax.microedition.lcdui.Image;
import main.GameMidlet;

public final class bv {
   public static Image A;
   public static int B;
   public static int C;
   public static int D;
   public static int E;
   public static int F;
   public static int G;
   public static int H;
   private static int I = -1;
   private static Image[] J;
   private static Image K;
   private static Image L;
   private static Image M;
   private static Image N;
   private static int O;
   private static int P;
   private static int Q;
   private static int R;
   private static int[] S;
   public static int a;
   public static int b;
   public static int c;
   public static int d;
   public static int e;
   public static int[] f;
   public static int[] g;
   public static Image h;
   public static byte i = 24;
   public static boolean j = false;
   public static String k = "";
   public static int l;
   public static int m = -1;
   public static int n;
   public static int o;
   public static int p;
   public static int q = -1;
   public static byte r;
   public static byte s = -1;
   public static el t = new el("vGO");
   public static el u = new el("vItemBg");
   public static el v = new el("vCurrItem");
   public static String[] w;
   public static Image x = l.b("/mainImage/myTexture2dbong.png");
   public static int[][] y;
   public static int[][][] z;

   static {
      new el("vObject");
      S = new int[]{21, 22, 23, 39, 40, 41};
      int[] var0 = new int[]{0, 7, 14};
      A = l.b("/bg/light.png");
      H = 0;
   }

   public static final int a(int var0, int var1) {
      try {
         var0 = g[a * var1 + var0];
      } catch (Exception var3) {
         var0 = 1000;
      }

      return var0;
   }

   public static cz a(int var0) {
      int var1 = 0;

      cz var2;
      while(true) {
         if (var1 >= u.size()) {
            var2 = null;
            break;
         }

         cz var3 = (cz)u.elementAt(var1);
         var2 = var3;
         if (var3.a == var0) {
            break;
         }

         ++var1;
      }

      return var2;
   }

   public static final void a(en var0) {
      boolean var10001;
      try {
         if (af.bI) {
            return;
         }
      } catch (Exception var24) {
         var10001 = false;
         return;
      }

      int var1;
      try {
         p.j();
         p.a(var0, 1);
         var1 = p.o;
      } catch (Exception var14) {
         var10001 = false;
         return;
      }

      int var2;
      int var3;
      label186:
      while(true) {
         label184: {
            try {
               if (var1 < p.q) {
                  break label184;
               }

               if (p.j >= 24) {
                  break;
               }

               var1 = p.p;
            } catch (Exception var23) {
               var10001 = false;
               return;
            }

            while(true) {
               try {
                  if (var1 >= p.r) {
                     break label186;
                  }
               } catch (Exception var15) {
                  var10001 = false;
                  return;
               }

               try {
                  var2 = f[a * var1 + 1] - 1;
               } catch (Exception var9) {
                  var10001 = false;
                  return;
               }

               if (var2 != -1) {
                  try {
                     a(var0, var2, 0, var1);
                  } catch (Exception var8) {
                     var10001 = false;
                     return;
                  }
               }

               ++var1;
            }
         }

         try {
            var2 = p.p;
         } catch (Exception var13) {
            var10001 = false;
            return;
         }

         while(true) {
            try {
               if (var2 >= p.r) {
                  break;
               }
            } catch (Exception var16) {
               var10001 = false;
               return;
            }

            if (var1 != 0) {
               label199: {
                  try {
                     if (var1 == a - 1) {
                        break label199;
                     }

                     var3 = f[a * var2 + var1] - 1;
                     if ((a(var1, var2) & 256) == 256) {
                        break label199;
                     }

                     if ((a(var1, var2) & 32) == 32) {
                        var0.a(K, 0, (main.a.w % 8 >> 1) * 24, 24, 24, 0, var1 * i, var2 * i, 0);
                        break label199;
                     }
                  } catch (Exception var22) {
                     var10001 = false;
                     return;
                  }

                  try {
                     if ((a(var1, var2) & 128) == 128) {
                        var0.a(L, 0, (main.a.w % 8 >> 1) * 24, 24, 24, 0, var1 * i, var2 * i, 0);
                        break label199;
                     }
                  } catch (Exception var21) {
                     var10001 = false;
                     return;
                  }

                  label156: {
                     try {
                        if (e != 13) {
                           break label156;
                        }
                     } catch (Exception var20) {
                        var10001 = false;
                        return;
                     }

                     if (var3 != -1) {
                        break label199;
                     }
                  }

                  label149: {
                     try {
                        if (e != 2 || (a(var1, var2) & 512) != 512) {
                           break label149;
                        }
                     } catch (Exception var19) {
                        var10001 = false;
                        return;
                     }

                     if (var3 != -1) {
                        try {
                           a(var0, var3, i * var1, i * var2, 24);
                           a(var0, var3, i * var1, i * var2 + 1, 24);
                        } catch (Exception var12) {
                           var10001 = false;
                           return;
                        }
                     }
                  }

                  try {
                     if ((a(var1, var2) & 16) == 16) {
                        int var4 = i * var1 - p.j;
                        O = var4;
                        P = var4 - p.f;
                        var4 = (i - 2) * P / i;
                        R = var4;
                        Q = var4 + p.f;
                        a(var0, var3, Q + p.j, i * var2, 24);
                        break label199;
                     }
                  } catch (Exception var18) {
                     var10001 = false;
                     return;
                  }

                  label136: {
                     try {
                        if ((a(var1, var2) & 512) != 512) {
                           break label136;
                        }
                     } catch (Exception var17) {
                        var10001 = false;
                        return;
                     }

                     if (var3 != -1) {
                        try {
                           a(var0, var3, i * var1, i * var2, 24);
                           a(var0, var3, i * var1, i * var2 + 1, 24);
                        } catch (Exception var11) {
                           var10001 = false;
                           return;
                        }
                     }
                     break label199;
                  }

                  if (var3 != -1) {
                     try {
                        a(var0, var3, var1, var2);
                     } catch (Exception var10) {
                        var10001 = false;
                        return;
                     }
                  }
               }
            }

            ++var2;
         }

         ++var1;
      }

      try {
         if (p.j <= p.n) {
            return;
         }

         var2 = a - 2;
         var1 = p.p;
      } catch (Exception var7) {
         var10001 = false;
         return;
      }

      while(true) {
         try {
            if (var1 >= p.r) {
               break;
            }

            var3 = f[a * var1 + var2] - 1;
         } catch (Exception var6) {
            var10001 = false;
            break;
         }

         if (var3 != -1) {
            try {
               a(var0, var3, var2 + 1, var1);
            } catch (Exception var5) {
               var10001 = false;
               break;
            }
         }

         ++var1;
      }

   }

   private static void a(en var0, int var1, int var2, int var3) {
      try {
         if (J != null) {
            if (J.length == 1) {
               var0.a(J[0], 0, var1 * i, i, i, 0, var2 * i, var3 * i, 0);
            } else {
               var0.a(J[var1], i * var2, i * var3, 0);
            }
         }
      } catch (Exception var4) {
      }

   }

   private static void a(en var0, int var1, int var2, int var3, int var4) {
      try {
         if (J != null) {
            if (J.length == 1) {
               var0.a(J[0], 0, var1 * 24, 24, 24, 0, var2, var3, 0);
            } else {
               var0.a(J[var1], var2, var3, 0);
            }
         }
      } catch (Exception var5) {
      }

   }

   public static boolean a() {
      boolean var0;
      if (l != 51 && l != 103 && l != 112 && l != 113 && l != 129 && l != 130) {
         var0 = false;
      } else {
         var0 = true;
      }

      return var0;
   }

   public static final boolean a(int var0, int var1, int var2) {
      boolean var3 = false;

      try {
         var0 = g[var1 / i * a + var0 / i];
      } catch (Exception var5) {
         return var3;
      }

      if ((var0 & var2) == var2) {
         var3 = true;
      }

      return var3;
   }

   public static final int b(int var0, int var1) {
      try {
         var0 = g[var1 / i * a + var0 / i];
      } catch (Exception var3) {
         var0 = 1000;
      }

      return var0;
   }

   public static final void b(int var0, int var1, int var2) {
      int[] var3 = g;
      var0 = var1 / i * a + var0 / i;
      var3[var0] |= 512;
   }

   public static final void b(en var0) {
      if (!main.a.a) {
         boolean var10001;
         int var2;
         try {
            var2 = p.o;
         } catch (Exception var19) {
            var10001 = false;
            return;
         }

         while(true) {
            try {
               if (var2 >= p.q) {
                  ed.b(var0);
                  break;
               }
            } catch (Exception var11) {
               var10001 = false;
               break;
            }

            int var3;
            try {
               var3 = p.p;
            } catch (Exception var10) {
               var10001 = false;
               break;
            }

            while(true) {
               try {
                  if (var3 >= p.r) {
                     break;
                  }
               } catch (Exception var12) {
                  var10001 = false;
                  return;
               }

               label146: {
                  Image var5;
                  label152: {
                     try {
                        if ((a(var2, var3) & 64) != 64) {
                           break label146;
                        }

                        if (e == 5) {
                           var5 = M;
                           break label152;
                        }
                     } catch (Exception var18) {
                        var10001 = false;
                        return;
                     }

                     try {
                        if (e == 8) {
                           var5 = N;
                           break label152;
                        }
                     } catch (Exception var17) {
                        var10001 = false;
                        return;
                     }

                     try {
                        var5 = h;
                     } catch (Exception var9) {
                        var10001 = false;
                        return;
                     }
                  }

                  try {
                     if (!i()) {
                        var0.a(var5, 0, 0, 24, 24, 0, var2 * i, i * var3 - 1, 0);
                        var0.a(var5, 0, 0, 24, 24, 0, var2 * i, i * var3 - 3, 0);
                     }
                  } catch (Exception var8) {
                     var10001 = false;
                     return;
                  }

                  try {
                     var0.a(var5, 0, (main.a.w % 8 >> 2) * 24, 24, 24, 0, var2 * i, i * var3 - 12, 0);
                     if (H != 0 || !i()) {
                        break label146;
                     }

                     H = i * var3 - 12;
                  } catch (Exception var16) {
                     var10001 = false;
                     return;
                  }

                  int var1 = 16777215;

                  label150: {
                     label103: {
                        try {
                           if (main.a.ad != 2) {
                              break label103;
                           }
                        } catch (Exception var15) {
                           var10001 = false;
                           return;
                        }

                        var1 = 10871287;
                        break label150;
                     }

                     label98: {
                        try {
                           if (main.a.ad != 4) {
                              break label98;
                           }
                        } catch (Exception var14) {
                           var10001 = false;
                           return;
                        }

                        var1 = 8111470;
                        break label150;
                     }

                     label151: {
                        try {
                           if (main.a.ad == 7) {
                              break label151;
                           }
                        } catch (Exception var13) {
                           var10001 = false;
                           return;
                        }

                        int var4;
                        try {
                           var4 = main.a.ad;
                        } catch (Exception var7) {
                           var10001 = false;
                           return;
                        }

                        if (var4 == 19) {
                           var1 = 16711680;
                        }
                        break label150;
                     }

                     var1 = 5693125;
                  }

                  try {
                     ed.a(var1, H + 15);
                  } catch (Exception var6) {
                     var10001 = false;
                     return;
                  }
               }

               ++var3;
            }

            ++var2;
         }
      }

   }

   public static boolean b() {
      boolean var0;
      if (l != 39 && l != 40 && l != 41) {
         var0 = false;
      } else {
         var0 = true;
      }

      return var0;
   }

   public static boolean b(int var0) {
      boolean var5 = false;
      boolean var4 = var5;
      if (var0 != 156) {
         var4 = var5;
         if (var0 != 330) {
            var4 = var5;
            if (var0 != 345) {
               if (var0 == 334) {
                  var4 = var5;
               } else {
                  var4 = var5;
                  if (l != 54) {
                     var4 = var5;
                     if (l != 55) {
                        var4 = var5;
                        if (l != 56) {
                           var4 = var5;
                           if (l != 57) {
                              var4 = var5;
                              if (l != 58) {
                                 var4 = var5;
                                 if (l != 59) {
                                    var4 = var5;
                                    if (l != 103) {
                                       int var1 = 0;

                                       int var2;
                                       int var3;
                                       for(var2 = 0; var1 < v.size(); var2 = var3) {
                                          var3 = var2;
                                          if (((cz)v.elementAt(var1)).a == var0) {
                                             var3 = var2 + 1;
                                          }

                                          ++var1;
                                       }

                                       var4 = var5;
                                       if (var2 > 2) {
                                          var4 = true;
                                       }
                                    }
                                 }
                              }
                           }
                        }
                     }
                  }
               }
            }
         }
      }

      return var4;
   }

   public static void c(int var0) {
      d = b * i;
      c = a * i;
      int var3 = var0 - 1;
      var0 = 0;

      while(true) {
         label59: {
            Exception var10000;
            label65: {
               boolean var10001;
               try {
                  if (var0 >= a * b) {
                     break;
                  }
               } catch (Exception var10) {
                  var10000 = var10;
                  var10001 = false;
                  break label65;
               }

               int var1 = 0;

               label54:
               while(true) {
                  try {
                     if (var1 >= y[var3].length) {
                        break label59;
                     }
                  } catch (Exception var7) {
                     var10000 = var7;
                     var10001 = false;
                     break;
                  }

                  int var4;
                  int[] var5;
                  try {
                     var5 = z[var3][var1];
                     var4 = y[var3][var1];
                  } catch (Exception var6) {
                     var10000 = var6;
                     var10001 = false;
                     break;
                  }

                  int var2 = 0;

                  while(true) {
                     try {
                        if (var2 >= var5.length) {
                           break;
                        }
                     } catch (Exception var8) {
                        var10000 = var8;
                        var10001 = false;
                        break label54;
                     }

                     label48: {
                        try {
                           if (f[var0] == var5[var2]) {
                              var5 = g;
                              break label48;
                           }
                        } catch (Exception var9) {
                           var10000 = var9;
                           var10001 = false;
                           break label54;
                        }

                        ++var2;
                        continue;
                     }

                     var5[var0] |= var4;
                     break;
                  }

                  ++var1;
               }
            }

            Exception var11 = var10000;
            System.out.println("Error Load Map");
            var11.printStackTrace();
            GameMidlet.f.a();
            break;
         }

         ++var0;
      }

   }

   public static final void c(int var0, int var1, int var2) {
      int[] var3 = g;
      var0 = var1 / i * a + var0 / i;
      var3[var0] &= -513;
   }

   public static boolean c() {
      boolean var0;
      if (p.bY != null && l == p.bY.l) {
         var0 = true;
      } else {
         var0 = false;
      }

      return var0;
   }

   public static void d(int var0) {
      DataInputStream var1 = new DataInputStream(ad.a("/mymap/" + var0));
      a = (char)var1.read();
      b = (char)var1.read();
      f = new int[var1.available()];

      for(var0 = 0; var0 < a * b; ++var0) {
         f[var0] = (char)var1.read();
      }

      g = new int[f.length];
   }

   public static boolean d() {
      boolean var1 = false;

      for(int var0 = 0; var0 < S.length; ++var0) {
         if (l == S[var0]) {
            var1 = true;
            break;
         }
      }

      return var1;
   }

   public static final int e(int var0) {
      return var0 / i * i;
   }

   public static final void e() {
      if (K == null) {
         K = l.a("/tWater/wtf.png");
      }

      if (L == null) {
         L = l.a("/tWater/twtf.png");
      }

      if (h == null) {
         h = l.a("/tWater/wts.png");
      }

      if (M == null) {
         M = l.a("/tWater/wtsN.png");
      }

      if (N == null) {
         N = l.a("/tWater/wtsN2.png");
      }

      System.gc();
   }

   public static final int f(int var0) {
      return var0 / i * i;
   }

   public static boolean f() {
      boolean var0;
      if (l != 45 && l != 46 && l != 48) {
         var0 = false;
      } else {
         var0 = true;
      }

      return var0;
   }

   public static boolean g() {
      boolean var0;
      if (!j && l != 45 && l != 46 && l != 48 && l != 51 && l != 52 && l != 103 && l != 112 && l != 113 && l != 115 && l != 117 && l != 118 && l != 119 && l != 120 && l != 121 && l != 125 && l != 129 && l != 130) {
         var0 = false;
      } else {
         var0 = true;
      }

      return var0;
   }

   public static void h() {
      byte var1 = 0;
      int var0 = 0;
      System.gc();
      if (I != e) {
         Image[] var2;
         if (l.c != 5 && l.c != 3 && l.c != 8) {
            if (l.a("/t/" + e + "$1.png") != null) {
               av.a("x" + en.b + "t" + e);
               J = new Image[100];

               for(var0 = var1; var0 < J.length; ++var0) {
                  J[var0] = l.a("/t/" + e + "$" + (var0 + 1) + ".png");
               }
            } else {
               Image var3 = l.a("/t/" + e + ".png");
               if (var3 != null) {
                  var2 = new Image[1];
                  J = var2;
                  var2[0] = var3;
               }
            }
         } else if (en.b == 1) {
            var2 = new Image[1];
            J = var2;
            var2[0] = l.c("/t/" + e + ".png");
         } else {
            for(J = new Image[100]; var0 < J.length; ++var0) {
               J[var0] = l.c("/t/" + e + "/" + (var0 + 1) + ".png");
            }
         }

         I = e;
      }

   }

   private static boolean i() {
      boolean var0;
      if (l != 54 && l != 55 && l != 56 && l != 57 && l != 138 && l != 167) {
         var0 = true;
      } else {
         var0 = false;
      }

      return var0;
   }
}
