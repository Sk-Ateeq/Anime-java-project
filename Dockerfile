#Step1: #pull a base image which gives all requried tools and libaries.
FROM openjdk:17-jdk-alpine

#Step2: #create a floder where the app code will be stored.
WORKDIR /app

#Step3: #copy the source code from your HOST mechine to your container.
COPY src/ src/

#Step4: #Compile the application code.
RUN mkdir -p bin && javac -d bin src/AnimeChoice.java

#Step5: #run the application.
CMD ["java", "-cp", "bin", "AnimeChoice"]
