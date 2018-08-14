package com.example.sackerman.popularmovies.Data;

import android.net.Uri;
import android.provider.BaseColumns;

public class Contract {

    /*Table building for Uri */
    private static final String SCHEME = "content";
    private static final String AUTHORITY = "com.example.sackerman.popularmovies";
    private static final Uri URI_BASE = Uri.parse(SCHEME + "://" + AUTHORITY);
    private static final String MOVIE_TABLE_PATH = "movie";
    private static final String COLLECTION_TABLE_PATH = "collection";
    private static final String POPULARITY_TABLE_PATH = "popular";
    private static final String RATING_TABLE_PATH = "rating";

    /*Creating and Updating w/ name and version version number. */
    public static final String MOVIES_DATABASE = "moviesMainDatabase";
    public static final Integer DATABASE_VERSION = 1;

    /*Queries the Table from the Content Provider */

    /*Names of Each Table: */
    public static final String MOVIE_NAME_TABLE = "movie";
    public static final String COLLECTION_TABLE = "collection";
    public static final String POPULARITY_TABLE = "popular";
    public static final String RATING_TABLE = "rating";

}

    final class EntryBaseColumns implements BaseColumns {

    /*----Column Name References */
        public static final String VOTE_COUNT_COLUMN = "vote_count";
        public static final String MOVIE_ID_COLUMN = "movieId";
        public static final String VIDEO_STATUS_COLUMN = "video";
        public static final String USER_VOTE_AVERAGE_COLUMN = "vote_average";
        public static final String TITLE_COLUMN = "title";
        public static final String POPULARITY_COLUMN = "popularity";
        public static final String POSTER_PATH_COLUMN = "poster_path";
        public static final String ORIGINAL_LANGUAGE_COLUMN = "original_language";
        public static final String ORIGINAL_TITLE_COLUMN = "original_title";
        public static final String GENRE_ID_COLUMN = "genre_ids";
        public static final String BACKDROP_PATH_COLUMN = "backdrop_path";
        public static final String ADULT_COLUMN = "adult";
        public static final String OVERVIEW_COLUMN = "overview";
        public static final String RELEASE_DATE_COLUMN = "release_date";
        public static final String REVIEWS_COLUMN = "reviews";
        public static final String VIDEOS_COLUMN = "videos";

        /*----Table Column Index Numbers */

        // Table column indeces
        public static final int MOVIE_ID_COLUMN_INDEX = 0;
        public static final int VOTE_COUNT_COLUMN_INDEX = 1;
        public static final int VIDEO_STATUS_COLUMN_INDEX = 2;
        public static final int VOTE_AVERAGE_COLUMN_INDEX = 3;
        public static final int TITLE_COLUMN_INDEX = 4;
        public static final int POPULARITY_COLUMN_INDEX = 5;
        public static final int POSTER_PATH_COLUMN_INDEX = 6;
        public static final int ORIGINAL_LANGUAGE_COLUMN_INDEX = 7;
        public static final int ORIGINAL_TITLE_COLUMN_INDEX = 8;
        public static final int ADULT_COLUMN_INDEX = 10;
        public static final int OVERVIEW_COLUMN_INDEX = 11;
        public static final int RELEASE_DATE_COLUMN_INDEX = 12;
        public static final int REVIEWS_COLUMN_INDEX = 13;
        public static final int VIDEOS_COLUMN_INDEX = 14;


}//End EntryBaseColumns class.
