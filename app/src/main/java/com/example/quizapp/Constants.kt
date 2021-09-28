package com.example.quizapp

object Constants{

    const val USER_NAME: String = "user_name"
    const val TOTAL_QUESTIONS: String = "total_question"
    const val CORRECT_ANSWERS: String = "correct_answers"

    fun  getQuestions(): ArrayList<Question>{

        val questionsList = ArrayList<Question>()

        val que1 = Question(1, "어느 나라의 국기 일까요 ?",
            R.drawable.ic_flag_of_korea,
            "대한민국","일본",
            "프랑스","미국", 1
        )

        questionsList.add(que1)

        val que2 = Question(
            2, "어느 나라 국기 일까요?",
            R.drawable.ic_flag_of_australia,
            "뉴질랜드", "호주",
            "멕시코", "북한", 2
        )

        questionsList.add(que2)

        // 3
        val que3 = Question(
            3, "어느 나라 국기 일까요?",
            R.drawable.ic_flag_of_china,
            "미국", "체코",
            "케냐", "중국", 4
        )

        questionsList.add(que3)

        // 4
        val que4 = Question(
            4, "어느 나라 국기 일까요?",
            R.drawable.ic_flag_of_england,
            "일본", "영국",
            "캐나다", "피지", 2
        )

        questionsList.add(que4)

        // 5
        val que5 = Question(
            5, "어느 나라 국기 일까요?",
            R.drawable.ic_flag_of_france,
            "가봉", "핀란드",
            "프랑스", "가나", 3
        )

        questionsList.add(que5)

        // 6
        val que6 = Question(
            6, "어느 나라 국기 일까요?",
            R.drawable.ic_flag_of_italy,
            "이탈리아", "조지아",
            "그리스", "필리핀", 1
        )

        questionsList.add(que6)

        // 7
        val que7 = Question(
            7, "어느 나라 국기 일까요?",
            R.drawable.ic_flag_of_japan,
            "미국", "인도",
            "일본", "이집트", 3
        )

        questionsList.add(que7)

        // 8
        val que8 = Question(
            8, "어느 나라 국기 일까요?",
            R.drawable.ic_flag_of_mexico,
            "스웨덴", "이란",
            "헝가리", "멕시코", 4
        )

        questionsList.add(que8)

        // 9
        val que9 = Question(
            9, "어느 나라 국기 일까요?",
            R.drawable.ic_flag_of_russia,
            "대만", "러시아",
            "벨라루시", "홍콩", 2
        )

        questionsList.add(que9)

        // 10
        val que10 = Question(
            10, "어느 나라 국기 일까요?",
            R.drawable.ic_flag_of_usa,
            "미국", "카메룬",
            "수단", "대한민국", 1
        )

        questionsList.add(que10)

        return questionsList
    }

}