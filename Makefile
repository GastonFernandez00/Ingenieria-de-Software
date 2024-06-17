all:
	mvn clean package
	mvn jacoco:report
	@powershell start target/site/jacoco/index.html

clean:
	mvn clean