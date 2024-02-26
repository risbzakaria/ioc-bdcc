package pres;

import Dao.Daoompl;
import metier.MetierImpl;

public class pres {
    public static void main(String[] args) {
        Daoompl d=new Daoompl();
        MetierImpl metier=new MetierImpl(d);
        //metier.setDao(d);
        System.out.println(metier.calcul());
    }
}
