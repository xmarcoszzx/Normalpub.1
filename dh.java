public final class dh extends el {
   public static dh a = new dh("low");
   public static dh b = new dh("mid");
   public static dh c = new dh("mid2");
   public static dh d = new dh("hi");

   private dh(String var1) {
      super(var1);
   }

   public static void a() {
      d.c();
      b.c();
      c.c();
      a.c();
   }

   public static void a(ch var0) {
      d.addElement(var0);
   }

   public static void b() {
      d.d();
      a.d();
      b.d();
      c.d();
   }

   public static void b(ch var0) {
      b.addElement(var0);
   }

   private void c() {
      for(int var1 = this.size() - 1; var1 >= 0; --var1) {
         ch var2 = (ch)this.elementAt(var1);
         if (var2 != null) {
            var2.a();
            if (var2.b) {
               this.removeElementAt(var1);
            }
         }
      }

   }

   public static void c(ch var0) {
      c.addElement(var0);
   }

   private void d() {
      for(int var1 = this.size() - 1; var1 >= 0; --var1) {
         ch var2 = (ch)this.elementAt(var1);
         if (var2 != null) {
            var2.b = true;
            this.removeElementAt(var1);
         }
      }

   }

   public static void d(ch var0) {
      a.addElement(var0);
   }

   public final void a(en var1) {
      for(int var2 = 0; var2 < this.size(); ++var2) {
         ch var3 = (ch)this.elementAt(var2);
         if (var3 != null && !var3.b) {
            ((ch)this.elementAt(var2)).a(var1);
         }
      }

   }
}
