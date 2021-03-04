import java.util.*;

public class Card
{
    private static String[] colors={"♥","♠","♦","♣"};
    private static String[] numbers={"2","A","K","Q","J","10","9","8","7","6","5","4","3"};
    public static Map<Integer,String>allCard = new HashMap<>();
    public static List<Integer> getallCard()
    {
        List<Integer>cardIndex = new ArrayList<>();
        int index=0;
        allCard.put(index,"大王");
        cardIndex.add(index);
        index++;
        allCard.put(index,"小王");
        cardIndex.add(index);
        index++;
        for(String number:numbers)
        {
            for(String color:colors)
            {
                allCard.put(index,color+number);
                cardIndex.add(index);
                index++;
            }
        }
        return cardIndex;
    }
    public static void showCard(List<Integer>card)
    {
        Collections.sort(card);
        for(Integer index:card)
        {
            System.out.print(allCard.get(index)+" ");
        }
        System.out.println();
    }
}
