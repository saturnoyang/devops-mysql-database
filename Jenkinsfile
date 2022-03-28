def code

pipeline {
  agent any
  stages {
    stage('download source') {
      steps {
        echo './gradlew test'
        code = load 'commandTest.groovy'
        code.commandTest()
      }
    }
    stage('Test') {
      steps {
        echo './gradlew test'
      }
    }
  }
}
