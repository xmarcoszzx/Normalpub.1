import javax.microedition.lcdui.Image;

public final class k extends do implements b {
   private static Image dl = l.b("/mainImage/myTexture2dhatdau.png");
   public static boolean j = true;
   public int a;
   public int b;
   public int c;
   public int d;
   private bo dm = new bo("", 0, 0);
   private boolean dn;
   private int do = 0;
   public String e;
   public boolean f;
   public int[] g;
   public int[] h;
   public boolean i;
   public boolean k;
   public int l;
   public long m;
   public long n;

   public k(int var1, int var2, int var3, int var4, int var5, int var6) {
      super(var1, var2, var3, var4, var5, var6);
      this.dm.i = new de((String)null, this, 1, (Object)null);
      bo.a(this.dm);
   }

   public final void a() {
      this.dm.j = j;
      this.n = System.currentTimeMillis();
      if (this.n - this.m >= 1000L) {
         --this.l;
         this.m = this.n;
         if (this.l < 0) {
            this.l = 0;
         }
      }

      if (!this.f) {
         if (this.b < this.d && this.l == 0) {
            this.dn = true;
         }
      } else if (this.l == 0) {
         this.f = false;
         this.dn = true;
      }

      if (this.dn) {
         ++this.do;
         if (this.do == 20) {
            this.do = 0;
            this.dn = false;
            bt.a().f((byte)2);
         }
      }

      if (this.i) {
         this.i = false;
         int var1;
         int var2;
         int var3;
         String var4;
         bo var5;
         String var6;
         if ((this.l < 0 || this.b >= this.d) && (this.l < 0 || !this.f) && !this.k) {
            if (this.b == this.d && !this.f) {
               var5 = this.dm;
               var6 = aw.cI;
               var4 = this.b + "/" + this.d;
               var2 = super.B;
               var1 = super.C;
               var3 = bl.a[this.a][4];
               var5.a(new String[]{var6, var4}, var2, var1 - 20 - var3);
            }
         } else {
            var5 = this.dm;
            if (!this.f) {
               var4 = this.b + "/" + this.d;
            } else {
               var4 = aw.cy;
            }

            var6 = ai.b(this.l);
            var3 = super.B;
            var2 = super.C;
            var1 = bl.a[this.a][4];
            var5.a(new String[]{var4, var6}, var3, var2 - 20 - var1);
         }
      }

      if (this.l >= 0 && this.b < this.d || this.l >= 0 && this.f) {
         this.dm.c[this.dm.c.length - 1] = ai.b(this.l);
      }

      if (this.k) {
         this.dm.j = false;
         at.a(98, super.B + this.g[this.b - 1] - bl.a[this.a][3] / 2, super.C + this.h[this.b - 1] - bl.a[this.a][4], 1);
         --this.b;
         if (main.a.w % 2 == 0) {
            bu.a();
         }

         if (this.b == this.c) {
            this.dm.j = true;
            this.i = true;
            this.k = false;
         }
      }

      super.a();
   }

   public final void a(int var1, Object var2) {
      if (var1 == 1) {
         bt.a().e((byte)1);
      }

   }

   public final void a(en var1) {
      if (this.a != 0) {
         bl.b(var1, this.a, super.B, super.C, 0, cj.c);
         if (af.e().aT != null && af.e().aT.equals(this)) {
            var1.a(aa.R, 0, 0, 9, 6, 0, super.B, super.C - bl.a[this.a][4] - 1, 33);
            if (this.e != null) {
               di.n.a(var1, this.e, super.B, super.C - bl.a[this.a][4] - 20, 2, di.o);
            }
         } else if (this.e != null) {
            di.n.a(var1, this.e, super.B, super.C - bl.a[this.a][4] - 17, 2, di.o);
         }

         int var2 = 0;

         int var3;
         while(true) {
            boolean var10001;
            try {
               var3 = this.b;
            } catch (Exception var8) {
               var10001 = false;
               break;
            }

            if (var2 >= var3) {
               break;
            }

            try {
               var1.a(dl, super.B + this.g[var2] - bl.a[this.a][3] / 2, super.C + this.h[var2] - bl.a[this.a][4], 0);
            } catch (Exception var7) {
               var10001 = false;
               break;
            }

            ++var2;
         }

         if (super.bZ >= 0 && super.ca != null && super.aN == 0) {
            int var4 = super.ca.a[super.bZ].c;
            var2 = super.B;
            var3 = super.ca.a[super.bZ].a;
            int var5 = super.C;
            bl.b(var1, var4, var3 + var2, super.ca.a[super.bZ].b + (var5 - 15), 0, 3);
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
