import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

import java.util.Random;

public class CardTable extends Canvas {

    private Image[][] images;
    private int cardWidth, cardHeight;

    /**
     * Creates a CardTable.
     * cardset is the name of the folder that contains the card images.
     */
    public CardTable(String cardset) {
        setBackground(new Color(0x088A4B));

        // create a 2-D array of card images
        images = new Image[14][4];
        String suits = "cdhs";

        for (int suit = 0; suit <= 3; suit++) {
            char c = suits.charAt(suit);

            for (int rank = 1; rank <= 13; rank++) {
                String s = String.format("%s/%02d%c.gif",
                                         cardset, rank, c);
                images[rank][suit] = new ImageIcon(s).getImage();
            }
        }

        // get the width and height of the cards and set the size of
        // the frame accordingly
        cardWidth = images[1][1].getWidth(null);
        cardHeight = images[1][1].getHeight(null);

        // set the size temporarily to get the insets
        setTableSize(14, 4);
    }

    /**
     * Sets the table size.
     * x and y are in units of card width/height.
     */
    public void setTableSize(double x, double y) {
        setSize((int) (x * cardWidth),
                (int) (y * cardHeight));
    }

    /**
     * Draws a card at the given coordinates.
     * x and y are in units of card width/height.
     */
    public void drawCard(Graphics g, int rank, int suit, double x, double y) {
        Image image = images[rank][suit];
        g.drawImage(image,
                    (int) (x * cardWidth),
                    (int) (y * cardHeight),
                    null);
    }
    
    public void drawDeck(Graphics g, Deck d, double x,double y) {
    	Card[] cards=d.getCards();
    	for(int i=0;i<cards.length;i++) {
    		drawCard(g,cards[i].getRank(),cards[i].getSuit(),x+i/5.0,y);
    	}
    }

    /**
     * Special method invoked when the Frame needs to be drawn.
     */
    public void paint(Graphics g) {
    	Deck d=new Deck("Deck");
    	drawDeck(g,d,0.1,0.1);
    	d.shuffle();
    	drawDeck(g,d,0.1,0.3);
    	//d.selectionSort();
    	drawDeck(g,d,0.1,0.5);
    	d.shuffle();
    	drawDeck(g,d,0.1,0.7);
    	//d=d.mergeSort();
    	drawDeck(g,d,0.1,0.9);
    	d.shuffle();
    	drawDeck(g,d,0.1,1.1);
    	//d.insertionSort();
    	drawDeck(g,d,0.1,1.3);
    }

    public static void main(String[] args) {
        // make the frame
        JFrame frame = new JFrame("Card Table");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // add the CardTable
        String cardset = "cardset-oxymoron";
        Canvas canvas = new CardTable(cardset);
        frame.getContentPane().add(canvas);

        // show the frame
        frame.pack();
        frame.setVisible(true);
    }

}
