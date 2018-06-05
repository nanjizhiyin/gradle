package cn.testin.statistics;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * Created by mac on 2018/5/30.
 */

@EnableScheduling
@SpringBootApplication
public class AppStart {

    private static Logger logger = LoggerFactory.getLogger(AppStart.class);
    public static void main(String[] args) {
        logger.debug("开始了");
        logger.error("终于开始了");
        logger.info("要开始了");
        SpringApplication.run(AppStart.class, args);
    }
}
