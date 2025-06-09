import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.CommandListener;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.TextBox;
import main.GameMidlet;

final class m implements CommandListener {
   private cd a;
   private final TextBox b;

   m(cd var1, TextBox var2) {
      this.a = var1;
      this.b = var2;
   }

   public final void commandAction(Command var1, Displayable var2) {
      if (var1.getLabel().equals(aw.br)) {
         this.a.a(this.b.getString());
      }

      dg.a(GameMidlet.f);
      main.a.h.setFullScreenMode(true);
      this.a.h = true;
   }
}
