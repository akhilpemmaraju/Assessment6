package com.example.demo.model;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("/album")
public class Album {

	@Id
	private String id;
	private String name;
	@DBRef
	private List<Artist> artists;
	@DBRef
	private List<Track> tracks;
	
	public Album() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Album(String id, String name, List<Artist> artists, List<Track> tracks) {
		super();
		this.id = id;
		this.name = name;
		this.artists = artists;
		this.tracks = tracks;
	}
	
	public String getId() {
		return id;
	}

	public void getId(String id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Artist> getArtists() {
		return artists;
	}

	public void setArtists(List<Artist> artists) {
		this.artists = artists;
	}

	public List<Track> getTracks() {
		return tracks;
	}

	public void setTracks(List<Track> tracks) {
		this.tracks = tracks;
	}
	
}
