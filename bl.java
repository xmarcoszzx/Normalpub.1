import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import javax.microedition.lcdui.Image;

public final class bl {
   public static int[][] a;
   public static Image[] b;
   public static eg[] c;
   public static el d = new el("vKeys");
   public static byte[] e;
   public static el f = new el("");
   public static short g;
   private static Image h = null;
   private static int i;

   public bl() {
      e();
   }

   public static void a() {
      if (b == null) {
         b = new Image[]{l.a("/img/Big0.png"), l.a("/img/Big1.png"), l.a("/img/Big2.png"), l.a("/img/Big3.png")};
         System.gc();
      }

   }

   public static void a(int var0) {
      Image var3;
      if (en.b == 1) {
         var3 = l.b("/SmallImage/Small" + var0 + ".png");
         if (var3 != null) {
            c[var0] = new eg(var3, var0);
         } else {
            c[var0] = new eg(h, var0);
            if (main.a.E == main.a.am) {
               bt.a().p(var0);
            } else {
               f.addElement(c[var0]);
            }
         }
      } else {
         var3 = l.b("/SmallImage/Small" + var0 + ".png");
         if (var3 != null) {
            c[var0] = new eg(var3, var0);
         } else {
            byte[] var4 = av.b(en.b + "Small" + var0);
            boolean var2;
            if (var4 == null) {
               var2 = true;
            } else {
               boolean var1;
               if (e != null && var4.length % 127 != e[var0]) {
                  var1 = true;
               } else {
                  var1 = false;
               }

               var2 = var1;
               if (!var1) {
                  var3 = Image.createImage(var4, 0, var4.length);
                  if (var3 != null) {
                     c[var0] = new eg(var3, var0);
                     var2 = var1;
                  } else {
                     var2 = true;
                  }
               }
            }

            if (var2) {
               c[var0] = new eg(h, var0);
               if (main.a.E == main.a.am) {
                  bt.a().p(var0);
               } else {
                  f.addElement(c[var0]);
               }
            }
         }
      }

   }

   public static void a(en var0, int var1, int var2, int var3, int var4, int var5) {
      b(var0, var1, var2, var3, 0, var5);
   }

   public static void a(en var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      boolean var10001;
      eg var9;
      label176: {
         try {
            if (b != null) {
               break label176;
            }

            var9 = c[var1];
         } catch (Exception var23) {
            var10001 = false;
            return;
         }

         if (var9 == null) {
            try {
               a(var1);
            } catch (Exception var10) {
               var10001 = false;
            }

            return;
         } else {
            try {
               var0.a(var9.a, 0, var2 * var5, var5, var6, var7, var3, var4, var8);
            } catch (Exception var11) {
               var10001 = false;
            }

            return;
         }
      }

      label177: {
         label178: {
            try {
               if (a == null) {
                  break label178;
               }

               if (var1 >= a.length || a[var1] == null || a[var1][1] >= 256 || a[var1][3] >= 256 || a[var1][2] >= 256 || a[var1][4] >= 256) {
                  break label177;
               }
            } catch (Exception var22) {
               var10001 = false;
               return;
            }

            try {
               if (a[var1][0] != 4 && b[a[var1][0]] != null) {
                  var0.a(b[a[var1][0]], 0, var2 * var5, var5, var6, var7, var3, var4, var8);
                  return;
               }
            } catch (Exception var15) {
               var10001 = false;
               return;
            }

            try {
               var9 = c[var1];
            } catch (Exception var14) {
               var10001 = false;
               return;
            }

            if (var9 == null) {
               try {
                  a(var1);
               } catch (Exception var12) {
                  var10001 = false;
               }

               return;
            } else {
               try {
                  var9.a(var0, var7, var2, var3, var4, var5, var6, var8);
               } catch (Exception var13) {
                  var10001 = false;
               }

               return;
            }
         }

         try {
            if (main.a.E == p.j()) {
               return;
            }

            var9 = c[var1];
         } catch (Exception var21) {
            var10001 = false;
            return;
         }

         if (var9 == null) {
            try {
               a(var1);
            } catch (Exception var19) {
               var10001 = false;
            }

            return;
         } else {
            try {
               var9.a(var0, var7, var2, var3, var4, var5, var6, var8);
            } catch (Exception var20) {
               var10001 = false;
            }

            return;
         }
      }

      try {
         var9 = c[var1];
      } catch (Exception var18) {
         var10001 = false;
         return;
      }

      if (var9 == null) {
         try {
            a(var1);
         } catch (Exception var16) {
            var10001 = false;
         }
      } else {
         try {
            var9.a(var0, var7, var2, var3, var4, var5, var6, var8);
         } catch (Exception var17) {
            var10001 = false;
         }
      }

   }

   public static void b() {
      System.gc();
      h = Image.createRGBImage(new int[]{-2013265920}, 1, 1, true);
   }

   public static void b(en var0, int var1, int var2, int var3, int var4, int var5) {
      boolean var10001;
      eg var6;
      label178: {
         try {
            if (b != null) {
               break label178;
            }

            var6 = c[var1];
         } catch (Exception var20) {
            var10001 = false;
            return;
         }

         if (var6 == null) {
            try {
               a(var1);
            } catch (Exception var7) {
               var10001 = false;
            }

            return;
         } else {
            try {
               var0.a(var6.a, 0, 0, en.a(var6.a), en.b(var6.a), var4, var2, var3, var5);
            } catch (Exception var8) {
               var10001 = false;
            }

            return;
         }
      }

      label179: {
         label180: {
            try {
               if (a != null) {
                  if (var1 >= a.length || a[var1] == null || a[var1][1] >= 256 || a[var1][3] >= 256 || a[var1][2] >= 256 || a[var1][4] >= 256) {
                     break label179;
                  }
                  break label180;
               }
            } catch (Exception var19) {
               var10001 = false;
               return;
            }

            try {
               if (main.a.E == p.j()) {
                  return;
               }

               var6 = c[var1];
            } catch (Exception var18) {
               var10001 = false;
               return;
            }

            if (var6 == null) {
               try {
                  a(var1);
               } catch (Exception var16) {
                  var10001 = false;
               }

               return;
            } else {
               try {
                  var6.a(var0, var4, var2, var3, var5);
               } catch (Exception var17) {
                  var10001 = false;
               }

               return;
            }
         }

         try {
            if (a[var1][0] != 4 && b[a[var1][0]] != null) {
               var0.a(b[a[var1][0]], a[var1][1], a[var1][2], a[var1][3], a[var1][4], var4, var2, var3, var5);
               return;
            }
         } catch (Exception var12) {
            var10001 = false;
            return;
         }

         try {
            var6 = c[var1];
         } catch (Exception var11) {
            var10001 = false;
            return;
         }

         if (var6 == null) {
            try {
               a(var1);
            } catch (Exception var9) {
               var10001 = false;
            }

            return;
         } else {
            try {
               var6.a(var0, var4, var2, var3, var5);
            } catch (Exception var10) {
               var10001 = false;
            }

            return;
         }
      }

      try {
         var6 = c[var1];
      } catch (Exception var15) {
         var10001 = false;
         return;
      }

      if (var6 == null) {
         try {
            a(var1);
         } catch (Exception var13) {
            var10001 = false;
         }
      } else {
         try {
            var6.a(var0, var4, var2, var3, var5);
         } catch (Exception var14) {
            var10001 = false;
         }
      }

   }

   public static void c() {
      new bl();
   }

   public static void d() {
      if (main.a.w % 1000 == 0) {
         int var1 = 0;

         int var0;
         for(var0 = 0; var1 < c.length; ++var1) {
            if (c[var1] != null) {
               ++var0;
               eg var2 = c[var1];
               ++var2.d;
               if (var2.d - var2.c > 1 && !af.e().a(var2.b)) {
                  c[var2.b] = null;
               }

               ++i;
            }
         }

         if (var0 > 200 && main.a.a) {
            c = new eg[g];
         }
      }

   }

   private static void e() {
      Exception var10000;
      label67: {
         short var1;
         boolean var10001;
         DataInputStream var3;
         try {
            ByteArrayInputStream var2 = new ByteArrayInputStream(av.b("NR_image"));
            var3 = new DataInputStream(var2);
            var1 = var3.readShort();
            a = new int[var1][5];
         } catch (Exception var7) {
            var10000 = var7;
            var10001 = false;
            break label67;
         }

         int var0 = 0;

         while(true) {
            if (var0 >= var1) {
               return;
            }

            try {
               a[var0][0] = var3.readUnsignedByte();
               a[var0][1] = var3.readShort();
               a[var0][2] = var3.readShort();
               a[var0][3] = var3.readShort();
               a[var0][4] = var3.readShort();
            } catch (Exception var5) {
               var10000 = var5;
               var10001 = false;
               break;
            }

            if ((var0 < 84 || var0 > 90) && (var0 < 372 || var0 > 384) && (var0 < 371 || var0 > 377)) {
               label72: {
                  try {
                     if (a[var0][1] < 256 && a[var0][3] < 256 && a[var0][2] < 256 && a[var0][4] < 256) {
                        break label72;
                     }
                  } catch (Exception var6) {
                     var10000 = var6;
                     var10001 = false;
                     break;
                  }

                  try {
                     a[var0] = null;
                  } catch (Exception var4) {
                     var10000 = var4;
                     var10001 = false;
                     break;
                  }
               }
            }

            ++var0;
         }
      }

      Exception var8 = var10000;
      var8.printStackTrace();
   }
}
