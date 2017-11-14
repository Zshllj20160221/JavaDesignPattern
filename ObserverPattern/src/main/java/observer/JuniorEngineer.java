package observer;

/**
 * Created by zsh on 2017/11/7.
 */
public class JuniorEngineer implements ITalent {

    @Override
    public void newJob(String job) {
        System.out.println("junior engineer new position{}"+job);
    }
}
