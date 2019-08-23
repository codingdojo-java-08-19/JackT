package com.jackt.lookify.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.jackt.lookify.models.Song;

@Repository
public interface SongRepository extends CrudRepository<Song, Long>{
	List<Song> findAll();
	List<Song> findByArtistContaining(String artist);
	List<Song> findTop10ByOrderByRatingDesc();
	Long countByTitleContaining(String search);
	Long deleteByTitleStartingWith(String search);
}
