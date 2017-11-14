package cglib.v1;

import cglib.v1.v1.CglibProxy;
import cglib.v1.v1.ProductDao;

/**
 * Created by zsh on 2017/11/7.
 * http://blog.csdn.net/sunfc_nbu/article/details/50958558
 */
public class Test {
    @org.junit.Test
    public void test() throws Exception{
        ProductDao productDao = new ProductDao();
        ProductDao proxy= new CglibProxy(productDao).createProxy();
        proxy.add();
        proxy.update();

    }
}
