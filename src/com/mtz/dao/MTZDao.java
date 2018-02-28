package com.mtz.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import com.mtz.po.MTZ;
import com.mtz.util.DBManager;

public class MTZDao {
	private Connection conn;
	private Statement st;
	private PreparedStatement ps;
	private ResultSet rs;
	
	public  void addMtz(MTZ mtz){
		try {
			conn=DBManager.getConn();
			String sql="insert into tb_mtz(time,grade,state)values(?,?,?)";
			ps=conn.prepareStatement(sql);
			ps.setString(1, mtz.getTime());
			ps.setString(2, mtz.getGrade());
			ps.setString(3, mtz.getState());
			ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			DBManager.close(conn, ps, rs);
		}
	}
	
	public List<MTZ> findAll(){
		List<MTZ> mtzs =new ArrayList<MTZ>(); 
		try {
			conn=DBManager.getConn();
			String sql="select * from tb_mtz";
			st=conn.createStatement();
			rs=st.executeQuery(sql);
			while(rs.next()){
				int id=rs.getInt("id");
				String time=rs.getString("time");
				String grade=rs.getString("grade");
				String state=null;
				if(rs.getString("state").equals("0")){
					 state="��Ϸ�ɹ�";
				}else {
					 state="��Ϸʧ��";
				}
				MTZ mtz = new MTZ(id, time, grade, state);
				mtzs.add(mtz);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			DBManager.close(conn, st, rs);
		}
		return mtzs;
	}
	
}
