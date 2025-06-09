import java.io.PrintStream;
import java.util.Vector;

public class el extends Vector {
   private String a;

   private el() {
   }

   public el(String var1) {
      this.a = var1;
   }

   public void addElement(Object var1) {
      synchronized(this){}

      try {
         if (this.size() > 1000) {
            PrintStream var2 = System.out;
            StringBuffer var3 = new StringBuffer("||||||||||||||||||||||||||||||||||||||||||||");
            var2.println(var3.append(this.a).append(" num= ").append(this.size()).toString());
         }

         super.addElement(var1);
      } finally {
         ;
      }

   }

   public void insertElementAt(Object var1, int var2) {
      synchronized(this){}

      try {
         if (this.size() > 1000) {
            PrintStream var3 = System.out;
            StringBuffer var4 = new StringBuffer("||||||||||||||||||||||||||||||||||||||||||||");
            var3.println(var4.append(this.a).append(" num= ").append(this.size()).toString());
         }

         super.insertElementAt(var1, var2);
      } finally {
         ;
      }

   }

   public void removeAllElements() {
      synchronized(this){}

      try {
         super.removeAllElements();
      } finally {
         ;
      }

   }

   public boolean removeElement(Object var1) {
      synchronized(this){}

      boolean var2;
      try {
         var2 = super.removeElement(var1);
      } finally {
         ;
      }

      return var2;
   }

   public void removeElementAt(int var1) {
      synchronized(this){}

      try {
         super.removeElementAt(var1);
      } finally {
         ;
      }

   }
}
