package com.example.board_vue_back.repository;

import com.example.board_vue_back.entity.Board;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BoardRepository extends JpaRepository<Board, Long> {

}
