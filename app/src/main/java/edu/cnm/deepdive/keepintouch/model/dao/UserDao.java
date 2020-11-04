package edu.cnm.deepdive.keepintouch.model.dao;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Update;
import edu.cnm.deepdive.keepintouch.model.entity.IgnoreStatus;
import edu.cnm.deepdive.keepintouch.model.entity.User;
import io.reactivex.Single;
import java.util.Collection;
import java.util.List;

@Dao
public interface UserDao {

  @Insert
  Single<Long> insert (User user);

  @Insert
  Single<List<Long>> insert (User... users);

  @Insert
  Single<List<Long>> insert (Collection<User> users);

  @Update
  Single<Integer> update (User user);

  @Update
  Single<Integer> update (User... users);

  @Update
  Single<Integer> update (Collection<User> users);

  @Delete
  Single<Integer> delete (User user);

  @Delete
  Single<Integer> delete (User... users);

  @Delete
  Single<Integer> delete (Collection<User> users);

  //TODO Make another query
  //@Query("SELECT auto_reply_id, message WHERE userTypeId = :UserTypeId")
  //LiveData<List<IgnoreStatus>> IgnoreStatus(long IgnoreStatus);



}
