package comparator;

// ProductSaleCountComparator 销量比较器
//         把 销量高的放前面

import com.cww.tmall.pojo.Product;

import java.util.Comparator;

public class ProductSaleCountComparator implements Comparator<Product> {

    @Override
    public int compare(Product p1, Product p2) {
        return p2.getSaleCount()-p1.getSaleCount();
    }

}