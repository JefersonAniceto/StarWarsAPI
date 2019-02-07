package jefersonaniceto.starwars.android.modelo.API


import android.database.Observable
import retrofit2.http.GET
import retrofit2.http.Path

interface
StarWarsApiDef {
    @GET("films")
    fun listMoves() : android.database.Observable<FilmResult>

    @GET("people/{personId}")
    fun loadPerson(@Path("personId") personId : String) : android.database.Observable<Person>
}
