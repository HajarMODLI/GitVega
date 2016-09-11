package ma.morservs.vegaproject.service;

import ma.morservs.vegaproject.dto.ProductDTO;
import ma.morservs.vegaproject.entity.Product;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 * Created by Ayoub on 07/09/2016.
 */
public interface ProductService {



    public ProductDTO save(ProductDTO product);
    public ProductDTO update(ProductDTO product);
    public void delete(ProductDTO product);
    public ProductDTO findById(Long id);
    public List<ProductDTO> findAll(Pageable page);
}
