public final class cb implements b {
   public static el l = new el("v Message");
   public int a;
   public int b;
   public int c;
   public String d;
   public long e;
   public String[] f;
   public byte g;
   public byte h;
   public int i;
   public int j;
   public String[] k;
   private int m;

   public static void a(cb var0, int var1, boolean var2) {
      int var3 = 0;

      while(true) {
         if (var3 >= l.size()) {
            if (var1 == -1) {
               l.addElement(var0);
            } else {
               l.insertElementAt(var0, 0);
            }

            if (l.size() > 20) {
               l.removeElementAt(l.size() - 1);
            }
            break;
         }

         cb var4 = (cb)l.elementAt(var3);
         if (var4.a == var0.a) {
            l.removeElement(var4);
            if (!var2) {
               l.insertElementAt(var0, var3);
            } else {
               l.insertElementAt(var0, 0);
            }
            break;
         }

         if (var4.j != 0 && var4.i == var4.j) {
            l.removeElement(var4);
         }

         ++var3;
      }

   }

   public final void a() {
      if (this.e != 0L) {
         this.m = (int)(System.currentTimeMillis() / 1000L - this.e);
      }

   }

   public final void a(int var1, Object var2) {
   }

   public final void a(en var1, int var2, int var3) {
      di var4 = di.f;
      if (this.h == 0) {
         var4 = di.a;
      } else if (this.h == 1) {
         var4 = di.h;
      } else if (this.h == 2) {
         var4 = di.g;
      }

      if (this.b == 0) {
         var4.a(var1, this.d, var2 + 3, var3 + 1, 0);
         String var5;
         if (this.g == 0) {
            di var6 = di.o;
            StringBuffer var7 = new StringBuffer(String.valueOf(this.f[0]));
            if (this.f.length > 1) {
               var5 = "...";
            } else {
               var5 = "";
            }

            var6.a(var1, var7.append(var5).toString(), var2 + 3, var3 + 11, 0);
         } else {
            di var9 = di.p;
            StringBuffer var8 = new StringBuffer(String.valueOf(this.f[0]));
            if (this.f.length > 1) {
               var5 = "...";
            } else {
               var5 = "";
            }

            var9.a(var1, var8.append(var5).toString(), var2 + 3, var3 + 11, 0);
         }

         di.o.a(var1, ai.c(this.m) + " " + aw.dI, main.a.G.ag + var2 - 3, var3 + 1, 1);
      }

      if (this.b == 1) {
         var4.a(var1, this.d + " (" + this.i + "/" + this.j + ")", var2 + 3, var3 + 1, 0);
         di.q.a(var1, aw.cW + " " + ai.c(this.m) + " " + aw.dI, var2 + 3, var3 + 11, 0);
      }

      if (this.b == 2) {
         var4.a(var1, this.d, var2 + 3, var3 + 1, 0);
         di.q.a(var1, aw.dz, var2 + 3, var3 + 11, 0);
      }

   }
}
