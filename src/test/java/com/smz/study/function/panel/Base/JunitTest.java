package com.smz.study.function.panel.Base;

import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @Author: smz
 * @Date: Created in 2022/4/24 09:57
 * @Description:
 */
@RunWith(SpringJUnit4ClassRunner.class)     // 用于指定junit运行环境
@ContextConfiguration(locations = {         // Locations:导入配置文件
        "classpath*:spring/*.xml"})         // 加上classpath关键字，表示在类路径下：resources
public abstract class JunitTest {
}