
import java.lang.*; 
import java.awt.*; 
import java.awt.event.*; 
import javax.swing.*; 

class EjemploJToolbar { 

public static void main(String[] args){  
JFrame ventana = new JFrame(); 
ventana.setTitle("Ejemplo de JToolBar"); 
ventana.setDefaultCloseOperation(ventana.EXIT_ON_CLOSE); 
ventana.setBounds(200,250,200,70); 
JToolBar barra = new JToolBar("barra"); 
JButton copiar = new JButton("Copiar"); 
JButton cortar = new JButton("Cortar"); 
JButton pegar = new JButton("Pegar"); 
barra.add(copiar); 
barra.add(cortar); 
barra.add(pegar); 
ventana.getContentPane().add(barra); 
ventana.setVisible(true); 
ventana.setResizable(false); 

} 
}
