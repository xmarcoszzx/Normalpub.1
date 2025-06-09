import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public final class en {
   public static int b = 1;
   public Graphics a;

   public static int a(float var0, int var1, int var2) {
      float var5 = 255.0F;
      float var6 = 0.0F;
      ds.c("blend color");
      float var3 = (float)(var2 >> 16 & 255);
      float var4 = (float)(var2 >> 8 & 255);
      var0 = (float)(var2 & 255);
      var3 *= 0.4F;
      var4 *= 0.4F;
      float var7 = var0 * 0.4F;
      var0 = var3;
      if (var3 > 255.0F) {
         var0 = 255.0F;
      }

      var3 = var0;
      if (var0 < 0.0F) {
         var3 = 0.0F;
      }

      var0 = var4;
      if (var4 > 255.0F) {
         var0 = 255.0F;
      }

      var4 = var0;
      if (var0 < 0.0F) {
         var4 = 0.0F;
      }

      if (var7 < 0.0F) {
         var0 = var6;
      } else {
         var0 = var7;
      }

      if (var0 > 255.0F) {
         var0 = var5;
      }

      var2 = (int)var3;
      var1 = (int)var4;
      return (int)var0 & 255 | -16777216 | var2 << 16 | var1 << 8;
   }

   public static int a(Image var0) {
      return var0.getWidth() / b;
   }

   public static int b(Image var0) {
      return var0.getHeight() / b;
   }

   public static int c(Image var0) {
      return var0.getWidth();
   }

   public static int d(Image var0) {
      return var0.getHeight();
   }

   public final int a() {
      return this.a.getTranslateX() / b;
   }

   public final void a(int var1) {
      this.a.setColor(var1);
   }

   public final void a(int var1, int var2) {
      int var3 = b;
      int var4 = b;
      this.a.translate(var3 * var1, var4 * var2);
   }

   public final void a(int var1, int var2, int var3, int var4) {
      int var7 = b;
      int var6 = b;
      int var5 = b;
      int var8 = b;
      this.a.drawLine(var7 * var1, var6 * var2, var5 * var3, var8 * var4);
   }

   public final void a(int var1, int var2, int var3, int var4, int var5) {
      int var9 = b;
      int var7 = b;
      int var8 = b;
      int var6 = b;
      this.a.setColor(var5);
      this.a.fillRect(var9 * var1, var7 * var2, var8 * var3, var6 * var4);
   }

   public final void a(int var1, int var2, int var3, int var4, int var5, int var6) {
      int var7 = b;
      var5 = b;
      var6 = b;
      int var8 = b;
      this.a.fillArc(var1 * var7, var2 * var5, var3 * var6, var4 * var8, 0, 360);
   }

   public final void a(Image var1, float var2, float var3, int var4) {
      if (var1 != null) {
         float var6 = (float)b;
         float var5 = (float)b;
         this.a.drawImage(var1, (int)(var6 * var2), (int)(var5 * var3), var4);
      }

   }

   public final void a(Image var1, int var2, int var3, int var4) {
      if (var1 != null) {
         int var5 = b;
         int var6 = b;
         this.a.drawImage(var1, var5 * var2, var6 * var3, var4);
      }

   }

   public final void a(Image var1, int var2, int var3, int var4, int var5) {
      for(var2 = 0; var2 < var4 / a(var1) + 1; ++var2) {
         for(var3 = 0; var3 < var5 / b(var1) + 1; ++var3) {
            this.a.drawImage(var1, a(var1) * var2 + 0, b(var1) * var3 + 0, 0);
         }
      }

   }

   public final void a(Image var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
      if (var1 != null) {
         int var15 = b;
         int var12 = b;
         int var11 = b;
         int var13 = b;
         int var14 = b;
         int var10 = b;
         this.a.drawRegion(var1, var2 * var11, var3 * var13, var4 * var14, var5 * var10, var6, var7 * var15, var8 * var12, var9);
      }

   }

   public final int b() {
      return this.a.getTranslateY() / b;
   }

   public final void b(int var1, int var2, int var3, int var4) {
      this.d(var1, var2, var3, var4);
   }

   public final void b(Image var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
      if (var1 != null) {
         this.a(var1, 0, var3, var4, var5, var6, var7, var8, var9);
      }

   }

   public final int c() {
      return this.a.getClipX();
   }

   public final void c(int var1, int var2, int var3, int var4) {
      this.d(var1, var2, 1, var4);
      this.d(var1 + var3, var2, 1, var4);
      this.d(var1, var2, var3, 1);
      this.d(var1, var2 + var4, var3 + 1, 1);
   }

   public final int d() {
      return this.a.getClipY();
   }

   public final void d(int var1, int var2, int var3, int var4) {
      int var8 = b;
      int var7 = b;
      int var6 = b;
      int var5 = b;
      this.a.fillRect(var8 * var1, var7 * var2, var6 * var3, var5 * var4);
   }

   public final int e() {
      return this.a.getClipWidth();
   }

   public final void e(int var1, int var2, int var3, int var4) {
      int var6 = b;
      int var7 = b;
      int var8 = b;
      int var5 = b;
      this.a.setClip(var6 * var1, var7 * var2, var8 * var3, var5 * var4);
   }

   public final int f() {
      return this.a.getClipHeight();
   }
}
