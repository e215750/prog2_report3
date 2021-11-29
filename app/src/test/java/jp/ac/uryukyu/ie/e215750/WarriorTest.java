package jp.ac.uryukyu.ie.e215750;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class WarriorTest {
    @Test
    void warriorattackTest() {
        int defaultHp = 100;
        int defaultAttack = 10;
        Warrior demoWarrior = new Warrior("デモwarrior", defaultHp, defaultAttack);
        Enemy demoslime = new Enemy("スライムもどき", defaultHp, 10);
        for(int i = 1; i < 4; i++){
            demoWarrior.attackWithWeponSkill(demoslime);
            assertEquals(defaultHp - i * defaultAttack * 1.5, demoslime.hitPoint);
        }  
    }
}
