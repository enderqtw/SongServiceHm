package self.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Service;
import self.model.Song;

import java.sql.ResultSet;
import java.util.List;

@Service
public class SongDaoImpl implements SongDao {

    @Autowired
    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    public List<Song> getAllSongs() {
        return namedParameterJdbcTemplate.query("SELECT * FROM song",
                (ResultSet rs, int rowNum) -> {
                    Song song = new Song();
                    song.setName(rs.getString("name"));
                    song.setArtist(rs.getString("artist"));
                    song.setReleaseYear(rs.getInt("release_year"));
                    song.setGenre(rs.getString("genre"));
                    return song;
                });
    }

    @Override
    public List<Song> getByGenre(String genre) {
        String sql = String.format("SELECT * FROM song WHERE genre='%s'", genre);
        return namedParameterJdbcTemplate.query(sql,
                (ResultSet rs, int rowNum) -> {
                    Song song = new Song();
                    song.setName(rs.getString("name"));
                    song.setArtist(rs.getString("artist"));
                    song.setReleaseYear(rs.getInt("release_year"));
                    song.setGenre(rs.getString("genre"));
                    return song;
                });
    }

    @Override
    public List<Song> getByReleaseYear(int year) {
        String sql = String.format("SELECT * FROM song WHERE release_year=%s", year);
        return namedParameterJdbcTemplate.query(sql,
                (ResultSet rs, int rowNum) -> {
                    Song song = new Song();
                    song.setName(rs.getString("name"));
                    song.setArtist(rs.getString("artist"));
                    song.setReleaseYear(rs.getInt("release_year"));
                    song.setGenre(rs.getString("genre"));
                    return song;
                });
    }

    @Override
    public List<Song> getByArtist(String artist) {
        String sql = String.format("SELECT * FROM song WHERE artist='%s'", artist);
        return namedParameterJdbcTemplate.query(sql,
                (ResultSet rs, int rowNum) -> {
                    Song song = new Song();
                    song.setName(rs.getString("name"));
                    song.setArtist(rs.getString("artist"));
                    song.setReleaseYear(rs.getInt("release_year"));
                    song.setGenre(rs.getString("genre"));
                    return song;
                });
    }
}
