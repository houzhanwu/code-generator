package com.zhuyizhuo.generator.mybatis.database.convention;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 方法注释
 * @author yizhuo
 * @version 1.0
 * @date 2018/7/29 16:10
 */
public class CommentInfo {
    /** 默认生成版本号 */
    private String version = "1.0";
    /** 默认作者 */
    private String author = "yizhuo";
    /** 默认生成时间 */
    private String createTime = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }
}
