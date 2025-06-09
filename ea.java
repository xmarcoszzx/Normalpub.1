import java.io.InputStream;

public final class ea {
   public static el j = new el("vEffData");
   public static el m = new el("vNewEff");
   public static el n = new el("vdowloadEff");
   private static el v = new el("vLastEff");
   private int[] A;
   private boolean B;
   private short[] C;
   public int a;
   public int b;
   public int c;
   public int d;
   public int e;
   public int f;
   public int g;
   public int h;
   public int i = 0;
   public int k = 0;
   public long l = 0L;
   private boolean o;
   private af p;
   private int q;
   private int r;
   private int s;
   private int t;
   private boolean u = true;
   private int[] w;
   private int[] x;
   private int[] y;
   private int[] z;

   public ea() {
      int[] var1 = new int[10];
      var1[5] = 1;
      var1[6] = 1;
      var1[7] = 1;
      var1[8] = 1;
      var1[9] = 1;
      this.w = var1;
      this.x = new int[]{2, 2, 2, 2, 2, 3, 3, 3, 3, 3};
      this.y = new int[]{4, 4, 4, 4, 4, 5, 5, 5, 5, 5};
      this.z = new int[]{6, 6, 6, 6, 6, 7, 7, 7, 7, 7};
      this.A = new int[]{8, 8, 8, 8, 8, 9, 9, 9, 9, 9};
      this.B = false;
   }

   public ea(int var1, int var2, int var3, int var4, int var5, int var6) {
      int[] var7 = new int[10];
      var7[5] = 1;
      var7[6] = 1;
      var7[7] = 1;
      var7[8] = 1;
      var7[9] = 1;
      this.w = var7;
      this.x = new int[]{2, 2, 2, 2, 2, 3, 3, 3, 3, 3};
      this.y = new int[]{4, 4, 4, 4, 4, 5, 5, 5, 5, 5};
      this.z = new int[]{6, 6, 6, 6, 6, 7, 7, 7, 7, 7};
      this.A = new int[]{8, 8, 8, 8, 8, 9, 9, 9, 9, 9};
      this.B = false;
      this.f = var2;
      this.g = var3;
      this.a = var1;
      this.h = var4;
      this.r = var5;
      this.s = var6;
      var2 = var1;
      if (a(var1) == null) {
         ck var10 = new ck();
         var10.d = var1;
         var2 = var1;
         if (var1 >= 42) {
            var2 = var1;
            if (var1 <= 46) {
               var2 = 106;
            }
         }

         String var9 = "/x" + en.b + "/effectdata/" + var2 + "/data";
         InputStream var12 = null;

         label48: {
            InputStream var8;
            try {
               var8 = ad.a(var9);
            } catch (Exception var11) {
               break label48;
            }

            var12 = var8;
         }

         if (var12 == null) {
            bt.a().a((short)var2);
         } else {
            if (var2 > 100 && var2 < 200) {
               var10.b(var9);
            } else {
               var10.a(var9);
            }

            var10.a = l.b("/effectdata/" + var2 + "/img.png");
         }

         j.addElement(var10);
         if (v.size() > 20) {
            b(Integer.parseInt((String)v.elementAt(0)));
            v.removeElementAt(0);
         }

         v.addElement(String.valueOf(this.a));
      }

      this.c = -1;
      this.d = -1;
      if (var2 == 78) {
         this.b = 5;
      } else {
         this.b = 1;
      }

      if (!a(String.valueOf(this.a))) {
         m.addElement(String.valueOf(this.a));
      }

   }

   public ea(int var1, af var2, int var3, int var4, int var5, byte var6) {
      int[] var7 = new int[10];
      var7[5] = 1;
      var7[6] = 1;
      var7[7] = 1;
      var7[8] = 1;
      var7[9] = 1;
      this.w = var7;
      this.x = new int[]{2, 2, 2, 2, 2, 3, 3, 3, 3, 3};
      this.y = new int[]{4, 4, 4, 4, 4, 5, 5, 5, 5, 5};
      this.z = new int[]{6, 6, 6, 6, 6, 7, 7, 7, 7, 7};
      this.A = new int[]{8, 8, 8, 8, 8, 9, 9, 9, 9, 9};
      this.B = false;
      this.p = var2;
      this.a = var1;
      this.h = var3;
      this.r = var4;
      this.s = var5;
      this.i = var6;
      var3 = var1;
      if (a(var1) == null) {
         ck var8 = new ck();
         var8.d = var1;
         var3 = var1;
         if (var1 >= 42) {
            var3 = var1;
            if (var1 <= 46) {
               var3 = 106;
            }
         }

         String var9 = "/x" + en.b + "/effectdata/" + var3 + "/data";
         InputStream var11 = null;

         label39: {
            InputStream var12;
            try {
               var12 = ad.a(var9);
            } catch (Exception var10) {
               break label39;
            }

            var11 = var12;
         }

         if (var11 == null) {
            bt.a().a((short)var3);
         } else {
            if (var3 > 100 && var3 < 200) {
               var8.b(var9);
            } else {
               var8.a(var9);
            }

            var8.a = l.b("/effectdata/" + var3 + "/img.png");
         }

         j.addElement(var8);
      }

      this.c = -1;
      this.d = -1;
      this.k = -1;
      this.b = 4;
      if (var3 == 78) {
         this.b = 5;
      }

   }

   public static ck a(int var0) {
      int var1 = 0;

      ck var2;
      while(true) {
         if (var1 >= j.size()) {
            var2 = null;
            break;
         }

         ck var3 = (ck)j.elementAt(var1);
         var2 = var3;
         if (var3.d == var0) {
            break;
         }

         ++var1;
      }

      return var2;
   }

   private static boolean a(String var0) {
      boolean var2 = false;

      for(int var1 = 0; var1 < m.size(); ++var1) {
         if (((String)m.elementAt(var1)).equals(var0)) {
            var2 = true;
            break;
         }
      }

      return var2;
   }

   private static void b(int var0) {
      for(int var1 = 0; var1 < j.size(); ++var1) {
         ck var2 = (ck)j.elementAt(var1);
         if (var2.d == var0) {
            j.removeElement(var2);
            break;
         }
      }

   }

   private boolean b() {
      boolean var1;
      if (!this.u) {
         var1 = false;
      } else {
         var1 = true;
      }

      return var1;
   }

   public final void a() {
      byte var2 = 0;

      Exception var10000;
      label448: {
         boolean var10001;
         label449: {
            try {
               if (this.a < 42 || this.a > 46) {
                  break label449;
               }

               if (this.a == 42) {
                  this.q = this.w[this.e];
               }
            } catch (Exception var46) {
               var10000 = var46;
               var10001 = false;
               break label448;
            }

            try {
               if (this.a == 43) {
                  this.q = this.x[this.e];
               }
            } catch (Exception var9) {
               var10000 = var9;
               var10001 = false;
               break label448;
            }

            try {
               if (this.a == 44) {
                  this.q = this.y[this.e];
               }
            } catch (Exception var8) {
               var10000 = var8;
               var10001 = false;
               break label448;
            }

            try {
               if (this.a == 45) {
                  this.q = this.z[this.e];
               }
            } catch (Exception var7) {
               var10000 = var7;
               var10001 = false;
               break label448;
            }

            try {
               if (this.a == 46) {
                  this.q = this.A[this.e];
               }
            } catch (Exception var6) {
               var10000 = var6;
               var10001 = false;
               break label448;
            }

            try {
               ++this.e;
               if (this.e > this.w.length - 1) {
                  this.e = 0;
               }

               return;
            } catch (Exception var5) {
               var10000 = var5;
               var10001 = false;
               break label448;
            }
         }

         int var1;
         label451: {
            int var3;
            ck var4;
            label452: {
               try {
                  if (a(this.a) == null || a(this.a).a == null) {
                     return;
                  }

                  if (this.b == 5) {
                     var4 = a(this.a);
                     var3 = this.p.H;
                     break label452;
                  }
               } catch (Exception var45) {
                  var10000 = var45;
                  var10001 = false;
                  break label448;
               }

               try {
                  this.C = a(this.a).b;
                  break label451;
               } catch (Exception var23) {
                  var10000 = var23;
                  var10001 = false;
                  break label448;
               }
            }

            var1 = var3;

            label423: {
               try {
                  if (var3 < var4.c.length) {
                     break label423;
                  }
               } catch (Exception var44) {
                  var10000 = var44;
                  var10001 = false;
                  break label448;
               }

               var1 = 0;
            }

            short[] var48;
            label454: {
               try {
                  if (var4.c[var1] == null) {
                     var48 = new short[1];
                     break label454;
                  }
               } catch (Exception var43) {
                  var10000 = var43;
                  var10001 = false;
                  break label448;
               }

               try {
                  var48 = var4.c[var1];
               } catch (Exception var25) {
                  var10000 = var25;
                  var10001 = false;
                  break label448;
               }
            }

            try {
               this.C = var48;
            } catch (Exception var24) {
               var10000 = var24;
               var10001 = false;
               break label448;
            }
         }

         label455: {
            label456: {
               try {
                  if (this.C == null) {
                     break label455;
                  }

                  if (this.B) {
                     break label456;
                  }

                  this.B = true;
                  var1 = this.C.length - 1;
               } catch (Exception var42) {
                  var10000 = var42;
                  var10001 = false;
                  break label448;
               }

               if (var1 > 0) {
                  try {
                     if (this.b != 1) {
                        this.e = ds.b(0, var1);
                     }
                  } catch (Exception var22) {
                     var10000 = var22;
                     var10001 = false;
                     break label448;
                  }
               }

               try {
                  if (this.b == 0) {
                     this.e = ds.b(this.c, this.d);
                  }
               } catch (Exception var21) {
                  var10000 = var21;
                  var10001 = false;
                  break label448;
               }
            }

            label458: {
               label459: {
                  label460: {
                     label471: {
                        label462: {
                           try {
                              switch(this.b) {
                              case 0:
                                 break label462;
                              case 1:
                              case 3:
                                 break;
                              case 2:
                                 break label471;
                              case 4:
                                 break label459;
                              case 5:
                                 break label460;
                              default:
                                 break label458;
                              }
                           } catch (Exception var41) {
                              var10000 = var41;
                              var10001 = false;
                              break label448;
                           }

                           try {
                              if (this.e < this.C.length) {
                                 ++this.e;
                              }
                              break label458;
                           } catch (Exception var34) {
                              var10000 = var34;
                              var10001 = false;
                              break label448;
                           }
                        }

                        label376: {
                           try {
                              if (!ds.a(this.f - 50, this.g - 50, 100, 100, af.e().B, af.e().C) || this.e <= this.c || this.e >= this.d) {
                                 break label376;
                              }

                              if (this.e < this.d) {
                                 this.e = this.d;
                              }
                           } catch (Exception var40) {
                              var10000 = var40;
                              var10001 = false;
                              break label448;
                           }

                           try {
                              this.o = true;
                           } catch (Exception var18) {
                              var10000 = var18;
                              var10001 = false;
                              break label448;
                           }
                        }

                        try {
                           if (!this.o) {
                              ++this.e;
                              if (this.e == this.d) {
                                 this.e = this.c;
                              }
                              break label458;
                           }
                        } catch (Exception var39) {
                           var10000 = var39;
                           var10001 = false;
                           break label448;
                        }

                        try {
                           if (this.e < this.C.length) {
                              ++this.e;
                           }
                           break label458;
                        } catch (Exception var35) {
                           var10000 = var35;
                           var10001 = false;
                           break label448;
                        }
                     }

                     try {
                        if (this.e < this.C.length) {
                           ++this.e;
                        }
                     } catch (Exception var17) {
                        var10000 = var17;
                        var10001 = false;
                        break label448;
                     }

                     try {
                        ++this.t;
                        if (this.t == this.s) {
                           this.t = 0;
                           this.k = ds.b(0, 2);
                        }
                        break label458;
                     } catch (Exception var33) {
                        var10000 = var33;
                        var10001 = false;
                        break label448;
                     }
                  }

                  byte var47;
                  label358: {
                     label357: {
                        try {
                           if (this.p.I != 1) {
                              break label357;
                           }
                        } catch (Exception var38) {
                           var10000 = var38;
                           var10001 = false;
                           break label448;
                        }

                        var47 = var2;
                        break label358;
                     }

                     var47 = 1;
                  }

                  label466: {
                     try {
                        this.k = var47;
                        if (this.p.I == 1) {
                           this.f = this.p.B - 15;
                           break label466;
                        }
                     } catch (Exception var37) {
                        var10000 = var37;
                        var10001 = false;
                        break label448;
                     }

                     try {
                        this.f = this.p.B + 15;
                     } catch (Exception var20) {
                        var10000 = var20;
                        var10001 = false;
                        break label448;
                     }
                  }

                  label467: {
                     try {
                        if (this.p.cE == 0) {
                           this.g = this.p.C - 25;
                           break label467;
                        }
                     } catch (Exception var36) {
                        var10000 = var36;
                        var10001 = false;
                        break label448;
                     }

                     try {
                        this.g = this.p.C - 35;
                     } catch (Exception var19) {
                        var10000 = var19;
                        var10001 = false;
                        break label448;
                     }
                  }

                  try {
                     if (this.e < this.C.length) {
                        ++this.e;
                     }
                     break label458;
                  } catch (Exception var31) {
                     var10000 = var31;
                     var10001 = false;
                     break label448;
                  }
               }

               try {
                  this.f = this.p.B;
                  this.g = this.p.C;
                  if (this.e < this.C.length) {
                     ++this.e;
                  }
               } catch (Exception var32) {
                  var10000 = var32;
                  var10001 = false;
                  break label448;
               }
            }

            try {
               if (this.e <= this.C.length - 1) {
                  this.q = this.C[this.e];
               }
            } catch (Exception var16) {
               var10000 = var16;
               var10001 = false;
               break label448;
            }
         }

         label468: {
            label312: {
               try {
                  if (this.e < this.C.length - 1) {
                     break label468;
                  }

                  if (this.b != 0 && this.b != 3) {
                     break label312;
                  }
               } catch (Exception var30) {
                  var10000 = var30;
                  var10001 = false;
                  break label448;
               }

               try {
                  this.u = false;
               } catch (Exception var15) {
                  var10000 = var15;
                  var10001 = false;
                  break label448;
               }
            }

            try {
               if (this.s == -1) {
                  ei.a.removeElement(this);
               }
            } catch (Exception var14) {
               var10000 = var14;
               var10001 = false;
               break label448;
            }

            try {
               if (this.b == 2) {
                  this.e = 0;
                  return;
               }
            } catch (Exception var29) {
               var10000 = var29;
               var10001 = false;
               break label448;
            }

            try {
               if (this.b == 1 && this.r == 1) {
                  this.u = false;
               }
            } catch (Exception var13) {
               var10000 = var13;
               var10001 = false;
               break label448;
            }

            label470: {
               try {
                  if (this.b != 4 && this.b != 5) {
                     break label470;
                  }
               } catch (Exception var28) {
                  var10000 = var28;
                  var10001 = false;
                  break label448;
               }

               try {
                  if (this.r == -1) {
                     this.e = 0;
                     return;
                  }
               } catch (Exception var27) {
                  var10000 = var27;
                  var10001 = false;
                  break label448;
               }

               try {
                  ++this.t;
                  if (this.t == this.s) {
                     this.t = 0;
                     --this.r;
                     this.e = 0;
                     if (this.r == 0) {
                        this.p.b((int)0, (int)this.a);
                        return;
                     }
                  }

                  return;
               } catch (Exception var11) {
                  var10000 = var11;
                  var10001 = false;
                  break label448;
               }
            }

            try {
               this.o = false;
               if (this.r == -1) {
                  ++this.t;
                  this.e = 0;
                  if (this.t == this.s) {
                     this.t = 0;
                     if (this.s > 1) {
                        this.k = ds.b(0, 2);
                        return;
                     }
                  }

                  return;
               }
            } catch (Exception var26) {
               var10000 = var26;
               var10001 = false;
               break label448;
            }

            try {
               ++this.t;
               this.e = 0;
               if (this.t == this.s) {
                  this.t = 0;
                  --this.r;
                  if (this.r == 0) {
                     ei.a.removeElement(this);
                     return;
                  }
               }

               return;
            } catch (Exception var10) {
               var10000 = var10;
               var10001 = false;
               break label448;
            }
         }

         try {
            this.u = true;
            return;
         } catch (Exception var12) {
            var10000 = var12;
            var10001 = false;
         }
      }

      Exception var49 = var10000;
      System.out.println("err  Effect.update: " + this.a + "  " + this.b);
      var49.printStackTrace();
      ei.a.removeElement(this);
   }

   public final void a(en var1) {
      if (this.b() && a(this.a) != null && a(this.a).a != null) {
         try {
            a(this.a).a(var1, this.q, this.f, this.g, this.k, this.h);
         } catch (Exception var2) {
            ds.c("Effect " + this.a + " err at frame " + this.q + " vitri " + this.f + "_" + this.g + "   " + this.h);
            var2.printStackTrace();
         }
      }

   }

   public final void a(en var1, int var2, int var3) {
      if (this.b() && a(this.a).a != null) {
         a(this.a).a(var1, this.q, this.f + var2, this.g + var3, this.k, this.h);
      }

   }
}
