public final class ef {
   public byte a;
   public byte b;
   public byte c;
   public byte d;
   public int e;
   public int f;
   public int g;
   public String h;
   public String i;
   public byte j;
   public byte k;
   public af l;
   public aa m;
   public ee[] n;
   int[] o;
   int p;
   long q;
   public ae r;
   private el s;

   public ef() {
      int[] var1 = new int[10];
      var1[5] = 1;
      var1[6] = 1;
      var1[7] = 1;
      var1[8] = 1;
      var1[9] = 1;
      this.o = var1;
      this.p = 0;
      this.s = new el("");
   }

   public static ef a(el var0, int var1) {
      ef var3;
      if (var0 != null) {
         for(int var2 = 0; var2 < var0.size(); ++var2) {
            ef var4 = (ef)var0.elementAt(var2);
            if (var4 != null) {
               var3 = var4;
               if (var4.e == var1) {
                  return var3;
               }
            }
         }
      }

      var3 = null;
      return var3;
   }

   public final void a() {
      this.r = new ae();
      String var4 = "" + "\n|6|" + this.i + "\n--";
      String var5 = var4;
      if (this.n != null) {
         int var1 = 0;

         while(true) {
            int var2 = 0;

            boolean var8;
            while(true) {
               if (var2 >= this.n.length) {
                  var8 = false;
                  break;
               }

               if (!this.n[var2].a().equals("") && var1 == this.n[var2].b) {
                  var8 = true;
                  break;
               }

               ++var2;
            }

            var5 = var4;
            if (!var8) {
               break;
            }

            if (var1 == 0) {
               var5 = var4 + "\n|6|2|--" + aw.h + "--";
            } else {
               var5 = var4 + "\n|6|2|--" + aw.g + " Lv." + var1 + "--";
            }

            for(int var3 = 0; var3 < this.n.length; var5 = var4) {
               String var7 = this.n[var3].a();
               var4 = var5;
               if (!var7.equals("")) {
                  var4 = var5;
                  if (var1 == this.n[var3].b) {
                     String var6 = "1";
                     if (this.j == 0) {
                        var4 = "2";
                     } else {
                        var4 = var6;
                        if (this.n[var3].b != 0) {
                           if (this.k == 0) {
                              var4 = "2";
                           } else {
                              var4 = var6;
                              if (this.j < this.n[var3].b) {
                                 var4 = "2";
                              }
                           }
                        }
                     }

                     var4 = var5 + "\n|" + var4 + "|1|" + var7;
                  }
               }

               ++var3;
            }

            var4 = var5;
            if (var8) {
               ++var1;
               var4 = var5;
            }
         }
      }

      ae var9 = this.r;
      var9.a = aq.d;
      var9.e = aq.b;
      var9.d = di.k.a(var5, var9.a - 8);
      var9.b = 10000000;
      var9.i = null;
      var9.g = var9.d.length * 12;
      var9.f = aq.c;
      var9.t = 10;
      var9.h = var9.g - aq.e;
      if (var9.h < 0) {
         var9.h = 0;
      }

   }

   public final void a(byte var1) {
      this.j = var1;
      this.a();
   }

   public final void a(byte var1, byte var2) {
      this.b = var1;
      this.c = var2;
   }

   public final void a(en var1, int var2, int var3) {
      int var4;
      int var5;
      be var6;
      if (this.b == this.c && this.s.size() == 0) {
         var5 = ds.b(1, 5);

         for(var4 = 0; var4 < var5; ++var4) {
            var6 = new be();
            var6.a = ds.b(5, 25);
            var6.b = ds.b(5, 25);
            var6.d = ds.b(0, 8) * var4;
            var6.e = 0;
            var6.c = -1;
            this.s.addElement(var6);
         }
      }

      for(var4 = 0; var4 < this.s.size(); var4 = var5 + 1) {
         var6 = (be)this.s.elementAt(var4);
         var5 = var4;
         if (var6 != null) {
            if (var6.e < var6.d) {
               ++var6.e;
            }

            var5 = var4;
            if (var6.e >= var6.d) {
               var6.c = main.a.w / 3 % (aq.a.c + 1);
               if (var6.c >= aq.a.c) {
                  this.s.removeElementAt(var4);
                  var5 = var4 - 1;
               } else {
                  aq.a.a(var6.c, var6.a + var2, var6.b + var3, 0, 3, var1);
                  var5 = var4;
               }
            }
         }
      }

   }

   public final void b(byte var1) {
      this.k = var1;
      this.a();
   }
}
