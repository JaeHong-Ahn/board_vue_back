package com.example.board_vue_back.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

import static jakarta.persistence.GenerationType.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name="board")
@Entity
public class Board {
    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Long idx;

    @Column
    private String title;

    @Column
    private String contents;

    @Column
    private String author;

    @Column
    private LocalDateTime createdAt;
}