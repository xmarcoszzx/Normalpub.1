public final class ax extends dc {
   private cp a;
   private int b;
   private int c;
   private int d;
   private short e = 0;
   private long f = 0L;

   public static void a(int var0, int var1, int var2, int var3) {
      ax var4 = new ax();
      var4.a = p.y[var0 - 1];
      var4.c = var1;
      var4.d = var2;
      var4.e = 2;
      dc.w.addElement(var4);
   }

   public final void a() {
      if (0L != 0L) {
         ++this.b;
         if (this.b >= this.a.a.length) {
            this.b = 0;
         }

         if (System.currentTimeMillis() > 0L) {
            dc.w.removeElement(this);
         }
      } else {
         ++this.b;
         if (this.b >= this.a.a.length) {
            --this.e;
            if (this.e <= 0) {
               dc.w.removeElement(this);
            } else {
               this.b = 0;
            }
         }
      }

   }

   public final void a(en var1) {
      if (en.b == 1) {
         ++p.aN;
      }

      if (p.aN < 8) {
         int var2 = this.c;
         int var4 = this.a.a[this.b].a;
         int var5 = this.d;
         int var3 = this.a.a[this.b].b;
         bl.b(var1, this.a.a[this.b].c, var2 + var4, var5 + var3, 0, 3);
      }

   }
}
