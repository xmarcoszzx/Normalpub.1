import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.Display;
import javax.microedition.lcdui.Image;
import javax.microedition.lcdui.TextBox;
import main.GameMidlet;

public final class cd implements b {
   private static int D;
   private static int F = 11;
   private static Image G = l.b("/mainImage/myTexture2der.png");
   private static Image I = l.b("/mainImage/myTexture2dtf.png");
   public static boolean g;
   private static int m = 2;
   private static final int[] n = new int[]{18, 14, 11, 9, 6, 4, 2};
   private static int o = 0;
   private static String[] p = new String[]{" 0", ".,@?!_1\"/$-():*+<=>;%&~#%^&*{}[];'/1", "abc2áàảãạâấầẩẫậăắằẳẵặ2", "def3đéèẻẽẹêếềểễệ3", "ghi4íìỉĩị4", "jkl5", "mno6óòỏõọôốồổỗộơớờởỡợ6", "pqrs7", "tuv8úùủũụưứừửữự8", "wxyz9ýỳỷỹỵ9", "*", "#"};
   private static String[] q = new String[]{"0", "1", "abc2", "def3", "ghi4", "jkl5", "mno6", "pqrs7", "tuv8", "wxyz9", "0", "0"};
   private int A = 0;
   private int B = 10;
   private int C = 0;
   private int E = 0;
   private boolean H = true;
   public int a;
   public int b;
   public int c;
   public int d;
   public boolean e;
   public String f = "";
   public boolean h;
   public String i = "";
   public de j;
   public boolean k = true;
   private boolean l = false;
   private String r = "";
   private String s = "";
   private String t = "";
   private int u = 0;
   private int v = 0;
   private int w = 500;
   private int x = 0;
   private int y = -1984;
   private int z = 0;

   static {
      int[] var10000 = new int[]{49, 69};
      var10000 = new int[]{52, 68};
      var10000 = new int[]{53, 71};
      var10000 = new int[]{55, 67};
      var10000 = new int[]{57, 77};
      var10000 = new int[]{42, 128};
      var10000 = new int[]{33, 113};
      var10000 = new int[]{63, 97};
      var10000 = new int[]{44, 108};
   }

   public cd() {
      this.r = "";
      o = di.t.a() + 1;
      this.j = new de(aw.bj, this, 1000, (Object)null);
      D = 0;
      if (av.d("qwerty") == 1) {
         g = true;
      }

   }

   private void d(int var1) {
      int var2 = var1;
      if (var1 == 432) {
         var2 = 119;
      }

      if ((this.C != 2 && this.C != 3 || var2 >= 48 && var2 <= 57 || var2 >= 65 && var2 <= 90 || var2 >= 97 && var2 <= 122) && this.r.length() < this.w) {
         String var4 = this.r.substring(0, this.u) + (char)var2;
         String var3 = var4;
         if (this.u < this.r.length()) {
            var3 = var4 + this.r.substring(this.u, this.r.length());
         }

         this.r = var3;
         ++this.u;
         this.f();
         this.e();
      }

   }

   private void e() {
      if (this.C == 2) {
         this.t = this.s;
      } else {
         this.t = this.r;
      }

      if (this.x < 0 && di.t.a(this.t) + this.x < this.c - 6 - 13) {
         this.x = this.c - 10 - di.t.a(this.t);
      }

      if (this.x + di.t.a(this.t.substring(0, this.u)) <= 0) {
         this.x = -di.t.a(this.t.substring(0, this.u));
         this.x += 40;
      } else if (this.x + di.t.a(this.t.substring(0, this.u)) >= this.c - 22) {
         this.x = this.c - 10 - di.t.a(this.t.substring(0, this.u)) - 12;
      }

      if (this.x > 0) {
         this.x = 0;
      }

   }

   private void f() {
      if (this.C == 2) {
         this.s = "";

         for(int var1 = 0; var1 < this.r.length(); ++var1) {
            this.s = this.s + "*";
         }

         if (this.z > 0 && this.u > 0) {
            this.s = this.s.substring(0, this.u - 1) + this.r.charAt(this.u - 1) + this.s.substring(this.u, this.s.length());
         }
      }

   }

   public final void a() {
      TextBox var1 = new TextBox(this.i, "", this.w, 0);
      var1.addCommand(new Command(aw.br, 4, 0));
      var1.addCommand(new Command(aw.bu, 3, 0));
      var1.setCommandListener(new m(this, var1));

      try {
         if (this.C == 2) {
            var1.setConstraints(65536);
         } else if (this.C == 1) {
            var1.setConstraints(2);
         } else {
            var1.setConstraints(0);
         }
      } catch (Exception var3) {
         var3.printStackTrace();
      }

      var1.setString(this.r);
      var1.setMaxSize(this.w);
      Display.getDisplay(GameMidlet.f).setCurrent(var1);
   }

   public final void a(int var1, Object var2) {
      switch(var1) {
      case 1000:
         this.b();
      default:
      }
   }

   public final void a(en var1) {
      if (this.H) {
         var1.e(0, 0, main.a.A, main.a.B);
      }

      boolean var9 = this.e;
      if (this.C == 2) {
         this.t = this.s;
      } else {
         this.t = this.r;
      }

      int var4 = this.a;
      int var6 = this.b - 1;
      int var3 = this.c;
      int var7 = this.d;
      int var5 = this.x + 6 + this.a;
      int var8 = this.b + (this.d - di.t.a()) / 2;
      String var11 = this.t;
      String var10 = this.i;
      var1.a(0);
      int var2;
      if (var9) {
         var1.a(I, 0, 81, 29, 27, 0, var4, var6, 0);
         var1.a(I, 0, 135, 29, 27, 0, var4 + var3 - 29, var6, 0);
         var1.a(I, 0, 108, 29, 27, 0, var4 + var3 - 58, var6, 0);

         for(var2 = 0; var2 < (var3 - 58) / 29; ++var2) {
            var1.a(I, 0, 108, 29, 27, 0, var4 + 29 + var2 * 29, var6, 0);
         }
      } else {
         var1.a(I, 0, 0, 29, 27, 0, var4, var6, 0);
         var1.a(I, 0, 54, 29, 27, 0, var4 + var3 - 29, var6, 0);
         var1.a(I, 0, 27, 29, 27, 0, var4 + var3 - 58, var6, 0);

         for(var2 = 0; var2 < (var3 - 58) / 29; ++var2) {
            var1.a(I, 0, 27, 29, 27, 0, var4 + 29 + var2 * 29, var6, 0);
         }
      }

      var1.e(var4 + 3, var6 + 1, var3 - 4, var7);
      if (var11 != null && !var11.equals("")) {
         di.t.a(var1, var11, var5, var8, 0);
      } else if (var10 != null) {
         if (var9) {
            di.i.a(var1, var10, var5, var8 + 2, 0);
         } else {
            di.j.a(var1, var10, var5, var8 + 2, 0);
         }
      }

      var1.a(0);
      if (this.e && this.k) {
         if (this.z == 0 && (this.B > 0 || this.v / 5 % 2 == 0)) {
            var1.a(7999781);
            var1.d(this.x + 7 + this.a + di.t.a(this.t.substring(0, this.u)) - 1, this.b + (this.d - o) / 2 + 1, 1, o);
         }

         main.a.a(var1);
         if (this.r != null && this.r.length() > 0 && main.a.e && var9) {
            var1.a(G, this.a + this.c - 13, this.b + this.d / 2 + 1, 3);
         }
      }

   }

   public final void a(String var1) {
      if (var1 != null) {
         this.y = -1984;
         this.z = 0;
         this.A = 0;
         this.r = var1;
         this.t = var1;
         this.f();
         this.u = var1.length();
         this.e();
      }

   }

   public final boolean a(int var1) {
      boolean var3;
      if (var1 != 8 && var1 != -8 && var1 != 204) {
         if (var1 >= 65 && var1 <= 122 && !g) {
            g = true;
            D = 0;
            av.a("qwerty", 1);
         }

         if (g) {
            if (var1 == 45) {
               if (var1 == this.y && this.z < n[m]) {
                  this.r = this.r.substring(0, this.u - 1) + '_';
                  this.t = this.r;
                  this.f();
                  this.e();
                  this.y = -1984;
                  var3 = false;
                  return var3;
               }

               this.y = 45;
            }

            if (var1 >= 32) {
               this.d(var1);
               var3 = false;
               return var3;
            }
         }

         if (var1 == F) {
            ++this.E;
            if (this.E > 3) {
               this.E = 0;
            }

            this.z = 1;
            this.y = var1;
            var3 = false;
         } else {
            if (var1 == 42) {
               var1 = 58;
            }

            if (var1 == 35) {
               var1 = 59;
            }

            if (var1 >= 48 && var1 <= 59) {
               if (this.C != 0 && this.C != 2 && this.C != 3) {
                  if (this.C == 1) {
                     this.d(var1);
                     this.z = 1;
                  }
               } else {
                  String[] var4;
                  if (this.C != 2 && this.C != 3) {
                     var4 = p;
                  } else {
                     var4 = q;
                  }

                  char var2;
                  String var5;
                  String var6;
                  if (var1 == this.y) {
                     this.A = (this.A + 1) % var4[var1 - 48].length();
                     var2 = var4[var1 - 48].charAt(this.A);
                     if (this.E == 0) {
                        var2 = Character.toLowerCase(var2);
                     } else if (this.E == 1) {
                        var2 = Character.toUpperCase(var2);
                     } else if (this.E == 2) {
                        var2 = Character.toUpperCase(var2);
                     } else {
                        var2 = var4[var1 - 48].charAt(var4[var1 - 48].length() - 1);
                     }

                     var5 = this.r.substring(0, this.u - 1) + var2;
                     var6 = var5;
                     if (this.u < this.r.length()) {
                        var6 = var5 + this.r.substring(this.u, this.r.length());
                     }

                     this.r = var6;
                     this.z = n[m];
                     this.f();
                  } else if (this.r.length() < this.w) {
                     if (this.E == 1 && this.y != -1984) {
                        this.E = 0;
                     }

                     this.A = 0;
                     var2 = var4[var1 - 48].charAt(this.A);
                     if (this.E == 0) {
                        var2 = Character.toLowerCase(var2);
                     } else if (this.E == 1) {
                        var2 = Character.toUpperCase(var2);
                     } else if (this.E == 2) {
                        var2 = Character.toUpperCase(var2);
                     } else {
                        var2 = var4[var1 - 48].charAt(var4[var1 - 48].length() - 1);
                     }

                     var5 = this.r.substring(0, this.u) + var2;
                     var6 = var5;
                     if (this.u < this.r.length()) {
                        var6 = var5 + this.r.substring(this.u, this.r.length());
                     }

                     this.r = var6;
                     this.z = n[m];
                     ++this.u;
                     this.f();
                     this.e();
                  }

                  this.y = var1;
               }
            } else {
               this.A = 0;
               this.y = -1984;
               if (var1 == 14) {
                  if (this.u > 0) {
                     --this.u;
                     this.e();
                     this.B = 10;
                     var3 = false;
                     return var3;
                  }
               } else if (var1 == 15) {
                  if (this.u < this.r.length()) {
                     ++this.u;
                     this.e();
                     this.B = 10;
                     var3 = false;
                     return var3;
                  }
               } else {
                  if (var1 == 19) {
                     this.b();
                     var3 = false;
                     return var3;
                  }

                  this.y = var1;
               }
            }

            var3 = true;
         }
      } else {
         this.b();
         var3 = true;
      }

      return var3;
   }

   public final void b() {
      if (this.u > 0 && this.r.length() > 0) {
         this.r = this.r.substring(0, this.u - 1) + this.r.substring(this.u, this.r.length());
         --this.u;
         this.e();
         this.f();
      }

   }

   public final void b(int var1) {
      this.w = var1;
   }

   public final void c() {
      this.k = true;
      ++this.v;
      if (this.z > 0) {
         --this.z;
         if (this.z == 0) {
            this.A = 0;
            if (this.E == 1 && this.y != F) {
               this.E = 0;
            }

            this.y = -1984;
            this.f();
         }
      }

      if (this.B > 0) {
         --this.B;
      }

      if (main.a.m) {
         if (main.a.a(this.a + this.c - 20, this.b, 40, this.d)) {
            this.r = "";
            this.u = 0;
            this.e();
            this.f();
            this.e = true;
         } else if (main.a.a(this.a, this.b, this.c, this.d)) {
            this.a();
         } else {
            this.e = false;
         }
      }

   }

   public final void c(int var1) {
      this.C = var1;
      this.w = 500;
   }

   public final String d() {
      return this.r;
   }
}
