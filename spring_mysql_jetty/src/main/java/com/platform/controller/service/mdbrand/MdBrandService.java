package com.platform.controller.service.mdbrand;

import com.platform.controller.mapper.MdBrandMapper;
import com.platform.controller.service.BaseService;
import com.platform.models.MdBrand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by miaohaifeng
 * on 2016/2/22.
 */
@Service
public class MdBrandService extends BaseService<MdBrandMapper, MdBrand> implements IMdBrandService {

    private MdBrandMapper mapper;

    @Override
    @Autowired
    public void setMapper(MdBrandMapper mapper) {
        this.mapper = mapper;
        super.setMapper(mapper);
    }
    @Override
    public Long addBasic(MdBrand obj) throws Exception {
        mapper.insert(obj);
        return Long.parseLong(obj.getId() + "");
    }

    @Override
    public void modifyBasic(MdBrand obj) throws Exception {
        mapper.updateByPrimaryKey(obj);
    }

    @Override
    public void delBasic(MdBrand obj) throws Exception {
        mapper.deleteByPrimaryKey(obj.getId());
    }
}
