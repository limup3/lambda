package com.lambda.web.PlayerEntity;

import com.lambda.web.MusicEntity.Music;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlayerRepository extends JpaRepository<Music, Long> {
}
