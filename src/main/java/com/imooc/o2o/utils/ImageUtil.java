package com.imooc.o2o.utils;

import net.coobird.thumbnailator.Thumbnails;
import net.coobird.thumbnailator.geometry.Positions;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

/**
 * @author 郑爱民
 * 日期: 2018-09-10
 * 时间: 19:14
 */
public class ImageUtil {
    //文件路径
    private static String basePath = Thread.currentThread().getContextClassLoader().getResource("").getPath();
    //设置日期格式
    private static final SimpleDateFormat sDateFormat = new SimpleDateFormat("yyyyMMddHHmmss");
    //随机数
    private static final Random r = new Random();

    /**
     * 处理缩略图
     *
     * @param thumbnail
     * @param targetAddr 存储路径
     * @return
     */
    public static String generateThumbnail(CommonsMultipartFile thumbnail, String targetAddr) throws IOException {
        //获取文件随机名称
        String realFileName = getRandomFileName();
        //获取文件扩展名
        String extension = getFileExtension(thumbnail);
        //创建目录
        makeDirPath(targetAddr);
        String relativeAddr = targetAddr + realFileName + extension;
        File dest = new File(PathUtil.getImgBasePath() + relativeAddr);

        try {
            Thumbnails.of(thumbnail.getInputStream()).size(200, 200)
                    .watermark(Positions.BOTTOM_RIGHT, ImageIO.read(new File(basePath + "/watermark.ico")), 0.25F)
                    .outputQuality(0.8F).toFile(dest);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;
    }

    /**
     * 创建文件夹
     *
     * @param targetAddr
     */
    private static void makeDirPath(String targetAddr) {
        String realFileParentPath = PathUtil.getImgBasePath() + targetAddr ;
        File dirPath = new File(realFileParentPath) ;
        if (!dirPath.exists()) {
            //递归创建文件夹
            dirPath.mkdirs() ;
        }
    }

    /**
     * 获取输入文件流的扩展名
     *
     * @param cFile
     * @return
     */
    private static String getFileExtension(CommonsMultipartFile cFile) {
        //获取文件名
        String originalFileName = cFile.getOriginalFilename();
        //返回文件的扩展名
        return originalFileName.substring(originalFileName.lastIndexOf("."));
    }

    /**
     * 生成随机文件名,当前年月日小时分钟秒钟+五位随机数
     *
     * @return
     */
    private static String getRandomFileName() {
        //生成10000 - 99999 中的随机数
        int rannum = r.nextInt(89999) + 10000;
        String nowTimeStr = sDateFormat.format(new Date());
        //字符串相加
        return nowTimeStr + rannum;
    }


    public static void main(String[] args) throws IOException {

        Thumbnails.of(new File("E:/IDEA/o2o/xiaohuangren.jpg"))
                .size(1920, 1080).watermark(Positions.BOTTOM_RIGHT
                , ImageIO.read(new File(basePath + "/ShuiYin.jpg")), 0.25F)
                .outputQuality(0.8F).toFile("E:/IDEA/o2o/xiaohuangrenNew.jpg");
    }
}
