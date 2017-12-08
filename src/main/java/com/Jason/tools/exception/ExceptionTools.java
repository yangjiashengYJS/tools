/*
 * Copyright (c) 2017. 简书首页：http://www.jianshu.com/u/092df3f77bca 山东三米科技有限公司(Jason_Yang) All rights reserved.
 */

package com.Jason.tools.exception;

import java.io.PrintWriter;
import java.io.StringWriter;

/**
 * 系统异常工具类
 * ===============================
 * Created with Eclipse.
 * User：Jason_Yang
 * Date：2017/9/7
 * Time：17:17
 *
 * ================================
 */
public class ExceptionTools
{
    /**
     * 获取异常堆栈信息
     * @param t 异常对象
     * @return
     */
    public static String printStackTraceToString(Throwable t) {
        StringWriter sw = new StringWriter();
        t.printStackTrace(new PrintWriter(sw, true));
        return sw.getBuffer().toString();
    }
}
