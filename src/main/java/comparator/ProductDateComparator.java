package comparator;

import com.cww.tmall.pojo.Product;

import java.util.Comparator;

//2. ProductReviewComparator 人气比较器
//        把 创建时间晚的放前面

public class ProductDateComparator implements Comparator<Product> {

    @Override
    public int compare(Product p1, Product p2) {
        return p1.getCreateDate().compareTo(p2.getCreateDate());
    }

}
