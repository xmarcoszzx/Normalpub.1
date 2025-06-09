import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;

public final class bt {
   public static long b;
   public static long c;
   public static long d;
   public static long e;
   public static boolean f;
   private static bt g;
   db a = br.a();

   public static bt a() {
      if (g == null) {
         g = new bt();
      }

      return g;
   }

   public static y d(byte var0) {
      y var1 = new y((byte)-29);
      var1.d().writeByte(var0);
      return var1;
   }

   private static y i(byte var0) {
      y var1 = new y((byte)-28);
      var1.d().writeByte(var0);
      return var1;
   }

   public final void a(byte param1) {
      // $FF: Couldn't be decompiled
   }

   public final void a(byte param1, byte param2) {
      // $FF: Couldn't be decompiled
   }

   public final void a(byte param1, byte param2, byte param3, short param4) {
      // $FF: Couldn't be decompiled
   }

   public final void a(byte param1, byte param2, int param3) {
      // $FF: Couldn't be decompiled
   }

   public final void a(byte param1, byte param2, short param3) {
      // $FF: Couldn't be decompiled
   }

   public final void a(byte var1, byte var2, short var3, short var4) {
      y var5;
      label102: {
         label94: {
            label93: {
               try {
                  var5 = new y((byte)-45);
                  break label93;
               } catch (Exception var18) {
               } finally {
                  ;
               }

               var5 = null;
               break label94;
            }

            try {
               try {
                  var5.d().writeByte(20);
                  var5.d().writeByte(var1);
                  var5.d().writeShort(af.e().B);
                  var5.d().writeShort(af.e().C);
                  var5.d().writeByte(var2);
                  var5.d().writeShort(var3);
                  var5.d().writeShort(var4);
                  this.a.a(var5);
                  break label102;
               } catch (Exception var16) {
               }
            } catch (Throwable var17) {
               var5.e();
               throw var17;
            }
         }

         var5.e();
         return;
      }

      var5.e();
   }

   public final void a(byte param1, int param2) {
      // $FF: Couldn't be decompiled
   }

   public final void a(byte param1, int param2, byte param3, int param4) {
      // $FF: Couldn't be decompiled
   }

   public final void a(byte param1, int param2, byte param3, int param4, int param5) {
      // $FF: Couldn't be decompiled
   }

   public final void a(byte param1, int param2, int param3) {
      // $FF: Couldn't be decompiled
   }

   public final void a(byte param1, int param2, int param3, int param4) {
      // $FF: Couldn't be decompiled
   }

   public final void a(byte param1, int param2, String param3) {
      // $FF: Couldn't be decompiled
   }

   public final void a(byte param1, int param2, byte[] param3) {
      // $FF: Couldn't be decompiled
   }

   public final void a(byte param1, el param2) {
      // $FF: Couldn't be decompiled
   }

   public final void a(char param1) {
      // $FF: Couldn't be decompiled
   }

   public final void a(int param1) {
      // $FF: Couldn't be decompiled
   }

   public final void a(int param1, byte param2) {
      // $FF: Couldn't be decompiled
   }

   public final void a(int param1, int param2) {
      // $FF: Couldn't be decompiled
   }

   public final void a(int param1, int param2, int param3) {
      // $FF: Couldn't be decompiled
   }

   public final void a(int param1, String param2, int param3) {
      // $FF: Couldn't be decompiled
   }

   public final void a(int param1, short param2) {
      // $FF: Couldn't be decompiled
   }

   public final void a(el param1) {
      // $FF: Couldn't be decompiled
   }

   public final void a(el var1, el var2, int var3) {
      byte var5 = 0;
      byte var6 = 0;
      byte var4 = 0;

      StringBuffer var7;
      boolean var10001;
      try {
         var7 = new StringBuffer("SEND ATTACT vChar=  ");
         ds.c(var7.append(var2.size()).toString());
      } catch (Exception var28) {
         var10001 = false;
         return;
      }

      var7 = null;
      if (var3 != 0) {
         y var29;
         label192: {
            label193: {
               try {
                  if (var1.size() > 0 && var2.size() > 0) {
                     break label193;
                  }
               } catch (Exception var27) {
                  var10001 = false;
                  return;
               }

               y var30;
               label194: {
                  try {
                     if (var1.size() > 0) {
                        ds.c("PLAYER ATTACK NPC");
                        var30 = new y((byte)54);
                        break label194;
                     }
                  } catch (Exception var24) {
                     var10001 = false;
                     return;
                  }

                  var29 = var7;

                  try {
                     if (var2.size() <= 0) {
                        break label192;
                     }

                     ds.c("player attack player ");
                     var29 = new y((byte)-60);
                  } catch (Exception var21) {
                     var10001 = false;
                     return;
                  }

                  var3 = var6;

                  while(true) {
                     try {
                        if (var3 >= var2.size()) {
                           break label192;
                        }
                     } catch (Exception var20) {
                        var10001 = false;
                        return;
                     }

                     try {
                        af var32 = (af)var2.elementAt(var3);
                        var29.d().writeInt(var32.J);
                     } catch (Exception var11) {
                        var10001 = false;
                        return;
                     }

                     ++var3;
                  }
               }

               var3 = var5;

               while(true) {
                  try {
                     if (var3 >= var1.size()) {
                        break;
                     }
                  } catch (Exception var22) {
                     var10001 = false;
                     return;
                  }

                  label145: {
                     aa var33;
                     try {
                        var33 = (aa)var1.elementAt(var3);
                        if (!var33.J) {
                           var30.d().writeByte(var33.y);
                           break label145;
                        }
                     } catch (Exception var23) {
                        var10001 = false;
                        return;
                     }

                     try {
                        var30.d().writeByte(-1);
                        var30.d().writeInt(var33.y);
                     } catch (Exception var12) {
                        var10001 = false;
                        return;
                     }
                  }

                  ++var3;
               }

               var29 = var30;
               break label192;
            }

            y var34;
            if (var3 == 1) {
               try {
                  var34 = new y((byte)-4);
               } catch (Exception var19) {
                  var10001 = false;
                  return;
               }
            } else if (var3 == 2) {
               try {
                  var34 = new y((byte)67);
               } catch (Exception var18) {
                  var10001 = false;
                  return;
               }
            } else {
               var34 = null;
            }

            try {
               var34.d().writeByte(var1.size());
            } catch (Exception var17) {
               var10001 = false;
               return;
            }

            var3 = 0;

            while(true) {
               try {
                  if (var3 >= var1.size()) {
                     break;
                  }
               } catch (Exception var26) {
                  var10001 = false;
                  return;
               }

               try {
                  aa var8 = (aa)var1.elementAt(var3);
                  var34.d().writeByte(var8.y);
               } catch (Exception var16) {
                  var10001 = false;
                  return;
               }

               ++var3;
            }

            var3 = var4;

            while(true) {
               try {
                  if (var3 >= var2.size()) {
                     break;
                  }
               } catch (Exception var25) {
                  var10001 = false;
                  return;
               }

               af var31;
               try {
                  var31 = (af)var2.elementAt(var3);
               } catch (Exception var15) {
                  var10001 = false;
                  return;
               }

               if (var31 != null) {
                  try {
                     var34.d().writeInt(var31.J);
                  } catch (Exception var14) {
                     var10001 = false;
                     return;
                  }
               } else {
                  try {
                     var34.d().writeInt(-1);
                  } catch (Exception var13) {
                     var10001 = false;
                     return;
                  }
               }

               ++var3;
            }

            var29 = var34;
         }

         try {
            var29.d().writeByte((byte)af.e().I);
         } catch (Exception var10) {
            var10001 = false;
            return;
         }

         if (var29 != null) {
            try {
               this.a.a(var29);
            } catch (Exception var9) {
               var10001 = false;
            }
         }
      }

   }

   public final void a(String param1) {
      // $FF: Couldn't be decompiled
   }

   public final void a(String param1, byte param2) {
      // $FF: Couldn't be decompiled
   }

   public final void a(String param1, int param2) {
      // $FF: Couldn't be decompiled
   }

   public final void a(String var1, int var2, int var3) {
      y var4 = new y((byte)-28);

      try {
         var4.d().writeByte(2);
         var4.d().writeUTF(var1);
         var4.d().writeByte(var2);
         var4.d().writeByte(var3);
         StringBuffer var5 = new StringBuffer("name= ");
         ds.c(var5.append(var1).append(" gender= ").append(var2).append(" hair=").append(var3).toString());
      } catch (Exception var6) {
         var6.printStackTrace();
      }

      this.a.a(var4);
   }

   public final void a(String param1, String param2) {
      // $FF: Couldn't be decompiled
   }

   public final void a(String var1, String var2, String var3, byte var4) {
      ds.c("Login " + var1 + " " + var2 + " " + var3);

      try {
         y var5 = d((byte)0);
         var5.d().writeUTF(var1);
         var5.d().writeUTF(var2);
         var5.d().writeUTF(var3);
         var5.d().writeByte(var4);
         var5.d().writeByte(aw.fA);
         this.a.a(var5);
         var5.e();
      } catch (IOException var6) {
         var6.printStackTrace();
      }

   }

   public final void a(String var1, String var2, String var3, String var4) {
      ds.c("Request Register " + var1 + " " + var2 + " " + var4);

      IOException var10000;
      label34: {
         boolean var10001;
         y var9;
         try {
            var9 = d((byte)1);
            var9.d().writeUTF(var1);
            var9.d().writeUTF(var2);
         } catch (IOException var7) {
            var10000 = var7;
            var10001 = false;
            break label34;
         }

         if (var3 != null) {
            try {
               if (!var3.equals("")) {
                  var9.d().writeUTF(var3);
                  var9.d().writeUTF("a");
               }
            } catch (IOException var6) {
               var10000 = var6;
               var10001 = false;
               break label34;
            }
         }

         try {
            this.a.a(var9);
            var9.e();
            return;
         } catch (IOException var5) {
            var10000 = var5;
            var10001 = false;
         }
      }

      IOException var8 = var10000;
      var8.printStackTrace();
   }

   public final void a(String param1, String param2, String param3, String param4, String param5, String param6, String param7, String param8, String param9) {
      // $FF: Couldn't be decompiled
   }

   public final void a(short param1) {
      // $FF: Couldn't be decompiled
   }

   public final void a(short param1, byte param2) {
      // $FF: Couldn't be decompiled
   }

   public final void a(short param1, String param2) {
      // $FF: Couldn't be decompiled
   }

   public final void a(byte[] param1) {
      // $FF: Couldn't be decompiled
   }

   public final void a(cd[] param1) {
      // $FF: Couldn't be decompiled
   }

   public final void a(h[] param1) {
      // $FF: Couldn't be decompiled
   }

   public final void b() {
      ds.c("LEAVE CLAN");

      y var2;
      label192: {
         Throwable var3;
         label191: {
            Throwable var10000;
            y var1;
            label203: {
               boolean var10001;
               Exception var24;
               label198: {
                  label188: {
                     try {
                        try {
                           var2 = new y((byte)-55);
                           break label188;
                        } catch (Exception var22) {
                           var24 = var22;
                        }
                     } catch (Throwable var23) {
                        var2 = null;
                        var3 = var23;
                        break label191;
                     }

                     var2 = null;
                     break label198;
                  }

                  var1 = var2;

                  try {
                     try {
                        this.a.a(var2);
                        break label192;
                     } catch (Exception var20) {
                        var24 = var20;
                     }
                  } catch (Throwable var21) {
                     var10000 = var21;
                     var10001 = false;
                     break label203;
                  }
               }

               var1 = var2;

               try {
                  var24.printStackTrace();
               } catch (Throwable var19) {
                  var10000 = var19;
                  var10001 = false;
                  break label203;
               }

               var2.e();
               return;
            }

            var3 = var10000;
            var2 = var1;
         }

         var2.e();
         throw var3;
      }

      var2.e();
   }

   public final void b(byte param1) {
      // $FF: Couldn't be decompiled
   }

   public final void b(byte param1, byte param2) {
      // $FF: Couldn't be decompiled
   }

   public final void b(byte param1, int param2) {
      // $FF: Couldn't be decompiled
   }

   public final void b(byte param1, el param2) {
      // $FF: Couldn't be decompiled
   }

   public final void b(int param1) {
      // $FF: Couldn't be decompiled
   }

   public final void b(int param1, byte param2) {
      // $FF: Couldn't be decompiled
   }

   public final void b(int param1, int param2) {
      // $FF: Couldn't be decompiled
   }

   public final void b(String param1) {
      // $FF: Couldn't be decompiled
   }

   public final void b(String param1, int param2) {
      // $FF: Couldn't be decompiled
   }

   public final void b(short param1) {
      // $FF: Couldn't be decompiled
   }

   public final void c() {
      if (av.d("clienttype") != -1) {
         l.c = av.d("clienttype");
      }

      IOException var10000;
      label34: {
         y var1;
         boolean var10001;
         StringBuffer var2;
         InputStream var8;
         try {
            ds.c("setType");
            var1 = d((byte)2);
            var1.d().writeByte(l.c);
            var1.d().writeByte(en.b);
            var1.d().writeBoolean(false);
            var1.d().writeInt(main.a.A);
            var1.d().writeInt(main.a.B);
            var1.d().writeBoolean(cd.g);
            var1.d().writeBoolean(main.a.e);
            DataOutputStream var3 = var1.d();
            var2 = new StringBuffer(String.valueOf(System.getProperty("microedition.platform")));
            var3.writeUTF(var2.append("|").append("2.4.6").toString());
            var8 = this.getClass().getResourceAsStream("res\\info");
         } catch (IOException var6) {
            var10000 = var6;
            var10001 = false;
            break label34;
         }

         if (var8 != null) {
            try {
               var8.read((byte[])null);
               var1.d().writeShort(((Object[])null).length);
               var1.d().write((byte[])null);
               var2 = new StringBuffer("write ");
               ds.b(var2.append(((Object[])null).length).append("|").append("2.4.6").toString());
            } catch (IOException var5) {
               var10000 = var5;
               var10001 = false;
               break label34;
            }
         }

         try {
            this.a.a(var1);
            var1.e();
            return;
         } catch (IOException var4) {
            var10000 = var4;
            var10001 = false;
         }
      }

      IOException var7 = var10000;
      var7.printStackTrace();
   }

   public final void c(byte param1) {
      // $FF: Couldn't be decompiled
   }

   public final void c(byte param1, byte param2) {
      // $FF: Couldn't be decompiled
   }

   public final void c(int param1) {
      // $FF: Couldn't be decompiled
   }

   public final void c(String param1) {
      // $FF: Couldn't be decompiled
   }

   public final void c(short param1) {
      // $FF: Couldn't be decompiled
   }

   public final void d() {
      y var1;
      label101: {
         label93: {
            label92: {
               try {
                  try {
                     var1 = new y((byte)-120);
                     break label92;
                  } catch (Exception var14) {
                  }
               } catch (Throwable var15) {
                  Object var3 = null;
                  b = l.d();
                  ((y)var3).e();
                  throw var15;
               }

               var1 = null;
               break label93;
            }

            try {
               this.a.a(var1);
               break label101;
            } catch (Exception var12) {
            } finally {
               ;
            }
         }

         b = l.d();
         var1.e();
         return;
      }

      b = l.d();
      var1.e();
   }

   public final void d(int param1) {
      // $FF: Couldn't be decompiled
   }

   public final void d(String param1) {
      // $FF: Couldn't be decompiled
   }

   public final void e() {
      label102: {
         y var1;
         label94: {
            label93: {
               try {
                  var1 = new y((byte)-121);
                  break label93;
               } catch (Exception var13) {
               } finally {
                  ;
               }

               var1 = null;
               break label94;
            }

            Exception var2;
            try {
               this.a.a(var1);
               break label102;
            } catch (Exception var11) {
               var2 = var11;
            } finally {
               c = l.d();
               var1.e();
               throw var2;
            }
         }

         c = l.d();
         var1.e();
         return;
      }

   }

   public final void e(byte var1) {
      y var2 = new y((byte)-34);

      try {
         var2.d().writeByte(var1);
         this.a.a(var2);
         var2.e();
      } catch (Exception var3) {
      }

   }

   public final void e(int param1) {
      // $FF: Couldn't be decompiled
   }

   public final void e(String param1) {
      // $FF: Couldn't be decompiled
   }

   public final void f() {
      y var1 = new y((byte)-23);
      this.a.a(var1);
      var1.e();
   }

   public final void f(byte param1) {
      // $FF: Couldn't be decompiled
   }

   public final void f(int var1) {
      y var2 = new y((byte)21);

      try {
         var2.d().writeByte(var1);
         this.a.a(var2);
         var2.e();
      } catch (Exception var3) {
      }

   }

   public final void f(String param1) {
      // $FF: Couldn't be decompiled
   }

   public final void g() {
      int var3 = af.e().B;
      int var1 = af.e().bD;
      int var2 = af.e().C - af.e().bE;
      if (!af.bG && (var3 - var1 != 0 || var2 != 0) && !ac.b && !af.e().s && af.e().C > 0 && !af.e().cP) {
         Exception var10000;
         label64: {
            y var4;
            boolean var10001;
            label65: {
               try {
                  var4 = new y((byte)-7);
                  af.e().bD = af.e().B;
                  af.e().bE = af.e().C;
                  af.e();
                  af.e();
                  af.e();
                  af.e();
                  if (bv.a(af.e().B / bv.i, af.e().C / bv.i) == 0) {
                     var4.d().writeByte(1);
                     break label65;
                  }
               } catch (Exception var9) {
                  var10000 = var9;
                  var10001 = false;
                  break label64;
               }

               try {
                  var4.d().writeByte(0);
               } catch (Exception var8) {
                  var10000 = var8;
                  var10001 = false;
                  break label64;
               }
            }

            try {
               var4.d().writeShort(af.e().B);
            } catch (Exception var7) {
               var10000 = var7;
               var10001 = false;
               break label64;
            }

            if (var2 != 0) {
               try {
                  var4.d().writeShort(af.e().C);
               } catch (Exception var6) {
                  var10000 = var6;
                  var10001 = false;
                  break label64;
               }
            }

            try {
               this.a.a(var4);
               ++p.M;
               var4.e();
               return;
            } catch (Exception var5) {
               var10000 = var5;
               var10001 = false;
            }
         }

         Exception var10 = var10000;
         var10.printStackTrace();
      }

   }

   public final void g(byte param1) {
      // $FF: Couldn't be decompiled
   }

   public final void g(int var1) {
      y var2 = new y((byte)-78);

      try {
         var2.d().writeInt(var1);
         this.a.a(var2);
         var2.e();
      } catch (Exception var3) {
      }

   }

   public final void g(String param1) {
      // $FF: Couldn't be decompiled
   }

   public final void h() {
      y var2;
      label184: {
         Throwable var10000;
         y var1;
         label191: {
            boolean var10001;
            Exception var3;
            label186: {
               label178: {
                  try {
                     var2 = new y((byte)29);
                     break label178;
                  } catch (Exception var22) {
                     var3 = var22;
                  } finally {
                     ;
                  }

                  var2 = null;
                  break label186;
               }

               var1 = var2;

               try {
                  try {
                     this.a.a(var2);
                     break label184;
                  } catch (Exception var20) {
                     var3 = var20;
                  }
               } catch (Throwable var21) {
                  var10000 = var21;
                  var10001 = false;
                  break label191;
               }
            }

            var1 = var2;

            try {
               var3.printStackTrace();
            } catch (Throwable var19) {
               var10000 = var19;
               var10001 = false;
               break label191;
            }

            var2.e();
            return;
         }

         Throwable var24 = var10000;
         var1.e();
         throw var24;
      }

      var2.e();
   }

   public final void h(byte param1) {
      // $FF: Couldn't be decompiled
   }

   public final void h(int param1) {
      // $FF: Couldn't be decompiled
   }

   public final void i() {
      y var2;
      label182: {
         Throwable var3;
         label181: {
            Throwable var10000;
            y var1;
            label191: {
               boolean var10001;
               Exception var24;
               label186: {
                  label178: {
                     try {
                        try {
                           var2 = new y((byte)50);
                           break label178;
                        } catch (Exception var22) {
                           var24 = var22;
                        }
                     } catch (Throwable var23) {
                        var2 = null;
                        var3 = var23;
                        break label181;
                     }

                     var2 = null;
                     break label186;
                  }

                  var1 = var2;

                  try {
                     try {
                        this.a.a(var2);
                        break label182;
                     } catch (Exception var20) {
                        var24 = var20;
                     }
                  } catch (Throwable var21) {
                     var10000 = var21;
                     var10001 = false;
                     break label191;
                  }
               }

               var1 = var2;

               try {
                  var24.printStackTrace();
               } catch (Throwable var19) {
                  var10000 = var19;
                  var10001 = false;
                  break label191;
               }

               var2.e();
               return;
            }

            var3 = var10000;
            var2 = var1;
         }

         var2.e();
         throw var3;
      }

      var2.e();
   }

   public final void i(int param1) {
      // $FF: Couldn't be decompiled
   }

   public final void j() {
      y var2;
      label184: {
         Throwable var10000;
         y var1;
         label191: {
            boolean var10001;
            Exception var3;
            label186: {
               label178: {
                  try {
                     var2 = new y((byte)-15);
                     break label178;
                  } catch (Exception var22) {
                     var3 = var22;
                  } finally {
                     ;
                  }

                  var2 = null;
                  break label186;
               }

               var1 = var2;

               try {
                  try {
                     this.a.a(var2);
                     break label184;
                  } catch (Exception var20) {
                     var3 = var20;
                  }
               } catch (Throwable var21) {
                  var10000 = var21;
                  var10001 = false;
                  break label191;
               }
            }

            var1 = var2;

            try {
               var3.printStackTrace();
            } catch (Throwable var19) {
               var10000 = var19;
               var10001 = false;
               break label191;
            }

            var2.e();
            return;
         }

         Throwable var24 = var10000;
         var1.e();
         throw var24;
      }

      var2.e();
   }

   public final void j(int param1) {
      // $FF: Couldn't be decompiled
   }

   public final void k() {
      y var2;
      label184: {
         Throwable var10000;
         y var1;
         label191: {
            boolean var10001;
            Exception var3;
            label186: {
               label178: {
                  try {
                     var2 = new y((byte)-16);
                     break label178;
                  } catch (Exception var22) {
                     var3 = var22;
                  } finally {
                     ;
                  }

                  var2 = null;
                  break label186;
               }

               var1 = var2;

               try {
                  try {
                     this.a.a(var2);
                     break label184;
                  } catch (Exception var20) {
                     var3 = var20;
                  }
               } catch (Throwable var21) {
                  var10000 = var21;
                  var10001 = false;
                  break label191;
               }
            }

            var1 = var2;

            try {
               var3.printStackTrace();
            } catch (Throwable var19) {
               var10000 = var19;
               var10001 = false;
               break label191;
            }

            var2.e();
            return;
         }

         Throwable var24 = var10000;
         var1.e();
         throw var24;
      }

      var2.e();
   }

   public final void k(int param1) {
      // $FF: Couldn't be decompiled
   }

   public final void l() {
      // $FF: Couldn't be decompiled
   }

   public final void l(int param1) {
      // $FF: Couldn't be decompiled
   }

   public final void m() {
      // $FF: Couldn't be decompiled
   }

   public final void m(int param1) {
      // $FF: Couldn't be decompiled
   }

   public final void n() {
      // $FF: Couldn't be decompiled
   }

   public final void n(int param1) {
      // $FF: Couldn't be decompiled
   }

   public final void o() {
      // $FF: Couldn't be decompiled
   }

   public final void o(int param1) {
      // $FF: Couldn't be decompiled
   }

   public final void p() {
      // $FF: Couldn't be decompiled
   }

   public final void p(int param1) {
      // $FF: Couldn't be decompiled
   }

   public final void q() {
      ds.c("send map offline");

      y var2;
      label196: {
         Throwable var10000;
         y var1;
         label203: {
            boolean var10001;
            Exception var3;
            label198: {
               label188: {
                  try {
                     var2 = new y((byte)-33);
                     break label188;
                  } catch (Exception var22) {
                     var3 = var22;
                  } finally {
                     ;
                  }

                  var2 = null;
                  break label198;
               }

               var1 = var2;

               try {
                  try {
                     this.a.a(var2);
                     break label196;
                  } catch (Exception var20) {
                     var3 = var20;
                  }
               } catch (Throwable var21) {
                  var10000 = var21;
                  var10001 = false;
                  break label203;
               }
            }

            var1 = var2;

            try {
               var3.printStackTrace();
            } catch (Throwable var19) {
               var10000 = var19;
               var10001 = false;
               break label203;
            }

            var2.e();
            return;
         }

         Throwable var24 = var10000;
         var1.e();
         throw var24;
      }

      var2.e();
   }

   public final void q(int param1) {
      // $FF: Couldn't be decompiled
   }

   public final void r() {
      y var2;
      label184: {
         Throwable var10000;
         y var1;
         label191: {
            boolean var10001;
            Exception var3;
            label186: {
               label178: {
                  try {
                     var2 = new y((byte)-38);
                     break label178;
                  } catch (Exception var22) {
                     var3 = var22;
                  } finally {
                     ;
                  }

                  var2 = null;
                  break label186;
               }

               var1 = var2;

               try {
                  try {
                     this.a.a(var2);
                     break label184;
                  } catch (Exception var20) {
                     var3 = var20;
                  }
               } catch (Throwable var21) {
                  var10000 = var21;
                  var10001 = false;
                  break label191;
               }
            }

            var1 = var2;

            try {
               var3.printStackTrace();
            } catch (Throwable var19) {
               var10000 = var19;
               var10001 = false;
               break label191;
            }

            var2.e();
            return;
         }

         Throwable var24 = var10000;
         var1.e();
         throw var24;
      }

      var2.e();
   }

   public final void r(int param1) {
      // $FF: Couldn't be decompiled
   }

   public final void s() {
      ds.c("finishLoadMap");

      y var24;
      label192: {
         Throwable var2;
         y var3;
         label191: {
            y var1;
            Throwable var10000;
            label203: {
               boolean var10001;
               Exception var25;
               label198: {
                  label188: {
                     try {
                        try {
                           var24 = new y((byte)-39);
                           break label188;
                        } catch (Exception var22) {
                           var25 = var22;
                        }
                     } catch (Throwable var23) {
                        var3 = null;
                        var2 = var23;
                        break label191;
                     }

                     var24 = null;
                     break label198;
                  }

                  var1 = var24;

                  try {
                     try {
                        this.a.a(var24);
                        break label192;
                     } catch (Exception var20) {
                        var25 = var20;
                     }
                  } catch (Throwable var21) {
                     var10000 = var21;
                     var10001 = false;
                     break label203;
                  }
               }

               var1 = var24;

               try {
                  var25.printStackTrace();
               } catch (Throwable var19) {
                  var10000 = var19;
                  var10001 = false;
                  break label203;
               }

               var24.e();
               return;
            }

            var2 = var10000;
            var3 = var1;
         }

         var3.e();
         throw var2;
      }

      var24.e();
   }

   public final void s(int param1) {
      // $FF: Couldn't be decompiled
   }

   public final void t() {
      y var2;
      label182: {
         Throwable var3;
         label181: {
            Throwable var10000;
            y var1;
            label191: {
               boolean var10001;
               Exception var24;
               label186: {
                  label178: {
                     try {
                        try {
                           var2 = new y((byte)-107);
                           break label178;
                        } catch (Exception var22) {
                           var24 = var22;
                        }
                     } catch (Throwable var23) {
                        var2 = null;
                        var3 = var23;
                        break label181;
                     }

                     var2 = null;
                     break label186;
                  }

                  var1 = var2;

                  try {
                     try {
                        this.a.a(var2);
                        break label182;
                     } catch (Exception var20) {
                        var24 = var20;
                     }
                  } catch (Throwable var21) {
                     var10000 = var21;
                     var10001 = false;
                     break label191;
                  }
               }

               var1 = var2;

               try {
                  var24.printStackTrace();
               } catch (Throwable var19) {
                  var10000 = var19;
                  var10001 = false;
                  break label191;
               }

               var2.e();
               return;
            }

            var3 = var10000;
            var2 = var1;
         }

         var2.e();
         throw var3;
      }

      var2.e();
   }

   public final void t(int var1) {
      label102: {
         y var2;
         label94: {
            label93: {
               try {
                  var2 = new y((byte)-38);
                  break label93;
               } catch (Exception var14) {
               } finally {
                  ;
               }

               var2 = null;
               break label94;
            }

            Exception var3;
            try {
               var2.d().writeInt(var1);
               this.a.a(var2);
               break label102;
            } catch (Exception var12) {
               var3 = var12;
            } finally {
               var2.e();
               throw var3;
            }
         }

         var2.e();
         return;
      }

   }

   public final void u() {
      y var2;
      label182: {
         Throwable var3;
         label181: {
            Throwable var10000;
            y var1;
            label191: {
               boolean var10001;
               Exception var24;
               label186: {
                  label178: {
                     try {
                        try {
                           var2 = new y((byte)-105);
                           break label178;
                        } catch (Exception var22) {
                           var24 = var22;
                        }
                     } catch (Throwable var23) {
                        var2 = null;
                        var3 = var23;
                        break label181;
                     }

                     var2 = null;
                     break label186;
                  }

                  var1 = var2;

                  try {
                     try {
                        this.a.a(var2);
                        break label182;
                     } catch (Exception var20) {
                        var24 = var20;
                     }
                  } catch (Throwable var21) {
                     var10000 = var21;
                     var10001 = false;
                     break label191;
                  }
               }

               var1 = var2;

               try {
                  var24.printStackTrace();
               } catch (Throwable var19) {
                  var10000 = var19;
                  var10001 = false;
                  break label191;
               }

               var2.e();
               return;
            }

            var3 = var10000;
            var2 = var1;
         }

         var2.e();
         throw var3;
      }

      var2.e();
   }

   public final void u(int param1) {
      // $FF: Couldn't be decompiled
   }

   public final void v() {
      y var2;
      label182: {
         Throwable var3;
         label181: {
            Throwable var10000;
            y var1;
            label191: {
               boolean var10001;
               Exception var24;
               label186: {
                  label178: {
                     try {
                        try {
                           var2 = new y((byte)-114);
                           break label178;
                        } catch (Exception var22) {
                           var24 = var22;
                        }
                     } catch (Throwable var23) {
                        var2 = null;
                        var3 = var23;
                        break label181;
                     }

                     var2 = null;
                     break label186;
                  }

                  var1 = var2;

                  try {
                     try {
                        this.a.a(var2);
                        break label182;
                     } catch (Exception var20) {
                        var24 = var20;
                     }
                  } catch (Throwable var21) {
                     var10000 = var21;
                     var10001 = false;
                     break label191;
                  }
               }

               var1 = var2;

               try {
                  var24.printStackTrace();
               } catch (Throwable var19) {
                  var10000 = var19;
                  var10001 = false;
                  break label191;
               }

               var2.e();
               return;
            }

            var3 = var10000;
            var2 = var1;
         }

         var2.e();
         throw var3;
      }

      var2.e();
   }

   public final void v(int param1) {
      // $FF: Couldn't be decompiled
   }

   public final void w() {
      y var1 = new y((byte)69);

      try {
         this.a.a(var1);
      } catch (Exception var5) {
      } finally {
         var1.e();
      }

   }

   public final void w(int param1) {
      // $FF: Couldn't be decompiled
   }

   public final void x(int param1) {
      // $FF: Couldn't be decompiled
   }

   public final void y(int param1) {
      // $FF: Couldn't be decompiled
   }
}
