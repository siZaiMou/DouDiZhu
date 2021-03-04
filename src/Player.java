import java.util.ArrayList;
import java.util.List;

public class Player
{
    private String name;
    private List<Integer> card;

    Player(String name)
    {
        this.name = name;
        card = new ArrayList<>();
    }
    public String getName()
    {
        return this.name;
    }
    public void getCard(Integer card)
    {
        this.card.add(card);
    }
    public void getCard(List<Integer>card)
    {
        for(Integer car:card)
        this.card.add(car);
    }
    public void showCard()
    {
        System.out.println(this.name+"的手牌为：");
        Card.showCard(this.card);
    }
}
