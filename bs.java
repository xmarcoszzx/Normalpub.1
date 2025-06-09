import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import main.GameMidlet;

public final class bs extends bb implements b {
   private static String D = "Vũ trụ 1:dragon1.teamobi.com:14445:0:0:0,Vũ trụ 2:dragon2.teamobi.com:14445:0:0:0,Vũ trụ 3:dragon3.teamobi.com:14445:0:0:0,Vũ trụ 4:dragon4.teamobi.com:14445:0:0:0,Vũ trụ 5:dragon5.teamobi.com:14445:0:0:0,Vũ trụ 6:dragon6.teamobi.com:14445:0:0:0,Vũ trụ 7:dragon7.teamobi.com:14445:0:0:0,Vũ trụ 8:dragon10.teamobi.com:14446:0:0:0,Vũ trụ 9:dragon10.teamobi.com:14447:0:0:0,Vũ trụ 10:dragon10.teamobi.com:14445:0:0:0,Vũ trụ 11:dragon11.teamobi.com:14445:0:0:0,Võ đài liên vũ trụ:dragonwar.teamobi.com:20000:0:0:0,Universe 1:dragon.indonaga.com:14445:1:0:0,Naga:dragon.indonaga.com:14446:2:0:0,0,0";
   private static String E = "Vũ trụ 1:112.213.94.23:14445:0:0:0,Vũ trụ 2:210.211.109.199:14445:0:0:0,Vũ trụ 3:112.213.85.88:14445:0:0:0,Vũ trụ 4:27.0.12.164:14445:0:0:0,Vũ trụ 5:27.0.12.16:14445:0:0:0,Vũ trụ 6:27.0.12.173:14445:0:0:0,Vũ trụ 7:112.213.94.223:14445:0:0:0,Vũ trụ 8:27.0.14.66:14446:0:0:0,Vũ trụ 9:27.0.14.66:14447:0:0:0,Vũ trụ 10:27.0.14.66:14445:0:0:0,Vũ trụ 11:112.213.85.35:14445:0:0:0,Võ đài liên vũ trụ:27.0.12.173:20000:0:0:0,Universe 1:52.74.230.22:14445:1:0:0,Naga:52.74.230.22:14446:2:0:0,0,0";
   private static String F = "Naga:dragon.indonaga.com:14446:2:0:0,2,0";
   private static String G = "Naga:52.74.230.22:14446:2:0:0,2,0";
   private static String H = "Universe 1:dragon.indonaga.com:14445:1:0:0,1,0";
   private static String I = "Universe 1:52.74.230.22:14445:1:0:0,1,0";
   private static int J;
   private static long K;
   private static String L;
   private static de M;
   private static String N;
   public static String[] a;
   public static byte b;
   public static boolean c;
   public static byte[] d;
   public static byte[] e;
   public static af[] f;
   public static boolean g;
   public static byte[] h;
   public static byte[] i;
   public static String j;
   public static boolean k;
   public static String l;
   public static boolean m;
   public static int n;
   public static boolean o;
   public static int p;
   public static int q;
   public static int r;
   public static boolean s;
   public static int t;
   public static boolean u;
   public static boolean v;
   public static String w;
   private static String[] x;
   private static short[] y;
   private static int z;
   private de[] A;
   private de B;
   private int C;

   static {
      j = E;
      L = "NRlink3";
      s = false;
      t = -1;
      v = true;
      w = "svselect";
      N = "NRlink_extra";
   }

   public bs() {
      System.getProperty("com.sonyericsson.imei");
      this.n();
      if (!main.a.e) {
         z = 0;
         this.o();
      }

      p.a(-1, (int)-1);
      p.j = 100;
      p.k = 200;
      if (this.B == null) {
         this.B = new de("Gọi hotline", this, 13, (Object)null);
         this.B.j = main.a.A - 75;
         if (l.c == 1 && !main.a.e) {
            this.B.k = main.a.B - 20;
         } else {
            this.B.k = 8;
         }
      }

      j = E;
      if (l.c == 1) {
         j = E;
      } else {
         j = D;
      }

   }

   public static void a() {
      a(j);
   }

   public static void a(int var0, boolean var1) {
      n = var0;
      if (var1) {
         av.a(w, n);
         ds.b("2>>>saveRMSInt:  RMS_svselect == " + n);
      }

   }

   public static void a(String var0) {
      String[] var2 = ds.a(var0.trim(), ",", 0);
      ds.c(">>> getServerList= " + var0);
      aw.a(Byte.parseByte(var2[var2.length - 2]));
      a = new String[var2.length - 2];
      x = new String[var2.length - 2];
      y = new short[var2.length - 2];
      d = new byte[var2.length - 2];
      h = new byte[var2.length - 2];
      i = new byte[var2.length - 2];

      for(int var1 = 0; var1 < var2.length - 2; ++var1) {
         String[] var6 = ds.a(var2[var1].trim(), ":", 0);
         a[var1] = var6[0];
         x[var1] = var6[1];
         y[var1] = Short.parseShort(var6[2]);
         d[var1] = Byte.parseByte(var6[3].trim());

         try {
            h[var1] = Byte.parseByte(var6[4].trim());
         } catch (Exception var5) {
            h[var1] = 0;
         }

         try {
            i[var1] = Byte.parseByte(var6[5].trim());
         } catch (Exception var4) {
            i[var1] = 0;
         }
      }

      b = Byte.parseByte(var2[var2.length - 1]);
      ds.c(">>> getServerList= serverPriority: " + b);
      p();
   }

   public static void b(en var0) {
   }

   public static void e() {
   }

   public static void f() {
      // $FF: Couldn't be decompiled
   }

   public static void k() {
      GameMidlet.a = x[n];
      GameMidlet.b = y[n];
      aw.a(d[n]);
      x.i = a[n];
      main.a.b();
   }

   public static void l() {
      boolean var2 = false;
      if (main.a.I == null) {
         main.a.I = new x();
      }

      main.a.I.b();
      String var4 = av.c("userAo" + n);

      boolean var1;
      label55: {
         boolean var3;
         try {
            var3 = av.c("acc").equals("");
         } catch (Exception var7) {
            var1 = false;
            break label55;
         }

         boolean var0;
         if (!var3) {
            var0 = true;
         } else {
            var0 = false;
         }

         try {
            var3 = var4.equals("");
         } catch (Exception var6) {
            var1 = var0;
            break label55;
         }

         var1 = var0;
         if (!var3) {
            var2 = true;
            var1 = var0;
         }
      }

      main.a.b();
      bt.a().c();
      if (!var1 && !var2) {
         main.a.b();
         if (var4 != null && !var4.equals("")) {
            main.a.I.n = true;
            bt.a().a(var4, "", "2.4.6", (byte)1);
         } else {
            bt.a().f("");
         }

         av.a(w, n);
         if (br.a().d) {
            main.a.i();
         } else {
            main.a.a(aw.cL, 8884, (Object)null);
         }
      } else {
         main.a.I.a();
      }

      x.i = a[n];
   }

   public static void m() {
      if (e != null) {
         ByteArrayOutputStream var1 = new ByteArrayOutputStream();
         DataOutputStream var2 = new DataOutputStream(var1);

         boolean var10001;
         try {
            var2.writeByte((byte)e.length);
         } catch (Exception var5) {
            var10001 = false;
            return;
         }

         int var0 = 0;

         while(true) {
            try {
               if (var0 >= e.length) {
                  av.a(N, var1.toByteArray());
                  var2.close();
                  em.e();
                  break;
               }
            } catch (Exception var3) {
               var10001 = false;
               break;
            }

            try {
               var2.writeByte(e[var0]);
               if (e[var0] >= 0 && f != null && f[var0] != null) {
                  var2.writeShort((short)f[var0].bU);
                  var2.writeShort((short)f[var0].bW);
                  var2.writeShort((short)f[var0].bV);
                  var2.writeShort((short)f[var0].bX);
                  var2.writeUTF(f[var0].ag);
               }
            } catch (Exception var4) {
               var10001 = false;
               break;
            }

            ++var0;
         }
      }

   }

   private void n() {
      String var3;
      label54: {
         this.C = 0;
         var3 = av.c("acc");
         if (var3 == null) {
            if (av.b("userAo" + n) == null) {
               break label54;
            }
         } else if (var3.equals("") && av.b("userAo" + n) == null) {
            break label54;
         }

         this.C = 1;
      }

      int var1 = en.b;
      this.A = new de[this.C + 4];
      int var2 = main.a.D - this.A.length * 15 + 28;

      for(var1 = 0; var1 < this.A.length; ++var1) {
         switch(var1) {
         case 0:
            this.A[0] = new de("", this, 3, (Object)null);
            if (var3 == null) {
               this.A[0].b = aw.gg;
               if (av.b("userAo" + n) != null) {
                  this.A[0].b = aw.q;
               }
            } else if (var3.equals("")) {
               this.A[0].b = aw.gg;
               if (av.b("userAo" + n) != null) {
                  this.A[0].b = aw.q;
               }
            } else {
               this.A[0].b = aw.gh + ": " + var3;
               if (this.A[0].b.length() > 23) {
                  this.A[0].b = this.A[0].b.substring(0, 23);
                  de var4 = this.A[0];
                  var4.b = var4.b + "...";
               }
            }
            break;
         case 1:
            if (this.C == 1) {
               this.A[1] = new de("", this, 10100, (Object)null);
               this.A[1].b = aw.gg;
            } else {
               this.A[1] = new de(aw.S, this, 7, (Object)null);
            }
            break;
         case 2:
            if (this.C == 1) {
               this.A[2] = new de(aw.S, this, 7, (Object)null);
            } else {
               this.A[2] = new de("", this, 17, (Object)null);
            }
            break;
         case 3:
            if (this.C == 1) {
               this.A[3] = new de("", this, 17, (Object)null);
            } else {
               this.A[3] = new de(aw.bT, this, 8, (Object)null);
            }
            break;
         case 4:
            this.A[4] = new de(aw.bT, this, 8, (Object)null);
         }

         this.A[var1].k = var2;
         this.A[var1].b();
         this.A[var1].j = (main.a.A - this.A[var1].l) / 2;
         var2 += 30;
      }

   }

   private void o() {
      ds.c("load Screen= " + u + " select= " + z);
      if (u) {
         super.cn = new de("", this, this.A[z].e, (Object)null);
      } else {
         super.cn = M;
      }

   }

   private static void p() {
      int var0 = 0;
      ByteArrayOutputStream var1 = new ByteArrayOutputStream();
      DataOutputStream var2 = new DataOutputStream(var1);

      Exception var10000;
      label53: {
         boolean var10001;
         try {
            var2.writeByte(aw.fA);
            var2.writeByte(a.length);
         } catch (Exception var10) {
            var10000 = var10;
            var10001 = false;
            break label53;
         }

         while(true) {
            try {
               if (var0 >= a.length) {
                  var2.writeByte(b);
                  av.a(L, var1.toByteArray());
                  var2.close();
                  em.e();
                  return;
               }
            } catch (Exception var9) {
               var10000 = var9;
               var10001 = false;
               break;
            }

            try {
               var2.writeUTF(a[var0]);
               var2.writeUTF(x[var0]);
               var2.writeShort(y[var0]);
               var2.writeByte(d[var0]);
            } catch (Exception var8) {
               var10000 = var8;
               var10001 = false;
               break;
            }

            try {
               var2.writeByte(h[var0]);
            } catch (Exception var7) {
               try {
                  var2.writeByte(0);
               } catch (Exception var6) {
                  var10000 = var6;
                  var10001 = false;
                  break;
               }
            }

            try {
               var2.writeByte(i[var0]);
            } catch (Exception var5) {
               try {
                  var2.writeByte(0);
               } catch (Exception var4) {
                  var10000 = var4;
                  var10001 = false;
                  break;
               }
            }

            ++var0;
         }
      }

      Exception var11 = var10000;
      var11.printStackTrace();
   }

   public final void a(int var1, Object var2) {
      ds.c("perform trong ServerListScreen" + var1);
      if (var1 == 1000) {
         main.a.b();
      }

      if (var1 == 1 || var1 == 4) {
         br.a().e();
         v = false;
         u = true;
         t = 0;
         s = false;
         av.a();
         this.b();
      }

      de var5;
      if (var1 == 2) {
         k = false;
         var5 = new de(aw.gc, this, 4, (Object)null);
         M = var5;
         var5.j = main.a.A / 2 - bb.cq / 2;
         M.k = main.a.D + 65;
         super.co = null;
         if (!main.a.e) {
            M.j = main.a.A / 2 - bb.cq / 2;
            M.k = main.a.B - bb.cr - 1;
         }

         super.cn = new de("", this, 4, (Object)null);
         if (!s) {
            bt.a().b((byte)1, (el)null);
            if (!main.a.e) {
               M.n = true;
               super.cn = new de("", this, 4, (Object)null);
            }

            s = true;
         }
      }

      if (var1 == 3) {
         l();
      }

      if (var1 == 10100) {
         if (main.a.I == null) {
            main.a.I = new x();
         }

         main.a.I.b();
         main.a.b();
         bt.a().f("");
         ds.c("tao user ao");
         main.a.i();
         x.i = a[n];
      }

      el var6;
      if (var1 == 5) {
         a();
         if (a.length == 1) {
            return;
         }

         var6 = new el("");

         for(int var3 = 0; var3 < a.length; ++var3) {
            var6.addElement(new de(a[var3], this, 6, (Object)null));
         }

         main.a.F.a(var6);
         if (!main.a.e) {
            main.a.F.b = n;
         }
      }

      if (var1 == 6) {
         a(main.a.F.b, false);
         this.i();
      }

      if (var1 == 7) {
         if (main.a.I == null) {
            main.a.I = new x();
         }

         main.a.I.b();
      }

      if (var1 == 8) {
         boolean var8;
         if (av.d("lowGraphic") == 1) {
            var8 = true;
         } else {
            var8 = false;
         }

         var6 = new el("cau hinh");
         var6.addElement(new de(aw.y, this, 9, (Object)null));
         var6.addElement(new de(aw.z, this, 10, (Object)null));
         main.a.F.a(var6);
         if (var8) {
            main.a.F.b = 0;
         } else {
            main.a.F.b = 1;
         }
      }

      if (var1 == 9) {
         av.a("lowGraphic", 1);
         main.a.a(aw.cL, 8885, (Object)null);
      }

      if (var1 == 10) {
         av.a("lowGraphic", 0);
         main.a.a(aw.cL, 8885, (Object)null);
      }

      if (var1 == 11) {
         if (main.a.I == null) {
            main.a.I = new x();
         }

         main.a.I.b();
         String var7 = av.c("userAo" + n);
         if (var7 != null && !var7.equals("")) {
            main.a.I.n = true;
            main.a.b();
            bt.a().c();
            bt.a().a(var7, "", "2.4.6", (byte)1);
         } else {
            bt.a().f("");
         }

         main.a.b(aw.aB);
         ds.c("tao user ao");
      }

      if (var1 == 12) {
         GameMidlet.f.a();
      }

      if (var1 == 13 && (!s || u)) {
         switch(l.c) {
         case 1:
            l.b();
         }
      }

      if (var1 == 14) {
         de var4 = new de(aw.bm, main.a.ak, 15, (Object)null);
         var5 = new de(aw.bn, main.a.ak, 16, (Object)null);
         main.a.a(aw.gf, var4, var5);
      }

      if (var1 == 15) {
         av.a();
         main.a.a(aw.cL, 8885, (Object)null);
      }

      if (var1 == 16) {
         bp.c();
         main.a.K = null;
      }

      if (var1 == 17) {
         if (main.a.al == null) {
            main.a.al = new eu();
         }

         main.a.al.b();
      }

      if (var1 == 18) {
         main.a.h();
         bp.c();
         if (main.a.al == null) {
            main.a.al = new eu();
         }

         main.a.al.b();
      }

      if (var1 == 19) {
         if (l.c == 1) {
            bp.c();
            main.a.K = null;
         } else {
            t = 0;
            v = true;
         }
      }

   }

   public final void a(en var1) {
      if (!u) {
         var1.a(0);
         var1.d(0, 0, main.a.A, main.a.B);
      } else {
         main.a.c(var1);
      }

      di.s.a(var1, "v2.4.6(" + en.b + ")", main.a.A - 2, 17, 1, di.o);

      try {
         StringBuffer var4;
         if (t == 0) {
            var4 = new StringBuffer(String.valueOf(""));
            var4.append(a[n]).append(" disconnect").toString();
         } else {
            var4 = new StringBuffer(String.valueOf(""));
            var4.append(a[n]).append(" connected").toString();
         }
      } catch (Exception var5) {
      }

      if (s && !u) {
         di.s.a(var1, l, main.a.A - 2, 2, 1, di.o);
      } else if (l.c == 1 && !main.a.e) {
         di.s.a(var1, l, main.a.A - 2, main.a.B - 15, 1, di.o);
      } else {
         di.s.a(var1, l, main.a.A - 2, 2, 1, di.o);
      }

      if (!u) {
         if (!o) {
            var1.a(x.j, main.a.C, main.a.D - 32, 3);
            if (!s) {
               di.c.a(var1, aw.gb, main.a.C, main.a.D + 24, 2);
               if (M != null) {
                  M.a(var1);
               }
            } else {
               if (M != null) {
                  M.a(var1);
               }

               var1.e(0, 0, main.a.A, main.a.B);
               di.c.a(var1, aw.aD + p + "%", main.a.A / 2, main.a.D + 24, 2);
               p.a(p.ai, p.aj, p.ak, (float)(main.a.A / 2 - 50), (float)(main.a.D + 45), 100, 100.0F, var1);
               p.a(p.af, p.ag, p.ah, (float)(main.a.A / 2 - 50), (float)(main.a.D + 45), 100, (float)p, var1);
            }
         }
      } else {
         int var3 = main.a.D - this.A.length * 15 - 15;
         int var2 = var3;
         if (var3 < 25) {
            var2 = 25;
         }

         if (x.j != null) {
            var1.a(x.j, main.a.C, var2, 3);
         }

         var3 = this.A.length;

         for(var2 = 0; var2 < var3; ++var2) {
            this.A[var2].a(var1);
         }

         var1.e(0, 0, main.a.A, main.a.B);
         if (en.b == 1) {
            if (t == -1) {
               if (main.a.w % 20 > 10) {
                  var1.a(p.ae, 0, 14, 7, 7, 0, (main.a.A - di.f.a(this.A[this.C + 2].b) >> 1) - 10, this.A[this.C + 2].k + 10, 0);
               }
            } else {
               var1.a(p.ae, 0, t * 7, 7, 7, 0, (main.a.A - di.f.a(this.A[this.C + 2].b) >> 1) - 10, this.A[this.C + 2].k + 9, 0);
            }
         }
      }

   }

   public final void b() {
      dh.b();
      p.k = 0;
      p.j = 0;
      this.n();
      c = false;
      main.a.I = null;
      String var2 = av.c("ResVersion");
      int var1;
      if (var2 != null && var2 != "") {
         var1 = Integer.parseInt(var2);
      } else {
         var1 = -1;
      }

      if (var1 > 0) {
         u = true;
         main.a.a(0);
      }

      o = true;
      this.A[this.C + 2].b = aw.aI + ": " + a[n];
      super.cn = new de("", this, this.A[z].e, (Object)null);
      this.A[this.C + 1].b = aw.S;
      if (this.A.length == this.C + 4) {
         this.A[this.C + 3].b = aw.bT;
      }

      af.bI = false;
      l.a();
      super.b();
   }

   public final void c() {
      int var1;
      if (m) {
         var1 = J + 1;
         J = var1;
         if (var1 == 50) {
            main.a.ak.i();
            m = false;
         }

         if (J == 100) {
            if (main.a.I == null) {
               main.a.I = new x();
            }

            main.a.I.a();
            bt.a().r();
            m = false;
         }
      }

      for(var1 = 0; var1 < this.A.length; ++var1) {
         if (var1 == z) {
            this.A[var1].n = true;
         } else {
            this.A[var1].n = false;
         }
      }

      ++p.j;
      if (!u && (o || p == 100)) {
         M = null;
      }

      super.c();
      if (!af.bI && u && v && main.a.E == this) {
         if (!br.a().d()) {
            if (l.d() <= K) {
               return;
            }

            a(n, true);
            br.a().e();
            k();
         }

         K = l.d() + 5000L;
      }

   }

   public final void d() {
      int var1 = 0;
      int var2;
      if (main.a.e) {
         if (this.B != null && this.B.c()) {
            this.B.a();
         }

         if (!u) {
            if (M != null && M.c()) {
               M.a();
            }

            super.d();
            return;
         }

         for(var2 = this.A.length; var1 < var2; ++var1) {
            if (this.A[var1] != null && this.A[var1].c()) {
               this.A[var1].a();
            }
         }
      } else {
         if (l.c == 1 && main.a.i[13]) {
            main.a.i[13] = false;
            this.B.a();
         }

         if (u) {
            if (main.a.i[8]) {
               var1 = this.A.length;
               main.a.i[8] = false;
               var2 = z + 1;
               z = var2;
               if (var2 > var1 - 1) {
                  z = 0;
               }

               this.o();
            }

            if (main.a.i[2]) {
               var1 = this.A.length;
               main.a.i[2] = false;
               var2 = z - 1;
               z = var2;
               if (var2 < 0) {
                  z = var1 - 1;
               }

               this.o();
            }
         }
      }

      super.d();
   }

   public final void g() {
      p.k = 0;
      p.j = 0;
      this.n();
      c = false;
      main.a.I = null;
      String var2 = av.c("ResVersion");
      int var1;
      if (var2 != null && var2 != "") {
         var1 = Integer.parseInt(var2);
      } else {
         var1 = -1;
      }

      if (var1 > 0) {
         u = true;
         main.a.a(0);
      }

      o = true;
      this.A[this.C + 2].b = aw.aI + ": " + a[n];
      super.cn = new de("", this, this.A[z].e, (Object)null);
      this.A[this.C + 1].b = aw.S;
      if (this.A.length == this.C + 4) {
         this.A[this.C + 3].b = aw.bT;
      }

      super.b();
   }

   public final void h() {
      if (main.a.ak == null) {
         main.a.ak = new bs();
      }

      r = 0;
      p = 0;
      k = true;
      main.a.ak.j();
      s = false;
      M.n = true;
      super.cn = new de("", this, 2, (Object)null);
   }

   public final void i() {
      main.a.b(aw.aB);
      br.a().e();
      GameMidlet.a = x[n];
      GameMidlet.b = y[n];
      av.a(w, n);
      if (d[n] != aw.fA) {
         aw.a(d[n]);
      }

      x.i = a[n];
      this.n();
      u = true;
      t = -1;
      v = true;
   }

   public final void j() {
      p.j = 0;
      p.k = 0;
      this.n();
      u = false;
      p = 0;
      o = false;
      s = false;
      r = 0;
      af.bI = false;
      if (!u) {
         de var1 = new de(aw.gd, this, 2, (Object)null);
         M = var1;
         var1.n = true;
         M.j = main.a.A / 2 - bb.cq / 2;
         M.k = main.a.D + 45;
         if (M.k > main.a.B - 26) {
            M.k = main.a.B - 26;
         }
      }

      if (!main.a.e) {
         z = 0;
         this.o();
      }

      super.b();
   }
}
