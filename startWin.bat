@echo off

SET location=%cd%

REM Discovery
cd %location%/discovery & start mvn spring-boot:run

REM Gateway
cd %location%/proxy & start mvn spring-boot:run

REM Search
cd %location%/search & start mvn spring-boot:run

REM Subscription
cd %location%/subscription & start mvn spring-boot:run