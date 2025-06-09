import java.io.InputStream;
import java.util.Random;
import java.util.Vector;

public class ad {
   Vector a;
   private Random b;
   private int[] c;

   public ad() {
   }

   public ad(int var1, int var2, int var3, int var4) {
      this.b = new Random();
      this.a = new Vector();
      this.c = new int[]{16711680, 16776960, 65280, 16777215, 255, 65535, 15790320, 12632256};

      for(var3 = 0; var3 < 72; ++var3) {
         this.a.addElement(new aj(var1, var2, Math.abs(this.b.nextInt() % 8) + 3, var3 * 5, this.c[Math.abs(this.b.nextInt() % this.c.length)]));
      }

   }

   public static InputStream a(String var0) {
      return "".getClass().getResourceAsStream(var0);
   }
}
