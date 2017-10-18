package com.flightstats.logbackLogstashTest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ch.qos.logback.classic.LoggerContext;
import ch.qos.logback.core.util.StatusPrinter;
import static net.logstash.logback.argument.StructuredArguments.*;

import java.util.HashMap;
import java.util.Map;

public class HelloWorld {


    public static void main(String[] args) {

        // print internal state
        LoggerContext lc = (LoggerContext) LoggerFactory.getILoggerFactory();
        StatusPrinter.print(lc);


        Logger logger = LoggerFactory.getLogger(HelloWorld.class);
        logger.debug("Debug Message");
        logger.info("Info Message");
        logger.warn("Warning Message");
        logger.error("Error Message");

        Map myMap = new HashMap();
        myMap.put("name1", "value1");
        myMap.put("name2", "value2");
        logger.info("KV Pairs {}", entries(myMap));
    }
}
