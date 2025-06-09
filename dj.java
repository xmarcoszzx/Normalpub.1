final class dj implements Runnable {
   private int a;
   private boolean b;
   private ar c;

   dj(ar var1) {
      this.c = var1;
      this.a = 0;
      this.b = false;
   }

   public final void run() {
      while(true) {
         boolean var10001;
         try {
            if (!ar.d || main.a.E != ar.a) {
               break;
            }
         } catch (Exception var9) {
            var10001 = false;
            break;
         }

         try {
            this.c.c = 2;
         } catch (Exception var7) {
            var10001 = false;
            break;
         }

         while(true) {
            try {
               if (this.a >= 7 || this.c.b == 5) {
                  break;
               }
            } catch (Exception var8) {
               var10001 = false;
               return;
            }

            try {
               ar.a(this.c, this.a);
               ++this.a;
               Thread.sleep(300L);
            } catch (Exception var6) {
               var10001 = false;
               return;
            }
         }

         label90: {
            try {
               if (this.a != 7) {
                  break label90;
               }

               Thread.sleep(800L);
               ar.a(ar.a());
               Thread.sleep(4000L);
               if (ar.e) {
                  this.c.e();
                  Thread.yield();
                  break;
               }
            } catch (Exception var5) {
               var10001 = false;
               break;
            }

            try {
               if (this.c.b == 5) {
                  ar.a(ar.a());
                  this.a = 0;
               }
            } catch (Exception var4) {
               var10001 = false;
               break;
            }

            try {
               Thread.sleep(1000L);
            } catch (Exception var3) {
               var10001 = false;
               break;
            }
         }

         try {
            if (this.c.b == 5 && this.a == 0 && !this.b) {
               this.b = true;
               ar.a(ar.a());
            }
         } catch (Exception var2) {
            var10001 = false;
            break;
         }
      }

   }
}
