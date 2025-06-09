public final class ak {
   public static el f = new el("vClanImage");
   public static t g = new t("h id images");
   public int a;
   public String b;
   public short[] c;
   public int d;
   public int e;

   public static ak a(short var0) {
      int var1 = 0;

      ak var2;
      while(true) {
         if (var1 >= f.size()) {
            var2 = null;
            break;
         }

         ak var3 = (ak)f.elementAt(var1);
         var2 = var3;
         if (var3.a == var0) {
            break;
         }

         ++var1;
      }

      return var2;
   }

   public static void a(ak var0) {
      bt.a().b((byte)var0.a);
      f.addElement(var0);
   }

   public static boolean a(int var0) {
      boolean var2 = false;

      for(int var1 = 0; var1 < f.size(); ++var1) {
         if (((ak)f.elementAt(var1)).a == var0) {
            var2 = true;
            break;
         }
      }

      return var2;
   }
}
