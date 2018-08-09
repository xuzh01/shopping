package cn.edu.jxufe.shopping.utils;

import java.util.Date;
import java.util.Random;

/**
 * Author :'徐真华'
 * Created by '徐真华' on 2018/8/9.
 */
public class PasswordUtil {
        public final static String[] word={
                "a","b","c","d","e","f",
                "g","h","j","k","m","n",
                "p","q","r","s","t","u",
                "v","w","x","y","z",
                "A","B","C","D","E","F",
                "G","H","J","K","M","N",
                "P","Q","R","S","T","U",
                "V","W","X","Y","Z",
        };

        public static String[] num={
                "2","3","4","5","6","7","8","9"
        };
        /**
         * lqn
         * 随机生成密码
         * @return
         */
        public static String randomPassword(){
            StringBuffer stringBuffer=new StringBuffer();
            //以当前时间生成random
            Random random=new Random(new Date().getTime());
            boolean flag=false;
            //设置默认密码的长度为1+6位
            int length=random.nextInt(1)+6;
            for (int i = 0; i < length; i++) {
                if(flag){
                    stringBuffer.append(num[random.nextInt(num.length)]);
                }else{
                    stringBuffer.append(word[random.nextInt(word.length)]);
                }
                flag=!flag;
            }
            return stringBuffer.toString();
        }
}

/*
代码手中走~佛祖心中留！求永无BUG！
                   _ooOoo_
                  o8888888o
                  88" . "88
                  (| -_- |)
                  O\  =  /O
               ____/`---'\____
             .'  \\|     |//  `.
            /  \\|||  :  |||//  \
           /  _||||| -:- |||||-  \
           |   | \\\  -  /// |   |
           | \_|  ''\---/''  |   |
            \  .-\__  `-`  ___/-. /
          ___`. .'  /--.--\  `. . __
       ."" '<  `.___\_<|>_/___.'  >'"".
      | | :  `- \`.;`\ _ /`;.`/ - ` : | |
      \  \ `-.   \_ __\ /__ _/   .-` /  /
 ======`-.____`-.___\_____/___.-`____.-'======
 */
