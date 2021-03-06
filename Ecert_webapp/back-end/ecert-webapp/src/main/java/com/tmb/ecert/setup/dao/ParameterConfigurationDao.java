package com.tmb.ecert.setup.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.time.DateFormatUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BatchPreparedStatementSetter;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.tmb.ecert.common.constant.ProjectConstant.APPLICATION_LOG_NAME;
import com.tmb.ecert.common.domain.ParameterConfig;
import com.tmb.ecert.common.domain.RoleVo;
import com.tmb.ecert.setup.vo.Sup01100FormVo;
import com.tmb.ecert.setup.vo.Sup01100Vo;

@Repository
public class ParameterConfigurationDao {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	private static final Logger logger = LoggerFactory.getLogger(APPLICATION_LOG_NAME.ECERT_ROLEMANAGEMENT);
	
	private static String DATE_FORMAT = "yyyy-MM-dd HH:mm:ss.SSS";
	
	public List<ParameterConfig> getParameter(){
		StringBuilder sql = new StringBuilder("");
		List<Object> params = new ArrayList<>();
		
		List<ParameterConfig> list = new ArrayList<ParameterConfig>();
		
		sql.append(" SELECT PARAMETERCONFIG_ID,PROPERTY_NAME,PROPERTY_VALUE,PROPERTY_GROUP FROM ECERT_PARAMETER_CONFIG ");
		
		list = jdbcTemplate.query(sql.toString(), params.toArray(), sup02000RowMapper);
		return list;
		
	}
	
	private  RowMapper<ParameterConfig> sup02000RowMapper = new RowMapper<ParameterConfig>() {

		@Override
		public ParameterConfig mapRow(ResultSet rs, int rowNum) throws SQLException {
			ParameterConfig vo = new ParameterConfig();
			vo.setParameterconfigId(rs.getLong("PARAMETERCONFIG_ID"));
			vo.setPropertyGroup(rs.getString("PROPERTY_GROUP"));
			vo.setPropertyName(rs.getString("PROPERTY_NAME"));
			vo.setPropertyValue(rs.getString("PROPERTY_VALUE"));
			return vo;
		}
		
	};
	
	public void updateParameterConfig(final List<ParameterConfig> listParameter ,String username , String userID) {
		StringBuilder sql = new StringBuilder("");
		sql.append(" UPDATE ECERT_PARAMETER_CONFIG SET  PROPERTY_VALUE = ? , UPDATED_BY_ID = ? , ");
		sql.append(" UPDATED_BY_NAME  = ? , UPDATED_DATETIME = GETDATE()  WHERE  PARAMETERCONFIG_ID = ? ");
		
		jdbcTemplate.batchUpdate(sql.toString(), new BatchPreparedStatementSetter() {
			
			@Override
			public void setValues(PreparedStatement ps, int i) throws SQLException {
				ParameterConfig vo = listParameter.get(i);
				ps.setString(1, StringUtils.trim(vo.getPropertyValue()));
				ps.setString(2, userID);
				ps.setString(3, username);
				ps.setLong(4, vo.getParameterconfigId());
			}
			
			@Override
			public int getBatchSize() {
				return listParameter.size();
			}
			
		});
	}

}
