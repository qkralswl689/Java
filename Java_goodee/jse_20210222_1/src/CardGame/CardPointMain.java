package CardGame;

import java.util.*;



import CardGame.Card;

import CardGame.CardVectorBox;

import CardGame.CardPoint;

 

public class  CardPointMain{

   

    public static void main(String[] args)

    {

        CardVectorBox box = new CardVectorBox();

        Vector<Card> cards = box.getAllCards();

        CardPoint cp = new CardPoint(cards.get(0),cards.get(2));

        CardPoint cp2 = new CardPoint(cards.get(1),cards.get(3));

 

        System.out.println("A¾¾ÀÇ Ä«µå "+cp+" Æ÷ÀÎÆ® : " +cp.getPoint());

        System.out.println("B¾¾ÀÇ Ä«µå "+cp2+" Æ÷ÀÎÆ® : " +cp2.getPoint());

       

        if(cp.getPoint() > cp2.getPoint()){

       

            System.out.println("A¾¾ÀÇ ½Â¸® !");

       

        } else if (cp.getPoint() < cp2.getPoint()){

       

            System.out.println("B¾¾ÀÇ ½Â¸® !");

       

        } else {

       

            System.out.println("¹«½ÂºÎ");

        } // if

       

    } // main

}
