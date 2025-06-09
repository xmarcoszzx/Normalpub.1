import javax.microedition.lcdui.Image;

public final class ch {
   private static int[][] V;
   public static short[][] c;
   private int A;
   private int B;
   private int C;
   private int D;
   private int E;
   private int F;
   private short G;
   private long H;
   private boolean I;
   private af J;
   private bk[] K;
   private bk L;
   private int M;
   private int N;
   private int O;
   private int P;
   private int Q;
   private int[] R;
   private int[] S;
   private int[] T;
   private int[] U;
   private int[] W;
   private int X;
   private int Y;
   private int Z;
   public int a;
   private df[] aa;
   public boolean b;
   private el d = new el("EffectEnd VecEffEnd");
   private df e;
   private byte[] f = new byte[10];
   private byte[] g = new byte[10];
   private int h = 0;
   private int i = 0;
   private int j = 0;
   private int k = 0;
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
   private int w;
   private int x;
   private int y;
   private int z;

   static {
      short[] var20 = new short[]{68, 264, 4};
      short[] var19 = new short[]{66, 280, 4};
      short[] var3 = new short[]{0, 0, 1};
      short[] var5 = new short[]{111, 68, 2};
      short[] var14 = new short[]{90, 68, 2};
      short[] var4 = new short[]{125, 68, 2};
      short[] var7 = new short[]{47, 282, 6};
      short[] var18 = new short[]{92, 525, 7};
      short[] var0 = new short[]{62, 372, 6};
      short[] var6 = new short[]{80, 352, 4};
      short[] var8 = new short[]{80, 352, 4};
      short[] var21 = new short[]{72, 240, 3};
      short[] var15 = new short[]{20, 42, 3};
      short[] var17 = new short[]{65, 160, 4};
      short[] var1 = new short[]{84, 168, 2};
      short[] var9 = new short[]{90, 540, 6};
      short[] var11 = new short[]{180, 900, 6};
      short[] var10 = new short[]{62, 186, 3};
      short[] var22 = new short[]{34, 80, 4};
      short[] var13 = new short[]{140, 560, 4};
      short[] var12 = new short[]{36, 200, 5};
      short[] var2 = new short[]{35, 200, 5};
      short[] var23 = new short[]{50, 250, 5};
      short[] var16 = new short[]{50, 240, 6};
      c = new short[][]{var20, {30, 120, 4}, var19, var3, var5, var14, var4, var7, {10, 40, 4}, var18, var0, var6, var8, {80, 352, 4}, var21, var15, var17, {50, 300, 6}, var1, var9, var11, var10, var22, var13, {64, 600, 6}, var12, var2, var23, var16};
      V = new int[][]{{16310304, 16298056, 16777215}, {7045120, 12643960, 16777215}, {2407423, 11987199, 16777215}};
   }

   public ch(int var1, int var2, int var3, int var4, int var5, int var6, int var7, short var8, bk[] var9) {
      byte[] var10 = new byte[]{12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0, 23, 22, 21, 20, 19, 18, 17, 16, 15, 14, 13};
      var10 = new byte[24];
      var10[2] = 2;
      var10[3] = 1;
      var10[4] = 1;
      var10[5] = 2;
      var10[8] = 2;
      var10[9] = 1;
      var10[10] = 1;
      var10[11] = 2;
      var10[14] = 2;
      var10[15] = 1;
      var10[16] = 1;
      var10[17] = 2;
      var10[20] = 2;
      var10[21] = 1;
      var10[22] = 1;
      var10[23] = 2;
      var10 = new byte[]{2, 2, 3, 3, 3, 4, 5, 5, 5, 5, 5, 1, 0, 0, 0, 0, 0, 7, 6, 6, 6, 6, 6, 2};
      this.X = 0;
      this.u = 0;
      this.E = 0;
      this.i = var1;
      this.j = var2;
      this.h = var3;
      this.o = var4;
      this.p = var5;
      this.a = var6;
      this.s = var7;
      byte var11;
      if (var7 == -1) {
         var11 = 2;
      } else {
         var11 = 0;
      }

      this.t = var11;
      this.H = l.d();
      this.G = var8;
      this.I = false;
      this.b = false;
      this.n = 4;
      if (var9 != null) {
         this.K = new bk[var9.length];

         for(var1 = 0; var1 < this.K.length; ++var1) {
            this.K[var1] = var9[var1];
         }
      }

      this.f();
      this.b();
   }

   public ch(int var1, int var2, int var3, af var4, bk var5, int var6, short var7, short var8) {
      byte[] var9 = new byte[]{12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0, 23, 22, 21, 20, 19, 18, 17, 16, 15, 14, 13};
      var9 = new byte[24];
      var9[2] = 2;
      var9[3] = 1;
      var9[4] = 1;
      var9[5] = 2;
      var9[8] = 2;
      var9[9] = 1;
      var9[10] = 1;
      var9[11] = 2;
      var9[14] = 2;
      var9[15] = 1;
      var9[16] = 1;
      var9[17] = 2;
      var9[20] = 2;
      var9[21] = 1;
      var9[22] = 1;
      var9[23] = 2;
      var9 = new byte[]{2, 2, 3, 3, 3, 4, 5, 5, 5, 5, 5, 1, 0, 0, 0, 0, 0, 7, 6, 6, 6, 6, 6, 2};
      this.X = 0;
      this.u = 0;
      this.E = 0;
      this.i = var1;
      this.j = var2;
      this.h = var3;
      this.J = var4;
      if (var4.b((int)1265)) {
         if (this.i != 21 && this.i != 22 && this.i != 23) {
            if (this.i != 18 && this.i != 19 && this.i != 20) {
               var4 = this.J;
               var4.B += this.J.I * 15;
            } else {
               var4 = this.J;
               var4.B += this.J.I * -15;
            }
         } else {
            var4 = this.J;
            var4.B += this.J.I * 10;
         }
      }

      this.o = this.J.B;
      this.p = this.J.C;
      this.s = this.J.I;
      byte var10;
      if (this.s == -1) {
         var10 = 2;
      } else {
         var10 = 0;
      }

      this.t = var10;
      this.L = var5;
      this.a = var6;
      this.H = l.d();
      this.G = var7;
      this.k = var8;
      this.I = false;
      this.b = false;
      this.n = 4;
      this.f();
      this.b();
   }

   public static Image a(int var0) {
      Image var1 = null;
      if (var0 >= 0) {
         String var2 = "/e/e_" + var0 + ".png";

         Image var4;
         try {
            var4 = l.b(var2);
         } catch (Exception var3) {
            return var1;
         }

         var1 = var4;
      }

      return var1;
   }

   private void a(int var1, int var2, int var3, int var4) {
      if (this.u == -1) {
         this.d.removeAllElements();
      }

      this.W = new int[4];
      var4 = var3;
      if (var3 <= var2) {
         var4 = var2 + 1;
      }

      for(var3 = 0; var3 < 4; ++var3) {
         if (ds.d(2) == 0) {
            this.W[var3] = V[this.X][ds.d(3)];
         } else {
            this.W[var3] = V[this.X][2];
         }
      }

      for(var3 = 0; var3 < 4; ++var3) {
         cm var10 = new cm();
         int var8 = var3 * 45 + 5;
         int var6 = var3 * 45 + 45 - 5;
         int var5 = var6;
         if (var6 <= var8) {
            var5 = var8 + 1;
         }

         int var7 = ds.b(var2, var4);
         var6 = ds.b(var1, var1 + 3);
         var8 = ds.b(var8, var5);
         var5 = ds.b(13, 23);
         boolean var9;
         if (ds.d(4) == 0) {
            var9 = true;
         } else {
            var9 = false;
         }

         var8 = ds.c(var8 % 360);
         var10.a(this.y - ds.a(var8) * (var7 + var5), this.z - ds.b(var8) * (var7 + var5), this.y - ds.a(var8) * var5, this.z - ds.b(var8) * var5, ds.a(var8) * var6, ds.b(var8) * var6, var9);
         this.d.addElement(var10);
         var10 = new cm();
         var8 = ds.c((ds.c(2, 5) + 180 + var8) % 360);
         var10.a(this.y - ds.a(var8) * (var7 + var5), this.z - ds.b(var8) * (var7 + var5), this.y - ds.a(var8) * var5, this.z - ds.b(var8) * var5, ds.a(var8) * var6, ds.b(var8) * var6, var9);
         this.d.addElement(var10);
      }

   }

   private void a(en var1, int var2) {
      this.aa[0].a(this.u / this.n % this.aa[0].c, this.o, this.p, this.s, var2, var1);
   }

   private void a(boolean var1) {
      if (this.K != null) {
         for(int var2 = 0; var2 < this.K.length; ++var2) {
            if (this.K[var2] != null) {
               if (this.K[var2].a == 0) {
                  aa var3 = p.c(this.K[var2].l);
                  if (var3 != null) {
                     var3.M = var1;
                     var3.Y = false;
                     var3.N = this.T[var2];
                     var3.O = this.U[var2];
                  }
               } else {
                  bk var10001 = this.K[var2];
                  af var4;
                  if (af.e().J == var10001.l) {
                     var4 = af.e();
                  } else {
                     var4 = p.b(this.K[var2].l);
                  }

                  if (var4 != null) {
                     var4.dc = var1;
                     var4.bR = false;
                     var4.dd = this.T[var2];
                     var4.de = this.U[var2];
                  }
               }
            }
         }
      }

   }

   private void b() {
      int var1 = 0;

      Exception var10000;
      label302: {
         int var2;
         boolean var10001;
         try {
            var2 = this.o;
            var2 = this.p;
         } catch (Exception var32) {
            var10000 = var32;
            var10001 = false;
            break label302;
         }

         try {
            ds.d(3);
         } catch (Exception var31) {
            Exception var4 = var31;

            try {
               StringBuffer var3 = new StringBuffer("ERR setSoundSkill_END: ");
               ds.b(var3.append(var4.toString()).toString());
            } catch (Exception var30) {
               var10000 = var30;
               var10001 = false;
               break label302;
            }
         }

         byte[] var35;
         label295: {
            label304: {
               label305: {
                  label306: {
                     label291: {
                        label307: {
                           label289: {
                              label308: {
                                 label287: {
                                    try {
                                       switch(this.i) {
                                       case 0:
                                       case 1:
                                       case 2:
                                          break label306;
                                       case 3:
                                          break;
                                       case 4:
                                       case 5:
                                       case 6:
                                       case 7:
                                       case 8:
                                       case 12:
                                       case 13:
                                       case 14:
                                       case 15:
                                       default:
                                          return;
                                       case 9:
                                          break label308;
                                       case 10:
                                       case 11:
                                          break label307;
                                       case 16:
                                       case 17:
                                          break label305;
                                       case 18:
                                       case 19:
                                       case 20:
                                          break label287;
                                       case 21:
                                       case 22:
                                       case 23:
                                          break label289;
                                       case 24:
                                          break label291;
                                       case 25:
                                          break label304;
                                       case 26:
                                          break label295;
                                       }
                                    } catch (Exception var34) {
                                       var10000 = var34;
                                       var10001 = false;
                                       break label302;
                                    }

                                    try {
                                       this.c();
                                       return;
                                    } catch (Exception var22) {
                                       var10000 = var22;
                                       var10001 = false;
                                       break label302;
                                    }
                                 }

                                 label189: {
                                    try {
                                       this.f = null;
                                       this.n = 3;
                                       if (this.i != 18) {
                                          return;
                                       }

                                       if (this.j == 0) {
                                          var35 = new byte[9];
                                          break label189;
                                       }
                                    } catch (Exception var16) {
                                       var10000 = var16;
                                       var10001 = false;
                                       break label302;
                                    }

                                    try {
                                       this.f = new byte[]{3, 3, 3, 4, 4, 4, 5, 5, 5, 6, 6, 6};
                                       return;
                                    } catch (Exception var15) {
                                       var10000 = var15;
                                       var10001 = false;
                                       break label302;
                                    }
                                 }

                                 var35[3] = 1;
                                 var35[4] = 1;
                                 var35[5] = 1;
                                 var35[6] = 2;
                                 var35[7] = 2;
                                 var35[8] = 2;

                                 try {
                                    this.f = var35;
                                    return;
                                 } catch (Exception var14) {
                                    var10000 = var14;
                                    var10001 = false;
                                    break label302;
                                 }
                              }

                              try {
                                 this.X = this.j;
                                 this.y = this.o * 1000;
                                 this.z = this.p * 1000;
                                 this.l = ds.b(4, 6);
                                 this.C = 5;
                                 this.Y = 10;
                                 this.Z = 20;
                                 this.a(this.C, this.Y, this.Z, 0);
                                 return;
                              } catch (Exception var21) {
                                 var10000 = var21;
                                 var10001 = false;
                                 break label302;
                              }
                           }

                           try {
                              if (this.J == null) {
                                 return;
                              }

                              if (this.i == 21) {
                                 this.o = this.J.B - this.J.I * 3;
                                 this.p = this.J.C;
                                 return;
                              }
                           } catch (Exception var29) {
                              var10000 = var29;
                              var10001 = false;
                              break label302;
                           }

                           try {
                              if (this.i == 22) {
                                 this.o = this.J.B + this.J.I * 20;
                                 this.p = this.J.C - 4;
                                 return;
                              }
                           } catch (Exception var28) {
                              var10000 = var28;
                              var10001 = false;
                              break label302;
                           }

                           try {
                              if (this.i == 23) {
                                 this.o = this.J.B;
                                 this.p = this.J.C - 50;
                                 return;
                              }
                           } catch (Exception var33) {
                              var10000 = var33;
                              var10001 = false;
                              break label302;
                           }

                           try {
                              this.o = this.J.B;
                              this.p = this.J.C;
                              return;
                           } catch (Exception var13) {
                              var10000 = var13;
                              var10001 = false;
                              break label302;
                           }
                        }

                        try {
                           this.e();
                           return;
                        } catch (Exception var20) {
                           var10000 = var20;
                           var10001 = false;
                           break label302;
                        }
                     }

                     try {
                        this.q = this.aa[0].a;
                        this.r = this.aa[0].b;
                        this.C = ds.g(this.o - this.L.b);
                        var35 = new byte[6];
                     } catch (Exception var12) {
                        var10000 = var12;
                        var10001 = false;
                        break label302;
                     }

                     var35[3] = 1;
                     var35[4] = 1;
                     var35[5] = 1;

                     try {
                        this.f = var35;
                        this.I = false;
                        return;
                     } catch (Exception var11) {
                        var10000 = var11;
                        var10001 = false;
                        break label302;
                     }
                  }

                  label311: {
                     df var36;
                     label312: {
                        label313: {
                           try {
                              switch(this.i) {
                              case 0:
                                 break;
                              case 1:
                                 break label313;
                              case 2:
                                 break label312;
                              default:
                                 break label311;
                              }
                           } catch (Exception var27) {
                              var10000 = var27;
                              var10001 = false;
                              break label302;
                           }

                           try {
                              var36 = new df(4);
                              this.e = var36;
                              break label311;
                           } catch (Exception var26) {
                              var10000 = var26;
                              var10001 = false;
                              break label302;
                           }
                        }

                        try {
                           var36 = new df(5);
                           this.e = var36;
                           break label311;
                        } catch (Exception var25) {
                           var10000 = var25;
                           var10001 = false;
                           break label302;
                        }
                     }

                     try {
                        var36 = new df(6);
                        this.e = var36;
                     } catch (Exception var24) {
                        var10000 = var24;
                        var10001 = false;
                        break label302;
                     }
                  }

                  try {
                     this.l = 100;
                     this.B = main.a.B / 3 + 10;
                     this.x = 10;
                     this.z = 0;
                     this.I = false;
                     return;
                  } catch (Exception var23) {
                     var10000 = var23;
                     var10001 = false;
                     break label302;
                  }
               }

               label314: {
                  try {
                     if (this.i != 17) {
                        return;
                     }

                     var2 = this.o;
                     if (this.s == 0) {
                        break label314;
                     }
                  } catch (Exception var19) {
                     var10000 = var19;
                     var10001 = false;
                     break label302;
                  }

                  try {
                     var1 = -this.aa[0].a;
                  } catch (Exception var18) {
                     var10000 = var18;
                     var10001 = false;
                     break label302;
                  }
               }

               try {
                  this.o = var1 + var2;
                  this.p -= this.aa[0].b / 2;
                  return;
               } catch (Exception var17) {
                  var10000 = var17;
                  var10001 = false;
                  break label302;
               }
            }

            try {
               this.d();
               return;
            } catch (Exception var10) {
               var10000 = var10;
               var10001 = false;
               break label302;
            }
         }

         try {
            var35 = new byte[9];
         } catch (Exception var9) {
            var10000 = var9;
            var10001 = false;
            break label302;
         }

         var35[3] = 1;
         var35[4] = 1;
         var35[5] = 1;
         var35[6] = 2;
         var35[7] = 2;
         var35[8] = 2;

         label315: {
            try {
               this.f = var35;
               this.I = false;
               this.m = 10;
               this.y = this.o;
               this.z = this.p + 12;
               this.F = 25;
               this.B = 19;
               if (this.j == 1) {
                  this.B = 21;
                  break label315;
               }
            } catch (Exception var8) {
               var10000 = var8;
               var10001 = false;
               break label302;
            }

            try {
               if (this.j == 2) {
                  this.B = 31;
               }
            } catch (Exception var7) {
               var10000 = var7;
               var10001 = false;
               break label302;
            }
         }

         try {
            this.r = this.aa[1].b + 50 - this.B;
            this.x = 1;
            this.A = 1;
            this.p = this.z - this.r;
            this.M = 90;
            this.C = 1;
            this.O = 25;
            this.N = 25;
            this.Q = 1;
            if (this.K != null && this.K.length > 0) {
               this.Q = this.K.length;
            }
         } catch (Exception var6) {
            var10000 = var6;
            var10001 = false;
            break label302;
         }

         try {
            this.P = 360 / this.Q;
            this.R = new int[this.Q];
            this.S = new int[this.Q];
            this.T = new int[this.Q];
            this.U = new int[this.Q];
            p.a(16, 0, this.h, this.y, this.z, 1, 0, (short)-1, (bk[])null);
            return;
         } catch (Exception var5) {
            var10000 = var5;
            var10001 = false;
         }
      }

      Exception var37 = var10000;
      ds.b("ERR create_Effect: " + var37.toString());
      this.b = true;
   }

   private void c() {
      int var3 = ds.b(3, 5);
      this.l = 90;

      for(int var1 = 0; var1 < var3; ++var1) {
         bk var5 = new bk();
         var5.b = this.o + ds.e(4);
         var5.c = this.p + ds.e(5);
         if (this.j == 0) {
            var5.j = ds.d(10);
            byte var2;
            if (var1 % 2 == 0) {
               var2 = -1;
            } else {
               var2 = 1;
            }

            int var4 = this.o;
            var5.b = var2 * ds.d(c[5][0] / 2) + var4;
            var5.c = this.p - ds.d(c[5][1] / 2);
            var5.p = new df(7);
         }

         this.d.addElement(var5);
      }

   }

   private void d() {
      this.o = this.J.B + this.J.I * 20;
      this.m = this.G / 15;
      if (this.L != null) {
         for(int var3 = 0; var3 < 15; ++var3) {
            bk var8 = new bk();
            var8.p = this.aa[0];
            var8.q = this.aa[2];
            var8.b = this.o;
            var8.c = this.p;
            if (this.L != null) {
               var8.g = this.L.b;
               var8.h = this.L.c;
               if (this.k > 0) {
                  var8.g += ds.c(0, this.k);
                  var8.h += ds.c(0, this.k);
               }
            }

            this.C = ds.b(9, 12);
            if (var3 == 14) {
               var8.p = this.aa[1];
               var8.q = this.aa[3];
               var8.g = this.L.b;
               var8.h = this.L.c;
               this.C = 9;
            }

            var8.n = false;
            var8.o = false;
            var8.m = false;
            var8.d = this.C;
            int var6 = var8.g - var8.b;
            int var5 = var8.h - var8.c;
            var8.k = var8.a(ds.a(var6, var5));
            int var1 = ds.d(var6, var5) / var8.d;
            int var2 = var1;
            if (var1 == 0) {
               var2 = 1;
            }

            int var7 = var6 / var2;
            int var4 = var5 / var2;
            var1 = var7;
            if (var7 == 0) {
               var1 = var7;
               if (var6 < var2) {
                  if (var6 < 0) {
                     var1 = -1;
                  } else {
                     var1 = 1;
                  }
               }
            }

            if (var4 == 0 && var5 < var2) {
               if (var5 < 0) {
                  var2 = -1;
               } else {
                  var2 = 1;
               }
            } else {
               var2 = var4;
            }

            var4 = var1;
            if (ds.g(var1) > ds.g(var6)) {
               var4 = var6;
            }

            var1 = var2;
            if (ds.g(var2) > ds.g(var5)) {
               var1 = var5;
            }

            var8.e = var4;
            var8.f = var1;
            this.d.addElement(var8);
         }
      } else {
         this.b = true;
      }

   }

   private void e() {
      this.e = new df(8);
      this.l = ds.b(23, 27);
      int var2 = ds.b(1, 3);
      this.D = this.p - 40;

      for(int var1 = 0; var1 < var2; ++var1) {
         bk var3 = new bk();
         var3.b = this.o + ds.c(0, 20);
         var3.c = this.p + ds.e(7);
         if (this.i == 10) {
            var3.k = ds.b(0, this.e.c - 2);
         } else if (this.i == 11) {
            var3.k = ds.b(2, this.e.c);
         } else {
            var3.k = ds.b(0, this.e.c);
         }

         ds.d(2);
         var3.f = -ds.b(1, 4);
         this.d.addElement(var3);
      }

   }

   private void f() {
      byte var4 = 26;
      byte var3 = 0;
      int[] var5 = null;
      int[] var6 = null;
      byte var1;
      switch(this.i) {
      case 16:
         if (this.j == 0) {
            var5 = new int[]{7};
            var6 = new int[]{28};
         }

         if (this.j == 1) {
            var5 = new int[]{23};
            var6 = new int[]{2};
            var1 = var4;
         } else {
            int[] var7 = var5;
            var1 = var4;
            var5 = var6;
            var6 = var7;
         }
         break;
      case 17:
         var5 = new int[]{16};
         var6 = new int[]{2};
         var1 = 25;
         break;
      case 18:
         var1 = 24;
         var6 = new int[1];
         var5 = new int[]{9};
         break;
      case 19:
         var6 = new int[1];
         var5 = new int[]{14};
         var1 = 25;
         break;
      case 20:
         var6 = new int[1];
         var5 = new int[]{21};
         var1 = var4;
         break;
      case 21:
         var1 = 24;
         var5 = new int[]{10};
         var6 = new int[]{1};
         break;
      case 22:
         var5 = new int[]{15};
         var6 = new int[]{1};
         var1 = 25;
         break;
      case 23:
         var5 = new int[]{22};
         var6 = new int[]{1};
         var1 = var4;
         break;
      case 24:
         var1 = 24;
         var5 = new int[]{11, 12, 13};
         var6 = new int[]{2, 3, 4};
         break;
      case 25:
         var5 = new int[]{17, 18, 19, 20};
         var6 = new int[]{3, 4, 5, 6};
         var1 = 25;
         break;
      case 26:
         byte var2;
         if (this.j == 0) {
            var2 = 4;
            var1 = 25;
         } else if (this.j == 1) {
            var2 = 5;
            var1 = 26;
         } else if (this.j == 2) {
            var2 = 6;
            var1 = 27;
         } else {
            var1 = 0;
            var2 = 0;
         }

         var5 = new int[]{var1, 24};
         var6 = new int[]{var2, 3};
         var1 = var4;
         break;
      default:
         var5 = null;
         var6 = null;
         var1 = 0;
      }

      if (var6 != null && var5 != null) {
         this.aa = new df[var6.length];

         for(int var9 = var3; var9 < var6.length; ++var9) {
            df var8 = l.d("Skills_" + var1 + "_" + this.h + "_" + var6[var9]);
            df var10 = var8;
            if (var8 == null) {
               var10 = new df(var5[var9]);
            }

            if (var10 != null) {
               this.aa[var9] = var10;
            }
         }
      }

   }

   public final void a() {
      byte var3 = 0;
      byte var2 = 0;
      int var1 = 0;

      Exception var10000;
      label839: {
         boolean var10001;
         try {
            ++this.u;
         } catch (Exception var73) {
            var10000 = var73;
            var10001 = false;
            break label839;
         }

         int var87;
         af var88;
         label840: {
            label841: {
               label842: {
                  bk var90;
                  label829: {
                     label843: {
                        label844: {
                           label845: {
                              label846: {
                                 label847: {
                                    try {
                                       switch(this.i) {
                                       case 0:
                                       case 1:
                                       case 2:
                                          break label842;
                                       case 3:
                                          break label843;
                                       case 4:
                                       case 5:
                                       case 6:
                                       case 7:
                                       case 8:
                                       case 12:
                                       case 13:
                                       case 14:
                                       case 15:
                                       default:
                                          return;
                                       case 9:
                                          break label846;
                                       case 10:
                                       case 11:
                                          break label829;
                                       case 16:
                                       case 17:
                                          break label844;
                                       case 18:
                                       case 19:
                                       case 20:
                                          break label841;
                                       case 21:
                                       case 22:
                                       case 23:
                                          break label845;
                                       case 24:
                                          break;
                                       case 25:
                                          break label840;
                                       case 26:
                                          break label847;
                                       }
                                    } catch (Exception var84) {
                                       var10000 = var84;
                                       var10001 = false;
                                       break label839;
                                    }

                                    try {
                                       ++this.w;
                                       this.q += 20;
                                       if (this.q > this.C) {
                                          this.q = this.C;
                                       }
                                    } catch (Exception var67) {
                                       var10000 = var67;
                                       var10001 = false;
                                       break label839;
                                    }

                                    try {
                                       this.o = this.J.B + 10;
                                       this.p = this.J.C - 3;
                                       if (this.s == -1) {
                                          this.o = this.J.B - this.q - 10;
                                       }
                                    } catch (Exception var66) {
                                       var10000 = var66;
                                       var10001 = false;
                                       break label839;
                                    }

                                    try {
                                       if (!this.I && main.a.b - this.H >= (long)this.G) {
                                          this.u = 0;
                                          this.f = new byte[]{2, 2, 2, 3, 3, 3};
                                          this.I = true;
                                       }
                                    } catch (Exception var65) {
                                       var10000 = var65;
                                       var10001 = false;
                                       break label839;
                                    }

                                    try {
                                       if (this.u <= this.f.length - 1) {
                                          return;
                                       }

                                       if (this.I) {
                                          this.b = true;
                                          return;
                                       }
                                    } catch (Exception var74) {
                                       var10000 = var74;
                                       var10001 = false;
                                       break label839;
                                    }

                                    try {
                                       this.u = 0;
                                       return;
                                    } catch (Exception var54) {
                                       var10000 = var54;
                                       var10001 = false;
                                       break label839;
                                    }
                                 }

                                 byte[] var8;
                                 label849: {
                                    try {
                                       if (this.E == 0) {
                                          ++this.v;
                                          if (this.v > this.f.length - 1) {
                                             this.v = this.f.length - 1;
                                          }
                                          break label849;
                                       }
                                    } catch (Exception var40) {
                                       var10000 = var40;
                                       var10001 = false;
                                       break label839;
                                    }

                                    label851: {
                                       try {
                                          if (this.E == 1) {
                                             ++this.w;
                                             if (this.w <= this.g.length - 1) {
                                                return;
                                             }

                                             this.w = this.g.length - 1;
                                             if (main.a.w % 2 == 0) {
                                                ++this.A;
                                             }
                                             break label851;
                                          }
                                       } catch (Exception var39) {
                                          var10000 = var39;
                                          var10001 = false;
                                          break label839;
                                       }

                                       label853: {
                                          try {
                                             if (this.E == 2) {
                                                ++this.w;
                                                if (this.w <= this.g.length - 1) {
                                                   return;
                                                }

                                                this.E = 3;
                                                this.v = 0;
                                                var8 = new byte[17];
                                                break label853;
                                             }
                                          } catch (Exception var38) {
                                             var10000 = var38;
                                             var10001 = false;
                                             break label839;
                                          }

                                          label855: {
                                             try {
                                                if (this.E == 3) {
                                                   ++this.v;
                                                   if (this.v <= this.f.length - 1) {
                                                      return;
                                                   }

                                                   this.v = 0;
                                                   this.E = 4;
                                                   var8 = new byte[51];
                                                   break label855;
                                                }
                                             } catch (Exception var37) {
                                                var10000 = var37;
                                                var10001 = false;
                                                break label839;
                                             }

                                             try {
                                                ++this.v;
                                                if (this.v > this.f.length - 1) {
                                                   this.v = 0;
                                                }
                                             } catch (Exception var36) {
                                                var10000 = var36;
                                                var10001 = false;
                                                break label839;
                                             }

                                             try {
                                                if (main.a.b - this.H >= (long)this.G) {
                                                   p.a(16, 0, this.h, this.y, this.z, 1, 0, (short)-1, (bk[])null);
                                                   this.a(false);
                                                   this.b = true;
                                                }

                                                return;
                                             } catch (Exception var35) {
                                                var10000 = var35;
                                                var10001 = false;
                                                break label839;
                                             }
                                          }

                                          var8[17] = 3;
                                          var8[18] = 3;
                                          var8[19] = 3;
                                          var8[23] = 4;
                                          var8[24] = 4;
                                          var8[25] = 4;
                                          var8[45] = 3;
                                          var8[46] = 3;
                                          var8[49] = 4;
                                          var8[50] = 4;

                                          try {
                                             this.f = var8;
                                             return;
                                          } catch (Exception var34) {
                                             var10000 = var34;
                                             var10001 = false;
                                             break label839;
                                          }
                                       }

                                       var8[0] = 2;
                                       var8[1] = 2;
                                       var8[2] = 1;
                                       var8[3] = 1;
                                       var8[6] = 3;
                                       var8[7] = 3;
                                       var8[8] = 3;
                                       var8[12] = 4;
                                       var8[13] = 4;
                                       var8[14] = 4;

                                       try {
                                          this.f = var8;
                                          return;
                                       } catch (Exception var33) {
                                          var10000 = var33;
                                          var10001 = false;
                                          break label839;
                                       }
                                    }

                                    try {
                                       this.x += this.A;
                                       if (this.x >= this.r - this.aa[0].b - this.F + this.B) {
                                          this.x = this.r - this.aa[0].b - this.F + this.B;
                                          this.u = 0;
                                          this.w = 0;
                                          this.E = 2;
                                          this.g = new byte[]{3, 3, 3, 3, 3, 4, 4, 4, 5, 5, 5};
                                       }

                                       return;
                                    } catch (Exception var32) {
                                       var10000 = var32;
                                       var10001 = false;
                                       break label839;
                                    }
                                 }

                                 try {
                                    if (this.u == this.m + 4) {
                                       p.a(16, 1, this.h, this.o, this.p, 3, 0, (short)2945, (bk[])null);
                                    }
                                 } catch (Exception var31) {
                                    var10000 = var31;
                                    var10001 = false;
                                    break label839;
                                 }

                                 label857: {
                                    try {
                                       if (this.u <= this.m + 4) {
                                          return;
                                       }

                                       --this.M;
                                       if (this.M < 0) {
                                          this.M = 0;
                                          this.u = 0;
                                          this.w = 0;
                                          var8 = new byte[22];
                                          break label857;
                                       }
                                    } catch (Exception var30) {
                                       var10000 = var30;
                                       var10001 = false;
                                       break label839;
                                    }

                                    try {
                                       if (this.C < 40) {
                                          this.C += 2;
                                       }
                                    } catch (Exception var29) {
                                       var10000 = var29;
                                       var10001 = false;
                                       break label839;
                                    }

                                    try {
                                       this.N = this.O;
                                       this.N -= this.C;
                                       if (this.N >= 360) {
                                          this.N -= 360;
                                       }
                                    } catch (Exception var28) {
                                       var10000 = var28;
                                       var10001 = false;
                                       break label839;
                                    }

                                    try {
                                       if (this.N < 0) {
                                          this.N += 360;
                                       }
                                    } catch (Exception var27) {
                                       var10000 = var27;
                                       var10001 = false;
                                       break label839;
                                    }

                                    try {
                                       this.O = this.N;
                                    } catch (Exception var26) {
                                       var10000 = var26;
                                       var10001 = false;
                                       break label839;
                                    }

                                    var1 = var2;

                                    while(true) {
                                       try {
                                          if (var1 >= this.S.length) {
                                             this.a(true);
                                             return;
                                          }
                                       } catch (Exception var21) {
                                          var10000 = var21;
                                          var10001 = false;
                                          break label839;
                                       }

                                       try {
                                          if (this.N >= 360) {
                                             this.N -= 360;
                                          }
                                       } catch (Exception var25) {
                                          var10000 = var25;
                                          var10001 = false;
                                          break label839;
                                       }

                                       try {
                                          if (this.N < 0) {
                                             this.N += 360;
                                          }
                                       } catch (Exception var20) {
                                          var10000 = var20;
                                          var10001 = false;
                                          break label839;
                                       }

                                       label887: {
                                          try {
                                             this.S[var1] = ds.g(this.M * ds.a(this.N) / 1024);
                                             this.R[var1] = ds.g(this.M * ds.b(this.N) / 1024);
                                             if (this.N < 90) {
                                                this.T[var1] = this.o + this.R[var1];
                                                this.U[var1] = this.p - this.S[var1];
                                                break label887;
                                             }
                                          } catch (Exception var24) {
                                             var10000 = var24;
                                             var10001 = false;
                                             break label839;
                                          }

                                          try {
                                             if (this.N >= 90 && this.N < 180) {
                                                this.T[var1] = this.o - this.R[var1];
                                                this.U[var1] = this.p - this.S[var1];
                                                break label887;
                                             }
                                          } catch (Exception var23) {
                                             var10000 = var23;
                                             var10001 = false;
                                             break label839;
                                          }

                                          try {
                                             if (this.N >= 180 && this.N < 270) {
                                                this.T[var1] = this.o - this.R[var1];
                                                this.U[var1] = this.p + this.S[var1];
                                                break label887;
                                             }
                                          } catch (Exception var22) {
                                             var10000 = var22;
                                             var10001 = false;
                                             break label839;
                                          }

                                          try {
                                             this.T[var1] = this.o + this.R[var1];
                                             this.U[var1] = this.p + this.S[var1];
                                          } catch (Exception var19) {
                                             var10000 = var19;
                                             var10001 = false;
                                             break label839;
                                          }
                                       }

                                       try {
                                          this.N -= this.P;
                                       } catch (Exception var18) {
                                          var10000 = var18;
                                          var10001 = false;
                                          break label839;
                                       }

                                       ++var1;
                                    }
                                 }

                                 var8[0] = 1;
                                 var8[1] = 1;
                                 var8[6] = 1;
                                 var8[7] = 1;
                                 var8[8] = 1;
                                 var8[9] = 1;
                                 var8[13] = 1;
                                 var8[14] = 1;
                                 var8[15] = 1;
                                 var8[18] = 1;
                                 var8[19] = 1;
                                 var8[20] = 1;
                                 var8[21] = 2;

                                 label863: {
                                    try {
                                       this.g = var8;
                                       if (this.K == null) {
                                          break label863;
                                       }
                                    } catch (Exception var17) {
                                       var10000 = var17;
                                       var10001 = false;
                                       break label839;
                                    }

                                    var1 = var3;

                                    while(true) {
                                       try {
                                          if (var1 >= this.K.length) {
                                             break;
                                          }
                                       } catch (Exception var14) {
                                          var10000 = var14;
                                          var10001 = false;
                                          break label839;
                                       }

                                       label470: {
                                          aa var89;
                                          label865: {
                                             try {
                                                if (this.K[var1] == null) {
                                                   break label470;
                                                }

                                                if (this.K[var1].a == 0) {
                                                   var89 = p.c(this.K[var1].l);
                                                   break label865;
                                                }
                                             } catch (Exception var16) {
                                                var10000 = var16;
                                                var10001 = false;
                                                break label839;
                                             }

                                             label460: {
                                                try {
                                                   bk var93 = this.K[var1];
                                                   if (af.e().J == var93.l) {
                                                      var88 = af.e();
                                                      break label460;
                                                   }
                                                } catch (Exception var15) {
                                                   var10000 = var15;
                                                   var10001 = false;
                                                   break label839;
                                                }

                                                try {
                                                   var88 = p.b(this.K[var1].l);
                                                } catch (Exception var12) {
                                                   var10000 = var12;
                                                   var10001 = false;
                                                   break label839;
                                                }
                                             }

                                             if (var88 != null) {
                                                try {
                                                   var88.bR = true;
                                                } catch (Exception var11) {
                                                   var10000 = var11;
                                                   var10001 = false;
                                                   break label839;
                                                }
                                             }
                                             break label470;
                                          }

                                          if (var89 != null) {
                                             try {
                                                var89.Y = true;
                                             } catch (Exception var13) {
                                                var10000 = var13;
                                                var10001 = false;
                                                break label839;
                                             }
                                          }
                                       }

                                       ++var1;
                                    }
                                 }

                                 try {
                                    this.E = 1;
                                    return;
                                 } catch (Exception var10) {
                                    var10000 = var10;
                                    var10001 = false;
                                    break label839;
                                 }
                              }

                              var1 = 0;

                              while(true) {
                                 label778: {
                                    try {
                                       if (var1 < this.d.size()) {
                                          break label778;
                                       }

                                       if (this.u < this.l) {
                                          return;
                                       }

                                       if (main.a.b - this.H >= (long)this.G) {
                                          this.d.removeAllElements();
                                          this.b = true;
                                          return;
                                       }
                                    } catch (Exception var82) {
                                       var10000 = var82;
                                       var10001 = false;
                                       break label839;
                                    }

                                    try {
                                       this.l = ds.b(4, 6);
                                       this.u = 0;
                                       this.a(this.C, this.Y, this.Z, 0);
                                       return;
                                    } catch (Exception var60) {
                                       var10000 = var60;
                                       var10001 = false;
                                       break label839;
                                    }
                                 }

                                 label768: {
                                    try {
                                       cm var91 = (cm)this.d.elementAt(var1);
                                       var91.a += var91.e;
                                       var91.c += var91.e;
                                       var91.b += var91.f;
                                       var91.d += var91.f;
                                       ++var91.g;
                                       if (this.u < this.l) {
                                          break label768;
                                       }

                                       this.d.removeElement(var91);
                                    } catch (Exception var81) {
                                       var10000 = var81;
                                       var10001 = false;
                                       break label839;
                                    }

                                    --var1;
                                 }

                                 ++var1;
                              }
                           }

                           label882: {
                              try {
                                 if (this.J == null) {
                                    break label882;
                                 }

                                 if (this.i == 21) {
                                    this.o = this.J.B - this.J.I * 3;
                                    this.p = this.J.C;
                                    break label882;
                                 }
                              } catch (Exception var78) {
                                 var10000 = var78;
                                 var10001 = false;
                                 break label839;
                              }

                              try {
                                 if (this.i == 22) {
                                    this.o = this.J.B + this.J.I * 20;
                                    this.p = this.J.C - 4;
                                    break label882;
                                 }
                              } catch (Exception var77) {
                                 var10000 = var77;
                                 var10001 = false;
                                 break label839;
                              }

                              try {
                                 if (this.i == 23) {
                                    this.o = this.J.B;
                                    this.p = this.J.C - 50;
                                    break label882;
                                 }
                              } catch (Exception var76) {
                                 var10000 = var76;
                                 var10001 = false;
                                 break label839;
                              }

                              try {
                                 this.o = this.J.B;
                                 this.p = this.J.C;
                              } catch (Exception var68) {
                                 var10000 = var68;
                                 var10001 = false;
                                 break label839;
                              }
                           }

                           try {
                              if (this.G > 0) {
                                 if (main.a.b - this.H >= (long)this.G) {
                                    this.b = true;
                                 }

                                 return;
                              }
                           } catch (Exception var75) {
                              var10000 = var75;
                              var10001 = false;
                              break label839;
                           }

                           try {
                              if (this.u >= this.aa[0].c * this.n) {
                                 this.b = true;
                              }

                              return;
                           } catch (Exception var55) {
                              var10000 = var55;
                              var10001 = false;
                              break label839;
                           }
                        }

                        try {
                           if (this.G > 0) {
                              if (main.a.b - this.H >= (long)this.G) {
                                 this.b = true;
                              }

                              return;
                           }
                        } catch (Exception var80) {
                           var10000 = var80;
                           var10001 = false;
                           break label839;
                        }

                        try {
                           if (this.u >= this.aa[0].c * this.n) {
                              this.b = true;
                           }

                           return;
                        } catch (Exception var57) {
                           var10000 = var57;
                           var10001 = false;
                           break label839;
                        }
                     }

                     while(true) {
                        try {
                           if (var1 >= this.d.size()) {
                              if (this.u >= this.l) {
                                 this.b = true;
                              }

                              return;
                           }
                        } catch (Exception var62) {
                           var10000 = var62;
                           var10001 = false;
                           break label839;
                        }

                        label874: {
                           try {
                              var90 = (bk)this.d.elementAt(var1);
                              var90.a();
                              if (var90.i - var90.j <= var90.p.c * 3 - 1) {
                                 break label874;
                              }

                              var90.i = 0;
                              if (this.j != 0) {
                                 break label874;
                              }

                              var90.j = ds.d(10);
                           } catch (Exception var63) {
                              var10000 = var63;
                              var10001 = false;
                              break label839;
                           }

                           byte var86;
                           if (var1 % 2 == 0) {
                              var86 = -1;
                           } else {
                              var86 = 1;
                           }

                           try {
                              var87 = this.o;
                              var90.b = var86 * ds.d(c[5][0] / 2) + var87;
                              var90.c = this.p - ds.d(c[5][1] / 2);
                           } catch (Exception var61) {
                              var10000 = var61;
                              var10001 = false;
                              break label839;
                           }
                        }

                        ++var1;
                     }
                  }

                  var1 = 0;

                  while(true) {
                     try {
                        if (var1 >= this.d.size()) {
                           if (this.u >= this.l) {
                              this.b = true;
                           }

                           return;
                        }
                     } catch (Exception var58) {
                        var10000 = var58;
                        var10001 = false;
                        break label839;
                     }

                     label673: {
                        try {
                           var90 = (bk)this.d.elementAt(var1);
                           var90.a();
                           if (var90.c >= this.D) {
                              break label673;
                           }

                           this.d.removeElementAt(var1);
                        } catch (Exception var59) {
                           var10000 = var59;
                           var10001 = false;
                           break label839;
                        }

                        --var1;
                     }

                     ++var1;
                  }
               }

               try {
                  this.o = main.a.C;
                  this.p = this.z;
                  if (this.u > this.l) {
                     this.b = true;
                  }
               } catch (Exception var72) {
                  var10000 = var72;
                  var10001 = false;
                  break label839;
               }

               try {
                  ++this.x;
                  if (this.x > 15) {
                     this.x = 15;
                  }
               } catch (Exception var71) {
                  var10000 = var71;
                  var10001 = false;
                  break label839;
               }

               try {
                  if (this.z + this.x < this.B) {
                     this.z += this.x;
                     return;
                  }
               } catch (Exception var83) {
                  var10000 = var83;
                  var10001 = false;
                  break label839;
               }

               try {
                  this.z = this.B;
                  if (!this.I) {
                     this.I = true;
                     if (this.j != -1) {
                        p.a(this.j, 0, 0, this.o, this.p, this.a, 0, (short)-1, (bk[])null);
                        return;
                     }
                  }

                  return;
               } catch (Exception var64) {
                  var10000 = var64;
                  var10001 = false;
                  break label839;
               }
            }

            try {
               if (this.J != null) {
                  this.o = this.J.B;
                  this.p = this.J.C + 13;
               }
            } catch (Exception var70) {
               var10000 = var70;
               var10001 = false;
               break label839;
            }

            try {
               if (this.G > 0) {
                  if (main.a.b - this.H >= (long)this.G) {
                     this.b = true;
                  }

                  return;
               }
            } catch (Exception var69) {
               var10000 = var69;
               var10001 = false;
               break label839;
            }

            try {
               if (this.f != null) {
                  if (this.u > this.f.length) {
                     this.b = true;
                  }

                  return;
               }
            } catch (Exception var79) {
               var10000 = var79;
               var10001 = false;
               break label839;
            }

            try {
               if (this.u >= this.aa[0].c * this.n) {
                  this.b = true;
               }

               return;
            } catch (Exception var56) {
               var10000 = var56;
               var10001 = false;
               break label839;
            }
         }

         int var85 = 0;
         var1 = 0;

         while(true) {
            try {
               if (var85 >= this.d.size()) {
                  if (var1 == this.d.size()) {
                     this.b = true;
                  }

                  return;
               }
            } catch (Exception var49) {
               var10000 = var49;
               var10001 = false;
               break;
            }

            bk var9;
            try {
               var9 = (bk)this.d.elementAt(var85);
               if (!var9.n && main.a.b - this.H >= (long)(this.m * var85)) {
                  var9.n = true;
                  p.a(17, 0, this.h, this.J.B, this.J.C - 3, 2, this.t, (short)-1, (bk[])null);
                  this.d.size();
               }
            } catch (Exception var48) {
               var10000 = var48;
               var10001 = false;
               break;
            }

            label654: {
               label878: {
                  int var4;
                  int var5;
                  int var6;
                  label652: {
                     int var7;
                     label651: {
                        label650: {
                           try {
                              if (!var9.n || var9.m) {
                                 break label654;
                              }

                              ++var9.i;
                              if (var9.o) {
                                 break label878;
                              }

                              if (var9.i >= 10 || var85 != this.d.size() - 1 || this.J == null) {
                                 break label652;
                              }

                              var7 = this.J.B;
                              var5 = this.J.am;
                              var6 = this.J.I;
                              var4 = this.J.C;
                              if (this.J.I != 1) {
                                 break label650;
                              }
                           } catch (Exception var53) {
                              var10000 = var53;
                              var10001 = false;
                              break;
                           }

                           var3 = 8;
                           break label651;
                        }

                        var3 = 4;
                     }

                     try {
                        if (!bv.a(var7 - (var5 + 1) * var6, var4, var3)) {
                           var88 = this.J;
                           var88.B -= this.J.I;
                        }
                     } catch (Exception var47) {
                        var10000 = var47;
                        var10001 = false;
                        break;
                     }
                  }

                  try {
                     var6 = var9.g;
                     var5 = var9.h;
                     var87 = var6 - var9.b;
                     var4 = var9.c;
                  } catch (Exception var46) {
                     var10000 = var46;
                     var10001 = false;
                     break;
                  }

                  if (var87 > 1) {
                     try {
                        var9.k = var9.a(ds.a(var87, var5 - var4));
                     } catch (Exception var45) {
                        var10000 = var45;
                        var10001 = false;
                        break;
                     }
                  }

                  label880: {
                     try {
                        if (ds.g(var9.e) > 0 && ds.g(var9.b - var6) >= ds.g(var9.e)) {
                           var9.b += var9.e;
                           break label880;
                        }
                     } catch (Exception var52) {
                        var10000 = var52;
                        var10001 = false;
                        break;
                     }

                     try {
                        var9.b = var6;
                        var9.e = 0;
                     } catch (Exception var44) {
                        var10000 = var44;
                        var10001 = false;
                        break;
                     }
                  }

                  label881: {
                     try {
                        if (ds.g(var9.f) > 0 && ds.g(var9.c - var5) >= ds.g(var9.f)) {
                           var9.c += var9.f;
                           break label881;
                        }
                     } catch (Exception var51) {
                        var10000 = var51;
                        var10001 = false;
                        break;
                     }

                     try {
                        var9.c = var5;
                        var9.f = 0;
                     } catch (Exception var43) {
                        var10000 = var43;
                        var10001 = false;
                        break;
                     }
                  }

                  try {
                     if (var9.b == var9.g) {
                        var9.o = true;
                        var9.i = 0;
                     }
                  } catch (Exception var42) {
                     var10000 = var42;
                     var10001 = false;
                     break;
                  }
               }

               try {
                  if (var9.o && var9.i >= this.n * var9.q.c) {
                     var9.m = true;
                  }
               } catch (Exception var41) {
                  var10000 = var41;
                  var10001 = false;
                  break;
               }
            }

            label612: {
               try {
                  if (!var9.m) {
                     break label612;
                  }
               } catch (Exception var50) {
                  var10000 = var50;
                  var10001 = false;
                  break;
               }

               ++var1;
            }

            ++var85;
         }
      }

      Exception var92 = var10000;
      ds.b("ERR update: " + var92.toString());
      this.b = true;
   }

   public final void a(en var1) {
      Exception var10000;
      label460: {
         boolean var10001;
         try {
            if (this.b || this.u < 0) {
               return;
            }
         } catch (Exception var50) {
            var10000 = var50;
            var10001 = false;
            break label460;
         }

         label461: {
            int var3;
            label462: {
               bk var10;
               int var54;
               label453: {
                  label481: {
                     label464: {
                        label465: {
                           label449: {
                              label466: {
                                 label467: {
                                    label446: {
                                       try {
                                          switch(this.i) {
                                          case 0:
                                          case 1:
                                          case 2:
                                             break;
                                          case 3:
                                             break label446;
                                          case 4:
                                          case 5:
                                          case 6:
                                          case 7:
                                          case 8:
                                          case 12:
                                          case 13:
                                          case 14:
                                          case 15:
                                          default:
                                             return;
                                          case 9:
                                             break label449;
                                          case 10:
                                          case 11:
                                             break label467;
                                          case 16:
                                             break label465;
                                          case 17:
                                             break label481;
                                          case 18:
                                          case 19:
                                          case 20:
                                             break label461;
                                          case 21:
                                          case 22:
                                          case 23:
                                             break label466;
                                          case 24:
                                             break label464;
                                          case 25:
                                             break label453;
                                          case 26:
                                             break label462;
                                          }
                                       } catch (Exception var52) {
                                          var10000 = var52;
                                          var10001 = false;
                                          break label460;
                                       }

                                       try {
                                          if (this.e != null) {
                                             this.e.a(this.u / 5 % this.e.c, this.o, this.p, 0, 33, var1);
                                          }

                                          return;
                                       } catch (Exception var49) {
                                          var10000 = var49;
                                          var10001 = false;
                                          break label460;
                                       }
                                    }

                                    var54 = 0;

                                    while(true) {
                                       try {
                                          if (var54 >= this.d.size()) {
                                             return;
                                          }

                                          var10 = (bk)this.d.elementAt(var54);
                                          if (var10.i - var10.j >= 0 && var10.p != null) {
                                             var10.p.a((var10.i - var10.j) / 3 % var10.p.c, var10.b, var10.c, 0, 3, var1);
                                          }
                                       } catch (Exception var48) {
                                          var10000 = var48;
                                          var10001 = false;
                                          break label460;
                                       }

                                       ++var54;
                                    }
                                 }

                                 var54 = 0;

                                 while(true) {
                                    try {
                                       if (var54 >= this.d.size()) {
                                          return;
                                       }

                                       var10 = (bk)this.d.elementAt(var54);
                                       if (this.e != null) {
                                          this.e.a(var10.k, var10.b, var10.c, 0, 3, var1);
                                       }
                                    } catch (Exception var44) {
                                       var10000 = var44;
                                       var10001 = false;
                                       break label460;
                                    }

                                    ++var54;
                                 }
                              }

                              try {
                                 if (this.aa[0] != null) {
                                    this.aa[0].a(this.u / this.n % this.aa[0].c, this.o, this.p, this.t, 3, var1);
                                 }

                                 return;
                              } catch (Exception var39) {
                                 var10000 = var39;
                                 var10001 = false;
                                 break label460;
                              }
                           }

                           var54 = 0;

                           while(true) {
                              cm var57;
                              try {
                                 if (var54 >= this.d.size()) {
                                    return;
                                 }

                                 var57 = (cm)this.d.elementAt(var54);
                              } catch (Exception var46) {
                                 var10000 = var46;
                                 var10001 = false;
                                 break label460;
                              }

                              if (var57 != null) {
                                 var3 = 0;

                                 try {
                                    if (var54 / 2 < this.W.length) {
                                       var3 = this.W[var54 / 2];
                                    }
                                 } catch (Exception var47) {
                                    var10000 = var47;
                                    var10001 = false;
                                    break label460;
                                 }

                                 try {
                                    var1.a(var3);
                                    var1.a(var57.a / 1000, var57.b / 1000, var57.c / 1000, var57.d / 1000);
                                    if (var57.h) {
                                       var1.a(var57.a / 1000 + 1, var57.b / 1000, var57.c / 1000 + 1, var57.d / 1000);
                                    }
                                 } catch (Exception var45) {
                                    var10000 = var45;
                                    var10001 = false;
                                    break label460;
                                 }
                              }

                              ++var54;
                           }
                        }

                        try {
                           if (this.j == 0) {
                              this.a(var1, 33);
                              return;
                           }
                        } catch (Exception var51) {
                           var10000 = var51;
                           var10001 = false;
                           break label460;
                        }

                        try {
                           this.a(var1, 3);
                           return;
                        } catch (Exception var43) {
                           var10000 = var43;
                           var10001 = false;
                           break label460;
                        }
                     }

                     int var6;
                     int var7;
                     byte var8;
                     int var9;
                     df var11;
                     df var12;
                     df var56;
                     try {
                        if (this.aa == null) {
                           return;
                        }

                        var1.e(this.o, this.p - this.r / 2, this.q, this.r);
                        var56 = this.aa[0];
                        var12 = this.aa[1];
                        var11 = this.aa[2];
                        var8 = this.f[this.u];
                        var7 = this.o;
                        var9 = this.p;
                        var6 = this.C;
                     } catch (Exception var38) {
                        var10000 = var38;
                        var10001 = false;
                        break label460;
                     }

                     boolean var55;
                     if (var56 != null && var11 != null) {
                        try {
                           var54 = var6 - (var56.a + var11.a);
                        } catch (Exception var37) {
                           var10000 = var37;
                           var10001 = false;
                           break label460;
                        }

                        var55 = true;
                     } else {
                        var55 = false;
                        var54 = var6;
                     }

                     if (var54 > 0) {
                        label480: {
                           int var4;
                           label343: {
                              try {
                                 var4 = var54 / var12.a;
                                 if (var54 % var12.a <= 0) {
                                    break label343;
                                 }
                              } catch (Exception var36) {
                                 var10000 = var36;
                                 var10001 = false;
                                 break label460;
                              }

                              ++var4;
                           }

                           int var5;
                           label473: {
                              try {
                                 if (this.s != -1) {
                                    break label473;
                                 }
                              } catch (Exception var35) {
                                 var10000 = var35;
                                 var10001 = false;
                                 break label460;
                              }

                              var5 = 0;

                              while(true) {
                                 if (var5 >= var4) {
                                    break label480;
                                 }

                                 if (var5 == var4 - 1) {
                                    if (var55) {
                                       try {
                                          var54 = var11.a + var7;
                                       } catch (Exception var34) {
                                          var10000 = var34;
                                          var10001 = false;
                                          break label460;
                                       }
                                    } else {
                                       try {
                                          var54 = var7 + var6 - var12.a;
                                       } catch (Exception var33) {
                                          var10000 = var33;
                                          var10001 = false;
                                          break label460;
                                       }
                                    }
                                 } else if (var55) {
                                    try {
                                       var54 = var11.a + var7 + var12.a + var12.a * var5;
                                    } catch (Exception var32) {
                                       var10000 = var32;
                                       var10001 = false;
                                       break label460;
                                    }
                                 } else {
                                    try {
                                       var54 = var12.a * var5 + var7;
                                    } catch (Exception var31) {
                                       var10000 = var31;
                                       var10001 = false;
                                       break label460;
                                    }
                                 }

                                 try {
                                    var12.a(var8, var54, var9 - var12.b / 2, 2, 0, var1);
                                 } catch (Exception var30) {
                                    var10000 = var30;
                                    var10001 = false;
                                    break label460;
                                 }

                                 ++var5;
                              }
                           }

                           for(var5 = 0; var5 < var4; ++var5) {
                              if (var5 == var4 - 1) {
                                 if (var55) {
                                    try {
                                       var54 = var7 + var6 - (var12.a + var11.a);
                                    } catch (Exception var29) {
                                       var10000 = var29;
                                       var10001 = false;
                                       break label460;
                                    }
                                 } else {
                                    try {
                                       var54 = var7 + var6 - var12.a;
                                    } catch (Exception var28) {
                                       var10000 = var28;
                                       var10001 = false;
                                       break label460;
                                    }
                                 }
                              } else if (var55) {
                                 try {
                                    var54 = var12.a * var5 + var7 + var56.a;
                                 } catch (Exception var27) {
                                    var10000 = var27;
                                    var10001 = false;
                                    break label460;
                                 }
                              } else {
                                 try {
                                    var54 = var12.a * var5 + var7;
                                 } catch (Exception var26) {
                                    var10000 = var26;
                                    var10001 = false;
                                    break label460;
                                 }
                              }

                              try {
                                 var12.a(var8, var54, var9 - var12.b / 2, 0, 0, var1);
                              } catch (Exception var25) {
                                 var10000 = var25;
                                 var10001 = false;
                                 break label460;
                              }
                           }
                        }
                     }

                     label476: {
                        label477: {
                           try {
                              if (this.s == -1) {
                                 break label477;
                              }
                           } catch (Exception var24) {
                              var10000 = var24;
                              var10001 = false;
                              break label460;
                           }

                           if (var56 != null) {
                              try {
                                 var56.a(var8, var7, var9 - var56.b / 2, 0, 0, var1);
                              } catch (Exception var21) {
                                 var10000 = var21;
                                 var10001 = false;
                                 break label460;
                              }
                           }

                           if (var11 != null) {
                              try {
                                 var11.a(var8, var7 + var6 - var11.a - 1, var9 - var11.b / 2, 0, 0, var1);
                              } catch (Exception var20) {
                                 var10000 = var20;
                                 var10001 = false;
                                 break label460;
                              }
                           }
                           break label476;
                        }

                        if (var56 != null) {
                           try {
                              var56.a(var8, var7 + var6 - var56.a, var9 - var56.b / 2, 2, 0, var1);
                           } catch (Exception var23) {
                              var10000 = var23;
                              var10001 = false;
                              break label460;
                           }
                        }

                        if (var11 != null) {
                           try {
                              var11.a(var8, var7, var9 - var11.b / 2, 2, 0, var1);
                           } catch (Exception var22) {
                              var10000 = var22;
                              var10001 = false;
                              break label460;
                           }
                        }
                     }

                     try {
                        main.a.b(var1);
                        if (this.s == -1 && this.aa[0] != null) {
                           this.aa[0].a(this.f[this.u], this.o + this.q - this.aa[0].a, this.p - this.aa[0].b / 2 - 1, 2, 0, var1);
                        }

                        return;
                     } catch (Exception var19) {
                        var10000 = var19;
                        var10001 = false;
                        break label460;
                     }
                  }

                  try {
                     this.a(var1, 0);
                     return;
                  } catch (Exception var42) {
                     var10000 = var42;
                     var10001 = false;
                     break label460;
                  }
               }

               var54 = 0;

               while(true) {
                  label271: {
                     try {
                        if (var54 >= this.d.size()) {
                           return;
                        }

                        var10 = (bk)this.d.elementAt(var54);
                        if (!var10.n || var10.m) {
                           break label271;
                        }

                        if (!var10.o) {
                           var10.a(var1, var10.p, 3, false);
                        }
                     } catch (Exception var18) {
                        var10000 = var18;
                        var10001 = false;
                        break label460;
                     }

                     try {
                        if (var10.o) {
                           var10.q.a(var10.i / this.n % var10.q.c, var10.b, var10.c, this.t, 3, var1);
                        }
                     } catch (Exception var17) {
                        var10000 = var17;
                        var10001 = false;
                        break label460;
                     }
                  }

                  ++var54;
               }
            }

            try {
               if (this.aa == null) {
                  return;
               }

               if (this.f != null) {
                  this.aa[0].a(this.f[this.v], this.y, this.z, 0, 33, var1);
               }
            } catch (Exception var16) {
               var10000 = var16;
               var10001 = false;
               break label460;
            }

            try {
               if (this.E != 1 && this.E != 2) {
                  return;
               }
            } catch (Exception var15) {
               var10000 = var15;
               var10001 = false;
               break label460;
            }

            byte var2 = 33;

            label482: {
               label248:
               try {
                  var3 = this.F;
                  if (this.g[this.w] == 0 || this.g[this.w] == 1) {
                     break label248;
                  }
                  break label482;
               } catch (Exception var14) {
                  var10000 = var14;
                  var10001 = false;
                  break label460;
               }

               var2 = 3;
               var3 = 0;
            }

            try {
               this.aa[1].a(this.g[this.w], this.o, var3 + this.p + this.x, 0, var2, var1);
               return;
            } catch (Exception var13) {
               var10000 = var13;
               var10001 = false;
               break label460;
            }
         }

         try {
            if (this.aa[0] == null) {
               return;
            }

            if (this.f != null) {
               this.aa[0].a(this.f[this.u % this.f.length], this.o, this.p, this.t, 33, var1);
               return;
            }
         } catch (Exception var41) {
            var10000 = var41;
            var10001 = false;
            break label460;
         }

         try {
            this.aa[0].a(this.u / this.n % this.aa[0].c, this.o, this.p, this.t, 33, var1);
            return;
         } catch (Exception var40) {
            var10000 = var40;
            var10001 = false;
         }
      }

      Exception var53 = var10000;
      ds.b(var53.toString());
      this.b = true;
   }
}
