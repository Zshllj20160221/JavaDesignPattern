package subject;

import observer.ITalent;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Created by zsh on 2017/11/7.
 * 抽象主题类（如本例中的AbstractHR）定义通知观察者接口，并实现增加观察者和删除观察者方法（这两个方法可被子类共用，所以放在抽象类中实现），如
 */
public abstract class AbstractHR {
    protected Collection<ITalent> allTallents = new ArrayList<>();
    public abstract void publishJob(String job);
    public void addTalent(ITalent talent){
        allTallents.add(talent);
    };
    public void removeTalent(ITalent talent){
        allTallents.remove(talent);
    }
}
