import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by zsh on 2017/11/13.
 */
public class TargetProxy implements InvocationHandler {
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        return method.invoke(proxy,args);
    }
}
