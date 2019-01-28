t = main

c:
	kotlinc ${t}.kt -include-runtime -d ./bin/${t}.jar

run: c
	java -jar ./bin/${t}.jar

