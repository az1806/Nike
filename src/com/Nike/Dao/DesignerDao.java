package com.Nike.Dao;

import java.util.List;

import com.Nike.entity.Designer;

public interface DesignerDao {
	List<Designer> getAllDesigner();
	
	/**
	 * ������ʦ
	 * @param designer_Name ����
	 * @param designer_Sex	�Ա�
	 * @param designer_About	���
	 * @param designer_Pic	ͼƬ
	 * @returns ���ݿ���Ӱ������
	 */
	int	addDesigner(String designer_Name,String designer_Sex,String designer_About,String designer_Pic);
	
	/**
	 * ɾ��
	 * @param designer_Id ���
	 * @return	���ݿ���Ӱ������
	 */
	int	deletDesignerById(int designer_Id);
	
	Designer updateDesignerById(int designer_Id);
	
	int updatesDesignerById(int designer_Id,String designer_Name,String designer_Sex,String designer_About,String designer_Pic);
}
