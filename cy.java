public final class cy {
   public short a;
   public int b;
   public int c;
   private long d;
   private long e;
   private boolean f;
   private int g;
   private int h;
   private boolean i;
   private boolean j;
   private String k;
   private int l;

   public cy() {
      this.b = 0;
      this.l = 100;
   }

   public cy(short var1, int var2) {
      boolean var3 = false;
      super();
      this.b = 0;
      this.l = 100;
      this.a = var1;
      this.c = var2 / 60;
      this.b = var2 % 60;
      this.g = var2;
      this.h = var2;
      long var4 = System.currentTimeMillis();
      this.e = var4;
      this.d = var4;
      if (var1 == 14) {
         var3 = true;
      }

      this.f = var3;
   }

   public static boolean a(int var0) {
      boolean var2 = false;

      for(int var1 = 0; var1 < af.br.size(); ++var1) {
         if (((cy)af.br.elementAt(var1)).a == var0) {
            var2 = true;
            break;
         }
      }

      return var2;
   }

   public static boolean b(int var0) {
      boolean var2 = false;

      for(int var1 = 0; var1 < p.bv.size(); ++var1) {
         if (((cy)p.bv.elementAt(var1)).a == var0) {
            var2 = true;
            break;
         }
      }

      return var2;
   }

   public static cy c(int var0) {
      int var1 = 0;

      cy var2;
      while(true) {
         if (var1 >= af.br.size()) {
            var2 = null;
            break;
         }

         cy var3 = (cy)af.br.elementAt(var1);
         var2 = var3;
         if (var3.a == var0) {
            break;
         }

         ++var1;
      }

      return var2;
   }

   public static cy d(int var0) {
      int var1 = 0;

      cy var2;
      while(true) {
         if (var1 >= p.bv.size()) {
            var2 = null;
            break;
         }

         cy var3 = (cy)p.bv.elementAt(var1);
         var2 = var3;
         if (var3.a == var0) {
            break;
         }

         ++var1;
      }

      return var2;
   }

   public final void a() {
      this.d = System.currentTimeMillis();
      if (this.d - this.e >= 1000L) {
         this.e = System.currentTimeMillis();
         --this.b;
         --this.h;
         if (this.b <= 0) {
            this.b = 60;
            --this.c;
         }

         if (this.g > 0) {
            this.l = this.h * 100 / this.g;
         }
      }

      if (this.c < 0 && !this.i) {
         af.br.removeElement(this);
      }

      if (this.c < 0 && this.i && !this.j) {
         p.bv.removeElement(this);
      }

   }

   public final void a(byte var1, String var2, int var3) {
      boolean var4 = true;
      if (var3 == -1) {
         this.j = true;
      } else {
         this.j = false;
      }

      this.i = true;
      this.c = var3 / 60;
      this.b = var3 % 60;
      this.a = var1;
      this.g = var3;
      this.h = var3;
      this.k = var2;
      long var5 = System.currentTimeMillis();
      this.e = var5;
      this.d = var5;
      if (this.a != 14) {
         var4 = false;
      }

      this.f = var4;
   }

   public final void a(int var1, boolean var2) {
      this.c = var1 / 60;
      this.b = var1 % 60;
      this.g = var1;
      this.h = var1;
      this.i = false;
      long var3 = System.currentTimeMillis();
      this.e = var3;
      this.d = var3;
   }

   public final void a(en var1, int var2, int var3) {
      if (this.f) {
         if (af.e() != null) {
            var2 = main.a.A / 2 - 40;
            var3 = main.a.B - 80;
            var1.a(8421504);
            var1.d(var2, var3, 80, 2);
            var1.a(16777215);
            if (this.l > 0) {
               var1.d(var2, var3, this.l * 80 / 100, 2);
            }
         }
      } else {
         String var4 = this.c + "'";
         if (this.c <= 0) {
            var4 = this.b + "s";
         }

         if (this.c < 0) {
            var4 = "";
         }

         if (this.j) {
            var4 = "";
         }

         di.c.a(var1, this.k + " " + var4, var2, var3, 0, di.f);
      }

   }
}
