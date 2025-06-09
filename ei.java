public final class ei {
   public static el a = new el("vEff");

   public static void a() {
      for(int var0 = 0; var0 < a.size(); ++var0) {
         ((ea)a.elementAt(var0)).a();
      }

   }

   public static void a(int var0) {
      if (b(var0) != null) {
         a.removeElement(b(var0));
      }

   }

   public static void a(ea var0) {
      a.addElement(var0);
   }

   public static void a(en var0) {
      for(int var1 = 0; var1 < a.size(); ++var1) {
         if (((ea)a.elementAt(var1)).h == 1) {
            ((ea)a.elementAt(var1)).a(var0);
         }
      }

   }

   public static void a(en var0, int var1, int var2, int var3) {
      for(int var4 = 0; var4 < a.size(); ++var4) {
         if (((ea)a.elementAt(var4)).h == -var3) {
            ((ea)a.elementAt(var4)).a(var0, var1, var2);
         }
      }

   }

   private static ea b(int var0) {
      int var1 = 0;

      ea var2;
      while(true) {
         if (var1 >= a.size()) {
            var2 = null;
            break;
         }

         ea var3 = (ea)a.elementAt(var1);
         var2 = var3;
         if (var3.a == var0) {
            break;
         }

         ++var1;
      }

      return var2;
   }

   public static void b(en var0) {
      for(int var1 = 0; var1 < a.size(); ++var1) {
         if (((ea)a.elementAt(var1)).h == 2) {
            ((ea)a.elementAt(var1)).a(var0);
         }
      }

   }

   public static void c(en var0) {
      for(int var1 = 0; var1 < a.size(); ++var1) {
         if (((ea)a.elementAt(var1)).h == 3) {
            ((ea)a.elementAt(var1)).a(var0);
         }
      }

   }

   public static void d(en var0) {
      for(int var1 = 0; var1 < a.size(); ++var1) {
         if (((ea)a.elementAt(var1)).h == 4) {
            ((ea)a.elementAt(var1)).a(var0);
         }
      }

   }
}
