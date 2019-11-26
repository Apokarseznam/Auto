package cz.auto.dao;

import cz.auto.entity.Auto;
import java.util.List;

public interface AutoDAO {

    Auto getAuto(int id);
    
    List<Auto> getAutoList();

    void saveAuto(Auto auto);

    void deleteAuto(int id);

}
