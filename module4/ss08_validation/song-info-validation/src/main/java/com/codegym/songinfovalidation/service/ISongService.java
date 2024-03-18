package com.codegym.songinfovalidation.service;

import com.codegym.songinfovalidation.model.Song;

import java.util.List;

public interface ISongService {
    List<Song> findALl();
    void save(Song song);
}
