// stevens javier vera Enriquez
// Topicos de Programacion de 8am - 9am
import java.awt.*;
class Ventana extends Frame{
   MenuBar barra = new MenuBar();
   Menu programa = new Menu("Programa");
   Menu guardar = new Menu("Guardar");
   public Ventana(){
      super("Ventana Menu"); 
      this.setSize(500, 500); 

      setMenuBar(barra);

      barra.add(programa);
      programa.add("Nuevo");
      programa.add("Abrir");

      programa.addSeparator();

      programa.add(guardar);

 
   }
 
   public static void main(String g[]){
      Ventana prog = new Ventana();
      prog.show();
   }
   public boolean handleEvent(Event evt){
      if (evt.id == Event.WINDOW_DESTROY)
         System.exit(0);
         return super.handleEvent(evt);
   }
}

