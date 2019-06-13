package com.Nike.Dao;

import java.util.List;

import com.Nike.entity.Message;

public interface MessageDao {
		List<Message> getAllMessage();
		/**
		 * ɾ������
		 * @param Id ����Idɾ��
		 * @return �������ݿ���Ӱ������
		 */
		int deleteMessageById(int Id);
		
		/**
		 * ��ѯ
		 * @param mstate ��״̬��ѯ
		 * @return
		 */
		List<Message> seachMessage(String state);
		/**
		 * ����Id��ѯ����״̬
		 * @param Id  
		 * @return
		 */
		Message getMessageById(int Id );
		
		int updateMessageById(int Id, String state);
}
