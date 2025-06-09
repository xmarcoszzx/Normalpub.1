import java.io.DataInputStream;
import java.io.IOException;
import javax.microedition.lcdui.Image;

public final class bn {
   private static byte[] a = new byte[]{-22, 2, 12, 4, 5, 2, -10};
   private int b = 0;

   public static Image a(String var0) {
      int var2 = 0;
      String var7 = "/x" + en.b + var0;

      Image var23;
      label74: {
         label73: {
            label72: {
               label71: {
                  int var3;
                  boolean var10001;
                  byte[] var22;
                  bn var24;
                  try {
                     DataInputStream var6 = new DataInputStream("".getClass().getResourceAsStream(var7));
                     var3 = var6.available();
                     var22 = new byte[var3];
                     var6.read(var22, 0, var3);
                     var24 = new bn();
                     var24.b = 0;
                  } catch (IOException var19) {
                     var10001 = false;
                     break label73;
                  } catch (IllegalArgumentException var20) {
                     var10001 = false;
                     break label72;
                  } catch (NullPointerException var21) {
                     var10001 = false;
                     break label71;
                  }

                  while(true) {
                     try {
                        if (var2 >= var22.length) {
                           var23 = Image.createImage(var22, 0, var3);
                           break label74;
                        }
                     } catch (IOException var13) {
                        var10001 = false;
                        break label73;
                     } catch (IllegalArgumentException var14) {
                        var10001 = false;
                        break label72;
                     } catch (NullPointerException var15) {
                        var10001 = false;
                        break;
                     }

                     byte var4 = var22[var2];

                     int var5;
                     byte[] var8;
                     try {
                        var8 = a;
                        var5 = var24.b++;
                     } catch (IOException var10) {
                        var10001 = false;
                        break label73;
                     } catch (IllegalArgumentException var11) {
                        var10001 = false;
                        break label72;
                     } catch (NullPointerException var12) {
                        var10001 = false;
                        break;
                     }

                     byte var1 = (byte)(var4 & 255 ^ var8[var5] & 255);

                     try {
                        if (var24.b >= a.length) {
                           var24.b %= a.length;
                        }
                     } catch (IOException var16) {
                        var10001 = false;
                        break label73;
                     } catch (IllegalArgumentException var17) {
                        var10001 = false;
                        break label72;
                     } catch (NullPointerException var18) {
                        var10001 = false;
                        break;
                     }

                     var22[var2] = var1;
                     ++var2;
                  }
               }

               var23 = null;
               break label74;
            }

            var23 = null;
            break label74;
         }

         var23 = null;
      }

      Image var25 = var23;
      if (var23 == null) {
         try {
            var25 = Image.createImage(var7);
         } catch (IOException var9) {
            var25 = null;
         }
      }

      return var25;
   }
}
