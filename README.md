# generator-all
* 代码自动生成
* cp target/generator-all-3.3.1.jar ../template/tools 
## 调试
```text
    String projectPath = System.getProperty("projectPath", "/Users/apple/Documents/workspace/java/cubita/generator-all/dao");
    String database = System.getProperty("database", "saas_depository");
    String pkgName = System.getProperty("pkgName", "com.lunz.fin.fd.depository");
    String tablePrefix = System.getProperty("tablePrefix", "tb_");
    String host = System.getProperty("host", "rm-bp1oydriw2vi7fc68qo.mysql.rds.aliyuncs.com");
    String port = System.getProperty("port", "3306");
    String userName = System.getProperty("userName", "user_depos");
    String userPwd = System.getProperty("userPwd", "Lunz2017");
    String likeTable = System.getProperty("likeTable");
```