public class gameBord {
    private player p1;

    public String rules (player p1, player p2){
        card p1card = p1.getCard();
        card p2card = p2.getCard();
        int p1Points = 0;
        int p2Points = 0;
        String win = null;

        if(p1card.getHp() > p2card.getHp()){
            p1Points += 1;
        } else if (p1card.getHp() < p2card.getHp()){
            p2Points += 1;
        } else {
            p1Points += 1;
            p2Points += 1;
        }

        if(p1card.getDamage() > p2card.getDamage()){
            p1Points += 1;
        } else if (p1card.getDamage() < p2card.getDamage()){
            p2Points += 1;
        } else {
            p1Points += 1;
            p2Points += 1;
        }

        if(p1card.getMana() > p2card.getMana()){
            p1Points += 1;
        } else if (p1card.getMana() < p2card.getMana()){
            p2Points += 1;
        } else {
            p1Points += 1;
            p2Points += 1;
        }

        if(p1card.getHp() > p2card.getHp()){
            p1Points += 1;
        } else if (p1card.getHp() < p2card.getHp()){
            p2Points += 1;
        } else {
            p1Points += 1;
            p2Points += 1;
        }

        if(p1Points > p2Points){
           win = "player 1 win";
        } else if (p1Points < p2Points){
            win = "player 2 win";
        } else {
            win = "draw";
        }
        return win;
    }

    public static void main(String[] args) {
        gameBord gameBord = new gameBord();
        player p1 = new player();
        player p2 = new player();

        String win = gameBord.rules(p1,p2);

        System.out.println(win);
    }
}
