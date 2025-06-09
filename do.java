public class do extends af {
   private static int c;
   public static ap[] dg;
   public static boolean di;
   private int a;
   private int b;
   private int d;
   public ap df;
   public boolean dh;
   public int[] dj;
   public int dk;
   private long e;
   private long f;

   public do(int var1, int var2, int var3, int var4, int var5, int var6) {
      super.bd = true;
      super.aO = var6;
      ds.c("npc avatar= " + super.aO);
      super.B = var3;
      super.C = var4;
      super.cl = var3;
      super.cm = var4;
      super.H = var2;
      if (var1 != -1) {
         this.df = dg[var5];
      }

      if (var5 == 23 || var5 == 42) {
         super.al = 45;
      }

      if (var5 == 51) {
         super.bd = false;
         this.a = var2;
         ds.c("duaHau = " + var2);
      }

      if (this.df != null) {
         if (this.df.b == null) {
            this.df.b = "";
         }

         this.df.b = ds.a(this.df.b);
      }

   }

   public static void aa() {
      for(int var0 = 0; var0 < p.G.size(); ++var0) {
         do var1 = (do)p.G.elementAt(var0);
         var1.ca = null;
         var1.bZ = -1;
      }

   }

   public void a() {
      if (this.df.a == 51) {
         this.f = System.currentTimeMillis();
         if (this.f - this.e >= 1000L) {
            --this.d;
            this.e = this.f;
            if (this.d < 0) {
               this.d = 0;
            }
         }
      }

      if (super.bd) {
         this.H();
      }

      if (super.ca == null) {
         label64: {
            label71: {
               int var1;
               if (af.e().L >= 9 && af.e().L <= 10 && af.e().ax.a > 0) {
                  var1 = af.e().ax.a;
                  if ((new byte[]{-1, 9, 9, 10, 10, 11, 11})[var1] == this.df.a) {
                     if (af.e().aD == null) {
                        super.ca = p.y[57];
                     } else {
                        if (af.e().aD == null || af.e().aD.a + 1 != af.e().aD.f.length) {
                           break label64;
                        }

                        super.ca = p.y[62];
                     }
                     break label71;
                  }
               }

               p.j();
               byte var2 = p.x();
               if (af.e().aD != null || var2 != this.df.a) {
                  if (af.e().aD == null || var2 != this.df.a) {
                     break label64;
                  }

                  var1 = af.e().aD.a;
                  var1 = af.e().aD.f.length;
                  super.ca = p.y[98];
               }
            }

            super.bZ = 0;
         }
      }

      super.a();
      if (bv.l == 51) {
         if (super.B > af.e().B) {
            super.I = -1;
         } else {
            super.I = 1;
         }

         if (this.df.a % 2 == 0) {
            if (super.as == 1) {
               super.as = 0;
            } else {
               super.as = 1;
            }
         }
      }

   }

   public final void a(byte var1, int var2) {
      this.a = var1;
      long var3 = System.currentTimeMillis();
      this.f = var3;
      this.e = var3;
      this.d = var2;
      ds.c("in ra second= " + this.d);
   }

   public void a(en var1) {
      if (!af.bI && !this.dh && this.G() && super.H != 15) {
         if (super.aN != 0) {
            super.a(var1);
         } else if (this.df != null) {
            if (this.df.a != 4 && this.df.a != 51 && this.df.a != 50) {
               var1.a(bv.x, super.B, super.C, 3);
            }

            int var2;
            int var3;
            if (this.df.a == 3) {
               bl.b(var1, 265, super.B, super.C, 0, 33);
               if (af.e().aT != null && af.e().aT.equals(this) && ae.m == null) {
                  var1.a(aa.R, 0, 0, 9, 6, 0, super.B, super.C - super.al + 4, 33);
               }

               this.b = 60;
            } else if (this.df.a != 4) {
               int var4;
               if (this.df.a != 50 && this.df.a != 51) {
                  if (this.df.a == 6) {
                     bl.b(var1, 545, super.B, super.C + 5, 0, 33);
                     if (af.e().aT != null && af.e().aT.equals(this) && ae.m == null) {
                        var1.a(aa.R, 0, 0, 9, 6, 0, super.B, super.C - super.al - 9, 33);
                     }

                     di.c.a(var1, String.valueOf(bv.n), super.B, super.C - super.al + 19 - di.k.a(), 2);
                  } else {
                     var4 = this.df.c;
                     var2 = this.df.e;
                     var3 = this.df.d;
                     av var10 = p.x[var4];
                     av var9 = p.x[var2];
                     av var8 = p.x[var3];
                     int var5;
                     int var6;
                     short var13;
                     short var18;
                     if (super.I == 1) {
                        bl.b(var1, var10.a[af.bC[super.as][0][0]].a, super.B + af.bC[super.as][0][1] + var10.a[af.bC[super.as][0][0]].b, super.C - af.bC[super.as][0][2] + var10.a[af.bC[super.as][0][0]].c, 0, 0);
                        var13 = var9.a[af.bC[super.as][1][0]].a;
                        var6 = super.B;
                        var5 = af.bC[super.as][1][1];
                        byte var7 = var9.a[af.bC[super.as][1][0]].b;
                        var3 = super.C;
                        var2 = af.bC[super.as][1][2];
                        bl.b(var1, var13, var7 + var6 + var5, var9.a[af.bC[super.as][1][0]].c + (var3 - var2), 0, 0);
                        var18 = var8.a[af.bC[super.as][2][0]].a;
                        var3 = super.B;
                        var4 = af.bC[super.as][2][1];
                        byte var12 = var8.a[af.bC[super.as][2][0]].b;
                        var5 = super.C;
                        var6 = af.bC[super.as][2][2];
                        bl.b(var1, var18, var12 + var3 + var4, var8.a[af.bC[super.as][2][0]].c + (var5 - var6), 0, 0);
                     } else {
                        bl.b(var1, var10.a[af.bC[super.as][0][0]].a, super.B - af.bC[super.as][0][1] - var10.a[af.bC[super.as][0][0]].b, super.C - af.bC[super.as][0][2] + var10.a[af.bC[super.as][0][0]].c, 2, 24);
                        var13 = var9.a[af.bC[super.as][1][0]].a;
                        var5 = super.B;
                        var6 = af.bC[super.as][1][1];
                        byte var11 = var9.a[af.bC[super.as][1][0]].b;
                        int var19 = super.C;
                        var2 = af.bC[super.as][1][2];
                        bl.b(var1, var13, var5 - var6 - var11, var9.a[af.bC[super.as][1][0]].c + (var19 - var2), 2, 24);
                        var18 = var8.a[af.bC[super.as][2][0]].a;
                        var3 = super.B;
                        var6 = af.bC[super.as][2][1];
                        byte var16 = var8.a[af.bC[super.as][2][0]].b;
                        var2 = super.C;
                        var4 = af.bC[super.as][2][2];
                        bl.b(var1, var18, var3 - var6 - var16, var8.a[af.bC[super.as][2][0]].c + (var2 - var4), 2, 24);
                     }

                     if (bv.l != 51) {
                        byte var15 = 15;
                        if (this.df.a == 47) {
                           var15 = 47;
                        }

                        if (af.e().aT != null && af.e().aT.equals(this) && ae.m == null) {
                           byte var14;
                           byte var17;
                           if (af.e().aT.df.a != 28 && af.e().aT.df.a != 41) {
                              var17 = 0;
                              var14 = 0;
                           } else {
                              var17 = -12;
                              var14 = 3;
                           }

                           var1.a(aa.R, 0, 0, 9, 6, 0, var14 + super.B, var17 + (super.C - super.al - (var15 - 8)), 33);
                        }
                     }

                     this.b = 65;
                  }
               } else if (this.dj != null) {
                  if (this.df.a == 50 && di) {
                     ++c;
                     if (main.a.w % 3 == 0) {
                        ei.a(new ea(19, super.B + ds.b(-50, 50), super.C, 2, 1, -1));
                     }

                     if (main.a.w % 15 == 0) {
                        ei.a(new ea(18, super.B + ds.b(-5, 5), super.C + ds.b(-90, 0), 2, 1, -1));
                     }

                     if (c == 100) {
                        p.j().b(super.B, super.C);
                     }

                     if (c == 110) {
                        di = false;
                        this.df.a = 4;
                     }
                  }

                  if (bl.c[this.dj[this.a]] != null && bl.c[this.dj[this.a]].a != null) {
                     var2 = en.b(bl.c[this.dj[this.a]].a);
                  } else {
                     var2 = 0;
                  }

                  var4 = this.dj[this.a];
                  var3 = super.B;
                  bl.b(var1, var4, ds.b(-1, 1) + var3, super.C, 0, 33);
                  if (af.e().aT != null && af.e().aT.equals(this)) {
                     if (ae.m == null) {
                        var1.a(aa.R, 0, 0, 9, 6, 0, super.B, super.C - super.al - 9 + 16 - var2, 33);
                     }

                     di.c.a(var1, ai.b(this.d), super.B, super.C - super.al - 16 - di.k.a() - 20 - var2 + 16, 2, di.f);
                  } else {
                     di.c.a(var1, ai.b(this.d), super.B, super.C - super.al - 8 - di.k.a() - 20 - var2 + 16, 2, di.f);
                  }
               }
            }

            if (super.bZ >= 0 && super.ca != null && super.aN == 0) {
               var2 = super.ca.a[super.bZ].c;
               var3 = super.B;
               bl.b(var1, var2, super.ca.a[super.bZ].a + var3, super.C + super.ca.a[super.bZ].b - this.b, 0, 3);
               if (main.a.w % 2 == 0) {
                  ++super.bZ;
                  if (super.bZ >= super.ca.a.length) {
                     super.bZ = 0;
                  }
               }
            }
         }
      }

   }

   public final void e(en var1) {
      byte var2 = 3;
      if (!af.bI && !this.dh && this.G() && super.H != 15 && this.df != null) {
         if (this.df.a == 3) {
            if (af.e().aT != null && af.e().aT.equals(this)) {
               di.n.a(var1, this.df.b, super.B, super.C - super.al - di.k.a() - 5, 2, di.o);
            } else {
               di.n.a(var1, this.df.b, super.B, super.C - super.al - 3 - di.k.a(), 2, di.o);
            }

            this.b = 60;
         } else if (this.df.a != 4) {
            if (this.df.a != 50 && this.df.a != 51) {
               if (this.df.a == 6) {
                  if (af.e().aT != null && af.e().aT.equals(this)) {
                     di.n.a(var1, this.df.b, super.B, super.C - super.al - di.k.a() - 16, 2, di.o);
                  } else {
                     di.n.a(var1, this.df.b, super.B, super.C - super.al - 8 - di.k.a(), 2, di.o);
                  }
               } else {
                  if (bv.l != 51) {
                     byte var3 = 15;
                     if (this.df.a == 47) {
                        var3 = 47;
                     }

                     byte var4;
                     byte var5;
                     byte var7;
                     if (af.e().aT != null && af.e().aT.equals(this)) {
                        if (bv.l != 113) {
                           if (af.e().aT.df.a != 28 && af.e().aT.df.a != 41) {
                              var7 = 0;
                              var4 = 0;
                           } else {
                              var5 = -12;
                              var4 = var2;
                              var7 = var5;
                           }

                           di.n.a(var1, this.df.b, super.B + var4, var7 + (super.C - super.al - di.k.a() - var3), 2, di.o);
                        }
                     } else {
                        var3 = 8;
                        if (this.df.a == 47) {
                           var3 = 40;
                        }

                        if (bv.l != 113) {
                           if (this.df.a != 28 && this.df.a != 41) {
                              var7 = 0;
                              var4 = 0;
                           } else {
                              var5 = -12;
                              var4 = var2;
                              var7 = var5;
                           }

                           di.n.a(var1, this.df.b, super.B + var4, var7 + (super.C - super.al - var3 - di.k.a()), 2, di.o);
                        }
                     }
                  }

                  this.b = 65;
               }
            } else if (this.dj != null) {
               int var6;
               if (bl.c[this.dj[this.a]] != null && bl.c[this.dj[this.a]].a != null) {
                  var6 = en.b(bl.c[this.dj[this.a]].a);
               } else {
                  var6 = 0;
               }

               if (af.e().aT != null && af.e().aT.equals(this)) {
                  di.n.a(var1, this.df.b, super.B, super.C - super.al - di.k.a() - var6, 2, di.o);
               } else {
                  di.n.a(var1, this.df.b, super.B, super.C - super.al - 8 - di.k.a() - var6 + 16, 2, di.o);
               }
            }
         }
      }

   }

   public final void k() {
      super.H = 15;
      af.x = null;
   }
}
