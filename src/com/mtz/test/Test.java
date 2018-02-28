/**
 * @Description: TODO
 * @date 2017��10��31�� ����10:41:35 	
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
	        Class.forName(name);//ָ���������� 
	        conn = (Connection) DriverManager.getConnection(url, user, password);//��ȡ���� 
	        if (conn!=null) {
	            System.out.println("��ȡ���ӳɹ�");
	            insert(conn);
	        }else {
	            System.out.println("��ȡ����ʧ��");
	        }
		
	}
	public static void insert(Connection conn){
		int id=1;
        // ��ʼʱ��
        Long begin = new Date().getTime();
        // sqlǰ׺
        String prefix = "INSERT INTO tb_test100W (id,name,grade) VALUES ";
        try {
            // ����sql��׺
            StringBuffer suffix = new StringBuffer();
            // ��������Ϊ���Զ��ύ
            conn.setAutoCommit(false);
            // ����st��pst�����Щ
            PreparedStatement  pst = (PreparedStatement) conn.prepareStatement("");//׼��ִ�����
            // ���ѭ�������ύ�������
            for (int i = 1; i <= 100; i++) {
                suffix = new StringBuffer();
                // ��j���ύ����
                for (int j = 1; j <= 10000; j++) {
                    // ����SQL��׺
                    suffix.append("("+id+",'����"+id+"','"+(int)(Math.random()*100)+"'),");
                    id++;
                }
                // ��������SQL
                String sql = prefix + suffix.substring(0, suffix.length() - 1);
                // ���ִ��SQL
                pst.addBatch(sql);
                // ִ�в���
                pst.executeBatch();
                // �ύ����
                conn.commit();
                // �����һ����ӵ�����
                suffix = new StringBuffer();
            }
            // ͷ������
            pst.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        // ����ʱ��
        Long end = new Date().getTime();
        // ��ʱ
        System.out.println("1000�������ݲ��뻨��ʱ�� : " + (end - begin) / 1000 + " s");
        System.out.println("�������");
    }

}
