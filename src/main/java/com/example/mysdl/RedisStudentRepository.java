package com.example.mysdl;

import org.springframework.data.repository.CrudRepository;

public interface RedisStudentRepository extends CrudRepository<Student, String> {
}
