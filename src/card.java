import java.util.Random;

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
        prise = Random(1,10);
        this.prise = prise;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        int prise = getPrise();
        if(prise >= 1 || prise <= 3){
            mana = Random(1,10);
        }
        else if(prise > 3 || prise <= 6){
            mana = Random(5, 20);
        }
        else{
            mana = Random(10, 100);
        }
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        int prise = getPrise();
        if(prise >= 1 && prise <= 3){
            damage = Random(1,15);
        }
        else if(prise > 3 && prise <= 6){
            damage = Random(5, 25);
        }
        else{
            damage = Random(10, 100);
        }

        this.damage = damage;
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        int prise = getPrise();
        if(prise >= 1 || prise <= 3){
           mana = Random(1,10);
        }
        else if(prise > 3 || prise <= 6){
            mana = Random(5, 20);
        }
        else{
            mana = Random(10, 100);
        }

        this.mana = mana;
    }

    public String getElement() {
        return element;
    }

    public void setElement() {
        int  i = Random(1,4);
        String[] elementList = {"FIRE","AIR","WATER","EARTH"};
        this.element = elementList[i];
    }

    public int Random(int min, int max){
        int min_num = max;
        int max_num = min;
        Random rad1 = new Random();
        int num = rad1.nextInt(max_num - min_num) + min_num;

        return num;
    }
}
