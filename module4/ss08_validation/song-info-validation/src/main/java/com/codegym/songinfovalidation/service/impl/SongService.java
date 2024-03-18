package com.codegym.songinfovalidation.service.impl;

import com.codegym.songinfovalidation.model.Song;
import com.codegym.songinfovalidation.repository.ISongRepository;
import com.codegym.songinfovalidation.service.ISongService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SongService implements ISongService {
    @Autowired
    private ISongRepository songRepository;
    @Override
    public List<Song> findALl() {
        return songRepository.findAll();
    }

    @Override
    public void save(Song song) {
        songRepository.save(song);
    }
}
