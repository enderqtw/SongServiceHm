package self.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import self.dao.SongDaoImpl;
import self.model.Song;

import java.util.List;
import java.util.Random;

@Service
public class SongService {

    @Autowired
    public SongDaoImpl dao;

    public List<Song> getSongList() {
        return dao.getAllSongs();
    }

    public List<Song> getSongListByGenre(String genre) {
        return dao.getByGenre(genre);
    }

    public List<Song> getSongListByReleaseYear(int year) {
        return dao.getByReleaseYear(year);
    }

    public List<Song> getSongListByArtist(String artist) {
        return dao.getByArtist(artist);
    }

    public Song getRandomSongByArtist(String artist) {
        List<Song> songs = dao.getByArtist(artist);
        return songs.isEmpty() ? null :
                songs.size() > 1 ? songs.get(new Random().nextInt(songs.size())) : songs.get(0);
    }
}
