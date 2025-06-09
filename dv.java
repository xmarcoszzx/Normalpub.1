public final class dv {
   public int a;
   public int b;
   public int c;
   public int d;
   public int e;
   public int f;
   public int g;
   public int h;
   public int i;
   public int j;
   public int k;
   public int l;
   public boolean m;
   public int n;
   public int o;
   private int p;
   private int q;
   private int r;
   private int s;
   private int[] t = new int[3];
   private boolean u;
   private int v;
   private int w;
   private boolean x = true;

   public final ca a() {
      byte var2 = -10;
      boolean var8 = true;
      boolean var9 = true;
      boolean var10 = false;
      boolean var7 = false;
      int var1;
      int var3;
      int var4;
      boolean var6;
      ca var11;
      byte var13;
      if (this.x) {
         var3 = this.p;
         var4 = this.q;
         var1 = this.i;
         int var12 = this.j;
         if (main.a.k) {
            if (!this.m && main.a.b(var3, var4, var1, var12)) {
               for(var1 = 0; var1 < this.t.length; ++var1) {
                  this.t[0] = main.a.q;
               }

               this.s = main.a.q;
               this.m = true;
               this.n = -1;
               if (this.v != 0) {
                  var6 = true;
               } else {
                  var6 = false;
               }

               this.u = var6;
               this.v = 0;
            } else if (this.m) {
               ++this.r;
               if (this.r > 5 && this.s == main.a.q && !this.u) {
                  this.s = -1000;
                  if (this.w > 1) {
                     var1 = (this.b + main.a.q - var4) / this.o;
                     var12 = (this.a + main.a.p - var3) / this.o;
                     this.n = var1 * this.w + var12;
                  } else {
                     this.n = (this.b + main.a.q - var4) / this.o;
                  }
               }

               var12 = main.a.q - this.t[0];
               if (var12 != 0 && this.n != -1) {
                  this.n = -1;
               }

               for(var1 = this.t.length - 1; var1 > 0; --var1) {
                  this.t[var1] = this.t[var1 - 1];
               }

               this.t[0] = main.a.q;
               this.b -= var12;
               if (this.b < 0) {
                  this.b = 0;
               }

               if (this.b > this.l) {
                  this.b = this.l;
               }

               label237: {
                  if (this.d >= 0) {
                     var1 = var12;
                     if (this.d <= this.l) {
                        break label237;
                     }
                  }

                  var1 = var12 / 2;
               }

               this.d -= var1;
            }
         }

         var6 = var7;
         if (main.a.m) {
            var6 = var7;
            if (this.m) {
               var12 = main.a.q;
               var1 = this.t[0];
               main.a.m = false;
               if (ds.g(var12 - var1) < 20 && ds.g(main.a.q - this.s) < 20 && !this.u) {
                  this.v = 0;
                  this.b = this.d;
                  this.s = -1000;
                  if (this.w > 1) {
                     var1 = (this.b + main.a.q - var4) / this.o;
                     var12 = (this.a + main.a.p - var3) / this.o;
                     this.n = var1 * this.w + var12;
                  } else {
                     this.n = (this.b + main.a.q - var4) / this.o;
                  }

                  this.r = 0;
                  var6 = var9;
               } else if (this.n != -1 && this.r > 5) {
                  this.r = 0;
                  var6 = var9;
               } else if (this.n == -1 && !this.u) {
                  if (this.d < 0) {
                     this.b = 0;
                     var6 = false;
                  } else if (this.d > this.l) {
                     this.b = this.l;
                     var6 = false;
                  } else {
                     var1 = main.a.q - this.t[0] + (this.t[0] - this.t[1]) + (this.t[1] - this.t[2]);
                     if (var1 > 10) {
                        var13 = 10;
                     } else if (var1 < -10) {
                        var13 = -10;
                     } else {
                        var13 = 0;
                     }

                     this.v = -var13 * 100;
                     var6 = false;
                  }
               } else {
                  var6 = false;
               }

               this.m = false;
               this.r = 0;
               main.a.m = false;
            }
         }

         var11 = new ca();
         var11.b = this.n;
         var11.c = var6;
         var11.a = this.m;
      } else {
         var4 = this.p;
         var1 = this.q;
         int var5 = this.i;
         var3 = this.j;
         if (main.a.k) {
            if (!this.m && main.a.b(var4, var1, var5, var3)) {
               for(var1 = 0; var1 < this.t.length; ++var1) {
                  this.t[0] = main.a.p;
               }

               this.s = main.a.p;
               this.m = true;
               this.n = -1;
               if (this.v != 0) {
                  var6 = true;
               } else {
                  var6 = false;
               }

               this.u = var6;
               this.v = 0;
            } else if (this.m) {
               ++this.r;
               if (this.r > 5 && this.s == main.a.p && !this.u) {
                  this.s = -1000;
                  this.n = (this.a + main.a.p - var4) / this.o;
               }

               var3 = main.a.p - this.t[0];
               if (var3 != 0 && this.n != -1) {
                  this.n = -1;
               }

               for(var1 = this.t.length - 1; var1 > 0; --var1) {
                  this.t[var1] = this.t[var1 - 1];
               }

               this.t[0] = main.a.p;
               this.a -= var3;
               if (this.a < 0) {
                  this.a = 0;
               }

               if (this.a > this.k) {
                  this.a = this.k;
               }

               label188: {
                  if (this.c >= 0) {
                     var1 = var3;
                     if (this.c <= this.k) {
                        break label188;
                     }
                  }

                  var1 = var3 / 2;
               }

               this.c -= var1;
            }
         }

         var6 = var10;
         if (main.a.m) {
            var6 = var10;
            if (this.m) {
               var3 = main.a.p;
               var1 = this.t[0];
               main.a.m = false;
               if (ds.g(var3 - var1) < 20 && ds.g(main.a.p - this.s) < 20 && !this.u) {
                  this.v = 0;
                  this.a = this.c;
                  this.s = -1000;
                  this.n = (this.a + main.a.p - var4) / this.o;
                  this.r = 0;
                  var6 = var8;
               } else if (this.n != -1 && this.r > 5) {
                  this.r = 0;
                  var6 = var8;
               } else {
                  label273: {
                     if (this.n == -1 && !this.u) {
                        if (this.c < 0) {
                           this.a = 0;
                           var6 = false;
                           break label273;
                        }

                        if (this.c > this.k) {
                           this.a = this.k;
                           var6 = false;
                           break label273;
                        }

                        var3 = main.a.p - this.t[0] + (this.t[0] - this.t[1]) + (this.t[1] - this.t[2]);
                        if (var3 > 10) {
                           var13 = 10;
                        } else {
                           var13 = var2;
                           if (var3 >= -10) {
                              var13 = 0;
                           }
                        }

                        this.v = -var13 * 100;
                     }

                     var6 = false;
                  }
               }

               this.m = false;
               this.r = 0;
               main.a.m = false;
            }
         }

         var11 = new ca();
         var11.b = this.n;
         var11.c = var6;
         var11.a = this.m;
      }

      return var11;
   }

   public final void a(int var1) {
      if (this.x) {
         this.b = var1 - (this.j - this.o) / 2;
         if (this.b < 0) {
            this.b = 0;
         }

         if (this.b > this.l) {
            this.b = this.l;
         }
      } else {
         this.a = var1 - (this.i - this.o) / 2;
         if (this.a < 0) {
            this.a = 0;
         }

         if (this.a > this.k) {
            this.a = this.k;
         }
      }

   }

   public final void a(int var1, int var2, int var3, int var4, int var5, int var6, boolean var7, int var8) {
      this.p = var3;
      this.q = var4;
      this.o = var2;
      this.i = var5;
      this.j = var6;
      this.x = true;
      this.w = 1;
      this.l = var1 * var2 - var6;
      if (this.l < 0) {
         this.l = 0;
      }

      if (this.k < 0) {
         this.k = 0;
      }

   }

   public final void b() {
      if (this.v != 0 && !this.m) {
         if (this.x) {
            this.b += this.v / 100;
            if (this.b < 0) {
               this.b = 0;
            } else if (this.b > this.l) {
               this.b = this.l;
            } else {
               this.d = this.b;
            }
         } else {
            this.a += this.v / 100;
            if (this.a < 0) {
               this.a = 0;
            } else if (this.a > this.k) {
               this.a = this.k;
            } else {
               this.c = this.a;
            }
         }

         this.v = this.v * 9 / 10;
         if (this.v < 100 && this.v > -100) {
            this.v = 0;
         }
      }

      if (this.c != this.a && !this.m) {
         this.e = this.a - this.c << 2;
         this.g += this.e;
         this.c += this.g >> 4;
         this.g &= 15;
      }

      if (this.d != this.b && !this.m) {
         this.f = this.b - this.d << 2;
         this.h += this.f;
         this.d += this.h >> 4;
         this.h &= 15;
      }

   }
}
