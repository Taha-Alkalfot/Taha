package hotelProject;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;

public
class GUI {
    Management_Of_Reservations3 c;
    Reservations3 d;
    private JPanel Hotel;
    private JButton aboutRoomsButton;
    private JButton aboutReservationsButton;
    private JButton addReservationsButton;
    private JButton cancelReservationsButton;
    private JPanel allCards;
    private JPanel Scren1;
    private JPanel Scren2;
    private JPanel Scren3;
    private JPanel Scren4;
    private JTextField floornumber1;
    private JTextField RoomNumber2;
    private JTextField Name3;
    private JTextField Phone4;
    private JTextField CardNumber5;
    private JTextField price6;
    private JButton addReservationsButton1;
    private JTextField people7;

    public
    GUI () throws FileNotFoundException {
        c= new Management_Of_Reservations3 ();

        aboutRoomsButton.addActionListener ( new ActionListener () {
            @Override
            public void actionPerformed ( ActionEvent e ) {

                allCards.removeAll ();
                allCards.add ( Scren1 );
                allCards.repaint ();
                allCards.revalidate ();
            }
        } );
        aboutReservationsButton.addActionListener ( new ActionListener () {
            @Override
            public
            void actionPerformed ( ActionEvent e ) {

                allCards.removeAll ();
                allCards.add ( Scren2 );
                allCards.repaint ();
                allCards.revalidate ();

            }
        } );
        addReservationsButton.addActionListener ( new ActionListener () {
            @Override
            public
            void actionPerformed ( ActionEvent e ) {

                allCards.removeAll ();
                allCards.add ( Scren3 );
                allCards.repaint ();
                allCards.revalidate ();
            }
        } );
        cancelReservationsButton.addActionListener ( new ActionListener () {
            @Override
            public
            void actionPerformed ( ActionEvent e ) {

                allCards.removeAll ();
                allCards.add ( Scren4 );
                allCards.repaint ();
                allCards.revalidate ();
            }
        } );


        addReservationsButton1.addActionListener ( new ActionListener () {
            @Override
            public void actionPerformed ( ActionEvent e ) {

               int fl=Integer.parseInt ( floornumber1.getText () );

               int ro=Integer.parseInt ( RoomNumber2.getText () );

               String Name =Name3.getText ();

                int ph = Integer.parseInt ( Phone4.getText () );

                int Ca=Integer.parseInt ( CardNumber5.getText () );

                int Pr=Integer.parseInt ( price6.getText () );

                int Pep=Integer.parseInt ( people7.getText () );

               //added  = c.addReservations ();

             // if ( )JOptionPane.showMessageDialog ( null,"Added the Reservations  successfully" );
            //  else
                  JOptionPane.showMessageDialog ( null,"no Added " );




            }
        } );
    }

    public static void main ( String[] args ) throws FileNotFoundException {
        JFrame frame = new JFrame ( "GUI" );

        frame.setContentPane ( new GUI ().Hotel );

        frame.setDefaultCloseOperation ( JFrame.EXIT_ON_CLOSE );

        //frame.pack ();

        frame.setSize ( 700,500 );
        frame.setVisible ( true );
    }
}
