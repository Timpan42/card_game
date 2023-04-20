public class card {
    int hp;
    int damage;
    int mana;
    int prise;
    String element;

    public int getPrise() {
        return prise;
    }

    public void setPrise(int prise) {
        this.prise = prise;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        int prise = getPrise();
        if(prise >= 1 || prise <= 3){
            int[] manaAmount = {};
        }
        else if(prise > 3 || prise <= 6){
            int[] manaAmount = {};
        }
        else{
            int[] manaAmount = {};
        }

        this.mana = mana;
    }

    public String getElement() {
        return element;
    }

    public void setElement(String element) {
        String[] elementList = {"FIRE","AIR","WATER","EARTH"};
        this.element = element;
    }
}
