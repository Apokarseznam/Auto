package cz.auto.service;

import cz.auto.entity.Auto;
import java.util.List;

public interface AutoService {

    Auto getAuto(int id);
    
    List<Auto> getAutoList();

    void saveAuto(Auto auto);

    void deleteAuto(int id);

}
