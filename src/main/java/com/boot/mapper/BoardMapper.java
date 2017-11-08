package com.boot.mapper;

import java.util.List;

import com.boot.domain.BoardVO;

public interface BoardMapper {

	//�� �ۼ�
	public void boardInsert(BoardVO board) throws Exception;
	
	//�� ���
	public List<BoardVO> boardList() throws Exception;
	
	//�ۺ���
    public BoardVO boardView(int bno)throws Exception;
    
    //��ȸ�� ����
    public void hitPlus(int bno)throws Exception;
    
    //�ۼ���
    public void boardUpdate(BoardVO vo)throws Exception;
    
    //�ۻ���
    public void boardDelete(int bno)throws Exception;

}
