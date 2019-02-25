package self.dao;

import self.model.Song;

import java.util.List;

public interface SongDao {

    List<Song> getAllSongs();

    List<Song> getByGenre(String genre);

    List<Song> getByReleaseYear(int year);

    List<Song> getByArtist(String artist);
}
