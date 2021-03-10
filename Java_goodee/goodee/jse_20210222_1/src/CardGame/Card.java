package CardGame;



/**

* 카드 객체(VO)

* @author javateam

*

*/

public class Card

{

   public static final String[] deck={"♥","◆","♠","♣"}; // 종류

   public static final String[] stic={"1","2","3","4","5","6","7","8","9","T"};

   private String card;

  

   public Card(){

       init();

   }

  

   public Card(Card card){

       this.card = card.getCard().trim();//공백제거

   }

  

   /**

    * 초기화

    */

   public void init(){

      

       int a = (int)(Math.random()*deck.length); //0~3

       int b = (int)(Math.random()*stic.length); //0~9

       card = deck[a] + stic[b];// ex) ♥8

   }// 카드에 값을 할당

  

   public String getCard(){// 카드값

       return card;

   }



   @Override

   public String toString(){// 훔쳐보기

       return card;//  ex) ♥8

   }

  

   @Override

   public boolean equals(Object obj){

      

       boolean flag = false;

       Card cd=(Card)obj;

       if(card.equals(cd.getCard())){

           flag=true;

       }

       return flag;

   }

  

   @Override

   public int hashCode(){

       return card.hashCode()+137;

   }

}
