# Project of UI automation testing <a target="_blank" href="https://voiso.com/">voiso.com</a>
![](images/voiso.png)
### :pencil: Content:
- :pushpin: [Test coverage](#bar_chart-Test coverage) 
- :pushpin: [Technology stack](#woman_technologist-Technology stack)
- :pushpin: [Running tests from terminal](#black_large_square-Running tests from terminal)
- :pushpin: [Allure report](#-Allure-report)
- :pushpin: [Telegram report](#-Telegram-report)

### :bar_chart:	Test coverage:
> - [x] *Check if button 'request a demo' exists*
> - [x] *Check if video exists on the main banner*
> - [x] *Check title of the main page*
> - [x] *Check if blog page exists*
> - [x] *Page console log should not have errors*
### :woman_technologist: Technology stack:
<p  align="center">
<code><img width="5%" title="Java" src="images/Java.svg"></code>
<code><img width="5%" title="Selenide" src="images/Selenide.svg"></code>
<code><img width="5%" title="Selenoid" src="images/Selenoid.svg"></code>
<code><img width="5%" title="Gradle" src="images/Gradle.svg"></code>
<code><img width="5%" title="JUnit5" src="images/Junit5.svg"></code>
<code><img width="5%" title="Allure Report" src="images/Allure_Report.svg"></code>
<code><img width="5%" title="Github" src="images/GitHub.svg"></code>
<code><img width="5%" title="Jenkins" src="images/Jenkins.svg"></code>
<code><img width="5%" title="Telegram" src="images/Telegram.svg"></code>
</p>
 In this project, autotests are written in <code>Java</code> and use <code>Selenide</code> for UI-tests.
>
> <code>Selenoid</code> launches browsers in containers <code>Docker</code>.
>
> <code>Allure Report</code> generates a test run report.
>
> For automated building of the project, <code>Gradle</code> was used.
>
> Library for unit testing uses <code>JUnit 5</code>.
>
> <code>Jenkins</code> for runs tests
>
> Test run results are sent to <code>Telegram</code>.

### :black_large_square: Running tests from terminal:
:black_circle:	Local running tests
```
gradle clean test
```
:black_circle:	Remote running tests
```
clean
test
-DremoteUrl=${REMOTEURL}
-Duser=${USER}
-Dpassword=${PASSWORD}
-Dbrowser=${BROWSER}
-DbrowserVersion=${VERSION}
-DbrowserSize=${RESOLUTION}
```
:black_medium_small_square:	Build options
> <code>REMOTE_URL</code> – address of the remote server the tests will run.
>
> <code>BROWSER</code> – browser will be used to run the tests  (_default - <code>chrome</code>_).
>
> <code>BROWSER_VERSION</code> – version of the browser will be used to run the tests (_default - <code>91.0</code>_).
>
> <code>BROWSER_SIZE</code> – size of the browser window will be used to run the tests (_default - <code>1920x1080</code>_).

### <img src="images/Allure_Report.svg" width="25" height="25" /></a> <a target="_blank" href="https://jenkins.autotests.cloud/job/0yanna_hw13/allure/">Allure report</a>

Main window and build history
![](images/allure report.png)

 Test suite
![](images/allure_suites.png)

Graphs
![](images/Graphs.png)

### <img src="images/Telegram.svg" width="25" height="25" /></a> Telegram report
