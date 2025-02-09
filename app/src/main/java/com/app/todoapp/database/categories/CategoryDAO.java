package com.app.todoapp.database.categories;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;

import com.google.common.util.concurrent.ListenableFuture;

import java.util.List;

@Dao
public interface CategoryDAO {
    @Query("SELECT * FROM Category")
    LiveData<List<Category>> getAll();

    @Query("SELECT* FROM Category where uid = :id")
    LiveData<Category> getById(int id);

    @Query("SELECT* FROM Category where name = :name")
    LiveData<Category> getByName(String name);


    // insert and update combine
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    ListenableFuture<Long> save(Category categories);

    @Delete
    void delete(Category user);
}
