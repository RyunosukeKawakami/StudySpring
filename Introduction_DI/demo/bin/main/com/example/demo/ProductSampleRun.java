
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import sample.di.business.domain.Product;
import sample.di.service.ProductService;

/**
 * ProductSampleRun
 */

@SpringBootApplication
public class ProductSampleRun {

    public static void main(String[] args) {
        ProductSampleRun productSampleRun = new ProductSampleRun();
        productSampleRun.execute();
    }
}