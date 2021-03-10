package CardGame;

import java.util.*;



/**

 * 카드 박스

 * @author javateam

 *

 */

public class CardVectorBox{

 

    private final static int numOfCards;

   

    static {  

        // final도 한번 초기화 가능

        numOfCards = Card.deck.length * Card.stic.length;//40

    }

   

    private Vector<Card> vCard;

   

    public CardVectorBox() {   

        make();

    }

   

    private void make(){

        init();

        fulling();

    }

   

    /**

     * 카드 초기화

     */

    private void init(){

        vCard = new Vector<Card>(5,5);

        vCard.clear();

    }

   

    /**

     * 카드 박스에 카드 채우기

     */

    public void fulling(){

        int count=0;

       

        while(true){

            Card cd=new Card();// 임의의 카드를 만든다.

            if(!vCard.contains(cd)){// 같은것이 없다면

                vCard.add(cd);

                count++;

            }

            if(count==numOfCards){//40

                break;

            }

        }

    }

   

    public Vector<Card> getAllCards(){

        return vCard;

    }

   

    /**

     * 카드 섞기(혼합)

     */

    public void shuffles(){

        Collections.shuffle(vCard);

    }

}
