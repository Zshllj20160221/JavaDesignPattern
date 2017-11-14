/**
 * Created by zsh on 2017/11/13.
 */
public class Target implements ITarget {
    @Override
    public void doSthing() {
        System.out.println("targer do something......");
    }

    @Override
    public void doOthing() {
        System.out.println("target do otherthing.......");
    }
}
