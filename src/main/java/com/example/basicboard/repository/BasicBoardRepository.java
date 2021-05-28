package com.example.basicboard.repository;

import com.example.basicboard.entity.BasicBoardEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BasicBoardRepository extends JpaRepository<BasicBoardEntity, Integer> {

}
