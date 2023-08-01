package kh.test.jdbckh.department.test.service;

import java.sql.Connection;
import java.util.List;

import kh.test.jdbckh.department.test.model.TestDao;
import kh.test.jdbckh.department.test.vo.TestVo;
import static kh.test.jdbckh.common.jdbc.JdbcTemplate.*;	//템플릿 임포트 해야 getconntion 가능


public class TestService {
	TestDao dao = new TestDao();
	
	public TestVo selectOne(String departmentNo ) { 
		TestVo result=null;		//자료형 맞춰주고
		Connection conn = getConnection();
		result = dao.selectOne(conn,departmentNo );
		close(conn);
		return result;
	}
	public List<TestVo> selectAll( ) { 
		List<TestVo>  result=null;		//자료형 맞춰주고
		Connection conn = getConnection();
		result = dao.selectAll(conn);
		close(conn);
		return result;
	}
}
