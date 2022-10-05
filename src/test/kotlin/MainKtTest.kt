import org.junit.Test

import org.junit.Assert.*

class MainKtTest {

    @Test
    fun main() {

    }

        @Test
        fun updateNo() {
            // создаём целевой сервис
            val service = WallService
            // заполняем несколькими постами
            val post1 = Post(
                1,
                1234,
                12345,
                111000,
                12102022,
                "Текст поста",
                12345,
                4444,
                true,
                Comments(500, true, false, false,true),
                Likes(5000, true, true,true),
                Reposts(50, false),
                Views(150),
                "post", //post, copy, reply, postpone, suggest.
                55555,
                true,
                true,
                false,
                true,
                false,
                false,
                1
            )
            val post2 = Post(
                2,
                1234000,
                123400,
                1100,
                101020220,
                "Текст поста",
                12000,
                6000,
                true,
                Comments(6000, true, false, false,true),
                Likes(70007, true, true,true),
                Reposts(500, false),
                Views(650),
                "post", //post, copy, reply, postpone, suggest.
                12000,
                true,
                true,
                false,
                true,
                false,
                false,
                1
            )
            val post3 = Post(
                999,
                123000,
                12000,
                1122,
                12092022,
                "Текст поста",
                88689,
                8888,
                false,
                Comments(888, true, false, false,true),
                Likes(8888, true, true,true),
                Reposts(88, false),
                Views(33),
                "post", //post, copy, reply, postpone, suggest.
                10006,
                true,
                true,
                false,
                true,
                false,
                false,
                1
            )
            val update = Post(
                2666,
                777777,
                777777,
                777777,
                17122022,
                "Update",
                77777777,
                7777777,
                true,
                Comments(777777, true, false, false,true),
                Likes(7777777, true, true,true),
                Reposts(7777777, false),
                Views(7777777),
                "post", //post, copy, reply, postpone, suggest.
                7777777,
                true,
                true,
                false,
                true,
                false,
                false,
                1
            )

            service.add(post1)
            service.add(post2)
            val result = service.update(update)
            assertFalse(result)
        }
    @Test
    fun updateExisting() {
        val service = WallService
        val post1 = Post(
            1,
            12300000,
            123000000,
            111111,
            20112022,
            "Текст поста",
            123000,
            55555,
            true,
            Comments(300, true, false, false,true),
            Likes(3000, true, true,true),
            Reposts(33, false),
            Views(3333),
            "post", //post, copy, reply, postpone, suggest.
            33333,
            true,
            true,
            false,
            true,
            false,
            false,
            1
        )
        val post2 = Post(
            2,
            55555,
            55555,
            55555,
            15122022,
            "Текст поста",
            555555,
            44444,
            true,
            Comments(4444, true, false, false,true),
            Likes(5555, true, true,true),
            Reposts(444, false),
            Views(333),
            "post", //post, copy, reply, postpone, suggest.
            11111,
            true,
            true,
            false,
            true,
            false,
            false,
            1
        )
        val post3 = Post(
            3,
            1234567,
            888888,
            9999,
            15122022,
            "Текст поста",
            123321,
            7777,
            false,
            Comments(5555, true, false, false,true),
            Likes(4444, true, true,true),
            Reposts(333, false),
            Views(222),
            "post", //post, copy, reply, postpone, suggest.
            88888,
            true,
            true,
            false,
            true,
            false,
            false,
            1
        )
        val update = Post(
            2,
            911911,
            119119,
            7777777,
            12122022,
            "Update",
            7777777,
            7777777,
            true,
            Comments(77777777, true, false, false,true),
            Likes(77777777, true, true,true),
            Reposts(77777777, false),
            Views(77777777),
            "post", //post, copy, reply, postpone, suggest.
            77777777,
            true,
            true,
            false,
            true,
            false,
            false,
            1
        )
        service.add(post1)
        service.add(post2)
        val result = service.update(update)
        assertTrue(result)
    }

    @Test
        fun add() {
            val service = WallService
            val postNew = service.add(
                Post(
                    111,
                    12345,
                    12345,
                    111111,
                    120920221433,
                    "Текст поста",
                    12345,
                    6765,
                    true,
                    Comments(300, true, false, false, true),
                    //Copyright(23452784, "dfdfdsf","Текст","тип"),
                    Likes(400, true, true, true),
                    Reposts(200, false),
                    Views(20000),
                    "post", //post, copy, reply, postpone, suggest.
                    12345,
                    true,
                    true,
                    false,
                    true,
                    false,
                    false,
                    //Donut(true, 223,"placeholder", true, "all"),
                    1
                )
            )
            assertTrue(postNew.id > 0)
        }
    }


