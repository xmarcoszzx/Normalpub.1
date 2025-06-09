import javax.microedition.lcdui.Image;

public final class ar extends bb implements b {
   private static int L;
   private static int[] M;
   private static df N;
   private static df O;
   private static Image P;
   private static Image Q;
   public static ar a;
   public static boolean d = false;
   public static boolean e = false;
   private int[] A;
   private int[] B;
   private int[] C;
   private int[] D;
   private short[] E;
   private long F;
   private long G;
   private boolean H;
   private boolean I;
   private boolean J;
   private short K;
   private byte[] R = new byte[]{19, 19, 19, 19, 19, 19, 19, 19, 19, 19, 19, 19, 19, 19, 19, 19, 19, 19, 19, 19, 20};
   private byte[] S;
   byte b = 0;
   int c;
   private eb[] f;
   private byte g;
   private int h;
   private int i;
   private int j;
   private int k;
   private int l;
   private int m;
   private int n;
   private int o;
   private int p;
   private int q;
   private int r;
   private int s;
   private int t;
   private int u;
   private int v;
   private int w = 0;
   private int x = 0;
   private int y;
   private int z;

   public ar() {
      byte[] var1 = new byte[]{0, 0, 0, 1, 1, 1, 2, 2, 2, 3, 3, 3};
      this.S = var1;
      int[] var2 = new int[3];
      M = var2;
      var2[0] = 16;
      L = main.a.B - 41;
      M[1] = main.a.A - 40;
      M[2] = (M[0] + M[1]) / 2;
      N = new df(l.b("/e/e_1.png"), 30, 30);
      O = new df(l.b("/e/e_0.png"), 68, 65);
      new df(l.b("/e/e_2.png"), 66, 70);
      Q = l.b("/e/nut2.png");
      P = l.b("/e/nut3.png");
      this.s = 230;
      this.q = main.a.C - this.s / 2;
      this.t = 40;
      this.r = -this.t;
   }

   public static ar a() {
      if (a == null) {
         a = new ar();
      }

      return a;
   }

   static void a(ar var0) {
      if (var0.b < 2) {
         if (var0.f() + var0.g() > 0) {
            var0.b = 2;
            bu.a();
            af.e().a(p.u[13], 0);
            var0.G = main.a.b + (long)ds.b(2000, 3000);
         }
      } else if (var0.r == main.a.D / 3) {
         bt.a().c(var0.g, (byte)0);
      }

   }

   static void a(ar var0, int var1) {
      var0.b(var1);
   }

   private void b(int var1) {
      if (!this.f[var1].k) {
         bu.a();
         long var2;
         if (this.g == 0) {
            var2 = af.e().at;
         } else {
            var2 = (long)af.e().Y();
         }

         if (this.f() >= this.p && var2 < (long)(this.v + this.u)) {
            StringBuffer var5 = (new StringBuffer(String.valueOf(aw.j))).append(" ");
            String var4;
            if (this.g == 0) {
               var4 = aw.bC;
            } else {
               var4 = aw.bD;
            }

            var4 = var5.append(var4).toString();
            p.aD.a(var4, 0);
         } else {
            this.o = var1;
            this.f[this.o].d = this.n + ds.b(-3, 3);
         }
      }

   }

   private void c(int var1) {
      boolean var2 = false;
      this.c = var1;
      if (this.c == 2) {
         if (!d) {
            var2 = true;
         }

         d = var2;
         if (var2) {
            (new Thread(new dj(this))).start();
         } else {
            e = true;
         }
      } else if (var1 == 0) {
         if (this.b < 2) {
            if (this.f() + this.g() > 0) {
               this.b = 2;
               bu.a();
               af.e().a(p.u[13], 0);
               this.G = main.a.b + (long)ds.b(2000, 3000);
            }
         } else if (this.r == main.a.D / 3) {
            bt.a().c(this.g, (byte)0);
         }
      } else {
         if (d) {
            this.e();
         }

         p.j().bb = false;
         p.j().b();
      }

   }

   private byte f() {
      int var3 = 0;

      byte var1;
      for(var1 = 0; var3 < this.f.length; ++var3) {
         if (this.f[var3].k) {
            ++var1;
         }
      }

      byte var2 = var1;
      if (var1 > this.p) {
         var2 = (byte)this.p;
      }

      return var2;
   }

   private byte g() {
      byte var1 = 0;
      int var3 = 0;

      byte var4;
      byte var5;
      for(var4 = 0; var3 < this.f.length; var4 = var5) {
         var5 = var4;
         if (this.f[var3].k) {
            var5 = (byte)(var4 + 1);
         }

         ++var3;
      }

      byte var2 = (byte)(var4 - this.f());
      if (var2 > 0) {
         var1 = var2;
      }

      return var1;
   }

   private void h() {
      for(int var1 = 0; var1 < af.e().aF.length; ++var1) {
         if (af.e().aF[var1] != null && af.e().aF[var1].b.a == this.K) {
            this.p = af.e().aF[var1].h;
            break;
         }
      }

   }

   public final void a(int var1, Object var2) {
   }

   public final void a(en var1) {
      Exception var10000;
      label207: {
         boolean var10001;
         try {
            p.j().a(var1);
            var1.a(-p.j, -p.k);
            var1.a(0, main.a.ae);
         } catch (Exception var27) {
            var10000 = var27;
            var10001 = false;
            break label207;
         }

         int var2 = 0;

         while(true) {
            try {
               if (var2 >= this.f.length) {
                  break;
               }
            } catch (Exception var25) {
               var10000 = var25;
               var10001 = false;
               break label207;
            }

            try {
               if (this.f[var2].j && this.f[var2].b > this.f[var2].d - 20) {
                  var1.a(bv.x, this.f[var2].a, this.f[var2].d + 7, 3);
               }
            } catch (Exception var26) {
               var10000 = var26;
               var10001 = false;
               break label207;
            }

            ++var2;
         }

         var2 = 0;

         int var3;
         int var4;
         while(true) {
            label184: {
               label210: {
                  try {
                     if (var2 < this.f.length) {
                        break label184;
                     }

                     if (!this.H) {
                        break;
                     }

                     if (N == null) {
                        break label210;
                     }

                     var4 = af.e().B;
                     var3 = N.a;
                  } catch (Exception var24) {
                     var10000 = var24;
                     var10001 = false;
                     break label207;
                  }

                  var2 = 0;

                  while(true) {
                     try {
                        if (var2 >= main.a.A / N.a + 1) {
                           break;
                        }
                     } catch (Exception var22) {
                        var10000 = var22;
                        var10001 = false;
                        break label207;
                     }

                     try {
                        N.a(this.y, var4 - var3 - 28 - (N.a - 1) * var2, af.e().C - N.b / 2 - 12 + 2, 0, 0, var1);
                     } catch (Exception var21) {
                        var10000 = var21;
                        var10001 = false;
                        break label207;
                     }

                     ++var2;
                  }
               }

               try {
                  if (O != null) {
                     var2 = af.e().B;
                     var3 = O.a;
                     O.a(this.y, var2 - var3 - 10 - 5, af.e().C - O.b / 2 - 12, 0, 0, var1);
                  }
                  break;
               } catch (Exception var20) {
                  var10000 = var20;
                  var10001 = false;
                  break label207;
               }
            }

            try {
               if (this.f[var2].j) {
                  bl.b(var1, this.f[var2].i, this.f[var2].a, this.f[var2].b, 0, 3);
               }
            } catch (Exception var23) {
               var10000 = var23;
               var10001 = false;
               break label207;
            }

            ++var2;
         }

         label156: {
            StringBuffer var29;
            di var30;
            label213: {
               try {
                  p.c(var1);
                  var2 = main.a.A - 240;
                  var1.a(13524492);
                  var1.d(var2, 0, 240, 15);
                  var1.a(g.w, var2 + 11, 8, 3);
                  var1.a(g.y, var2 + 90, 7, 3);
                  di var5 = di.n;
                  StringBuffer var6 = new StringBuffer(String.valueOf(af.e().o));
                  var5.a(var1, var6.toString(), var2 + 24, 2, 0, di.o);
                  var30 = di.n;
                  var29 = new StringBuffer(String.valueOf(af.e().p));
                  var30.a(var1, var29.toString(), var2 + 100, 2, 0, di.o);
                  var1.a(g.z, var2 + 150, 8, 3);
                  var30 = di.n;
                  var29 = new StringBuffer(String.valueOf(af.e().q));
                  var30.a(var1, var29.toString(), var2 + 160, 2, 0, di.o);
                  var1.a(g.x, var2 + 200, 8, 3);
                  var30 = di.n;
                  var29 = new StringBuffer(String.valueOf(this.p));
                  var30.a(var1, var29.toString(), var2 + 210, 2, 0, di.o);
                  if (this.b >= 4) {
                     break label156;
                  }

                  var2 = main.a.A - 140;
                  var1.a(11837316);
                  var1.d(var2, 15, 140, 15);
                  if (this.g == 0) {
                     var1.a(g.w, var2 + 21, 23, 3);
                     break label213;
                  }
               } catch (Exception var19) {
                  var10000 = var19;
                  var10001 = false;
                  break label207;
               }

               try {
                  var1.a(g.z, var2 + 21, 22, 3);
                  var1.a(g.y, var2 + 18, 22, 3);
               } catch (Exception var18) {
                  var10000 = var18;
                  var10001 = false;
                  break label207;
               }
            }

            try {
               var30 = di.p;
               var29 = new StringBuffer("-");
               var30.a(var1, var29.append(this.v).toString(), var2 + 30, 17, 0, di.o);
               var1.a(g.x, var2 + 80, 22, 3);
               var30 = di.p;
               var29 = new StringBuffer("-");
               var30.a(var1, var29.append(this.f()).toString(), var2 + 90, 17, 0, di.o);
            } catch (Exception var17) {
               var10000 = var17;
               var10001 = false;
               break label207;
            }
         }

         try {
            var1.a(p.au, M[0], L, 0);
            if (this.c == 0) {
               var1.a(p.av, M[0], L, 0);
            }
         } catch (Exception var16) {
            var10000 = var16;
            var10001 = false;
            break label207;
         }

         label215: {
            try {
               if (this.b < 3) {
                  bl.b(var1, 540, M[0] + 14, L + 14, 0, cj.f);
                  break label215;
               }
            } catch (Exception var15) {
               var10000 = var15;
               var10001 = false;
               break label207;
            }

            try {
               var1.a(Q, M[0] + 14 - 10, L + 14 - 10, 0);
            } catch (Exception var14) {
               var10000 = var14;
               var10001 = false;
               break label207;
            }
         }

         try {
            var1.a(p.au, M[1], L, 0);
            if (this.c == 1) {
               var1.a(p.av, M[1], L, 0);
            }
         } catch (Exception var13) {
            var10000 = var13;
            var10001 = false;
            break label207;
         }

         label216: {
            try {
               var1.a(P, M[1] + 14 - 10, L + 14 - 10, 0);
               if (this.b <= 3) {
                  break label216;
               }

               cx.c(this.q, this.r, this.s, this.t, var1);
               var3 = main.a.C;
               var4 = this.E.length * 30 / 2;
            } catch (Exception var12) {
               var10000 = var12;
               var10001 = false;
               break label207;
            }

            var2 = 0;

            while(true) {
               try {
                  if (var2 >= this.E.length) {
                     break;
                  }
               } catch (Exception var11) {
                  var10000 = var11;
                  var10001 = false;
                  break label207;
               }

               try {
                  bl.b(var1, this.E[var2], var2 * 30 + var3 - var4 + 5, this.r + 10, 0, 0);
               } catch (Exception var10) {
                  var10000 = var10;
                  var10001 = false;
                  break label207;
               }

               ++var2;
            }
         }

         label218: {
            try {
               if (d) {
                  var1.a(p.av, (M[0] + M[1]) / 2, L, 0);
                  break label218;
               }
            } catch (Exception var9) {
               var10000 = var9;
               var10001 = false;
               break label207;
            }

            try {
               var1.a(p.au, (M[0] + M[1]) / 2, L, 0);
            } catch (Exception var8) {
               var10000 = var8;
               var10001 = false;
               break label207;
            }
         }

         try {
            bl.b(var1, 4387, (M[0] + M[1]) / 2 + 14, L + 14, 0, cj.f);
            return;
         } catch (Exception var7) {
            var10000 = var7;
            var10001 = false;
         }
      }

      Exception var28 = var10000;
      System.out.println("-paint--null: " + var28.toString());
   }

   public final void a(short[] var1) {
      this.b = 3;
      this.E = var1;
   }

   public final void a(short[] var1, byte var2, int var3, short var4) {
      if (var1 != null && var1.length > 0) {
         this.n = af.e().C - 10;
         this.h = main.a.D / 3 + 10;
         if (this.h > 50) {
            this.h = 50;
         }

         this.i = 360;
         p.j = p.n / 2;
         this.j = p.k + main.a.D / 3 + 30;
         this.m = 175;
         this.k = 0;
         this.l = 360 / this.m;
         this.A = new int[this.m];
         this.B = new int[this.m];
         this.C = new int[this.m];
         this.D = new int[this.m];
         int var5;
         if (!main.a.a) {
            for(var5 = 0; var5 < this.B.length; ++var5) {
               this.B[var5] = ds.g(this.h * ds.a(this.k) / 1024);
               this.A[var5] = ds.g(this.h * ds.b(this.k) / 1024);
               if (this.k < 90) {
                  this.C[var5] = this.i + this.A[var5];
                  this.D[var5] = this.j - this.B[var5];
               } else if (this.k >= 90 && this.k < 180) {
                  this.C[var5] = this.i - this.A[var5];
                  this.D[var5] = this.j - this.B[var5];
               } else if (this.k >= 180 && this.k < 270) {
                  this.C[var5] = this.i - this.A[var5];
                  this.D[var5] = this.j + this.B[var5];
               } else {
                  this.C[var5] = this.i + this.A[var5];
                  this.D[var5] = this.j + this.B[var5];
               }

               this.k += this.l;
            }
         }

         this.f = new eb[var1.length];

         for(var5 = 0; var5 < this.f.length; ++var5) {
            this.f[var5] = new eb();
            this.f[var5].i = var1[var5];
            this.f[var5].e = var5 * 25;
            this.f[var5].d = -999;
            this.f[var5].g = ds.b(2, 5);
            this.f[var5].h = ds.b(-1, 2);
            eb var6 = this.f[var5];
            var6.m = new af();
            var6.m.J = ds.b(-999, -800);
            var6.m.bU = -1;
            var6.m.bW = -1;
            var6.m.bV = -1;
            var6.m.bX = -1;
            var6.m.ag = "";
            af var7 = var6.m;
            var6.m.V = 20L;
            var7.U = 20L;
         }

         this.I = false;
         this.H = false;
         this.J = false;
         this.F = main.a.b + (long)ds.b(1000, 2000);
         this.b = 0;
         this.o = -1;
         this.c = -1;
         this.g = var2;
         this.u = var3;
         this.v = 0;
         af.e().b(470, 408, 1);
         af.e().I = -1;
         af.e().H = 1;
         this.w = 0;
         this.x = 0;
         this.y = 0;
         this.z = 0;
         this.r = -this.t;
         this.K = var4;
         this.p = 0;
         this.h();
         this.b();
         bu.a();
      }

   }

   public final void b() {
      p.a = true;
      p.j().bb = true;
      super.b();
   }

   public final void c() {
      int var1 = 0;

      Exception var10000;
      label391: {
         eb var4;
         boolean var10001;
         label385: {
            try {
               this.v = this.u * this.g();
               this.h();
               p.j().c();
               if (this.F - main.a.b <= 0L) {
                  break label385;
               }
            } catch (Exception var43) {
               var10000 = var43;
               var10001 = false;
               break label391;
            }

            while(true) {
               try {
                  if (var1 >= this.f.length) {
                     return;
                  }
               } catch (Exception var6) {
                  var10000 = var6;
                  var10001 = false;
                  break label391;
               }

               try {
                  var4 = this.f[var1];
                  var4.e += 2;
                  if (this.f[var1].e >= this.m) {
                     this.f[var1].e = 0;
                  }
               } catch (Exception var7) {
                  var10000 = var7;
                  var10001 = false;
                  break label391;
               }

               try {
                  this.f[var1].a = this.C[this.f[var1].e];
                  this.f[var1].b = this.D[this.f[var1].e];
               } catch (Exception var5) {
                  var10000 = var5;
                  var10001 = false;
                  break label391;
               }

               ++var1;
            }
         }

         try {
            if (this.b == 0) {
               this.b = 1;
            }
         } catch (Exception var42) {
            var10000 = var42;
            var10001 = false;
            break label391;
         }

         label393: {
            try {
               if (this.b != 1) {
                  break label393;
               }
            } catch (Exception var41) {
               var10000 = var41;
               var10001 = false;
               break label391;
            }

            var1 = 0;

            while(true) {
               try {
                  if (var1 >= this.f.length) {
                     break;
                  }
               } catch (Exception var37) {
                  var10000 = var37;
                  var10001 = false;
                  break label391;
               }

               label368: {
                  label395: {
                     label396: {
                        try {
                           if (this.f[var1].d == -999 || this.f[var1].k) {
                              break label368;
                           }

                           if (this.f[var1].b < this.f[var1].d) {
                              if (this.f[var1].f < 0) {
                                 this.f[var1].f = 0;
                              }
                              break label396;
                           }
                        } catch (Exception var40) {
                           var10000 = var40;
                           var10001 = false;
                           break label391;
                        }

                        try {
                           if (this.f[var1].f > 0) {
                              this.f[var1].f = 0;
                           }
                        } catch (Exception var39) {
                           var10000 = var39;
                           var10001 = false;
                           break label391;
                        }

                        try {
                           var4 = this.f[var1];
                           var4.b += this.f[var1].f;
                           var4 = this.f[var1];
                           --var4.f;
                           break label395;
                        } catch (Exception var34) {
                           var10000 = var34;
                           var10001 = false;
                           break label391;
                        }
                     }

                     label398: {
                        try {
                           if (this.f[var1].b + this.f[var1].f > this.f[var1].d) {
                              this.f[var1].b = this.f[var1].d;
                              break label398;
                           }
                        } catch (Exception var38) {
                           var10000 = var38;
                           var10001 = false;
                           break label391;
                        }

                        try {
                           var4 = this.f[var1];
                           var4.b += this.f[var1].f;
                        } catch (Exception var36) {
                           var10000 = var36;
                           var10001 = false;
                           break label391;
                        }
                     }

                     try {
                        var4 = this.f[var1];
                        ++var4.f;
                     } catch (Exception var35) {
                        var10000 = var35;
                        var10001 = false;
                        break label391;
                     }
                  }

                  try {
                     if (this.f[var1].b == this.f[var1].d) {
                        ea var44 = new ea(19, this.f[var1].a - 5, this.f[var1].b + 25, 2, 1, -1);
                        ei.a(var44);
                        bu.a();
                        this.f[var1].k = true;
                        if (!this.I) {
                           this.I = true;
                        }
                     }
                  } catch (Exception var33) {
                     var10000 = var33;
                     var10001 = false;
                     break label391;
                  }
               }

               ++var1;
            }
         }

         label399: {
            try {
               if (this.b != 2) {
                  break label399;
               }
            } catch (Exception var32) {
               var10000 = var32;
               var10001 = false;
               break label391;
            }

            var1 = 0;

            while(true) {
               try {
                  if (var1 >= this.f.length) {
                     ++this.w;
                     if (this.w > this.R.length - 1) {
                        this.w = this.R.length - 1;
                        this.H = true;
                        bu.a();
                        if (!this.J && this.G - main.a.b < 0L) {
                           bt.a().c((byte)2, (byte)(this.f() + this.g()));
                           this.J = true;
                        }
                     }
                     break;
                  }
               } catch (Exception var30) {
                  var10000 = var30;
                  var10001 = false;
                  break label391;
               }

               label322: {
                  label321: {
                     try {
                        if (this.f[var1].k) {
                           break label322;
                        }

                        if (this.f[var1].b <= -10) {
                           break label321;
                        }

                        if (this.f[var1].f > 0) {
                           this.f[var1].f = 0;
                        }
                     } catch (Exception var31) {
                        var10000 = var31;
                        var10001 = false;
                        break label391;
                     }

                     try {
                        var4 = this.f[var1];
                        var4.b += this.f[var1].f;
                        var4 = this.f[var1];
                        --var4.f;
                        var4 = this.f[var1];
                        var4.a += this.f[var1].g * this.f[var1].h;
                        var4 = this.f[var1];
                        var4.g -= 3;
                     } catch (Exception var28) {
                        var10000 = var28;
                        var10001 = false;
                        break label391;
                     }
                  }

                  try {
                     if (this.f[var1].b == -10) {
                        this.f[var1].j = false;
                     }
                  } catch (Exception var27) {
                     var10000 = var27;
                     var10001 = false;
                     break label391;
                  }
               }

               ++var1;
            }

            try {
               af.e().as = this.R[this.w];
               ++this.x;
               if (this.x > 5) {
                  this.x = 0;
               }
            } catch (Exception var29) {
               var10000 = var29;
               var10001 = false;
               break label391;
            }

            try {
               this.y = this.S[this.x];
            } catch (Exception var26) {
               var10000 = var26;
               var10001 = false;
               break label391;
            }
         }

         label402: {
            try {
               if (this.b != 3) {
                  break label402;
               }

               if (this.x <= 5) {
                  this.x = 5;
               }
            } catch (Exception var25) {
               var10000 = var25;
               var10001 = false;
               break label391;
            }

            label403: {
               try {
                  ++this.x;
                  if (this.x <= this.S.length - 1) {
                     break label403;
                  }

                  this.x = this.S.length - 1;
                  this.b = 4;
                  this.H = false;
               } catch (Exception var22) {
                  var10000 = var22;
                  var10001 = false;
                  break label391;
               }

               var1 = 0;
               int var3 = 0;

               while(true) {
                  try {
                     if (var1 >= this.f.length) {
                        break;
                     }
                  } catch (Exception var21) {
                     var10000 = var21;
                     var10001 = false;
                     break label391;
                  }

                  int var2 = var3;

                  label405: {
                     try {
                        if (!this.f[var1].k) {
                           break label405;
                        }
                     } catch (Exception var24) {
                        var10000 = var24;
                        var10001 = false;
                        break label391;
                     }

                     var2 = var3;

                     try {
                        if (this.f[var1].l) {
                           break label405;
                        }

                        this.f[var1].i = this.E[var3];
                        this.f[var1].l = true;
                     } catch (Exception var23) {
                        var10000 = var23;
                        var10001 = false;
                        break label391;
                     }

                     var2 = var3 + 1;
                  }

                  ++var1;
                  var3 = var2;
               }
            }

            try {
               this.y = this.S[this.x];
            } catch (Exception var20) {
               var10000 = var20;
               var10001 = false;
               break label391;
            }
         }

         label406: {
            try {
               if (this.b != 4) {
                  break label406;
               }
            } catch (Exception var19) {
               var10000 = var19;
               var10001 = false;
               break label391;
            }

            var1 = 0;

            while(true) {
               try {
                  if (var1 >= this.f.length) {
                     this.b = 5;
                     break;
                  }
               } catch (Exception var17) {
                  var10000 = var17;
                  var10001 = false;
                  break label391;
               }

               try {
                  if (this.f[var1].j) {
                     this.f[var1].c = af.e().B;
                  }
               } catch (Exception var18) {
                  var10000 = var18;
                  var10001 = false;
                  break label391;
               }

               ++var1;
            }
         }

         label253: {
            try {
               if (this.b != 5) {
                  return;
               }

               ++this.z;
               if (this.r >= main.a.D / 3) {
                  break label253;
               }

               if (this.r + this.z > main.a.D / 3) {
                  this.r = main.a.D / 3;
                  break label253;
               }
            } catch (Exception var16) {
               var10000 = var16;
               var10001 = false;
               break label391;
            }

            try {
               this.r += this.z;
            } catch (Exception var15) {
               var10000 = var15;
               var10001 = false;
               break label391;
            }
         }

         var1 = 0;

         while(true) {
            label239: {
               label409: {
                  label410: {
                     try {
                        if (var1 >= this.f.length) {
                           return;
                        }

                        if (!this.f[var1].j) {
                           break label239;
                        }

                        if (this.f[var1].a < this.f[var1].c) {
                           if (this.f[var1].g < 0) {
                              this.f[var1].g = 0;
                           }
                           break label410;
                        }
                     } catch (Exception var14) {
                        var10000 = var14;
                        var10001 = false;
                        break;
                     }

                     try {
                        if (this.f[var1].g > 0) {
                           this.f[var1].g = 0;
                        }
                     } catch (Exception var13) {
                        var10000 = var13;
                        var10001 = false;
                        break;
                     }

                     try {
                        var4 = this.f[var1];
                        var4.a += this.f[var1].g;
                        var4 = this.f[var1];
                        --var4.g;
                        break label409;
                     } catch (Exception var9) {
                        var10000 = var9;
                        var10001 = false;
                        break;
                     }
                  }

                  label412: {
                     try {
                        if (this.f[var1].a + this.f[var1].g > this.f[var1].c) {
                           this.f[var1].a = this.f[var1].c;
                           break label412;
                        }
                     } catch (Exception var12) {
                        var10000 = var12;
                        var10001 = false;
                        break;
                     }

                     try {
                        var4 = this.f[var1];
                        var4.a += this.f[var1].g;
                     } catch (Exception var11) {
                        var10000 = var11;
                        var10001 = false;
                        break;
                     }
                  }

                  try {
                     var4 = this.f[var1];
                     ++var4.g;
                  } catch (Exception var10) {
                     var10000 = var10;
                     var10001 = false;
                     break;
                  }
               }

               try {
                  if (this.f[var1].a == this.f[var1].c) {
                     this.f[var1].j = false;
                  }
               } catch (Exception var8) {
                  var10000 = var8;
                  var10001 = false;
                  break;
               }
            }

            ++var1;
         }
      }

      Exception var45 = var10000;
      System.out.println("-upd--null: " + var45.toString());
   }

   public final void d() {
      if (!bp.b) {
         int var1;
         if (main.a.e && !cq.b().b && !main.a.F.a) {
            if (this.b == 1 && main.a.l) {
               for(var1 = 0; var1 < this.f.length; ++var1) {
                  if (main.a.a(this.f[var1].a - 20 - p.j, this.f[var1].b - 10 - p.k, 30, 30) && main.a.l && main.a.m) {
                     this.b(var1);
                  }
               }
            }

            if (main.a.l) {
               for(var1 = 0; var1 < M.length; ++var1) {
                  if (main.a.a(M[var1], L, 36, 36) && main.a.l && main.a.m) {
                     if (d && var1 != 2) {
                        break;
                     }

                     this.c(var1);
                  }
               }
            }
         }

         if (d && !main.a.i[0]) {
            main.a.g();
            main.a.f();
         }

         if (main.a.i[0]) {
            this.c(2);
         }

         for(var1 = 1; var1 < 8; ++var1) {
            if (main.a.i[var1]) {
               main.a.i[var1] = false;
               this.b(var1 - 1);
            }
         }

         if (main.a.i[12]) {
            main.a.i[12] = false;
            this.c(0);
         }

         if (main.a.i[13]) {
            main.a.i[13] = false;
            this.c(1);
         }

         main.a.f();
      }

   }

   public final void e() {
      d = false;
      this.c = -1;
      e = false;
   }
}
