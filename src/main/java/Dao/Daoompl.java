package Dao;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository("dao")
public class Daoompl implements IDao{
    @Override
    public double Getdata() {
        System.out.println("Version base de données");
        double tem=25;
        return tem;
    }
}
