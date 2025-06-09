import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import javax.microedition.io.Connector;
import javax.microedition.io.SocketConnection;

public final class ay {
   SocketConnection a;

   public ay(String var1, int var2) {
      try {
         StringBuffer var3 = new StringBuffer("socket://");
         this.a = (SocketConnection)Connector.open(var3.append(var1).append(":").append(var2).toString());
      } catch (IOException var4) {
         var4.printStackTrace();
      }

   }

   public final void a() {
      try {
         this.a.close();
      } catch (IOException var2) {
         var2.printStackTrace();
      }

   }

   public final DataOutputStream b() {
      DataOutputStream var1;
      try {
         var1 = this.a.openDataOutputStream();
      } catch (IOException var2) {
         var2.printStackTrace();
         var1 = null;
      }

      return var1;
   }

   public final DataInputStream c() {
      DataInputStream var1;
      try {
         var1 = this.a.openDataInputStream();
      } catch (IOException var2) {
         var2.printStackTrace();
         var1 = null;
      }

      return var1;
   }
}
