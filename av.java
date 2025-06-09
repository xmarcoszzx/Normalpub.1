import javax.microedition.rms.RecordStore;
import javax.microedition.rms.RecordStoreException;
import javax.microedition.rms.RecordStoreNotFoundException;

public class av {
   public w[] a;

   public av() {
   }

   public av(int var1) {
      if (var1 == 0) {
         this.a = new w[3];
      }

      if (var1 == 1) {
         this.a = new w[17];
      }

      if (var1 == 2) {
         this.a = new w[14];
      }

      if (var1 == 3) {
         this.a = new w[2];
      }

   }

   public static void a() {
      ds.c("CLEAR ALL");

      Exception var10000;
      label40: {
         String[] var1;
         boolean var10001;
         try {
            var1 = RecordStore.listRecordStores();
         } catch (Exception var5) {
            var10000 = var5;
            var10001 = false;
            break label40;
         }

         if (var1 == null) {
            return;
         }

         int var0 = 0;

         while(true) {
            try {
               if (var0 >= var1.length) {
                  return;
               }
            } catch (Exception var4) {
               var10000 = var4;
               var10001 = false;
               break;
            }

            if (var1[var0] != null) {
               try {
                  StringBuffer var2 = new StringBuffer("name = ");
                  ds.c(var2.append(var1[var0]).toString());
                  RecordStore.deleteRecordStore(var1[var0]);
               } catch (Exception var3) {
                  var10000 = var3;
                  var10001 = false;
                  break;
               }
            }

            ++var0;
         }
      }

      Exception var6 = var10000;
      var6.printStackTrace();
   }

   public static void a(String var0) {
      for(int var1 = 0; var1 < RecordStore.listRecordStores().length; ++var1) {
         if (RecordStore.listRecordStores().equals(var0)) {
            try {
               RecordStore.deleteRecordStore(var0);
            } catch (RecordStoreNotFoundException var3) {
               var3.printStackTrace();
            } catch (RecordStoreException var4) {
               var4.printStackTrace();
            }
         }
      }

   }

   public static void a(String var0, int var1) {
      try {
         a(var0, new byte[]{(byte)var1});
      } catch (Exception var2) {
      }

   }

   public static void a(String var0, String var1) {
      try {
         a(var0, var1.getBytes("UTF-8"));
      } catch (Exception var2) {
         var2.printStackTrace();
      }

   }

   public static void a(String param0, byte[] param1) {
      // $FF: Couldn't be decompiled
   }

   public static byte[] b(String var0) {
      byte[] var3;
      try {
         StringBuffer var1 = new StringBuffer("vj");
         RecordStore var4 = RecordStore.openRecordStore(var1.append(var0).toString(), false);
         var3 = var4.getRecord(1);
         var4.closeRecordStore();
      } catch (Exception var2) {
         var3 = null;
      }

      return var3;
   }

   public static String c(String var0) {
      byte[] var1 = b(var0);
      if (var1 == null) {
         var0 = null;
      } else {
         try {
            var0 = new String(var1, "UTF-8");
         } catch (Exception var2) {
            var0 = new String(var1);
         }
      }

      return var0;
   }

   public static int d(String var0) {
      byte[] var2 = b(var0);
      byte var1;
      if (var2 == null) {
         var1 = -1;
      } else {
         var1 = var2[0];
      }

      return var1;
   }
}
