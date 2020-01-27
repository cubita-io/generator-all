package io.cubita.generator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.StringUtils;

import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.InjectionConfig;
import com.baomidou.mybatisplus.generator.config.ConstVal;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.GlobalConfig;
import com.baomidou.mybatisplus.generator.config.PackageConfig;
import com.baomidou.mybatisplus.generator.config.StrategyConfig;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;
import com.baomidou.mybatisplus.generator.engine.FreemarkerTemplateEngine;

/**
 * <p>
 * </p>
 *
 * @author jiawei
 * @since 1.0.0
 */
public class CodeGenerator {

    private static final Logger logger = LoggerFactory.getLogger("CodeGenerator");

    public static void main(String[] args) {
        String projectPath = System.getProperty("projectPath");
        String database = System.getProperty("database");
        String pkgName = System.getProperty("pkgName");
        String tablePrefix = System.getProperty("tablePrefix");
        String host = System.getProperty("host");
        String port = System.getProperty("port");
        String userName = System.getProperty("userName");
        String userPwd = System.getProperty("userPwd");

        String help = "-DprojectPath=? -Ddatabase=? -DpkgName=? -DtablePrefix=* -Dhost=127.0.0.1 -Dport=3306 -DuserName=root -DuserPwd=123456";

        if (!StringUtils.hasText(projectPath)) {
            logger.warn("请配置projectPath");
            logger.info("用法:" + help);
            return;
        }

        if (!StringUtils.hasText(database)) {
            logger.warn("请配置database");
            logger.info("用法:" + help);
            return;
        }

        if (!StringUtils.hasText(pkgName)) {
            logger.warn("请配置tablePrefix");
            logger.info("用法:" + help);
            return;
        }


        // 代码生成器
        AutoGenerator mpg = new AutoGenerator();

        // 全局配置
        GlobalConfig gc = new GlobalConfig();

        gc.setOutputDir(projectPath + "/src/main/java");
        gc.setAuthor("cubita");
        gc.setOpen(false);
        // gc.setSwagger2(true); 实体属性 Swagger2 注解
        mpg.setGlobalConfig(gc);

        // 数据源配置
        DataSourceConfig dsc = new DataSourceConfig();
        StringBuilder url = new StringBuilder();
        url.append("jdbc:mysql://");

        //host and port
        url.append(StringUtils.hasText(host) ? host : "127.0.0.1");
        url.append(":");
        url.append(StringUtils.hasText(port) ? port : "3306");

        url.append("/");
        url.append(database);
        url.append("?useUnicode=true&useSSL=false&characterEncoding=utf8");

        logger.info("数据库连接:" + url.toString());
        dsc.setUrl(url.toString());
        // dsc.setSchemaName("public");
        dsc.setDriverName("com.mysql.jdbc.Driver");
        dsc.setUsername(StringUtils.hasText(userName) ? userName : "root");
        dsc.setPassword(StringUtils.hasText(userPwd) ? userPwd : "123456");
        mpg.setDataSource(dsc);

        // 包配置

        String moudleName = "dao";

        PackageConfig pc = new PackageConfig();
        pc.setModuleName(moudleName);
        pc.setParent(pkgName);

        mpg.setPackageInfo(pc);

        // 自定义配置
        InjectionConfig cfg = new InjectionConfig() {
            @Override
            public void initMap() {
                this.getConfig().getPathInfo().remove(ConstVal.CONTROLLER_PATH);
                this.getConfig().getPathInfo().remove(ConstVal.XML_PATH);
            }
        };
        mpg.setCfg(cfg);

        StrategyConfig strategy = new StrategyConfig();

        strategy.setNaming(NamingStrategy.underline_to_camel);
        strategy.setColumnNaming(NamingStrategy.underline_to_camel);
        strategy.setRestControllerStyle(true);
        strategy.setControllerMappingHyphenStyle(true);

        if (StringUtils.hasText(tablePrefix)) {
            strategy.setTablePrefix(tablePrefix);
        }
        mpg.setStrategy(strategy);

        mpg.setTemplateEngine(new FreemarkerTemplateEngine());

        mpg.execute();
    }

}
