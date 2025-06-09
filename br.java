import java.io.DataInputStream;
import java.io.DataOutputStream;

public final class br implements db {
   public static boolean n;
   private static br o = new br();
   private static br p = new br();
   private static int x;
   public DataInputStream a;
   public bd b;
   public boolean c = true;
   public boolean d;
   public boolean e;
   public Thread f;
   public Thread g;
   public int h;
   public int i;
   boolean j;
   public byte[] k = null;
   long l;
   public String m = "";
   private DataOutputStream q;
   private ay r;
   private final dw s = new dw(this);
   private Thread t;
   private byte u;
   private byte v;
   private long w = 0L;

   private byte a(byte var1) {
      byte[] var4 = this.k;
      byte var3 = this.v;
      this.v = (byte)(var3 + 1);
      byte var2 = (byte)(var4[var3] & 255 ^ var1 & 255);
      if (this.v >= this.k.length) {
         this.v = (byte)(this.v % this.k.length);
      }

      return var2;
   }

   static byte a(br var0, byte var1) {
      byte[] var4 = var0.k;
      byte var3 = var0.u;
      var0.u = (byte)(var3 + 1);
      byte var2 = (byte)(var4[var3] & 255 ^ var1 & 255);
      if (var0.u >= var0.k.length) {
         var0.u = (byte)(var0.u % var0.k.length);
      }

      return var2;
   }

   static ay a(br var0) {
      return var0.r;
   }

   public static br a() {
      return o;
   }

   static void a(br var0, ay var1) {
      var0.r = var1;
   }

   static void a(br var0, DataOutputStream var1) {
      var0.q = var1;
   }

   static void a(br var0, y var1) {
      var0.b(var1);
   }

   public static br b() {
      return p;
   }

   static dw b(br var0) {
      return var0.s;
   }

   private void b(y param1) {
      // $FF: Couldn't be decompiled
   }

   static void c(br var0) {
      var0.f();
   }

   private void f() {
      this.k = null;
      this.u = 0;
      this.v = 0;

      try {
         this.d = false;
         this.e = false;
         if (this.r != null && this.r.a != null) {
            this.r.a();
         }

         this.r = null;
         if (this.q != null) {
            this.q.close();
         }

         this.q = null;
         if (this.a != null) {
            this.a.close();
         }

         this.a = null;
         if (this.g != null) {
            this.g.interrupt();
         }

         this.g = null;
         if (this.f != null) {
            this.f.interrupt();
         }

         this.f = null;
         if (this.c) {
            bs.t = 0;
         }

         System.gc();
         ac.c = false;
      } catch (Exception var2) {
         var2.printStackTrace();
      }

   }

   public final void a(bd var1) {
      this.b = var1;
   }

   public final void a(String var1, int var2) {
      System.out.println(">>connect: " + var1 + ":" + var2);
      if (!this.d && !this.e && l.d() >= this.w) {
         this.w = l.d() + 50L;
         if (this.c) {
            bs.t = -1;
         }

         this.j = false;
         this.f();
         this.t = new Thread(new cf(this, var1, var2));
         this.t.start();
      }

   }

   public final void a(y var1) {
      ++x;
      this.s.a(var1);
   }

   public final void c() {
      dw.a(this.s).removeAllElements();
   }

   public final boolean d() {
      boolean var1;
      if (this.d && this.r != null && this.r.a != null && this.a != null) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public final void e() {
      this.f();
   }
}
