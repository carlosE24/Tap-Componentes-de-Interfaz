import javax.swing.JFrame;
public class ventanaJframe{
public ventanaJframe (String titulo){
JFrame ventana = new JFrame(titulo);
ventana.setVisible(true);
ventana.setSize(500,500);
ventana.setLocationRelativeTo(null);
ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
ventana.setResizable(false);
}
public static void main (String []args){
ventanaJframe v = new ventanaJframe("Interfaz");
}
}