package cn.testin.statistics.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by mac on 2018/5/2.
 */

@RestController
@RequestMapping("/email")

public class StatisticsController {
    private static Logger logger = LoggerFactory.getLogger(StatisticsController.class);

     /*
      * @author: gaojindan
      * @date: 2018/5/3 下午2:48
      * @des: 前一日的新注册用户
      * @param:
      * @return:
      */
    @RequestMapping(value = "newuserlist")
    @ResponseBody
    public String newuserlist() {

        System.out.println("发送完毕！");
        return "发送完毕！";
    }
    /*
     * @author: gaojindan
     * @date: 2018/5/3 下午2:48
     * @des: 前一日的新注册用户
     * @param:
     * @return:
     */
    @RequestMapping(value = "analysisrecord")
    public String analysisrecord() {
        return null;
    }
}
