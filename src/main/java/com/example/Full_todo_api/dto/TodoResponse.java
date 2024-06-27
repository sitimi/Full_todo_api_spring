package com.example.Full_todo_api.dto;
import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Data;

@Data
public class TodoResponse {
	Integer id;
	String title;
	String text;
	String status;
	@JsonFormat(pattern="yyyy/MM/dd HH:mm:ss")
	LocalDateTime dueDate;
//	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	@JsonFormat(pattern="yyyy/MM/dd HH:mm:ss")
	LocalDateTime createdAt;
//	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	@JsonFormat(pattern="yyyy/MM/dd HH:mm:ss")
	LocalDateTime updatedAt;
}
