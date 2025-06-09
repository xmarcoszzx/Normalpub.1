import java.util.Hashtable;

public final class t extends Hashtable {
   public t(String var1) {
   }

   public final void clear() {
      synchronized(this){}

      try {
         super.clear();
      } finally {
         ;
      }

   }

   public final Object put(Object var1, Object var2) {
      synchronized(this){}

      try {
         var1 = super.put(var1, var2);
      } finally {
         ;
      }

      return var1;
   }

   public final Object remove(Object var1) {
      synchronized(this){}

      try {
         var1 = super.remove(var1);
      } finally {
         ;
      }

      return var1;
   }
}
