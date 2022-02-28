# Project of UI automation testing <a target="_blank" href="https://voiso.com/">voiso.com</a>
![](images/voiso.png)
### :pencil: Content:
> :pushpin: Test coverage
> :pushpin: Technology stack
> :pushpin:
> :pushpin:
> :pushpin:
> :pushpin:
### :bar_chart:	Test coverage:
> - [x] *Check if button 'request a demo' exists*
> - [x] *Check if video exists on the main banner*
> - [x] *Check title of the main page*
> - [x] *Check if blog page exists*
> - [x] *Page console log should not have errors*
### :woman_technologist: Technology stack:
<p  align="center">
<code><img width="5%" title="Java" src="images/java-logo.svg"></code>
<code><img width="5%" title="Selenide" src="images/selenide-logo.svg"></code>
<code><img width="5%" title="Selenoid" src="images/selenoid-logo.svg"></code>
<code><img width="5%" title="Gradle" src="images/gradle-logo.svg "></code>
<code><img width="5%" title="JUnit5" src="images/junit5-logo.svg"></code>
<code><img width="5%" title="Allure Report" src="images/allure-Report-logo.svg"></code>
<code><img width="5%" title="Github" src="images/git-logo.svg"></code>
<code><img width="5%" title="Jenkins" src="images/jenkins-logo.svg"></code>
<code><img width="5%" title="Telegram" src="images/Telegram.svg"></code>
</p>
 In this project, autotests are written in <code>Java</code> and using <code>Selenide</code> for UI-tests.
>
> <code>Selenoid</code> launches browsers in containers <code>Docker</code>.
>
> <code>Allure Report</code> generating a test run report.
>
> For automated build of the project is performed using <code>Gradle</code>.
>
> Library for unit testing is used <code>JUnit 5</code>.
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
> <code>REMOTE_URL</code> – address of the remote server where the tests will run.
>
> <code>BROWSER</code> – browser in which the tests will be run (_default - <code>chrome</code>_).
>
> <code>BROWSER_VERSION</code> – version of the browser in which the tests will be run (_default - <code>91.0</code>_).
>
> <code>BROWSER_SIZE</code> – size of the browser window in which the tests will run (_default - <code>1920x1080</code>_).

