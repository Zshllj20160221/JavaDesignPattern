package jdkDaiLi.v1;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by zsh on 2017/11/7.
 * 代理类的处理方法体
 */
public class Handler implements InvocationHandler {

    private Object target;

    public Handler(Object target){
        this.target = target;
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        if("add".equals(method.getName())){
            return method.invoke(target,args);
        }else if("sayHello".equals(method.getName())){
            System.out.println("before ..............");
            Object obj = method.invoke(target,args);
            System.out.println("after................");
            return obj;
        }else if("say".equals(method.getName())){
            System.out.println("before ..............");
            Object obj = method.invoke(target,args);
            System.out.println("after................");
            return obj;
        }else{
            return method.invoke(target,args);
        }
    }
}
