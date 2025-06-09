final class cf implements Runnable {
   final br a;
   private final String b;
   private int c;

   cf(br var1, String var2, int var3) {
      this.a = var1;
      this.b = var2;
      this.c = var3;
   }

   public final void run() {
      br.n = false;
      (new Thread(new ct(this))).start();
      this.a.e = true;
      this.a.d = true;

      try {
         String var4 = this.b;
         int var1 = this.c;
         br var2 = this.a;
         ay var3 = new ay(var4, var1);
         br.a(var2, var3);
         br.a(this.a, br.a(this.a).b());
         this.a.a = br.a(this.a).c();
         var2 = this.a;
         Thread var8 = new Thread(br.b(this.a));
         var2.g = var8;
         this.a.g.start();
         br var9 = this.a;
         s var7 = new s(this.a);
         Thread var11 = new Thread(var7);
         var9.f = var11;
         this.a.f.start();
         this.a.l = System.currentTimeMillis();
         var2 = this.a;
         y var10 = new y((byte)-27);
         br.a(var2, var10);
         ds.c("=======================> gui message cmd = -27 to server");
         this.a.e = false;
         this.a.b.a(this.a.c);
      } catch (Exception var6) {
         try {
            Thread.sleep(500L);
         } catch (InterruptedException var5) {
         }

         if (!br.n && this.a.b != null) {
            this.a.e();
         }
      }

   }
}
