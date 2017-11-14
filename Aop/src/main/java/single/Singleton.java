package single;

/**
 * Created by zsh on 2017/11/9.
 * 懒加载
 */
public class Singleton {
    private Singleton(){}
    private static Singleton singleton = null;

    public static Singleton getSingleton(){
        if (null == singleton){
            synchronized(Singleton.class){
                if (singleton!=null){
                    return singleton = new Singleton();
                }
            }
        }
        return singleton;
    }

    public synchronized static Singleton getSingleton2(){
        if (singleton==null){
            return new Singleton();
        }
        return singleton;
    }
}
