import javax.microedition.lcdui.Image;

public final class di {
   public static di A;
   public static di B;
   public static di C;
   public static di D;
   public static di E;
   public static di F;
   public static di G;
   public static di H;
   public static di I;
   public static di J;
   private static String P = " 0123456789+-*='_?.,<>/[]{}!@#$%^&*():aáàảãạâấầẩẫậăắằẳẵặbcdđeéèẻẽẹêếềểễệfghiíìỉĩịjklmnoóòỏõọôốồổỗộơớờởỡợpqrstuúùủũụưứừửữựvxyýỳỷỹỵzwAÁÀẢÃẠĂẰẮẲẴẶÂẤẦẨẪẬBCDĐEÉÈẺẼẸÊẾỀỂỄỆFGHIÍÌỈĨỊJKLMNOÓÒỎÕỌÔỐỒỔỖỘƠỚỜỞỠỢPQRSTUÚÙỦŨỤƯỨỪỬỮỰVXYÝỲỶỸỴZW";
   private static di Q;
   private static di R;
   private static di S;
   private static di T;
   public static di a;
   public static di b;
   public static di c;
   public static di d;
   public static di e;
   public static di f;
   public static di g;
   public static di h;
   public static di i;
   public static di j;
   public static di k;
   public static di l;
   public static di m;
   public static di n;
   public static di o;
   public static di p;
   public static di q;
   public static di r;
   public static di s;
   public static di t;
   public static di u;
   public static di v;
   public static di w;
   public static di x;
   public static di y;
   public static di z;
   private int K;
   private int L;
   private Image M;
   private String N;
   private int[][] O;
   private String U;

   static {
      a = new di(P, "/myfont/tahoma_7b_red.png", "/myfont/tahoma_7b", 0);
      b = new di(P, "/myfont/tahoma_7b_blue.png", "/myfont/tahoma_7b", 0);
      c = new di(P, "/myfont/tahoma_7b_white.png", "/myfont/tahoma_7b", 0);
      d = new di(P, "/myfont/tahoma_7b_yellow.png", "/myfont/tahoma_7b", 0);
      e = new di(P, "/myfont/tahoma_7b_yellow.png", "/myfont/tahoma_7b", 0);
      f = new di(P, "/myfont/tahoma_7b_brown.png", "/myfont/tahoma_7b", 0);
      g = new di(P, "/myfont/tahoma_7b_green2.png", "/myfont/tahoma_7b", 0);
      h = new di(P, "/myfont/tahoma_7b_green.png", "/myfont/tahoma_7b", 0);
      i = new di(P, "/myfont/tahoma_7b_focus.png", "/myfont/tahoma_7b", 0);
      j = new di(P, "/myfont/tahoma_7b_unfocus.png", "/myfont/tahoma_7b", 0);
      k = new di(P, "/myfont/tahoma_7.png", "/myfont/tahoma_7", 0);
      l = new di(P, "/myfont/tahoma_7_blue1.png", "/myfont/tahoma_7", 0);
      m = new di(P, "/myfont/tahoma_7_green2.png", "/myfont/tahoma_7", 0);
      n = new di(P, "/myfont/tahoma_7_yellow.png", "/myfont/tahoma_7", 0);
      o = new di(P, "/myfont/tahoma_7_grey.png", "/myfont/tahoma_7", 0);
      p = new di(P, "/myfont/tahoma_7_red.png", "/myfont/tahoma_7", 0);
      q = new di(P, "/myfont/tahoma_7_blue.png", "/myfont/tahoma_7", 0);
      r = new di(P, "/myfont/tahoma_7_green.png", "/myfont/tahoma_7", 0);
      s = new di(P, "/myfont/tahoma_7_white.png", "/myfont/tahoma_7", 0);
      t = new di(P, "/myfont/tahoma_8b.png", "/myfont/tahoma_8b", -1);
      Q = new di(" 0123456789+-", "/myfont/number_yellow.png", "/myfont/number", 0);
      R = new di(" 0123456789+-", "/myfont/number_red.png", "/myfont/number", 0);
      S = new di(" 0123456789+-", "/myfont/number_green.png", "/myfont/number", 0);
      u = new di(" 0123456789+-", "/myfont/number_gray.png", "/myfont/number", 0);
      T = new di(" 0123456789+-", "/myfont/number_orange.png", "/myfont/number", 0);
      v = R;
      w = c;
      x = Q;
      y = S;
      z = T;
      A = l;
      B = p;
      C = n;
      D = r;
      E = o;
      F = n;
      G = g;
      H = s;
      I = h;
      J = l;
   }

   private di(String param1, String param2, String param3, int param4) {
      // $FF: Couldn't be decompiled
   }

   public final int a() {
      return this.L;
   }

   public final int a(String var1) {
      int var3 = 0;

      int var2;
      for(var2 = 0; var3 < var1.length(); ++var3) {
         int var5 = this.N.indexOf(var1.charAt(var3));
         int var4 = var5;
         if (var5 == -1) {
            var4 = 0;
         }

         var2 += this.O[var4][2] + this.K;
      }

      return var2;
   }

   public final void a(en var1, String var2, int var3, int var4, int var5) {
      int var7 = var2.length();
      if (var5 != 0) {
         if (var5 == 1) {
            var3 -= this.a(var2);
         } else {
            var3 -= this.a(var2) >> 1;
         }
      }

      byte var6 = 0;
      var5 = var3;

      for(var3 = var6; var3 < var7; ++var3) {
         int var8 = this.N.indexOf(var2.charAt(var3));
         if (var8 == -1) {
            var8 = 0;
         }

         if (var8 >= 0) {
            var1.a(this.M, this.O[var8][0], this.O[var8][1], this.O[var8][2], this.O[var8][3], 0, var5, var4, 20);
         }

         var5 += this.O[var8][2] + this.K;
      }

   }

   public final void a(en var1, String var2, int var3, int var4, int var5, di var6) {
      int var8 = var2.length();
      if (var5 != 0) {
         if (var5 == 1) {
            var3 -= this.a(var2);
         } else {
            var3 -= this.a(var2) >> 1;
         }
      }

      for(var5 = 0; var5 < var8; ++var5) {
         int var7 = this.N.indexOf(var2.charAt(var5));
         if (var7 == -1) {
            var7 = 0;
         }

         if (var7 >= 0) {
            if (!main.a.a) {
               var1.a(var6.M, this.O[var7][0], this.O[var7][1], this.O[var7][2], this.O[var7][3], 0, var3 + 1, var4, 20);
               var1.a(var6.M, this.O[var7][0], this.O[var7][1], this.O[var7][2], this.O[var7][3], 0, var3, var4 + 1, 20);
            }

            var1.a(this.M, this.O[var7][0], this.O[var7][1], this.O[var7][2], this.O[var7][3], 0, var3, var4, 20);
         }

         var3 += this.O[var7][2] + this.K;
      }

   }

   public final String[] a(String var1, int var2) {
      byte var6 = 0;
      el var9 = new el("vLine");
      String var7 = "";

      int var4;
      for(int var3 = 0; var3 < var1.length(); var3 = var4 + 1) {
         if (var1.charAt(var3) != '\n' && var1.charAt(var3) != '\b') {
            String var8 = var7 + var1.charAt(var3);
            if (this.a(var8) > var2) {
               for(var4 = var8.length() - 1; var4 >= 0 && var8.charAt(var4) != ' '; --var4) {
               }

               int var5 = var4;
               if (var4 < 0) {
                  var5 = var8.length() - 1;
               }

               var9.addElement(var8.substring(0, var5));
               var3 = var3 - (var8.length() - var5) + 1;
               var8 = "";
            }

            var4 = var3;
            var7 = var8;
            if (var3 == var1.length() - 1) {
               var4 = var3;
               var7 = var8;
               if (!var8.trim().equals("")) {
                  var9.addElement(var8);
                  var4 = var3;
                  var7 = var8;
               }
            }
         } else {
            var9.addElement(var7);
            var7 = "";
            var4 = var3;
         }
      }

      String[] var10 = new String[var9.size()];

      for(var2 = var6; var2 < var9.size(); ++var2) {
         var10[var2] = var9.elementAt(var2).toString();
      }

      return var10;
   }

   public final void b(en var1, String var2, int var3, int var4, int var5) {
      this.a(var1, var2, var3, var4, 2);
   }

   public final void b(en var1, String var2, int var3, int var4, int var5, di var6) {
      this.a(var1, var2, var3, var4, var5, var6);
   }
}
