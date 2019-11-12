package com.example.demo.model;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("/track")
public class Track {

	@Id
	private String id;
	private String name;
	@DBRef
	private Album album;
	@DBRef
	private List<Artist> artists;
	
	public Track() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Track(String id, String name, Album album, List<Artist> artists) {
		super();
		this.id = id;
		this.name = name;
		this.album = album;
		this.artists = artists;
	}

	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Album getAlbum() {
		return album;
	}

	public void setAlbum(Album album) {
		this.album = album;
	}

	public List<Artist> getArtists() {
		return artists;
	}

	public void setArtists(List<Artist> artists) {
		this.artists = artists;
	}
	
}
