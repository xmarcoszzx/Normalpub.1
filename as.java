import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.util.Enumeration;
import javax.microedition.lcdui.Image;

public final class as {
   public static t a = new t("h ImgByName");

   private static bm a(String var0) {
      Object var1 = null;
      byte[] var2 = av.b(en.b + "ImgByName_" + var0);
      bm var4;
      if (var2 == null) {
         var4 = (bm)var1;
      } else {
         try {
            var4 = new bm();
            var4.d = var2[0];
            var4.a = Image.createImage(var2, 1, var2.length - 1);
         } catch (Exception var3) {
            var4 = (bm)var1;
         }
      }

      return var4;
   }

   public static bm a(String var0, t var1) {
      bm var3 = (bm)var1.get(var0);
      bm var2 = var3;
      if (var3 == null) {
         var2 = new bm();
         var3 = a(var0);
         if (var3 != null) {
            var2.a = var3.a;
            var2.d = var3.d;
         }

         var1.put(var0, var2);
      }

      var2.b = main.a.b / 1000L;
      if (var2.a == null) {
         --var2.c;
         if (var2.c <= 0) {
            bt.a().g(var0);
            var2.c = 200;
         }
      }

      return var2;
   }

   public static void a(String var0, byte var1, byte[] var2) {
      var0 = en.b + "ImgByName_" + var0;
      ByteArrayOutputStream var4 = new ByteArrayOutputStream();
      DataOutputStream var3 = new DataOutputStream(var4);

      Exception var10000;
      label38: {
         boolean var10001;
         try {
            var3.writeByte(var1);
         } catch (Exception var7) {
            var10000 = var7;
            var10001 = false;
            break label38;
         }

         int var9 = 0;

         while(true) {
            try {
               if (var9 >= var2.length) {
                  av.a(var0, var4.toByteArray());
                  var3.close();
                  return;
               }
            } catch (Exception var6) {
               var10000 = var6;
               var10001 = false;
               break;
            }

            try {
               var3.writeByte(var2[var9]);
            } catch (Exception var5) {
               var10000 = var5;
               var10001 = false;
               break;
            }

            ++var9;
         }
      }

      Exception var8 = var10000;
      var8.printStackTrace();
   }

   public static void a(String var0, Image var1, byte var2) {
      a.put(var0, new bm(var1, var2));
   }

   public static void a(t var0, int var1) {
      el var2 = new el("checkDelHash");
      Enumeration var5 = var0.keys();

      while(var5.hasMoreElements()) {
         String var3 = (String)var5.nextElement();
         bm var4 = (bm)var0.get(var3);
         if (main.a.b / 1000L - var4.b > 600L) {
            var2.addElement(var3);
         }
      }

      for(var1 = 0; var1 < var2.size(); ++var1) {
         var0.remove((String)var2.elementAt(var1));
      }

   }
}
