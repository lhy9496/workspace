package com.kh.boot.service;

import com.kh.boot.domain.dto.BoardRequest;

import com.kh.boot.domain.entity.Board;
import com.kh.boot.mapper.BoardMapper;
import com.kh.boot.repository.BoardRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Service
@RequiredArgsConstructor
public class BoardServiceImpl implements BoardService{

    private final BoardMapper boardMapper;

    private final BoardRepository boardRepository;

    @Override
    public Boolean create(BoardRequest.CreateDTO request) throws Exception{

        if(request == null || request.getUserId() == null || request.getPwd() == null){
            throw new RuntimeException("check value");
        }

        /*
            @Builder를 객체에 추가하면 빌더 클래스가 자동으로 생성되어 객체 생성을 보다 편리하게 할 수 있다.
            객체가 가질 필드들을
         */

        //Mybatis Mapper 사용해서 insert하기
        try {
            Board board = Board.builder()
                    .title(request.getTitle())
                    .pwd(request.getPwd())
                    .contents(request.getContents())
                    .userId(request.getUserId())
                    .build();
            boardRepository.save(board);
        } catch (Exception e){
            e.printStackTrace();
            throw new RuntimeException("BoardCreateError");
        }

        return true;
    }
}
