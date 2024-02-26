package ext;

import Dao.IDao;
import org.springframework.stereotype.Component;

@Component("dao2")
public class DaoIpmlV2 implements IDao {
    @Override
    public double Getdata() {
        System.out.println("Version Web Service");
        double t=77;
        return t;
    }
}
