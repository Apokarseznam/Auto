package cz.auto.dao;

import cz.auto.entity.Auto;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class AutoDAOimpl implements AutoDAO {

    @Autowired
    private SessionFactory factory;

    @Override
    public Auto getAuto(int id) {

        List<Auto> auto = new ArrayList<Auto>();

        Session session = factory.getCurrentSession();

        Query query = session.createQuery("from Auto where id=:autoId");
        
        query.setParameter("autoId", id);
        
        auto = query.list();
        
        Auto autoTemp = auto.get(0);

        return autoTemp;
    }
    
    @Override
    public List<Auto> getAutoList() {

        List<Auto> auto = new ArrayList<Auto>();

        Session session = factory.getCurrentSession();

        auto = session.createQuery("from Auto").list();

        return auto;
    }

    @Override
    public void saveAuto(Auto auto) {

        Session session = factory.getCurrentSession();

        session.saveOrUpdate(auto);
    }

    @Override
    public void deleteAuto(int id) {

        Session session = factory.getCurrentSession();

        Query query = session.createQuery("delete from Auto where id=:autoId");

        query.setParameter("autoId", id);

        query.executeUpdate();

    }

}
