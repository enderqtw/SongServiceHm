DROP TABLE IF EXISTS song;

CREATE TABLE song(
  name VARCHAR(512) NOT NULL,
  artist VARCHAR(512) NOT NULL,
  release_year INT NOT NULL,
  genre VARCHAR(512)
);
