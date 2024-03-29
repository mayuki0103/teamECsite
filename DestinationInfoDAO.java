package com.internousdev.oregon.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.internousdev.oregon.dto.DestinationInfoDTO;
import com.internousdev.oregon.util.DBConnector;

public class DestinationInfoDAO {

	public int insert (String userId, String familyName, String firstName, String familyNameKana,
			String firstNameKana, String email, String telNumber, String userAddress){
		DBConnector db = new DBConnector();
		Connection con = db.getConnection();
		int count = 0;
		String sql = "insert into destination_info"
				+ "(user_id, family_name, first_name, family_name_kana, first_name_kana, email, tel_number, user_address, regist_date, update_date)"
				+ "values(?,?,?,?,?,?,?,?,now(),now())";
		try {
			PreparedStatement preparedStatement = con.prepareStatement(sql);
			preparedStatement.setString(1,userId);
			preparedStatement.setString(2,familyName);
			preparedStatement.setString(3,firstName);
			preparedStatement.setString(4,familyNameKana);
			preparedStatement.setString(5,firstNameKana);
			preparedStatement.setString(6,email);
			preparedStatement.setString(7,telNumber);
			preparedStatement.setString(8,userAddress);
			count = preparedStatement.executeUpdate();
		}catch(SQLException e){
			e.printStackTrace();
		}finally{
			try{
				con.close();
			}catch(SQLException e){
				e.printStackTrace();
			}
		}
		return count;
	}

	public List<DestinationInfoDTO> getDestinationInfo(String userId){
		DBConnector db = new DBConnector();
		Connection con = db.getConnection();
		List<DestinationInfoDTO> destinationInfoDTOList = new ArrayList<DestinationInfoDTO>();

		String sql = "SELECT id, family_name, first_name, family_name_kana, first_name_kana, user_address, tel_number, email "
				+ "FROM destination_info WHERE user_id = ?";

		try{
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1,userId);
			ResultSet rs = ps.executeQuery();

			while(rs.next()){
				DestinationInfoDTO destinationInfoDTO = new DestinationInfoDTO();
				destinationInfoDTO.setId(rs.getInt("id"));
				destinationInfoDTO.setFamilyName(rs.getString("family_name"));
				destinationInfoDTO.setFirstName(rs.getString("first_name"));
				destinationInfoDTO.setFamilyNameKana(rs.getString("family_name_kana"));
				destinationInfoDTO.setFirstNameKana(rs.getString("first_name_kana"));
				destinationInfoDTO.setUserAddress(rs.getString("user_address"));
				destinationInfoDTO.setEmail(rs.getString("email"));
				destinationInfoDTO.setTelNumber(rs.getString("tel_number"));
				destinationInfoDTOList.add(destinationInfoDTO);
			}
		}catch(SQLException e){
			e.printStackTrace();
		}finally{
			try{
				con.close();
			}catch(SQLException e){
				e.printStackTrace();
			}
		}
		return destinationInfoDTOList;
	}

	public int deleteDestination(String id){
		DBConnector db = new DBConnector();
		Connection con = db.getConnection();

		String sql = "DELETE FROM destination_info WHERE id = ?";
		int count = 0;
		try{
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, id);
			count = ps.executeUpdate();

		}catch(SQLException e){
			e.printStackTrace();
		}finally{
			try{
				con.close();
			}catch(SQLException e){
				e.printStackTrace();
			}
		}
		return count;
	}

}
