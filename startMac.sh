F
LDER=$(pwd)

#discovery
osascript -e 'tell application "Terminal" to do script "cd \"'`pwd`'\"/discovery; mvn spring-boot:run
"'

#gateway
osascript -e 'tell application "Terminal" to do script "cd \"'`pwd`'\"/proxy; mvn spring-boot:run
"'

#search
osascript -e 'tell application "Terminal" to do script "cd \"'`pwd`'\"/search; mvn spring-boot:run
"'

#subscription
osascript -e 'tell application "Terminal" to do script "cd \"'`pwd`'\"/subscription; mvn spring-boot:run
"'
