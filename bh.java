public final class bh {
   public int a;
   public int b;
   public int c;
   private int d;
   private int e;
   private int f;
   private int g;
   private int h;
   private int i;
   private int j;
   private int[] k = new int[3];
   private boolean l;
   private boolean m;
   private int n;
   private int o;
   private int p;

   public bh() {
   }

   public bh(int var1, int var2, int var3, int var4, int var5, int var6, int var7, boolean var8) {
      this.f = var1;
      this.g = var2;
      this.d = var3;
      this.e = var4;
      this.c = 0;
      if (this.c < 0) {
         this.c = 0;
      }

   }

   public final void a() {
      if (this.c > 0) {
         int var1;
         int var2;
         if (main.a.k) {
            if (!this.l && main.a.b(this.f, this.g, this.d, this.e)) {
               for(var1 = 0; var1 < this.k.length; ++var1) {
                  this.k[var1] = main.a.q;
               }

               this.j = main.a.q;
               this.l = true;
               boolean var3;
               if (this.n != 0) {
                  var3 = true;
               } else {
                  var3 = false;
               }

               this.m = var3;
               this.n = 0;
            } else if (this.l) {
               ++this.i;
               if (this.i > 5 && this.j == main.a.q && !this.m) {
                  this.j = -1000;
               }

               var2 = main.a.q - this.k[0];
               if (var2 != 0 && this.h != -1) {
                  this.h = -1;
               }

               for(var1 = this.k.length - 1; var1 > 0; --var1) {
                  this.k[var1] = this.k[var1 - 1];
               }

               this.k[0] = main.a.q;
               this.a -= var2;
               if (this.a < 0) {
                  this.a = 0;
               }

               if (this.a > this.c) {
                  this.a = this.c;
               }

               label116: {
                  if (this.b >= 0) {
                     var1 = var2;
                     if (this.b <= this.c) {
                        break label116;
                     }
                  }

                  var1 = var2 / 2;
               }

               this.b -= var1;
            }
         }

         if (main.a.l && this.l) {
            var2 = main.a.q;
            var1 = this.k[0];
            main.a.l = false;
            if (ds.g(var2 - var1) < 20 && ds.g(main.a.q - this.j) < 20 && !this.m && main.a.o) {
               this.n = 0;
               this.a = this.b;
               this.j = -1000;
               this.i = 0;
            } else if (this.h != -1 && this.i > 5) {
               this.i = 0;
            } else if (this.h == -1 && !this.m) {
               if (this.b < 0) {
                  this.a = 0;
               } else if (this.b > this.c) {
                  this.a = this.c;
               } else {
                  var1 = main.a.q - this.k[0] + (this.k[0] - this.k[1]) + (this.k[1] - this.k[2]);
                  byte var4;
                  if (var1 > 10) {
                     var4 = 10;
                  } else if (var1 < -10) {
                     var4 = -10;
                  } else {
                     var4 = 0;
                  }

                  this.n = -var4 * 100;
               }
            }

            this.l = false;
            this.i = 0;
            main.a.l = false;
         }

         if (this.b <= 0) {
            this.b = 0;
         }

         if (this.b >= this.c) {
            this.b = this.c;
         }
      }

   }

   public final void b() {
      if (this.n != 0 && !this.l) {
         this.a += this.n / 100;
         if (this.a < 0) {
            this.a = 0;
         } else if (this.a > this.c) {
            this.a = this.c;
         } else {
            this.b = this.a;
         }

         this.n = this.n * 9 / 10;
         if (this.n < 100 && this.n > -100) {
            this.n = 0;
         }
      }

      if (this.b != this.a && !this.l) {
         this.o = this.a - this.b << 2;
         this.p += this.o;
         this.b += this.p >> 4;
         this.p &= 15;
      }

   }
}
