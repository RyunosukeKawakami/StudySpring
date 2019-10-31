import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import sample.di.buisiness.domain.Product;

@Component
public class ProductServicelmpl implements ProductService{
    @Autowired
    private ProductDao productDao;

    public Product findProductDao(){
        return productDao.findProduct();
    }
}

