package com.example.retrofit.data.api

import com.example.retrofit.data.model.artist.ArtistList
import com.example.retrofit.data.model.movie.MovieList
import com.example.retrofit.data.model.tvshow.TvShowList
import com.example.retrofit.data.model.upcomming.UpComingList
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface TMDBService {

    @GET("movie/popular")
    suspend fun getPopularMovies(@Query("api_key") apiKey: String): Response<MovieList>

    @GET("tv/popular")
    suspend fun getPopularTvShows(@Query("api_key") apiKey: String): Response<TvShowList>

    @GET("person/popular")
    suspend fun getPopularArtists(@Query("api_key") apiKey: String): Response<ArtistList>

    @GET("movie/upcoming")
    suspend fun getUpcomingMovies(@Query("api_key") apiKey: String): Response<UpComingList>



}