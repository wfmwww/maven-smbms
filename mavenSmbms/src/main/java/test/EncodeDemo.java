package test;

import org.apache.commons.lang.RandomStringUtils;
import org.apache.commons.lang.StringUtils;
import org.apache.shiro.crypto.hash.SimpleHash;

import java.util.Random;

public class EncodeDemo {
    public static void main(String[] args) {
        String password = "1234567";
        //base64    md5     数据库加密
        //加密方式
        String method = "MD5";
        //加密次数
        int times = 100;
        String salt = null;
        //加盐前
        SimpleHash simpleHash = new SimpleHash(method, password, salt, times);
        String enPwd = simpleHash.toString();
        System.out.println(password + "加密之后是：" + enPwd);//1234567加密之后是：3d10594b79f32ab5f0a5ca367e563c07
        //加盐后   盐值      编号等内容
        salt = RandomStringUtils.randomAlphabetic(20);
        System.out.println("盐是：" + salt);
        SimpleHash simpleHash1 = new SimpleHash(method, password, salt, times);
        String enPwd1 = simpleHash1.toString();
        System.out.println(password + "加密加盐之后是：" + enPwd1);//1234567加密之后是：c94ea48dbe1f20d2bca6042502a8d7cd
    }
}
