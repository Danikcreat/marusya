theme: /

    state: newNode_1
        a:  Привет вездекодерам!
            Чтобы начать тест напишите Начать || tts = "Привет вездекодерам!\nЧтобы начать тест напишите Начать", ttsEnabled = true
        go!: /newNode_2
    @IntentGroup
        {
          "boundsTo" : "/newNode_1",
          "actions" : [ {
            "buttons" : [ ],
            "type" : "buttons"
          } ],
          "global" : false
        }
    state: newNode_2
        state: 1
            intent: /newNode_2/1

            go!: /newNode_1

        state: 2
            intent: /newNode_2/2

            go!: /newNode_4
        init:
            $jsapi.bind({
                type: "postProcess",
                path: "/newNode_2",
                name: "newNode_2 buttons",
                handler: function($context) {
                }
            });

    state: newNode_4
        a:  Погнали!
            Первый вопрос: UX/UI - это:
            1)Пользовательский опыт и интерфейс
            2)Язык программирования || tts = "Погнали!\nПервый вопрос: юикс юай - это:\nПользовательский опыт и интерфейс \nили\nЯзык программирования", ttsEnabled = true
        go!: /newNode_3
    @IntentGroup
        {
          "boundsTo" : "/newNode_4",
          "actions" : [ {
            "buttons" : [ ],
            "type" : "buttons"
          } ],
          "global" : false
        }
    state: newNode_3
        state: 1
            intent: /newNode_3/1

            go!: /newNode_5

        state: 2
            intent: /newNode_3/2

            go!: /newNode_6
        init:
            $jsapi.bind({
                type: "postProcess",
                path: "/newNode_3",
                name: "newNode_3 buttons",
                handler: function($context) {
                }
            });

    state: newNode_13
        a:  Какой тег из следующих существует:
            1)pr
            2)code
            3)quote || tts = "Какой тег из следующих существует", ttsEnabled = true
        go!: /newNode_15
    @IntentGroup
        {
          "boundsTo" : "/newNode_13",
          "actions" : [ {
            "buttons" : [ ],
            "type" : "buttons"
          } ],
          "global" : false
        }
    state: newNode_15
        state: 1
            intent: /newNode_15/1

            go!: /newNode_17

        state: 2
            intent: /newNode_15/2

            go!: /newNode_16

        state: 3
            intent: /newNode_15/3

            go!: /newNode_17
        init:
            $jsapi.bind({
                type: "postProcess",
                path: "/newNode_15",
                name: "newNode_15 buttons",
                handler: function($context) {
                }
            });

    state: newNode_5
        a:  Поздравляю!
            Вы ответили правильно, поэтому советую вам категорию "Дизайн интерфейсов" || tts = "Поздравляю!\nВы ответили правильно, поэтому советую вам категорию \"Дизайн интерфейсов\"\nВы можете пройти тест заново или создать команду для участия в вездекоде.", ttsEnabled = true
        buttons:
            "Заново" -> /newNode_4
            "Создать команду" -> /newNode_12

    state: newNode_6
        a:  Следующий вопрос: Что такое статическая мощность?
            1)Вероятность отклонения нулевой гипотезы, если альтернативная верна
            2)Вероятность принятия нулевой гипотезы, если альтернативная неверна || tts = "Следующий вопрос: Что такое статическая мощность?\nВероятность отклонения нулевой гипотезы, если альтернативная верна\nили\nВероятность принятия нулевой гипотезы, если альтернативная неверна", ttsEnabled = true
        go!: /newNode_7
    @IntentGroup
        {
          "boundsTo" : "/newNode_6",
          "actions" : [ {
            "buttons" : [ ],
            "type" : "buttons"
          } ],
          "global" : false
        }
    state: newNode_7
        state: 1
            intent: /newNode_7/1

            go!: /newNode_8

        state: 2
            intent: /newNode_7/2

            go!: /newNode_9
        init:
            $jsapi.bind({
                type: "postProcess",
                path: "/newNode_7",
                name: "newNode_7 buttons",
                handler: function($context) {
                }
            });

    state: newNode_10
        a:  Поздравляю!
            Вы ответили правильно, поэтому советую вам категорию "Web" || tts = "Поздравляю!\nВы ответили правильно, поэтому советую вам категорию \"Веб\"\nВы можете пройти тест заново или создать команду для участия в вездекоде.", ttsEnabled = true
        buttons:
            "Заново" -> /newNode_4
            "Создать команду" -> /newNode_12

    state: newNode_16
        a:  Поздравляю!
            Вы ответили правильно, поэтому советую вам категорию "VK Mini Apps" || tts = "Поздравляю!\nВы ответили правильно, поэтому советую вам категорию \"ВК Мини Апс\"\nВы можете пройти тест заново или создать команду для участия в вездекоде.", ttsEnabled = true
        buttons:
            "Заново" -> /newNode_4
            "Создать команду" -> /newNode_12

    state: newNode_8
        a:  Поздравляю!
            Вы ответили правильно, поэтому советую вам категорию "Анализ данных" || tts = "Поздравляю!\nВы ответили правильно, поэтому советую вам категорию \"Анализ данных\"\nВы можете пройти тест заново или создать команду для участия в вездекоде.", ttsEnabled = true
        buttons:
            "Заново" -> /newNode_4
            "Создать команду" -> /newNode_12

    state: newNode_9
        a:  Поняла.
            Следующий вопрос:
            Какой вариант объявления функции правильный: var func = function(); или function func() {}
            1)Оба варианта правильные
            2)function func() {} || tts = "Поняла.\nСледующий вопрос:\nКакой вариант объявления функции правильный:", ttsEnabled = true
        go!: /newNode_11
    @IntentGroup
        {
          "boundsTo" : "/newNode_9",
          "actions" : [ {
            "buttons" : [ ],
            "type" : "buttons"
          } ],
          "global" : false
        }
    state: newNode_11
        state: 1
            intent: /newNode_11/1

            go!: /newNode_10

        state: 2
            intent: /newNode_11/2

            go!: /newNode_13
        init:
            $jsapi.bind({
                type: "postProcess",
                path: "/newNode_11",
                name: "newNode_11 buttons",
                handler: function($context) {
                }
            });

    state: newNode_14
        a: Попробуйте пройти тест заново( || tts = "Попробуйте пройти тест заново", ttsEnabled = true
        buttons:
            "Заново" -> /newNode_4

    state: newNode_17
        a:  Какое утверждение о реализации интерфейсов верно?
            1)Реализация интерфейсов может быть частичной
            2)Реализация интерфейсов бывает явной и неявной || tts = "Какое утверждение о реализации интерфейсов верно?\nРеализация интерфейсов может быть частичной\nили\nРеализация интерфейсов бывает явной и неявной", ttsEnabled = true
        go!: /newNode_18
    @IntentGroup
        {
          "boundsTo" : "/newNode_17",
          "actions" : [ {
            "buttons" : [ ],
            "type" : "buttons"
          } ],
          "global" : false
        }
    state: newNode_18
        state: 1
            intent: /newNode_18/1

            go!: /newNode_14

        state: 2
            intent: /newNode_18/2

            go!: /newNode_19
        init:
            $jsapi.bind({
                type: "postProcess",
                path: "/newNode_18",
                name: "newNode_18 buttons",
                handler: function($context) {
                }
            });

    state: newNode_12
        a:  Поздравляю, вы молодцы!
            Теперь, когда вы выбрали категорию, нужно собрать команду. Для этого вам пригодиться наше мини-приложение: https://vk.com/app7543093
            А еще можешь посмеяться с мема)
            https://vk.com/vezdekod?z=photo-197700721_457241092%2Falbum-197700721_284717200 || tts = "Поздравляю, вы молодцы!\nТеперь, когда вы выбрали категорию, нужно собрать команду. Для этого вам пригодиться наше мини-приложение.\n\nА еще можешь посмеяться с мема.", ttsEnabled = true
        image: https://248305.selcdn.ru/zfl_prod/1000036419/262929801/3o8DLzgCSan3BDvR.jpg

    state: newNode_19
        a:  Поздравляю!
            Вы ответили правильно, поэтому советую вам категорию "GameDev" || tts = "Поздравляю!\nВы ответили правильно, поэтому советую вам категорию \"Геймдев\"\nВы можете пройти тест заново или создать команду для участия в вездекоде.", ttsEnabled = true
        buttons:
            "Заново" -> /newNode_4
            "Создать команду" -> /newNode_12
