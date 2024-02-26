package metier;

import Dao.IDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service("metier")
public class MetierImpl implements IMetier{
    private IDao dao;

    public MetierImpl(IDao dao) {

        this.dao = dao;
    }

    public MetierImpl() {
    }


    @Override
    public double calcul() {
        double t= dao.Getdata();
        double res=t*23;
        return res;
    }

    public void setDao(IDao dao) {
        this.dao = dao;
    }
}
