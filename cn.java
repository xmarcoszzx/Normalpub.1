import javax.microedition.lcdui.Image;

public final class cn {
   public static el a = new el("vTeleport");
   private static Image[] l = new Image[5];
   private static Image m;
   public int b;
   public int c;
   public int d;
   public boolean e;
   private int f;
   private int g;
   private boolean h;
   private int i;
   private int j;
   private int k;
   private boolean n;
   private boolean o;
   private boolean p = false;
   private boolean q;
   private int r;
   private int s = 1;
   private int t;
   private int u;
   private boolean v;
   private boolean w;

   public cn(int var1, int var2, int var3, int var4, int var5, boolean var6, int var7) {
      this.b = var1;
      this.c = 5;
      this.i = var2;
      ds.c("TELEPORT x= " + var1 + " y= " + var2 + " type= " + var5);
      this.f = var3;
      this.g = var5;
      this.h = var6;
      this.j = var4;
      this.k = var7;
      this.r = 0;
      var2 = 0;

      while(var2 < 100) {
         ++var2;
         this.i += 12;
         if (bv.a(var1, this.i, 2)) {
            if (this.i % 24 != 0) {
               this.i -= this.i % 24;
            }
            break;
         }
      }

      ds.c("Y2= " + this.i + "--------------------------------------------------------------");
      this.o = true;
      this.n = false;
      if (this.k > 2) {
         this.i += 4;
         if (l[3] == null) {
            l[3] = l.c("/mainImage/myTexture2dmaybay4a.png");
         }

         if (l[4] == null) {
            l[4] = l.c("/mainImage/myTexture2dmaybay4b.png");
         }

         if (m == null) {
            m = l.c("/mainImage/hole.png");
         }
      } else if (l[var7] == null) {
         l[var7] = l.b("/mainImage/myTexture2dmaybay" + (var7 + 1) + ".png");
      }

      if (var1 > p.j && var1 < p.j + main.a.A && this.i > 100) {
         bu.a();
         bu.a();
         this.p = true;
         bu.a();
      }

   }

   public static void a(cn var0) {
      a.addElement(var0);
   }

   public final void a() {
      if (this.k > 2 && this.e && this.c != -80) {
         if (this.o && this.r == 0) {
            if (main.a.w % 3 == 0) {
               at.a(1, this.b, this.c, 1, 0);
            }
         } else if (this.n && main.a.w % 3 == 0) {
            at.a(1, this.b, this.c + 16, 1, 1);
         }
      }

      ++this.t;
      if (this.t > 3) {
         this.t = 0;
      }

      int var1;
      int var2;
      if (this.o) {
         this.e = true;
         boolean var3;
         if (this.g == 0) {
            var3 = false;
         } else {
            var3 = true;
         }

         this.q = var3;
         if (this.k < 3) {
            var2 = this.i - this.c >> 3;
            var1 = var2;
            if (var2 <= 0) {
               this.e = false;
               var1 = 1;
            }

            this.c += var1;
         } else {
            if (main.a.w % 2 == 0) {
               ++this.s;
            }

            if (this.i - this.c < this.s) {
               this.c = this.i;
               this.e = false;
            } else {
               this.c += this.s;
            }
         }

         if (this.h && this.g == 1 && af.e().s) {
            af.e().B = this.b;
            af.e().C = this.c - 30;
            af.e().H = 4;
            p.l = this.b - p.f;
            p.m = this.c - p.g - 1;
            p.aD.f = false;
         }

         if (p.b(this.d) != null && !this.h && this.g == 1 && p.b(this.d).s) {
            p.b(this.d).B = this.b;
            p.b(this.d).C = this.c - 30;
            p.b(this.d).H = 4;
         }

         if (ds.g(this.c - this.i) < 50 && bv.a(this.b, this.c, 2)) {
            this.v = true;
            if (this.k < 3) {
               bu.a();
               if (this.c % 24 != 0) {
                  this.c -= this.c % 24;
               }

               ++this.r;
               if (this.r > 10) {
                  this.r = 0;
                  this.o = false;
                  this.n = true;
                  this.e = false;
               }

               if (this.g == 1) {
                  if (this.h) {
                     af.e().s = false;
                  } else if (p.b(this.d) != null) {
                     p.b(this.d).s = false;
                  }

                  this.q = false;
               }
            } else {
               this.c = this.i;
               if (!this.w) {
                  at.a(92, this.b + 4, this.c + 14, 1, 0);
                  p.bu = 10;
                  this.w = true;
               }

               ++this.r;
               if (this.r > 30) {
                  this.r = 0;
                  this.o = false;
                  this.n = true;
                  this.e = false;
               }

               if (this.g == 1) {
                  if (this.h) {
                     af.e().s = false;
                  } else if (p.b(this.d) != null) {
                     p.b(this.d).s = false;
                  }

                  this.q = false;
               }
            }
         }
      } else if (this.n) {
         ++this.r;
         if (this.r > 30) {
            var2 = this.i + 24 - this.c >> 3;
            var1 = var2;
            if (var2 > 30) {
               var1 = 30;
            }

            this.c -= var1;
            this.e = true;
         } else {
            if (this.r == 14 && this.p) {
               bu.a();
            }

            if (this.r > 0 && this.g == 0) {
               if (this.h) {
                  af.e().s = false;
                  if (af.e().H != 14) {
                     af.e().H = 3;
                  }

                  af.e().E = -3;
               } else if (p.b(this.d) != null) {
                  p.b(this.d).s = false;
                  if (p.b(this.d).H != 14) {
                     p.b(this.d).H = 3;
                  }

                  p.b(this.d).E = -3;
               }

               this.q = false;
            }

            if (this.r > 12 && this.g == 0) {
               if (this.h) {
                  af.e().s = true;
               } else if (p.b(this.d) != null) {
                  p.b(this.d).B = this.b;
                  p.b(this.d).C = this.c;
                  p.b(this.d).s = true;
               }

               this.q = true;
            }
         }

         if (this.h) {
            if (this.g == 0) {
               p.l = this.b - p.f;
               p.m = this.c - p.g - 1;
            }

            if (this.g == 1) {
               p.aD.f = true;
            }
         }

         if (this.c <= -80) {
            if (this.h && this.g == 0) {
               ac.b = false;
               af.bG = true;
            }

            if (!this.h && p.b(this.d) != null && this.g == 0) {
               p.D.removeElement(p.b(this.d));
            }

            if (this.k < 3) {
               a.removeElement(this);
            } else {
               this.c = -80;
               ++this.u;
               if (this.u > 80) {
                  this.u = 0;
                  a.removeElement(this);
               }
            }
         }
      }

      if (this.e && this.k < 3 && ds.g(this.c - this.i) <= 50 && main.a.w % 5 == 0) {
         ei.a(new ea(19, this.b, this.i + 20, 2, 1, -1));
      }

   }

   public final void a(en var1) {
      if (this.k > 2 && this.v) {
         var1.a(m, this.b, this.i + 20, cj.c);
      }

   }

   public final void b(en var1) {
      byte var2 = 2;
      if (!af.bI && this.b >= p.j && this.b <= p.j + main.a.A) {
         av var9 = p.x[this.f];
         byte var3;
         byte var4;
         if (this.k == 0) {
            var4 = 15;
            var3 = 40;
         } else {
            var3 = 0;
            var4 = 0;
         }

         if (this.k == 1) {
            var4 = 7;
            var3 = 55;
         }

         byte var5;
         int var10;
         if (this.k == 2) {
            var4 = 52;
            var10 = 18;
         } else {
            var5 = var4;
            var4 = var3;
            var10 = var5;
         }

         if (this.q && this.k < 3) {
            short var7 = var9.a[af.bC[0][0][0]].a;
            int var6 = this.b;
            if (this.j != 1) {
               var10 = -var10;
            }

            int var8 = this.c;
            if (this.j == 1) {
               var5 = 0;
            } else {
               var5 = 2;
            }

            bl.b(var1, var7, var10 + var6, var8 - var4, var5, cj.a);
         }

         int var11;
         Image var13;
         if (this.k < 3) {
            var13 = l[this.k];
            var10 = en.a(l[this.k]);
            var11 = en.b(l[this.k]);
            if (this.j != 1) {
               var2 = 0;
            }

            var1.a(var13, 0, 0, var10, var11, var2, this.b, this.c, cj.c);
         } else {
            int var12;
            if (this.o) {
               if (this.r > 10) {
                  var13 = l[4];
                  var11 = en.a(l[4]);
                  var12 = en.b(l[4]);
                  if (this.j != 1) {
                     var2 = 0;
                  }

                  if (this.j == 1) {
                     var10 = this.b - 11;
                  } else {
                     var10 = this.b + 11;
                  }

                  var1.a(var13, 0, 0, var11, var12, var2, var10, this.c + 2, cj.c);
               } else {
                  var13 = l[3];
                  var11 = en.a(l[3]);
                  var10 = en.b(l[3]);
                  if (this.j != 1) {
                     var2 = 0;
                  }

                  var1.a(var13, 0, 0, var11, var10, var2, this.b, this.c, cj.c);
               }
            } else if (this.r < 20) {
               var13 = l[4];
               var12 = en.a(l[4]);
               var11 = en.b(l[4]);
               if (this.j != 1) {
                  var2 = 0;
               }

               if (this.j == 1) {
                  var10 = this.b - 11;
               } else {
                  var10 = this.b + 11;
               }

               var1.a(var13, 0, 0, var12, var11, var2, var10, this.c + 2, cj.c);
            } else {
               var13 = l[3];
               var10 = en.a(l[3]);
               var11 = en.b(l[3]);
               if (this.j != 1) {
                  var2 = 0;
               }

               var1.a(var13, 0, 0, var10, var11, var2, this.b, this.c, cj.c);
            }
         }
      }

   }
}
