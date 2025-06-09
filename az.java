import javax.microedition.lcdui.Image;

public final class az {
   private static int[] i;
   private static int j;
   private static int k;
   private static int l;
   private static int m;
   private static Image q = l.b("/mainImage/myTexture2dbtMenu1.png");
   private static Image r = l.b("/mainImage/myTexture2dbtMenu2.png");
   private int A;
   private boolean B;
   private boolean C;
   private int D;
   private int E;
   private boolean F;
   private boolean[] G;
   public boolean a;
   public int b;
   public int c;
   public int d;
   public int e;
   private el f;
   private int g;
   private int h;
   private de n;
   private de o;
   private de p;
   private boolean s;
   private int t;
   private int u;
   private int v;
   private int[] w;
   private boolean x;
   private boolean y;
   private int z;

   public az() {
      this.n = new de(aw.bv, 0);
      this.o = new de(aw.bi, 0, main.a.A - 71, main.a.B - bb.cr + 1);
      this.p = null;
      this.w = new int[3];
   }

   private boolean c() {
      boolean var1;
      if ((this.F || i[i.length - 1] <= this.d) && (!this.F || i[i.length - 1] >= main.a.B)) {
         var1 = false;
      } else {
         var1 = true;
      }

      return var1;
   }

   public final void a() {
      if ((!p.j().bd || !p.j().ba) && this.a && !this.c()) {
         boolean var1;
         label262: {
            if (!main.a.i[2] && !main.a.i[4]) {
               if (!main.a.i[8] && !main.a.i[6]) {
                  if (main.a.i[5]) {
                     this.z = 2;
                     var1 = false;
                  } else if (main.a.i[12] && !p.j().r()) {
                     if (this.c()) {
                        return;
                     }

                     if (this.n.e <= 0) {
                        this.z = 2;
                     }

                     bu.a();
                     var1 = false;
                  } else {
                     if (!p.j().r() && !this.s && (main.a.i[13] || bb.a(this.o))) {
                        if (this.c()) {
                           return;
                        }

                        if (!this.C) {
                           this.C = true;
                        }

                        this.F = true;
                        bu.a();
                     }

                     var1 = false;
                  }
                  break label262;
               }

               ++this.b;
               if (this.b > this.f.size() - 1) {
                  this.b = 0;
                  var1 = true;
                  break label262;
               }
            } else {
               --this.b;
               if (this.b < 0) {
                  this.b = this.f.size() - 1;
                  var1 = true;
                  break label262;
               }
            }

            var1 = true;
         }

         int var4;
         if (var1) {
            var4 = this.b * this.g + this.g - main.a.A / 2;
            j = var4;
            if (var4 > l) {
               j = l;
            }

            if (j < 0) {
               j = 0;
            }

            if (this.b == this.f.size() - 1 || this.b == 0) {
               k = j;
            }
         }

         if (main.a.G.ai != null && main.a.G.ai.u) {
            if (!main.a.a(main.a.G.ai.e, 0, main.a.G.ai.a + 2, main.a.G.ai.g)) {
               var1 = true;
            } else {
               main.a.G.ai.b();
               var1 = false;
            }
         } else {
            var1 = true;
         }

         if (!this.s && main.a.m && !main.a.b(this.c, this.d, this.t, this.h) && !this.x && !p.j().r() && var1) {
            if (!this.c()) {
               this.v = 0;
               this.u = 0;
               this.x = false;
               main.a.l();
               this.F = true;
               this.C = true;
               bu.a();
            }
         } else {
            int var2;
            if (main.a.k) {
               if (!this.x && main.a.b(this.c, this.d, this.t, this.h)) {
                  for(var4 = 0; var4 < this.w.length; ++var4) {
                     this.w[0] = main.a.p;
                  }

                  this.v = main.a.p;
                  this.x = true;
                  boolean var3;
                  if (this.A != 0) {
                     var3 = true;
                  } else {
                     var3 = false;
                  }

                  this.y = var3;
                  this.A = 0;
               } else if (this.x) {
                  ++this.u;
                  if (this.u > 5 && this.v == main.a.p && !this.y) {
                     this.v = -1000;
                     this.b = (j + main.a.p - this.c) / this.g;
                  }

                  var2 = main.a.p - this.w[0];
                  if (var2 != 0 && this.b != -1) {
                     this.b = -1;
                  }

                  for(var4 = this.w.length - 1; var4 > 0; --var4) {
                     this.w[var4] = this.w[var4 - 1];
                  }

                  this.w[0] = main.a.p;
                  var4 = j - var2;
                  j = var4;
                  if (var4 < 0) {
                     j = 0;
                  }

                  if (j > l) {
                     j = l;
                  }

                  label166: {
                     if (k >= 0) {
                        var4 = var2;
                        if (k <= l) {
                           break label166;
                        }
                     }

                     var4 = var2 / 2;
                  }

                  k -= var4;
               }
            }

            if (main.a.m && this.x) {
               var2 = main.a.p;
               var4 = this.w[0];
               main.a.m = false;
               if (ds.g(var2 - var4) < 20 && ds.g(main.a.p - this.v) < 20 && !this.y) {
                  this.A = 0;
                  j = k;
                  this.v = -1000;
                  this.b = (j + main.a.p - this.c) / this.g;
                  this.u = 0;
                  this.z = 10;
               } else if (this.b != -1 && this.u > 5) {
                  this.u = 0;
                  this.z = 1;
               } else if (this.b == -1 && !this.y) {
                  if (k < 0) {
                     j = 0;
                  } else if (k > l) {
                     j = l;
                  } else {
                     var4 = main.a.p - this.w[0] + (this.w[0] - this.w[1]) + (this.w[1] - this.w[2]);
                     byte var5;
                     if (var4 > 10) {
                        var5 = 10;
                     } else if (var4 < -10) {
                        var5 = -10;
                     } else {
                        var5 = 0;
                     }

                     this.A = -var5 * 100;
                  }
               }

               this.x = false;
               this.u = 0;
               main.a.m = false;
            }

            main.a.f();
            main.a.g();
         }
      }

   }

   public final void a(el var1) {
      if (!this.a) {
         this.F = false;
         this.B = false;
         this.C = false;
         this.e = 0;
         de var3;
         if (var1.size() == 1) {
            this.b = 0;
            var3 = (de)var1.elementAt(0);
            if (var3 != null && var3.b.equals(aw.cD)) {
               var3.a();
               this.a = false;
               bp.a();
               return;
            }
         }

         bu.a();
         this.G = new boolean[var1.size()];

         int var2;
         for(var2 = 0; var2 < this.G.length; ++var2) {
            this.G[var2] = false;
         }

         this.s = false;
         ae.m = null;
         dc.x.removeAllElements();
         dc.z.removeAllElements();
         bp.c();
         if (var1.size() != 0) {
            this.f = var1;
            this.g = 60;
            this.h = 60;

            for(var2 = 0; var2 < var1.size(); ++var2) {
               var3 = (de)var1.elementAt(var2);
               var3.f = false;
               di.n.a(var3.b);
               var3.c = di.n.a(var3.b, this.g - 10);
            }

            i = new int[var1.size()];
            this.c = (main.a.A - var1.size() * this.g) / 2;
            if (this.c <= 0) {
               this.c = 1;
            }

            this.d = main.a.B - this.h - (cx.a + 1) - 1;
            if (main.a.e) {
               this.d -= 3;
            }

            this.d += 27;

            for(var2 = 0; var2 < i.length; ++var2) {
               i[var2] = main.a.B;
            }

            this.a = true;
            this.b = 0;
            var2 = this.f.size() * this.g - main.a.A;
            l = var2;
            if (var2 < 0) {
               l = 0;
            }

            j = 0;
            k = 0;
            m = 50;
            this.t = var1.size() * this.g - 1;
            if (this.t > main.a.A - 2) {
               this.t = main.a.A - 2;
            }

            if (main.a.e) {
               this.b = -1;
            }
         }
      }

   }

   public final void a(el var1, int var2) {
      this.a(var1);
      this.s = true;
   }

   public final void a(el var1, int var2, int var3) {
      this.a(var1);
      this.c = var2;

      for(this.d = var3; this.d + this.h > main.a.B; this.d -= 2) {
      }

   }

   public final void a(en var1) {
      if (!p.j().bd || !p.j().ba) {
         var1.a(-var1.a(), -var1.b());
         var1.a(-k, 0);

         for(int var2 = 0; var2 < this.f.size(); ++var2) {
            if (var2 == this.b) {
               var1.a(r, this.c + this.g * var2 + 1, i[var2] + 1, 0);
            } else {
               var1.a(q, this.c + this.g * var2 + 1, i[var2] + 1, 0);
            }

            de var8 = (de)this.f.elementAt(var2);
            String[] var7 = var8.c;
            if (var7 == null) {
               var7 = new String[]{((de)this.f.elementAt(var2)).b};
            }

            int var4 = i[var2] + (this.h - var7.length * 14) / 2 + 1;

            for(int var3 = 0; var3 < var7.length; ++var3) {
               int var5;
               int var6;
               di var9;
               String var10;
               if (var2 == this.b) {
                  var9 = di.g;
                  var10 = var7[var3];
                  var5 = this.c;
                  var6 = this.g;
                  var9.a(var1, var10, this.g / 2 + var5 + var6 * var2, var4 + var3 * 14, 2);
               } else if (var8.a) {
                  var9 = di.a;
                  var10 = var7[var3];
                  var5 = this.c;
                  var6 = this.g;
                  var9.a(var1, var10, this.g / 2 + var5 + var6 * var2, var4 + var3 * 14, 2);
               } else {
                  var9 = di.f;
                  var10 = var7[var3];
                  var5 = this.c;
                  var6 = this.g;
                  var9.a(var1, var10, this.g / 2 + var5 + var6 * var2, var4 + var3 * 14, 2);
               }
            }
         }

         var1.a(-var1.a(), -var1.b());
      }

   }

   public final void b() {
      int var1;
      if (this.A != 0 && !this.x) {
         var1 = j + this.A / 100;
         j = var1;
         if (var1 < 0) {
            j = 0;
         } else if (j > l) {
            j = l;
         } else {
            k = j;
         }

         this.A = this.A * 9 / 10;
         if (this.A < 100 && this.A > -100) {
            this.A = 0;
         }
      }

      if (k != j && !this.x) {
         this.D = j - k << 2;
         this.E += this.D;
         k += this.E >> 4;
         this.E &= 15;
      }

      int var2;
      int var3;
      int[] var4;
      de var5;
      if (!this.F) {
         ++this.e;

         for(var1 = 0; var1 < i.length; ++var1) {
            if (i[var1] > this.d) {
               var3 = i[var1] - this.d >> 1;
               var2 = var3;
               if (var3 <= 0) {
                  var2 = 1;
               }

               if (this.e > var1) {
                  var4 = i;
                  var4[var1] -= var2;
               }
            }
         }

         if (i[i.length - 1] <= this.d) {
            this.e = 0;
         }
      } else {
         ++this.e;

         for(var1 = 0; var1 < i.length; ++var1) {
            if (i[var1] < main.a.B) {
               var3 = (main.a.B - i[var1] >> 1) + 2;
               var2 = var3;
               if (var3 <= 0) {
                  var2 = 1;
               }

               if (this.e > var1) {
                  var4 = i;
                  var4[var1] += var2;
               }
            }
         }

         if (i[i.length - 1] >= main.a.B) {
            this.e = 0;
            this.F = false;
            this.a = false;
            bp.c();
            if (this.C) {
               main.a.G.ai = null;
               af.x = null;
               if (main.a.H != null && main.a.H.ai != null) {
                  main.a.H.ai = null;
               }
            } else if (this.B) {
               main.a.G.ai = null;
               if (main.a.H != null && main.a.H.ai != null) {
                  main.a.H.ai = null;
               }

               if (this.b >= 0) {
                  var5 = (de)this.f.elementAt(this.b);
                  if (var5 != null) {
                     bu.a();
                     var5.a();
                  }
               }
            }
         }
      }

      if (m != 0) {
         var1 = m >> 1;
         m = var1;
         if (var1 < 0) {
            m = 0;
         }
      }

      if (!this.c() && this.z > 0) {
         --this.z;
         if (this.z == 0) {
            if (this.b >= 0 && !this.G[this.b]) {
               this.F = true;
               this.B = true;
               main.a.G.ai = null;
            } else {
               bp.c();
               if (this.b >= 0) {
                  var5 = (de)this.f.elementAt(this.b);
                  if (var5 != null) {
                     var5.a();
                  }
               }
            }
         }
      }

   }
}
