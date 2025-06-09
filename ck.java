import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.InputStream;
import javax.microedition.lcdui.Image;

public final class ck {
   public Image a;
   public short[] b;
   public short[][] c = new short[16][];
   public int d;
   public int e = 0;
   public int f;
   public int g;
   private z[] h;
   private cs[] i;

   private void a(DataInputStream var1) {
      byte var3;
      boolean var10001;
      try {
         var3 = var1.readByte();
         this.h = new z[var3];
      } catch (Exception var29) {
         var10001 = false;
         return;
      }

      int var2;
      for(var2 = 0; var2 < var3; ++var2) {
         z[] var13;
         z var14;
         try {
            var13 = this.h;
            var14 = new z();
         } catch (Exception var28) {
            var10001 = false;
            return;
         }

         var13[var2] = var14;

         try {
            this.h[var2].a = var1.readByte();
            this.h[var2].b = (short)var1.readUnsignedByte();
            this.h[var2].c = (short)var1.readUnsignedByte();
            this.h[var2].d = (short)var1.readUnsignedByte();
            this.h[var2].e = (short)var1.readUnsignedByte();
         } catch (Exception var27) {
            var10001 = false;
            return;
         }
      }

      try {
         this.i = new cs[var1.readShort()];
      } catch (Exception var26) {
         var10001 = false;
         return;
      }

      int var7 = 0;
      var2 = 0;
      int var30 = 0;
      short var4 = 0;
      short var5 = 0;

      while(true) {
         try {
            if (var7 >= this.i.length) {
               this.b = new short[var1.readShort()];
               break;
            }
         } catch (Exception var25) {
            var10001 = false;
            return;
         }

         cs var32;
         cs[] var33;
         try {
            var33 = this.i;
            var32 = new cs();
         } catch (Exception var20) {
            var10001 = false;
            return;
         }

         var33[var7] = var32;

         byte var12;
         try {
            var12 = var1.readByte();
            this.i[var7].a = new short[var12];
            this.i[var7].b = new short[var12];
            this.i[var7].c = new byte[var12];
         } catch (Exception var19) {
            var10001 = false;
            return;
         }

         short var6;
         for(int var8 = 0; var8 < var12; var5 = var6) {
            try {
               this.i[var7].a[var8] = var1.readShort();
               this.i[var7].b[var8] = var1.readShort();
               this.i[var7].c[var8] = var1.readByte();
            } catch (Exception var18) {
               var10001 = false;
               return;
            }

            int var11 = var2;
            int var10 = var30;
            short var9 = var4;
            var6 = var5;
            if (var7 == 0) {
               var6 = var5;

               try {
                  if (var5 > this.i[var7].a[var8]) {
                     var6 = this.i[var7].a[var8];
                  }
               } catch (Exception var24) {
                  var10001 = false;
                  return;
               }

               var5 = var4;

               try {
                  if (var4 > this.i[var7].b[var8]) {
                     var5 = this.i[var7].b[var8];
                  }
               } catch (Exception var23) {
                  var10001 = false;
                  return;
               }

               int var31 = var30;

               try {
                  if (var30 < this.i[var7].a[var8] + this.h[this.i[var7].c[var8]].d) {
                     var31 = this.i[var7].a[var8] + this.h[this.i[var7].c[var8]].d;
                  }
               } catch (Exception var22) {
                  var10001 = false;
                  return;
               }

               var30 = var2;

               try {
                  if (var2 < this.i[var7].b[var8] + this.h[this.i[var7].c[var8]].e) {
                     var30 = this.i[var7].b[var8] + this.h[this.i[var7].c[var8]].e;
                  }
               } catch (Exception var21) {
                  var10001 = false;
                  return;
               }

               try {
                  this.f = var31 - var6;
                  this.g = var30 - var5;
               } catch (Exception var17) {
                  var10001 = false;
                  return;
               }

               var9 = var5;
               var10 = var31;
               var11 = var30;
            }

            ++var8;
            var2 = var11;
            var30 = var10;
            var4 = var9;
         }

         ++var7;
      }

      var2 = 0;

      while(true) {
         try {
            if (var2 >= this.b.length) {
               break;
            }
         } catch (Exception var16) {
            var10001 = false;
            break;
         }

         try {
            this.b[var2] = var1.readShort();
         } catch (Exception var15) {
            var10001 = false;
            break;
         }

         ++var2;
      }

   }

   private void a(DataInputStream var1, byte var2) {
      byte var4;
      boolean var10001;
      try {
         var4 = var1.readByte();
         this.h = new z[var4];
      } catch (Exception var32) {
         var10001 = false;
         return;
      }

      int var3;
      for(var3 = 0; var3 < var4; ++var3) {
         z var13;
         z[] var14;
         try {
            var14 = this.h;
            var13 = new z();
         } catch (Exception var31) {
            var10001 = false;
            return;
         }

         var14[var3] = var13;

         try {
            this.h[var3].a = var1.readByte();
         } catch (Exception var30) {
            var10001 = false;
            return;
         }

         if (var2 == 1) {
            try {
               this.h[var3].b = (short)var1.readUnsignedByte();
               this.h[var3].c = (short)var1.readUnsignedByte();
            } catch (Exception var29) {
               var10001 = false;
               return;
            }
         } else {
            try {
               this.h[var3].b = var1.readShort();
               this.h[var3].c = var1.readShort();
            } catch (Exception var28) {
               var10001 = false;
               return;
            }
         }

         try {
            this.h[var3].d = (short)var1.readUnsignedByte();
            this.h[var3].e = (short)var1.readUnsignedByte();
         } catch (Exception var27) {
            var10001 = false;
            return;
         }
      }

      try {
         this.i = new cs[var1.readShort()];
      } catch (Exception var26) {
         var10001 = false;
         return;
      }

      int var33 = 0;
      var3 = 0;
      short var34 = 0;
      short var5 = 0;
      int var7 = 0;

      while(true) {
         try {
            if (var7 >= this.i.length) {
               this.b = new short[var1.readShort()];
               break;
            }
         } catch (Exception var25) {
            var10001 = false;
            return;
         }

         cs var36;
         cs[] var37;
         try {
            var37 = this.i;
            var36 = new cs();
         } catch (Exception var20) {
            var10001 = false;
            return;
         }

         var37[var7] = var36;

         byte var12;
         try {
            var12 = var1.readByte();
            this.i[var7].a = new short[var12];
            this.i[var7].b = new short[var12];
            this.i[var7].c = new byte[var12];
         } catch (Exception var19) {
            var10001 = false;
            return;
         }

         short var6;
         for(int var8 = 0; var8 < var12; var5 = var6) {
            try {
               this.i[var7].a[var8] = var1.readShort();
               this.i[var7].b[var8] = var1.readShort();
               this.i[var7].c[var8] = var1.readByte();
            } catch (Exception var18) {
               var10001 = false;
               return;
            }

            int var11 = var33;
            int var10 = var3;
            short var9 = var34;
            var6 = var5;
            if (var7 == 0) {
               var6 = var5;

               try {
                  if (var5 > this.i[var7].a[var8]) {
                     var6 = this.i[var7].a[var8];
                  }
               } catch (Exception var24) {
                  var10001 = false;
                  return;
               }

               var5 = var34;

               try {
                  if (var34 > this.i[var7].b[var8]) {
                     var5 = this.i[var7].b[var8];
                  }
               } catch (Exception var23) {
                  var10001 = false;
                  return;
               }

               int var35 = var3;

               try {
                  if (var3 < this.i[var7].a[var8] + this.h[this.i[var7].c[var8]].d) {
                     var35 = this.i[var7].a[var8] + this.h[this.i[var7].c[var8]].d;
                  }
               } catch (Exception var22) {
                  var10001 = false;
                  return;
               }

               var3 = var33;

               try {
                  if (var33 < this.i[var7].b[var8] + this.h[this.i[var7].c[var8]].e) {
                     var3 = this.i[var7].b[var8] + this.h[this.i[var7].c[var8]].e;
                  }
               } catch (Exception var21) {
                  var10001 = false;
                  return;
               }

               try {
                  this.f = var35 - var6;
                  this.g = var3 - var5;
               } catch (Exception var17) {
                  var10001 = false;
                  return;
               }

               var9 = var5;
               var10 = var35;
               var11 = var3;
            }

            ++var8;
            var33 = var11;
            var3 = var10;
            var34 = var9;
         }

         ++var7;
      }

      var33 = 0;

      while(true) {
         try {
            if (var33 >= this.b.length) {
               break;
            }
         } catch (Exception var16) {
            var10001 = false;
            break;
         }

         try {
            this.b[var33] = var1.readShort();
         } catch (Exception var15) {
            var10001 = false;
            break;
         }

         ++var33;
      }

   }

   private void b(DataInputStream var1) {
      byte var14 = 0;
      byte var13 = 0;

      byte var4;
      boolean var10001;
      try {
         var4 = var1.readByte();
         StringBuffer var17 = new StringBuffer("small num= ");
         ds.c(var17.append(var4).toString());
         this.h = new z[var4];
      } catch (Exception var38) {
         var10001 = false;
         return;
      }

      int var3;
      for(var3 = 0; var3 < var4; ++var3) {
         z[] var18;
         z var45;
         try {
            var18 = this.h;
            var45 = new z();
         } catch (Exception var37) {
            var10001 = false;
            return;
         }

         var18[var3] = var45;

         try {
            this.h[var3].a = var1.readByte();
            this.h[var3].b = (short)var1.readUnsignedByte();
            this.h[var3].c = (short)var1.readUnsignedByte();
            this.h[var3].d = (short)var1.readUnsignedByte();
            this.h[var3].e = (short)var1.readUnsignedByte();
         } catch (Exception var36) {
            var10001 = false;
            return;
         }
      }

      short var15;
      try {
         var15 = var1.readShort();
         this.i = new cs[var15];
      } catch (Exception var35) {
         var10001 = false;
         return;
      }

      int var8 = 0;
      var3 = 0;
      int var39 = 0;
      short var5 = 0;
      short var6 = 0;

      while(true) {
         short var7;
         int var41;
         if (var8 >= var15) {
            try {
               var7 = var1.readShort();
               this.b = new short[var7];
            } catch (Exception var26) {
               var10001 = false;
               break;
            }

            var3 = var14;

            short[] var49;
            label276: {
               try {
                  if (this.d >= 201) {
                     var49 = new short[var7];
                     break label276;
                  }
               } catch (Exception var25) {
                  var10001 = false;
                  break;
               }

               for(; var3 < var7; ++var3) {
                  try {
                     this.b[var3] = var1.readShort();
                  } catch (Exception var24) {
                     var10001 = false;
                     return;
                  }
               }

               return;
            }

            var39 = 0;
            boolean var40 = false;
            String var47 = "";

            for(var41 = 0; var39 < var7; var41 = var3) {
               short var2;
               try {
                  var2 = var1.readShort();
                  StringBuffer var19 = new StringBuffer(String.valueOf(var47));
                  var47 = var19.append(var2).append(",").toString();
                  this.b[var39] = var2;
               } catch (Exception var23) {
                  var10001 = false;
                  return;
               }

               boolean var42;
               if (var2 + 500 >= 500) {
                  var3 = var41 + 1;
                  var49[var41] = var2;
                  var42 = true;
               } else {
                  try {
                     var6 = (short)ds.g(var2 + 500);
                     this.c[var6] = new short[var41];
                     System.arraycopy(var49, 0, this.c[var6], 0, var41);
                  } catch (Exception var22) {
                     var10001 = false;
                     return;
                  }

                  byte var43 = 0;
                  var42 = var40;
                  var3 = var43;
               }

               ++var39;
               var40 = var42;
            }

            var39 = var13;
            if (!var40) {
               try {
                  this.c[0] = new short[var41];
                  System.arraycopy(var49, 0, this.c[0], 0, var41);
               } catch (Exception var20) {
                  var10001 = false;
               }
               break;
            } else {
               for(; var39 < 16; ++var39) {
                  try {
                     if (this.c[var39] == null) {
                        this.c[var39] = this.c[2];
                     }
                  } catch (Exception var21) {
                     var10001 = false;
                     return;
                  }
               }

               return;
            }
         }

         cs[] var46;
         cs var48;
         try {
            var46 = this.i;
            var48 = new cs();
         } catch (Exception var30) {
            var10001 = false;
            break;
         }

         var46[var8] = var48;

         byte var16;
         try {
            var16 = var1.readByte();
            this.i[var8].a = new short[var16];
            this.i[var8].b = new short[var16];
            this.i[var8].c = new byte[var16];
         } catch (Exception var29) {
            var10001 = false;
            break;
         }

         for(int var9 = 0; var9 < var16; var6 = var7) {
            try {
               this.i[var8].a[var9] = var1.readShort();
               this.i[var8].b[var9] = var1.readShort();
               this.i[var8].c[var9] = var1.readByte();
            } catch (Exception var28) {
               var10001 = false;
               return;
            }

            int var12 = var3;
            int var11 = var39;
            short var10 = var5;
            var7 = var6;
            if (var8 == 0) {
               var7 = var6;

               try {
                  if (var6 > this.i[var8].a[var9]) {
                     var7 = this.i[var8].a[var9];
                  }
               } catch (Exception var34) {
                  var10001 = false;
                  return;
               }

               var6 = var5;

               try {
                  if (var5 > this.i[var8].b[var9]) {
                     var6 = this.i[var8].b[var9];
                  }
               } catch (Exception var33) {
                  var10001 = false;
                  return;
               }

               var41 = var39;

               try {
                  if (var39 < this.i[var8].a[var9] + this.h[this.i[var8].c[var9]].d) {
                     var41 = this.i[var8].a[var9] + this.h[this.i[var8].c[var9]].d;
                  }
               } catch (Exception var32) {
                  var10001 = false;
                  return;
               }

               var39 = var3;

               try {
                  if (var3 < this.i[var8].b[var9] + this.h[this.i[var8].c[var9]].e) {
                     var39 = this.i[var8].b[var9] + this.h[this.i[var8].c[var9]].e;
                  }
               } catch (Exception var31) {
                  var10001 = false;
                  return;
               }

               try {
                  this.f = var41 - var7;
                  this.g = var39 - var6;
               } catch (Exception var27) {
                  var10001 = false;
                  return;
               }

               var10 = var6;
               var11 = var41;
               var12 = var39;
            }

            ++var9;
            var3 = var12;
            var39 = var11;
            var5 = var10;
         }

         ++var8;
      }

   }

   public final void a(en var1, int var2, int var3, int var4, int var5, int var6) {
      if (this.i != null && this.i.length != 0) {
         cs var15 = this.i[var2];

         for(var2 = 0; var2 < var15.a.length; ++var2) {
            byte var8 = var15.c[var2];

            int var7;
            z var14;
            label74: {
               for(var7 = 0; var7 < this.h.length; ++var7) {
                  if (this.h[var7].a == var8) {
                     var14 = this.h[var7];
                     break label74;
                  }
               }

               var14 = null;
            }

            boolean var10001;
            if (var5 == -1) {
               try {
                  var1.a(this.a, var14.b, var14.c, var14.d, var14.e, 0, var3 + var15.a[var2], var4 + var15.b[var2], 0);
               } catch (Exception var17) {
                  var10001 = false;
               }
            } else {
               short var9;
               int var10;
               short var11;
               int var12;
               int var13;
               Image var16;
               int var27;
               if (var5 == 0) {
                  try {
                     var16 = this.a;
                     var13 = var14.b;
                     var12 = var14.c;
                     var27 = var14.d;
                     var10 = var14.e;
                     var9 = var15.a[var2];
                     var11 = var15.b[var2];
                  } catch (Exception var20) {
                     var10001 = false;
                     continue;
                  }

                  if (var6 < 4 && var6 > 0) {
                     try {
                        var7 = main.a.ae;
                     } catch (Exception var19) {
                        var10001 = false;
                        continue;
                     }
                  } else {
                     var7 = 0;
                  }

                  try {
                     var1.a(var16, var13, var12, var27, var10, 0, var3 + var9, var4 + var11 - var7, 0);
                  } catch (Exception var18) {
                     var10001 = false;
                  }
               } else if (var5 == 1) {
                  short var28;
                  int var29;
                  int var30;
                  short var31;
                  try {
                     var16 = this.a;
                     var13 = var14.b;
                     var10 = var14.c;
                     var29 = var14.d;
                     var30 = var14.e;
                     var28 = var15.a[var2];
                     var31 = var15.b[var2];
                  } catch (Exception var23) {
                     var10001 = false;
                     continue;
                  }

                  if (var6 < 4 && var6 > 0) {
                     try {
                        var7 = main.a.ae;
                     } catch (Exception var22) {
                        var10001 = false;
                        continue;
                     }
                  } else {
                     var7 = 0;
                  }

                  try {
                     var1.a(var16, var13, var10, var29, var30, 2, var3 - var28, var4 + var31 - var7, cj.b);
                  } catch (Exception var21) {
                     var10001 = false;
                  }
               } else if (var5 == 2) {
                  try {
                     var16 = this.a;
                     var10 = var14.b;
                     var27 = var14.c;
                     var12 = var14.d;
                     var13 = var14.e;
                     var11 = var15.a[var2];
                     var9 = var15.b[var2];
                  } catch (Exception var26) {
                     var10001 = false;
                     continue;
                  }

                  if (var6 < 4 && var6 > 0) {
                     try {
                        var7 = main.a.ae;
                     } catch (Exception var25) {
                        var10001 = false;
                        continue;
                     }
                  } else {
                     var7 = 0;
                  }

                  try {
                     var1.a(var16, var10, var27, var12, var13, 7, var3 - var11, var4 + var9 - var7, cj.f);
                  } catch (Exception var24) {
                     var10001 = false;
                  }
               }
            }
         }
      }

   }

   public final void a(String var1) {
      DataInputStream var2;
      try {
         InputStream var4 = ad.a(var1);
         var2 = new DataInputStream(var4);
      } catch (Exception var3) {
         return;
      }

      this.b(var2);
   }

   public final void a(byte[] var1) {
      this.b(new DataInputStream(new ByteArrayInputStream(var1)));
   }

   public final void a(byte[] var1, byte var2) {
      this.a(new DataInputStream(new ByteArrayInputStream(var1)), var2);
   }

   public final void b(String var1) {
      DataInputStream var2;
      try {
         InputStream var4 = ad.a(var1);
         var2 = new DataInputStream(var4);
      } catch (Exception var3) {
         return;
      }

      this.a(var2);
   }
}
