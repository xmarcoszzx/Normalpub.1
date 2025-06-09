import javax.microedition.lcdui.Canvas;
import javax.microedition.lcdui.Display;
import main.GameMidlet;

public abstract class dg extends Canvas implements Runnable {
   public static boolean ao;

   public dg() {
      this.setFullScreenMode(true);
      int var2 = super.getWidth();
      int var1 = super.getHeight();
      if (var2 * var1 >= 2073600) {
         en.b = 4;
      } else if (var2 * var1 >= 691200) {
         en.b = 3;
      } else if (var2 * var1 > 153600) {
         en.b = 2;
      } else {
         en.b = 1;
      }

   }

   public static void a(GameMidlet var0) {
      Display.getDisplay(var0).setCurrent(main.a.h);
   }

   protected abstract void a(int var1, int var2);

   protected abstract void b(int var1, int var2);

   protected abstract void c(int var1, int var2);

   protected abstract void d();

   public int getHeight() {
      System.out.println("DONT USE getHeight, PLEASE USE getHeightz()");
      return -1;
   }

   public int getWidth() {
      System.out.println("DONT USE getWidth, PLEASE USE getWidthz()");
      return -1;
   }

   public final int m() {
      int var1 = super.getWidth();
      int var2 = var1 / en.b;
      byte var3;
      if (var1 % en.b == 0) {
         var3 = 0;
      } else {
         var3 = 1;
      }

      return var3 + var2;
   }

   public final int n() {
      int var1 = super.getHeight();
      int var2 = var1 / en.b;
      byte var3;
      if (var1 % en.b == 0) {
         var3 = 0;
      } else {
         var3 = 1;
      }

      return var3 + var2;
   }

   protected final void pointerDragged(int var1, int var2) {
      this.a(var1 / en.b, var2 / en.b);
   }

   protected final void pointerPressed(int var1, int var2) {
      this.b(var1 / en.b, var2 / en.b);
   }

   protected final void pointerReleased(int var1, int var2) {
      this.c(var1 / en.b, var2 / en.b);
   }

   public void run() {
      try {
         Thread.sleep(100L);
      } catch (Exception var6) {
      }

      ao = true;

      label35:
      while(ao) {
         long var1 = System.currentTimeMillis();
         this.d();
         this.repaint();
         this.serviceRepaints();
         var1 = System.currentTimeMillis() - var1;
         Exception var10000;
         boolean var10001;
         if (var1 < 18L) {
            try {
               while(true) {
                  long var3 = System.currentTimeMillis();
                  Thread.sleep(18L - var1);
                  if (System.currentTimeMillis() - var3 >= 18L - var1) {
                     continue label35;
                  }
               }
            } catch (Exception var7) {
               var10000 = var7;
               var10001 = false;
            }
         } else {
            try {
               Thread.sleep(1L);
               continue;
            } catch (Exception var8) {
               var10000 = var8;
               var10001 = false;
            }
         }

         Exception var5 = var10000;
         var5.printStackTrace();
      }

   }
}
