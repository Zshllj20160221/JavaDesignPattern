package single.eHan;


/**
 * Created by zsh on 2017/11/9.
 */
public class SingletonEhan {
    private SingletonEhan(){}
    private final static SingletonEhan singleton = new SingletonEhan();

    public static SingletonEhan getSingleton(){
        return singleton;
    }
}
