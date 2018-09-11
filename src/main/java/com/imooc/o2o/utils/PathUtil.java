package com.imooc.o2o.utils;

/**
 * @author 郑爱民
 * 日期: 2018-09-10
 * 时间: 20:02
 */
public class PathUtil {

    //获取文件分隔符
    private static String separator = System.getProperty("file.separator");

    /**
     * 获取图片路径
     *
     * @return
     */
    public static String getImgBasePath() {
        //获取操作系统的名称
        String os = System.getProperty("os.name");
        String basePath = "";
        if (os.toLowerCase().startsWith("win")) {
            basePath = "E:/o2o/image/";
        } else {
            basePath = "/home/zhengAiMin/image/";
        }

        //替换文件分割符
        basePath = basePath.replace("/", separator);

        return basePath;
    }

    /**
     * 获取商铺图片路径
     *
     * @param shopId
     * @return
     */
    public static String getShopImagePath(Long shopId) {
        String imagePath = "/upload/item/shop" + shopId + "/";
        return imagePath.replace("/", separator);
    }
}
