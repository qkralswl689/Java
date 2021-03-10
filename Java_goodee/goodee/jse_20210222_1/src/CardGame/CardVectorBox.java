package CardGame;

import java.util.*;



/**

 * ī�� �ڽ�

 * @author javateam

 *

 */

public class CardVectorBox{

 

    private final static int numOfCards;

   

    static {  

        // final�� �ѹ� �ʱ�ȭ ����

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

     * ī�� �ʱ�ȭ

     */

    private void init(){

        vCard = new Vector<Card>(5,5);

        vCard.clear();

    }

   

    /**

     * ī�� �ڽ��� ī�� ä���

     */

    public void fulling(){

        int count=0;

       

        while(true){

            Card cd=new Card();// ������ ī�带 �����.

            if(!vCard.contains(cd)){// �������� ���ٸ�

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

     * ī�� ����(ȥ��)

     */

    public void shuffles(){

        Collections.shuffle(vCard);

    }

}
