final class ct implements Runnable {
   private cf a;

   ct(cf var1) {
      this.a = var1;
   }

   public final void run() {
      try {
         Thread.sleep(20000L);
      } catch (InterruptedException var3) {
      }

      if (this.a.a.e) {
         try {
            br.a(this.a.a).a();
         } catch (Exception var2) {
         }

         br.n = true;
         this.a.a.e = false;
         this.a.a.d = false;
         this.a.a.b.b(this.a.a.c);
      }

   }
}
