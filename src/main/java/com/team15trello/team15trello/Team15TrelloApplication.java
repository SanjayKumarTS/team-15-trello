package com.team15trello.team15trello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Team15TrelloApplication {

	public static void main(String[] args) {
		SpringApplication.run(Team15TrelloApplication.class, args);
	}

}


//Tables:
//
//		user:
//
//		id: Primary Key
//		firstname: String
//		lastnamename: String
//		username: String (Unique)

//		task:
//		id: Primary Key
//		state: Enum (TODO, ASSIGNED, DOING, DONE)
//		createdBy: ForeignKey -> user.id
//		assignedTo: ForeignKey -> user.id
//		description: Text
//		estimationPeriod: Number
//		creationTime: DateTime
//		assignedTime: DateTime
//		lastModifiedTime: DateTime
//		finishedTime: DateTime

//		comment:
//		id: Primary Key
//		taskId: ForeignKey -> task.id
//		text: Text