package com.sksun.o2o.service.impl;

import com.sksun.o2o.dao.AreaDao;
import com.sksun.o2o.entity.Area;
import com.sksun.o2o.service.AreaService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AreaServiceImpl implements AreaService {
    private final AreaDao areaDao;

    public AreaServiceImpl(AreaDao areaDao) {
        this.areaDao = areaDao;
    }

    @Override
    public List<Area> getAreaList() {
        return areaDao.queryArea();
    }
}
