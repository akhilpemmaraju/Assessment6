package com.example.demo.repo;

import java.util.List;

import com.example.demo.model.Album;

public interface AlbumDAL {
	Album save(Album a);
	
	List<Album> findAll();
	
	Boolean delete(Album a);
	Album findById(String id);
}