# Проект по тестированию сайта Rollerads

## 	Содержание

> ➠ [Покрытый функционал](#покрытый-функционал)
>
> ➠ [Технологический стек](#технологический-стек)
>
> ➠ [Запуск тестов из терминала](#запуск-тестов-из-терминала)
>
> ➠ [Запуск тестов в Jenkins](#-удаленный-запуск-тестов-в-Jenkins)
>
> ➠ [Отчет о результатах тестирования в Allure Report](#-главная-страница-allure-отчета)
>
> ➠ [Интеграция с Allure TestOps](#-интеграция-с-allure-testops)
> 
> ➠ [Уведомления в Telegram с использованием бота](#-уведомления-в-telegram-с-использованием-бота)
>
> ➠ [Пример запуска теста в Selenoid](#-пример-запуска-теста-в-selenoid)

##  Покрытый функционал
> Разработаны автотесты на <code>UI</code>.
### UI

- [x] Проверка нескольких элементов карусели на главной странице
- [x] Проверка элементов Benefits на главной странице
- [x] Переход в дополнительные разделы "Careers","Contact" и проверка элементов страниц
- [x] Проверка поиска поста в разделе "Blog".
- [x] Проверка заполнения и отправки формы подписки в разделе "Blog".
- [x] Проверка списка возможных платежных систем.
## Технологический стек

<p align="center">
<img width="6%" title="IntelliJ IDEA" src="readme_attach/design/Intelij_IDEA.svg">
<img width="6%" title="Java" src="readme_attach/design/Java.svg">
<img width="6%" title="Selenide" src="readme_attach/design/Selenide.svg">
<img width="6%" title="Selenoid" src="readme_attach/design/Selenoid.svg">
<img width="6%" title="Allure Report" src="readme_attach/design/Allure_Report.svg">
<img width="6%" title="Allure Report" src="readme_attach/design/Allure_TO.svg">
<img width="6%" title="Gradle" src="readme_attach/design/Gradle.svg">
<img width="6%" title="JUnit5" src="readme_attach/design/JUnit5.svg">
<img width="6%" title="GitHub" src="readme_attach/design/GitHub.svg">
<img width="6%" title="Jenkins" src="readme_attach/design/Jenkins.svg">
<img width="6%" title="Telegram" src="readme_attach/design/Telegram.svg">
</p>

### Проект написан на <code>Java</code> с использованием <code>Selenide</code> для UI-тестов.
>
> <code>Selenoid</code> выполняет запуск браузеров в контейнерах <code>Docker</code>.
>
> <code>Allure Report</code> формирует отчет о запуске тестов.
>
> Для автоматизированной сборки проекта используется <code>Gradle</code>.
>
> В качестве библиотеки для модульного тестирования используется <code>JUnit 5</code>.
>
> <code>Jenkins</code> выполняет запуск тестов.
>
> После завершения прогона отправляются уведомления с помощью бота в <code>Telegram</code>.
## Запуск тестов из терминала

### Локальный запуск тестов

#### Локальный запуск тестов

```
gradle clean test 
```
#### Удаленный запуск:
```
gradle clean test
-Dbrowser=${BROWSER}
-Dbrowser_ver=${BROWSER_VERSION}
-DbrowserSize=${BROWSER_SIZE}
-DremoteUrl=${REMOTE_SELENOID_URL}
```
#### Параметры сборки:
<code>BROWSER</code> – браузера, на котором будут выполняться тесты. </br>
<code>BROWSER_VERSION</code> – версия браузера, на которой будут выполняться тесты. </br>
<code>BROWSER_SIZE</code> – разрешение окна браузера, на котором будут выполняться тесты. </br>
<code>REMOTE_SELENOID_URL</code> – адрес удаленного сервера, на котором будут запускаться тесты.. </br>
## <img width="4%" title="Jenkins" src="readme_attach/Jenkins.svg"> Удаленный запуск тестов в Jenkins

> Для запуска тестов используется параметризированная сборка
<p align="center">
<img title="Jenkins" src="readme_attach/settings.png">
</p>

## <img width="4%" title="Allure_Report" src="readme_attach/Allure_Report.svg"> Главная страница Allure отчета

<p align="center">
<img title="Allure_main" src="readme_attach/allure.png">
</p>

### <img width="4%" title="Allure_Report" src="readme_attach/Allure_Report.svg"> Список тестов в отчете Allure

<p align="center">
<img title="Allure_suits" src="readme_attach/allure_suits.png">
</p>

### <img width="4%" title="Allure_Report" src="readme_attach/Allure_Report.svg"> Основная страница с графиками

<p align="center">
<img title="Allure_dashboard" src="readme_attach/Graphs.png">
</p>

## <img width="4%" title="Allure TestOPS" src="readme_attach/Allure_TO.svg"> Интеграция с Allure TestOps

### Основная страница с графиками

<p align="center">
  <img src="readme_attach/allure-testops-dashboards.png" alt="dashboard" width="900">
</p>

### Список тестов с результатами

<p align="center">
  <img src="readme_attach/allure-testops-results.png" alt="dashboard" width="900">
</p>

### Тест-кейсы

<p align="center">
  <img src="readme_attach/allure-testops-testcases.png" alt="testcase" width="900">
</p>

## <img width="4%" title="Telegram" src="readme_attach/Telegram.svg"> Уведомления в Telegram с использованием бота

> После завершения сборки специальный бот, созданный в <code>Telegram</code>, автоматически обрабатывает и отправляет сообщение с отчетом о прогоне.
>
> Информация по настройке и использованию бота <code>https://github.com/qa-guru/allure-notifications</code>

<p align="center">
<img title="Telegram_notifications" src="readme_attach/telegram_allure.png">
</p>

## <img width="4%" title="Selenoid" src="readme_attach/Selenoid.svg"> Пример запуска теста в Selenoid

> К каждому тесту в отчете прилагается видео. Одно из таких видео представлено ниже.

<p align="center">
<img title="Selenoid" src="readme_attach/selenoid.gif">
</p>