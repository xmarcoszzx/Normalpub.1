import main.GameMidlet;

final class s implements Runnable {
   private br a;

   s(br var1) {
      this.a = var1;
   }

   private void a(y var1) {
      boolean var4 = false;
      byte var3 = var1.c().readByte();
      this.a.k = new byte[var3];

      int var2;
      for(var2 = 0; var2 < var3; ++var2) {
         this.a.k[var2] = var1.c().readByte();
      }

      for(var2 = 0; var2 < this.a.k.length - 1; ++var2) {
         byte[] var5 = this.a.k;
         int var6 = var2 + 1;
         var5[var6] ^= this.a.k[var2];
      }

      this.a.j = true;
      GameMidlet.c = var1.c().readUTF();
      GameMidlet.d = var1.c().readInt();
      if (var1.c().readByte() != 0) {
         var4 = true;
      }

      GameMidlet.g = var4;
      System.out.println("====> getKey " + this.a.j + " co nect 2 is " + GameMidlet.g);
      if (this.a.c && GameMidlet.g) {
         main.a.c();
      }

   }

   public final void run() {
      label222:
      while(true) {
         boolean var8;
         boolean var10001;
         try {
            var8 = this.a.d();
         } catch (Exception var26) {
            var10001 = false;
            break;
         }

         if (!var8) {
            break;
         }

         byte var1;
         try {
            var1 = this.a.a.readByte();
            if (this.a.j) {
               var1 = br.a(this.a, var1);
            }
         } catch (Exception var25) {
            var10001 = false;
            break;
         }

         int var33;
         y var35;
         int var5;
         int var6;
         int var7;
         br var11;
         if (var1 != -32 && var1 != -66 && var1 != 11 && var1 != -67 && var1 != -74 && var1 != -87 && var1 != 66 && var1 != 12) {
            label229: {
               try {
                  if (this.a.j) {
                     byte var3 = this.a.a.readByte();
                     byte var2 = this.a.a.readByte();
                     var33 = (br.a(this.a, var3) & 255) << 8 | br.a(this.a, var2) & 255;
                     break label229;
                  }
               } catch (Exception var32) {
                  var10001 = false;
                  break;
               }

               try {
                  var33 = this.a.a.readUnsignedShort();
               } catch (Exception var19) {
                  var10001 = false;
                  break;
               }
            }

            byte[] var36;
            try {
               var36 = new byte[var33];
            } catch (Exception var18) {
               var10001 = false;
               break;
            }

            var6 = 0;
            var5 = 0;

            while(var5 != -1 && var6 < var33) {
               try {
                  var7 = this.a.a.read(var36, var6, var33 - var6);
               } catch (Exception var17) {
                  var10001 = false;
                  break label222;
               }

               var5 = var7;
               if (var7 > 0) {
                  var6 += var7;

                  try {
                     br var37 = this.a;
                     var37.i += var6 + 5;
                     var5 = br.a().i + br.a().h;
                     var11 = this.a;
                     StringBuffer var38 = new StringBuffer(String.valueOf(var5 / 1024));
                     var11.m = var38.append(".").append(var5 % 1024 / 102).append("Kb").toString();
                  } catch (Exception var16) {
                     var10001 = false;
                     break label222;
                  }

                  var5 = var7;
               }
            }

            label232: {
               try {
                  if (!this.a.j) {
                     break label232;
                  }
               } catch (Exception var31) {
                  var10001 = false;
                  break;
               }

               var33 = 0;

               while(true) {
                  try {
                     if (var33 >= var36.length) {
                        break;
                     }
                  } catch (Exception var30) {
                     var10001 = false;
                     break label222;
                  }

                  try {
                     var36[var33] = br.a(this.a, var36[var33]);
                  } catch (Exception var15) {
                     var10001 = false;
                     break label222;
                  }

                  ++var33;
               }
            }

            try {
               var35 = new y(var1, var36);
            } catch (Exception var14) {
               var10001 = false;
               break;
            }
         } else {
            byte[] var10;
            try {
               byte var4 = br.a(this.a, this.a.a.readByte());
               var7 = (br.a(this.a, this.a.a.readByte()) + 128 + (br.a(this.a, this.a.a.readByte()) + 128 << 8) << 8) + var4 + 128;
               var10 = new byte[var7];
            } catch (Exception var24) {
               var10001 = false;
               break;
            }

            var5 = 0;
            var33 = 0;

            while(var33 != -1 && var5 < var7) {
               try {
                  var6 = this.a.a.read(var10, var5, var7 - var5);
               } catch (Exception var23) {
                  var10001 = false;
                  break label222;
               }

               var33 = var6;
               if (var6 > 0) {
                  var5 += var6;

                  try {
                     br var9 = this.a;
                     var9.i += var5 + 5;
                     var33 = br.a().i + br.a().h;
                     var11 = this.a;
                     StringBuffer var34 = new StringBuffer(String.valueOf(var33 / 1024));
                     var11.m = var34.append(".").append(var33 % 1024 / 102).append("Kb").toString();
                  } catch (Exception var22) {
                     var10001 = false;
                     break label222;
                  }

                  var33 = var6;
               }
            }

            label236: {
               try {
                  if (!this.a.j) {
                     break label236;
                  }
               } catch (Exception var29) {
                  var10001 = false;
                  break;
               }

               var33 = 0;

               while(true) {
                  try {
                     if (var33 >= var10.length) {
                        break;
                     }
                  } catch (Exception var28) {
                     var10001 = false;
                     break label222;
                  }

                  try {
                     var10[var33] = br.a(this.a, var10[var33]);
                  } catch (Exception var21) {
                     var10001 = false;
                     break label222;
                  }

                  ++var33;
               }
            }

            try {
               var35 = new y(var1, var10);
            } catch (Exception var20) {
               var10001 = false;
               break;
            }
         }

         if (var35 == null) {
            break;
         }

         Exception var10000;
         label164: {
            try {
               if (var35.a == -27) {
                  this.a(var35);
                  continue;
               }
            } catch (Exception var27) {
               var10000 = var27;
               var10001 = false;
               break label164;
            }

            try {
               this.a.b.a(var35);
               continue;
            } catch (Exception var13) {
               var10000 = var13;
               var10001 = false;
            }
         }

         Exception var39 = var10000;

         try {
            var39.printStackTrace();
         } catch (Exception var12) {
            var10001 = false;
            break;
         }
      }

      if (this.a.d) {
         if (this.a.b != null) {
            if (System.currentTimeMillis() - this.a.l > 500L) {
               this.a.b.c(this.a.c);
            } else {
               this.a.b.b(this.a.c);
            }
         }

         if (br.a(this.a) != null) {
            br.c(this.a);
         }
      }

   }
}
