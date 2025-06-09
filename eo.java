public final class eo {
   public int[][] a = new int[3][];
   public ej b = new ej();
   public int c;
   public int d;
   public boolean e;
   public boolean f = true;
   public int g;
   public int h;
   public de i;
   private int j;
   private int k;
   private int l;
   private int m;
   private int n;
   private int o;
   private int p;
   private int q;
   private int r;

   public eo() {
      for(int var1 = 0; var1 < this.a.length; ++var1) {
         this.a[var1] = new int[3];
      }

   }

   public final void a() {
      byte var1 = -20;
      ej var4;
      if (this.b != null && this.b.a != null && this.b.a.size() == 0 && this.c != -40) {
         var4 = this.b;
         --var4.f;
         if (this.b.f <= 0) {
            this.c = -40;
            this.b.e = 0;
            this.b.a.removeAllElements();
            this.b.d = null;
            this.b.f = 200;
         }
      }

      if ((!this.equals(p.aE) || p.j().bQ == null) && this.f) {
         if (this.c != this.m) {
            this.o = this.m - this.c << 2;
            this.n += this.o;
            this.c += this.n >> 4;
            this.n &= 15;
         }

         if (this.d != this.p) {
            this.r = this.p - this.d << 2;
            this.q += this.r;
            this.d += this.q >> 4;
            this.q &= 15;
         }

         ++this.l;
         if (this.l == 5) {
            this.l = 0;
            if (this.k == 0) {
               this.k = 1;
            } else {
               this.k = 0;
            }
         }

         if (this.b != null && (this.b == null || this.b.b != null)) {
            if (!this.e) {
               if (this.g > 0) {
                  --this.g;
                  if (this.g == 0) {
                     main.a.G.l();
                     main.a.G.s();
                  }
               }

               if (main.a.w % 3 == 0) {
                  if (af.e().I == 1) {
                     this.p = af.e().B - 20 - p.j;
                  }

                  if (af.e().I == -1) {
                     this.p = af.e().B + 20 - p.j;
                  }

                  if (this.p <= 24) {
                     this.p += this.b.c / 2;
                  }

                  if (this.p >= main.a.A - 24) {
                     this.p -= this.b.c / 2;
                  }

                  this.m = af.e().C - 40 - p.k;
                  if (this.b.d != null && this.m < (this.b.d.length + 1) * 12 + 10) {
                     this.m = (this.b.d.length + 1) * 12 + 10;
                  }

                  if (this.b.b.c != null) {
                     if (main.a.A - 50 > this.b.i + 155) {
                        this.p = main.a.A - 60 - this.b.i / 2;
                        this.m = this.b.j + 10;
                     } else {
                        this.p = main.a.A - 20 - this.b.i / 2;
                        this.m = this.b.j + 45;
                        if (main.a.A > main.a.B || main.a.A < 220) {
                           this.p = main.a.A - 20 - this.b.i / 2;
                           this.m = this.b.j + 10;
                        }
                     }
                  }
               }

               if (this.d > af.e().B - p.j) {
                  this.j = -1;
               } else {
                  this.j = 1;
               }
            }

            if (this.b.b != null) {
               r var5;
               if (this.b.a.size() > 1) {
                  if (this.b.b.f == 0) {
                     var4 = this.b;
                     ++var4.e;
                     if (this.b.e >= this.b.b.b) {
                        this.b.e = 0;
                        this.b.a.removeElementAt(0);
                        var5 = (r)this.b.a.firstElement();
                        this.b.b = var5;
                        this.b.c();
                     }
                  } else {
                     this.b.b.i = System.currentTimeMillis();
                     if (this.b.b.i - this.b.b.h >= 1000L) {
                        this.b.b.h = System.currentTimeMillis();
                        var5 = this.b.b;
                        --var5.f;
                     }

                     if (this.b.b.f == 0) {
                        this.b.a.removeElementAt(0);
                        if (this.b.a.size() != 0) {
                           var5 = (r)this.b.a.firstElement();
                           this.b.b = var5;
                           this.b.c();
                        }
                     }
                  }
               } else if (this.b.a.size() == 1) {
                  int var2;
                  int var3;
                  if (this.b.b.f == 0) {
                     var4 = this.b;
                     ++var4.e;
                     if (this.b.e >= this.b.b.b) {
                        this.e = true;
                     }

                     if (this.b.e == this.b.b.b) {
                        this.m = -40;
                        var2 = af.e().B;
                        var3 = p.j;
                        if (af.e().I != 1) {
                           var1 = 20;
                        }

                        this.p = var1 + (var2 - var3);
                     }

                     if (this.b.e >= this.b.b.b + 20) {
                        this.b.e = 0;
                        this.b.a.removeAllElements();
                        this.b.d = null;
                        this.b.f = 200;
                     }
                  } else {
                     this.b.b.i = System.currentTimeMillis();
                     if (this.b.b.i - this.b.b.h >= 1000L) {
                        this.b.b.h = System.currentTimeMillis();
                        var5 = this.b.b;
                        --var5.f;
                     }

                     if (this.b.b.f == 0) {
                        this.e = true;
                        this.m = -40;
                        var3 = af.e().B;
                        var2 = p.j;
                        if (af.e().I != 1) {
                           var1 = 20;
                        }

                        this.p = var1 + (var3 - var2);
                        this.b.e = 0;
                        this.b.a.removeAllElements();
                        this.b.d = null;
                        this.i = null;
                     }
                  }
               }
            }
         }
      }

   }

   public final void a(en var1) {
      if ((!this.equals(p.aE) || !p.j().u()) && (!this.equals(p.aE) || p.j().bQ == null) && p.bt && (main.a.E == p.j() || main.a.E == ar.a()) && ae.n == null && this.f && !af.bG && (!main.a.G.a || !this.equals(p.aE))) {
         var1.a(-var1.a(), -var1.b());
         var1.e(0, 0, main.a.A, main.a.B);
         if (this.b != null) {
            this.b.a(var1, this.d, this.c, this.j);
         }

         if (this.b.b != null && this.b.b.c == null && this.a != null) {
            int var5 = this.a[af.e().K][this.k];
            int var4 = this.d;
            int var6 = this.c;
            byte var2;
            if (main.a.w % 10 > 5) {
               var2 = 1;
            } else {
               var2 = 0;
            }

            byte var3;
            if (this.j == 1) {
               var3 = 0;
            } else {
               var3 = 2;
            }

            bl.b(var1, var5, var4, var6 + 3 + var2, var3, cj.f);
         }

         var1.a(-var1.a(), -var1.b());
      }

   }

   public final void a(String var1, int var2) {
      var1 = ds.a(var1);
      if (this.b.a.size() <= 0 || !var1.equals(((r)this.b.a.lastElement()).a)) {
         int var3;
         if (this.b.a.size() > 10) {
            for(var3 = 0; var3 < 5; ++var3) {
               this.b.a.removeElementAt(0);
            }
         }

         this.b.a(var1, var2, (af)null, false);
         if (this.b.a.size() == 1) {
            this.c = 0;
            var3 = af.e().B;
            int var4 = p.j;
            byte var5;
            if (af.e().I == 1) {
               var5 = -20;
            } else {
               var5 = 20;
            }

            this.d = var5 + (var3 - var4);
         }

         this.e = false;
      }

   }

   public final void a(String var1, af var2, boolean var3) {
      this.h = var2.J;
      this.b.a(var1, 3, var2, var3);
      this.e = false;
   }
}
