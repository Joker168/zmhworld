package com.recursive.service;

import java.util.Iterator;
import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.recursive.mapper.InfoVOMapper;
import com.recursive.pojo.InfoVO;

@Service
public class QuerySalonInfoService {
	
	@Autowired
	private InfoVOMapper infoVoMapper;
	
	/**
	 * 根据拜访状态查询美容院信息
	 * @param salonIntention
	 * @param limit
	 * @param offset
	 * @return
	 */
	public List<InfoVO> selectInfoBySalonIntention(String salonIntention,Integer offset,Integer limit){
		return infoVoMapper.selectInfoBySalonIntention(Byte.valueOf(salonIntention), offset, limit);
	}
	
//	public static void main(String[] args) {
//		String salonIntention = "1";
//		QuerySalonInfoService service = new QuerySalonInfoService();
//		List<InfoVO> list = service.selectInfoBySalonIntention(Byte.valueOf(salonIntention), 0, 4);
//		for (InfoVO infoVO : list) {
//			System.out.println("infoVO:"+infoVO);
//		}
//	}
	
	
	
}
