package com.imooc.o2o.web.superadmin;

import com.imooc.o2o.entity.Area;
import com.imooc.o2o.service.AreaService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author 郑爱民
 * 日期: 2018-09-10
 * 时间: 10:35
 */
@Controller
@RequestMapping("/superadmin")
public class AreaController {
    private Logger logger = LoggerFactory.getLogger(AreaController.class) ;

    @Autowired
    private AreaService areaService;

    /**
     * 遍历区域列表
     *
     * @return
     */
    @RequestMapping(value = "/list_area", method = RequestMethod.GET)
    @ResponseBody
    private Map<String, Object> listArea() {
        logger.info("===start===");
        Long startTime = System.currentTimeMillis() ;
        Map<String, Object> modelMap = new HashMap<String, Object>();

        List<Area> list = new ArrayList<>();
        try {
            list = areaService.getAreaList();
            modelMap.put("rows", list);
            modelMap.put("total", list.size());
        } catch (Exception e) {
            e.printStackTrace();
            modelMap.put("success", false);
            modelMap.put("errMsg", e.toString());
        }
        logger.error("test error!");
        Long endTime = System.currentTimeMillis() ;
        logger.debug("costTime:[{}ms]",endTime - startTime);
        logger.info("===end===");
        return modelMap;
    }
}
