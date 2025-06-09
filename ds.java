import java.util.Random;

public final class ds {
   public static Random a;
   public static boolean b;
   public static boolean c;
   private static short[] d;
   private static short[] e;
   private static int[] f;

   static {
      short[] var0 = new short[]{0, 18, 36, 54, 71, 89, 107, 125, 143, 160, 178, 195, 213, 230, 248, 265, 282, 299, 316, 333, 350, 367, 384, 400, 416, 433, 449, 465, 481, 496, 512, 527, 543, 558, 573, 587, 602, 616, 630, 644, 658, 672, 685, 698, 711, 724, 737, 749, 761, 773, 784, 796, 807, 818, 828, 839, 849, 859, 868, 878, 887, 896, 904, 912, 920, 928, 935, 943, 949, 956, 962, 968, 974, 979, 984, 989, 994, 998, 1002, 1005, 1008, 1011, 1014, 1016, 1018, 1020, 1022, 1023, 1023, 1024, 1024};
      d = var0;
      a = new Random();
      new el("");
   }

   public static final int a(int var0) {
      var0 = c(var0);
      if (var0 >= 0 && var0 < 90) {
         var0 = d[var0];
      } else if (var0 >= 90 && var0 < 180) {
         var0 = d[180 - var0];
      } else if (var0 >= 180 && var0 < 270) {
         var0 = -d[var0 - 180];
      } else {
         var0 = -d[360 - var0];
      }

      return var0;
   }

   public static final int a(int var0, int var1) {
      int var2 = 90;
      if (var0 != 0) {
         int var3 = Math.abs((var1 << 10) / var0);

         label39: {
            for(var2 = 0; var2 <= 90; ++var2) {
               if (f[var2] >= var3) {
                  var3 = var2;
                  break label39;
               }
            }

            var3 = 0;
         }

         var2 = var3;
         if (var1 >= 0) {
            var2 = var3;
            if (var0 < 0) {
               var2 = 180 - var3;
            }
         }

         var3 = var2;
         if (var1 < 0) {
            var3 = var2;
            if (var0 < 0) {
               var3 = var2 + 180;
            }
         }

         var2 = var3;
         if (var1 < 0) {
            var2 = var3;
            if (var0 >= 0) {
               var2 = 360 - var3;
            }
         }
      } else if (var1 <= 0) {
         var2 = 270;
      }

      return var2;
   }

   public static int a(int var0, int var1, int var2, int var3) {
      return f((var0 - var2) * (var0 - var2) + (var1 - var3) * (var1 - var3));
   }

   public static String a(long var0) {
      long var2;
      String var4;
      String var5;
      if (var0 >= 1000000000L) {
         var5 = aw.bf;
         var2 = var0 % 1000000000L / 100000000L;
         var4 = String.valueOf(var0 / 1000000000L);
         if (var2 > 0L) {
            var4 = var4 + "," + var2 + var5;
         } else {
            var4 = var4 + var5;
         }
      } else if (var0 >= 1000000L) {
         var4 = aw.bg;
         var2 = var0 % 1000000L / 100000L;
         var5 = String.valueOf(var0 / 1000000L);
         if (var2 > 0L) {
            var4 = var5 + "," + var2 + var4;
         } else {
            var4 = var5 + var4;
         }
      } else {
         var4 = String.valueOf(var0);
      }

      return var4;
   }

   public static String a(String var0) {
      String var1;
      if (l.c != 7) {
         var1 = var0;
      } else {
         if (af.e() != null && af.e().aD != null) {
            var1 = var0;
            if (af.e().aD.c >= 10) {
               return var1;
            }
         }

         var1 = var0;
         if (var0.indexOf("Gohan") != -1) {
            var1 = a(var0, "Gohan", "Hango");
         }

         var0 = var1;
         if (var1.indexOf("Gôhan") != -1) {
            var0 = a(var1, "Gôhan", "Hango");
         }

         var1 = var0;
         if (var0.indexOf("Bunma") != -1) {
            var1 = a(var0, "Bunma", "Mabun");
         }

         var0 = var1;
         if (var1.indexOf("Bunman") != -1) {
            var0 = a(var1, "Bunman", "Mabun");
         }

         var1 = var0;
         if (var0.indexOf("Bun ma") != -1) {
            var1 = a(var0, "Bun ma", "Mabun");
         }

         var0 = var1;
         if (var1.indexOf("Đậu thần") != -1) {
            var0 = a(var1, "Đậu thần", "Cây thần");
         }

         var1 = var0;
         if (var0.indexOf("Mabu") != -1) {
            var1 = a(var0, "Mabu", "Buma");
         }

         var0 = var1;
         if (var1.indexOf("Ma bư") != -1) {
            var0 = a(var1, "Ma bư", "Buma");
         }

         var1 = var0;
         if (var0.indexOf("Xayda") != -1) {
            var1 = a(var0, "Xayda", "Dasay");
         }

         var0 = var1;
         if (var1.indexOf("Xay da") != -1) {
            var0 = a(var1, "Xay da", "Dasay");
         }

         var1 = var0;
         if (var0.indexOf("Namếc") != -1) {
            var1 = a(var0, "Namếc", "Mecda");
         }

         var0 = var1;
         if (var1.indexOf("Na mếc") != -1) {
            var0 = a(var1, "Na mếc", "Mecda");
         }

         var1 = var0;
         if (var0.indexOf("Namek") != -1) {
            var1 = a(var0, "Namek", "Mecda");
         }

         var0 = var1;
         if (var1.indexOf("Rồng thần") != -1) {
            var0 = a(var1, "Rồng thần", "Rồng đất");
         }

         var1 = var0;
         if (var0.indexOf("Kame") != -1) {
            var1 = a(var0, "Kame", "Meka");
         }

         var0 = var1;
         if (var1.indexOf("Vegeta") != -1) {
            var0 = a(var1, "Vegeta", "Tageve");
         }

         var1 = var0;
         if (var0.indexOf("Kakalot") != -1) {
            var1 = a(var0, "Kakalot", "Lotkaka");
         }

         var0 = var1;
         if (var1.indexOf("Broly") != -1) {
            var0 = a(var1, "Broly", "Lybro");
         }

         var1 = var0;
         if (var0.indexOf("Ngọc rồng") != -1) {
            var1 = a(var0, "Ngọc rồng", "Ngọc thần");
         }

         var0 = var1;
         if (var1.indexOf("ngọc rồng") != -1) {
            var0 = a(var1, "ngọc rồng", "Ngọc thần");
         }

         var1 = var0;
         if (var0.indexOf("Radic") != -1) {
            var1 = a(var0, "Radic", "Dicra");
         }

         var0 = var1;
         if (var1.indexOf("Ra dic") != -1) {
            var0 = a(var1, "Ra dic", "Dicra");
         }

         var1 = var0;
         if (var0.indexOf("Ra đíc") != -1) {
            var1 = a(var0, "Ra đíc", "Dicra");
         }

         var0 = var1;
         if (var1.indexOf("Cadic") != -1) {
            var0 = a(var1, "Cadic", "Dicca");
         }

         var1 = var0;
         if (var0.indexOf("Ca dic") != -1) {
            var1 = a(var0, "Ca dic", "Dicca");
         }

         var0 = var1;
         if (var1.indexOf("Ca đíc") != -1) {
            var0 = a(var1, "Ca đíc", "Dicca");
         }

         var1 = var0;
         if (var0.indexOf("Quy lão") != -1) {
            var1 = a(var0, "Quy lão", "Lão");
         }

         var0 = var1;
         if (var1.indexOf("quy lão") != -1) {
            var0 = a(var1, "quy lão", "lão");
         }

         var1 = var0;
         if (var0.indexOf("QuyLão") != -1) {
            var1 = a(var0, "Quy Lão", "Lão");
         }

         var0 = var1;
         if (var1.indexOf("Santa") != -1) {
            var0 = a(var1, "Santa", "Tasan");
         }

         String var2 = var0;
         if (var0.indexOf("Hạt Mít") != -1) {
            var2 = a(var0, "Hạt Mít", "Hạt Dẻ");
         }

         var1 = var2;
         if (var2.indexOf("Hạt mít") != -1) {
            var1 = a(var2, "Hạt mít", "Hạt dẻ");
         }

         var0 = var1;
         if (var1.indexOf("Tàu bảy bảy") != -1) {
            var0 = a(var1, "Tàu bảy bảy", "Tàu tàu");
         }

         var1 = var0;
         if (var0.indexOf("Uron") != -1) {
            var1 = a(var0, "Uron", "Onru");
         }

         var2 = var1;
         if (var1.indexOf("U ron") != -1) {
            var2 = a(var1, "U ron", "Onru");
         }

         var0 = var2;
         if (var2.indexOf("Urôn") != -1) {
            var0 = a(var2, "Urôn", "Onru");
         }

         var1 = var0;
         if (var0.indexOf("Ngọc Rồng") != -1) {
            var1 = a(var0, "Ngọc Rồng", "Ngọc thần");
         }

         var0 = var1;
         if (var1.indexOf("Ngọc rồng") != -1) {
            var0 = a(var1, "Ngọc rồng", "Ngọc thần");
         }

         var2 = var0;
         if (var0.indexOf("Fide") != -1) {
            var2 = a(var0, "Fide", "Defi");
         }

         var1 = var2;
         if (var2.indexOf("Vegeta") != -1) {
            var1 = a(var2, "Vegeta", "Tageve");
         }

         var0 = var1;
         if (var1.indexOf("Moori") != -1) {
            var0 = a(var1, "Moori", "Rimoo");
         }

         var1 = var0;
         if (var0.indexOf("Aru") != -1) {
            var1 = a(var0, "Aru", "Ura");
         }

         var0 = var1;
         if (var1.indexOf("Kamejoko") != -1) {
            var0 = a(var1, "Kamejoko", "Kojomeka");
         }

         var1 = var0;
         if (var0.indexOf("kamejoko") != -1) {
            var1 = a(var0, "kamejoko", "kojomeka");
         }

         var0 = var1;
         if (var1.indexOf("Kame") != -1) {
            var0 = a(var1, "Kame", "Meka");
         }

         var2 = var0;
         if (var0.indexOf("kame") != -1) {
            var2 = a(var0, "kame", "meka");
         }

         var1 = var2;
         if (var2.indexOf("Masenko") != -1) {
            var1 = a(var2, "Masenko", "Kosenma");
         }

         var0 = var1;
         if (var1.indexOf("Thái Dương Hạ San") != -1) {
            var0 = a(var1, "Thái Dương Hạ San", "Hạ Dương");
         }

         var1 = var0;
         if (var0.indexOf("Solar flare") != -1) {
            var1 = a(var0, "Solar flare", "Solar");
         }

         var0 = var1;
         if (var1.indexOf("Quả cầu kênh khi") != -1) {
            var0 = a(var1, "Quả cầu kênh khi", "Quả cầu");
         }

         var1 = var0;
         if (var0.indexOf("Genki-Dama") != -1) {
            var1 = a(var0, "Genki-Dama", "Dama");
         }

         var0 = var1;
         if (var1.indexOf("Genki-Dama") != -1) {
            var0 = a(var1, "Genki-Dama", "Dama");
         }

         var1 = var0;
         if (var0.indexOf("Makankosappo") != -1) {
            var1 = a(var0, "Makankosappo", "Oppasoknakam");
         }
      }

      return var1;
   }

   public static String a(String var0, String var1, String var2) {
      StringBuffer var6 = new StringBuffer();
      int var4 = var0.indexOf(var1);
      int var3 = 0;

      for(int var5 = var1.length(); var4 != -1; var4 = var0.indexOf(var1, var3)) {
         var6.append(var0.substring(var3, var4)).append(var2);
         var3 = var4 + var5;
      }

      var6.append(var0.substring(var3, var0.length()));
      return var6.toString();
   }

   public static void a() {
      e = new short[91];
      f = new int[91];

      for(int var0 = 0; var0 <= 90; ++var0) {
         e[var0] = d[90 - var0];
         if (e[var0] == 0) {
            f[var0] = Integer.MAX_VALUE;
         } else {
            f[var0] = (d[var0] << 10) / e[var0];
         }
      }

   }

   public static void a(en var0) {
      di.f.a(var0, "check Controller= " + bt.d, 3, 55, 0);
      di.f.a(var0, "check Map= " + bt.e, 3, 75, 0);
   }

   public static boolean a(int var0, int var1, int var2, int var3, int var4, int var5) {
      boolean var6;
      if (var4 >= var0 && var4 <= var0 + var2 && var5 >= var1 && var5 <= var1 + var3) {
         var6 = true;
      } else {
         var6 = false;
      }

      return var6;
   }

   public static String[] a(String var0, String var1, int var2) {
      int var3 = var0.indexOf(var1);
      String[] var4;
      if (var3 >= 0) {
         var4 = a(var0.substring(var1.length() + var3), var1, var2 + 1);
      } else {
         var4 = new String[var2 + 1];
         var3 = var0.length();
      }

      var4[var2] = var0.substring(0, var3);
      return var4;
   }

   public static final int b(int var0) {
      var0 = c(var0);
      if (var0 >= 0 && var0 < 90) {
         var0 = e[var0];
      } else if (var0 >= 90 && var0 < 180) {
         var0 = -e[180 - var0];
      } else if (var0 >= 180 && var0 < 270) {
         var0 = -e[var0 - 180];
      } else {
         var0 = e[360 - var0];
      }

      return var0;
   }

   public static int b(int var0, int var1) {
      if (var0 != var1) {
         var0 += a.nextInt(var1 - var0);
      }

      return var0;
   }

   public static String b(long var0) {
      long var2;
      String var4;
      String var5;
      if (var0 >= 1000000000L) {
         var4 = aw.bf;
         var2 = var0 % 1000000000L / 10000000L;
         var5 = String.valueOf(var0 / 1000000000L);
         if (var2 >= 10L) {
            var0 = var2;
            if (var2 % 10L == 0L) {
               var0 = var2 / 10L;
            }

            var4 = var5 + "," + var0 + var4;
         } else if (var2 > 0L) {
            var4 = var5 + ",0" + var2 + var4;
         } else {
            var4 = var5 + var4;
         }
      } else if (var0 >= 1000000L) {
         var4 = aw.bg;
         var2 = var0 % 1000000L / 10000L;
         var5 = String.valueOf(var0 / 1000000L);
         if (var2 >= 10L) {
            var0 = var2;
            if (var2 % 10L == 0L) {
               var0 = var2 / 10L;
            }

            var4 = var5 + "," + var0 + var4;
         } else if (var2 > 0L) {
            var4 = var5 + ",0" + var2 + var4;
         } else {
            var4 = var5 + var4;
         }
      } else if (var0 >= 10000L) {
         var2 = var0 % 1000L / 10L;
         var4 = String.valueOf(var0 / 1000L);
         if (var2 >= 10L) {
            var0 = var2;
            if (var2 % 10L == 0L) {
               var0 = var2 / 10L;
            }

            var4 = var4 + "," + var0 + "k";
         } else if (var2 > 0L) {
            var4 = var4 + ",0" + var2 + "k";
         } else {
            var4 = var4 + "k";
         }
      } else {
         var4 = String.valueOf(var0);
      }

      return var4;
   }

   public static void b() {
      long var0 = l.d();
      if (bt.b - var0 > 5000L) {
         bt.a().d();
      }

      if (bt.c - var0 > 5000L) {
         bt.a().e();
      }

   }

   public static void b(String var0) {
   }

   public static final int c(int var0) {
      if (var0 >= 360) {
         var0 -= 360;
      }

      int var1 = var0;
      if (var0 < 0) {
         var1 = var0 + 360;
      }

      return var1;
   }

   public static int c(int var0, int var1) {
      var1 = a.nextInt(var1 - var0) + var0;
      var0 = var1;
      if (a.nextInt(2) == 0) {
         var0 = -var1;
      }

      return var0;
   }

   public static void c(String var0) {
   }

   public static int d(int var0) {
      return a.nextInt(var0);
   }

   public static int d(int var0, int var1) {
      return f(var0 * var0 + var1 * var1);
   }

   public static int e(int var0) {
      int var1;
      for(var1 = 0; var1 == 0; var1 = a.nextInt() % var0) {
      }

      return var1;
   }

   public static int e(int var0, int var1) {
      var1 = 1;

      for(int var2 = 0; var2 < 2; ++var2) {
         var1 *= var0;
      }

      return var1;
   }

   public static int f(int var0) {
      int var3;
      if (var0 <= 0) {
         var3 = 0;
      } else {
         int var2 = (var0 + 1) / 2;

         while(true) {
            int var1 = var2 / 2 + var0 / (var2 * 2);
            var3 = var1;
            if (Math.abs(var2 - var1) <= 1) {
               break;
            }

            var2 = var1;
         }
      }

      return var3;
   }

   public static int g(int var0) {
      if (var0 <= 0) {
         var0 = -var0;
      }

      return var0;
   }
}
