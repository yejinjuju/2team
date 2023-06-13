package com.yejin.board.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

// DB와 동일하다.
@Entity
@Getter
@Setter
@Table(name="board_table")
public class BoardEntity extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // 오토 인크리먼트 PK
    private long id;

    @Column(length = 20, nullable = false) //not null size =20
    private  String boardWriter;

    @Column // null size =255
    private  String boardPass;

    @Column
    private  String boardTitle;

    @Column(length = 500)
    private  String boardContents;

    @Column
    private  String boardHits;


}
