package com.lambda.web.soccer;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlayerRepository extends JpaRepository<Player,Long> {

    //interface 추상화 , extends 상속 , <Player,Long> 제네릭/다형성


}
