package com.example.buddy_000.magicpos.database.dao;

import android.arch.lifecycle.LiveData;
import com.example.buddy_000.magicpos.database.entity.ProductEntity;
import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;

import java.util.List;

/**
 * Created by buddy_000 on 25-02-2018.
 */

@Dao
public interface ProductDao {
    @Query("SELECT * FROM product where productId = :productId")
    LiveData<List<ProductEntity>> loadProduct(int productId);

    @Query("SELECT * FROM product where productId = :productId")
    List<ProductEntity> loadProductSync(int productId);

    @Query("SELECT * FROM product WHERE barcodeNo = :barcodeNo")
    ProductEntity findByBarcodeNo(long barcodeNo);

    @Insert
    void insertAll(List<ProductEntity> Product);

    @Delete
    void delete(ProductEntity productEntity);

    @Update
    void update(ProductEntity productEntity);
}
