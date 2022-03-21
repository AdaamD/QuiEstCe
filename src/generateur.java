
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;  

class generateur
{

  private static <E> void assignerQuestion(JComboBox<E> box){
			box.addActionListener(new ActionListener() {     
				//	@Override
					public void actionPerformed(ActionEvent e) {
		
						System.out.println(box.getSelectedItem()) ;
						
						
					} 
				});
		}

    

  public static void main(String args[])
  {


    JFrame frame = new JFrame("Generateur");
    JPanel panel = new JPanel();   
    

    JButton btn = new JButton("Valider");
    JButton btn2 = new JButton("creer");
    JTextField nom = new JTextField("entrez le nom "); nom.setBounds(20,40,200,28);
    JTextField img = new JTextField("entrez le lien de l'image "); img.setBounds(20,40,200,28); img.setVisible(false); 
    
    btn.setBounds(100,100,100,40);
    btn2.setBounds(100,100,100,40);


    btn2.addActionListener(new ActionListener() {     
				//	@Override
					public void actionPerformed(ActionEvent e) {
               
                  panel.setVisible(true);
                  nom.setVisible(false);
                  img.setVisible(true);
                  btn2.setVisible(false);
                  panel.add(btn); 
                  
                 
						
					} 
				});



    

  

   	JComboBox<Nationalite> nationalites = new JComboBox<> (Nationalite.values());
	//assignerQuestion(nationalites);
		JComboBox<Sport> sports= new JComboBox<>(Sport.values());
		//assignerQuestion(sports);
		JComboBox<Age> ages = new JComboBox<>(Age.values());
		//assignerQuestion(ages);
		JComboBox<Genre> genres = new JComboBox<>(Genre.values());
		//assignerQuestion(genres);
		JComboBox<CouleurCheveux> couleurs = new JComboBox<>(CouleurCheveux.values());
		//assignerQuestion(couleurs);
		JComboBox<Pilosite> pilosites = new JComboBox<>(Pilosite.values());
		//assignerQuestion(pilosites);
		JComboBox<Cheveux> cheveux = new JComboBox<>(Cheveux.values());
		//assignerQuestion(cheveux);

                  
btn.addActionListener(new ActionListener() {     
				//	@Override
					public void actionPerformed(ActionEvent e) {
            Sport	var1 =(Sport) sports.getSelectedItem();
            Age var2 =(Age) ages.getSelectedItem(); 
            Nationalite var3= (Nationalite ) nationalites.getSelectedItem();
            CouleurCheveux var4=	(CouleurCheveux) couleurs.getSelectedItem();
            Genre var5=(Genre) genres.getSelectedItem();
            Cheveux var6=(Cheveux) cheveux.getSelectedItem();
            Pilosite var7=(Pilosite) pilosites.getSelectedItem();
                String nomecrit = nom.getText();
                String image = img.getText(); 
                Personnage TEST  = new Personnage (var1, var2, var3 , var4,var5 , var6, var7 , nomecrit , image); 
                  
                 System.out.println (TEST.toStringGen()); 
                  panel.setVisible(true);
                  nom.setVisible(false); 
                 
						
					} 
				});


frame.add(nom);
frame.add(img); 
frame.add(btn2);
panel.add(nationalites);
panel.add(sports);
panel.add(ages);
panel.add(genres);
panel.add(couleurs);
panel.add(pilosites);
panel.add(cheveux);
panel.setVisible(false);


frame.add(panel);



frame.pack();
	frame.setSize(1000, 1000);
  	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 
		frame.getContentPane().setBackground(Color.lightGray);
		frame.getRootPane().setBorder(BorderFactory.createMatteBorder(10, 10, 10, 10, Color.WHITE));
		frame.setVisible(true);
   

 
  }
}
