package com.codegym.songinfovalidation.repository;

import com.codegym.songinfovalidation.model.Song;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ISongRepository extends JpaRepository<Song,Long> {
}
