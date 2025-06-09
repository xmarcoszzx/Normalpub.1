public final class at extends dc {
   private cp a;
   private int b;
   private int c;
   private int d;
   private af e;
   private aa f;
   private short g = 0;
   private long h = 0L;
   private int i;

   public static void a(int var0, int var1, int var2, int var3) {
      at var4 = new at();
      var4.a = p.y[var0 - 1];
      var4.c = var1;
      var4.d = var2;
      var4.g = (short)var3;
      dc.x.addElement(var4);
   }

   public static void a(int var0, int var1, int var2, int var3, int var4) {
      at var5 = new at();
      var5.a = p.y[var0 - 1];
      var5.c = var1;
      var5.d = var2;
      var5.g = 1;
      var5.i = var4;
      dc.x.addElement(var5);
   }

   public static void a(int var0, aa var1, int var2) {
      at var3 = new at();
      var3.a = p.y[var0 - 1];
      var3.f = var1;
      var3.g = 1;
      dc.x.addElement(var3);
   }

   public static void a(int var0, af var1, int var2) {
      at var3 = new at();
      var3.a = p.y[var0 - 1];
      var3.e = var1;
      var3.g = (short)var2;
      dc.x.addElement(var3);
   }

   public final void a() {
      if (0L != 0L) {
         ++this.b;
         if (this.b >= this.a.a.length) {
            this.b = 0;
         }

         if (System.currentTimeMillis() > 0L) {
            dc.x.removeElement(this);
         }
      } else {
         ++this.b;
         if (this.b >= this.a.a.length) {
            --this.g;
            if (this.g <= 0) {
               dc.x.removeElement(this);
            } else {
               this.b = 0;
            }
         }
      }

      if (main.a.w % 11 == 0 && this.e != null && this.e != af.e() && !p.D.contains(this.e)) {
         dc.x.removeElement(this);
      }

   }

   public final void a(en var1) {
      if (en.b == 1) {
         ++p.aN;
      }

      if (p.aN < 11) {
         if (this.e != null) {
            this.c = this.e.B;
            this.d = this.e.C + main.a.ae;
         }

         if (this.f != null) {
            this.c = this.f.m;
            this.d = this.f.n + main.a.ae;
         }

         int var3 = this.c + this.a.a[this.b].a;
         int var2 = this.d + this.a.a[this.b].b;
         if (main.a.d(var3, var2)) {
            bl.b(var1, this.a.a[this.b].c, var3, var2, this.i, 3);
         }
      }

   }
}
