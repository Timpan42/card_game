public class test {
    private card c;
    private mage m;
    private knight k;
    private rouge r;
    private hunter h;

    public test(card c, mage m, knight k, rouge r, hunter h) {
        this.c = c;
        this.m = m;
        this.k = k;
        this.r = r;
        this.h = h;

    }

    public static void main(String[] args) {
        card c = new card();
        mage m = new mage();
        knight k = new knight();
        rouge r = new rouge();
        hunter h = new hunter();

        m.roleStats();
        k.roleStats();
        r.roleStats();
        h.roleStats();

        System.out.println("prise: " + m.getPrise()
                + "\n" + "HP: " + m.getHp()
                + "\n" + "MANA: " + m.getMana()
                + "\n" + "DMG: " + m.getDamage()
                + "\n" + "Element: " + m.getElement()
        );
    }
}
