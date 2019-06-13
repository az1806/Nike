package com.Nike.Dao;

import java.util.List;


import com.Nike.entity.Message;

public interface MessageDao {
		List<Message> getAllMessage();
		/**
		 * 添加留言
		 * @param Name 名称
		 * @param Phone	电话
		 * @param Emial	邮件
		 * @param Content	内容
		 * @return	受影响行数
		 */
	/*	int addMessage(String Name,String Phone,String Emial,String Content,String state);*/
		
		/**
		 * 删除留言
		 * @param Id 根据Id删除
		 * @return 返回数据库受影响行数
		 */
		int deleteMessageById(int Id);
		
		
		
		
		/*boolean tianjia(Integer id,String Phone,String Emial,String Content,String state);*/
	

		

		int addMessage(String Name, String Phone, String Emial,
				String Content);

		
		
}
