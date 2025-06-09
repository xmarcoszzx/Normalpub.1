public final class bw implements b {
   public short a;
   public short b;
   public short c;
   public short d;
   public boolean e;
   public boolean f;
   public bo g;

   public bw(short var1, short var2, short var3, short var4, boolean var5, boolean var6, String var7) {
      byte var8 = 24;
      super();
      this.a = var1;
      this.b = var2;
      this.c = var3;
      this.d = var4;
      var7 = ds.a(var7);
      this.e = var5;
      this.f = var6;
      if ((bv.l != 21 && bv.l != 22 && bv.l != 23 || this.a < 0 || this.a > 24) && ((bv.l != 0 || af.e().K == 0) && (bv.l != 7 || af.e().K == 1) && (bv.l != 14 || af.e().K == 2) || !var6)) {
         int var9;
         if (!bv.f() && bv.l != 47) {
            if (!var5 && !var6) {
               this.g = new bo(var7, var1, var2 - 24);
               this.g.i = new de((String)null, this, 1, this);
               this.g.h = true;
               this.g.j = false;
               bo.a(this.g);
            } else {
               if (bv.b()) {
                  this.g = new bo(var7, var1, var2 - 16);
               } else {
                  var9 = (var3 - var1) / 2;
                  byte var10;
                  if (var2 != 0) {
                     var10 = 16;
                  } else {
                     var10 = -32;
                  }

                  this.g = new bo(var7, var1 + var9, var2 - var10);
               }

               this.g.i = new de((String)null, this, 2, this);
               this.g.h = true;
               this.g.j = false;
               bo.a(this.g);
            }

            bv.t.addElement(this);
         } else if (var2 <= 150 || !bv.f()) {
            var9 = (var3 - var1) / 2;
            if (var1 <= 100) {
               var8 = 48;
            }

            this.g = new bo(var7, var9 + var1, var4 - var8);
            this.g.i = new de((String)null, this, 1, this);
            this.g.h = true;
            this.g.j = false;
            bo.a(this.g);
            bv.t.addElement(this);
         }
      }

   }

   public final void a(int var1, Object var2) {
      byte var3 = -1;
      byte var5;
      af var6;
      switch(var1) {
      case 1:
         int var7 = (this.a + this.c) / 2;
         var1 = this.d;
         if (this.d > this.b + 24) {
            var1 = (this.b + this.d) / 2;
         }

         p.j().aX = 0;
         af.e().bP = new dm(var7, var1);
         var6 = af.e();
         if (af.e().B - af.e().bP.a > 0) {
            var5 = -1;
         } else {
            var5 = 1;
         }

         var6.I = var5;
         bt.a().g();
         break;
      case 2:
         p.j().aX = 0;
         if (af.e().i() != null) {
            bt.a().g();
            bp.a();
            bt.a().q();
            af.bG = true;
         } else if (af.e().j() != null) {
            bt.a().g();
            bt.a().f();
            af.bH = true;
            af.bG = true;
            main.a.g();
            main.a.f();
            bp.a();
         } else {
            var1 = (this.a + this.c) / 2;
            short var4 = this.d;
            af.e().bP = new dm(var1, var4);
            var6 = af.e();
            if (af.e().B - af.e().bP.a > 0) {
               var5 = var3;
            } else {
               var5 = 1;
            }

            var6.I = var5;
            af.e().ay = new de((String)null, this, 2, (Object)null);
         }
      }

   }
}
