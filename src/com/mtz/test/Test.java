/**
 * @Description: TODO
 * @date 2017年10月31日 上午10:41:35 	
 */
package com.mtz.test;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Date;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

/**
 * @author lzc
 *
 */
public class Test {
	public static void main(String[] args) throws Exception{
		  final String url = "jdbc:mysql://127.0.0.1/db_test100W?useUnicode=true&characterEncoding=utf8"; 
	        final String name = "com.mysql.jdbc.Driver"; 
	        final String user = "root"; 
	        final String password = "123456"; 
	        Connection conn = null; 
	        Class.forName(name);//指定连接类型 
	        conn = (Connection) DriverManager.getConnection(url, user, password);//获取连接 
	        if (conn!=null) {
	            System.out.println("获取连接成功");
	            insert(conn);
	        }else {
	            System.out.println("获取连接失败");
	        }
		
	}
	public static void insert(Connection conn){
		int id=1;
        // 开始时间
        Long begin = new Date().getTime();
        // sql前缀
        String prefix = "INSERT INTO tb_test100W (id,name,grade) VALUES ";
        try {
            // 保存sql后缀
            StringBuffer suffix = new StringBuffer();
            // 设置事务为非自动提交
            conn.setAutoCommit(false);
            // 比起st，pst会更好些
            PreparedStatement  pst = (PreparedStatement) conn.prepareStatement("");//准备执行语句
            // 外层循环，总提交事务次数
            for (int i = 1; i <= 100; i++) {
                suffix = new StringBuffer();
                // 第j次提交步长
                for (int j = 1; j <= 10000; j++) {
                    // 构建SQL后缀
                    suffix.append("("+id+",'张三"+id+"','"+(int)(Math.random()*100)+"'),");
                    id++;
                }
                // 构建完整SQL
                String sql = prefix + suffix.substring(0, suffix.length() - 1);
                // 添加执行SQL
                pst.addBatch(sql);
                // 执行操作
                pst.executeBatch();
                // 提交事务
                conn.commit();
                // 清空上一次添加的数据
                suffix = new StringBuffer();
            }
            // 头等连接
            pst.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        // 结束时间
        Long end = new Date().getTime();
        // 耗时
        System.out.println("1000万条数据插入花费时间 : " + (end - begin) / 1000 + " s");
        System.out.println("插入完成");
    }

}
