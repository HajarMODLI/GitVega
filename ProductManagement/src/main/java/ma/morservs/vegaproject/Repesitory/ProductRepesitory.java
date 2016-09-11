package ma.morservs.vegaproject.Repesitory;

import ma.morservs.vegaproject.entity.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by Ayoub on 07/09/2016
 */
public interface ProductRepesitory extends JpaRepository<Product, Long> {


    public  Product findById(Long id);


}
