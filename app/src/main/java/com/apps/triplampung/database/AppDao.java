package com.apps.triplampung.database;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;

import java.util.List;

@Dao
public interface AppDao {

    //List Tempat Wisata
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void addIdWisata(WisataEntity wisataEntity);

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void addWisata(WisataEntity wisataEntity);

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void addInfoWisata(WisataEntity wisataEntity);

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void addLokasiWisata(WisataEntity wisataEntity);

    @Query("SELECT * FROM table_wisata")
    WisataEntity[] showWisata();

    //Detail Wisata
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void addDetailPuncakMas(DetailWisataEntity detailWisataEntity);

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void addDetailPahwang(DetailWisataEntity detailWisataEntity);

    @Query("SELECT * FROM table_detail_wisata")
    List<DetailWisataEntity> showImage();

    // Gallery Entity
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void addImageGallery(GalleryEntity galleryEntity);

    @Query("SELECT * FROM table_gallery")
    List<GalleryEntity> showImageGallery();
}
