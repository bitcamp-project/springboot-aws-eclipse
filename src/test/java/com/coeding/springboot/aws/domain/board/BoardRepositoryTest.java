package com.coeding.springboot.aws.domain.board;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.TestPropertySource;

@ActiveProfiles("test")
@TestPropertySource(locations = {"classpath:application-test.properties", "classpath:application-test2.yml"} )	
//@TestPropertySource(properties = {"spring.config.location = classpath:application-test2.yml"})
@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class BoardRepositoryTest {

	@Autowired
	BoardRepository boardRepository;
	
	@AfterEach
	public void cleanup() {
		boardRepository.deleteAll();
	}
	
	@Test
	public void readBoard() {
		String title = "test read";
		String content = "test content";
		
		boardRepository.save(Board.builder().title(title).content(content).author("jupiter").build());
		
		List<Board> boardList = boardRepository.findAll();
		
		Board board = boardList.get(0);
		assertThat(board.getTitle()).isEqualTo(title);
		assertThat(board.getContent()).isEqualTo(content);
	}
	

}
