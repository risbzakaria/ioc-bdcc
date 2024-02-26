package pres;

import Dao.IDao;
import metier.IMetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public abstract class presavecspringXML implements IDao {
    public static void main(String[] args) {

        ApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
        IMetier metier= context.getBean(IMetier.class);
        System.out.println("res="+metier.calcul());
    }
}
