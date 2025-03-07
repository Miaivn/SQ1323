package com.softserve.academy.application;

import com.softserve.academy.service.Calc;
import java.util.logging.Logger;

public class Appl {
    // Create a logger instance
    private static final Logger logger = Logger.getLogger(Appl.class.getName());

    public int add(int arg0, int arg1) {
        return arg0 + arg1;
    }

    public static void main(String[] args) {
        Calc calc = new Calc();

        // Replace System.out.println with logger
        logger.info("1 + 2 = " + calc.add(1, 2));

        logger.info("1.5 + 2.5 = " + calc.add(1.5, 2.5));
        logger.info("4 - 2 = " + calc.sub(4, 2));
        logger.info("2.5 - 1.5 = " + calc.sub(2.5, 1.5));
    }
}
