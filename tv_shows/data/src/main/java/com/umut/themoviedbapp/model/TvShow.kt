package com.umut.themoviedbapp.model

import com.google.gson.annotations.SerializedName

data class TvShow(
    @SerializedName("id") val id: Long?,
    @SerializedName("original_name") val originalName: String?,
    @SerializedName("genre_ids") val genreIds: List<Long>?,
    @SerializedName("name") val name: List<Long>?,
    @SerializedName("popularity") val popularity: Double?,
    @SerializedName("origin_country") val originCountry: List<String>?,
    @SerializedName("vote_count") val coteCount: Long?,
    @SerializedName("first_air_date") val firstAirDate: String?,
    @SerializedName("backdrop_path") val backdropPath: String?,
    @SerializedName("original_language") val originalLanguage: String?,
    @SerializedName("vote_average") val voteAverage: Float?,
    @SerializedName("overview") val overview: String?,
    @SerializedName("poster_path") val posterPath: String?
)