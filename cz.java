import javax.microedition.lcdui.Image;

public final class cz {
   public static t k = new t("imgNew BgItem");
   public static el l = new el("vKeyNews");
   public static el m = new el("vKeyLast");
   public static byte[] n;
   private static int[] q = new int[]{79, 80, 81, 85, 86, 90, 91, 92, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108};
   public int a;
   public int b;
   public short c;
   public int d;
   public int e;
   public int f;
   public int g;
   public byte h;
   public int[] i;
   public int[] j;
   private int o = 0;
   private int p = 0;

   public static void a() {
      k.clear();
      l.removeAllElements();
      m.removeAllElements();
   }

   public static boolean a(String var0) {
      boolean var2 = false;

      for(int var1 = 0; var1 < l.size(); ++var1) {
         if (((String)l.elementAt(var1)).equals(var0)) {
            var2 = true;
            break;
         }
      }

      return var2;
   }

   private boolean b() {
      boolean var2 = false;

      for(int var1 = 0; var1 < q.length; ++var1) {
         if (this.c == q[var1]) {
            var2 = true;
            break;
         }
      }

      return var2;
   }

   public final void a(en var1) {
      if (!af.bI && (this.c != 279 || p.j().bU < 110)) {
         int var5 = p.j;
         int var4 = p.k;
         Image var14 = (Image)k.get(String.valueOf(this.c));
         if (var14 != null && this.c != 96) {
            if (this.h == 4) {
               this.o = -var5 / 2 + 100;
            }

            if (this.c == 28 && this.h == 3) {
               this.o = -var5 / 3 + 200;
            }

            if ((this.c == 67 || this.c == 68 || this.c == 69 || this.c == 70) && this.h == 3) {
               this.o = -var5 / 3 + 200;
            }

            if (this.b() && this.h < 4) {
               this.o = -(var5 >> 4) + 50;
               this.p = (var4 >> 5) - 15;
            }

            int var3 = this.d + this.f + this.o;
            int var6 = this.e + this.g + this.p;
            int var2;
            int var7;
            int var8;
            int var9;
            int var10;
            if (this.d + this.f + var14.getWidth() + this.o >= var5 && this.d + this.f + this.o <= main.a.A + var5 && this.e + this.g + this.p + var14.getHeight() >= var4 && this.e + this.g + this.p <= main.a.B + var4) {
               int var11 = en.a(var14);
               var7 = en.b(var14);
               int var12 = this.b;
               var9 = this.d;
               int var13 = this.f;
               var8 = this.o;
               var10 = this.e;
               var2 = this.g;
               var1.a(var14, 0, 0, var11, var7, var12, var8 + var9 + var13, this.p + var10 + var2, 0);
               if (this.c == 11 && bv.l != 122) {
                  var1.e(var3, var6 + 24, 48, 14);

                  for(var2 = 0; var2 < 2; ++var2) {
                     var1.a(bv.h, 0, (main.a.w % 8 >> 2) * 24, 24, 24, 0, var3 + var2 * 24, var6 + 24, 0);
                  }

                  var1.e(p.j, p.k, p.d, p.e);
               }
            }

            if (bv.g() && this.c > 137 && this.c != 156 && this.c != 159 && this.c != 157 && this.c != 165 && this.c != 167 && this.c != 168 && this.c != 169 && this.c != 170 && this.c != 238 && bv.c - (this.d + this.f + this.o) >= var5 && bv.c - (this.d + this.f + this.o + var14.getWidth()) <= main.a.A + var5 && this.e + this.g + this.p + var14.getHeight() >= var4 && this.e + this.g + this.p <= main.a.B + var4 && (this.c < 241 || this.c >= 266)) {
               var6 = en.a(var14);
               var4 = en.b(var14);
               var5 = bv.c;
               var2 = this.d;
               var3 = this.f;
               var9 = this.o;
               var7 = en.a(var14);
               var8 = this.e;
               var10 = this.g;
               var1.a(var14, 0, 0, var6, var4, 2, var5 - (var2 + var3 + var9) - var7, this.p + var8 + var10, 0);
            }
         }
      }

   }
}
