package ma.morservs.vegaproject.tools;

import org.dozer.Mapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Ayoub on 08/09/2016.
 */


public class BatchConverter {




    @Autowired
    private Mapper mapper;



    public  <T, U> List<U> map(final Mapper mapper, final List<T> source, final Class<U> destType) {
        final List<U> dest = new ArrayList<>();
        for (T element : source) {
            if (element == null) {
                continue;
            }
            dest.add(mapper.map(element, destType));
        }

        // finally remove all null values if any
        List s1 = new ArrayList();
        s1.add(null);
        dest.removeAll(s1);

        return dest;
    }

    public  <T, U> List<U> map(final List<T> source, final Class<U> destType) {
        final List<U> dest = new ArrayList<>();
        for (T element : source) {
            if (element == null) {
                continue;
            }
            dest.add(this.mapper.map(element, destType));
        }

        // finally remove all null values if any
        List s1 = new ArrayList();
        s1.add(null);
        dest.removeAll(s1);

        return dest;
    }
}
