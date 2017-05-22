/**
 * <p>Project: 网络管理委员会招新网站, NetUnion Recruit WebSite </p>
 * <p>File: CodeDemo.java</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2017</p>
 * @author 张健顺
 * @email: 1224522500@qq.com
 * @date 2017年5月11日
 */
package com.review;


/**
 * 
 */
public class CodeDemo{

    //构造块
    {
        String str = "构造块";
        System.out.println(str);//此时无法输出，只有在new之后即构造之后才会执行
    }
    
    public CodeDemo(){
        System.out.println("我是构造方法");
    }
  
    //静态块  
    static{
        System.out.println("我是静态块");
    }


    public static void main(String[] args){
    
        CodeDemo code1 = new CodeDemo();
        CodeDemo code2 = new CodeDemo();
    
    
        // 普通代码块
        {
            String str ="abc";
            System.out.println(str);
        }
    }
}
