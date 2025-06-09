import java.io.DataInputStream;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class ai {
   public int a;
   public short[] b;
   public short c;
   public String[] d;
   public String[] e;
   public String[] f;
   public String[] g;
   public short h;

   public ai() {
   }

   public ai(short var1, byte var2, String var3, String var4, String[] var5, short[] var6, short var7, String[] var8) {
      this.c = var1;
      this.a = var2;
      this.d = di.g.a(var3, g.ab - 20);
      this.e = di.k.a(var4, g.ab - 20);
      this.f = var5;
      this.b = var6;
      this.h = var7;
      this.g = var8;
   }

   public static String a(int var0) {
      long var4 = (long)var0;
      Calendar var6 = Calendar.getInstance();
      var6.setTimeZone(TimeZone.getTimeZone("GMT+7"));
      var6.setTime(new Date(var4 * 1000L));
      int var2 = var6.get(11);
      var6.get(12);
      var0 = var6.get(5);
      int var3 = var6.get(2);
      int var1 = var6.get(1);
      return var0 + "/" + (var3 + 1) + "/" + var1 + " " + var2 + "h";
   }

   public static String a(long var0) {
      String var7 = "";
      long var3 = var0 / 1000L;

      for(int var2 = 0; (long)var2 < var3 + 1L; ++var2) {
         if (var0 < 1000L) {
            var7 = var0 + var7;
            break;
         }

         long var5 = var0 % 1000L;
         if (var5 == 0L) {
            var7 = ".000" + var7;
         } else if (var5 < 10L) {
            var7 = ".00" + var5 + var7;
         } else if (var5 < 100L) {
            var7 = ".0" + var5 + var7;
         } else {
            var7 = "." + var5 + var7;
         }

         var0 /= 1000L;
      }

      return var7;
   }

   public static String a(String var0, String var1, String var2) {
      StringBuffer var4 = new StringBuffer();

      while(true) {
         int var3 = var0.indexOf(var1);
         if (var3 == -1) {
            var4.append(var0);
            return var4.toString();
         }

         var4.append(var0.substring(0, var3) + var2);
         var0 = var0.substring(var3 + var1.length());
      }
   }

   public static byte[] a(DataInputStream var0) {
      byte[] var1;
      byte[] var3;
      try {
         var1 = new byte[var0.readInt()];
         var0.read(var1);
      } catch (Exception var2) {
         var2.printStackTrace();
         var3 = null;
         return var3;
      }

      var3 = var1;
      return var3;
   }

   public static byte[] a(y param0) {
      // $FF: Couldn't be decompiled
   }

   public static String b(int var0) {
      int var4 = 0;
      int var1;
      int var2;
      if (var0 > 60) {
         var1 = var0 / 60;
         var2 = var0 % 60;
      } else {
         var1 = 0;
         var2 = var0;
      }

      if (var1 > 60) {
         var0 = var1 / 60;
         var1 %= 60;
      } else {
         var0 = 0;
      }

      int var3 = var0;
      if (var0 > 24) {
         var4 = var0 / 24;
         var3 = var0 % 24;
      }

      String var5;
      if (var4 > 0) {
         var5 = "" + var4 + "d" + var3 + "h";
      } else if (var3 > 0) {
         var5 = "" + var3 + "h" + var1 + "'";
      } else {
         if (var1 > 9) {
            var5 = "" + var1;
         } else {
            var5 = "" + "0" + var1;
         }

         var5 = var5 + ":";
         if (var2 > 9) {
            var5 = var5 + var2;
         } else {
            var5 = var5 + "0" + var2;
         }
      }

      return var5;
   }

   public static String c(int var0) {
      int var3 = 0;
      if (var0 > 60) {
         var0 /= 60;
      } else {
         var0 = 0;
      }

      int var1;
      if (var0 > 60) {
         var1 = var0 / 60;
         var0 %= 60;
      } else {
         var1 = 0;
      }

      int var2 = var1;
      if (var1 > 24) {
         var3 = var1 / 24;
         var2 = var1 % 24;
      }

      String var4;
      if (var3 > 0) {
         var4 = "" + var3 + "d" + var2 + "h";
      } else if (var2 > 0) {
         var4 = "" + var2 + "h" + var0 + "'";
      } else {
         if (var0 == 0) {
            var0 = 1;
         }

         var4 = "" + var0 + "ph";
      }

      return var4;
   }
}
