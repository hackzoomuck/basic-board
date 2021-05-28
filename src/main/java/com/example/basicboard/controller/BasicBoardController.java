package com.example.basicboard.controller;

import com.example.basicboard.service.BasicBoardService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class BasicBoardController {

  private static final Logger LOGGER = LoggerFactory.getLogger(BasicBoardController.class);
  private final BasicBoardService basicBoardService;

  public BasicBoardController(BasicBoardService basicBoardService) {
    this.basicBoardService = basicBoardService;
  }

  @GetMapping("/")
  public String home() {
    LOGGER.debug("Request: /");
    return "home";
  }

  @GetMapping("/bodytest/{titleId}")
  public String bodyTest(@PathVariable("titleId") int titleId) {
    var entity = basicBoardService.getBoard(titleId);
    LOGGER.debug("FOUND ENTITY: {}", entity);

    return "home";
  }
}
