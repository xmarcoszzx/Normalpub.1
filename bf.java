public final class bf {
   public et a;
   public short b;
   public int c;
   public long d;
   public int e;
   public long f;
   public int g;
   public int h;
   public int i;
   public boolean j = false;
   public short k;
   public String l;
   public short m;

   public final String a() {
      String var2;
      if (this.e % 1000 == 0) {
         var2 = String.valueOf(this.e / 1000);
      } else {
         int var1 = this.e % 1000;
         StringBuffer var3 = (new StringBuffer(String.valueOf(this.e / 1000))).append(".");
         if (var1 % 100 == 0) {
            var1 /= 100;
         } else {
            var1 /= 10;
         }

         var2 = var3.append(var1).toString();
      }

      return var2;
   }
}
