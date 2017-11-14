package cglib.v2;

import cglib.v1.v1.ProductDao;
import cglib.v1.v2.CglibProxyV2;
import org.springframework.cglib.proxy.Enhancer;

/**
 * Created by zsh on 2017/11/7.
 */
public class Test {

    @org.junit.Test
    public void test() {
        ProductDao productDao = new ProductDao();
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(productDao.getClass());
        enhancer.setCallback(new CglibProxyV2());
        ProductDao proxy = (ProductDao) enhancer.create();
        proxy.add();
        proxy.update();
    }
}
