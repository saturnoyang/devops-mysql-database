pipeline {
  agent any
  stages {
    stage('download source') {
      steps {
        echo './gradlew test'
        commandTest()
      }
    }
    stage('Test') {
      steps {
        echo './gradlew test'
      }
    }
  }
}