package ma.morservs.vegaproject.controller.rest;

import ma.morservs.vegaproject.dto.ProductDTO;
import ma.morservs.vegaproject.service.ProductService;
import ma.morservs.vegaproject.service.impl.ProductServiceImpl;
import ma.morservs.vegaproject.tools.logging.Logging;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Ayoub on 08/09/2016.
 */
@RestController
@RequestMapping(value ="/product")
public class ProductController {


    @Autowired
    ProductService productService;

    @Logging
    Logger logger;


    @RequestMapping(method = RequestMethod.GET)
    public ProductDTO findById( @RequestParam Long id){
        return  productService.findById(id);

    }

    @RequestMapping(method = RequestMethod.DELETE)
    public boolean delete(@RequestParam  Long id){
        ProductDTO productDTO=new ProductDTO();
        productDTO.setId(id);
        productService.delete(productDTO);
        return true;
    }

    @RequestMapping(value = "/products",method = RequestMethod.GET)
    public List<ProductDTO> findAll( ){
        Pageable pageable=new PageRequest(0,10);
        return  productService.findAll(pageable);


    }

    @RequestMapping(method = RequestMethod.POST)
    public ProductDTO save(@RequestBody ProductDTO productDTO){


        return  productService.save(productDTO);

    }
    @RequestMapping(method = RequestMethod.PUT)
    public ProductDTO update( @RequestBody ProductDTO productDTO){


        return  productService.update(productDTO);

    }



}
