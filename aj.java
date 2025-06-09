import java.io.IOException;
import main.GameMidlet;

public class aj {
   int a;
   int b;
   int c;
   int d;
   int e;
   int f;
   int g;
   int h;
   int i;
   int j;
   float k;
   long l;
   long m;
   boolean n;
   int[] o;
   int[] p;

   public aj() {
   }

   public aj(int var1, int var2, int var3, int var4, int var5) {
      byte var6 = 0;
      super();
      this.i = 0;
      this.j = 16711680;
      this.l = 0L;
      this.m = 150L;
      this.n = true;
      this.o = new int[2];
      this.p = new int[2];
      this.g = var2;
      this.d = var1;
      this.k = 1.0F;
      this.c = var3;
      this.h = var4;
      this.a = main.a.A;
      this.b = main.a.B;
      this.l = System.currentTimeMillis();

      for(var3 = var6; var3 < 2; ++var3) {
         this.o[var3] = var1;
         this.p[var3] = var2;
      }

      this.j = var5;
   }

   public static void a(en var0, int var1, int var2, int var3) {
      var0.a(var3);
      var0.d(var1, var2, 1, 2);
   }

   public static void a(y var0) {
      byte var10;
      boolean var10001;
      try {
         var10 = var0.a;
      } catch (Exception var261) {
         var10001 = false;
         return;
      }

      byte var1;
      short var8;
      short var9;
      Exception var267;
      int var11;
      String var268;
      short var12;
      StringBuffer var269;
      short var13;
      af var270;
      short var14;
      short var15;
      ea var271;
      short var16;
      Exception var10000;
      short var17;
      boolean var19;
      long var20;
      int var277;
      short var278;
      af var22;
      byte var279;
      ee[] var23;
      byte var280;
      ef var24;
      int var282;
      int var283;
      byte var286;
      byte var287;
      int var293;
      short var294;
      StringBuffer var295;
      do var297;
      af[] var299;
      long[] var306;
      ee var307;
      h var309;
      String var320;
      byte[] var325;
      switch(var10) {
      case -128:
         label2138: {
            label2079: {
               try {
                  var279 = var0.c().readByte();
                  var277 = var0.c().readInt();
                  if (var277 == af.e().J) {
                     var22 = af.e();
                     break label2079;
                  }
               } catch (Exception var260) {
                  var10000 = var260;
                  var10001 = false;
                  break label2138;
               }

               try {
                  var22 = p.b(var277);
               } catch (Exception var259) {
                  var10000 = var259;
                  var10001 = false;
                  break label2138;
               }
            }

            if (var279 == 0) {
               label2139: {
                  try {
                     var12 = var0.c().readShort();
                     var280 = var0.c().readByte();
                     var279 = var0.c().readByte();
                     var278 = var0.c().readShort();
                     var1 = var0.c().readByte();
                  } catch (Exception var257) {
                     var10000 = var257;
                     var10001 = false;
                     break label2139;
                  }

                  if (var22 == null) {
                     break;
                  }

                  try {
                     var271 = new ea(var12, var22, var280, var279, var278, var1);
                     var22.a(var271);
                     break;
                  } catch (Exception var254) {
                     var10000 = var254;
                     var10001 = false;
                  }
               }
            } else if (var279 == 1) {
               label2140: {
                  try {
                     var278 = var0.c().readShort();
                  } catch (Exception var258) {
                     var10000 = var258;
                     var10001 = false;
                     break label2140;
                  }

                  if (var22 == null) {
                     break;
                  }

                  try {
                     var22.b((int)0, (int)var278);
                     break;
                  } catch (Exception var255) {
                     var10000 = var255;
                     var10001 = false;
                  }
               }
            } else {
               if (var279 != 2 || var22 == null) {
                  break;
               }

               try {
                  var22.b((int)-1, (int)0);
                  break;
               } catch (Exception var256) {
                  var10000 = var256;
                  var10001 = false;
               }
            }
         }

         var267 = var10000;

         try {
            var267.printStackTrace();
         } catch (Exception var43) {
            var10001 = false;
         }
         break;
      case -127:
         try {
            b(var0);
         } catch (Exception var253) {
            var10001 = false;
         }
         break;
      case -126:
         try {
            var10 = var0.c().readByte();
            var295 = new StringBuffer("type quay= ");
            ds.c(var295.append(var10).toString());
         } catch (Exception var252) {
            var10001 = false;
            break;
         }

         if (var10 == 1) {
            try {
               var0.c().readByte();
               var320 = var0.c().readUTF();
               String var327 = var0.c().readUTF();
               p.j().b(var320, var327);
            } catch (Exception var251) {
               var10001 = false;
               break;
            }
         }

         if (var10 == 0) {
            try {
               p.j().b(var0.c().readUTF());
            } catch (Exception var250) {
               var10001 = false;
            }
         }
         break;
      case -125:
         try {
            cq.b().b = false;
            var320 = var0.c().readUTF();
            var295 = new StringBuffer("titile= ");
            ds.c(var295.append(var320).toString());
            var279 = var0.c().readByte();
            er.a().a(var279, (String)var320);
         } catch (Exception var249) {
            var10001 = false;
            break;
         }

         for(var277 = 0; var277 < var279; ++var277) {
            try {
               er.a().a[var277].i = var0.c().readUTF();
               var286 = var0.c().readByte();
            } catch (Exception var248) {
               var10001 = false;
               return;
            }

            if (var286 == 0) {
               try {
                  er.a().a[var277].c(1);
               } catch (Exception var247) {
                  var10001 = false;
                  return;
               }
            }

            if (var286 == 1) {
               try {
                  er.a().a[var277].c(0);
               } catch (Exception var246) {
                  var10001 = false;
                  return;
               }
            }

            if (var286 == 2) {
               try {
                  er.a().a[var277].c(2);
               } catch (Exception var245) {
                  var10001 = false;
                  return;
               }
            }
         }

         return;
      case -124:
         try {
            var10 = var0.c().readByte();
            var279 = var0.c().readByte();
         } catch (Exception var244) {
            var10001 = false;
            break;
         }

         if (var279 == 0) {
            if (var10 == 2) {
               label2209: {
                  try {
                     var283 = var0.c().readInt();
                     if (var283 == af.e().J) {
                        af.e().S();
                        break label2209;
                     }
                  } catch (Exception var243) {
                     var10001 = false;
                     break;
                  }

                  try {
                     if (p.b(var283) != null) {
                        p.b(var283).S();
                     }
                  } catch (Exception var242) {
                     var10001 = false;
                     break;
                  }
               }
            }

            try {
               var282 = var0.c().readUnsignedByte();
               var293 = var0.c().readInt();
               var295 = new StringBuffer("playerID= ");
               ds.c(var295.append(var293).append(" skillID= ").append(var282).toString());
            } catch (Exception var230) {
               var10001 = false;
               break;
            }

            if (var282 == 32) {
               if (var10 == 1) {
                  label2197: {
                     try {
                        var283 = var0.c().readInt();
                        if (var293 == af.e().J) {
                           af.e().cI = var282;
                           p.b(var283).b(af.e());
                           break label2197;
                        }
                     } catch (Exception var239) {
                        var10001 = false;
                        break;
                     }

                     try {
                        if (p.b(var293) != null && var283 != af.e().J) {
                           p.b(var293).cI = var282;
                           p.b(var283).b(p.b(var293));
                           break label2197;
                        }
                     } catch (Exception var240) {
                        var10001 = false;
                        break;
                     }

                     try {
                        if (p.b(var293) != null && var283 == af.e().J) {
                           p.b(var293).cI = var282;
                           af.e().b(p.b(var293));
                        }
                     } catch (Exception var228) {
                        var10001 = false;
                        break;
                     }
                  }
               } else {
                  label2211: {
                     try {
                        if (var293 == af.e().J) {
                           af.e().P();
                           break label2211;
                        }
                     } catch (Exception var241) {
                        var10001 = false;
                        break;
                     }

                     try {
                        if (p.b(var293) != null) {
                           p.b(var293).P();
                        }
                     } catch (Exception var229) {
                        var10001 = false;
                        break;
                     }
                  }
               }
            }

            if (var282 == 33) {
               if (var10 == 1) {
                  label1973: {
                     try {
                        if (var293 == af.e().J) {
                           af.e().cK = true;
                           break label1973;
                        }
                     } catch (Exception var237) {
                        var10001 = false;
                        break;
                     }

                     try {
                        if (p.b(var293) != null) {
                           p.b(var293).cK = true;
                        }
                     } catch (Exception var226) {
                        var10001 = false;
                        break;
                     }
                  }
               } else {
                  label2213: {
                     try {
                        if (var293 == af.e().J) {
                           af.e().Q();
                           break label2213;
                        }
                     } catch (Exception var238) {
                        var10001 = false;
                        break;
                     }

                     try {
                        if (p.b(var293) != null) {
                           p.b(var293).Q();
                        }
                     } catch (Exception var227) {
                        var10001 = false;
                        break;
                     }
                  }
               }
            }

            if (var282 == 39) {
               if (var10 == 1) {
                  label1955: {
                     try {
                        if (var293 == af.e().J) {
                           af.e().cN = true;
                           break label1955;
                        }
                     } catch (Exception var235) {
                        var10001 = false;
                        break;
                     }

                     try {
                        if (p.b(var293) != null) {
                           p.b(var293).cN = true;
                        }
                     } catch (Exception var224) {
                        var10001 = false;
                        break;
                     }
                  }
               } else {
                  label2215: {
                     try {
                        if (var293 == af.e().J) {
                           af.e().T();
                           break label2215;
                        }
                     } catch (Exception var236) {
                        var10001 = false;
                        break;
                     }

                     try {
                        if (p.b(var293) != null) {
                           p.b(var293).T();
                        }
                     } catch (Exception var225) {
                        var10001 = false;
                        break;
                     }
                  }
               }
            }

            if (var282 == 40) {
               if (var10 == 1) {
                  label1937: {
                     try {
                        if (var293 == af.e().J) {
                           af.e().cO = true;
                           break label1937;
                        }
                     } catch (Exception var233) {
                        var10001 = false;
                        break;
                     }

                     try {
                        if (p.b(var293) != null) {
                           p.b(var293).cO = true;
                        }
                     } catch (Exception var222) {
                        var10001 = false;
                        break;
                     }
                  }
               } else {
                  label2217: {
                     try {
                        if (var293 == af.e().J) {
                           af.e().R();
                           break label2217;
                        }
                     } catch (Exception var234) {
                        var10001 = false;
                        break;
                     }

                     try {
                        if (p.b(var293) != null) {
                           p.b(var293).R();
                        }
                     } catch (Exception var223) {
                        var10001 = false;
                        break;
                     }
                  }
               }
            }

            if (var282 == 41) {
               if (var10 == 1) {
                  label1919: {
                     try {
                        if (var293 == af.e().J) {
                           af.e().cQ = true;
                           break label1919;
                        }
                     } catch (Exception var231) {
                        var10001 = false;
                        break;
                     }

                     try {
                        if (p.b(var293) != null) {
                           p.b(var293).cQ = true;
                        }
                     } catch (Exception var220) {
                        var10001 = false;
                        break;
                     }
                  }
               } else {
                  label2219: {
                     try {
                        if (var293 == af.e().J) {
                           af.e().V();
                           break label2219;
                        }
                     } catch (Exception var232) {
                        var10001 = false;
                        break;
                     }

                     try {
                        if (p.b(var293) != null) {
                           p.b(var293).V();
                        }
                     } catch (Exception var221) {
                        var10001 = false;
                        break;
                     }
                  }
               }
            }

            if (var282 == 42) {
               if (var10 == 1) {
                  try {
                     if (var293 == af.e().J) {
                        af.e().cR = true;
                     }
                  } catch (Exception var218) {
                     var10001 = false;
                     break;
                  }
               } else {
                  try {
                     if (var293 == af.e().J) {
                        af.e().cR = false;
                        ds.c("tra ve huy chieu 2");
                     }
                  } catch (Exception var219) {
                     var10001 = false;
                     break;
                  }
               }
            }
         }

         if (var279 == 1) {
            try {
               var11 = var0.c().readUnsignedByte();
               var1 = var0.c().readByte();
               var295 = new StringBuffer("modbHoldID= ");
               ds.c(var295.append(var1).append(" skillID= ").append(var11).append("eff ID= ").append(var10).toString());
            } catch (Exception var217) {
               var10001 = false;
               break;
            }

            if (var11 == 32) {
               if (var10 == 1) {
                  label1888: {
                     try {
                        var283 = var0.c().readInt();
                        if (var283 == af.e().J) {
                           p.a(var1).j = var11;
                           af.e().a(p.a(var1));
                           break label1888;
                        }
                     } catch (Exception var216) {
                        var10001 = false;
                        break;
                     }

                     try {
                        if (p.b(var283) != null) {
                           p.a(var1).j = var11;
                           p.b(var283).a(p.a(var1));
                        }
                     } catch (Exception var214) {
                        var10001 = false;
                        break;
                     }
                  }
               } else {
                  try {
                     p.a(var1).r();
                  } catch (Exception var215) {
                     var10001 = false;
                     break;
                  }
               }
            }

            if (var11 == 40) {
               if (var10 == 1) {
                  try {
                     p.a(var1).ab = true;
                  } catch (Exception var213) {
                     var10001 = false;
                     break;
                  }
               } else {
                  try {
                     p.a(var1).s();
                  } catch (Exception var212) {
                     var10001 = false;
                     break;
                  }
               }
            }

            if (var11 == 41) {
               if (var10 == 1) {
                  try {
                     p.a(var1).ac = true;
                  } catch (Exception var210) {
                     var10001 = false;
                  }
               } else {
                  try {
                     p.a(var1).t();
                  } catch (Exception var211) {
                     var10001 = false;
                  }
               }
            }
         }
         break;
      case -123:
         try {
            var277 = var0.c().readInt();
            if (p.b(var277) != null) {
               p.b(var277).cS = var0.c().readByte();
            }
         } catch (Exception var209) {
            var10001 = false;
         }
         break;
      case -122:
         try {
            var297 = p.a(var0.c().readShort());
            var279 = var0.c().readByte();
            var297.dj = new int[var279];
         } catch (Exception var208) {
            var10001 = false;
            break;
         }

         for(var277 = 0; var277 < var279; ++var277) {
            try {
               var297.dj[var277] = var0.c().readShort();
            } catch (Exception var207) {
               var10001 = false;
               return;
            }
         }

         try {
            var297.a(var0.c().readByte(), var0.c().readInt());
         } catch (Exception var206) {
            var10001 = false;
         }
         break;
      case -121:
         try {
            bt.e = l.d() - bt.c;
            bt.a().e();
         } catch (Exception var205) {
            var10001 = false;
         }
         break;
      case -120:
         try {
            bt.d = l.d() - bt.b;
            bt.a().d();
         } catch (Exception var204) {
            var10001 = false;
         }
         break;
      case -119:
         try {
            af.e().w = var0.c().readInt();
         } catch (Exception var203) {
            var10001 = false;
         }
         break;
      case -117:
         try {
            p.j().bU = 0;
            p.j().bS = var0.c().readByte();
            if (p.j().bS == 100) {
               p.j().bT = true;
            }
         } catch (Exception var202) {
            var10001 = false;
            break;
         }

         try {
            if (p.j().bS == 101) {
               do.di = true;
            }
         } catch (Exception var201) {
            var10001 = false;
         }
         break;
      case -116:
         label1839: {
            label1838: {
               try {
                  if (var0.c().readByte() == 1) {
                     break label1838;
                  }
               } catch (Exception var200) {
                  var10001 = false;
                  break;
               }

               var19 = false;
               break label1839;
            }

            var19 = true;
         }

         try {
            p.bk = var19;
         } catch (Exception var199) {
            var10001 = false;
         }
         break;
      case -115:
         try {
            af.e().a(var0.c().readUTF(), var0.c().readShort(), var0.c().readShort(), var0.c().readShort());
         } catch (Exception var198) {
            var10001 = false;
         }
         break;
      case -113:
         try {
            var325 = new byte[10];
         } catch (Exception var197) {
            var10001 = false;
            break;
         }

         for(var277 = 0; var277 < 10; ++var277) {
            try {
               var325[var277] = var0.c().readByte();
            } catch (Exception var196) {
               var10001 = false;
               return;
            }
         }

         try {
            p.j().b(var325);
            p.j().a(var325);
            p.j().c(var325);
         } catch (Exception var195) {
            var10001 = false;
         }
         break;
      case -111:
         el var326;
         try {
            var294 = var0.c().readShort();
            var326 = new el("");
            u.b = var326;
         } catch (Exception var194) {
            var10001 = false;
            break;
         }

         for(var277 = 0; var277 < var294; ++var277) {
            try {
               String var311 = var0.c().readUTF();
               var1 = var0.c().readByte();
               var326 = u.b;
               u var318 = new u(var311, var1);
               var326.addElement(var318);
            } catch (Exception var193) {
               var10001 = false;
               return;
            }
         }

         try {
            u.a();
            u.b();
         } catch (Exception var192) {
            var10001 = false;
         }
         break;
      case -110:
         try {
            var279 = var0.c().readByte();
         } catch (Exception var191) {
            var10001 = false;
            break;
         }

         if (var279 == 1) {
            try {
               var277 = var0.c().readInt();
               var295 = new StringBuffer(String.valueOf(var277));
               var325 = av.b(var295.toString());
            } catch (Exception var190) {
               var10001 = false;
               break;
            }

            if (var325 == null) {
               try {
                  bt.a().a((byte)1, -1, (byte[])null);
               } catch (Exception var189) {
                  var10001 = false;
                  break;
               }
            } else {
               try {
                  bt.a().a((byte)1, var277, (byte[])var325);
               } catch (Exception var188) {
                  var10001 = false;
                  break;
               }
            }
         }

         if (var279 == 0) {
            try {
               var11 = var0.c().readInt();
               var278 = var0.c().readShort();
               var325 = new byte[var278];
               var0.c().read(var325, 0, var278);
               var269 = new StringBuffer(String.valueOf(var11));
               av.a(var269.toString(), var325);
            } catch (Exception var187) {
               var10001 = false;
            }
         }
         break;
      case -106:
         try {
            var8 = var0.c().readShort();
            var278 = var0.c().readShort();
            if (cy.a(var8)) {
               cy.c(var8).a(var278, false);
               break;
            }
         } catch (Exception var265) {
            var10001 = false;
            break;
         }

         try {
            cy var276 = new cy(var8, var278);
            af.br.addElement(var276);
         } catch (Exception var186) {
            var10001 = false;
         }
         break;
      case -105:
         try {
            au.a().b = 0;
            au.a().c = var0.c().readShort();
            au var316 = au.a();
            au var324 = au.a();
            var20 = System.currentTimeMillis();
            var324.e = var20;
            var316.d = var20;
            au.a().a = var0.c().readByte();
            au.a().b();
         } catch (Exception var185) {
            var10001 = false;
         }
         break;
      case -103:
         try {
            var10 = var0.c().readByte();
            var295 = new StringBuffer("server gui ve actionFlag = ");
            ds.c(var295.append(var10).toString());
         } catch (Exception var184) {
            var10001 = false;
            break;
         }

         if (var10 == 0) {
            try {
               main.a.G.Y.removeAllElements();
               var286 = var0.c().readByte();
            } catch (Exception var174) {
               var10001 = false;
               break;
            }

            for(var277 = 0; var277 < var286; ++var277) {
               try {
                  var309 = new h();
                  var8 = var0.c().readShort();
               } catch (Exception var172) {
                  var10001 = false;
                  return;
               }

               if (var8 != -1) {
                  try {
                     var309.b = dp.a(var8);
                     var279 = var0.c().readByte();
                  } catch (Exception var171) {
                     var10001 = false;
                     return;
                  }

                  if (var279 != -1) {
                     try {
                        var309.a = new ee[var279];
                     } catch (Exception var170) {
                        var10001 = false;
                        return;
                     }

                     var11 = 0;

                     while(true) {
                        try {
                           if (var11 >= var309.a.length) {
                              break;
                           }
                        } catch (Exception var173) {
                           var10001 = false;
                           return;
                        }

                        try {
                           ac.a();
                           var307 = ac.b(var0);
                        } catch (Exception var169) {
                           var10001 = false;
                           return;
                        }

                        if (var307 != null) {
                           try {
                              var309.a[var11] = var307;
                           } catch (Exception var168) {
                              var10001 = false;
                              return;
                           }
                        }

                        ++var11;
                     }
                  }
               }

               try {
                  main.a.G.Y.addElement(var309);
               } catch (Exception var167) {
                  var10001 = false;
                  return;
               }
            }

            try {
               main.a.G.h();
               main.a.G.s();
            } catch (Exception var166) {
               var10001 = false;
            }
         } else if (var10 == 1) {
            label2173: {
               try {
                  var277 = var0.c().readInt();
                  var1 = var0.c().readByte();
                  var269 = new StringBuffer("---------------actionFlag1:  ");
                  ds.c(var269.append(var277).append(" : ").append(var1).toString());
                  if (var277 == af.e().J) {
                     af.e().by = var1;
                     break label2173;
                  }
               } catch (Exception var177) {
                  var10001 = false;
                  break;
               }

               try {
                  if (p.b(var277) != null) {
                     p.b(var277).by = var1;
                  }
               } catch (Exception var176) {
                  var10001 = false;
                  break;
               }
            }

            try {
               p.j();
               p.a(var277, var1);
            } catch (Exception var175) {
               var10001 = false;
            }
         } else if (var10 == 2) {
            try {
               var1 = var0.c().readByte();
               var294 = var0.c().readShort();
               ep var275 = new ep();
               var275.a = var1;
               var275.b = var294;
               p.H.addElement(var275);
            } catch (Exception var183) {
               var10001 = false;
               break;
            }

            var277 = 0;

            while(true) {
               try {
                  if (var277 >= p.H.size()) {
                     break;
                  }
               } catch (Exception var182) {
                  var10001 = false;
                  return;
               }

               try {
                  ep var323 = (ep)p.H.elementAt(var277);
                  var269 = new StringBuffer("i: ");
                  ds.c(var269.append(var277).append("  cflag: ").append(var323.a).append("   IDimageFlag: ").append(var323.b).toString());
               } catch (Exception var181) {
                  var10001 = false;
                  return;
               }

               ++var277;
            }

            var277 = 0;

            while(true) {
               try {
                  if (var277 >= p.D.size()) {
                     if (af.e().by == var1) {
                        af.e().bz = var294;
                     }

                     return;
                  }
               } catch (Exception var180) {
                  var10001 = false;
                  return;
               }

               try {
                  var270 = (af)p.D.elementAt(var277);
               } catch (Exception var179) {
                  var10001 = false;
                  return;
               }

               if (var270 != null) {
                  try {
                     if (var270.by == var1) {
                        var270.bz = var294;
                     }
                  } catch (Exception var178) {
                     var10001 = false;
                     return;
                  }
               }

               ++var277;
            }
         }
         break;
      case -102:
         try {
            var10 = var0.c().readByte();
         } catch (Exception var165) {
            var10001 = false;
            break;
         }

         if (var10 != 0 && var10 == 1) {
            try {
               main.a.I.n = false;
               bt.a().a(av.c("acc"), av.c("pass"), "2.4.6", (byte)0);
            } catch (Exception var164) {
               var10001 = false;
            }
         }
         break;
      case -101:
         try {
            if (main.a.I == null) {
               x var322 = new x();
               main.a.I = var322;
            }
         } catch (Exception var163) {
            var10001 = false;
            break;
         }

         try {
            main.a.I.n = true;
            main.a.b();
            var268 = var0.c().readUTF();
            var295 = new StringBuffer("userAo");
            av.a(var295.append(bs.n).toString(), var268);
            bt.a().c();
            bt.a().a(var268, "", "2.4.6", (byte)1);
         } catch (Exception var162) {
            var10001 = false;
         }
         break;
      case -100:
         boolean var310;
         label1689: {
            label1688: {
               try {
                  bp.c();
                  if (main.a.A <= g.ab * 2) {
                     break label1688;
                  }
               } catch (Exception var161) {
                  var10001 = false;
                  break;
               }

               var310 = true;
               break label1689;
            }

            var310 = false;
         }

         try {
            var280 = var0.c().readByte();
         } catch (Exception var160) {
            var10001 = false;
            break;
         }

         if (var280 >= 0) {
            try {
               var295 = new StringBuffer("t Indxe= ");
               ds.c(var295.append(var280).toString());
               main.a.G.K[var280] = var0.c().readByte();
               main.a.G.L[var280] = var0.c().readByte();
               var295 = new StringBuffer("max page= ");
               ds.c(var295.append(main.a.G.K[var280]).append(" curr page= ").append(main.a.G.L[var280]).toString());
               var293 = var0.c().readUnsignedByte();
               af.e().aJ[var280] = new h[var293];
               g.ar = aw.er;
            } catch (Exception var159) {
               var10001 = false;
               break;
            }

            for(var11 = 0; var11 < var293; ++var11) {
               try {
                  var8 = var0.c().readShort();
               } catch (Exception var156) {
                  var10001 = false;
                  return;
               }

               if (var8 != -1) {
                  h[] var315;
                  try {
                     var315 = af.e().aJ[var280];
                     var309 = new h();
                  } catch (Exception var155) {
                     var10001 = false;
                     return;
                  }

                  var315[var11] = var309;

                  try {
                     af.e().aJ[var280][var11].b = dp.a(var8);
                     af.e().aJ[var280][var11].d = var0.c().readShort();
                     af.e().aJ[var280][var11].n = var0.c().readInt();
                     af.e().aJ[var280][var11].p = var0.c().readInt();
                     af.e().aJ[var280][var11].v = var0.c().readByte();
                     af.e().aJ[var280][var11].h = var0.c().readInt();
                     af.e().aJ[var280][var11].B = var0.c().readByte();
                     var286 = var0.c().readByte();
                  } catch (Exception var154) {
                     var10001 = false;
                     return;
                  }

                  if (var286 != -1) {
                     try {
                        af.e().aJ[var280][var11].a = new ee[var286];
                     } catch (Exception var153) {
                        var10001 = false;
                        return;
                     }

                     var283 = 0;

                     while(true) {
                        try {
                           if (var283 >= af.e().aJ[var280][var11].a.length) {
                              break;
                           }
                        } catch (Exception var158) {
                           var10001 = false;
                           return;
                        }

                        ee var321;
                        try {
                           ac.a();
                           var321 = ac.b(var0);
                        } catch (Exception var152) {
                           var10001 = false;
                           return;
                        }

                        if (var321 != null) {
                           try {
                              af.e().aJ[var280][var11].a[var283] = var321;
                              af.e().aJ[var280][var11].A = main.a.G.a(af.e().aJ[var280][var11]);
                           } catch (Exception var151) {
                              var10001 = false;
                              return;
                           }
                        }

                        ++var283;
                     }
                  }

                  try {
                     if (var0.c().readByte() == 1) {
                        var15 = var0.c().readShort();
                        var17 = var0.c().readShort();
                        var12 = var0.c().readShort();
                        var16 = var0.c().readShort();
                        af.e().aJ[var280][var11].a(var15, var17, var12, var16);
                     }
                  } catch (Exception var157) {
                     var10001 = false;
                     return;
                  }

                  try {
                     if (GameMidlet.e >= 237) {
                        af.e().aJ[var280][var11].H = var0.c().readUTF();
                        var295 = new StringBuffer("nguoi ki gui  ");
                        ds.b(var295.append(af.e().aJ[var280][var11].H).toString());
                     }
                  } catch (Exception var150) {
                     var10001 = false;
                     return;
                  }
               }
            }

            if (var310) {
               try {
                  main.a.H.e();
               } catch (Exception var149) {
                  var10001 = false;
                  break;
               }
            }

            try {
               main.a.G.y();
               g var274 = main.a.G;
               main.a.G.f = 0;
               var274.g = 0;
            } catch (Exception var148) {
               var10001 = false;
            }
         }
         break;
      case -89:
         label1630: {
            label1629: {
               try {
                  if (var0.c().readByte() == 1) {
                     break label1629;
                  }
               } catch (Exception var147) {
                  var10001 = false;
                  break;
               }

               var19 = false;
               break label1630;
            }

            var19 = true;
         }

         try {
            main.a.an = var19;
         } catch (Exception var146) {
            var10001 = false;
         }
         break;
      case 31:
         int var291;
         label2146: {
            try {
               var291 = var0.c().readInt();
               if (var0.c().readByte() != 1) {
                  break label2146;
               }

               var8 = var0.c().readShort();
            } catch (Exception var264) {
               var10001 = false;
               break;
            }

            var279 = -1;
            var23 = null;
            var24 = null;
            var287 = 0;
            byte var288 = 0;
            byte var292 = 0;
            var278 = var287;
            int[] var317 = (int[])var23;

            label1140: {
               int[] var312;
               label1139: {
                  label2147: {
                     try {
                        var286 = var0.c().readByte();
                     } catch (Exception var35) {
                        var10001 = false;
                        break label2147;
                     }

                     var278 = var288;
                     var317 = (int[])var24;
                     var279 = var286;
                     var14 = var292;
                     if (var286 <= 0) {
                        break label1140;
                     }

                     var278 = var287;
                     var317 = (int[])var23;
                     var279 = var286;

                     byte var289;
                     try {
                        var289 = var0.c().readByte();
                     } catch (Exception var34) {
                        var10001 = false;
                        break label2147;
                     }

                     var278 = var287;
                     var317 = (int[])var23;
                     var279 = var286;

                     try {
                        var312 = new int[var289];
                     } catch (Exception var33) {
                        var10001 = false;
                        break label2147;
                     }

                     for(var282 = 0; var282 < var289; ++var282) {
                        var278 = var287;
                        var317 = var312;
                        var279 = var286;

                        try {
                           var312[var282] = var0.c().readByte();
                        } catch (Exception var32) {
                           var10001 = false;
                           break label2147;
                        }
                     }

                     var278 = var287;
                     var317 = var312;
                     var279 = var286;

                     try {
                        var13 = var0.c().readShort();
                     } catch (Exception var31) {
                        var10001 = false;
                        break label2147;
                     }

                     var278 = var13;
                     var317 = var312;
                     var279 = var286;

                     try {
                        var14 = var0.c().readShort();
                        break label1139;
                     } catch (Exception var30) {
                        var10001 = false;
                     }
                  }

                  var14 = var292;
                  break label1140;
               }

               var279 = var286;
               var317 = var312;
               var278 = var13;
            }

            label2149: {
               try {
                  if (var291 == af.e().J) {
                     af var314 = af.e();
                     dk var273 = new dk();
                     var314.v = var273;
                     af.e().v.a = var8;
                     break label2149;
                  }
               } catch (Exception var144) {
                  var10001 = false;
                  break;
               }

               try {
                  var270 = p.b(var291);
                  dk var313 = new dk();
                  var270.v = var313;
                  var270.v.a = var8;
               } catch (Exception var143) {
                  var10001 = false;
                  break;
               }

               if (var279 > 0) {
                  try {
                     var270.v.a(var279, var317, var278, var14);
                  } catch (Exception var142) {
                     var10001 = false;
                  }
               }
               break;
            }

            if (var279 > 0) {
               try {
                  af.e().v.a(var279, var317, var278, var14);
               } catch (Exception var141) {
                  var10001 = false;
               }
            }
            break;
         }

         try {
            if (var291 == af.e().J) {
               af.e().v.a();
               af.e().v = null;
               break;
            }
         } catch (Exception var263) {
            var10001 = false;
            break;
         }

         try {
            var270 = p.b(var291);
            var270.v.a();
            var270.v = null;
         } catch (Exception var145) {
            var10001 = false;
         }
         break;
      case 42:
         try {
            main.a.h();
            x.c = false;
            af.bI = false;
            var1 = var0.c().readByte();
            if (main.a.J == null) {
               bi var272 = new bi(var1);
               main.a.J = var272;
            }
         } catch (Exception var140) {
            var10001 = false;
            break;
         }

         try {
            main.a.J.b();
         } catch (Exception var139) {
            var10001 = false;
         }
         break;
      case 48:
         try {
            bs.a(var0.c().readByte(), false);
            main.a.e();
            br.a().e();
            main.a.h();
            bs.m = true;
         } catch (Exception var138) {
            var10001 = false;
         }
         break;
      case 51:
         al var304;
         af[] var308;
         try {
            var304 = (al)p.b(var0.c().readInt());
            var1 = var0.c().readByte();
            var8 = var0.c().readShort();
            var9 = var0.c().readShort();
            var279 = var0.c().readByte();
            var308 = new af[var279];
            var306 = new long[var279];
         } catch (Exception var137) {
            var10001 = false;
            break;
         }

         for(var277 = 0; var277 < var279; ++var277) {
            try {
               var283 = var0.c().readInt();
               var295 = new StringBuffer("char ID=");
               ds.c(var295.append(var283).toString());
            } catch (Exception var135) {
               var10001 = false;
               return;
            }

            var308[var277] = null;

            label2125: {
               try {
                  if (var283 != af.e().J) {
                     var308[var277] = p.b(var283);
                     break label2125;
                  }
               } catch (Exception var136) {
                  var10001 = false;
                  return;
               }

               try {
                  var308[var277] = af.e();
               } catch (Exception var134) {
                  var10001 = false;
                  return;
               }
            }

            try {
               var306[var277] = var0.c().readLong();
            } catch (Exception var133) {
               var10001 = false;
               return;
            }
         }

         try {
            var304.a(var1, var8, var9, var308, var306);
         } catch (Exception var132) {
            var10001 = false;
         }
         break;
      case 52:
         try {
            var10 = var0.c().readByte();
         } catch (Exception var131) {
            var10001 = false;
            break;
         }

         if (var10 == 1) {
            label2164: {
               try {
                  var11 = var0.c().readInt();
                  if (var11 == af.e().J) {
                     af.e().c(true);
                     af.e().B = var0.c().readShort();
                     af.e().C = var0.c().readShort();
                     break label2164;
                  }
               } catch (Exception var130) {
                  var10001 = false;
                  break;
               }

               try {
                  var22 = p.b(var11);
               } catch (Exception var129) {
                  var10001 = false;
                  break;
               }

               if (var22 != null) {
                  try {
                     var22.c(true);
                     var22.B = var0.c().readShort();
                     var22.C = var0.c().readShort();
                  } catch (Exception var128) {
                     var10001 = false;
                     break;
                  }
               }
            }
         }

         if (var10 == 0) {
            label2165: {
               try {
                  var11 = var0.c().readInt();
                  if (var11 == af.e().J) {
                     af.e().c(false);
                     break label2165;
                  }
               } catch (Exception var127) {
                  var10001 = false;
                  break;
               }

               try {
                  var22 = p.b(var11);
               } catch (Exception var126) {
                  var10001 = false;
                  break;
               }

               if (var22 != null) {
                  try {
                     var22.c(false);
                  } catch (Exception var125) {
                     var10001 = false;
                     break;
                  }
               }
            }
         }

         if (var10 == 2) {
            try {
               var11 = var0.c().readInt();
               var283 = var0.c().readInt();
               ((al)p.b(var11)).c(var283);
            } catch (Exception var124) {
               var10001 = false;
               break;
            }
         }

         if (var10 == 3) {
            try {
               p.bW = var0.c().readByte();
            } catch (Exception var123) {
               var10001 = false;
            }
         }
         break;
      case 93:
         try {
            var268 = ds.a(var0.c().readUTF());
            p.j().a(var268);
         } catch (Exception var122) {
            var10001 = false;
         }
         break;
      case 100:
         try {
            var279 = var0.c().readByte();
            var10 = var0.c().readByte();
         } catch (Exception var121) {
            var10001 = false;
            break;
         }

         var309 = null;
         if (var279 == 0) {
            try {
               var309 = af.e().aH[var10];
            } catch (Exception var120) {
               var10001 = false;
               break;
            }
         }

         if (var279 == 1) {
            try {
               var309 = af.e().aF[var10];
            } catch (Exception var119) {
               var10001 = false;
               break;
            }
         }

         try {
            var8 = var0.c().readShort();
         } catch (Exception var118) {
            var10001 = false;
            break;
         }

         if (var8 != -1) {
            try {
               var309.b = dp.a(var8);
               var309.h = var0.c().readInt();
               var0.c().readUTF();
               var0.c().readUTF();
               var10 = var0.c().readByte();
            } catch (Exception var117) {
               var10001 = false;
               break;
            }

            if (var10 != 0) {
               try {
                  var309.a = new ee[var10];
               } catch (Exception var115) {
                  var10001 = false;
                  break;
               }

               var277 = 0;

               while(true) {
                  try {
                     if (var277 >= var309.a.length) {
                        break;
                     }
                  } catch (Exception var116) {
                     var10001 = false;
                     return;
                  }

                  try {
                     ac.a();
                     var307 = ac.b(var0);
                  } catch (Exception var114) {
                     var10001 = false;
                     return;
                  }

                  if (var307 != null) {
                     try {
                        var309.a[var277] = var307;
                     } catch (Exception var113) {
                        var10001 = false;
                        return;
                     }
                  }

                  ++var277;
               }
            }

            try {
               if (var309.h <= 0) {
               }
            } catch (Exception var112) {
               var10001 = false;
            }
         }
         break;
      case 101:
         cc var305;
         try {
            ds.c("big boss--------------------------------------------------");
            var305 = aa.w();
         } catch (Exception var111) {
            var10001 = false;
            break;
         }

         if (var305 != null) {
            try {
               var1 = var0.c().readByte();
            } catch (Exception var110) {
               var10001 = false;
               break;
            }

            if (var1 == 0 || var1 == 1 || var1 == 2 || var1 == 4 || var1 == 3) {
               if (var1 == 3) {
                  try {
                     var278 = var0.c().readShort();
                     var305.t = var278;
                     var305.a = var278;
                     var305.u = var0.c().readShort();
                     var305.D();
                  } catch (Exception var108) {
                     var10001 = false;
                     break;
                  }
               } else {
                  StringBuffer var301;
                  try {
                     var279 = var0.c().readByte();
                     var301 = new StringBuffer("CHUONG nChar= ");
                     ds.c(var301.append(var279).toString());
                     var299 = new af[var279];
                     var306 = new long[var279];
                  } catch (Exception var107) {
                     var10001 = false;
                     break;
                  }

                  for(var277 = 0; var277 < var279; ++var277) {
                     try {
                        var283 = var0.c().readInt();
                        var301 = new StringBuffer("char ID=");
                        ds.c(var301.append(var283).toString());
                     } catch (Exception var106) {
                        var10001 = false;
                        return;
                     }

                     var299[var277] = null;

                     label2129: {
                        try {
                           if (var283 != af.e().J) {
                              var299[var277] = p.b(var283);
                              break label2129;
                           }
                        } catch (Exception var109) {
                           var10001 = false;
                           return;
                        }

                        try {
                           var299[var277] = af.e();
                        } catch (Exception var105) {
                           var10001 = false;
                           return;
                        }
                     }

                     try {
                        var306[var277] = var0.c().readLong();
                     } catch (Exception var104) {
                        var10001 = false;
                        return;
                     }
                  }

                  try {
                     var305.a(var299, var306, var1);
                  } catch (Exception var103) {
                     var10001 = false;
                     break;
                  }
               }
            }

            if (var1 == 5) {
               try {
                  var305.b = true;
                  var305.p = 2;
               } catch (Exception var102) {
                  var10001 = false;
                  break;
               }
            }

            if (var1 == 6) {
               try {
                  var305.C();
                  var305.m = var0.c().readShort();
                  var305.n = var0.c().readShort();
               } catch (Exception var101) {
                  var10001 = false;
                  break;
               }
            }

            if (var1 == 7) {
               try {
                  var305.a((af[])null, (long[])null, var1);
               } catch (Exception var100) {
                  var10001 = false;
                  break;
               }
            }

            if (var1 == 8) {
               try {
                  var278 = var0.c().readShort();
                  var305.t = var278;
                  var305.a = var278;
                  var305.u = var0.c().readShort();
                  var305.p = 2;
               } catch (Exception var99) {
                  var10001 = false;
                  break;
               }
            }

            if (var1 == 9) {
               try {
                  var305.u = -1000;
                  var305.t = -1000;
                  var305.a = -1000;
                  var305.n = -1000;
                  var305.m = -1000;
               } catch (Exception var98) {
                  var10001 = false;
               }
            }
         }
         break;
      case 102:
         try {
            var1 = var0.c().readByte();
         } catch (Exception var97) {
            var10001 = false;
            break;
         }

         if (var1 == 0 || var1 == 1 || var1 == 2 || var1 == 6) {
            d var300;
            try {
               var300 = aa.x();
            } catch (Exception var95) {
               var10001 = false;
               break;
            }

            if (var300 == null) {
               break;
            }

            if (var1 == 6) {
               try {
                  var300.u = -1000;
                  var300.t = -1000;
                  var300.b = -1000;
                  var300.a = -1000;
                  var300.n = -1000;
                  var300.m = -1000;
               } catch (Exception var79) {
                  var10001 = false;
               }
               break;
            }

            long[] var296;
            try {
               var279 = var0.c().readByte();
               var299 = new af[var279];
               var296 = new long[var279];
            } catch (Exception var94) {
               var10001 = false;
               break;
            }

            for(var277 = 0; var277 < var279; ++var277) {
               try {
                  var283 = var0.c().readInt();
               } catch (Exception var93) {
                  var10001 = false;
                  return;
               }

               var299[var277] = null;

               label2156: {
                  try {
                     if (var283 != af.e().J) {
                        var299[var277] = p.b(var283);
                        break label2156;
                     }
                  } catch (Exception var96) {
                     var10001 = false;
                     return;
                  }

                  try {
                     var299[var277] = af.e();
                  } catch (Exception var92) {
                     var10001 = false;
                     return;
                  }
               }

               try {
                  var296[var277] = var0.c().readLong();
               } catch (Exception var91) {
                  var10001 = false;
                  return;
               }
            }

            try {
               var300.a(var299, var296, var1);
            } catch (Exception var90) {
               var10001 = false;
               break;
            }
         }

         if (var1 == 3 || var1 == 4 || var1 == 5 || var1 == 7) {
            an var298;
            try {
               var298 = aa.y();
            } catch (Exception var88) {
               var10001 = false;
               break;
            }

            if (var298 == null) {
               break;
            }

            if (var1 == 7) {
               try {
                  var298.u = -1000;
                  var298.t = -1000;
                  var298.b = -1000;
                  var298.a = -1000;
                  var298.n = -1000;
                  var298.m = -1000;
               } catch (Exception var80) {
                  var10001 = false;
               }
               break;
            }

            if (var1 == 3 || var1 == 4) {
               long[] var302;
               af[] var303;
               try {
                  var279 = var0.c().readByte();
                  var303 = new af[var279];
                  var302 = new long[var279];
               } catch (Exception var87) {
                  var10001 = false;
                  break;
               }

               for(var277 = 0; var277 < var279; ++var277) {
                  try {
                     var283 = var0.c().readInt();
                  } catch (Exception var86) {
                     var10001 = false;
                     return;
                  }

                  var303[var277] = null;

                  label2160: {
                     try {
                        if (var283 != af.e().J) {
                           var303[var277] = p.b(var283);
                           break label2160;
                        }
                     } catch (Exception var89) {
                        var10001 = false;
                        return;
                     }

                     try {
                        var303[var277] = af.e();
                     } catch (Exception var85) {
                        var10001 = false;
                        return;
                     }
                  }

                  try {
                     var302[var277] = var0.c().readLong();
                  } catch (Exception var84) {
                     var10001 = false;
                     return;
                  }
               }

               try {
                  var298.a(var303, var302, var1);
               } catch (Exception var83) {
                  var10001 = false;
                  break;
               }
            }

            if (var1 == 5) {
               try {
                  var298.b(var0.c().readShort());
               } catch (Exception var82) {
                  var10001 = false;
                  break;
               }
            }
         }

         if (var1 > 9 && var1 < 30) {
            try {
               a(var0, var1);
            } catch (Exception var81) {
               var10001 = false;
            }
         }
         break;
      case 113:
         var280 = 0;
         byte var285 = 0;
         byte var284 = 0;
         var15 = 0;
         byte var290 = -1;
         var10 = var285;

         label1171: {
            label1170: {
               label2133: {
                  label1168: {
                     label2134: {
                        try {
                           var279 = var0.c().readByte();
                        } catch (Exception var41) {
                           var10001 = false;
                           break label2134;
                        }

                        var10 = var285;
                        var280 = var279;

                        try {
                           var286 = var0.c().readByte();
                        } catch (Exception var40) {
                           var10001 = false;
                           break label2134;
                        }

                        var10 = var286;
                        var280 = var279;

                        try {
                           var16 = var0.c().readShort();
                           break label1168;
                        } catch (Exception var39) {
                           var10001 = false;
                        }
                     }

                     var287 = 0;
                     var14 = 0;
                     var279 = var280;
                     var286 = var10;
                     var278 = var287;
                     break label2133;
                  }

                  var13 = var16;

                  try {
                     var278 = var0.c().readShort();
                  } catch (Exception var38) {
                     var278 = 0;
                     var14 = var16;
                     break label2133;
                  }

                  var15 = var284;

                  label2135: {
                     try {
                        var16 = var0.c().readShort();
                     } catch (Exception var37) {
                        var10001 = false;
                        break label2135;
                     }

                     var15 = var16;

                     try {
                        var14 = var0.c().readShort();
                        break label1170;
                     } catch (Exception var36) {
                        var10001 = false;
                     }
                  }

                  var14 = var16;
               }

               var13 = var15;
               var15 = var290;
               break label1171;
            }

            var15 = var14;
            var14 = var13;
            var13 = var16;
         }

         try {
            var271 = new ea(var14, var278, var13, var286, var279, var15);
            ei.a(var271);
         } catch (Exception var78) {
            var10001 = false;
         }
         break;
      case 114:
         try {
            var0.c().readUTF();
            l.e = var0.c().readByte();
            l.f = var0.c().readByte();
         } catch (Exception var29) {
         }
         break;
      case 121:
         try {
            l.g = var0.c().readUTF();
            var0.c().readUTF();
            var269 = new StringBuffer("SHOW AD public ID= ");
            ds.c(var269.append(l.g).toString());
         } catch (Exception var77) {
            var10001 = false;
         }
         break;
      case 122:
         try {
            var8 = var0.c().readShort();
            var269 = new StringBuffer("second login = ");
            ds.c(var269.append(var8).toString());
            x.k = var8;
            var20 = System.currentTimeMillis();
            x.l = var20;
            x.m = var20;
            main.a.h();
         } catch (Exception var76) {
            var10001 = false;
         }
         break;
      case 123:
         label2131: {
            try {
               var277 = var0.c().readInt();
               var8 = var0.c().readShort();
               var9 = var0.c().readShort();
               var1 = var0.c().readByte();
               var269 = new StringBuffer("SET POSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSss x= ");
               ds.c(var269.append(var8).append(" y= ").append(var9).append("chaPos= ").append(var277).append("type Pos= ").append(var1).toString());
               if (var277 == af.e().J) {
                  var270 = af.e();
                  break label2131;
               }
            } catch (Exception var75) {
               var10001 = false;
               break;
            }

            try {
               if (p.b(var277) != null) {
                  var270 = p.b(var277);
                  break label2131;
               }
            } catch (Exception var74) {
               var10001 = false;
               break;
            }

            var270 = null;
         }

         if (var270 != null) {
            short var281;
            if (var1 == 0) {
               var281 = 60;
            } else {
               var281 = 173;
            }

            try {
               at.a(var281, (af)var270, 1);
               var270.a(var8, var9, var1);
            } catch (Exception var73) {
               var10001 = false;
            }
         }
         break;
      case 124:
         try {
            var8 = var0.c().readShort();
            var268 = var0.c().readUTF();
            var295 = new StringBuffer("noi chuyen = ");
            ds.c(var295.append(var268).append("npc ID= ").append(var8).toString());
            var297 = p.a(var8);
         } catch (Exception var72) {
            var10001 = false;
            break;
         }

         if (var297 != null) {
            try {
               var297.a(var268);
            } catch (Exception var71) {
               var10001 = false;
            }
         }
         break;
      case 125:
         try {
            var1 = var0.c().readByte();
            var277 = var0.c().readInt();
            if (var277 == af.e().J) {
               af.e().b(var1);
               break;
            }
         } catch (Exception var262) {
            var10001 = false;
            break;
         }

         try {
            if (p.b(var277) != null) {
               p.b(var277).b(var1);
            }
         } catch (Exception var70) {
            var10001 = false;
         }
         break;
      case 127:
         label2183: {
            try {
               var10 = var0.c().readByte();
            } catch (Exception var67) {
               var10000 = var67;
               var10001 = false;
               break label2183;
            }

            byte var2;
            if (var10 == 0) {
               label2184: {
                  el var25;
                  try {
                     aq.a();
                     var25 = new el("");
                     var14 = var0.c().readShort();
                  } catch (Exception var62) {
                     var10000 = var62;
                     var10001 = false;
                     break label2184;
                  }

                  var11 = 0;

                  for(var277 = 0; var277 < var14; var11 = var283) {
                     byte var3;
                     byte var5;
                     byte var7;
                     try {
                        var24 = new ef();
                        var15 = var0.c().readShort();
                        var16 = var0.c().readShort();
                        var5 = var0.c().readByte();
                        var1 = var0.c().readByte();
                        var3 = var0.c().readByte();
                        var7 = var0.c().readByte();
                     } catch (Exception var61) {
                        var10000 = var61;
                        var10001 = false;
                        break label2184;
                     }

                     if (var7 == 0) {
                        try {
                           var12 = var0.c().readShort();
                        } catch (Exception var60) {
                           var10000 = var60;
                           var10001 = false;
                           break label2184;
                        }

                        var22 = null;
                     } else {
                        try {
                           var17 = var0.c().readShort();
                           var12 = var0.c().readShort();
                           short var18 = var0.c().readShort();
                           var13 = var0.c().readShort();
                           var22 = new af();
                           var22.bU = var17;
                           var22.bW = var12;
                           var22.bV = var18;
                           var22.bX = var13;
                        } catch (Exception var59) {
                           var10000 = var59;
                           var10001 = false;
                           break label2184;
                        }

                        var12 = -1;
                     }

                     byte var4;
                     String var26;
                     String var27;
                     try {
                        var27 = var0.c().readUTF();
                        var26 = var0.c().readUTF();
                        var2 = var0.c().readByte();
                        var4 = var0.c().readByte();
                        var280 = var0.c().readByte();
                     } catch (Exception var58) {
                        var10000 = var58;
                        var10001 = false;
                        break label2184;
                     }

                     var23 = null;
                     if (var280 != 0) {
                        try {
                           var23 = new ee[var280];
                        } catch (Exception var57) {
                           var10000 = var57;
                           var10001 = false;
                           break label2184;
                        }

                        var282 = 0;

                        while(true) {
                           try {
                              if (var282 >= var23.length) {
                                 break;
                              }
                           } catch (Exception var68) {
                              var10000 = var68;
                              var10001 = false;
                              break label2184;
                           }

                           byte var6;
                           ee var28;
                           try {
                              ac.a();
                              var28 = ac.b(var0);
                              var6 = var0.c().readByte();
                           } catch (Exception var56) {
                              var10000 = var56;
                              var10001 = false;
                              break label2184;
                           }

                           if (var28 != null) {
                              var23[var282] = var28;

                              try {
                                 var23[var282].b = var6;
                              } catch (Exception var55) {
                                 var10000 = var55;
                                 var10001 = false;
                                 break label2184;
                              }
                           }

                           ++var282;
                        }
                     }

                     try {
                        var24.e = var15;
                        var24.f = var277 + 1;
                        var24.g = var16;
                        var24.a = var5;
                        var24.d = var7;
                     } catch (Exception var54) {
                        var10000 = var54;
                        var10001 = false;
                        break label2184;
                     }

                     if (var12 != -1) {
                        try {
                           aa var319 = new aa();
                           var24.m = var319;
                           var24.m.C = var12;
                        } catch (Exception var53) {
                           var10000 = var53;
                           var10001 = false;
                           break label2184;
                        }
                     }

                     try {
                        var24.h = var27;
                        var24.i = var26;
                        var24.l = var22;
                        var24.n = var23;
                        var24.a();
                        var24.a(var2);
                        var24.b(var4);
                        var24.a(var1, var3);
                        var25.addElement(var24);
                     } catch (Exception var52) {
                        var10000 = var52;
                        var10001 = false;
                        break label2184;
                     }

                     var283 = var11;
                     if (var2 > 0) {
                        var283 = var11 + 1;
                     }

                     ++var277;
                  }

                  try {
                     aq.a().a(var25, var11, var14);
                     return;
                  } catch (Exception var44) {
                     var10000 = var44;
                     var10001 = false;
                  }
               }
            } else if (var10 == 1) {
               label1272: {
                  try {
                     var278 = var0.c().readShort();
                     var1 = var0.c().readByte();
                     if (ef.a(aq.f, var278) != null) {
                        ef.a(aq.f, var278).b(var1);
                     }
                  } catch (Exception var63) {
                     var10000 = var63;
                     var10001 = false;
                     break label1272;
                  }

                  try {
                     aq.e();
                     return;
                  } catch (Exception var45) {
                     var10000 = var45;
                     var10001 = false;
                  }
               }
            } else if (var10 == 2) {
               label2188: {
                  try {
                     var12 = var0.c().readShort();
                     var1 = var0.c().readByte();
                  } catch (Exception var64) {
                     var10000 = var64;
                     var10001 = false;
                     break label2188;
                  }

                  var277 = 0;
                  var11 = 0;

                  while(true) {
                     try {
                        if (var11 >= aq.f.size()) {
                           aq.a(var277, aq.f.size());
                           if (ef.a(aq.g, var12) != null) {
                              ef.a(aq.g, var12).a(var1);
                           }

                           return;
                        }
                     } catch (Exception var48) {
                        var10000 = var48;
                        var10001 = false;
                        break;
                     }

                     ef var266;
                     try {
                        var266 = (ef)aq.f.elementAt(var11);
                     } catch (Exception var47) {
                        var10000 = var47;
                        var10001 = false;
                        break;
                     }

                     if (var266 != null) {
                        label2190: {
                           try {
                              if (var266.e == var12) {
                                 var266.a(var1);
                              }
                           } catch (Exception var46) {
                              var10000 = var46;
                              var10001 = false;
                              break;
                           }

                           try {
                              if (var266.j <= 0) {
                                 break label2190;
                              }
                           } catch (Exception var49) {
                              var10000 = var49;
                              var10001 = false;
                              break;
                           }

                           ++var277;
                        }
                     }

                     ++var11;
                  }
               }
            } else if (var10 == 3) {
               label1276: {
                  try {
                     var278 = var0.c().readShort();
                     var1 = var0.c().readByte();
                     var2 = var0.c().readByte();
                     if (ef.a(aq.f, var278) != null) {
                        ef.a(aq.f, var278).a(var1, var2);
                     }
                  } catch (Exception var65) {
                     var10000 = var65;
                     var10001 = false;
                     break label1276;
                  }

                  try {
                     if (ef.a(aq.g, var278) != null) {
                        ef.a(aq.g, var278).a(var1, var2);
                     }

                     return;
                  } catch (Exception var50) {
                     var10000 = var50;
                     var10001 = false;
                  }
               }
            } else {
               label2208: {
                  if (var10 != 4) {
                     return;
                  }

                  label1302: {
                     try {
                        var277 = var0.c().readInt();
                        var8 = var0.c().readShort();
                        if (var277 == af.e().J) {
                           var22 = af.e();
                           break label1302;
                        }
                     } catch (Exception var69) {
                        var10000 = var69;
                        var10001 = false;
                        break label2208;
                     }

                     try {
                        var22 = p.b(var277);
                     } catch (Exception var66) {
                        var10000 = var66;
                        var10001 = false;
                        break label2208;
                     }
                  }

                  if (var22 == null) {
                     return;
                  }

                  try {
                     var22.cV = var8;
                     var22.cY = var0.c().readByte();
                     return;
                  } catch (Exception var51) {
                     var10000 = var51;
                     var10001 = false;
                  }
               }
            }
         }

         var267 = var10000;

         try {
            var267.printStackTrace();
         } catch (Exception var42) {
            var10001 = false;
         }
      }

   }

   private static void a(y var0, int var1) {
      Exception var10000;
      label98: {
         cl var7;
         boolean var10001;
         try {
            var7 = aa.a(var0.c().readByte());
         } catch (Exception var18) {
            var10000 = var18;
            var10001 = false;
            break label98;
         }

         if (var7 == null) {
            return;
         }

         if (var1 == 10) {
            try {
               var7.a(var0.c().readShort(), var0.c().readShort());
            } catch (Exception var17) {
               var10000 = var17;
               var10001 = false;
               break label98;
            }
         }

         if (var1 >= 11 && var1 <= 20) {
            byte var4;
            long[] var6;
            af[] var8;
            try {
               var4 = var0.c().readByte();
               var8 = new af[var4];
               var6 = new long[var4];
            } catch (Exception var15) {
               var10000 = var15;
               var10001 = false;
               break label98;
            }

            for(int var3 = 0; var3 < var4; ++var3) {
               int var5;
               try {
                  var5 = var0.c().readInt();
               } catch (Exception var14) {
                  var10000 = var14;
                  var10001 = false;
                  break label98;
               }

               var8[var3] = null;

               label101: {
                  try {
                     if (var5 != af.e().J) {
                        var8[var3] = p.b(var5);
                        break label101;
                     }
                  } catch (Exception var16) {
                     var10000 = var16;
                     var10001 = false;
                     break label98;
                  }

                  try {
                     var8[var3] = af.e();
                  } catch (Exception var13) {
                     var10000 = var13;
                     var10001 = false;
                     break label98;
                  }
               }

               try {
                  var6[var3] = var0.c().readLong();
               } catch (Exception var12) {
                  var10000 = var12;
                  var10001 = false;
                  break label98;
               }
            }

            try {
               byte var2 = var0.c().readByte();
               var7.a(var8, var6, (byte)(var1 - 10), var2);
            } catch (Exception var11) {
               var10000 = var11;
               var10001 = false;
               break label98;
            }
         }

         if (var1 == 21) {
            try {
               var7.a = var0.c().readShort();
               var7.b = var0.c().readShort();
               var7.C();
            } catch (Exception var10) {
               var10000 = var10;
               var10001 = false;
               break label98;
            }
         }

         if (var1 != 23) {
            return;
         }

         try {
            var7.D();
            return;
         } catch (Exception var9) {
            var10000 = var9;
            var10001 = false;
         }
      }

      Exception var19 = var10000;
      var19.printStackTrace();
   }

   private static void b(y var0) {
      byte var4 = 0;
      int var3 = 0;

      IOException var10000;
      label69: {
         byte var5;
         boolean var10001;
         try {
            var5 = var0.c().readByte();
         } catch (IOException var13) {
            var10000 = var13;
            var10001 = false;
            break label69;
         }

         short[] var6;
         if (var5 == 0) {
            label74: {
               byte var15;
               try {
                  var15 = var0.c().readByte();
                  var6 = new short[var15];
               } catch (IOException var9) {
                  var10000 = var9;
                  var10001 = false;
                  break label74;
               }

               for(; var3 < var15; ++var3) {
                  try {
                     var6[var3] = var0.c().readShort();
                  } catch (IOException var8) {
                     var10000 = var8;
                     var10001 = false;
                     break label74;
                  }
               }

               try {
                  byte var1 = var0.c().readByte();
                  var3 = var0.c().readInt();
                  short var2 = var0.c().readShort();
                  ar.a().a(var6, var1, var3, var2);
                  return;
               } catch (IOException var7) {
                  var10000 = var7;
                  var10001 = false;
               }
            }
         } else {
            label76: {
               if (var5 != 1) {
                  return;
               }

               try {
                  var5 = var0.c().readByte();
                  var6 = new short[var5];
               } catch (IOException var12) {
                  var10000 = var12;
                  var10001 = false;
                  break label76;
               }

               for(var3 = var4; var3 < var5; ++var3) {
                  try {
                     var6[var3] = var0.c().readShort();
                  } catch (IOException var11) {
                     var10000 = var11;
                     var10001 = false;
                     break label76;
                  }
               }

               try {
                  ar.a().a(var6);
                  return;
               } catch (IOException var10) {
                  var10000 = var10;
                  var10001 = false;
               }
            }
         }
      }

      IOException var14 = var10000;
      var14.printStackTrace();
   }
}
