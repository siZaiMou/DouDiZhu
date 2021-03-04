import java.util.*;

public class Demo
{
    public static void main(String[] args)
    {
        List<Integer>allCard = Card.getallCard();
        List<Integer>lastCard = new ArrayList<>();
        Player[] players = new Player[3];
        Card.showCard(allCard);
        for (int i = 0; i < 3; i++)
        {
            players[i] = new Player("玩家"+(i+1));
        }
        Collections.shuffle(allCard);
        for (int i = 0; i < allCard.size(); i++)
        {
            if(i>=51)
                lastCard.add(allCard.get(i));
            else if(i%3==0)
                players[0].getCard(allCard.get(i));
            else if(i%3==1)
                players[1].getCard(allCard.get(i));
            else if(i%3==2)
                players[2].getCard(allCard.get(i));
        }
        int luckyOne=new Random().nextInt(3);
        System.out.println(players[luckyOne].getName()+"成为地主");
        System.out.println("公布地主牌");
        Card.showCard(lastCard);
        players[luckyOne].getCard(lastCard);
        for (int i = 0; i < 3; i++)
        {
            players[i].showCard();
        }
    }
}
