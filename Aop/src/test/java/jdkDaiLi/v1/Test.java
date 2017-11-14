package jdkDaiLi.v1;

import java.lang.reflect.Proxy;

/**
 * Created by zsh on 2017/11/7.
 * http://blog.csdn.net/fyduan/article/details/50389130
 */
public class Test {
    @org.junit.Test
    public void test() throws Exception{
//        System.getProperties().put("sun.misc.ProxyGenerator.saveGeneratedFiles", "true");

        Handler handler = new Handler(new HelloWorld());
        IHelloWorld helloWorld = (IHelloWorld) Proxy.newProxyInstance(this.getClass().getClassLoader(),new Class[]{IHelloWorld.class},handler);
        helloWorld.sayHello();

    }
}
