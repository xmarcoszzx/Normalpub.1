import javax.microedition.lcdui.Image;

public final class ed {
   private static Image A;
   private static Image B;
   private static Image C;
   private static int L = 16;
   private static Image M = l.b("/mainImage/myTexture2dwater1.png");
   private static Image N = l.b("/mainImage/myTexture2dwater2.png");
   private static Image O;
   private static Image P;
   private static Image Q = null;
   private static boolean R;
   private static Image S;
   private static Image T;
   private static int U;
   private static int V;
   private static int W;
   public static el a = new el("vBG Effect");
   public static short c;
   public static boolean d;
   public static int e;
   public static int f;
   private static int[] k;
   private static Image v;
   private static Image w;
   private static Image x;
   private static Image y;
   private static Image z;
   private int[] D;
   private int E;
   private boolean[] F;
   private int[] G;
   private int[] H;
   private boolean[] I;
   private int J;
   private int K;
   private int[] X;
   private int[] Y;
   public int b;
   private int[] g;
   private int[] h;
   private int[] i;
   private int[] j;
   private int l;
   private int m;
   private int n;
   private int o;
   private int p;
   private int q;
   private int r;
   private int s;
   private int t;
   private boolean u;

   private ed(int var1) {
      int[] var3 = new int[]{0, 1, 2, 1, 0, 0};
      this.X = var3;
      this.b = var1;
      switch(this.b) {
      case 0:
      case 12:
         if (v == null) {
            v = l.a("/bg/mua.png");
         }

         if (w == null) {
            w = l.a("/bg/mua1.png");
         }

         if (x == null) {
            x = l.a("/bg/mua2.png");
         }

         this.E = ds.b(main.a.A / 3, main.a.A / 2);
         this.g = new int[this.E];
         this.h = new int[this.E];
         this.i = new int[this.E];
         this.j = new int[this.E];
         this.D = new int[this.E];
         this.H = new int[this.E];
         this.G = new int[this.E];
         this.F = new boolean[this.E];
         this.I = new boolean[this.E];

         for(var1 = 0; var1 < this.E; ++var1) {
            this.h[var1] = ds.b(-10, main.a.B + 100) + p.k;
            this.g[var1] = ds.b(-10, main.a.A + 300) + p.j;
            this.H[var1] = ds.b(0, 1);
            this.i[var1] = -12;
            this.j[var1] = 12;
            this.D[var1] = ds.b(1, 3);
            this.F[var1] = false;
            if (this.D[var1] == 2 && var1 % 2 == 0) {
               this.F[var1] = true;
            }

            this.I[var1] = false;
            this.G[var1] = ds.b(1, 2);
         }

         return;
      case 1:
      case 2:
      case 5:
      case 6:
      case 7:
      case 11:
      case 15:
         if (this.b == 1) {
            z = l.a("/bg/lacay.png");
            L = 10;
         }

         if (this.b == 2) {
            z = l.a("/bg/lacay2.png");
            L = 18;
         }

         if (this.b == 5) {
            z = l.a("/bg/lacay3.png");
            L = 14;
         }

         if (this.b == 6) {
            z = l.a("/bg/lacay4.png");
            L = 14;
         }

         if (this.b == 7) {
            z = l.a("/bg/lacay5.png");
            L = 12;
         }

         if (this.b == 11) {
            z = l.a("/bg/tuyet.png");
         }

         if (this.b == 15) {
            if (bl.c[11120] == null) {
               bl.a(11120);
            }

            L = 16;
         }

         this.E = ds.b(15, 25);
         if (this.b == 11) {
            this.E = 100;
         }

         this.g = new int[this.E];
         this.h = new int[this.E];
         this.i = new int[this.E];
         this.j = new int[this.E];
         this.H = new int[this.E];
         this.G = new int[this.E];
         this.I = new boolean[this.E];

         for(var1 = 0; var1 < this.E; ++var1) {
            this.g[var1] = ds.b(-10, bv.c + 10);
            this.h[var1] = ds.b(0, bv.d);
            this.G[var1] = ds.b(0, 1);
            this.H[var1] = ds.b(0, 1);
            this.i[var1] = ds.b(-3, 3);
            this.j[var1] = ds.b(1, 4);
            if (this.b == 11) {
               this.G[var1] = ds.b(0, 2);
               this.i[var1] = ds.g(ds.b(1, 3));
               this.j[var1] = ds.g(ds.b(1, 3));
            }

            if (this.b == 15) {
               this.G[var1] = ds.b(0, 2);
               this.i[var1] = ds.g(ds.b(1, 3));
               this.j[var1] = ds.g(ds.b(1, 3));
            }
         }

         return;
      case 3:
         main.a.ac = true;
         break;
      case 4:
         this.E = ds.b(5, 10);
         if (y == null) {
            y = l.a("/bg/sao.png");
         }

         this.g = new int[this.E];
         this.h = new int[this.E];
         this.G = new int[this.E];
         this.H = new int[this.E];
         this.Y = new int[this.E];

         for(var1 = 0; var1 < this.E; ++var1) {
            this.g[var1] = ds.b(0, main.a.A);
            this.h[var1] = ds.b(0, 50);
            if (var1 % 2 == 0) {
               this.Y[var1] = 0;
            } else if (var1 % 3 == 0) {
               this.Y[var1] = 1;
            } else if (var1 % 4 == 0) {
               this.Y[var1] = 2;
            } else {
               this.Y[var1] = 3;
            }

            this.H[var1] = ds.b(0, 10);
         }

         return;
      case 8:
         this.s = ds.b(100, 300);
         if (A == null) {
            A = l.a("/bg/ship.png");
         }

         if (B == null) {
            B = l.a("/bg/fire1.png");
         }

         if (C == null) {
            C = l.a("/bg/fire2.png");
         }

         this.u = false;
         this.e();
         break;
      case 9:
         if (O == null) {
            O = l.a("/bg/cham-tron1.png");
         }

         if (P == null) {
            P = l.a("/bg/cham-tron2.png");
         }

         this.l = 20;
         this.g = new int[this.l];
         this.h = new int[this.l];
         k = new int[this.l];
         this.i = new int[this.l];

         for(var1 = 0; var1 < this.l; ++var1) {
            this.g[var1] = ds.g(ds.b(0, main.a.A));
            this.h[var1] = ds.g(ds.b(10, 80));
            k[var1] = ds.g(ds.b(1, 3));
            this.i[var1] = k[var1];
         }

         return;
      case 10:
         this.l = 30;
         this.g = new int[this.l];
         this.h = new int[this.l];
         k = new int[this.l];
         this.i = new int[this.l];
         var1 = 0;

         for(int var2 = 0; var1 < this.l; ++var1) {
            this.g[var1] = ds.g(ds.b(0, main.a.A)) + p.j;
            ++var2;
            if (var2 > this.l / 2) {
               this.h[var1] = ds.g(ds.b(20, 60));
               k[var1] = 10;
            } else {
               this.h[var1] = ds.g(ds.b(0, 20));
               k[var1] = 7;
            }

            this.i[var1] = k[var1] / 2 - 2;
         }

         return;
      case 13:
         if (ds.g(ds.b(0, 2)) == 0) {
            if (ds.g(ds.b(0, 2)) == 0) {
               R = true;
            } else {
               R = false;
            }

            e = ds.g(ds.b(2, 5));
            d();
         }
         break;
      case 14:
         if (ds.g(ds.b(0, 2)) == 0) {
            d = true;
            d();
         }
      }

   }

   public static void a() {
      bv.H = 0;
   }

   public static void a(int var0) {
      if (!main.a.a) {
         ed var1 = new ed(var0);
         a.addElement(var1);
      }

   }

   public static void a(int var0, int var1) {
      ed var2 = new ed(10);
      var2.K = var0;
      var2.J = var1;
      a.addElement(var2);
   }

   public static void a(en var0) {
      if (l.c != 1 && !main.a.a && d && T != null) {
         for(int var1 = V; var1 < bv.c; var1 += W) {
            if (var1 >= p.j - W) {
               var0.a(T, (float)var1, (float)f, 0);
            }
         }
      }

   }

   public static void b(en var0) {
      for(int var1 = 0; var1 < a.size(); ++var1) {
         ed var4 = (ed)a.elementAt(var1);
         if (var4.b == 10) {
            var0.a(var4.K);

            int var2;
            for(var2 = 0; var2 < var4.l; ++var2) {
               Image var3;
               if (var2 < var4.l / 2) {
                  var3 = N;
               } else {
                  var3 = M;
               }

               var0.a(var3, var4.g[var2], var4.h[var2] + var4.J, 0);
            }

            if (c != 0 && Q == null) {
               Q = bl.c[c].a;
            }

            if (Q != null) {
               for(var2 = 0; var2 < var4.l / 2; ++var2) {
                  var0.a(Q, var4.g[var2], var4.h[var2] + var4.J, 0);
               }
            }
         }
      }

   }

   public static boolean b() {
      boolean var1 = false;

      for(int var0 = 0; var0 < a.size(); ++var0) {
         ed var2 = (ed)a.elementAt(var0);
         if (var2.b == 0 || var2.b == 12) {
            var1 = true;
            break;
         }
      }

      return var1;
   }

   public static void c() {
      label491:
      for(int var0 = 0; var0 < a.size(); ++var0) {
         ed var5 = (ed)a.elementAt(var0);

         int var1;
         int[] var6;
         boolean var10001;
         int var10002;
         label497: {
            int var2;
            label498: {
               label499: {
                  label500: {
                     label501: {
                        label481: {
                           label502: {
                              try {
                                 switch(var5.b) {
                                 case 0:
                                 case 12:
                                    break;
                                 case 1:
                                 case 2:
                                 case 5:
                                 case 6:
                                 case 7:
                                 case 11:
                                 case 15:
                                    break label500;
                                 case 3:
                                 default:
                                    continue;
                                 case 4:
                                    break label497;
                                 case 8:
                                    break label499;
                                 case 9:
                                    break label481;
                                 case 10:
                                    break label501;
                                 case 13:
                                    break label498;
                                 case 14:
                                    break label502;
                                 }
                              } catch (Exception var46) {
                                 var10001 = false;
                                 continue;
                              }

                              var1 = 0;

                              while(true) {
                                 try {
                                    if (var1 >= var5.E) {
                                       continue label491;
                                    }
                                 } catch (Exception var38) {
                                    var10001 = false;
                                    continue label491;
                                 }

                                 if (var1 % 3 != 0) {
                                    try {
                                       if (var5.b != 12 && bv.a(var5.g[var1], var5.h[var1] - main.a.ae, 2)) {
                                          var5.I[var1] = true;
                                       }
                                    } catch (Exception var37) {
                                       var10001 = false;
                                       continue label491;
                                    }
                                 }

                                 if (var1 % 3 == 0) {
                                    try {
                                       if (var5.h[var1] > main.a.B + p.k) {
                                          var5.g[var1] = ds.b(-10, main.a.A + 300) + p.j;
                                          var5.h[var1] = ds.b(-100, 0) + p.k;
                                       }
                                    } catch (Exception var36) {
                                       var10001 = false;
                                       continue label491;
                                    }
                                 }

                                 try {
                                    if (!var5.I[var1]) {
                                       var6 = var5.h;
                                       var6[var1] += var5.j[var1];
                                       var6 = var5.g;
                                       var6[var1] += var5.i[var1];
                                    }
                                 } catch (Exception var35) {
                                    var10001 = false;
                                    continue label491;
                                 }

                                 label504: {
                                    try {
                                       if (!var5.I[var1]) {
                                          break label504;
                                       }

                                       var6 = var5.H;
                                    } catch (Exception var40) {
                                       var10001 = false;
                                       continue label491;
                                    }

                                    var10002 = var6[var1]++;

                                    try {
                                       if (var5.H[var1] <= 2) {
                                          break label504;
                                       }

                                       var6 = var5.G;
                                    } catch (Exception var39) {
                                       var10001 = false;
                                       continue label491;
                                    }

                                    var10002 = var6[var1]++;

                                    try {
                                       var5.H[var1] = 0;
                                       if (var5.G[var1] > 1) {
                                          var5.G[var1] = 0;
                                          var5.I[var1] = false;
                                          var5.g[var1] = ds.b(-10, main.a.A + 300) + p.j;
                                          var5.h[var1] = ds.b(-100, 0) + p.k;
                                       }
                                    } catch (Exception var34) {
                                       var10001 = false;
                                       continue label491;
                                    }
                                 }

                                 ++var1;
                              }
                           }

                           try {
                              if (l.c != 1 && !main.a.a && d) {
                                 var1 = V - 1;
                                 V = var1;
                                 if (var1 < -W) {
                                    V = 0;
                                 }
                              }
                           } catch (Exception var8) {
                              var10001 = false;
                           }
                           continue;
                        }

                        var1 = 0;

                        while(true) {
                           try {
                              if (var1 >= var5.l) {
                                 continue label491;
                              }

                              var6 = var5.g;
                              var6[var1] -= var5.i[var1];
                              if (var5.g[var1] < -var5.i[var1]) {
                                 k[var1] = ds.g(ds.b(1, 3));
                                 var5.i[var1] = k[var1];
                                 var5.g[var1] = main.a.A + var5.i[var1];
                              }
                           } catch (Exception var14) {
                              var10001 = false;
                              continue label491;
                           }

                           ++var1;
                        }
                     }

                     var1 = 0;

                     while(true) {
                        try {
                           if (var1 >= var5.l) {
                              continue label491;
                           }

                           var6 = var5.g;
                           var6[var1] -= var5.i[var1];
                           if (var5.g[var1] < -var5.i[var1] + p.j) {
                              var5.g[var1] = main.a.A + var5.i[var1] + p.j;
                           }
                        } catch (Exception var13) {
                           var10001 = false;
                           continue label491;
                        }

                        ++var1;
                     }
                  }

                  var1 = 0;

                  while(true) {
                     try {
                        if (var1 >= var5.E) {
                           continue label491;
                        }
                     } catch (Exception var26) {
                        var10001 = false;
                        continue label491;
                     }

                     int var3;
                     int var4;
                     byte var47;
                     if (var1 % 3 != 0) {
                        label398: {
                           label397: {
                              try {
                                 var3 = var5.g[var1];
                                 var4 = var5.h[var1];
                                 if (bv.e == 15) {
                                    break label397;
                                 }
                              } catch (Exception var33) {
                                 var10001 = false;
                                 continue label491;
                              }

                              var47 = 0;
                              break label398;
                           }

                           var47 = 10;
                        }

                        try {
                           if (bv.a(var3, var47 + var4, 2)) {
                              var5.I[var1] = true;
                           }
                        } catch (Exception var25) {
                           var10001 = false;
                           continue label491;
                        }
                     }

                     if (var1 % 3 == 0) {
                        try {
                           if (var5.h[var1] > bv.d) {
                              var5.g[var1] = ds.b(-10, bv.c + 50);
                              var5.h[var1] = ds.b(-50, 0);
                           }
                        } catch (Exception var24) {
                           var10001 = false;
                           continue label491;
                        }
                     }

                     label508: {
                        label509: {
                           try {
                              if (!var5.I[var1]) {
                                 break label509;
                              }
                           } catch (Exception var32) {
                              var10001 = false;
                              continue label491;
                           }

                           try {
                              var6 = var5.H;
                           } catch (Exception var22) {
                              var10001 = false;
                              continue label491;
                           }

                           var10002 = var6[var1]++;

                           try {
                              if (var5.H[var1] == 100) {
                                 var5.H[var1] = 0;
                                 var5.g[var1] = ds.b(-10, bv.c + 50);
                                 var5.h[var1] = ds.b(-50, 0);
                                 var5.I[var1] = false;
                              }
                              break label508;
                           } catch (Exception var21) {
                              var10001 = false;
                              continue label491;
                           }
                        }

                        var2 = 0;

                        while(true) {
                           try {
                              if (var2 >= cn.a.size()) {
                                 var6 = var5.h;
                                 var6[var1] += var5.j[var1];
                                 var6 = var5.g;
                                 var6[var1] += var5.i[var1];
                                 var6 = var5.H;
                                 break;
                              }
                           } catch (Exception var31) {
                              var10001 = false;
                              continue label491;
                           }

                           cn var7;
                           try {
                              var7 = (cn)cn.a.elementAt(var2);
                           } catch (Exception var23) {
                              var10001 = false;
                              continue label491;
                           }

                           if (var7 != null) {
                              label511: {
                                 try {
                                    if (!var7.e || var5.g[var1] >= var7.b + 80 || var5.g[var1] <= var7.b - 80 || var5.h[var1] >= var7.c + 80 || var5.h[var1] <= var7.c - 80) {
                                       break label511;
                                    }

                                    var6 = var5.g;
                                 } catch (Exception var30) {
                                    var10001 = false;
                                    continue label491;
                                 }

                                 var4 = var6[var1];

                                 byte var48;
                                 label358: {
                                    label357: {
                                       try {
                                          if (var5.g[var1] < var7.b) {
                                             break label357;
                                          }
                                       } catch (Exception var29) {
                                          var10001 = false;
                                          continue label491;
                                       }

                                       var48 = 10;
                                       break label358;
                                    }

                                    var48 = -10;
                                 }

                                 var6[var1] = var48 + var4;
                              }
                           }

                           ++var2;
                        }

                        var10002 = var6[var1]++;

                        label348: {
                           label347: {
                              try {
                                 var3 = var5.H[var1];
                                 if (var5.b != 2) {
                                    break label347;
                                 }
                              } catch (Exception var28) {
                                 var10001 = false;
                                 continue label491;
                              }

                              var47 = 4;
                              break label348;
                           }

                           var47 = 2;
                        }

                        if (var3 > var47) {
                           label340: {
                              try {
                                 if (var5.b == 11 || var5.b == 15) {
                                    break label340;
                                 }

                                 var6 = var5.G;
                              } catch (Exception var27) {
                                 var10001 = false;
                                 continue label491;
                              }

                              var10002 = var6[var1]++;
                           }

                           try {
                              var5.H[var1] = 0;
                              if (var5.G[var1] > 3) {
                                 var5.G[var1] = 0;
                              }
                           } catch (Exception var20) {
                              var10001 = false;
                              continue label491;
                           }
                        }
                     }

                     ++var1;
                  }
               }

               try {
                  ++var5.r;
                  if (var5.r == 3) {
                     var5.r = 0;
                     ++var5.q;
                     if (var5.q > 1) {
                        var5.q = 0;
                     }
                  }
               } catch (Exception var43) {
                  var10001 = false;
                  continue;
               }

               try {
                  if (main.a.w % var5.s == 0) {
                     var5.u = true;
                  }
               } catch (Exception var42) {
                  var10001 = false;
                  continue;
               }

               try {
                  if (!var5.u) {
                     continue;
                  }

                  if (var5.o == 1) {
                     var5.m += var5.t;
                     if (var5.m > bv.c + 50) {
                        var5.e();
                     }
                     continue;
                  }
               } catch (Exception var45) {
                  var10001 = false;
                  continue;
               }

               try {
                  if (var5.o == 2) {
                     var5.m -= var5.t;
                     if (var5.m < -50) {
                        var5.e();
                     }
                     continue;
                  }
               } catch (Exception var41) {
                  var10001 = false;
                  continue;
               }

               try {
                  if (var5.o == 3) {
                     var5.n += var5.t;
                     if (var5.n > bv.d + 50) {
                        var5.e();
                     }
                     continue;
                  }
               } catch (Exception var44) {
                  var10001 = false;
                  continue;
               }

               try {
                  if (var5.o == 4) {
                     var5.n -= var5.t;
                     if (var5.n < -50) {
                        var5.e();
                     }
                  }
               } catch (Exception var15) {
                  var10001 = false;
               }
               continue;
            }

            label290: {
               try {
                  if (l.c == 1 || main.a.a || e <= 0) {
                     continue;
                  }

                  if (main.a.E == p.j()) {
                     var1 = bv.c;
                     break label290;
                  }
               } catch (Exception var12) {
                  var10001 = false;
                  continue;
               }

               try {
                  var1 = p.j + main.a.A;
               } catch (Exception var11) {
                  var10001 = false;
                  continue;
               }
            }

            var2 = 0;

            while(true) {
               int[] var49;
               try {
                  if (var2 >= e) {
                     continue label491;
                  }

                  var49 = main.a.aa;
               } catch (Exception var9) {
                  var10001 = false;
                  continue label491;
               }

               var49[var2] -= var2 + 1;

               try {
                  if (main.a.aa[var2] < -U) {
                     main.a.aa[var2] = var1 + 100;
                  }
               } catch (Exception var10) {
                  var10001 = false;
                  continue label491;
               }

               ++var2;
            }
         }

         var1 = 0;

         while(true) {
            try {
               if (var1 >= var5.E) {
                  break;
               }

               var6 = var5.H;
            } catch (Exception var17) {
               var10001 = false;
               break;
            }

            var10002 = var6[var1]++;

            label518: {
               try {
                  if (var5.H[var1] <= 10) {
                     break label518;
                  }

                  var6 = var5.Y;
               } catch (Exception var19) {
                  var10001 = false;
                  break;
               }

               var10002 = var6[var1]++;

               try {
                  var5.H[var1] = 0;
                  if (var5.Y[var1] > 5) {
                     var5.Y[var1] = 0;
                  }
               } catch (Exception var18) {
                  var10001 = false;
                  break;
               }

               try {
                  var5.G[var1] = var5.X[var5.Y[var1]];
               } catch (Exception var16) {
                  var10001 = false;
                  break;
               }
            }

            ++var1;
         }
      }

   }

   public static void c(en var0) {
      for(int var1 = 0; var1 < a.size(); ++var1) {
         ed var3 = (ed)a.elementAt(var1);
         switch(var3.b) {
         case 8:
            var0.a(A, 0, 0, A.getWidth(), A.getHeight(), var3.p, var3.m, var3.n, 3);
            byte var2;
            if (var3.o != 1 && var3.o != 2) {
               if (var3.p == 0) {
                  var2 = 11;
               } else {
                  var2 = -11;
               }

               var0.a(C, 0, var3.q * 18, 8, 18, var3.p, var3.m + var2, var3.n + 22, 3);
               break;
            }

            if (var3.p == 0) {
               var2 = -25;
            } else {
               var2 = 25;
            }

            var0.a(B, 0, var3.q << 3, 20, 8, var3.p, var3.m + var2, var3.n + 5, 3);
            break;
         case 13:
            if (R) {
               g(var0);
            }
         }
      }

   }

   private static void d() {
      if (l.c == 1) {
         S = null;
         T = null;
      } else if (main.a.a) {
         S = null;
         T = null;
      } else {
         if (e > 0) {
            if (S == null) {
               Image var0 = l.b("/bg/fog1.png");
               S = var0;
               U = var0.getWidth();
            }
         } else {
            S = null;
         }

         if (!d) {
            T = null;
         } else {
            if (T == null) {
               T = l.b("/bg/fog0.png");
            }

            W = 287;
         }
      }

   }

   public static void d(en var0) {
      label158:
      for(int var1 = 0; var1 < a.size(); ++var1) {
         ed var5 = (ed)a.elementAt(var1);

         boolean var10001;
         int var2;
         label153: {
            label164: {
               try {
                  switch(var5.b) {
                  case 0:
                  case 12:
                     break;
                  case 1:
                  case 2:
                  case 5:
                  case 6:
                  case 7:
                  case 11:
                  case 15:
                     break label153;
                  case 3:
                  case 4:
                  case 8:
                  case 9:
                  case 10:
                  case 14:
                  default:
                     continue;
                  case 13:
                     break label164;
                  }
               } catch (Exception var15) {
                  var10001 = false;
                  continue;
               }

               var2 = 0;

               while(true) {
                  label134: {
                     try {
                        if (var2 >= var5.E) {
                           continue label158;
                        }

                        if (var5.D[var2] != 2 || var5.g[var2] < p.j || var5.g[var2] > main.a.A + p.j || var5.h[var2] < p.k || var5.h[var2] > main.a.B + p.k) {
                           break label134;
                        }

                        if (var5.I[var2]) {
                           var0.a(v, 0, var5.G[var2] * 10, 13, 10, 0, var5.g[var2], var5.h[var2] - 10, 0);
                           break label134;
                        }
                     } catch (Exception var14) {
                        var10001 = false;
                        continue label158;
                     }

                     try {
                        var0.a(w, var5.g[var2], var5.h[var2], 0);
                     } catch (Exception var13) {
                        var10001 = false;
                        continue label158;
                     }
                  }

                  ++var2;
               }
            }

            try {
               if (!R) {
                  g(var0);
               }
            } catch (Exception var9) {
               var10001 = false;
            }
            continue;
         }

         label114: {
            try {
               if (var5.b != 15) {
                  break label114;
               }

               if (bl.c[11120] != null && bl.c[11120].a != null) {
                  z = bl.c[11120].a;
               }
            } catch (Exception var12) {
               var10001 = false;
               continue;
            }

            try {
               if (z == null) {
                  continue;
               }
            } catch (Exception var11) {
               var10001 = false;
               continue;
            }
         }

         Image var4;
         try {
            var4 = z;
            if (var5.b == 11) {
               L = 5;
            }
         } catch (Exception var10) {
            var10001 = false;
            continue;
         }

         var2 = 0;

         while(true) {
            try {
               if (var2 >= var5.E) {
                  break;
               }
            } catch (Exception var8) {
               var10001 = false;
               break;
            }

            if (var2 % 3 == 0) {
               label170: {
                  try {
                     if (var5.g[var2] < p.j || var5.g[var2] > main.a.A + p.j || var5.h[var2] < p.k || var5.h[var2] > main.a.B + p.k) {
                        break label170;
                     }
                  } catch (Exception var7) {
                     var10001 = false;
                     break;
                  }

                  if (var4 != null) {
                     try {
                        int var3 = L;
                        var0.a(var4, 0, var5.G[var2] * var3, var4.getWidth(), L, 0, var5.g[var2], var5.h[var2], 0);
                     } catch (Exception var6) {
                        var10001 = false;
                        break;
                     }
                  }
               }
            }

            ++var2;
         }
      }

   }

   private void e() {
      byte var2 = 0;
      byte var1 = 0;
      int var3 = p.j;
      int var4 = p.k;
      this.o = ds.b(1, 3);
      this.u = false;
      this.t = ds.b(3, 5);
      if (this.o == 1) {
         this.m = -50;
         this.n = ds.b(var4, main.a.B - 100 + var4);
      } else {
         label35: {
            if (this.o == 2) {
               this.m = bv.c + 50;
               this.n = ds.b(var4, main.a.B - 100 + var4);
            } else {
               if (this.o == 3) {
                  this.m = ds.b(var3 + 50, var3 + (main.a.A - 50));
                  this.n = -50;
                  if (ds.b(0, 2) == 0) {
                     var1 = var2;
                  } else {
                     var1 = 2;
                  }

                  this.p = var1;
                  return;
               }

               if (this.o != 4) {
                  return;
               }

               this.m = ds.b(var3 + 50, var3 + (main.a.A - 50));
               this.n = bv.d + 50;
               if (ds.b(0, 2) == 0) {
                  break label35;
               }
            }

            var1 = 2;
         }
      }

      this.p = var1;
   }

   public static void e(en var0) {
      for(int var1 = 0; var1 < a.size(); ++var1) {
         ed var4 = (ed)a.elementAt(var1);
         var0.a(-var0.a(), -var0.b());
         int var2;
         if (var4.b == 4) {
            for(var2 = 0; var2 < var4.E; ++var2) {
               var0.a(y, 0, var4.G[var2] * 16, 16, 16, 0, var4.g[var2], var4.h[var2], 0);
            }
         }

         if (var4.b == 9) {
            var0.a(16777215);

            for(var2 = 0; var2 < var4.l; ++var2) {
               Image var3;
               if (k[var2] == 1) {
                  var3 = O;
               } else {
                  var3 = P;
               }

               var0.a(var3, var4.g[var2], var4.h[var2], 3);
            }
         }
      }

   }

   public static void f(en var0) {
      label93:
      for(int var1 = 0; var1 < a.size(); ++var1) {
         ed var5 = (ed)a.elementAt(var1);
         int var2;
         switch(var5.b) {
         case 0:
            var0.a(10742731);
            var2 = 0;

            while(true) {
               if (var2 >= var5.E) {
                  continue label93;
               }

               if (var5.D[var2] != 2 && var5.g[var2] >= p.j && var5.g[var2] <= main.a.A + p.j && var5.h[var2] >= p.k && var5.h[var2] <= main.a.B + p.k) {
                  var0.a(x, var5.g[var2], var5.h[var2], 0);
               }

               ++var2;
            }
         case 1:
         case 2:
         case 5:
         case 6:
         case 7:
         case 11:
         case 15:
            if (var5.b == 15) {
               if (bl.c[11120] != null && bl.c[11120].a != null) {
                  z = bl.c[11120].a;
               }

               if (z == null) {
                  continue;
               }
            }

            Image var4 = z;
            if (var5.b == 11) {
               L = 5;
            }

            var2 = 0;

            while(true) {
               boolean var10001;
               try {
                  if (var2 >= var5.E) {
                     break;
                  }
               } catch (Exception var8) {
                  var10001 = false;
                  break;
               }

               if (var2 % 3 != 0) {
                  label101: {
                     try {
                        if (var5.g[var2] < p.j || var5.g[var2] > main.a.A + p.j || var5.h[var2] < p.k || var5.h[var2] > main.a.B + p.k) {
                           break label101;
                        }
                     } catch (Exception var7) {
                        var10001 = false;
                        break;
                     }

                     if (var4 != null) {
                        try {
                           int var3 = L;
                           var0.a(var4, 0, var5.G[var2] * var3, var4.getWidth(), L, 0, var5.g[var2], var5.h[var2], 0);
                        } catch (Exception var6) {
                           var10001 = false;
                           break;
                        }
                     }
                  }
               }

               ++var2;
            }
         case 3:
         case 4:
         case 8:
         case 9:
         case 10:
         case 12:
         case 13:
         case 14:
         }
      }

   }

   private static void g(en var0) {
      if (l.c != 1 && !main.a.a && e != 0 && S != null) {
         for(int var1 = 0; var1 < e; ++var1) {
            var0.a(S, (float)main.a.aa[var1], (float)main.a.ab[var1], 3);
         }
      }

   }
}
