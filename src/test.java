public class test {
    private card c;

    public test(card c) {
        this.c = c;
    }

    public static void main(String[] args) {
        card c = new card();
        c.setPrise();
        c.setHp();
        c.setDamage();
        c.setMana();
        c.setElement();
        System.out.println("prise: " + c.getPrise() + "\n" + "hp: " + c.getHp());
    }
}
