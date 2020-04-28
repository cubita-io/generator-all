package io.cubita.generator;

import com.baomidou.mybatisplus.core.toolkit.StringPool;
import com.baomidou.mybatisplus.core.toolkit.StringUtils;
import com.baomidou.mybatisplus.generator.config.INameConvert;
import com.baomidou.mybatisplus.generator.config.StrategyConfig;
import com.baomidou.mybatisplus.generator.config.po.TableField;
import com.baomidou.mybatisplus.generator.config.po.TableInfo;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;

/**
 * 名称转换
 *
 * @author jiawei
 * @since 1.0.0
 */
public class CustomNameConvert implements INameConvert {

    private StrategyConfig strategyConfig;

    public CustomNameConvert(StrategyConfig strategyConfig) {
        this.strategyConfig = strategyConfig;
    }

    @Override
    public String entityNameConvert(TableInfo tableInfo) {
        tableInfo.setConvert(setTableConvert(tableInfo));
        return NamingStrategy.capitalFirst(processName(tableInfo.getName()));
    }

    @Override
    public String propertyNameConvert(TableField field) {
        field.setConvert(setFiledConvert(field));
        return lowerFirst(NamingStrategy.underlineToCamel(field.getName()));
    }

    private boolean setTableConvert(TableInfo tableInfo) {
        boolean convert = false;
        String name = tableInfo.getName();
        String entityName = tableInfo.getEntityName();
        if (strategyConfig.containsTablePrefix(name) || strategyConfig.isEntityTableFieldAnnotationEnable()) {
            // 包含前缀
            convert = true;
        } else if (strategyConfig.isCapitalModeNaming(name)) {
            // 包含
            convert = false;
        } else {
            // 转换字段
            if (NamingStrategy.underline_to_camel == strategyConfig.getColumnNaming()) {
                // 包含大写处理
                if (StringUtils.containsUpperCase(name)) {
                    convert = true;
                }
            } else if (!entityName.equalsIgnoreCase(name)) {
                convert = true;
            }
        }

        return convert;
    }

    private boolean setFiledConvert(TableField field) {
        boolean convert = false;
        String name = field.getName();
        String propertyName = field.getPropertyName();
        if (strategyConfig.isEntityTableFieldAnnotationEnable()) {
            convert = true;
            return convert;
        }
        if (strategyConfig.isCapitalModeNaming(name)) {
            convert = false;
        } else {
            // 转换字段
            if (NamingStrategy.underline_to_camel == strategyConfig.getColumnNaming()) {
                // 包含大写处理
                if (StringUtils.containsUpperCase(name)) {
                    convert = true;
                }
            } else if (!name.equals(propertyName)) {
                convert = true;
            }
        }
        return convert;
    }

    /**
     * 实体首字母小写
     *
     * @param name 待转换的字符串
     * @return 转换后的字符串
     */
    private static String lowerFirst(String name) {
        if (StringUtils.isNotBlank(name)) {
            return name.substring(0, 1).toLowerCase() + name.substring(1);
        }
        return StringPool.EMPTY;
    }

    /**
     * 处理表/字段名称
     *
     * @param name     ignore
     * @return 根据策略返回处理后的名称
     */
    private String processName(String name) {
        final NamingStrategy strategy = strategyConfig.getNaming();
        final String[] prefix = strategyConfig.getTablePrefix();
        boolean removePrefix = false;
        if (prefix != null && prefix.length != 0) {
            removePrefix = true;
        }
        String propertyName;
        if (removePrefix) {
            if (strategy == NamingStrategy.underline_to_camel) {
                // 删除前缀、下划线转驼峰
                propertyName = NamingStrategy.removePrefixAndCamel(name, prefix);
            } else {
                // 删除前缀
                propertyName = NamingStrategy.removePrefix(name, prefix);
            }
        } else if (strategy == NamingStrategy.underline_to_camel) {
            // 下划线转驼峰
            propertyName = NamingStrategy.underlineToCamel(name);
        } else {
            // 不处理
            propertyName = name;
        }
        return propertyName;
    }
}
