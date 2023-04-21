public class test {
    private card c;
    private mage m;
    private knight k;
    private rouge r;
    private hunter h;
    private player p1;

    public test(card c, mage m, knight k, rouge r, hunter h, player p1) {
        this.c = c;
        this.m = m;
        this.k = k;
        this.r = r;
        this.h = h;
        this.p1 = p1;
    }

    public static void main(String[] args) {
        card c = new card();
        mage m = new mage();
        knight k = new knight();
        rouge r = new rouge();
        hunter h = new hunter();
        player p1 = new player();
        player p2 = new player();

        m.roleStats();
        k.roleStats();
        r.roleStats();
        h.roleStats();

        p1.getCard();
        p2.getCard();

        System.out.println("prise: " + m.getPrise()
                + "\n" + "HP: " + m.getHp()
                + "\n" + "MANA: " + m.getMana()
                + "\n" + "DMG: " + m.getDamage()
                + "\n" + "Element: " + m.getElement()
        );
    }
}
