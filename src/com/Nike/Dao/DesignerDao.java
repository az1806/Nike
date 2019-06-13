package com.Nike.Dao;

import java.util.List;

import com.Nike.entity.Designer;

public interface DesignerDao {
	List<Designer> getAllDesigner();
	
	/**
	 * 添加设计师
	 * @param designer_Name 名称
	 * @param designer_Sex	性别
	 * @param designer_About	简介
	 * @param designer_Pic	图片
	 * @returns 数据库受影响行数
	 */
	int	addDesigner(String designer_Name,String designer_Sex,String designer_About,String designer_Pic);
	
	/**
	 * 删除
	 * @param designer_Id 编号
	 * @return	数据库受影响行数
	 */
	int	deletDesignerById(int designer_Id);
	
	Designer updateDesignerById(int designer_Id);
	
	int updatesDesignerById(int designer_Id,String designer_Name,String designer_Sex,String designer_About,String designer_Pic);
}
