package com.example.basicboard.service;

import com.example.basicboard.entity.BasicBoardEntity;
import com.example.basicboard.repository.BasicBoardRepository;
import org.springframework.stereotype.Service;

@Service
public class BasicBoardService {

  private final BasicBoardRepository basicBoardRepository;

  public BasicBoardService(BasicBoardRepository basicBoardRepository) {
    this.basicBoardRepository = basicBoardRepository;
  }

  public BasicBoardEntity getBoard(int titleId) {
    return basicBoardRepository.findById(titleId).get();
  }

  public BasicBoardEntity setBoard(BasicBoardEntity board) {
    return basicBoardRepository.save(board);
  }
}
