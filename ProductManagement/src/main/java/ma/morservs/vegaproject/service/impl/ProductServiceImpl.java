package ma.morservs.vegaproject.service.impl;

import ma.morservs.vegaproject.Repesitory.ProductRepesitory;
import ma.morservs.vegaproject.dto.ProductDTO;
import ma.morservs.vegaproject.entity.Product;
import ma.morservs.vegaproject.service.ProductService;
import ma.morservs.vegaproject.tools.logging.Logging;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Ayoub on 07/09/2016.
 */
@Service
public class ProductServiceImpl extends  ParentService implements ProductService {


    @Autowired
    private ProductRepesitory productRepesitory;
    @Logging
    private static Logger logger;


    @Override
    @Transactional(rollbackFor = Exception.class)
    public ProductDTO save(ProductDTO product) {
       Product productEntity=mapper.map(product, Product.class);
        productRepesitory.save(productEntity);
        return product;

    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public ProductDTO update(ProductDTO product) {
       Product productEntity=productRepesitory.findById(product.getId());
        if(productEntity==null){
            return null;
        }
        productEntity.setDescription(product.getDescription());
        productEntity.setName(product.getName());
        productEntity.setValidFrom(product.getValidFrom());
        productEntity.setValidTo(product.getValidTo());
   return  product;
    }

    @Override
    public void delete(ProductDTO product) {
        productRepesitory.delete(product.getId());
    }

    @Override
    public ProductDTO findById(Long id) {
       Product product= productRepesitory.findById(id);
        return mapper.map(product,ProductDTO.class);

    }

    @Override
    public List<ProductDTO> findAll(Pageable page) {
        Page<Product> products=productRepesitory.findAll(page);
        return  batchConverter.map(products.getContent(), ProductDTO.class);

    }
}
