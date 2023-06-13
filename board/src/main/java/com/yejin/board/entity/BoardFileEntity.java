package com.yejin.board.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

// DB와 동일하다.
@Entity
@Getter
@Setter
@Table(name="board_file_table")
public class BoardFileEntity extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // 오토 인크리먼트 PK
    private long id;

    @Column
    private  String originalFileName;

    @Column // null size =255
    private  String storedFileName;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="board_id")
    private BoardEntity boardEntity;

    public static BoardFileEntity toBoardFileEntity(BoardEntity boardEntity, String originalFileName, String storedFileName){
        BoardFileEntity boardFileEntity = new BoardFileEntity();
        boardFileEntity.setOriginalFileName(originalFileName);
        boardFileEntity.setStoredFileName(storedFileName);
        boardFileEntity.setBoardEntity(boardEntity);
        return boardFileEntity;
    }

}

//    @Column
//    private  String boardTitle;
//
//    @Column(length = 500)
//    private  String boardContents;
//
//    @Column
//    private  String boardHits;




