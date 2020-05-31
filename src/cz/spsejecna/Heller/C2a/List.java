package cz.spsejecna.Heller.C2a;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class List extends JFrame implements ActionListener{
	//LABELS
	   JLabel label = new JLabel ();  
	   JLabel label2 = new JLabel ();  
	   JLabel label3 = new JLabel ();
	   JLabel label4 = new JLabel ();
	   JLabel label5 = new JLabel ();
	//CHECKBOXES
	    JCheckBox shoes1,shoes2,shoes3,shoes4,shoes5,shoes6,shoes7,shoes8,shoes9,shoes10 = new JCheckBox ();  
	    JCheckBox hoodie1,hoodie2,hoodie3, hoodie4 , hoodie5, hoodie6, hoodie7, hoodie8, hoodie9, hoodie10 = new JCheckBox();
	    JCheckBox car1, car2,car3,car4,car5,car6,car7,car8,car9,car10 = new JCheckBox();
	   JButton b = new JButton();  
	//FONTS
	   Font fontLabel1 = new Font("Historia Demo", Font.BOLD, 20);
	   Font fontLabel2 = new Font("Hemi Head", Font.BOLD, 15);
	   Font fontlabel3 = new Font("Hemi Head", Font.BOLD, 10);
	    List(){ 
    //HEADINGS
	        label=new JLabel("Ordering System");
	        label.setBounds(10,0,300,40);  
	        label.setFont(fontLabel1);
	        
	        label2 = new JLabel ("Move the cursor on the specific item and you will see the details");
	        label2.setBounds(10,25,500,30);  
	        label2.setFont(fontLabel2);
	        
	        label3 = new JLabel ("Shoes");
	        label3.setBounds(10,55, 100, 30);
	        
	        label4 = new JLabel ("Hoodies");
	        label4.setBounds(210,55, 100, 30);
	        
	        label5 = new JLabel ("Cars");
	        label5.setBounds(410,55,100,30);
//FRAME SETTINGS + button + scitani
	        setSize(1000,600);  
	        setLayout(null);  
	        setVisible(true);  
	        setDefaultCloseOperation(EXIT_ON_CLOSE);  
//order
	        
	        b=new JButton("Order");  
	        b.setBounds(100,350,200,50);  
	       b.addActionListener(this);
 add(b); 
 

	        //ITEMS
//shoes
	        shoes1=new JCheckBox("Yeezy 350");  
	        shoes1.setBounds(10,90,200,20); 
	        
	        shoes2=new JCheckBox("Balenciaga speed trainers");  
	        shoes2.setBounds(10,110,200,20);  
	        
	        shoes3=new JCheckBox("Balenciaga tripple S");  
	        shoes3.setBounds(10,130,200,20);  
	        
	        shoes4=new JCheckBox("Dior B23 high");
	        shoes4.setBounds(10,150,200,20);
	        
	        shoes5=new JCheckBox("Dior B23 low");
	        shoes5.setBounds(10,170,200,20);
	        
	        shoes6=new JCheckBox("AJ1 off white chicago");
	        shoes6.setBounds(10,190,200,20);
	        
	        shoes7=new JCheckBox("Fear of God converse");
	        shoes7.setBounds(10,210,200,20);
	        
	        shoes8=new JCheckBox("Revenge XS Storm ");
	        shoes8.setBounds(10,230,200,20);
	        
	        shoes9=new JCheckBox("Alexander MC Queen");
	        shoes9.setBounds(10,250,200,20);
	        
	        shoes10=new JCheckBox("Travis Scott AJ1");
	        shoes10.setBounds(10,270,200,20);
	        
//hoodies
	        hoodie1=new JCheckBox("ASSC");
	        hoodie1.setBounds(210,90,200,20);
	        
	        hoodie2=new JCheckBox("Champion");
	        hoodie2.setBounds(210,110,200,20);
	        
	        hoodie3=new JCheckBox("Supreme");
	        hoodie3.setBounds(210,130,200,20);
	        
	        hoodie4=new JCheckBox("Louis Vuitton");
	        hoodie4.setBounds(210,150,200,20);
	        
	        hoodie5=new JCheckBox("Dior");
	        hoodie5.setBounds(210,170,200,20);
	        
	        hoodie6=new JCheckBox("Off white");
	        hoodie6.setBounds(210,190,200,20);
	       
	        hoodie7=new JCheckBox("Nike");
	        hoodie7.setBounds(210,210,200,20);
	        
	        hoodie8=new JCheckBox("Adidas");
	        hoodie8.setBounds(210,230,200,20);
	        
	        hoodie9=new JCheckBox("Gucci");
	        hoodie9.setBounds(210,250,200,20);
	        
	        hoodie10=new JCheckBox("Travis Scott");
	        hoodie10.setBounds(210,270,200,20);
	        
	        
//cars
	        car1=new JCheckBox("Bugatti Veyron");
	        car1.setBounds(410,90,200,20);
	        
	        car2=new JCheckBox("Toyota Supra");
	        car2.setBounds(410,110,200,20);
	       
	        car3=new JCheckBox("Ferrari 458");
	        car3.setBounds(410,130,200,20);
	        
	        car4=new JCheckBox("Laborghini huracan");
	        car4.setBounds(410,150,200,20);
	        
	        car5=new JCheckBox("BMW M4 Coupé");
	        car5.setBounds(410,170,200,20);
	        
	        car6=new JCheckBox("Mercedes AMG C63");
	        car6.setBounds(410,190,200,20);
	        
	        car7=new JCheckBox("Porsche 911");
	        car7.setBounds(410,210,200,20);
	        
	        car8=new JCheckBox("BMW I8");
	        car8.setBounds(410,230,200,20);
	        
	        car9=new JCheckBox("Ford Mustang GT 5.0");
	        car9.setBounds(410,250,200,20);
	        
	        car10=new JCheckBox("Maserati GrandTurismo");
	        car10.setBounds(410,270,200,20);
	        
	        
	        
	        //ADD LIST
// headlings
	        add(label); add(label2); add(label3); add(label4); add(label5);
//shoes
	        add(shoes1);add(shoes2);add(shoes3);add(shoes4);add(shoes5);add(shoes6);add(shoes7);add(shoes8);add(shoes9);add(shoes10);
//hoodies
	        add(hoodie1);add(hoodie2);add(hoodie3);add(hoodie4);add(hoodie5);add(hoodie6);add(hoodie7);add(hoodie8);add(hoodie9);add(hoodie10);
//cars
	        add(car1);add(car2);add(car3);add(car4);add(car5);add(car6);add(car7);add(car8);add(car9);add(car10);
	   

//TOOLTIPS
//shoes	    
	    shoes1.setToolTipText("| Price: 265 € | " + "Condition : BRAND NEW | "+ "Size : US 10 |");
	    shoes2.setToolTipText("| Price: 554 € |" + "Condition : BRAND NEW | "+ "Size : US 9 |");
	    shoes3.setToolTipText("| Price: 600 € |" + "Condition : BRAND NEW |"+ "Size : US 8 |");
	    shoes4.setToolTipText("| Price: 800 € |" + "Condition : BRAND NEW |"+ "Size : US 9.5 |");
	    shoes5.setToolTipText("| Price: 750 € |" + "Condition : BRAND NEW |"+ "Size : US 11 |");
	    shoes6.setToolTipText("| Price: 1200 € |" + "Condition : BRAND NEW |"+ "Size : US 12 |");
	    shoes7.setToolTipText("| Price: 150 € |" + "Condition : BRAND NEW |"+ "Size : US 8.5 |");
	    shoes8.setToolTipText("| Price: 250 € |" + "Condition : BRAND NEW |"+ "Size : US 6 |");
	    shoes9.setToolTipText("| Price: 500 € |" + "Condition : BRAND NEW |"+ "Size : US 9 |");
	    shoes10.setToolTipText("| Price: 700 € |" + "Condition : BRAND NEW |"+ "Size : US 10 |");
//hoodies	    
	    hoodie1.setToolTipText("| Price: 120 € |" + "Condition : BRAND NEW |"+ "Size : L |");
	    hoodie2.setToolTipText("| Price: 25 € |" + "Condition : BRAND NEW |"+ "Size : XL |");
	    hoodie3.setToolTipText("| Price: 250 € |" + "Condition : BRAND NEW |"+ "Size : XXL |");
	    hoodie4.setToolTipText("| Price: 1200 € |" + "Condition : BRAND NEW |"+ "Size : M |");
	    hoodie5.setToolTipText("| Price: 1500 € |" + "Condition : BRAND NEW |"+ "Size : S |");
	    hoodie6.setToolTipText("| Price: 500 € |" + "Condition : BRAND NEW |"+ "Size : XS |");
	    hoodie7.setToolTipText("| Price: 25 € |" + "Condition : BRAND NEW |"+ "Size : XXL |");
	    hoodie8.setToolTipText("| Price: 25 € |" + "Condition : BRAND NEW |"+ "Size : M |");
	    hoodie9.setToolTipText("| Price: 1300 € |" + "Condition : BRAND NEW |"+ "Size : L |");
	    hoodie10.setToolTipText("| Price: 400 € |" + "Condition : BRAND NEW |"+ "Size : S |");
//cars
	    car1.setToolTipText("| Price: 2 250 880 € |" + "Mileage : BRAND NEW |");   
	    car2.setToolTipText("| Price: 49 990 € |" + "Mileage : BRAND NEW |"); 
	    car3.setToolTipText("| Price: 263 553 € |" + "Mileage : BRAND NEW |"); 
	    car4.setToolTipText("| Price: 264 969 € |" + "Mileage : BRAND NEW |"); 
	    car5.setToolTipText("| Price: 66 200 € |" + "Mileage : BRAND NEW |"); 
	    car6.setToolTipText("| Price: 69 095 € |" + "Mileage : BRAND NEW |"); 
	    car7.setToolTipText("| Price: 91 100 € |" + "Mileage : BRAND NEW |"); 
	    car8.setToolTipText("| Price: 147 500 € |" + "Mileage : BRAND NEW |"); 
	    car9.setToolTipText("| Price:  35 740 € |" + "Mileage : BRAND NEW |"); 
	    car10.setToolTipText("| Price: 120 € |" + "Mileage : BRAND NEW |"); 
	   
	    } 
	       
	    
//TERMS FOR COUNT
	    public void actionPerformed(ActionEvent e){  
	        
	    	int amount=0;  
	        String msg="";  
//shoes ifs       
	        if(shoes1.isSelected()){  
	            amount+=265;  
	            msg="Yeezy: 265\n";  
	        }  
	        if(shoes2.isSelected()){  
	            amount+=554;  
	            msg+="Speed trainers: 554\n";  
	        }  
	        if(shoes3.isSelected()){  
	            amount+=600;  
	            msg+="Tripple S: 600\n";  
	        }  
	        if(shoes4.isSelected()){  
	            amount+=800;  
	            msg+="Tea: 800\n";  
	        }  
	        if(shoes5.isSelected()){  
	            amount+=750;  
	            msg+="B23 high: 750\n";  
	        }  
	        if(shoes6.isSelected()){  
	            amount+=1200;  
	            msg+="B23 low: 1200\n";  
	        }  
	        if(shoes7.isSelected()){  
	            amount+=150;  
	            msg+="AJ1 off white chicagos: 150\n";  
	        }  
	        if(shoes8.isSelected()){  
	            amount+=250;  
	            msg+="Revenge X Storm: 250\n";  
	        }  
	        if(shoes9.isSelected()){  
	            amount+=500;  
	            msg+="MC queens: 500\n";  
	        }  
	        if(shoes10.isSelected()){  
	            amount+=700;  
	            msg+="AJ1 Travis Scott: 700\n";  
	        } 
// hoodie ifs
	        if(hoodie1.isSelected()){  
	            amount+=120;  
	            msg+="ASSC: 120\n";  
	        } 
	        if(hoodie2.isSelected()){  
	            amount+=25;  
	            msg+="Champion: 25\n";  
	        } 
	        if(hoodie3.isSelected()){  
	            amount+=250;  
	            msg+="Supreme: 250\n";  
	        } 
	        if(hoodie4.isSelected()){  
	            amount+=1200;  
	            msg+="Louis Vuitton: 1200\n";  
	        } 
	        if(hoodie5.isSelected()){  
	            amount+=1500;  
	            msg+="Dior: 1500\n";  
	        } 
	        if(hoodie6.isSelected()){  
	            amount+=500;  
	            msg+="Off white: 500\n";  
	        } 
	        if(hoodie7.isSelected()){  
	            amount+=25;  
	            msg+="Nike: 25\n";  
	        } 
	        if(hoodie8.isSelected()){  
	            amount+=25;  
	            msg+="Adidas: 25\n";  
	        } 
	        if(hoodie9.isSelected()){  
	            amount+=1300;  
	            msg+="Gucci: 1300\n";  
	        } 
	        if(hoodie10.isSelected()){  
	            amount+=400;  
	            msg+="Travis Scott: 400\n";  
	        } 
 //car ifs
	        if(car1.isSelected()){  
	            amount+=2250880;  
	            msg+="Bugatti: 2250880\n";  
	        } 
	        if(car2.isSelected()){  
	            amount+=49990;  
	            msg+="Supra: 49990\n";  
	        } 
	        if(car3.isSelected()){  
	            amount+=263553;  
	            msg+="Ferrari : 263553\n";  
	        } 
	        if(car4.isSelected()){  
	            amount+=264969;  
	            msg+="Huracan: 264969\n";  
	        } 
	        if(car5.isSelected()){  
	            amount+=66200;  
	            msg+="M4 BMW: 66200\n";  
	        } 
	        if(car6.isSelected()){  
	            amount+=69095;  
	            msg+="AMG C63: 69095\n";  
	        } 
	        if(car7.isSelected()){  
	            amount+=91100;  
	            msg+="Porsche: 91100\n";  
	        } 
	        if(car8.isSelected()){  
	            amount+=147.500;  
	            msg+="BMW I8: 147500\n";  
	        } 
	        if(car9.isSelected()){  
	            amount+= 35740;  
	            msg+="Mustang:  35740\n";  
	        } 
	        if(car10.isSelected()){  
	            amount+=132825;  
	            msg+="Maserati: 132825\n";  
	        } 
	        
	        msg+="-----------------\n";  
	        JOptionPane.showMessageDialog(this,msg +"Total: "+amount + "€");  
	
	    
	    } 
	 
}
