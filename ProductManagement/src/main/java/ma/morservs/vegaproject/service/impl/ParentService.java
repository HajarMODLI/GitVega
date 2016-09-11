package ma.morservs.vegaproject.service.impl;

import ma.morservs.vegaproject.tools.BatchConverter;
import org.dozer.Mapper;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by Ayoub on 08/09/2016.
 */
public  abstract class ParentService {

    @Autowired
    protected Mapper mapper;
    @Autowired
    protected BatchConverter batchConverter;

}

