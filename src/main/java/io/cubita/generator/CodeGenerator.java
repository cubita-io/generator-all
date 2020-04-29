package io.cubita.generator;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.StringUtils;

import com.baomidou.mybatisplus.core.toolkit.StringPool;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.InjectionConfig;
import com.baomidou.mybatisplus.generator.config.ConstVal;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.FileOutConfig;
import com.baomidou.mybatisplus.generator.config.GlobalConfig;
import com.baomidou.mybatisplus.generator.config.INameConvert;
import com.baomidou.mybatisplus.generator.config.PackageConfig;
import com.baomidou.mybatisplus.generator.config.StrategyConfig;
import com.baomidou.mybatisplus.generator.config.po.LikeTable;
import com.baomidou.mybatisplus.generator.config.po.TableInfo;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;
import com.baomidou.mybatisplus.generator.engine.FreemarkerTemplateEngine;

import static com.baomidou.mybatisplus.core.enums.SqlLike.RIGHT;

/**
 * <p>
 *     java -DprojectPath=$(pwd)/depository-dao -Dhost=rm-bp1oydriw2vi7fc68qo.mysql.rds.aliyuncs.com -Dport=3306 -DuserName=user_depos -DuserPwd=Lunz2017 -Ddatabase=saas_depository -DpkgName=com.lunz.fin.fd.depository -DtablePrefix=tb_ -DresXml=true -jar tools/generator-all-3.3.1.jar
 * </p>
 *
 * @author jiawei
 * @since 1.0.0
 */
public class CodeGenerator {

    private static final Logger logger = LoggerFactory.getLogger("CodeGenerator");

    public static void main(String[] args) {
        String projectPath = System.getProperty("projectPath");
//        String moudleName = System.getProperty("moudleName");
        String database = System.getProperty("database");
        String pkgName = System.getProperty("pkgName");
        String tablePrefix = System.getProperty("tablePrefix", "");
        String host = System.getProperty("host");
        String port = System.getProperty("port");
        String userName = System.getProperty("userName");
        String userPwd = System.getProperty("userPwd");
        String logicDeletedColumn = System.getProperty("logicDeletedColumn");
        String likeTable = System.getProperty("likeTable");

        boolean resXml = Boolean.parseBoolean(System.getProperty("resXml", "false"));


        String help = "-DprojectPath=? -DmoudleName=? -Ddatabase=? -DpkgName=? -DlikeTable=? -DtablePrefix=* -Dhost=127.0.0.1 -Dport=3306 -DuserName=root -DuserPwd=123456 -DresXml=false -DlogicDeletedColumn=?";

        if (!StringUtils.hasText(projectPath)) {
            logger.warn("请配置projectPath");
            logger.info("用法:" + help);
            return;
        }

//        if (!StringUtils.hasText(moudleName)) {
//            logger.warn("请配置moudleName");
//            logger.info("用法:" + help);
//            return;
//        }

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
        gc.setAuthor("fin-cloud-group");
        gc.setOpen(false);
        gc.setBaseResultMap(true);
        gc.setBaseColumnList(true);
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
                if (resXml) {
                    //移除默认生成的方式
                    this.getConfig().getPathInfo().remove(ConstVal.XML_PATH);
                }
            }
        };
        mpg.setCfg(cfg);

        // 如果模板引擎是 freemarker
        if (resXml) {
            String templatePath = "/templates/mapper.xml.ftl";
            // 自定义输出配置
            List<FileOutConfig> focList = new ArrayList<>();
            // 自定义配置会被优先输出
            focList.add(new FileOutConfig(templatePath) {
                @Override
                public String outputFile(TableInfo tableInfo) {
                    // 自定义输出文件名 ， 如果你 Entity 设置了前后缀、此处注意 xml 的名称会跟着发生变化！！
                    return projectPath + "/src/main/resources/mapper/dao" +
                            "/" + tableInfo.getEntityName() + "Mapper" + StringPool.DOT_XML;
                }
            });
            cfg.setFileOutConfigList(focList);
            mpg.setCfg(cfg);
        }

        StrategyConfig strategy = new StrategyConfig();
        INameConvert nameConvert = new CustomNameConvert(strategy);

        strategy.setNaming(NamingStrategy.underline_to_camel);
        strategy.setColumnNaming(NamingStrategy.underline_to_camel);
        strategy.setRestControllerStyle(true);
        strategy.setControllerMappingHyphenStyle(true);
        if (StringUtils.hasText(logicDeletedColumn)) {
            strategy.setLogicDeleteFieldName(logicDeletedColumn);
        }

        if (StringUtils.hasText(tablePrefix)) {
            strategy.setTablePrefix(tablePrefix.split(","));
        }
        if (StringUtils.hasText(likeTable)) {
            strategy.setLikeTable(new LikeTable(likeTable, RIGHT));
        }

        strategy.setNameConvert(nameConvert);
        mpg.setStrategy(strategy);

        mpg.setTemplateEngine(new FreemarkerTemplateEngine());

//        // 策略配置
//        StrategyConfig strategy = new StrategyConfig();
//        strategy.setNaming(NamingStrategy.underline_to_camel);
//        strategy.setColumnNaming(NamingStrategy.underline_to_camel);
//        strategy.setSuperEntityClass("你自己的父类实体,没有就不用设置!");
//        strategy.setEntityLombokModel(true);
//        strategy.setRestControllerStyle(true);
//        // 公共父类
//        strategy.setSuperControllerClass("你自己的父类控制器,没有就不用设置!");
//        // 写于父类中的公共字段
//        strategy.setSuperEntityColumns("id");
//        strategy.setInclude(scanner("表名，多个英文逗号分割").split(","));
//        strategy.setControllerMappingHyphenStyle(true);
//        strategy.setTablePrefix(pc.getModuleName() + "_");
//        mpg.setStrategy(strategy);
//        mpg.setTemplateEngine(new FreemarkerTemplateEngine());
//        mpg.execute();

        mpg.execute();
    }

}
