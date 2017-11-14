package subject;

import observer.ITalent;

import java.util.Iterator;

/**
 * 猎头招聘
 * Created by zsh on 2017/11/7.
 * 具体主题类（如本例中的HeadHunter）只需实现通知观察者接口，在该方法中通知所有注册的具体观察者。代码如下
 */
public class HeadHunter extends AbstractHR{
    @Override
    public void publishJob(String job){
        Iterator<ITalent> iterator = allTallents.iterator();
        while(iterator.hasNext()){
            ITalent talent = iterator.next();
            talent.newJob(job);
        }
    }
}
