package com.Nike.Dao;

import java.util.List;


import com.Nike.entity.Message;

public interface MessageDao {
		List<Message> getAllMessage();
		/**
		 * �������
		 * @param Name ����
		 * @param Phone	�绰
		 * @param Emial	�ʼ�
		 * @param Content	����
		 * @return	��Ӱ������
		 */
	/*	int addMessage(String Name,String Phone,String Emial,String Content,String state);*/
		
		/**
		 * ɾ������
		 * @param Id ����Idɾ��
		 * @return �������ݿ���Ӱ������
		 */
		int deleteMessageById(int Id);
		
		
		
		
		/*boolean tianjia(Integer id,String Phone,String Emial,String Content,String state);*/
	

		

		int addMessage(String Name, String Phone, String Emial,
				String Content);

		
		
}
