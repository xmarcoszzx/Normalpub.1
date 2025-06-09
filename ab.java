public final class ab extends bb implements b {
   public static bg[] a;
   private de[] b;
   private int c;
   private int[] d;
   private int e;
   private int[] f;
   private int[] g;
   private int h;
   private int i;

   public ab() {
      this.d = new int[]{main.a.A / 2 - 100, main.a.A / 2 - 100};
      this.e = 0;
      this.f = new int[2];
      this.g = new int[]{main.a.A / 2 - 150, main.a.B / 2 - 100, 300, 200};
      this.h = -35;
      this.i = -35;
   }

   public final void a(byte var1) {
      this.d = new int[var1];
      this.f = new int[var1];

      for(int var2 = 0; var2 < var1; ++var2) {
         this.d[var2] = this.g[0] + 20;
         this.f[var2] = var2 * 70 + this.g[1] + 50;
      }

      this.b = new de[2];
      this.b[1] = new de("Vào game", this, 1, (Object)null, this.g[0] + this.g[2] - 80 - 80, this.g[1] + this.g[3] - 30);
      this.b[0] = new de("Trờ ra", this, 2, (Object)null, this.g[0] + this.g[2] - 80, this.g[1] + this.g[3] - 30);
   }

   public final void a(int var1, Object var2) {
      switch(var1) {
      case 1:
         if (this.e != -1) {
            main.a.i();
            bt.a().t(a[this.e].a);
         }
         break;
      case 2:
         main.a.e();
      }

   }

   public final void a(en var1) {
      byte var3 = 0;
      main.a.c(var1);

      label73: {
         int var2;
         boolean var10001;
         label74: {
            try {
               bo.a(var1, this.g[0] - 10, this.g[1], this.g[2] + 20, this.g[3], 16777215, true);
               if (this.b == null) {
                  break label74;
               }
            } catch (Exception var18) {
               var10001 = false;
               break label73;
            }

            var2 = 0;

            while(true) {
               try {
                  if (var2 >= this.b.length) {
                     break;
                  }
               } catch (Exception var17) {
                  var10001 = false;
                  break label73;
               }

               try {
                  this.b[var2].a(var1);
               } catch (Exception var16) {
                  var10001 = false;
                  break label73;
               }

               ++var2;
            }
         }

         try {
            if (a == null) {
               break label73;
            }
         } catch (Exception var15) {
            var10001 = false;
            break label73;
         }

         var2 = var3;

         while(true) {
            int var19;
            try {
               var19 = a.length;
            } catch (Exception var13) {
               var10001 = false;
               break;
            }

            if (var2 >= var19) {
               break;
            }

            label48: {
               int var4;
               int var5;
               int var6;
               String var22;
               di var23;
               di var24;
               StringBuffer var25;
               String var26;
               try {
                  var4 = this.d[var2];
                  var19 = this.f[var2];
                  bo.a(var1, var4 - 20, this.h + var19, this.g[2], 60, 16777215, false);
                  av var9 = p.x[a[var2].c];
                  av var11 = p.x[a[var2].e];
                  av var10 = p.x[a[var2].d];
                  bl.b(var1, var9.a[af.bC[this.c][0][0]].a, this.d[var2] + af.bC[this.c][0][1] + var9.a[af.bC[this.c][0][0]].b, this.f[var2] - af.bC[this.c][0][2] + var9.a[af.bC[this.c][0][0]].c, 0, 0);
                  short var7 = var11.a[af.bC[this.c][1][0]].a;
                  var19 = this.d[var2];
                  var5 = af.bC[this.c][1][1];
                  byte var8 = var11.a[af.bC[this.c][1][0]].b;
                  var4 = this.f[var2];
                  var6 = af.bC[this.c][1][2];
                  bl.b(var1, var7, var8 + var19 + var5, var11.a[af.bC[this.c][1][0]].c + (var4 - var6), 0, 0);
                  var7 = var10.a[af.bC[this.c][2][0]].a;
                  var4 = this.d[var2];
                  var19 = af.bC[this.c][2][1];
                  byte var20 = var10.a[af.bC[this.c][2][0]].b;
                  var5 = this.f[var2];
                  int var21 = af.bC[this.c][2][2];
                  bl.b(var1, var7, var20 + var4 + var19, var10.a[af.bC[this.c][2][0]].c + (var5 - var21), 0, 0);
                  if (this.e == var2) {
                     var24 = di.d;
                     var22 = a[var2].b;
                     var19 = this.d[var2];
                     var5 = this.g[2];
                     var4 = this.f[var2];
                     var24.a(var1, var22, var19 + var5 - 25, this.h + var4, 1);
                     var23 = di.d;
                     var25 = new StringBuffer(String.valueOf(aw.dd));
                     var26 = var25.append(" ").append(ds.b(a[var2].f)).toString();
                     var19 = this.d[var2];
                     var6 = this.g[2];
                     var5 = this.f[var2];
                     var4 = this.h;
                     var23.a(var1, var26, var19 + var6 - 25, di.d.a() + var5 + var4, 1);
                     break label48;
                  }
               } catch (Exception var14) {
                  var10001 = false;
                  break;
               }

               try {
                  var24 = di.f;
                  var22 = a[var2].b;
                  var19 = this.d[var2];
                  var5 = this.g[2];
                  var4 = this.f[var2];
                  var24.a(var1, var22, var19 + var5 - 25, this.h + var4, 1);
                  var23 = di.f;
                  var25 = new StringBuffer(String.valueOf(aw.dd));
                  var26 = var25.append(" ").append(ds.b(a[var2].f)).toString();
                  var4 = this.d[var2];
                  var19 = this.g[2];
                  var5 = this.f[var2];
                  var6 = this.h;
                  var23.a(var1, var26, var4 + var19 - 25, di.f.a() + var5 + var6, 1);
               } catch (Exception var12) {
                  var10001 = false;
                  break;
               }
            }

            ++var2;
         }
      }

      super.a(var1);
   }

   public final void b() {
      bs.c = false;
      af.bI = false;
      x.c = false;
      bs.m = false;
      p.j().a();
      super.b();
   }

   public final void c() {
      byte var2 = 0;
      if (main.a.w % 10 > 2) {
         this.c = 1;
      } else {
         this.c = 0;
      }

      int var1;
      for(var1 = 0; var1 < this.b.length; ++var1) {
         if (this.b[var1].c()) {
            this.b[var1].a();
         }
      }

      for(var1 = var2; var1 < this.d.length; ++var1) {
         if (main.a.a(this.d[var1] + this.i, this.f[var1] + this.h, this.g[2], 60) && main.a.k) {
            this.e = var1;
            break;
         }
      }

      super.c();
   }
}
