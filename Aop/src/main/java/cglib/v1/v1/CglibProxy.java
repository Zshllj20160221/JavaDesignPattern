package cglib.v1.v1;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * Created by zsh on 2017/11/7.
 */
public class CglibProxy implements MethodInterceptor {

    private ProductDao productDao;
    public CglibProxy(ProductDao productDao){
        this.productDao = productDao;
    }
    //创建代理
    public ProductDao createProxy(){
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(productDao.getClass());
        enhancer.setCallback(this);
        return (ProductDao) enhancer.create();
    }

    @Override
    public Object intercept(Object proxy, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
        if ("add".equals(method.getName())){
            System.out.println("add method before...... ");
            Object obj = methodProxy.invokeSuper(proxy,args);
            System.out.println("add method after.........");
            return obj;
        }else{
            return methodProxy.invokeSuper(proxy,args);
        }
    }
}
