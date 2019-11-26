package cz.auto.service;

import cz.auto.dao.AutoDAO;
import org.springframework.stereotype.Service;
import cz.auto.entity.Auto;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

@Service
public class AutoServiceimpl implements AutoService {

    @Autowired
    private AutoDAO autoDao;

    @Override
    @Transactional
    public Auto getAuto(int id) {

        return autoDao.getAuto(id);
    }
    
    @Override
    @Transactional
    public List<Auto> getAutoList() {

        return autoDao.getAutoList();
    }

    @Override
    @Transactional
    public void saveAuto(Auto auto) {

        autoDao.saveAuto(auto);
    }

    @Override
    @Transactional
    public void deleteAuto(int id) {
        autoDao.deleteAuto(id);
    }

}
