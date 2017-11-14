package observer;

/**
 * Created by zsh on 2017/11/7.
 */
public class SeniorEngineer implements ITalent{
    @Override
    public void newJob(String job) {
        System.out.println("Senior engineer new position{}"+job);
    }
}
