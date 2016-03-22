package com.platform;

import com.platform.controller.service.mdbrand.IMdBrandService;
import com.platform.models.MdBrand;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by miaohaifeng
 * on 2016/3/21.
 */
public class MdBrandServiceTest extends BaseServiceTest {
    @Autowired
    private IMdBrandService service;
    @Test
    public void addBasicTest(){
        MdBrand obj = new MdBrand();
        obj.setAdvertiserid(99);
        obj.setName("name");
        try {
            service.addBasic(obj);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        System.out.println("");
    }
}
