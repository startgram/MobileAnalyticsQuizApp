package ru.startgram.mobileanalyticsquizapp

object Constans {

    fun getQuestions(): ArrayList<Question>{
        val questionsList = ArrayList<Question>()

        val que1 = Question(1, "Какой бесплатный аналитический сервис лежит в основе Firebase Analytics?", R.drawable.ma_img_theme,
            "Google Analytics", "AppMetrica", "myTarget", "AppsFlyer", 1)
        questionsList.add(que1)

        val que2 = Question(2, "Аналитика предоставляет неограниченные отчеты по:", R.drawable.ma_img_theme,
            "100 отдельным событиям", "45 отдельным событиям", "500 отдельным событиям", "Без ограничений", 3)
        questionsList.add(que2)

        val que3 = Question(3, "Какое автоматическое событие наступает, когда пользователь нажимает на объявление?", R.drawable.ma_img_theme,
            "ad_impression", "ad_click", "ad_unit_id", "reward_type", 2)
        questionsList.add(que3)

        val que4 = Question(4, "Какое автоматическое событие наступает, когда пользователю показывается объявление?", R.drawable.ma_img_theme,
            "ad_exposure", "reward_value", "firebase_screen", "ad_impression", 4)
        questionsList.add(que4)

        val que5 = Question(5, "Какой параметр назначен в автоматическом событии ad_click?", R.drawable.ma_img_theme,
            "ad_event_id", "ad_unit_id", "firebase_screen_id", "exposure_time", 1)
        questionsList.add(que5)

        val que6 = Question(6, "Какое автоматическое событие наступает, когда в приложении возникает сбой или исключение?", R.drawable.ma_img_theme,
            "reward_type", "app_exception", "reward_value", "app_remove", 2)
        questionsList.add(que6)

        val que7 = Question(7, "Какое автоматическое событие наступает, когда Google Play возвращает средства за покупку в приложении?", R.drawable.ma_img_theme,
            "ad_reward", "app_update", "firebase_campaign", "app_store_refund", 4)
        questionsList.add(que7)

        val que8 = Question(8, "Какое автоматическое событие наступает, когда любое событие в приложении, по какой-либо причине, не удается зарегистрировать", R.drawable.ma_img_theme,
            "app_exception", "notification_dismiss", "error", "first_open", 3)
        questionsList.add(que8)

        val que9 = Question(9, "Какое рекомендованное событие наступает, когда пользователь совершает покупку?", R.drawable.ma_img_theme,
            "ad_exposure", "in_app_purchase", "ad_query", "purchase", 4)
        questionsList.add(que9)

        val que10 = Question(10, "Максимально допустимая длина имени события в Farebase составляет:", R.drawable.ma_img_theme,
            "40 символов", "25 символов", "15 символов", "10 символов", 1)
        questionsList.add(que10)


        return questionsList

    }

}