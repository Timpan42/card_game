import javax.swing.*;
import java.nio.charset.MalformedInputException;
import java.util.Objects;

public class player {
    private card c;
    /*private mage m;
    private knight k;
    private rouge r;
    private hunter h;
*/

    public card getCard(){
        mage m = new mage();
        knight k = new knight();
        rouge r = new rouge();
        hunter h = new hunter();

        String card = JOptionPane.showInputDialog("select card:"+" \n "+ "MAGE"
                +" \n "+ "KNIGHT"
                +" \n "+ "ROUGE"
                +" \n "+ "HUNTER");

        if (Objects.equals(card, "MAGE")){
            //c = new mage();
            m.roleStats();
            System.out.println("prise: " + m.getPrise()
                    + "\n" + "HP: " + m.getHp()
                    + "\n" + "MANA: " + m.getMana()
                    + "\n" + "DMG: " + m.getDamage()
                    + "\n" + "Element: " + m.getElement()
                    + "\n"
            );
            c = m;
        }
        if (Objects.equals(card, "KNIGHT")){
            k.roleStats();
            System.out.println("prise: " + k.getPrise()
                    + "\n" + "HP: " + k.getHp()
                    + "\n" + "MANA: " + k.getMana()
                    + "\n" + "DMG: " + k.getDamage()
                    + "\n" + "Element: " + k.getElement()
                    + "\n"
            );
        }
        if (Objects.equals(card, "ROUGE")){
            r.roleStats();
            System.out.println("prise: " + r.getPrise()
                    + "\n" + "HP: " + r.getHp()
                    + "\n" + "MANA: " + r.getMana()
                    + "\n" + "DMG: " + r.getDamage()
                    + "\n" + "Element: " + r.getElement()
                    + "\n"
            );
        }
        if (Objects.equals(card, "HUNTER")){
            h.roleStats();
            System.out.println("prise: " + h.getPrise()
                    + "\n" + "HP: " + h.getHp()
                    + "\n" + "MANA: " + h.getMana()
                    + "\n" + "DMG: " + h.getDamage()
                    + "\n" + "Element: " + h.getElement()
                    + "\n"
            );
        }

        return c;
    }
}
