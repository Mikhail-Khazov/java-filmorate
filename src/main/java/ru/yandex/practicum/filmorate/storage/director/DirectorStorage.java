package ru.yandex.practicum.filmorate.storage.director;

import ru.yandex.practicum.filmorate.model.Director;
import ru.yandex.practicum.filmorate.model.Film;

import java.util.List;
import java.util.Optional;

public interface DirectorStorage {
    Director create(Director director);

    int update(Director director);

    Optional<Director> get(int directorId);

    List<Director> getAll();

    boolean delete(int directorId);

    void setDirectors(List<Film> films);
}
