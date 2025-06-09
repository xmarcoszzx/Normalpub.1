public final class bu {
   public static boolean a = false;
   public static float b = 0.5F;
   public static int c = 30;
   public static int d = 31;
   public static int e = 32;
   public static int f = 33;
   public static int g = 34;
   public static int h = 35;
   public static int i = 36;
   public static int j = 37;
   public static int k = 38;
   private static bu l;

   public static bu a() {
      if (l == null) {
         l = new bu();
      }

      return l;
   }

   public static void f() {
      int var0 = 0;
      if (main.a.I.n && af.e().aD != null && af.e().aD.c >= 2) {
         g.G = new String[]{aw.i, aw.bS, aw.bR, aw.bQ, aw.aF, aw.bP, aw.ap, aw.bT, aw.S, aw.H};
         if (af.e().bO) {
            g.G = new String[]{aw.i, aw.bS, aw.bR, aw.w, aw.bQ, aw.aF, aw.bP, aw.ap, aw.bT, aw.S, aw.H};
         }
      } else {
         g.G = new String[]{aw.i, aw.bS, aw.bR, aw.bQ, aw.aF, aw.bP, aw.ap, aw.bT, aw.S};
         if (af.e().bO) {
            g.G = new String[]{aw.i, aw.bS, aw.bR, aw.w, aw.bQ, aw.aF, aw.bP, aw.ap, aw.bT, aw.S};
         }
      }

      if (a) {
         String[] var1;
         for(var1 = new String[g.G.length + 1]; var0 < g.G.length; ++var0) {
            var1[var0] = g.G[var0];
         }

         var1[g.G.length] = aw.d;
         g.G = var1;
      }

   }

   public static void g() {
      String var0;
      if (p.aO == 0) {
         var0 = "[  ]   " + aw.E;
      } else {
         var0 = "[x]   " + aw.F;
      }

      if (!main.a.e) {
         if (!p.bV) {
            var0 = "[  ]   " + aw.bW;
         } else {
            var0 = "[x]   " + aw.bW;
         }
      }

      String var1;
      if (af.cW) {
         var1 = "[x]   " + aw.ca.trim();
      } else {
         var1 = "[  ]   " + aw.ca.trim();
      }

      String var2;
      if (af.cX) {
         var2 = "[x]   " + aw.cb.trim();
      } else {
         var2 = "[  ]   " + aw.cb.trim();
      }

      String var3;
      if (main.a.aj) {
         var3 = "[x]   " + aw.fB.trim();
      } else {
         var3 = "[  ]   " + aw.fB.trim();
      }

      String var4;
      if (main.a.a) {
         var4 = "[x]   " + aw.y.trim();
      } else {
         var4 = "[  ]   " + aw.y.trim();
      }

      g.H = new String[]{var1, var2, var3, var4, var0};
   }

   public static void h() {
      br.a().e();
      main.a.G.A();
      main.a.I.f();
      main.a.I.b();
   }

   public final void b() {
      if (af.cW) {
         av.a("isPaintAura", 0);
         af.cW = false;
      } else {
         av.a("isPaintAura", 1);
         af.cW = true;
      }

      g();
   }

   public final void c() {
      if (!main.a.e) {
         boolean var1;
         if (p.bV) {
            var1 = false;
         } else {
            var1 = true;
         }

         p.bV = var1;
         if (var1) {
            av.a("serverchat", 0);
         } else {
            av.a("serverchat", 1);
         }

         g();
      } else {
         if (p.aO == 0) {
            p.aO = 1;
            av.a("analog", p.aO);
            p.m();
         } else {
            p.aO = 0;
            av.a("analog", p.aO);
            p.m();
         }

         g();
      }

   }

   public final void d() {
      if (main.a.a) {
         av.a("lowGraphic", 0);
         main.a.a(aw.cL, 8885, (Object)null);
      } else {
         av.a("lowGraphic", 1);
         main.a.a(aw.cL, 8885, (Object)null);
      }

      g();
   }

   public final void e() {
      if (af.cX) {
         av.a("isPaintAura2", 0);
         af.cX = false;
      } else {
         av.a("isPaintAura2", 1);
         af.cX = true;
      }

      g();
   }
}
