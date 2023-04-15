package com.mnf.springbootmongodb.repository;

import com.mnf.springbootmongodb.dto.ToDoDto;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IToDoRepository extends MongoRepository<ToDoDto, String> {
}
