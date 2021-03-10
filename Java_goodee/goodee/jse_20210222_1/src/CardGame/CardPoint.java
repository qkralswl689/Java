package CardGame;

/**

 * 카드 포인트 객체(VO)

 * @author javateam

 *

 */

public class  CardPoint{   

   

    private Card card1;

    private Card card2;

    private int points = 0;

   

    public CardPoint(Card card1,Card card2) {  

        setCards(card1,card2);

    }//

   

    /**

     * 카드 설정

     * @param card1 카드 1

     * @param card2 카드 2

     */

    public void setCards(Card card1, Card card2){

        this.card1 = card1;

        this.card2 = card2;

        cardValue();

    }

   

    /**

     * 카드 숫자 추출

     */

    private int toInt(Card cc){

        int num=0;

        char c=cc.getCard().charAt(1);// ♥8에서 8 추출

       

        switch(c){

            case '1' : num=11;break;

            case '2' : num=2;break;

            case '3' : num=3;break;

            case '4' : num=4;break;

            case '5' : num=5;break;

            case '6' : num=6;break;

            case '7' : num=7;break;

            case '8' : num=8;break;

            case '9' : num=9;break;

            case 'T' : num=10;break;

        }

        return num;

    }

   

    /**

     * 카드의 포인트 값(value) 환산

     */

    private void cardValue(){

        points=0;

        if(toInt(card1) == toInt(card2)){

            points = toInt(card1)*100;

        }else{

            points = ((toInt(card1)+toInt(card2))%10)*10;

        }

    }

   

    public int getPoint(){

        return points;

    }

   

    @Override

    public String toString(){

        return "card1 "+card1+", card2 "+card2;

    }

   

}
