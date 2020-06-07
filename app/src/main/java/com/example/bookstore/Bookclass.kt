package com.example.bookstore

import com.example.bookstore.R.drawable.*

data class Bookclass(val DisplayImage : Int, val Bookname : String, val Cost : String){
    object Bookstore {
        val result = listOf<Bookclass>(
            Bookclass(
                diary_of_a_young_girl,
                "Diary Of A Young Girl",
                "$10"
            ),
            Bookclass(
                nineteeneightyfour,
                "1984",
                "$12"
            ),
            Bookclass(
                lordoftherings,
                "Lord Of The Rings",
                "$18"
            ),
            Bookclass(
                thegreatgatsby_1925,
                "The Great Gatsby 1925",
                "$9"
            ),
            Bookclass(
                to_kill_a_mockingbird_1961,
                "To Kill A Mockingbird 1961",
                "$13"
            ),
            Bookclass(
                harry_potter,
                "Harry Potter and the Philosopher's Stone",
                "$10"
            ),
            Bookclass(
                five_am_club,
                "5 am Club",
                "$20"
            ),
            Bookclass(
                failing_forward_turning_mistakes_into_stepping_stones_for_successjpg,
                " Failing Forward : Turning Mistakes Into Stepping stones For Success",
                "$17"
            ),
            Bookclass(
                mans_search_for_meaning,
                "Man's Search For Meaning",
                "$29"
            ),
            Bookclass(
                love_yourse_if_like_your_life_depends_on_it,
                "Love Yourself If Like Your Life Depends on it",
                "$10"
            ),
            Bookclass(
                richdadpoordad,
                "Rich Dad Poor Dad",
                "$26"
            ),
            Bookclass(
                think_and_grow_rich,
                "Think And Grow Rich",
                "$36"
            ),
            Bookclass(
                simplify,
                "Simplify",
                "$19"
            ),
            Bookclass(
                the_last_lecture,
                "The Last Lecture",
                "$14"
            ),
            Bookclass(
                thepowerofnow,
                "The Power Of Now",
                "$10"
            ),
            Bookclass(
                the_spiritual_diaries,
                "The Spiritual Diaries",
                "$17"
            )

            )
    }
}