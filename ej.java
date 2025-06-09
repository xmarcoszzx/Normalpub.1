import javax.microedition.lcdui.Image;

public final class ej implements b {
   private static Image o = l.b("/mainImage/myTexture2dgocnhon.png");
   public el a = new el("infoWaitToShow");
   public r b;
   public int c = 100;
   public String[] d;
   public int e;
   public int f;
   public int g;
   public int h;
   public int i;
   public int j;
   private int k;
   private int l;
   private int m;
   private boolean n = false;
   private int p;

   public final void a() {
      this.d = null;
      this.a.removeAllElements();
   }

   public final void a(int var1, Object var2) {
      if (var1 == 1000) {
         cq var3 = cq.b();
         p.j();
         var3.a(aw.cP);
      }

   }

   public final void a(en var1, int var2, int var3, int var4) {
      if (this.a.size() != 0) {
         var1.a(var2, var3);
         if (this.d != null && this.d.length != 0 && this.p != 1) {
            byte var5;
            if (en.b == 1) {
               var5 = 0;
            } else {
               var5 = 10;
            }

            if (this.b.c == null) {
               bo.a(var1, this.g, this.h, this.i, this.j, 16777215, false);
            } else {
               l.a(var1, this.g - 23, this.h - var5 / 2, this.i + 15);
            }

            int var7;
            if (this.b.c == null) {
               Image var12 = o;
               byte var6;
               if (var4 == 1) {
                  var6 = 0;
               } else {
                  var6 = 2;
               }

               var7 = this.l;
               byte var15;
               if (var4 == 1) {
                  var15 = -15;
               } else {
                  var15 = 20;
               }

               var1.a(var12, 0, 0, 9, 8, var6, var7 - 3 + var15, this.m - 20 + this.k + 2, 17);
            }

            var4 = -1;

            for(int var16 = 0; var16 < this.d.length; ++var16) {
               di var14 = di.k;
               String var18 = this.d[var16];
               String var19;
               if (this.d[var16].startsWith("|")) {
                  String[] var13 = ds.a(this.d[var16], "|", 0);
                  if (var13.length == 3) {
                     var18 = var13[2];
                  }

                  if (var13.length == 4) {
                     var18 = var13[3];
                     Integer.parseInt(var13[2]);
                  }

                  var4 = Integer.parseInt(var13[1]);
                  var7 = var4;
                  var19 = var18;
               } else {
                  var7 = var4;
                  var19 = var18;
               }

               di var20;
               switch(var7) {
               case -1:
                  var20 = di.k;
                  break;
               case 0:
                  var20 = di.f;
                  break;
               case 1:
                  var20 = di.h;
                  break;
               case 2:
                  var20 = di.b;
                  break;
               case 3:
                  var20 = di.p;
                  break;
               case 4:
                  var20 = di.r;
                  break;
               case 5:
                  var20 = di.q;
                  break;
               case 6:
               default:
                  var20 = var14;
                  break;
               case 7:
                  var20 = di.a;
               }

               if (this.b.c == null) {
                  var20.a(var1, var19, this.l, this.m - 15 + this.k + var16 * 12 - this.d.length * 12 - 9, 2);
               } else {
                  int var9 = this.g - 23;
                  int var10 = this.h - var5 / 2;
                  if (l.c == 1) {
                     var7 = this.i + 28;
                  } else {
                     var7 = this.i + 25;
                  }

                  int var11 = this.j;
                  byte var8;
                  if (main.a.e) {
                     var8 = 0;
                  } else {
                     var8 = 14;
                  }

                  var11 = var8 + var11 + var5;
                  var1.a(4465169);
                  var1.d(var9, var10 + var11, var7, 2);
                  int var17 = var7 * this.b.f / this.b.g;
                  var7 = var17;
                  if (var17 < 0) {
                     var7 = 0;
                  }

                  var1.a(43758);
                  var1.d(var9, var11 + var10, var7, 2);
                  if (this.b.f == 0) {
                     return;
                  }

                  this.b.c.a((en)var1, (int)(this.g + 5), (int)(this.h + this.j / 2), (int)0);
                  if (en.b == 1) {
                     if (this.b.d) {
                        var20 = di.F;
                     } else {
                        var20 = di.I;
                     }

                     var20.a(var1, this.b.c.ag, this.g + 12, this.h + 3, 0);
                  } else {
                     if (this.b.d) {
                        var20 = di.F;
                     } else {
                        var20 = di.I;
                     }

                     var20.a(var1, this.b.c.ag, this.g + 12, this.h - 3, 0);
                  }

                  if (!main.a.e) {
                     if (!cd.g) {
                        di.G.a(var1, "Nhấn # để chat", this.g + this.i / 2 + 10, this.h + this.j, 2);
                     } else {
                        di.G.a(var1, "Nhấn Y để chat", this.g + this.i / 2 + 10, this.h + this.j, 2);
                     }
                  }

                  if (en.b == 1) {
                     ag.a(var1, var19, this.g + 14, this.h + this.j / 2 + 2, this.i - 16, this.j, di.H);
                  } else {
                     String[] var21 = di.H.a(var19, 120);

                     for(var7 = 0; var7 < var21.length; ++var7) {
                        di.H.a(var1, var21[var7], this.g + 12, this.h + 12 + var7 * 12 - 3, 0);
                     }

                     main.a.a(var1);
                  }
               }
            }
         }

         var1.a(-var2, -var3);
      }

   }

   public final void a(String var1, int var2, af var3, boolean var4) {
      this.p = var2;
      if (this.a.size() > 10) {
         this.a.removeElementAt(0);
      }

      if (this.a.size() > 0) {
         var1.equals(((r)this.a.lastElement()).a);
      }

      r var5 = new r(var1);
      if (this.p == 0) {
         var5.b = var1.length();
      }

      if (var5.b < 70) {
         var5.b = 70;
      }

      if (this.p == 1) {
         var5.b = 10000000;
      }

      if (this.p == 3) {
         var5.b = 300;
         var5.h = l.d();
         var5.f = var1.length();
         if (var5.f < 15) {
            var5.f = 15;
         }

         if (var5.f > 100) {
            var5.f = 100;
         }

         var5.g = var5.f;
      }

      if (var3 != null) {
         var5.c = var3;
         var5.d = var4;
         main.a.G.a(var5);
         if (main.a.e && main.a.G.au) {
            p.aE.i = new de(aw.bp, this, 1000, var5);
         }
      }

      if (var3 != null && main.a.G.au || var3 == null) {
         this.a.addElement(var5);
      }

      if (this.a.size() == 1) {
         this.b = (r)this.a.firstElement();
         this.c();
      }

      if (main.a.e && var3 != null && main.a.G.au && main.a.A - 50 > this.i + 155) {
         p.aE.i.j = main.a.A - this.i - 50;
         p.aE.i.k = 35;
      }

   }

   public final void b() {
      if (this.a.size() != 0 && this.b.f == 0) {
         ++this.e;
         if (this.e >= this.b.b) {
            this.e = 0;
            this.a.removeElementAt(0);
            if (this.a.size() != 0) {
               this.b = (r)this.a.firstElement();
               this.c();
            }
         }
      }

   }

   public final void c() {
      byte var3 = 0;
      this.c = 100;
      if (main.a.A == 128) {
         this.c = 128;
      }

      int var1;
      if (this.b.c != null) {
         this.d = new String[]{this.b.a};
         if (en.b == 1) {
            var1 = this.d.length;
         } else {
            var1 = di.H.a(this.b.a, 120).length;
         }
      } else {
         this.d = di.k.a(this.b.a, this.c - 10);
         var1 = this.d.length;
      }

      this.k = 7;
      this.g = this.l - this.c / 2 - 1;
      this.h = this.m - 15 + this.k - var1 * 12 - 15;
      int var4 = this.c;
      byte var2;
      if (this.b.c != null) {
         var2 = 30;
      } else {
         var2 = 0;
      }

      this.i = var2 + var4 + 2;
      var2 = var3;
      if (this.b.c != null) {
         var2 = 5;
      }

      this.j = (var1 + 1) * 12 + 1 + var2;
   }
}
