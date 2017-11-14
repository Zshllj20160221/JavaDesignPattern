import observer.ITalent;
import observer.JuniorEngineer;
import observer.SeniorEngineer;
import org.junit.Test;
import subject.AbstractHR;
import subject.HeadHunter;

/**
 * Created by zsh on 2017/11/7.
 */
public class TestDemo {

    @Test
    public void test(){
        ITalent juniorEngineer = new JuniorEngineer();
        ITalent seniorEndineer = new SeniorEngineer();

        AbstractHR headHunter = new HeadHunter();
        headHunter.addTalent(juniorEngineer);
        headHunter.addTalent(seniorEndineer);

        headHunter.publishJob("Top 500 big data position");
    }
}
