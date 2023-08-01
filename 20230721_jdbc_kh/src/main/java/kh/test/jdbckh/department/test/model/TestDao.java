package kh.test.jdbckh.department.test.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import kh.test.jdbckh.department.model.dto.DepartmentDto;
import kh.test.jdbckh.department.test.vo.TestVo;
import static kh.test.jdbckh.common.jdbc.JdbcTemplate.*;

public class TestDao {
	public TestVo selectOne(Connection conn, String departmentNo) {
		TestVo result =null;
		String query ="select DEPARTMENT_NO, DEPARTMENT_NAME, CATEGORY, OPEN_YN, CAPACITY from tb_department"
				+ " where Department_No=?";
		PreparedStatement pstmt =null;
		ResultSet rs  =null;
		try {
			pstmt= conn.prepareStatement(query);
			pstmt.setString(1,departmentNo);
			rs=pstmt.executeQuery();
			
			if(rs.next()) {
				result = new TestVo(rs.getString("DEPARTMENT_NO"), 
						rs.getString("DEPARTMENT_NAME"), 
						rs.getString("CATEGORY"), 
						rs.getString("OPEN_YN"), 
						rs.getInt("CAPACITY"));
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			close(rs);
			close(pstmt);
		}
		
		
		
		return result;
	}
}
