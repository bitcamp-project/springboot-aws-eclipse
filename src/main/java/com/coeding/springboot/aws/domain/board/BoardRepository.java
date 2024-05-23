package com.coeding.springboot.aws.domain.board;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/*
 * @Entity 와 @Repository 를 같은 패키지로 두는 것을 권함
 * 
 */
@Repository
public interface BoardRepository extends JpaRepository<Board, Long>{

}
