import javax.microedition.lcdui.Image;

public final class df {
   public int a;
   public int b;
   public int c;
   public Image d;

   public df(int var1) {
      Image var2 = ch.a(var1);
      if (var2 != null) {
         this.d = var2;
         this.a = ch.c[var1][0];
         this.b = ch.c[var1][1] / ch.c[var1][2];
         this.c = ch.c[var1][2];
      }

   }

   public df(Image var1, int var2, int var3) {
      if (var1 != null) {
         this.d = var1;
         this.a = var2;
         this.b = var3;
         this.c = var1.getHeight() / var3;
         if (this.c <= 0) {
            this.c = 1;
         }
      }

   }

   public final void a(int param1, int param2, int param3, int param4, int param5, en param6) {
      // $FF: Couldn't be decompiled
   }
}
