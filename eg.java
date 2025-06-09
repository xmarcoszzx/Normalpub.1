import javax.microedition.lcdui.Image;

public final class eg {
   public Image a;
   public int b;
   public int c;
   public int d;

   public eg(Image var1, int var2) {
      this.a = var1;
      this.b = var2;
      this.c = 0;
      this.d = 0;
   }

   public final void a(en var1, int var2, int var3, int var4, int var5) {
      var1.b(this.a, 0, 0, en.a(this.a), en.b(this.a), var2, var3, var4, var5);
      if (main.a.w % 1000 == 0) {
         ++this.c;
         this.d = this.c;
      }

   }

   public final void a(en var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      if (en.a(this.a) != 1) {
         var1.b(this.a, 0, var3 * var6, var6, var7, var2, var4, var5, var8);
         if (main.a.w % 1000 == 0) {
            ++this.c;
            this.d = this.c;
         }
      }

   }
}
