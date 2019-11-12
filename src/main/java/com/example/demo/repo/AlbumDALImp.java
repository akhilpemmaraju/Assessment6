package com.example.demo.repo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Album;

@Repository
public class AlbumDALImp implements AlbumDAL{
	
	@Autowired
	private MongoTemplate mongo;
	
	@Override
	public List<Album> findAll(){
		return mongo.findAll(Album.class);
	}
	
	@Override
	public Album save(Album alb){
		return mongo.save(alb);
	}

	@Override
	public Boolean delete(Album a) {
		// TODO Auto-generated method stub
		return mongo.remove(a).wasAcknowledged();
	}

	@Override
	public Album findById(String id) {
		// TODO Auto-generated method stub
		return mongo.findAndRemove(new Query(Criteria.where("id").is(id)), Album.class);
	}
	
}