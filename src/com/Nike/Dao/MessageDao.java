package com.Nike.Dao;

import java.util.List;

import com.Nike.entity.Message;

public interface MessageDao {
		List<Message> getAllMessage();
		/**
		 * 删除留言
		 * @param Id 根据Id删除
		 * @return 返回数据库受影响行数
		 */
		int deleteMessageById(int Id);
		
		/**
		 * 查询
		 * @param mstate 按状态查询
		 * @return
		 */
		List<Message> seachMessage(String state);
		/**
		 * 根据Id查询留言状态
		 * @param Id  
		 * @return
		 */
		Message getMessageById(int Id );
		
		int updateMessageById(int Id, String state);
}
