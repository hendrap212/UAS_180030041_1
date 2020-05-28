package com.aa183.pranata;


import java.util.List;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface ApiInterface {

    @POST("get_books.php")
    Call<List<Books>> getBooks();

    @FormUrlEncoded
    @POST("add_book.php")
    Call<Books> insertBook(
            @Field("key") String key,
            @Field("name") String name,
            @Field("cerita") String cerita,
            @Field("genre") String genre,
            @Field("status") int status,
            @Field("tanggal") String tanggal,
            @Field("picture") String picture);

    @FormUrlEncoded
    @POST("update_book.php")
    Call<Books> updateBook(
            @Field("key") String key,
            @Field("id") int id,
            @Field("name") String name,
            @Field("cerita") String cerita,
            @Field("genre") String genre,
            @Field("status") int status,
            @Field("tanggal") String tanggal,
            @Field("picture") String picture);

    @FormUrlEncoded
    @POST("delete_book.php")
    Call<Books> deleteBook(
            @Field("key") String key,
            @Field("id") int id,
            @Field("picture") String picture);

    @FormUrlEncoded
    @POST("update_cek.php")
    Call<Books> updateCek(
            @Field("key") String key,
            @Field("id") int id,
            @Field("cek") boolean cek);

}

