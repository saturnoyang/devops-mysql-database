pipeline {
  agent any
  stages {
    stage('download source') {
      steps {
        script {
          def code
          echo './gradlew test'
          code = load 'commandTest.groovy'
          code.commandTest()
         }
      }
    }
    stage('Test') {
      steps {
        echo './gradlew test'
      }
    }
  }
}
