package rs.srb.emir.five;

import rs.srb.emir.five.data.Player;

import java.util.List;

public interface Dao<E> {
   List<E> selectPlayers();
   List<String> findColumnNames();

    void update (E entity);



    void delete (E entity);
    void save (E entity);


}
