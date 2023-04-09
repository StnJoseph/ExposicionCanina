package gui;
import java.awt.*;
import javax.swing.*;

public class Ventana extends JFrame {

    public Ventana() {
      //Dimensiones Frame
        setTitle("Exposición Canina");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(670, 500);
        setLocationRelativeTo(null);
        setLayout(new GridBagLayout());
        GridBagConstraints def = new GridBagConstraints();

      //Paneles
        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();
        JPanel panel3 = new JPanel();
        JPanel panel4 = new JPanel();
        JPanel panel5 = new JPanel();
        JPanel panel6 = new JPanel();

      //-----------------PANEL 1-----------------//
        panel1.setBorder(BorderFactory.createTitledBorder("Perros en la exposición"));
        panel1.setLayout(new BorderLayout());
        panel1.setPreferredSize(new Dimension(210, 280));
        
      //Lista para mostrar
        String[] nombresPerros = {"Puppy(Gran Danés)","Taylor(Beagle)","Cobrador(Akita)","Brutal y Mamut(Doberman)","Maximus(Mastin Español)","Tony(Bull Terrier)","Nieve(Gigante de los Pirineos)","Titán(Pug)","Leviatan(Chiuahua)","Puppy(Gran Danés)","Tarzán(Gosque)","Fido(Mastin Napolitano)"};
        JList<String> listaNombres = new JList<>(nombresPerros);
        JScrollPane scrollPane = new JScrollPane(listaNombres);
        panel1.add(scrollPane, BorderLayout.CENTER);

        
      //-----------------PANEL 2-----------------//
        panel2.setBorder(BorderFactory.createTitledBorder("Datos Perro"));
        panel2.setPreferredSize(new Dimension(250, 280));
        //panel2.setLayout(new BoxLayout(panel2, BoxLayout.Y_AXIS));
        //panel2.setLayout(new FlowLayout());    

    
      //Etiquetas y texto NOMBRE
        JLabel lbNombre = new JLabel("Nombre:"); 
        JTextField textNombre = new JTextField();
        
      //Etiquetas y texto RAZA
        JLabel lbRaza = new JLabel("Raza:"); 
        JTextField textRaza = new JTextField();
        
      //Etiquetas y texto EDAD
        JLabel lbEdad = new JLabel("Edad:"); 
        JTextField textEdad = new JTextField();
        
      //Etiquetas y texto PUNTOS
        JLabel lbPuntos = new JLabel("Puntos:"); 
        JTextField textPuntos = new JTextField();
   
        lbNombre.setPreferredSize(new Dimension(50, 25));
        textNombre.setPreferredSize(new Dimension(60, 25));
        lbRaza.setPreferredSize(new Dimension(50, 25));      
        textRaza.setPreferredSize(new Dimension(60, 25));
        lbEdad.setPreferredSize(new Dimension(45, 25));
        textEdad.setPreferredSize(new Dimension(65, 25));       
        lbPuntos.setPreferredSize(new Dimension(50, 25));
        textPuntos.setPreferredSize(new Dimension(60, 25));
      
      //FOTO perro panzon
        JLabel foto = new JLabel(new ImageIcon("bin\\Data\\panzon2.jpg"));
        
        panel2.add(foto);              
        panel2.add(lbNombre);
        panel2.add(textNombre);
        panel2.add(lbRaza);
        panel2.add(textRaza);
        panel2.add(lbEdad);
        panel2.add(textEdad);
        panel2.add(lbPuntos);
        panel2.add(textPuntos);
        
       		
      //-----------------PANEL 3-----------------//
        panel3.setBorder(BorderFactory.createTitledBorder("Búsqueda y ordenamientos"));
        panel3.setPreferredSize(new Dimension(175, 280));
        //panel3.setLayout(new FlowLayout());        

      //Botones        
        JButton botonOrdenarPorRaza = new JButton("Ordenar por Raza");        
        JButton botonOrdenarPorPuntos = new JButton("Ordenar por Puntos");       
        JButton botonOrdenarPorEdad = new JButton("Ordenar por Edad");        
        JButton botonBuscarPerro = new JButton("Buscar Perro");      
         
        botonOrdenarPorRaza.setPreferredSize(new Dimension(170, 25));
        botonOrdenarPorPuntos.setPreferredSize(new Dimension(170, 25));
        botonOrdenarPorEdad.setPreferredSize(new Dimension(170, 25));
        botonBuscarPerro.setPreferredSize(new Dimension(170, 25));
        
        panel3.add(botonOrdenarPorRaza);
        panel3.add(botonOrdenarPorPuntos);
        panel3.add(botonOrdenarPorEdad);
        panel3.add(botonBuscarPerro);              
        
        
      //-----------------PANEL 4-----------------// 
        panel4.setBorder(BorderFactory.createTitledBorder("Agregar Perro"));
        //panel4.setLayout(new GridLayout(3, 4));
        //panel4.setLayout(new GridLayout(3, 4, 0, 5));
        //panel4.setLayout(new GridBagConstraints());
        panel4.setPreferredSize(new Dimension(470, 120));
        //panel4.setLayout(new FlowLayout());
        //panel4.setLayout(new FlowLayout(FlowLayout.LEADING, 20, 10));


      //Etiquetas y texto NOMBRE
        JLabel lbNombreNuevo = new JLabel("Nombre:", SwingConstants.CENTER);
        JTextField textNombreNuevo = new JTextField();
      
      //Etiquetas y texto EDAD  
        JLabel lbEdadNueva = new JLabel("Edad:", SwingConstants.CENTER);
        JTextField textEdadNueva = new JTextField();
      
      //Etiquetas y texto RAZA
        JLabel lbRazaNueva = new JLabel("Raza:", SwingConstants.CENTER);
        JTextField textRazaNueva = new JTextField();
        
      //Etiquetas y texto PUNTOS
        JLabel lbPuntosNuevos = new JLabel("Puntos:", SwingConstants.CENTER);
        JTextField textPuntosNuevos = new JTextField();
        
      //Etiquetas y texto Imagen
        JLabel lbImagen = new JLabel("Imagen:", SwingConstants.CENTER);
        JTextField textImagen = new JTextField();
        
      //Botones
        JButton botonExaminar = new JButton("Examinar");
        JButton botonAgregarPerro = new JButton("Agregar Perro");

        lbNombreNuevo.setPreferredSize(new Dimension(50, 25));        
        textNombreNuevo.setPreferredSize(new Dimension(165, 25));
        lbRazaNueva.setPreferredSize(new Dimension(50, 25));
        textRazaNueva.setPreferredSize(new Dimension(165, 25));
        lbEdadNueva.setPreferredSize(new Dimension(50, 25));
        textEdadNueva.setPreferredSize(new Dimension(165, 25));
        lbPuntosNuevos.setPreferredSize(new Dimension(50, 25));
        textPuntosNuevos.setPreferredSize(new Dimension(165, 25));
        lbImagen.setPreferredSize(new Dimension(45, 25));
        textImagen.setPreferredSize(new Dimension(160, 25));


        panel4.add(lbNombreNuevo);
        panel4.add(textNombreNuevo);
        panel4.add(lbRazaNueva);
        panel4.add(textRazaNueva);
        panel4.add(lbEdadNueva);
        panel4.add(textEdadNueva);
        panel4.add(lbPuntosNuevos);
        panel4.add(textPuntosNuevos);
        panel4.add(lbImagen);
        panel4.add(textImagen);
        panel4.add(botonExaminar);
        panel4.add(botonAgregarPerro);

        
      //-----------------PANEL 5-----------------//  
        panel5.setBorder(BorderFactory.createTitledBorder("Consultas Exposición"));
        panel5.setPreferredSize(new Dimension(180, 120));
        panel5.setLayout(new FlowLayout());
                	
      //Botones
        JButton botonGanador = new JButton("Ganador");        
        JButton botonMenorPuntaje = new JButton("Menor Puntaje");
        JButton botonMasViejo = new JButton("Más Viejo");  
        
        botonGanador.setPreferredSize(new Dimension(170, 25));
        botonMenorPuntaje.setPreferredSize(new Dimension(170, 25));
        botonMasViejo.setPreferredSize(new Dimension(170, 25));

        panel5.add(botonGanador);
        panel5.add(botonMenorPuntaje);
        panel5.add(botonMasViejo);
                  

      //-----------------PANEL 6-----------------//
        panel6.setBorder(BorderFactory.createTitledBorder("Puntos de Extensión"));
        panel6.setPreferredSize(new Dimension(650, 60));
        //panel6.setLayout(new FlowLayout());
        
      //Botones
        JButton botonOpcion1 = new JButton("Opción 1");
        JButton botonOpcion12 = new JButton("Opción 2");        
        panel6.add(botonOpcion1);
        panel6.add(botonOpcion12);
        
      //Añadir los paneles al frame
        def.gridx = 0;
        def.gridy = 0;     
        add(panel1, def);
        
        def.gridx = 1;
        def.gridy = 0;
        add(panel2, def);
        
        def.gridx = 2;
        def.gridy = 0;        
        add(panel3,def);
        
        def.gridx = 0;
        def.gridy = 1;
        def.gridheight = 3;
        def.gridwidth = 2;
        add(panel4,def);
        
        def.gridx = 2;
        def.gridy = 1;
        def.gridheight = 2;     
        add(panel5,def);
        
        def.gridx = 0;
        def.gridy = 3;
        def.gridwidth = 3;
        add(panel6,def);
        
        setVisible(true);
        
    }
    
    public static void main(String[] args) 
    {
        new Ventana();
    }

}

