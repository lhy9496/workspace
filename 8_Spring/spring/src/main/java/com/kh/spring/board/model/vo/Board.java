package com.kh.spring.board.model.vo;

import java.sql.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Board {
	private String boardNo;
	private String boardTitle;
	private String boardContent;
	private String boardWriter;
	private String count;
	private Date createDate;
	private String status;
}
