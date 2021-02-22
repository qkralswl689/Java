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

 

        System.out.println("A���� ī�� "+cp+" ����Ʈ : " +cp.getPoint());

        System.out.println("B���� ī�� "+cp2+" ����Ʈ : " +cp2.getPoint());

       

        if(cp.getPoint() > cp2.getPoint()){

       

            System.out.println("A���� �¸� !");

       

        } else if (cp.getPoint() < cp2.getPoint()){

       

            System.out.println("B���� �¸� !");

       

        } else {

       

            System.out.println("���º�");

        } // if

       

    } // main

}
