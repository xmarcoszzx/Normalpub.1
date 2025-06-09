import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public final class u {
   public static el b = new el("");
   private static el d = new el("");
   public String a;
   private byte c;

   public u(String var1, byte var2) {
      this.a = var1;
      this.c = var2;
   }

   public static void a() {
      el var2 = new el("");
      byte[] var3 = av.b("ImageSource");
      if (var3 == null) {
         bt.a().a(var2);
      } else {
         d = new el("");
         DataInputStream var7 = new DataInputStream(new ByteArrayInputStream(var3));

         label38: {
            IOException var10000;
            label44: {
               short var1;
               byte[] var6;
               String[] var11;
               boolean var10001;
               try {
                  var1 = var7.readShort();
                  var11 = new String[var1];
                  var6 = new byte[var1];
               } catch (IOException var10) {
                  var10000 = var10;
                  var10001 = false;
                  break label44;
               }

               for(int var0 = 0; var0 < var1; ++var0) {
                  try {
                     var11[var0] = var7.readUTF();
                     var6[var0] = var7.readByte();
                     el var4 = d;
                     u var5 = new u(var11[var0], var6[var0]);
                     var4.addElement(var5);
                  } catch (IOException var9) {
                     var10000 = var9;
                     var10001 = false;
                     break label44;
                  }
               }

               try {
                  var7.close();
                  break label38;
               } catch (IOException var8) {
                  var10000 = var8;
                  var10001 = false;
               }
            }

            IOException var12 = var10000;
            var12.printStackTrace();
         }

         ds.c("vS size= " + b.size() + " vRMS size= " + d.size());
         bt.a().a(var2);
      }

   }

   public static void b() {
      ByteArrayOutputStream var1 = new ByteArrayOutputStream();
      DataOutputStream var2 = new DataOutputStream(var1);

      Exception var10000;
      label38: {
         boolean var10001;
         try {
            var2.writeShort(b.size());
         } catch (Exception var5) {
            var10000 = var5;
            var10001 = false;
            break label38;
         }

         int var0 = 0;

         while(true) {
            try {
               if (var0 >= b.size()) {
                  av.a("ImageSource", var1.toByteArray());
                  var2.close();
                  return;
               }
            } catch (Exception var4) {
               var10000 = var4;
               var10001 = false;
               break;
            }

            try {
               var2.writeUTF(((u)b.elementAt(var0)).a);
               var2.writeByte(((u)b.elementAt(var0)).c);
            } catch (Exception var3) {
               var10000 = var3;
               var10001 = false;
               break;
            }

            ++var0;
         }
      }

      Exception var6 = var10000;
      var6.printStackTrace();
   }
}
