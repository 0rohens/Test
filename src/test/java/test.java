import org.junit.Test;
import org.springframework.transaction.annotation.Transactional;

import java.net.URL;
import java.util.logging.Filter;

@Transactional
public class test{

    @Test
    public void get(){
        URL url = Filter.class.getProtectionDomain().getCodeSource().getLocation();
        System.out.println("path:"+url.getPath()+" name:"+url.getFile());
    }
}
